package o;

public final class getLogo {
    public float setMax;
    public float setMin;

    public getLogo(float f, float f2) {
        this.setMin = f;
        this.setMax = f2;
    }

    public getLogo() {
        this(1.0f, 1.0f);
    }

    public final boolean length() {
        return this.setMin == 1.0f && this.setMax == 1.0f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.setMin);
        sb.append("x");
        sb.append(this.setMax);
        return sb.toString();
    }
}
