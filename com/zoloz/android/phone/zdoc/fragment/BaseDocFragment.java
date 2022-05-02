package com.zoloz.android.phone.zdoc.fragment;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadCallBack;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.BioUploadService;
import com.alipay.mobile.security.faceauth.circle.protocol.DeviceSetting;
import com.alipay.zoloz.hardware.camera.CameraData;
import com.alipay.zoloz.hardware.camera.ICameraCallback;
import com.alipay.zoloz.hardware.camera.ICameraInterface;
import com.alipay.zoloz.hardware.camera.widget.CameraSurfaceView;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.BitmapHelper;
import com.zoloz.android.phone.zdoc.R;
import com.zoloz.android.phone.zdoc.R2;
import com.zoloz.android.phone.zdoc.cardmanager.FalconTaskManager;
import com.zoloz.android.phone.zdoc.cardmanager.ZdocResponse;
import com.zoloz.android.phone.zdoc.module.CollModule;
import com.zoloz.android.phone.zdoc.module.ZdocRemoteConfig;
import com.zoloz.android.phone.zdoc.render.MaskViewRender;
import com.zoloz.android.phone.zdoc.render.MessageViewRender;
import com.zoloz.android.phone.zdoc.render.TitleBarRender;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;
import com.zoloz.android.phone.zdoc.ui.IMessageView;
import com.zoloz.android.phone.zdoc.ui.UIFacade;
import com.zoloz.android.phone.zdoc.ui.UIState;
import com.zoloz.android.phone.zdoc.upload.UploadManager;
import com.zoloz.android.phone.zdoc.utils.ZdocRecordManager;
import zoloz.ap.com.toolkit.R2;
import zoloz.ap.com.toolkit.ui.DialogHelper;
import zoloz.ap.com.toolkit.ui.TitleBar;

public class BaseDocFragment extends BaseCameraPermissionFragment implements ICameraCallback {
    private static final String TAG = "ZdocCaptureActivity";
    protected BioAppDescription mBioAppDescription;
    protected BioUploadService mBioUploadService;
    protected String mBisToken;
    protected ICameraInterface mCameraInterface;
    protected CameraSurfaceView mCameraSurfaceView;
    protected byte[] mContent;
    protected int mCurrentPageNumber;
    protected int mCurrentPageNumberIndex;
    protected int mCurrentRetryTimes;
    protected UIState mCurrentState = UIState.CAPTURE;
    protected BaseMaskView mDefaultMaskView;
    protected DialogHelper mDialogHelper;
    protected String mDocType;
    protected boolean mIsUTF8;
    protected byte[] mKey;
    private Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
    protected int mMaxRetryTimes;
    protected IMessageView mMessageView;
    protected ImageView mPhotoImageView;
    protected ZdocRecordManager mRecordManager;
    protected boolean mShowFrame = false;
    protected TitleBar mTitleBar;
    protected int mUiType;
    protected UploadManager mUploadManager;
    protected ZdocRemoteConfig mZdocRemoteConfig;
    protected boolean needRecordImageSize = true;

    public void onSuccess() {
    }

