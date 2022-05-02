package o;

import com.alibaba.wireless.security.SecExceptionCode;
import java.io.Serializable;

public class setMax implements Serializable {
    double max;
    double min;

    public setMax() {
    }

    public setMax(double d, double d2) {
        this.min = d;
        this.max = d2;
    }

    public double getMin() {
        return this.min;
    }

    public void setMin(double d) {
        this.min = d;
    }

    public double getMax() {
        return this.max;
    }

    public void setMax(double d) {
        this.max = d;
    }

    public double length() {
        return this.max - this.min;
    }

    public boolean isInside(double d) {
        return d >= this.min && d <= this.max;
    }

    public boolean IsOverlapping(setMax setmax) {
        return isInside(setmax.min) || isInside(setmax.max) || setmax.isInside(this.min) || setmax.isInside(this.max);
    }

    public getMax toIntRange() {
        return new getMax((int) this.min, (int) this.max);
    }

    public length toFloatRange() {
        return new length((float) this.min, (float) this.max);
    }

    public boolean equals(Object obj) {
        if (obj.getClass().isAssignableFrom(setMax.class)) {
            setMax setmax = (setMax) obj;
            if (this.min == setmax.getMin() && this.max == setmax.getMax()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int doubleToLongBits = ((int) (Double.doubleToLongBits(this.min) ^ (Double.doubleToLongBits(this.min) >>> 32))) + SecExceptionCode.SEC_ERROR_STA_INCORRECT_DATA_FILE_DATA;
        return doubleToLongBits + (doubleToLongBits * 61) + ((int) (Double.doubleToLongBits(this.max) ^ (Double.doubleToLongBits(this.max) >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Minimum: ");
        sb.append(this.min);
        sb.append(" Maximum: ");
        sb.append(this.max);
        return sb.toString();
    }
}
