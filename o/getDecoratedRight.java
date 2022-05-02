package o;

public class getDecoratedRight {
    private int getMin;
    private int length;
    private int setMin;

    public getDecoratedRight(int i, int i2, int i3) {
        this.setMin = i;
        this.length = i2;
        this.getMin = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            getDecoratedRight getdecoratedright = (getDecoratedRight) obj;
            if (this.setMin == getdecoratedright.setMin && this.length == getdecoratedright.length && this.getMin == getdecoratedright.getMin) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.setMin * 31) + this.length) * 31) + this.getMin;
    }
}
