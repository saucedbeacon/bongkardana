package com.zoloz.android.phone.zdoc.fragment;

import android.view.View;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.zoloz.hardware.camera.CameraData;
import com.alipay.zoloz.toyger.ToygerService;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.doc.ToygerDocBlobConfig;
import com.alipay.zoloz.toyger.doc.ToygerDocService;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import com.zoloz.android.phone.zdoc.ui.UIState;
import java.util.HashMap;

public class ZdocCaptureFragment extends BaseDocWithNineCaptureFragment {
    /* access modifiers changed from: private */
    public boolean isCaptured = false;
    private TGFrame mTGFrame;

    public void onRestart() {
        super.onRestart();
        if (hasCameraPermission() && this.mDialogHelper != null && !this.mDialogHelper.isShowing() && this.mCurrentState == UIState.CAPTURE) {
            updateUI(UIState.CAPTURE);
        }
    }

    /* access modifiers changed from: protected */
    public void initView() {
        super.initView();
        this.mMessageView.setOnTakePhotoListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZdocCaptureFragment.this.mRecordManager.recordClickButton(ZdocCaptureFragment.this.mCurrentState.toString(), ZdocRecordService.TAKE_PHOTO);
                boolean unused = ZdocCaptureFragment.this.isCaptured = true;
            }
        });
        this.mMessageView.setOnConfirmListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZdocCaptureFragment.this.mRecordManager.recordClickButton(ZdocCaptureFragment.this.mCurrentState.toString(), ZdocRecordService.PHOTO_CONFIRM);
                ZdocCaptureFragment.this.updateUI(UIState.UPLOADING);
                ZdocCaptureFragment.this.upLoadImage();
            }
        });
        this.mMessageView.setOnReTakePhotoListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZdocCaptureFragment.this.mRecordManager.recordClickButton(ZdocCaptureFragment.this.mCurrentState.toString(), ZdocRecordService.PHOTO_CANCEL);
                ZdocCaptureFragment.this.updateUI(UIState.CAPTURE);
            }
        });
    }

    public void onPreviewFrame(CameraData cameraData) {
        super.onPreviewFrame(cameraData);
        if (this.isCaptured) {
            this.mTGFrame = createTGFrame(cameraData);
            this.isCaptured = false;
            updateUI(UIState.USER_CONFIRM);
        }
    }

    /* access modifiers changed from: protected */
    public void upLoadImage() {
        if (this.mTGFrame != null) {
            ToygerDocBlobConfig toygerDocBlobConfig = new ToygerDocBlobConfig();
            toygerDocBlobConfig.ratio = this.mZdocRemoteConfig.getRatio();
            toygerDocBlobConfig.pageNo = this.mCurrentPageNumber;
            toygerDocBlobConfig.pubkey = this.mUploadManager.getmPublicKey();
            record("ztech_enter");
            toygerDocBlobConfig.docType = this.mZdocRemoteConfig.getModules().get(Math.min(this.mCurrentPageNumberIndex, this.mZdocRemoteConfig.getModules().size() - 1)).getColl().getDocType();
            HashMap<String, Object> generateDocBlob = ToygerDocService.generateDocBlob(this.mTGFrame, toygerDocBlobConfig, mappingToPic(this.mDefaultMaskView.getDocFrame()), 2, this.mBisToken, String.valueOf(this.mCurrentRetryTimes));
            if (generateDocBlob != null) {
                this.mContent = (byte[]) generateDocBlob.get("content");
                this.mKey = (byte[]) generateDocBlob.get("key");
                this.mIsUTF8 = ((Boolean) generateDocBlob.get(ToygerService.KEY_RES_9_IS_UTF8)).booleanValue();
            }
        }
        super.upLoadImage();
    }

    private void record(String str) {
        ZdocRecordService zdocRecordService;
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        if (currentInstance != null && (zdocRecordService = (ZdocRecordService) currentInstance.getBioService(ZdocRecordService.class)) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("module", "toyger");
            zdocRecordService.write(str, hashMap);
        }
    }

    /* access modifiers changed from: protected */
    public void handleCapture() {
        super.handleCapture();
        this.isCaptured = false;
        this.mPhotoImageView.setVisibility(8);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mTGFrame = null;
    }
}
