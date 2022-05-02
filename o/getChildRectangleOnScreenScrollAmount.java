package o;

public final class getChildRectangleOnScreenScrollAmount {
    public static float setMin(float f, float f2, float f3) {
        float f4;
        float f5 = f / (f3 / 2.0f);
        float f6 = f2 / 2.0f;
        if (f5 < 1.0f) {
            f4 = f6 * f5 * f5 * f5;
        } else {
            float f7 = f5 - 2.0f;
            f4 = f6 * ((f7 * f7 * f7) + 2.0f);
        }
        return f4 + 0.0f;
    }
}
