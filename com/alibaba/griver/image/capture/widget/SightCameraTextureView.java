package com.alibaba.griver.image.capture.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.AttributeSet;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.capture.utils.VideoUtils;
import java.io.IOException;

@TargetApi(11)
public class SightCameraTextureView extends CameraView {
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setup() {
    }

    public SightCameraTextureView(Context context) {
        super(context);
    }

    public SightCameraTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SightCameraTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void handleOnSurfaceTextureAvailable(SurfaceTexture surfaceTexture) {
        if (this.mInitCameraAsync) {
            if (this.mCameraStatus == 0) {
                synchronized (this.mCameraInitLock) {
                    if (this.mCameraStatus == 0) {
                        try {
                            this.mCameraInitLock.wait();
                        } catch (InterruptedException e) {
                            StringBuilder sb = new StringBuilder("InterruptedException:");
                            sb.append(e.getMessage());
                            RVLogger.e(sb.toString());
                        }
                    }
                }
            }
            if (this.mCameraStatus == 1) {
                notifyOpenCameraError();
                return;
            } else if (getParent() instanceof SightCameraViewImpl) {
                post(new Runnable() {
                    public void run() {
                        SightCameraTextureView.this.reLayout();
                    }
                });
            }
        } else {
            try {
                initCamera(true);
            } catch (Exception e2) {
                RVLogger.e(CameraView.TAG, "handleOnSurfaceTextureAvailable", e2);
                notifyOpenCameraError();
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder("Camera Time get surfaceTexture and init camera cost=");
        sb2.append(System.currentTimeMillis() - sCreateTime);
        RVLogger.d(sb2.toString());
        if (VideoUtils.previewRunning(this.mCamera)) {
            RVLogger.d("preview is running, stop it.");
            this.mCamera.stopPreview();
        }
        try {
            this.mCamera.setPreviewTexture(this.mSurfaceTexture);
            startPreview();
            notifyPrepared();
        } catch (Exception e3) {
            StringBuilder sb3 = new StringBuilder("onSurfaceTextureAvailable exp:");
            sb3.append(e3.getMessage());
            RVLogger.e(CameraView.TAG, sb3.toString(), e3);
            notifyOpenCameraError();
        }
    }

    public Camera switchCamera() {
        if (this.isSwitching) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(" switchCamera isSwitching return");
            RVLogger.d(sb.toString());
            return null;
        }
        this.isSwitching = true;
        releaseCamera();
        if (this.mCameraFacing == 0) {
            this.mCameraFacing = 1;
        } else {
            this.mCameraFacing = 0;
        }
        try {
            initCamera(true);
            try {
                this.mCamera.setPreviewTexture(this.mSurfaceTexture);
            } catch (IOException e) {
                RVLogger.d("setPreviewTexture: ".concat(String.valueOf(e)));
            }
            startPreview();
            setup();
            this.isSwitching = false;
            return this.mCamera;
        } catch (Exception e2) {
            RVLogger.e(CameraView.TAG, "switchCamera", e2);
            this.isSwitching = false;
            notifyOpenCameraError();
            return null;
        }
    }

    public Camera reopenCamera(int i) {
        releaseCamera();
        try {
            initCamera(true);
            try {
                this.mCamera.setPreviewTexture(this.mSurfaceTexture);
            } catch (IOException e) {
                RVLogger.d("setPreviewTexture: ".concat(String.valueOf(e)));
            }
            startPreview();
            return this.mCamera;
        } catch (Exception e2) {
            RVLogger.e(CameraView.TAG, "reopenCamera", e2);
            notifyOpenCameraError();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void afterReopen() {
        setup();
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("###onSurfaceTextureSizeChanged w:");
        sb.append(i);
        sb.append(", h:");
        sb.append(i2);
        RVLogger.d(sb.toString());
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("###onSurfaceTextureDestroyed");
        RVLogger.d(sb.toString());
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        RVLogger.d("onWindowFocusChanged hasWindowFocus: ".concat(String.valueOf(z)));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RVLogger.d("onDetachedFromWindow");
    }
}
