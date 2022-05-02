package com.mixpanel.android.mpmetrics;

import java.util.List;

public final class MixpanelNotificationData {
    public boolean FastBitmap$CoordinateSystem;
    public String Grayscale$Algorithm;
    public String ICustomTabsCallback;
    public String IsOverlapping = "mp";
    public int Mean$Arithmetic;
    public String b;
    public List<setMax> equals;
    public String getMax;
    public int getMin = -1;
    public String hashCode;
    public getMin invoke;
    public boolean invokeSuspend;
    public CharSequence isInside;
    public int length = -1;
    public int setMax = -1;
    public int setMin = -1;
    public String toDoubleRange;
    public String toFloatRange;
    public CharSequence toIntRange;
    public String toString;
    public String valueOf;
    public String values;

    public final boolean getMin() {
        return this.FastBitmap$CoordinateSystem;
    }

    public final boolean setMin() {
        return this.invokeSuspend;
    }

    public static class setMax {
        public String getMax;
        public String length;
        public getMin setMin;

        public setMax(String str, getMin getmin, String str2) {
            this.getMax = str;
            this.setMin = getmin;
            this.length = str2;
        }
    }

    public static class getMin {
        public final String getMax;
        public final PushTapActionType length;

        public getMin(PushTapActionType pushTapActionType, String str) {
            this.length = pushTapActionType;
            this.getMax = str;
        }

        public getMin(PushTapActionType pushTapActionType) {
            this(pushTapActionType, (String) null);
        }
    }

    public enum PushTapActionType {
        HOMESCREEN("homescreen"),
        URL_IN_BROWSER("browser"),
        DEEP_LINK("deeplink"),
        ERROR("error");
        
        private String stringVal;

        private PushTapActionType(String str) {
            this.stringVal = str;
        }

        public final String toString() {
            return this.stringVal;
        }

        public static PushTapActionType fromString(String str) {
            for (PushTapActionType pushTapActionType : values()) {
                if (pushTapActionType.toString().equals(str)) {
                    return pushTapActionType;
                }
            }
            return ERROR;
        }
    }
}
