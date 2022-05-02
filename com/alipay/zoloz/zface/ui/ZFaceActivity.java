package com.alipay.zoloz.zface.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.api.BioResponse;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.utils.RotateBitmapHelper;
import com.alipay.mobile.security.faceauth.model.DetectTimerTask;
import com.alipay.zoloz.hardware.camera.ICameraInterface;
import com.alipay.zoloz.hardware.camera.utils.AndroidCameraUtil;
import com.alipay.zoloz.hardware.camera.widget.CameraSurfaceView;
import com.alipay.zoloz.toyger.R;
import com.alipay.zoloz.toyger.R2;
import com.alipay.zoloz.toyger.blob.BitmapHelper;
import com.alipay.zoloz.toyger.face.ToygerFaceAttr;
import com.alipay.zoloz.zface.beans.AlertData;
import com.alipay.zoloz.zface.beans.FaceRemoteConfig;
import com.alipay.zoloz.zface.beans.FrameStateData;
import com.alipay.zoloz.zface.beans.PreviewData;
import com.alipay.zoloz.zface.beans.UploadData;
import com.alipay.zoloz.zface.services.TimeRecord;
import com.alipay.zoloz.zface.services.ZFaceRecordService;
import com.alipay.zoloz.zface.ui.hot.reload.HotReloadDrawable;
import com.alipay.zoloz.zface.ui.util.AlertUtil;
import com.alipay.zoloz.zface.ui.util.FaceScanTipsUtil;
import com.alipay.zoloz.zface.ui.widget.AlgorithmScheduleProgressBar;
import com.alipay.zoloz.zface.ui.widget.ZfaceUploadLoadingView;
import com.alipay.zoloz.zface.utils.ObjectUtil;
import java.util.HashMap;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import zoloz.ap.com.toolkit.R2;
import zoloz.ap.com.toolkit.ui.CustomTextView;
import zoloz.ap.com.toolkit.ui.DialogHelper;
import zoloz.ap.com.toolkit.ui.TitleBar;

public class ZFaceActivity extends BaseFaceActivity {
    private boolean isPause = false;
    /* access modifiers changed from: private */
    public AlgorithmScheduleProgressBar mAlgorithmScheduleProgressBar;
    private Bitmap mBestBitmap = null;
    private ImageView mCameraPreviewImg;
    private CameraSurfaceView mCameraSurfaceView;
    /* access modifiers changed from: private */
    public DetectTimerTask mDetectTimerTask;
    /* access modifiers changed from: private */
    public FaceScanTipsUtil mFaceScanTipsUtil;
    /* access modifiers changed from: private */
    public FrameStateData mFrameStateData = null;
    /* access modifiers changed from: private */
    public boolean mIsCheckFaced = false;
    private boolean mIsShowFrame = false;
    private TitleBar mTitleBar;
    private CustomTextView mZfaceTopTips;
    private ZfaceUploadLoadingView mZfaceUploadLoadingView;

    public String getCurrentActionName() {
        return null;
    }

