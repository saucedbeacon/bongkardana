package o;

public final class clampViewPositionHorizontal {
    public static boolean length(float f) {
        return Float.compare(f, 1.0E9f) >= 0 || Float.compare(f, -1.0E9f) <= 0;
    }
}
