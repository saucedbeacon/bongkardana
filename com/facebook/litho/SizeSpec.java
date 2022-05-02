package com.facebook.litho;

import android.view.View;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SizeSpec {

    @Retention(RetentionPolicy.SOURCE)
    public @interface MeasureSpecMode {
    }

    /* renamed from: com.facebook.litho.SizeSpec$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] getMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.yoga.YogaMeasureMode[] r0 = com.facebook.yoga.YogaMeasureMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMin = r0
                com.facebook.yoga.YogaMeasureMode r1 = com.facebook.yoga.YogaMeasureMode.EXACTLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.YogaMeasureMode r1 = com.facebook.yoga.YogaMeasureMode.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = getMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.yoga.YogaMeasureMode r1 = com.facebook.yoga.YogaMeasureMode.AT_MOST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.SizeSpec.AnonymousClass5.<clinit>():void");
        }
    }

    public static int length(float f, YogaMeasureMode yogaMeasureMode) {
        double d;
        double d2;
        int i = AnonymousClass5.getMin[yogaMeasureMode.ordinal()];
        if (i == 1) {
            if (f > 0.0f) {
                double d3 = (double) f;
                Double.isNaN(d3);
                d = d3 + 0.5d;
            } else {
                double d4 = (double) f;
                Double.isNaN(d4);
                d = d4 - 0.5d;
            }
            return View.MeasureSpec.makeMeasureSpec((int) d, 1073741824);
        } else if (i == 2) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            if (i == 3) {
                if (f > 0.0f) {
                    double d5 = (double) f;
                    Double.isNaN(d5);
                    d2 = d5 + 0.5d;
                } else {
                    double d6 = (double) f;
                    Double.isNaN(d6);
                    d2 = d6 - 0.5d;
                }
                return View.MeasureSpec.makeMeasureSpec((int) d2, Integer.MIN_VALUE);
            }
            throw new IllegalArgumentException("Unexpected YogaMeasureMode: ".concat(String.valueOf(yogaMeasureMode)));
        }
    }
}
