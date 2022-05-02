package com.alipay.zoloz.hardware.camera;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import com.alipay.mobile.security.faceauth.circle.protocol.DeviceSetting;
import java.util.List;

public interface ICameraInterface {
    void autoFocus(List<Camera.Area> list, Camera.AutoFocusCallback autoFocusCallback);

    void closeCamera();

    PointF colorToDepth(PointF pointF);

    PointF depthToColor(PointF pointF);

    CameraParams getCameraParams();

    String getCameraSN();

    int getCameraViewRotation();

    int getColorHeight();

    int getColorMode();

    int getColorWidth();

    int getDepthHeight();

    int getDepthWidth();

    String getFirmwareVersion();

    int getPreviewHeight();

    int getPreviewWidth();

    Rect getROI();

    Object getUVCCamera();

    void initCamera(int i, int i2, boolean z);

    void initCamera(DeviceSetting deviceSetting);

    boolean isMirror();

    void openCamera(DeviceSetting deviceSetting);

    void releaseCamera();

    void resumePreview();

    void setCallback(ICameraCallback iCameraCallback);

    void setFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener);

    void setOntShotPreviewCallback();

    void startCamera();

    void startPreview(SurfaceHolder surfaceHolder, float f, int i, int i2);

    void stopCamera();

    void stopPreview();
}
