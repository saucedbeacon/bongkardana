package com.alibaba.griver.image.capture.meta;

import android.graphics.Rect;
import android.hardware.Camera;
import java.util.Map;

public class CameraParams {
    public static final String FLASH_MODE_AUTO = "auto";
    public static final String FLASH_MODE_OFF = "off";
    public static final String FLASH_MODE_ON = "on";
    public static final int REC_TYPE_DEFAULT = 0;
    public static final int REC_TYPE_FALCON_LOOKS = 2;
    public static final int REC_TYPE_LIVE = 1;
    public static final int REC_TYPE_OMX_VIDEO = 3;

    /* renamed from: a  reason: collision with root package name */
    private boolean f10458a = false;
    public boolean audioPermissionDelay = false;
    public boolean autoRotateTakenPicture = true;
    private boolean b = false;
    public boolean bZoomEnable = true;
    private Camera.Size c;
    private boolean d = true;
    private String e = "";
    public Map<String, String> exif;
    private boolean f = true;
    private boolean g = false;
    public int mActivityRotation = -1;
    public Rect mCropRect = null;
    public boolean mIgnoreOrientation = false;
    public boolean mLandscapeVideo = false;
    public int mMode = 0;
    public Rect mSrcRect = null;
    public int recordType = 0;

    public boolean isEnableEventBus() {
        return this.g;
    }

    public String getFlashMode() {
        return this.e;
    }

    public void enableBeauty(boolean z) {
        this.f10458a = z;
    }

    public boolean isDefaultCameraFront() {
        return this.b;
    }

    public void setDefaultCameraFront(boolean z) {
        this.b = z;
    }

    public Camera.Size getPictureSize() {
        return this.c;
    }

    public boolean isConvertPicture() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CameraParams{, mBeautyEnable=");
        sb.append(this.f10458a);
        sb.append(", bZoomEnable=");
        sb.append(this.bZoomEnable);
        sb.append(", mDefaultCameraFront=");
        sb.append(this.b);
        sb.append(", mPictureSize=");
        sb.append(this.c);
        sb.append(", mConvertPicture=");
        sb.append(this.d);
        sb.append(", mIgnoreOrientation=");
        sb.append(this.mIgnoreOrientation);
        sb.append(", mLandscapeVideo=");
        sb.append(this.mLandscapeVideo);
        sb.append(", exif=");
        sb.append(this.exif);
        sb.append(", autoRotateTakenPicture=");
        sb.append(this.autoRotateTakenPicture);
        sb.append(", mActivityRotation=");
        sb.append(this.mActivityRotation);
        sb.append(",eEBus = ");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
