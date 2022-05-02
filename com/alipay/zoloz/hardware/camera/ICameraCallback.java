package com.alipay.zoloz.hardware.camera;

public interface ICameraCallback {
    void onError(int i);

    void onPreviewFrame(CameraData cameraData);

    void onSuccess();

    void onSurfaceChanged(double d, double d2);

    void onSurfaceCreated();

    void onSurfaceDestroyed();
}
