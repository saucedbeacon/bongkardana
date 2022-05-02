package com.alipay.zoloz.hardware.camera.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.SurfaceHolder;

@SuppressLint({"InlinedApi"})
public class AndroidImpl extends AbsCameraImpl {
    private static AndroidImpl mCameraInterface;

    private AndroidImpl(Context context) {
        super(context);
    }

    public static synchronized AndroidImpl getInstance(Context context) {
        AndroidImpl androidImpl;
        synchronized (AndroidImpl.class) {
            if (mCameraInterface == null) {
                mCameraInterface = new AndroidImpl(context);
            }
            mCameraInterface.initContext(context);
            androidImpl = mCameraInterface;
        }
        return androidImpl;
    }

    public void startPreview(SurfaceHolder surfaceHolder, float f, int i, int i2) {
        if (!this.isPreviewing && this.mCamera != null) {
            try {
                this.mCamera.setPreviewDisplay(surfaceHolder);
                this.mCamera.startPreview();
                this.isPreviewing = true;
            } catch (Exception unused) {
                if (this.mCameraCallback != null) {
                    this.mCameraCallback.onError(-1);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void adjustPreview() {
        super.adjustPreview();
        this.mCamera.setDisplayOrientation(this.mCameraViewRotationAngle);
    }

    public void releaseCamera() {
        super.releaseCamera();
        mCameraInterface = null;
    }
}
