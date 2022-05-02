package com.alipay.zoloz.hardware.camera.widget.gl;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.alipay.zoloz.hardware.camera.ICameraInterface;
import com.alipay.zoloz.hardware.camera.preview.FilterTextureController;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class GLCameraSurfaceViewRenderer implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {
    private boolean isFilterTextureCreated = false;
    private ICameraInterface mCameraInterface;
    private float mCornerSize;
    private FilterTextureController mFilterTextureController;
    private int mHeight;
    private SurfaceTexture mSurfaceTexture;
    private CameraGLSurfaceView mSurfaceView;
    private int mTextureId;
    private int mWidth;

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }

    public GLCameraSurfaceViewRenderer(CameraGLSurfaceView cameraGLSurfaceView) {
        this.mSurfaceView = cameraGLSurfaceView;
        this.mFilterTextureController = new FilterTextureController(cameraGLSurfaceView.getContext());
    }

    public void setSurfaceTexture(int i, SurfaceTexture surfaceTexture) {
        this.mTextureId = i;
        this.mSurfaceTexture = surfaceTexture;
    }

    public void setCameraInterface(ICameraInterface iCameraInterface) {
        this.mCameraInterface = iCameraInterface;
    }

    public void setCornerSize(float f) {
        this.mCornerSize = f;
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        startRender();
    }

    public void onDrawFrame(GL10 gl10) {
        boolean z;
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        GLES20.glClear(16640);
        try {
            this.mSurfaceTexture.updateTexImage();
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            this.mFilterTextureController.drawFrame(this.mCameraInterface.isMirror());
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        CameraGLSurfaceView cameraGLSurfaceView = this.mSurfaceView;
        if (cameraGLSurfaceView != null && this.mSurfaceTexture != null) {
            cameraGLSurfaceView.requestRender();
        }
    }

    public void startRender() {
        SurfaceTexture surfaceTexture;
        if (!this.isFilterTextureCreated && this.mCameraInterface != null && (surfaceTexture = this.mSurfaceTexture) != null) {
            surfaceTexture.updateTexImage();
            FilterTextureController filterTextureController = this.mFilterTextureController;
            int i = this.mTextureId;
            SurfaceTexture surfaceTexture2 = this.mSurfaceTexture;
            int colorWidth = this.mCameraInterface.getColorWidth();
            int colorHeight = this.mCameraInterface.getColorHeight();
            int i2 = this.mWidth;
            int i3 = this.mHeight;
            int cameraViewRotation = this.mCameraInterface.getCameraViewRotation();
            float f = this.mCornerSize;
            filterTextureController.surfaceCreated(i, surfaceTexture2, colorWidth, colorHeight, i2, i3, cameraViewRotation, f / ((float) this.mWidth), f / ((float) this.mHeight));
            this.isFilterTextureCreated = true;
        }
    }
}
