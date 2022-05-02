package com.alipay.mobile.security.faceauth.api;

import android.graphics.Rect;
import android.graphics.RectF;
import com.alipay.mobile.security.faceauth.FaceDetectType;

public abstract class FaceFrame {
    private int deviceAngle = 0;
    private float deviceLight = 0.0f;
    private FaceDetectType faceDetectType;
    private FaceFrameType faceFrameType;
    private double fgyroangle = 0.0d;
    protected FaceInfo mFaceInfo;
    private int yuvAngle;
    private int yuvHeight;
    private int yuvWidth;

    public abstract byte[] getImageData(Rect rect, boolean z, int i, int i2, boolean z2, boolean z3, int i3);

    public abstract byte[] getYuvData();

    public void setFaceInfo(FaceInfo faceInfo) {
        this.mFaceInfo = faceInfo;
    }

    public synchronized Rect getFaceSize() {
        if (this.mFaceInfo == null) {
            return null;
        }
        return this.mFaceInfo.faceSize;
    }

    public boolean isEyeBlink() {
        FaceInfo faceInfo = this.mFaceInfo;
        return faceInfo != null && faceInfo.eyeBlink;
    }

    public boolean isMouthOpen() {
        FaceInfo faceInfo = this.mFaceInfo;
        return faceInfo != null && faceInfo.mouthOpen;
    }

    public RectF getFacePos() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return null;
        }
        return faceInfo.position;
    }

    public float getYawAngle() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return -1.0f;
        }
        return faceInfo.yaw;
    }

    public float getPitchAngle() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return -1.0f;
        }
        return faceInfo.pitch;
    }

    public float getGaussianBlur() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return -1.0f;
        }
        return faceInfo.gaussianBlur;
    }

    public float getMouthDet() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return -1.0f;
        }
        return faceInfo.mouthDet;
    }

    public float getMotionBlur() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return -1.0f;
        }
        return faceInfo.motionBlur;
    }

    public float getBrightness() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return -1.0f;
        }
        return faceInfo.brightness;
    }

    public float getFaceQuality() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return -1.0f;
        }
        return faceInfo.faceQuality;
    }

    public boolean hasFace() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo != null) {
            return faceInfo.hasFace;
        }
        return false;
    }

    public float getLeftEyeHwratio() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return -1.0f;
        }
        return faceInfo.leftEyeHWRatio;
    }

    public float getRightEyeHwratio() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return -1.0f;
        }
        return faceInfo.rightEyeHWRatio;
    }

    @Deprecated
    public float getMouthHwratio() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return -1.0f;
        }
        return faceInfo.mouthHWRatio;
    }

    public float getEyeLeftDet() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return 0.0f;
        }
        return faceInfo.eyeLeftDet;
    }

    public float getEyeRightDet() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return 0.0f;
        }
        return faceInfo.eyeRightDet;
    }

    public float getMouthOcclusion() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return 0.0f;
        }
        return faceInfo.mouthOcclussion;
    }

    public float getEyeLeftOcclussion() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return 0.0f;
        }
        return faceInfo.eyeLeftOcclussion;
    }

    public float getEyeRightOcclussion() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return 0.0f;
        }
        return faceInfo.eyeRightOcclussion;
    }

    public boolean isNoVideo() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return false;
        }
        return faceInfo.notVideo;
    }

    public float getIntegrity() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return 0.0f;
        }
        return faceInfo.integrity;
    }

    public float getWearGlass() {
        FaceInfo faceInfo = this.mFaceInfo;
        if (faceInfo == null) {
            return 0.0f;
        }
        return faceInfo.wearGlass;
    }

    public FaceFrameType getFaceFrameType() {
        return this.faceFrameType;
    }

    public void setFaceFrameType(FaceFrameType faceFrameType2) {
        this.faceFrameType = faceFrameType2;
    }

    public int getDeviceAngle() {
        return this.deviceAngle;
    }

    public void setDeviceAngle(int i) {
        this.deviceAngle = i;
    }

    public int getYuvWidth() {
        return this.yuvWidth;
    }

    public void setYuvWidth(int i) {
        this.yuvWidth = i;
    }

    public int getYuvHeight() {
        return this.yuvHeight;
    }

    public void setYuvHeight(int i) {
        this.yuvHeight = i;
    }

    public int getYuvAngle() {
        return this.yuvAngle;
    }

    public void setYuvAngle(int i) {
        this.yuvAngle = i;
    }

    public float getDeviceLight() {
        return this.deviceLight;
    }

    public void setDeviceLight(float f) {
        this.deviceLight = f;
    }

    public double getFgyroangle() {
        return this.fgyroangle;
    }

    public void setFgyroangle(double d) {
        this.fgyroangle = d;
    }

    public FaceDetectType getFaceDetectType() {
        return this.faceDetectType;
    }

    public void setFaceDetectType(FaceDetectType faceDetectType2) {
        this.faceDetectType = faceDetectType2;
    }
}
