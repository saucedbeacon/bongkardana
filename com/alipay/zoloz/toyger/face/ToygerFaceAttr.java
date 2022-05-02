package com.alipay.zoloz.toyger.face;

import android.graphics.RectF;
import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.algorithm.TGFaceAttr;

public class ToygerFaceAttr extends TGFaceAttr implements ToygerAttr {
    public ToygerFaceAttr() {
    }

    public ToygerFaceAttr(TGFaceAttr tGFaceAttr) {
        this.hasFace = tGFaceAttr.hasFace;
        this.eyeBlink = tGFaceAttr.eyeBlink;
        this.faceRegion = tGFaceAttr.faceRegion;
        this.quality = tGFaceAttr.quality;
        this.yaw = tGFaceAttr.yaw;
        this.pitch = tGFaceAttr.pitch;
        this.gaussian = tGFaceAttr.gaussian;
        this.motion = tGFaceAttr.motion;
        this.brightness = tGFaceAttr.brightness;
        this.integrity = tGFaceAttr.integrity;
        this.leftEyeBlinkRatio = tGFaceAttr.leftEyeBlinkRatio;
        this.rightEyeBlinkRatio = tGFaceAttr.rightEyeBlinkRatio;
        this.distance = tGFaceAttr.distance;
        this.keypts10 = tGFaceAttr.keypts10;
        this.confidence = tGFaceAttr.confidence;
        this.roll = tGFaceAttr.roll;
        this.iodRatio = tGFaceAttr.iodRatio;
        this.deepLiveness = tGFaceAttr.deepLiveness;
    }

    public ToygerFaceAttr(boolean z, boolean z2, RectF rectF, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, short s, float[] fArr, float f10, float f11, float f12, float f13) {
        this.hasFace = z;
        this.eyeBlink = z2;
        this.faceRegion = rectF;
        this.quality = f;
        this.yaw = f2;
        this.pitch = f3;
        this.gaussian = f4;
        this.motion = f5;
        this.brightness = f6;
        this.integrity = f7;
        this.leftEyeBlinkRatio = f8;
        this.rightEyeBlinkRatio = f9;
        this.distance = s;
        this.keypts10 = fArr;
        this.confidence = f10;
        this.roll = f11;
        this.iodRatio = f12;
        this.deepLiveness = f13;
    }

    public boolean hasTarget() {
        return this.hasFace;
    }

    public RectF region() {
        return this.faceRegion;
    }

    public float quality() {
        return this.quality;
    }

    public float gaussian() {
        return this.gaussian;
    }

    public float motion() {
        return this.motion;
    }

    public float brightness() {
        return this.brightness;
    }

    public float integrity() {
        return this.integrity;
    }

    public short distance() {
        return this.distance;
    }

    public boolean eyeBlink() {
        return this.eyeBlink;
    }

    public float yaw() {
        return this.yaw;
    }

    public float pitch() {
        return this.pitch;
    }

    public float leftEyeBlinkRatio() {
        return this.leftEyeBlinkRatio;
    }

    public float rightEyeBlinkRatio() {
        return this.rightEyeBlinkRatio;
    }
}
