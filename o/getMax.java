package o;

import java.io.Serializable;

public class getMax implements Serializable {
    int max;
    int min;

    public getMax() {
    }

    public getMax(int i, int i2) {
        this.min = i;
        this.max = i2;
    }

    public int getMin() {
        return this.min;
    }

    public void setMin(int i) {
        this.min = i;
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int i) {
        this.max = i;
    }

    public double length() {
        return (double) (this.max - this.min);
    }

    public boolean isInside(int i) {
        return i >= this.min && i <= this.max;
    }

    public boolean IsOverlapping(getMax getmax) {
        return isInside(getmax.min) || isInside(getmax.max) || getmax.isInside(this.min) || getmax.isInside(this.max);
    }

    public length toFloatRange() {
        return new length((float) this.min, (float) this.max);
    }

    public setMax toDoubleRange() {
        return new setMax((double) this.min, (double) this.max);
    }

    public boolean equals(Object obj) {
        if (obj.getClass().isAssignableFrom(getMax.class)) {
            getMax getmax = (getMax) obj;
            if (this.min == getmax.getMin() && this.max == getmax.getMax()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.min + 355) * 71) + this.max;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Minimum: ");
        sb.append(this.min);
        sb.append(" Maximum: ");
        sb.append(this.max);
        return sb.toString();
    }
}
