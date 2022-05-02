package com.facebook.litho;

import android.graphics.PathEffect;
import com.facebook.yoga.YogaEdge;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Border {
    public PathEffect getMax;
    public final int[] getMin;
    public final int[] setMax;
    public final float[] setMin;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Corner {
        public static final int BOTTOM_LEFT = 3;
        public static final int BOTTOM_RIGHT = 2;
        public static final int TOP_LEFT = 0;
        public static final int TOP_RIGHT = 1;
    }

    static int setMax(int[] iArr, YogaEdge yogaEdge) {
        char c;
        if (iArr.length == 4) {
            switch (AnonymousClass2.length[yogaEdge.ordinal()]) {
                case 4:
                case 8:
                    c = 0;
                    break;
                case 5:
                    c = 1;
                    break;
                case 6:
                case 9:
                    c = 2;
                    break;
                case 7:
                    c = 3;
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Given unsupported edge ");
                    sb.append(yogaEdge.name());
                    throw new IllegalArgumentException(sb.toString());
            }
            return iArr[c];
        }
        throw new IllegalArgumentException("Given wrongly sized array");
    }

    /* renamed from: com.facebook.litho.Border$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] length;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.yoga.YogaEdge[] r0 = com.facebook.yoga.YogaEdge.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                length = r0
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.ALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.VERTICAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.LEFT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.TOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.RIGHT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.START     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = length     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.END     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.Border.AnonymousClass2.<clinit>():void");
        }
    }
}
