package o;

import androidx.annotation.NonNull;

public class setStackFromEnd implements Comparable<setStackFromEnd> {
    public final int getMax;
    public final int setMax;

    public /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        setStackFromEnd setstackfromend = (setStackFromEnd) obj;
        int i = this.setMax * this.getMax;
        int i2 = setstackfromend.setMax * setstackfromend.getMax;
        if (i2 < i) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public setStackFromEnd(int i, int i2) {
        this.getMax = i;
        this.setMax = i2;
    }

    public final setStackFromEnd setMax(setStackFromEnd setstackfromend) {
        int i = this.getMax;
        int i2 = setstackfromend.setMax;
        int i3 = i * i2;
        int i4 = setstackfromend.getMax;
        int i5 = this.setMax;
        if (i3 >= i4 * i5) {
            return new setStackFromEnd(i4, (i5 * i4) / i);
        }
        return new setStackFromEnd((i * i2) / i5, i2);
    }

    public final setStackFromEnd setMin(setStackFromEnd setstackfromend) {
        int i = this.getMax;
        int i2 = setstackfromend.setMax;
        int i3 = i * i2;
        int i4 = setstackfromend.getMax;
        int i5 = this.setMax;
        if (i3 <= i4 * i5) {
            return new setStackFromEnd(i4, (i5 * i4) / i);
        }
        return new setStackFromEnd((i * i2) / i5, i2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMax);
        sb.append("x");
        sb.append(this.setMax);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            setStackFromEnd setstackfromend = (setStackFromEnd) obj;
            return this.getMax == setstackfromend.getMax && this.setMax == setstackfromend.setMax;
        }
    }

    public int hashCode() {
        return (this.getMax * 31) + this.setMax;
    }
}
