package com.zoloz.android.phone.zdoc.fragment;

import android.os.Bundle;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.zoloz.hardware.camera.CameraData;
import com.zoloz.android.phone.zdoc.service.DocMonitorFrameManager;
import com.zoloz.android.phone.zdoc.service.IMonitorCallback;

public class BaseDocWithNineCaptureFragment extends BaseDocFragment {
    private boolean isCameraCanUsed = false;
    /* access modifiers changed from: private */
    public boolean isGettingPreviewImg = false;
    private DocMonitorFrameManager mDocMonitorFrameManager;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.mUploadManager == null) {
            getActivity().finish();
        }
        if (this.mZdocRemoteConfig != null && this.mZdocRemoteConfig.getUploadMonitorPic() == 1) {
            initDocMonitorManager();
        }
    }

    private void initDocMonitorManager() {
        if (this.mDocMonitorFrameManager == null) {
            DocMonitorFrameManager docMonitorFrameManager = new DocMonitorFrameManager(this.mZdocRemoteConfig, this.mUploadManager.getPublicKey(), this.mBisToken);
            this.mDocMonitorFrameManager = docMonitorFrameManager;
            docMonitorFrameManager.setTimerTask(new IMonitorCallback() {
                public void onTimeout() {
                    if (!BaseDocWithNineCaptureFragment.this.isGettingPreviewImg) {
                        boolean unused = BaseDocWithNineCaptureFragment.this.isGettingPreviewImg = true;
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void upLoadImage() {
        super.upLoadImage();
        uploadMonitorFrame();
    }

    public void responseWithCode(int i, BioUploadResult bioUploadResult) {
        uploadMonitorFrame();
        super.responseWithCode(i, bioUploadResult);
    }

    /* access modifiers changed from: protected */
    public void handleSuccContinue() {
        super.handleSuccContinue();
        DocMonitorFrameManager docMonitorFrameManager = this.mDocMonitorFrameManager;
        if (docMonitorFrameManager != null) {
            docMonitorFrameManager.setTimerTask(new IMonitorCallback() {
                public void onTimeout() {
                    if (!BaseDocWithNineCaptureFragment.this.isGettingPreviewImg) {
                        boolean unused = BaseDocWithNineCaptureFragment.this.isGettingPreviewImg = true;
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void handleUploading() {
        DocMonitorFrameManager docMonitorFrameManager = this.mDocMonitorFrameManager;
        if (docMonitorFrameManager != null) {
            docMonitorFrameManager.resetCurrentFrameNummer();
        }
        super.handleUploading();
    }

    private void uploadMonitorFrame() {
        DocMonitorFrameManager docMonitorFrameManager = this.mDocMonitorFrameManager;
        if (docMonitorFrameManager != null) {
            byte[] monitorBlob = docMonitorFrameManager.getMonitorBlob();
            byte[] key = this.mDocMonitorFrameManager.getKey();
            boolean isUTF8 = this.mDocMonitorFrameManager.isUTF8();
            if (monitorBlob != null) {
                this.mDocMonitorFrameManager.cancelTimer();
                this.isGettingPreviewImg = false;
                this.mUploadManager.uploadNineShoot(monitorBlob, key, isUTF8);
            }
        }
    }

    public void onPreviewFrame(CameraData cameraData) {
        super.onPreviewFrame(cameraData);
        if (this.isGettingPreviewImg) {
            this.mDocMonitorFrameManager.addMonitorFrame(createTGFrame(cameraData));
            this.mDocMonitorFrameManager.updateCurrentFrameNumber();
            this.isGettingPreviewImg = false;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        DocMonitorFrameManager docMonitorFrameManager = this.mDocMonitorFrameManager;
        if (docMonitorFrameManager != null) {
            docMonitorFrameManager.destroy();
            this.mDocMonitorFrameManager = null;
        }
    }
}
