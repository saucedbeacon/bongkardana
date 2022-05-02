package com.alipay.zoloz.hardware.camera.preview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;

public class FilterTextureController {
    private CameraTextureRender mCameraTextureRender = new CameraTextureRender();
    private int mUiHeight;
    private int mUiWidth;

    public void release() {
    }

    public FilterTextureController(Context context) {
    }

    public Rect surfaceCreated(int i, SurfaceTexture surfaceTexture, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        Rect create = this.mCameraTextureRender.create(i, surfaceTexture, i2, i3, i4, i5, i6, f, f2);
        this.mUiWidth = i4;
        this.mUiHeight = i5;
        return create;
    }

    public void drawFrame(boolean z) {
        GLES20.glViewport(0, 0, this.mUiWidth, this.mUiHeight);
        this.mCameraTextureRender.setMirror(z);
        this.mCameraTextureRender.draw();
    }
}
