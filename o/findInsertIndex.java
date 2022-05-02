package o;

import androidx.annotation.NonNull;

public final class findInsertIndex implements stopDispatchingItemsChanged {
    int getMax = 0;
    int getMin = -1;
    final stopDispatchingItemsChanged length;
    Object setMax = null;
    int setMin = -1;

    public findInsertIndex(@NonNull stopDispatchingItemsChanged stopdispatchingitemschanged) {
        this.length = stopdispatchingitemschanged;
    }

    public final void length() {
        int i = this.getMax;
        if (i != 0) {
            if (i == 1) {
                this.length.setMax(this.getMin, this.setMin);
            } else if (i == 2) {
                this.length.length(this.getMin, this.setMin);
            } else if (i == 3) {
                this.length.getMax(this.getMin, this.setMin, this.setMax);
            }
            this.setMax = null;
            this.getMax = 0;
        }
    }

    public final void setMax(int i, int i2) {
        int i3;
        if (this.getMax == 1 && i >= (i3 = this.getMin)) {
            int i4 = this.setMin;
            if (i <= i3 + i4) {
                this.setMin = i4 + i2;
                this.getMin = Math.min(i, i3);
                return;
            }
        }
        length();
        this.getMin = i;
        this.setMin = i2;
        this.getMax = 1;
    }

    public final void length(int i, int i2) {
        int i3;
        if (this.getMax != 2 || (i3 = this.getMin) < i || i3 > i + i2) {
            length();
            this.getMin = i;
            this.setMin = i2;
            this.getMax = 2;
            return;
        }
        this.setMin += i2;
        this.getMin = i;
    }

    public final void getMin(int i, int i2) {
        length();
        this.length.getMin(i, i2);
    }

    public final void getMax(int i, int i2, Object obj) {
        int i3;
        if (this.getMax == 3) {
            int i4 = this.getMin;
            int i5 = this.setMin;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.setMax == obj) {
                this.getMin = Math.min(i, i4);
                this.setMin = Math.max(i5 + i4, i3) - this.getMin;
                return;
            }
        }
        length();
        this.getMin = i;
        this.setMin = i2;
        this.setMax = obj;
        this.getMax = 3;
    }
}
