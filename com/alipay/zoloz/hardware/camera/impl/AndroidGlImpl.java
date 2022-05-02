package com.alipay.zoloz.hardware.camera.impl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import java.io.IOException;

public class AndroidGlImpl extends AbsCameraImpl {
    private static AndroidGlImpl mCameraInterface;

    public void startPreview(SurfaceHolder surfaceHolder, float f, int i, int i2) {
    }

    private AndroidGlImpl(Context context) {
        super(context);
    }

    public static synchronized AndroidGlImpl getInstance(Context context) {
        AndroidGlImpl androidGlImpl;
        synchronized (AndroidGlImpl.class) {
            if (mCameraInterface == null) {
                mCameraInterface = new AndroidGlImpl(context);
            }
            mCameraInterface.initContext(context);
            androidGlImpl = mCameraInterface;
        }
        return androidGlImpl;
    }

    public void startPreview(SurfaceTexture surfaceTexture) {
        if (!this.isPreviewing && this.mCamera != null) {
            try {
                this.mCamera.setPreviewTexture(surfaceTexture);
                this.mCamera.startPreview();
            } catch (IOException unused) {
            }
            this.isPreviewing = true;
        }
    }

    public void releaseCamera() {
        super.releaseCamera();
        mCameraInterface = null;
    }
}
