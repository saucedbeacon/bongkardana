package o;

public final class createFloatPropertyCompat {
    public float getMin;
    public float length;

    public final boolean setMin(float f) {
        return f > this.getMin && f <= this.length;
    }
}
