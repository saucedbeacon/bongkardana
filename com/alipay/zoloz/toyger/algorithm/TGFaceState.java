package com.alipay.zoloz.toyger.algorithm;

public class TGFaceState {
    public static final int TG_MESSAGE_BAD_BRIGHTNESS = 8;
    public static final int TG_MESSAGE_BAD_EYE_OPENNESS = 10;
    public static final int TG_MESSAGE_BAD_PITCH = 5;
    public static final int TG_MESSAGE_BAD_QUALITY = 9;
    public static final int TG_MESSAGE_BAD_YAW = 6;
    public static final int TG_MESSAGE_BLINK_OPENNESS = 11;
    public static final int TG_MESSAGE_DISTANCE_TOO_CLOSE = 3;
    public static final int TG_MESSAGE_DISTANCE_TOO_FAR = 2;
    public static final int TG_MESSAGE_FACE_NOT_IN_CENTER = 4;
    public static final int TG_MESSAGE_HEAD_DOWN = 17;
    public static final int TG_MESSAGE_HEAD_DOWN_LEFT = 18;
    public static final int TG_MESSAGE_HEAD_LEFT = 19;
    public static final int TG_MESSAGE_HEAD_LEFT_UP = 20;
    public static final int TG_MESSAGE_HEAD_RIGHT = 15;
    public static final int TG_MESSAGE_HEAD_RIGHT_DOWN = 16;
    public static final int TG_MESSAGE_HEAD_UP = 13;
    public static final int TG_MESSAGE_HEAD_UP_RIGHT = 14;
    public static final int TG_MESSAGE_IMAGE_PERFECT = 0;
    public static final int TG_MESSAGE_IS_MOVING = 7;
    public static final int TG_MESSAGE_MOUTH_OPEN = 21;
    public static final int TG_MESSAGE_NO_FACE = 1;
    public static final int TG_MESSAGE_STACK_TIME = 12;
    public static final int TG_STATIC_MESSAGE_BLINK_LIVENESS = 1;
    public static final int TG_STATIC_MESSAGE_NOLIVENESS = 0;
    public float ballProgress;
    @Deprecated
    public int brightness;
    @Deprecated
    public int distance;
    @Deprecated
    public boolean faceInCenter;
    @Deprecated
    public int goodPitch;
    @Deprecated
    public boolean goodQuality;
    @Deprecated
    public int goodYaw;
    @Deprecated
    public boolean hasFace;
    @Deprecated
    public boolean isMoving;
    public int messageCode;
    public int orientation;
    public float progress;
    public int staticMessage;

    public TGFaceState() {
    }

    public TGFaceState(float f, int i) {
        this.progress = f;
        this.messageCode = i;
    }

    @Deprecated
    public TGFaceState(boolean z, int i, int i2, boolean z2, int i3, int i4, boolean z3, boolean z4, float f) {
        this.hasFace = z;
        this.brightness = i;
        this.distance = i2;
        this.faceInCenter = z2;
        this.goodPitch = i3;
        this.goodYaw = i4;
        this.isMoving = z3;
        this.goodQuality = z4;
        this.progress = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TGFaceState{progress=");
        sb.append(this.progress);
        sb.append(", messageCode=");
        sb.append(this.messageCode);
        sb.append(", staticMessage=");
        sb.append(this.staticMessage);
        sb.append(", ballprocess=");
        sb.append(this.ballProgress);
        sb.append('}');
        return sb.toString();
    }
}