    public void handleFinish(boolean z) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && (length = dispatchOnCancelled.length(applicationContext, 0)) != 0) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-1372390366, oncanceled);
            onCancelLoad.getMin(-1372390366, oncanceled);
        }
    }

    public void onEvent(int i, Map<String, Object> map) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext != null && i != (min = dispatchOnCancelled.setMin(applicationContext, i))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(513108176, oncanceled);
            onCancelLoad.getMin(513108176, oncanceled);
        }
    }

    private void startTimerTask() {
        FaceRemoteConfig remoteConfig;
        if (this.mDetectTimerTask != null) {
            stopTimerTask();
        }
        int i = 20;
        if (!(this.mZFacePresenter == null || (remoteConfig = this.mZFacePresenter.getRemoteConfig()) == null || remoteConfig.getColl() == null)) {
            i = remoteConfig.getColl().getTime();
        }
        final int i2 = i * 1000;
        DetectTimerTask detectTimerTask = new DetectTimerTask(i2);
        this.mDetectTimerTask = detectTimerTask;
        detectTimerTask.setTimerTaskListener(new DetectTimerTask.TimerListener() {
            public void countdown(int i) {
                if (ZFaceActivity.this.mDetectTimerTask != null && ZFaceActivity.this.mDetectTimerTask.isTimeOut()) {
                    ZFaceActivity.this.runOnUiThread(new Runnable() {
                        public void run() {
                            ZFaceActivity.this.mAlertUtil.alertTimeOut();
                        }
                    });
                }
                if (i2 != i && ZFaceActivity.this.mFrameStateData != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("content", ZFaceActivity.this.mFaceScanTipsUtil.getReimindTxt(ZFaceActivity.this.mFrameStateData.uiDesState));
                    HashMap<String, String> objectToStringMap = ObjectUtil.objectToStringMap(ZFaceActivity.this.mFrameStateData.attr);
                    if (objectToStringMap != null && !objectToStringMap.isEmpty()) {
                        hashMap.putAll(objectToStringMap);
                    }
                    ZFaceActivity.this.record("actionPrompt", hashMap);
                }
            }
        });
        this.mDetectTimerTask.start();
    }

    private void stopTimerTask() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-422532779, oncanceled);
            onCancelLoad.getMin(-422532779, oncanceled);
        }
        DetectTimerTask detectTimerTask = this.mDetectTimerTask;
        if (detectTimerTask != null) {
            detectTimerTask.setTimerTaskListener((DetectTimerTask.TimerListener) null);
            this.mDetectTimerTask.stop();
            this.mDetectTimerTask = null;
        }
    }

    public void onCameraWithPermission() {
        super.onCameraWithPermission();
        if (hasPermission()) {
            startTimerTask();
        }
    }

    /* access modifiers changed from: protected */
    public void onHasPermissionResume() {
        super.onHasPermissionResume();
        this.mIsShowFrame = false;
        startTimerTask();
    }

    public void onPause() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-140736894, oncanceled);
            onCancelLoad.getMin(-140736894, oncanceled);
        }
        super.onPause();
        stopTimerTask();
    }

    public int getLayoutResId() {
        return R.layout.activity_zface;
    }

    public void onInitView() {
        super.onInitView();
        this.mFaceScanTipsUtil = new FaceScanTipsUtil(getResources(), this.mZFacePresenter.getRemoteConfig());
        this.mCameraSurfaceView = (CameraSurfaceView) findViewById(R.id.zface_surface_view);
        this.mCameraPreviewImg = (ImageView) findViewById(R.id.zface_preview_img);
        this.mTitleBar = (TitleBar) findViewById(R.id.zface_titlebar);
        if (R2.bool.title_bar_with_line()) {
            this.mTitleBar.setBackground(HotReloadDrawable.zface_titlebar_bg());
        } else {
            this.mTitleBar.setBackground(HotReloadDrawable.zface_titlebar_bg_without_line());
        }
        this.mTitleBar.setBackDrawable(R2.drawable.title_bar_back());
        this.mTitleBar.setText(R2.string.zface_title());
        this.mTitleBar.setTextColor(R2.color.title_color());
        this.mTitleBar.setClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZFaceActivity.this.onBackPressed();
            }
        });
        AlgorithmScheduleProgressBar algorithmScheduleProgressBar = (AlgorithmScheduleProgressBar) findViewById(R.id.zface_algorithm_schedule_progressbar);
        this.mAlgorithmScheduleProgressBar = algorithmScheduleProgressBar;
        algorithmScheduleProgressBar.setProgressColor(R2.color.zface_progress_bg_color(), R2.color.zface_progress_start_color(), R2.color.zface_progress_end_color());
        CustomTextView customTextView = (CustomTextView) findViewById(R.id.zface_top_tip_tv);
        this.mZfaceTopTips = customTextView;
        customTextView.setTextColor(R2.color.zface_top_tip_color());
        this.mZfaceTopTips = (CustomTextView) findViewById(R.id.zface_top_tip_tv);
        ZfaceUploadLoadingView zfaceUploadLoadingView = (ZfaceUploadLoadingView) findViewById(R.id.zface_upload_loading_view);
        this.mZfaceUploadLoadingView = zfaceUploadLoadingView;
        zfaceUploadLoadingView.setVisibility(4);
        if (hasPermission()) {
            startTimerTask();
        }
        TextView textView = (TextView) findViewById(R.id.zfac_brand_tv);
        String brandTip = this.mZFacePresenter.getRemoteConfig().getFaceTips().getBrandTip();
        if (!"".equals(brandTip)) {
            textView.setText(brandTip);
        }
    }

    /* access modifiers changed from: protected */
    public AlertUtil createAlertUtils(int i) {
        return new AlertUtil(this, this, i);
    }

    public void onDestroy() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-112420870, oncanceled);
            onCancelLoad.getMin(-112420870, oncanceled);
        }
        stopTimerTask();
        super.onDestroy();
    }

    public void onFrameStateUpdate(final FrameStateData frameStateData) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-541364932, oncanceled);
            onCancelLoad.getMin(-541364932, oncanceled);
        }
        runOnUiThread(new Runnable() {
            public void run() {
                FrameStateData unused = ZFaceActivity.this.mFrameStateData = frameStateData;
                ZFaceActivity.this.setZfaceTopTips(frameStateData);
                if (frameStateData.tgFaceState.hasFace) {
                    ZFaceActivity.this.mAlgorithmScheduleProgressBar.showProgress(frameStateData.tgFaceState.progress);
                } else {
                    ZFaceActivity.this.mAlgorithmScheduleProgressBar.showProgress(0.0f, 50, true);
                }
                if (frameStateData.tgFaceState.hasFace && !ZFaceActivity.this.mIsCheckFaced) {
                    boolean unused2 = ZFaceActivity.this.mIsCheckFaced = true;
                    ZFaceActivity.this.record(ZFaceRecordService.DETECT_COND_END);
                    ZFaceActivity.this.record(ZFaceRecordService.POSE_START);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void setZfaceTopTips(FrameStateData frameStateData) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(450082486, oncanceled);
            onCancelLoad.getMin(450082486, oncanceled);
        }
        String reimindTxt = this.mFaceScanTipsUtil.getReimindTxt(frameStateData.uiDesState);
        if (TextUtils.isEmpty(reimindTxt)) {
            this.mZfaceTopTips.setVisibility(4);
            return;
        }
        this.mZfaceTopTips.setVisibility(0);
        this.mZfaceTopTips.setText(reimindTxt);
    }

    public void onFrameQualify(Bitmap bitmap, ToygerFaceAttr toygerFaceAttr) {
        record(ZFaceRecordService.POSE_END);
        record(ZFaceRecordService.LIVEBODY_START);
        TimeRecord.getInstance().recordTime(ZFaceRecordService.LIVEBODY_START);
        record(ZFaceRecordService.UPLOAD_AVARRIABLE);
        Bitmap bitmap2 = this.mBestBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.mBestBitmap = null;
        }
        this.mBestBitmap = bitmap;
    }

    public void onFrameComplete() {
        super.onFrameComplete();
        this.mIsShowFrame = true;
        stopTimerTask();
        this.mAlgorithmScheduleProgressBar.showProgress(1.0f, 50, true);
        this.mZfaceUploadLoadingView.setVisibility(0);
        showBestFrameBlur(this.mBestBitmap);
    }

    private void showBestFrameBlur(Bitmap bitmap) {
        Bitmap blur;
        if (bitmap != null) {
            try {
                if (Build.VERSION.SDK_INT >= 17 && (blur = blur(bitmap, 25.0f)) != null) {
                    this.mCameraPreviewImg.setVisibility(0);
                    this.mCameraPreviewImg.setBackgroundDrawable(new BitmapDrawable(getResources(), blur));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.renderscript.RenderScript} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0089  */
    @androidx.annotation.RequiresApi(api = 17)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap blur(android.graphics.Bitmap r6, float r7) throws android.renderscript.RSRuntimeException {
        /*
            r5 = this;
            r0 = 0
            android.renderscript.RenderScript r1 = android.renderscript.RenderScript.create(r5)     // Catch:{ Exception -> 0x0075, all -> 0x005c }
            android.renderscript.RenderScript$RSMessageHandler r2 = new android.renderscript.RenderScript$RSMessageHandler     // Catch:{ Exception -> 0x0057, all -> 0x0051 }
            r2.<init>()     // Catch:{ Exception -> 0x0057, all -> 0x0051 }
            r1.setMessageHandler(r2)     // Catch:{ Exception -> 0x0057, all -> 0x0051 }
            android.renderscript.Allocation$MipmapControl r2 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch:{ Exception -> 0x0057, all -> 0x0051 }
            r3 = 1
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createFromBitmap(r1, r6, r2, r3)     // Catch:{ Exception -> 0x0057, all -> 0x0051 }
            android.renderscript.Type r3 = r2.getType()     // Catch:{ Exception -> 0x004e, all -> 0x004a }
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createTyped(r1, r3)     // Catch:{ Exception -> 0x004e, all -> 0x004a }
            android.renderscript.Element r4 = android.renderscript.Element.U8_4(r1)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r1, r4)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            r0.setInput(r2)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            r0.setRadius(r7)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            r0.forEach(r3)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            r3.copyTo(r6)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            if (r1 == 0) goto L_0x0035
            r1.destroy()
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.destroy()
        L_0x003a:
            if (r3 == 0) goto L_0x003f
            r3.destroy()
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.destroy()
        L_0x0044:
            return r6
        L_0x0045:
            r6 = move-exception
            r7 = r0
            goto L_0x0055
        L_0x0048:
            r7 = r0
            goto L_0x005a
        L_0x004a:
            r6 = move-exception
            r7 = r0
            r3 = r7
            goto L_0x0055
        L_0x004e:
            r7 = r0
            r3 = r7
            goto L_0x005a
        L_0x0051:
            r6 = move-exception
            r7 = r0
            r2 = r7
            r3 = r2
        L_0x0055:
            r0 = r1
            goto L_0x0060
        L_0x0057:
            r7 = r0
            r2 = r7
            r3 = r2
        L_0x005a:
            r0 = r1
            goto L_0x0078
        L_0x005c:
            r6 = move-exception
            r7 = r0
            r2 = r7
            r3 = r2
        L_0x0060:
            if (r0 == 0) goto L_0x0065
            r0.destroy()
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.destroy()
        L_0x006a:
            if (r3 == 0) goto L_0x006f
            r3.destroy()
        L_0x006f:
            if (r7 == 0) goto L_0x0074
            r7.destroy()
        L_0x0074:
            throw r6
        L_0x0075:
            r7 = r0
            r2 = r7
            r3 = r2
        L_0x0078:
            if (r0 == 0) goto L_0x007d
            r0.destroy()
        L_0x007d:
            if (r2 == 0) goto L_0x0082
            r2.destroy()
        L_0x0082:
            if (r3 == 0) goto L_0x0087
            r3.destroy()
        L_0x0087:
            if (r7 == 0) goto L_0x008c
            r7.destroy()
        L_0x008c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.zface.ui.ZFaceActivity.blur(android.graphics.Bitmap, float):android.graphics.Bitmap");
    }

    public void onUploadSuccess(final UploadData uploadData) {
        final DialogHelper alertUploadSuccess = this.mAlertUtil.alertUploadSuccess(this);
        this.mZfaceUploadLoadingView.setVisibility(4);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                DialogHelper dialogHelper = alertUploadSuccess;
                if (dialogHelper != null) {
                    dialogHelper.dismissDialog();
                    alertUploadSuccess.release();
                }
                BioResponse bioResponse = new BioResponse();
                bioResponse.setSuccess(true);
                bioResponse.setToken(ZFaceActivity.this.mZFacePresenter.getBioAppDescription().getBistoken());
                BioUploadResult bioUploadResult = uploadData.getBioUploadResult();
                bioResponse.subCode = bioUploadResult.subCode;
                bioResponse.subMsg = bioUploadResult.subMsg;
                bioResponse.setResultMessage(bioUploadResult.subMsg);
                bioResponse.setResult(500);
                bioResponse.setTag(ZFaceActivity.this.mAppTag);
                HashMap hashMap = new HashMap();
                hashMap.put(BioDetector.EXT_KEY_UPLOAD_RESPONSE, uploadData.getOriginalData());
                bioResponse.setExt(hashMap);
                ZFaceActivity.this.mZFacePresenter.sendResponse(bioResponse);
                ZFaceActivity.this.finish();
            }
        }, 800);
    }

    public void onSurfaceviewInit(double d, double d2) {
        if (this.mCameraSurfaceView.getVisibility() == 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mCameraSurfaceView.getLayoutParams();
            if (d < d2) {
                double d3 = (double) layoutParams.width;
                Double.isNaN(d3);
                layoutParams.height = (int) ((d3 / (d * 1.0d)) * d2);
                this.mCameraSurfaceView.setLayoutParams(layoutParams);
                this.mCameraSurfaceView.setBackgroundColor(0);
                this.mCameraPreviewImg.setLayoutParams(layoutParams);
                return;
            }
            double d4 = (double) layoutParams.height;
            Double.isNaN(d4);
            layoutParams.width = (int) ((d4 / (d2 * 1.0d)) * d);
            this.mCameraSurfaceView.setLayoutParams(layoutParams);
            this.mCameraSurfaceView.setBackgroundColor(0);
            this.mCameraPreviewImg.setLayoutParams(layoutParams);
        }
    }

    public void onPreviewFrame(PreviewData previewData) {
        if (this.mIsShowFrame) {
            this.mIsShowFrame = false;
            if (this.mCameraPreviewImg.getVisibility() != 0) {
                this.mZFacePresenter.stopProcess();
                stopTimerTask();
                this.mCameraPreviewImg.setVisibility(0);
                byte[] array = previewData.rgbData.array();
                ICameraInterface cameraInterface = this.mCameraSurfaceView.getCameraInterface();
                Bitmap bytes2Bitmap = BitmapHelper.bytes2Bitmap(array, cameraInterface.getColorWidth(), cameraInterface.getColorHeight(), previewData.frameMode);
                Bitmap bitmap = null;
                if (previewData.rotation != 0) {
                    bitmap = RotateBitmapHelper.getVerticalRotateBitmap(bytes2Bitmap, (float) previewData.rotation);
                    int findBackCameraId = AndroidCameraUtil.findBackCameraId();
                    if (this.mZFacePresenter.getRemoteConfig().getDeviceSettings() != null && this.mZFacePresenter.getRemoteConfig().getDeviceSettings().length > 0 && this.mZFacePresenter.getRemoteConfig().getDeviceSettings()[0].getCameraID() == findBackCameraId) {
                        bitmap = BitmapHelper.reverseBitmap(bitmap, 0);
                    }
                } else if (cameraInterface == null || !cameraInterface.isMirror()) {
                    bitmap = BitmapHelper.reverseBitmap(bytes2Bitmap, 0);
                }
                if (bitmap != null) {
                    bytes2Bitmap = bitmap;
                }
                this.mCameraPreviewImg.setBackgroundDrawable(new BitmapDrawable(getResources(), bytes2Bitmap));
            }
        }
    }

    public boolean handleErrorEvnet(AlertData alertData) {
        stopTimerTask();
        return super.handleErrorEvnet(alertData);
    }

    /* access modifiers changed from: protected */
    public boolean isCanUseBack() {
        TitleBar titleBar = this.mTitleBar;
        if (titleBar == null) {
            return true;
        }
        return titleBar.isClickable();
    }

    public void retry(int i) {
        if (this.mZFacePresenter != null) {
            this.mCameraPreviewImg.setVisibility(4);
            this.mCameraSurfaceView.setVisibility(0);
            this.mZfaceUploadLoadingView.setVisibility(4);
            this.mZFacePresenter.retry(i);
        }
        startTimerTask();
    }

    public void showFrame() {
        this.mIsShowFrame = true;
    }

    public void stopProcess() {
        super.stopProcess();
        stopTimerTask();
    }
}