    public void onSurfaceDestroyed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (BioServiceManager.getCurrentInstance() == null) {
            new IllegalStateException("null == BioServiceManager.getCurrentInstance()");
            getActivity().finish();
            return;
        }
        initData();
        initUpload();
        this.mCurrentPageNumberIndex = 0;
        this.mRecordManager = new ZdocRecordManager();
        formatConfigs();
    }

    private void initData() {
        this.mBioAppDescription = (BioAppDescription) getArguments().getSerializable("bio");
        ZdocRemoteConfig zdocRemoteConfig = (ZdocRemoteConfig) getArguments().getSerializable("config");
        this.mZdocRemoteConfig = zdocRemoteConfig;
        BioAppDescription bioAppDescription = this.mBioAppDescription;
        if (bioAppDescription != null && zdocRemoteConfig != null) {
            this.mBisToken = bioAppDescription.getBistoken();
        }
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return UIFacade.getLayoutId(getActivity(), this.mUiType, this.mDocType, this.mCurrentPageNumber);
    }

    /* access modifiers changed from: protected */
    public void alertSystemError() {
        DialogHelper dialogHelper = this.mDialogHelper;
        if (dialogHelper != null && !dialogHelper.isShowing()) {
            this.mRecordManager.recordAlertAppear(ZdocRecordService.SYSTEM_EXCEPTION_ERROR);
            this.mDialogHelper.alert(R2.string.system_error_title(), R2.string.system_error_msg(), R2.string.system_error_got_it(), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    BaseDocFragment.this.mRecordManager.recordAlertChoose(ZdocRecordService.SYSTEM_EXCEPTION_ERROR, Integer.toString(1));
                    dialogInterface.dismiss();
                    BaseDocFragment.this.responseWithCode(205, (BioUploadResult) null);
                }
            }, (String) null, (DialogInterface.OnClickListener) null);
        }
    }

    /* access modifiers changed from: protected */
    public void alertSystemError(String str) {
        this.mRecordManager.recordSystemError(str);
        alertSystemError();
    }

    /* access modifiers changed from: protected */
    public Rect mappingToPic(Rect rect) {
        int previewHeight = CameraSurfaceView.getCameraImpl(getActivity()).getPreviewHeight();
        int previewWidth = CameraSurfaceView.getCameraImpl(getActivity()).getPreviewWidth();
        if (previewHeight >= previewWidth) {
            int i = previewWidth;
            previewWidth = previewHeight;
            previewHeight = i;
        }
        int height = this.mCameraSurfaceView.getHeight();
        int width = this.mCameraSurfaceView.getWidth();
        int width2 = (width - this.mDefaultMaskView.getWidth()) / 2;
        int height2 = (height - this.mDefaultMaskView.getHeight()) / 2;
        Rect rect2 = new Rect(rect.left + width2, rect.top + height2, rect.right + width2, rect.bottom + height2);
        float f = ((float) previewHeight) / ((float) width);
        int i2 = rect2.left;
        int i3 = rect2.right;
        int i4 = rect2.top;
        int i5 = rect2.bottom;
        rect2.left = (int) (((float) rect2.left) * f);
        float f2 = (((float) previewWidth) - (((float) height) * f)) / 2.0f;
        rect2.top = (int) ((((float) rect2.top) * f) + f2);
        rect2.right = (int) (((float) rect2.right) * f);
        rect2.bottom = (int) ((f * ((float) rect2.bottom)) + f2);
        int i6 = rect2.left;
        int i7 = rect2.right;
        int i8 = rect2.top;
        int i9 = rect2.bottom;
        return rect2;
    }

    /* access modifiers changed from: protected */
    public void formatConfigs() {
        ZdocRemoteConfig zdocRemoteConfig = this.mZdocRemoteConfig;
        if (zdocRemoteConfig != null) {
            CollModule coll = zdocRemoteConfig.getModules().get(this.mCurrentPageNumberIndex).getColl();
            this.mUiType = coll.getUiType();
            this.mDocType = coll.getDocType();
            this.mCurrentPageNumber = coll.getPageNo();
            this.mCurrentRetryTimes = 0;
            this.mMaxRetryTimes = coll.getRetryLimit();
            this.mRecordManager.updatePageNumber(this.mCurrentPageNumber);
        }
    }

    public boolean onBackPressed() {
        interrupt();
        return true;
    }

    public void onDestroy() {
        this.mCurrentPageNumberIndex = 0;
        this.mCurrentPageNumber = 0;
        this.mCurrentRetryTimes = 0;
        this.mContent = null;
        this.mKey = null;
        IMessageView iMessageView = this.mMessageView;
        if (iMessageView != null) {
            iMessageView.clearClickListener();
        }
        TitleBar titleBar = this.mTitleBar;
        if (titleBar != null) {
            titleBar.setClickListener((View.OnClickListener) null);
        }
        DialogHelper dialogHelper = this.mDialogHelper;
        if (dialogHelper != null) {
            dialogHelper.forceDismissDialog();
            this.mDialogHelper.release();
            this.mDialogHelper = null;
        }
        ICameraInterface iCameraInterface = this.mCameraInterface;
        if (iCameraInterface != null) {
            iCameraInterface.releaseCamera();
        }
        if (this.mUploadManager != null) {
            this.mUploadManager = null;
        }
        this.mBioUploadService = null;
        ZdocRecordManager zdocRecordManager = this.mRecordManager;
        if (zdocRecordManager != null) {
            zdocRecordManager.destory();
        }
        super.onDestroy();
    }

    public void onWindowFocusChanged(boolean z) {
        if (z && getActivity() != null && !getActivity().isFinishing()) {
            this.mMessageView.setUiLocation(this.mUiType, this.mDocType, this.mCurrentPageNumber, this.mCameraSurfaceView.getHeight(), this.mDefaultMaskView.getTipsBottomMargin(), this.mDefaultMaskView.getInvisibleHeight());
        }
    }

    public void onSurfaceCreated() {
        this.mRecordManager.recordAuthCheck(1);
    }

    public void onSurfaceChanged(double d, double d2) {
        final double d3 = d;
        final double d4 = d2;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                BaseDocFragment.this.adjustPreview(d3, d4);
            }
        });
    }

    public void onError(int i) {
        if (i == -1) {
            this.mCameraSurfaceView.setVisibility(4);
            checkCameraPermission();
        } else if (i != 0) {
            this.mCameraSurfaceView.setVisibility(4);
            alertSystemError();
        }
    }

    public void onPreviewFrame(CameraData cameraData) {
        if (this.mShowFrame) {
            showPreviewImg(createTGFrame(cameraData));
            this.mShowFrame = false;
        }
        if (this.needRecordImageSize) {
            this.mRecordManager.recordImageSize(cameraData.getPreviewWidth(), cameraData.getPreviewHeight());
            this.needRecordImageSize = false;
        }
    }

    /* access modifiers changed from: protected */
    public void adjustPreview(double d, double d2) {
        CameraSurfaceView cameraSurfaceView = this.mCameraSurfaceView;
        if (cameraSurfaceView != null) {
            ViewGroup.LayoutParams layoutParams = cameraSurfaceView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.mPhotoImageView.getLayoutParams();
            int width = this.mCameraSurfaceView.getWidth();
            int height = this.mCameraSurfaceView.getHeight();
            double d3 = (double) width;
            Double.isNaN(d3);
            int i = (int) ((d3 / d) * d2);
            if (i >= height) {
                layoutParams.height = i;
                layoutParams2.height = i;
            } else {
                double d4 = (double) height;
                Double.isNaN(d4);
                int i2 = (int) ((d4 / d2) * d);
                if (i2 >= width) {
                    layoutParams.width = i2;
                    layoutParams2.width = i2;
                }
            }
            this.mCameraSurfaceView.setLayoutParams(layoutParams);
            this.mPhotoImageView.setLayoutParams(layoutParams2);
        }
    }

    /* access modifiers changed from: protected */
    public void alertCameraNoPermissionDialog(final PermissionDialogEvent permissionDialogEvent) {
        ZdocRecordManager zdocRecordManager = this.mRecordManager;
        if (zdocRecordManager != null) {
            zdocRecordManager.recordAuthCheck(0);
        }
        DialogHelper dialogHelper = this.mDialogHelper;
        if (dialogHelper != null) {
            dialogHelper.alert(R2.string.zdoc_camera_permission_title(), R2.string.zdoc_camera_permission_msg(), R2.string.zdoc_camera_permission_settings(), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    permissionDialogEvent.execute();
                }
            }, R2.string.zdoc_camera_permission_not_allow(), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    BaseDocFragment.this.mRecordManager.recordAlertChoose(ZdocRecordService.CAMERA_ERROR, Integer.toString(1));
                    BaseDocFragment.this.responseWithCode(100, (BioUploadResult) null);
                }
            });
        }
    }

    private void initUpload() {
        if (this.mBioAppDescription != null && this.mZdocRemoteConfig != null) {
            UploadManager uploadManager = new UploadManager(getActivity(), this.mBioAppDescription, this.mZdocRemoteConfig);
            this.mUploadManager = uploadManager;
            uploadManager.init();
            if (BioServiceManager.getCurrentInstance() == null) {
                new IllegalStateException("null == BioServiceManager.getCurrentInstance()");
                getActivity().finish();
                return;
            }
            BioUploadService bioUploadService = (BioUploadService) BioServiceManager.getCurrentInstance().getBioService(BioUploadService.class);
            this.mBioUploadService = bioUploadService;
            bioUploadService.clearUp();
            this.mBioUploadService.addCallBack(new BioUploadCallBack() {
                public boolean onResponse(final BioUploadResult bioUploadResult) {
                    BaseDocFragment.this.mRecordManager.recordBasicCheck();
                    int i = bioUploadResult.productRetCode;
                    if (i == 1001) {
                        BaseDocFragment.this.mRecordManager.recordUploadEnd(1, 1, 1001);
                        BaseDocFragment.this.updateUI(UIState.UPLOAD_END_SUCCESS);
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                if (BaseDocFragment.this.mDialogHelper != null) {
                                    BaseDocFragment.this.mDialogHelper.dismissDialog();
                                }
                                BaseDocFragment.this.responseWithCode(500, bioUploadResult);
                            }
                        }, 800);
                    } else if (i == 1002) {
                        BaseDocFragment.this.handleSuccContinue();
                    } else if (i == 2001) {
                        BaseDocFragment.this.mRecordManager.recordUploadEnd(1, 0, bioUploadResult.productRetCode);
                        BaseDocFragment.this.updateUI(UIState.UPLOAD_END_FAIL);
                        BaseDocFragment.this.failQuit(bioUploadResult);
                    } else if (i == 2002) {
                        BaseDocFragment.this.handleFailRetry(bioUploadResult);
                    } else if (i == 3001 || i == 3002) {
                        BaseDocFragment.this.handleNetWorkError();
                    } else {
                        BaseDocFragment.this.mRecordManager.recordUploadEnd(1, 0, bioUploadResult.productRetCode);
                        BaseDocFragment.this.updateUI(UIState.UPLOAD_END_FAIL);
                        BaseDocFragment.this.updateUI(UIState.ALERT);
                        BaseDocFragment.this.alertSystemError();
                    }
                    return false;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        switch(r2) {
            case 0: goto L_0x00e3;
            case 1: goto L_0x00da;
            case 2: goto L_0x00d1;
            case 3: goto L_0x00c8;
            case 4: goto L_0x00bf;
            case 5: goto L_0x00b6;
            case 6: goto L_0x00ad;
            default: goto L_0x00ac;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ad, code lost:
        r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_expired_document_title();
        r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_expired_document_msg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
        r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_wrong_document_title();
        r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_wrong_document_msg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bf, code lost:
        r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_noface_title();
        r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_noface_msg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
        r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_exposure_title();
        r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_exposure_msg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d1, code lost:
        r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_blur_title();
        r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_blur_msg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00da, code lost:
        r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_imperfect_title();
        r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_imperfect_msg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_no_document_title();
        r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_no_document_msg();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleFailRetry(final com.alipay.mobile.security.bio.service.BioUploadResult r13) {
        /*
            r12 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.String> r1 = r13.extParams
            r0.<init>(r1)
            com.zoloz.android.phone.zdoc.utils.ZdocRecordManager r1 = r12.mRecordManager
            r2 = 0
            r3 = 1
            r4 = 2002(0x7d2, float:2.805E-42)
            r1.recordUploadEnd(r3, r2, r4)
            com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.UPLOAD_END_FAIL
            r12.updateUI(r1)
            com.zoloz.android.phone.zdoc.utils.ZdocRecordManager r1 = r12.mRecordManager
            r1.retry()
            com.zoloz.android.phone.zdoc.utils.ZdocRecordManager r1 = r12.mRecordManager
            java.lang.String r4 = "serverQuality_error"
            r1.recordAlertAppear(r4)
            zoloz.ap.com.toolkit.ui.DialogHelper r1 = r12.mDialogHelper
            if (r1 == 0) goto L_0x0109
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L_0x002d
            goto L_0x0109
        L_0x002d:
            com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.ALERT
            r12.updateUI(r1)
            int r1 = r12.mCurrentRetryTimes
            int r4 = r12.mMaxRetryTimes
            if (r1 >= r4) goto L_0x0105
            java.lang.String r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_unknow_title()
            java.lang.String r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_unknow_msg()
            java.lang.String r5 = "clientExtInfo"
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00eb }
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r0)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r5 = "detectCode"
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00eb }
            boolean r5 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r0)     // Catch:{ Exception -> 0x00eb }
            if (r5 != 0) goto L_0x00eb
            r5 = -1
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x00eb }
            switch(r6) {
                case -2003602871: goto L_0x009e;
                case -1437569509: goto L_0x0094;
                case -1143378681: goto L_0x008a;
                case 2041959: goto L_0x0080;
                case 228486029: goto L_0x0076;
                case 666915289: goto L_0x006d;
                case 735991061: goto L_0x0063;
                default: goto L_0x0062;
            }     // Catch:{ Exception -> 0x00eb }
        L_0x0062:
            goto L_0x00a8
        L_0x0063:
            java.lang.String r2 = "EXPIRED_DOCUMENT"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x00eb }
            if (r0 == 0) goto L_0x00a8
            r2 = 6
            goto L_0x00a9
        L_0x006d:
            java.lang.String r3 = "NO_DOCUMENT"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x00eb }
            if (r0 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x0076:
            java.lang.String r2 = "WRONG_DOCUMENT"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x00eb }
            if (r0 == 0) goto L_0x00a8
            r2 = 5
            goto L_0x00a9
        L_0x0080:
            java.lang.String r2 = "BLUR"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x00eb }
            if (r0 == 0) goto L_0x00a8
            r2 = 2
            goto L_0x00a9
        L_0x008a:
            java.lang.String r2 = "EXPOSURE"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x00eb }
            if (r0 == 0) goto L_0x00a8
            r2 = 3
            goto L_0x00a9
        L_0x0094:
            java.lang.String r2 = "NO_FACE"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x00eb }
            if (r0 == 0) goto L_0x00a8
            r2 = 4
            goto L_0x00a9
        L_0x009e:
            java.lang.String r2 = "IMPERFECT"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x00eb }
            if (r0 == 0) goto L_0x00a8
            r2 = 1
            goto L_0x00a9
        L_0x00a8:
            r2 = -1
        L_0x00a9:
            switch(r2) {
                case 0: goto L_0x00e3;
                case 1: goto L_0x00da;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00c8;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00b6;
                case 6: goto L_0x00ad;
                default: goto L_0x00ac;
            }     // Catch:{ Exception -> 0x00eb }
        L_0x00ac:
            goto L_0x00eb
        L_0x00ad:
            java.lang.String r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_expired_document_title()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_expired_document_msg()     // Catch:{ Exception -> 0x00eb }
            goto L_0x00eb
        L_0x00b6:
            java.lang.String r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_wrong_document_title()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_wrong_document_msg()     // Catch:{ Exception -> 0x00eb }
            goto L_0x00eb
        L_0x00bf:
            java.lang.String r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_noface_title()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_noface_msg()     // Catch:{ Exception -> 0x00eb }
            goto L_0x00eb
        L_0x00c8:
            java.lang.String r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_exposure_title()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_exposure_msg()     // Catch:{ Exception -> 0x00eb }
            goto L_0x00eb
        L_0x00d1:
            java.lang.String r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_blur_title()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_blur_msg()     // Catch:{ Exception -> 0x00eb }
            goto L_0x00eb
        L_0x00da:
            java.lang.String r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_imperfect_title()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_imperfect_msg()     // Catch:{ Exception -> 0x00eb }
            goto L_0x00eb
        L_0x00e3:
            java.lang.String r1 = com.zoloz.android.phone.zdoc.R2.string.zdoc_no_document_title()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r4 = com.zoloz.android.phone.zdoc.R2.string.zdoc_no_document_msg()     // Catch:{ Exception -> 0x00eb }
        L_0x00eb:
            r6 = r1
            r7 = r4
            zoloz.ap.com.toolkit.ui.DialogHelper r5 = r12.mDialogHelper
            java.lang.String r8 = com.zoloz.android.phone.zdoc.R2.string.zdoc_dialog_retry()
            com.zoloz.android.phone.zdoc.fragment.BaseDocFragment$6 r9 = new com.zoloz.android.phone.zdoc.fragment.BaseDocFragment$6
            r9.<init>()
            java.lang.String r10 = com.zoloz.android.phone.zdoc.R2.string.zdoc_dialog_close()
            com.zoloz.android.phone.zdoc.fragment.BaseDocFragment$7 r11 = new com.zoloz.android.phone.zdoc.fragment.BaseDocFragment$7
            r11.<init>(r13)
            r5.alert(r6, r7, r8, r9, r10, r11)
            return
        L_0x0105:
            r13 = 0
            r12.failQuit(r13)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.handleFailRetry(com.alipay.mobile.security.bio.service.BioUploadResult):void");
    }

    /* access modifiers changed from: protected */
    public void retry() {
        updateUI(UIState.CAPTURE);
    }

    /* access modifiers changed from: protected */
    public void handleSuccContinue() {
        DialogHelper dialogHelper = this.mDialogHelper;
        if (dialogHelper != null) {
            dialogHelper.dismissDialog();
        }
        this.mCurrentRetryTimes = 0;
        this.mRecordManager.recordUploadEnd(1, 1, 1002);
        updateUI(UIState.UPLOAD_END_SUCCESS);
        int i = this.mCurrentPageNumberIndex + 1;
        this.mCurrentPageNumberIndex = i;
        if (i < this.mZdocRemoteConfig.getModules().size()) {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    BaseDocFragment.this.updateUI(UIState.CAPTURE);
                    BaseDocFragment.this.formatConfigs();
                }
            }, 1000);
        } else {
            this.mCurrentPageNumberIndex--;
        }
    }

    /* access modifiers changed from: private */
    public void handleNetWorkError() {
        this.mRecordManager.recordUploadEnd(0, 0, 999);
        updateUI(UIState.UPLOAD_END_FAIL);
        this.mRecordManager.recordAlertAppear(ZdocRecordService.NETWORK_ERROR);
        DialogHelper dialogHelper = this.mDialogHelper;
        if (dialogHelper != null && !dialogHelper.isShowing()) {
            updateUI(UIState.ALERT);
            this.mDialogHelper.alert(R2.string.network_error_title(), R2.string.network_error_msg(), R2.string.network_error_retry(), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    BaseDocFragment.this.mRecordManager.recordAlertChoose(ZdocRecordService.NETWORK_ERROR, Integer.toString(1));
                    BaseDocFragment.this.updateUI(UIState.UPLOADING);
                    BaseDocFragment.this.upLoadImage();
                }
            }, R2.string.network_error_exit(), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    BaseDocFragment.this.mRecordManager.recordAlertChoose(ZdocRecordService.NETWORK_ERROR, Integer.toString(0));
                    BaseDocFragment.this.responseWithCode(207, (BioUploadResult) null);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void upLoadImage() {
        byte[] bArr = this.mContent;
        if (bArr != null) {
            this.mRecordManager.recordUploadStart((long) bArr.length);
            UploadManager uploadManager = this.mUploadManager;
            if (uploadManager != null) {
                uploadManager.setRetryTimes(this.mCurrentRetryTimes);
                this.mUploadManager.upload(this.mContent, this.mKey, this.mIsUTF8);
                return;
            }
            return;
        }
        alertSystemError();
    }

    public void responseWithCode(int i, BioUploadResult bioUploadResult) {
        ZdocResponse zdocResponse = new ZdocResponse();
        zdocResponse.retCode = i;
        zdocResponse.bioUploadResult = bioUploadResult;
        FalconTaskManager.getInstance().transResult(zdocResponse);
    }

    public void failQuit(final BioUploadResult bioUploadResult) {
        this.mRecordManager.recordAlertAppear(ZdocRecordService.OVER_THRESHOLD_ERROR);
        this.mRecordManager.recordOverThreshold();
        DialogHelper dialogHelper = this.mDialogHelper;
        if (dialogHelper != null) {
            dialogHelper.alert(R2.string.zdoc_retry_max_title(), R2.string.zdoc_retry_max_msg(), R2.string.zdoc_retry_max_got_it(), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    BaseDocFragment.this.mRecordManager.recordAlertChoose(ZdocRecordService.OVER_THRESHOLD_ERROR, Integer.toString(1));
                    BaseDocFragment.this.responseWithCode(209, bioUploadResult);
                }
            }, (String) null, (DialogInterface.OnClickListener) null);
        }
    }

    /* access modifiers changed from: private */
    public void interrupt() {
        boolean z;
        try {
            z = getResources().getBoolean(R.bool.show_exit_dialog);
        } catch (Exception unused) {
            z = true;
        }
        if (!z) {
            responseWithCode(301, (BioUploadResult) null);
            return;
        }
        DialogHelper dialogHelper = this.mDialogHelper;
        if (dialogHelper != null && !dialogHelper.isShowing()) {
            this.mRecordManager.recordAlertAppear(ZdocRecordService.ACTIVE_EXIT);
            final UIState uIState = this.mCurrentState;
            updateUI(UIState.ALERT);
            this.mDialogHelper.alert(R2.string.zdoc_user_cancel_title(), R2.string.zdoc_user_cancel_msg(), R2.string.zdoc_user_cancel_stay(), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    BaseDocFragment.this.mRecordManager.recordAlertChoose(ZdocRecordService.ACTIVE_EXIT, Integer.toString(1));
                    if (uIState == UIState.CAPTURE) {
                        BaseDocFragment.this.updateUI(UIState.CAPTURE);
                    }
                }
            }, R2.string.zdoc_user_cancel_quit(), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    BaseDocFragment.this.mRecordManager.recordAlertChoose(ZdocRecordService.ACTIVE_EXIT, Integer.toString(0));
                    BaseDocFragment.this.responseWithCode(301, (BioUploadResult) null);
                }
            });
        }
    }

    /* renamed from: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment$15  reason: invalid class name */
    static /* synthetic */ class AnonymousClass15 {
        static final /* synthetic */ int[] $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.zoloz.android.phone.zdoc.ui.UIState[] r0 = com.zoloz.android.phone.zdoc.ui.UIState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState = r0
                com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.CAPTURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.SCANNING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.SCAN_TASK_OK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.USER_CONFIRM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState     // Catch:{ NoSuchFieldError -> 0x003e }
                com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.UPLOADING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.UPLOAD_END_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.UPLOAD_END_FAIL     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.zoloz.android.phone.zdoc.ui.UIState r1 = com.zoloz.android.phone.zdoc.ui.UIState.ALERT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zoloz.android.phone.zdoc.fragment.BaseDocFragment.AnonymousClass15.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public void updateUI(UIState uIState) {
        IMessageView iMessageView;
        switch (AnonymousClass15.$SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState[uIState.ordinal()]) {
            case 1:
                handleCapture();
                break;
            case 2:
                handleCapture();
                break;
            case 3:
                handleScanTaskOK();
                break;
            case 4:
                handleUserConfirm();
                break;
            case 5:
                handleUploading();
                break;
            case 6:
                DialogHelper dialogHelper = this.mDialogHelper;
                if (dialogHelper != null) {
                    dialogHelper.showSuccessDialog(false, (DialogInterface.OnCancelListener) null);
                    break;
                }
                break;
            case 7:
                DialogHelper dialogHelper2 = this.mDialogHelper;
                if (dialogHelper2 != null) {
                    dialogHelper2.dismissDialog();
                    break;
                }
                break;
            case 8:
                handleAlert(this.mCurrentState);
                break;
        }
        this.mCurrentState = uIState;
        ZdocRemoteConfig zdocRemoteConfig = this.mZdocRemoteConfig;
        if (zdocRemoteConfig != null && (iMessageView = this.mMessageView) != null) {
            iMessageView.updateUI(uIState, zdocRemoteConfig.getShowPowerByZoloz(), -1);
        }
    }

    private void handleScanTaskOK() {
        this.mShowFrame = true;
    }

    /* access modifiers changed from: protected */
    public void handleUserConfirm() {
        this.mShowFrame = true;
    }

    /* access modifiers changed from: protected */
    public void handleUploading() {
        DialogHelper dialogHelper = this.mDialogHelper;
        if (dialogHelper != null) {
            dialogHelper.showProgressDialog("", false, (DialogInterface.OnCancelListener) null, true);
        }
    }

    /* access modifiers changed from: protected */
    public void handleAlert(UIState uIState) {
        if (uIState == UIState.CAPTURE) {
            this.mShowFrame = true;
            this.mRecordManager.recordBasicCheck();
        }
    }

    /* access modifiers changed from: protected */
    public void handleCapture() {
        DialogHelper dialogHelper = this.mDialogHelper;
        if (dialogHelper != null) {
            dialogHelper.dismissDialog();
        }
        this.mPhotoImageView.setVisibility(4);
        this.mCameraSurfaceView.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onInitView() {
        this.mDialogHelper = new DialogHelper(getActivity());
        this.mCameraSurfaceView = (CameraSurfaceView) findViewById(R.id.surface);
        this.mPhotoImageView = (ImageView) findViewById(R.id.iv_photo);
        this.mTitleBar = (TitleBar) findViewById(R.id.layout_titlebar);
        IMessageView iMessageView = (IMessageView) findViewById(R.id.layout_message);
        this.mMessageView = iMessageView;
        if (this.mZdocRemoteConfig != null) {
            iMessageView.updateUI(UIState.CAPTURE, this.mZdocRemoteConfig.getShowPowerByZoloz(), -1);
        }
        this.mTitleBar.setClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                BaseDocFragment.this.mRecordManager.recordClickButton(BaseDocFragment.this.mCurrentState.toString(), ZdocRecordService.GO_BACK);
                BaseDocFragment.this.interrupt();
            }
        });
        BaseMaskView baseMaskView = (BaseMaskView) findViewById(R.id.layout_mask_view);
        this.mDefaultMaskView = baseMaskView;
        baseMaskView.setLayerType(1, (Paint) null);
        if (this.mBioAppDescription == null || this.mZdocRemoteConfig == null) {
            alertSystemError();
        }
        hotReloadUI();
    }

    private void hotReloadUI() {
        new TitleBarRender(this.mTitleBar).render();
        new MessageViewRender(this.mMessageView).render();
        new MaskViewRender(this.mDefaultMaskView).render();
    }

    /* access modifiers changed from: protected */
    public void onCameraInit() {
        ICameraInterface cameraImpl = CameraSurfaceView.getCameraImpl(getActivity());
        this.mCameraInterface = cameraImpl;
        if (cameraImpl != null) {
            cameraImpl.setCallback(this);
            this.mCameraInterface.initCamera(getCurrentDeviceSetting());
        } else {
            alertSystemError();
        }
        CameraSurfaceView cameraSurfaceView = this.mCameraSurfaceView;
        if (cameraSurfaceView != null) {
            cameraSurfaceView.setCameraCallback(this);
            this.mCameraSurfaceView.setVisibility(0);
            updateUI(UIState.CAPTURE);
        }
    }

    /* access modifiers changed from: protected */
    public DeviceSetting getCurrentDeviceSetting() {
        DeviceSetting deviceSetting = new DeviceSetting();
        deviceSetting.setCameraAuto(false);
        deviceSetting.setCameraID(findBackCameraId());
        return deviceSetting;
    }

    private int findBackCameraId() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    return i;
                }
            }
        } catch (RuntimeException unused) {
            this.mRecordManager.record("camera not found");
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public TGFrame createTGFrame(CameraData cameraData) {
        TGFrame tGFrame = new TGFrame();
        tGFrame.data = cameraData.getColorData().array();
        tGFrame.width = cameraData.getColorWidth();
        tGFrame.height = cameraData.getColorHeight();
        tGFrame.frameMode = 0;
        tGFrame.rotation = CameraSurfaceView.getCameraImpl(getContext()).getCameraViewRotation() % AUScreenAdaptTool.WIDTH_BASE;
        return tGFrame;
    }

    /* access modifiers changed from: protected */
    public void showPreviewImg(TGFrame tGFrame) {
        try {
            this.mPhotoImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Bitmap rotateBitmap = BitmapHelper.rotateBitmap(BitmapHelper.bytes2Bitmap(tGFrame.data, tGFrame.width, tGFrame.height, tGFrame.frameMode), tGFrame.rotation);
            if (rotateBitmap != null) {
                this.mPhotoImageView.setImageBitmap(BitmapHelper.resize(rotateBitmap, (int) (((float) rotateBitmap.getWidth()) * 0.8f), (int) (((float) rotateBitmap.getHeight()) * 0.8f)));
                this.mPhotoImageView.setVisibility(0);
            }
        } catch (OutOfMemoryError unused) {
            this.mRecordManager.record("zdoc_out_of_memory");
            System.gc();
        }
    }
}
