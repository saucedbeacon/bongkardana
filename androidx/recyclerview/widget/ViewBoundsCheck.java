package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class ViewBoundsCheck {
    final getMin getMin;
    getMax length = new getMax();

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    interface getMin {
        int getMax();

        int setMax(View view);

        int setMin();

        int setMin(View view);

        View setMin(int i);
    }

    ViewBoundsCheck(getMin getmin) {
        this.getMin = getmin;
    }

    static class getMax {
        int getMax;
        int getMin;
        int length;
        int setMax;
        int setMin = 0;

        getMax() {
        }

        /* access modifiers changed from: package-private */
        public final boolean setMax() {
            int i = this.setMin;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.getMax;
                int i4 = this.length;
                if ((i & ((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) << 0)) == 0) {
                    return false;
                }
            }
            int i5 = this.setMin;
            if ((i5 & 112) != 0) {
                int i6 = this.getMax;
                int i7 = this.getMin;
                if ((i5 & ((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4)) == 0) {
                    return false;
                }
            }
            int i8 = this.setMin;
            if ((i8 & 1792) != 0) {
                int i9 = this.setMax;
                int i10 = this.length;
                if ((i8 & ((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 8)) == 0) {
                    return false;
                }
            }
            int i11 = this.setMin;
            if ((i11 & 28672) != 0) {
                int i12 = this.setMax;
                int i13 = this.getMin;
                if (i12 > i13) {
                    i2 = 1;
                } else if (i12 != i13) {
                    i2 = 4;
                }
                if ((i11 & (i2 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final View setMax(int i, int i2, int i3, int i4) {
        int max = this.getMin.getMax();
        int min = this.getMin.setMin();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View min2 = this.getMin.setMin(i);
            int min3 = this.getMin.setMin(min2);
            int max2 = this.getMin.setMax(min2);
            getMax getmax = this.length;
            getmax.length = max;
            getmax.getMin = min;
            getmax.getMax = min3;
            getmax.setMax = max2;
            if (i3 != 0) {
                this.length.setMin = 0;
                this.length.setMin |= i3;
                if (this.length.setMax()) {
                    return min2;
                }
            }
            if (i4 != 0) {
                this.length.setMin = 0;
                this.length.setMin |= i4;
                if (this.length.setMax()) {
                    view = min2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public final boolean length(View view) {
        getMax getmax = this.length;
        int max = this.getMin.getMax();
        int min = this.getMin.setMin();
        int min2 = this.getMin.setMin(view);
        int max2 = this.getMin.setMax(view);
        getmax.length = max;
        getmax.getMin = min;
        getmax.getMax = min2;
        getmax.setMax = max2;
        this.length.setMin = 0;
        this.length.setMin |= 24579;
        return this.length.setMax();
    }
}
