package o;

import java.io.Serializable;

public class length implements Serializable {
    float max;
    float min;

    public length() {
    }

    public length(float f, float f2) {
        this.min = f;
        this.max = f2;
    }

    public float getMin() {
        return this.min;
    }

    public void setMin(float f) {
        this.min = f;
    }

    public float getMax() {
        return this.max;
    }

    public void setMax(float f) {
        this.max = f;
    }

    public float length() {
        return this.max - this.min;
    }

    public boolean isInside(float f) {
        return f >= this.min && f <= this.max;
    }

    public boolean IsOverlapping(length length) {
        return isInside(length.min) || isInside(length.max) || length.isInside(this.min) || length.isInside(this.max);
    }

    public getMax toIntRange() {
        return new getMax((int) this.min, (int) this.max);
    }

    public setMax toDoubleRange() {
        return new setMax((double) this.min, (double) this.max);
    }

    public boolean equals(Object obj) {
        if (obj.getClass().isAssignableFrom(length.class)) {
            length length = (length) obj;
            if (this.min == length.getMin() && this.max == length.getMax()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.min) + 57;
        return floatToIntBits + (floatToIntBits * 19) + Float.floatToIntBits(this.max);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Minimum: ");
        sb.append(this.min);
        sb.append(" Maximum: ");
        sb.append(this.max);
        return sb.toString();
    }
}
