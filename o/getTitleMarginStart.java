package o;

public final class getTitleMarginStart {
    public static int getMax(float f, int i, int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i3 = i;
        int i4 = i2;
        if (i3 == i4) {
            return i3;
        }
        float f12 = ((float) ((i3 >> 24) & 255)) / 255.0f;
        float f13 = ((float) ((i3 >> 16) & 255)) / 255.0f;
        float f14 = ((float) ((i3 >> 8) & 255)) / 255.0f;
        float f15 = ((float) (i3 & 255)) / 255.0f;
        float f16 = ((float) ((i4 >> 24) & 255)) / 255.0f;
        float f17 = ((float) ((i4 >> 16) & 255)) / 255.0f;
        float f18 = ((float) ((i4 >> 8) & 255)) / 255.0f;
        float f19 = ((float) (i4 & 255)) / 255.0f;
        if (f13 <= 0.04045f) {
            f2 = f13 / 12.92f;
        } else {
            f2 = (float) Math.pow((double) ((f13 + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        if (f14 <= 0.04045f) {
            f3 = f14 / 12.92f;
        } else {
            f3 = (float) Math.pow((double) ((f14 + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        if (f15 <= 0.04045f) {
            f5 = f15 / 12.92f;
            f4 = 0.055f;
        } else {
            f4 = 0.055f;
            f5 = (float) Math.pow((double) ((f15 + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        if (f17 <= 0.04045f) {
            f6 = f17 / 12.92f;
        } else {
            f6 = (float) Math.pow((double) ((f17 + f4) / 1.055f), 2.4000000953674316d);
        }
        if (f18 <= 0.04045f) {
            f7 = f18 / 12.92f;
        } else {
            f7 = (float) Math.pow((double) ((f18 + f4) / 1.055f), 2.4000000953674316d);
        }
        if (f19 <= 0.04045f) {
            f8 = f19 / 12.92f;
        } else {
            f8 = (float) Math.pow((double) ((f19 + f4) / 1.055f), 2.4000000953674316d);
        }
        float f20 = f2 + (f * (f6 - f2));
        float f21 = f3 + (f * (f7 - f3));
        float f22 = f5 + ((f8 - f5) * f);
        float f23 = (f12 + (f * (f16 - f12))) * 255.0f;
        if (f20 <= 0.0031308f) {
            f9 = f20 * 12.92f;
        } else {
            f9 = (float) ((Math.pow((double) f20, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
        }
        float f24 = f9 * 255.0f;
        if (f21 <= 0.0031308f) {
            f10 = f21 * 12.92f;
        } else {
            f10 = (float) ((Math.pow((double) f21, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
        }
        float f25 = f10 * 255.0f;
        if (f22 <= 0.0031308f) {
            f11 = f22 * 12.92f;
        } else {
            f11 = (float) ((Math.pow((double) f22, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
        }
        return Math.round(f11 * 255.0f) | (Math.round(f23) << 24) | (Math.round(f24) << 16) | (Math.round(f25) << 8);
    }
}
