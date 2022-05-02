package o;

import id.dana.webview.WebViewActivity;
import javax.annotation.Nullable;

public final class hide<T> {
    public short getMin;
    public final Object[] setMax;

    @Nullable
    private static String getMin(int i) {
        if (i == 0) {
            return WebViewActivity.CONTENT;
        }
        if (i == 1) {
            return "BACKGROUND";
        }
        if (i == 2) {
            return "FOREGROUND";
        }
        if (i == 3) {
            return "HOST";
        }
        if (i != 4) {
            return null;
        }
        return "BORDER";
    }

    public hide() {
        this.setMax = new Object[5];
        this.getMin = 0;
    }

    public hide(hide<T> hide) {
        Object[] objArr = new Object[5];
        this.setMax = objArr;
        this.getMin = 0;
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            this.setMax[i] = hide.setMax[i];
        }
        this.getMin = hide.getMin;
    }

    public final void getMax(int i, T t) {
        if (t != null) {
            Object[] objArr = this.setMax;
            if (objArr[i] != null) {
                StringBuilder sb = new StringBuilder("Already contains unit for type ");
                sb.append(getMin(i));
                throw new RuntimeException(sb.toString());
            } else if (objArr[3] != null || (i == 3 && this.getMin > 0)) {
                throw new RuntimeException("OutputUnitType.HOST unit should be the only member of an OutputUnitsAffinityGroup");
            } else {
                this.setMax[i] = t;
                this.getMin = (short) (this.getMin + 1);
            }
        } else {
            throw new IllegalArgumentException("value should not be null");
        }
    }

    public final void getMin(int i, T t) {
        if (t != null) {
            Object[] objArr = this.setMax;
            if (objArr[i] != null) {
                objArr[i] = t;
                return;
            }
        }
        if (t != null && this.setMax[i] == null) {
            getMax(i, t);
        } else if (t == null) {
            Object[] objArr2 = this.setMax;
            if (objArr2[i] != null) {
                objArr2[i] = null;
                this.getMin = (short) (this.getMin - 1);
            }
        }
    }

    public final boolean length() {
        return this.getMin == 0;
    }

    public final int getMax(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-516615052, oncanceled);
            onCancelLoad.getMin(-516615052, oncanceled);
        }
        if (i < 0 || i >= this.getMin) {
            StringBuilder sb = new StringBuilder("index=");
            sb.append(i);
            sb.append(", size=");
            sb.append(this.getMin);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 <= i) {
            if (this.setMax[i3] != null) {
                i2++;
            }
            i3++;
        }
        return i3 - 1;
    }

    public final T setMax(int i) {
        return this.setMax[getMax(i)];
    }

    public final T getMax() {
        T[] tArr = this.setMax;
        if (tArr[3] != null) {
            return tArr[3];
        }
        if (tArr[0] != null) {
            return tArr[0];
        }
        if (tArr[1] != null) {
            return tArr[1];
        }
        if (tArr[2] != null) {
            return tArr[2];
        }
        return tArr[4];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hide hide = (hide) obj;
        if (this.getMin != hide.getMin) {
            return false;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.setMax;
            if (i >= objArr.length) {
                return true;
            }
            if (objArr[i] != hide.setMax[i]) {
                return false;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        for (int i = 0; i < this.getMin; i++) {
            int max = getMax(i);
            Object max2 = setMax(i);
            sb.append("\n\t");
            sb.append(getMin(max));
            sb.append(": ");
            sb.append(max2.toString());
        }
        return sb.toString();
    }
}
