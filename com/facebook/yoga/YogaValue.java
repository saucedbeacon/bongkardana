package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class YogaValue {
    static final YogaValue getMax = new YogaValue(1.0E21f, YogaUnit.UNDEFINED);
    static final YogaValue getMin = new YogaValue(0.0f, YogaUnit.POINT);
    static final YogaValue setMin = new YogaValue(1.0E21f, YogaUnit.AUTO);
    public final YogaUnit length;
    public final float setMax;

    private YogaValue(float f, YogaUnit yogaUnit) {
        this.setMax = f;
        this.length = yogaUnit;
    }

    @DoNotStrip
    YogaValue(float f, int i) {
        this(f, YogaUnit.fromInt(i));
    }

    public boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            YogaValue yogaValue = (YogaValue) obj;
            YogaUnit yogaUnit = this.length;
            if (yogaUnit == yogaValue.length) {
                if (yogaUnit == YogaUnit.UNDEFINED || this.length == YogaUnit.AUTO || Float.compare(this.setMax, yogaValue.setMax) == 0) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.setMax) + this.length.intValue();
    }

    /* renamed from: com.facebook.yoga.YogaValue$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.yoga.YogaUnit[] r0 = com.facebook.yoga.YogaUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMax = r0
                com.facebook.yoga.YogaUnit r1 = com.facebook.yoga.YogaUnit.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.YogaUnit r1 = com.facebook.yoga.YogaUnit.POINT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.yoga.YogaUnit r1 = com.facebook.yoga.YogaUnit.PERCENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.yoga.YogaUnit r1 = com.facebook.yoga.YogaUnit.AUTO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaValue.AnonymousClass2.<clinit>():void");
        }
    }

    public String toString() {
        int i = AnonymousClass2.getMax[this.length.ordinal()];
        if (i == 1) {
            return "undefined";
        }
        if (i == 2) {
            return Float.toString(this.setMax);
        }
        if (i == 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.setMax);
            sb.append("%");
            return sb.toString();
        } else if (i == 4) {
            return "auto";
        } else {
            throw new IllegalStateException();
        }
    }
}
