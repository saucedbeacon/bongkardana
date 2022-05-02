package com.alipay.zoloz.toyger.algorithm;

import android.graphics.RectF;
import java.util.Arrays;

public class TGFaceAttr {
    public float brightness;
    public float confidence;
    public float deepLiveness;
    public short distance;
    public boolean eyeBlink;
    public boolean eyeBlinkAux;
    public RectF faceRegion;
    public float gaussian;
    public boolean hasFace;
    public float integrity;
    public float iodRatio;
    public float[] keypts10;
    public float leftEyeBlinkRatio;
    public float leftEyeOpenScoreAux;
    public float motion;
    public boolean mouthOpenAction;
    public float mouthOpenScore;
    public float pitch;
    public float quality;
    public float rightEyeBlinkRatio;
    public float rightEyeOpenScoreAux;
    public float roll;
    public float stability;
    public float yaw;

    public TGFaceAttr() {
        this.faceRegion = new RectF();
    }

    public TGFaceAttr(boolean z, boolean z2, boolean z3, RectF rectF, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, short s, float[] fArr, float f13, float f14, float f15, float f16, float f17, boolean z4) {
        this.hasFace = z;
        this.eyeBlink = z2;
        this.eyeBlinkAux = z3;
        this.faceRegion = rectF;
        this.quality = f;
        this.stability = f2;
        this.yaw = f3;
        this.pitch = f4;
        this.gaussian = f5;
        this.motion = f6;
        this.brightness = f7;
        this.integrity = f8;
        this.leftEyeBlinkRatio = f9;
        this.leftEyeOpenScoreAux = f10;
        this.rightEyeBlinkRatio = f11;
        this.rightEyeOpenScoreAux = f12;
        this.distance = s;
        this.keypts10 = fArr;
        this.confidence = f13;
        this.roll = f14;
        this.iodRatio = f15;
        this.deepLiveness = f17;
        this.mouthOpenScore = f16;
        this.mouthOpenAction = z4;
    }

    public TGFaceAttr(TGFaceAttr tGFaceAttr) {
        if (tGFaceAttr != null) {
            this.hasFace = tGFaceAttr.hasFace;
            this.eyeBlink = tGFaceAttr.eyeBlink;
            this.eyeBlinkAux = tGFaceAttr.eyeBlinkAux;
            this.faceRegion = new RectF(tGFaceAttr.faceRegion);
            this.quality = tGFaceAttr.quality;
            this.stability = tGFaceAttr.stability;
            this.yaw = tGFaceAttr.yaw;
            this.pitch = tGFaceAttr.pitch;
            this.gaussian = tGFaceAttr.gaussian;
            this.motion = tGFaceAttr.motion;
            this.brightness = tGFaceAttr.brightness;
            this.integrity = tGFaceAttr.integrity;
            this.leftEyeBlinkRatio = tGFaceAttr.leftEyeBlinkRatio;
            this.leftEyeOpenScoreAux = tGFaceAttr.leftEyeOpenScoreAux;
            this.rightEyeBlinkRatio = tGFaceAttr.rightEyeBlinkRatio;
            this.rightEyeBlinkRatio = tGFaceAttr.rightEyeOpenScoreAux;
            this.distance = tGFaceAttr.distance;
            this.keypts10 = tGFaceAttr.keypts10;
            this.confidence = tGFaceAttr.confidence;
            this.roll = tGFaceAttr.roll;
            this.iodRatio = tGFaceAttr.iodRatio;
            this.deepLiveness = tGFaceAttr.deepLiveness;
            this.mouthOpenScore = tGFaceAttr.mouthOpenScore;
            this.mouthOpenAction = tGFaceAttr.mouthOpenAction;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TGFaceAttr{hasFace=");
        sb.append(this.hasFace);
        sb.append(", eyeBlink=");
        sb.append(this.eyeBlink);
        sb.append(", eyeBlinkAux=");
        sb.append(this.eyeBlinkAux);
        sb.append(", faceRegion=");
        sb.append(this.faceRegion);
        sb.append(", quality=");
        sb.append(this.quality);
        sb.append(", stability=");
        sb.append(this.stability);
        sb.append(", yaw=");
        sb.append(this.yaw);
        sb.append(", pitch=");
        sb.append(this.pitch);
        sb.append(", gaussian=");
        sb.append(this.gaussian);
        sb.append(", motion=");
        sb.append(this.motion);
        sb.append(", brightness=");
        sb.append(this.brightness);
        sb.append(", integrity=");
        sb.append(this.integrity);
        sb.append(", leftEyeBlinkRatio=");
        sb.append(this.leftEyeBlinkRatio);
        sb.append(", leftEyeOpenScoreAux=");
        sb.append(this.leftEyeOpenScoreAux);
        sb.append(", rightEyeBlinkRatio=");
        sb.append(this.rightEyeBlinkRatio);
        sb.append(", rightEyeOpenScoreAux=");
        sb.append(this.rightEyeOpenScoreAux);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", keypts10=");
        sb.append(Arrays.toString(this.keypts10));
        sb.append(", confidence=");
        sb.append(this.confidence);
        sb.append(", roll=");
        sb.append(this.roll);
        sb.append(", iodRatio=");
        sb.append(this.iodRatio);
        sb.append(", deepLiveness=");
        sb.append(this.deepLiveness);
        sb.append(", mouthOpenScore=");
        sb.append(this.mouthOpenScore);
        sb.append(", mouthOpenAction=");
        sb.append(this.mouthOpenAction);
        sb.append('}');
        return sb.toString();
    }
}
