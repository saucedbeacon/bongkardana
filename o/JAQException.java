package o;

public final class JAQException<T> {
    public int getMax;
    final float getMin;
    public T[] length;
    int setMax;
    int setMin;

    public JAQException() {
        this((byte) 0);
    }

    private JAQException(byte b) {
        this.getMin = 0.75f;
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.setMax = numberOfLeadingZeros - 1;
        this.setMin = (int) (((float) numberOfLeadingZeros) * 0.75f);
        this.length = (Object[]) new Object[numberOfLeadingZeros];
    }

    public final boolean getMin(T t) {
        T t2;
        T[] tArr = this.length;
        int i = this.setMax;
        int hashCode = t.hashCode() * -1640531527;
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        T t3 = tArr[i2];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                i2 = (i2 + 1) & i;
                t2 = tArr[i2];
                if (t2 != null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[i2] = t;
        int i3 = this.getMax + 1;
        this.getMax = i3;
        if (i3 >= this.setMin) {
            T[] tArr2 = this.length;
            int length2 = tArr2.length;
            int i4 = length2 << 1;
            int i5 = i4 - 1;
            T[] tArr3 = (Object[]) new Object[i4];
            while (true) {
                int i6 = i3 - 1;
                if (i3 == 0) {
                    break;
                }
                do {
                    length2--;
                } while (tArr2[length2] == null);
                int hashCode2 = tArr2[length2].hashCode() * -1640531527;
                int i7 = (hashCode2 ^ (hashCode2 >>> 16)) & i5;
                if (tArr3[i7] != null) {
                    do {
                        i7 = (i7 + 1) & i5;
                    } while (tArr3[i7] != null);
                }
                tArr3[i7] = tArr2[length2];
                i3 = i6;
            }
            this.setMax = i5;
            this.setMin = (int) (((float) i4) * this.getMin);
            this.length = tArr3;
        }
        return true;
    }

    public final boolean getMax(T t) {
        T t2;
        T[] tArr = this.length;
        int i = this.setMax;
        int hashCode = t.hashCode() * -1640531527;
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        T t3 = tArr[i2];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return setMax(i2, tArr, i);
        }
        do {
            i2 = (i2 + 1) & i;
            t2 = tArr[i2];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return setMax(i2, tArr, i);
    }

    private boolean setMax(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.getMax--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int hashCode = t.hashCode() * -1640531527;
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i >= i5 || i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }
}
