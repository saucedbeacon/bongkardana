package o;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class setView {
    private ViewParent getMax;
    private int[] getMin;
    private ViewParent length;
    public final View setMax;
    public boolean setMin;

    public setView(@NonNull View view) {
        this.setMax = view;
    }

    public final boolean getMin() {
        return this.setMin;
    }

    public final boolean setMin() {
        return getMax(0);
    }

    public final boolean getMax(int i) {
        return setMin(i) != null;
    }

    public final boolean getMin(int i) {
        return setMin(i, 0);
    }

    public final boolean setMin(int i, int i2) {
        if (getMax(i2)) {
            return true;
        }
        if (!getMin()) {
            return false;
        }
        View view = this.setMax;
        for (ViewParent parent = this.setMax.getParent(); parent != null; parent = parent.getParent()) {
            if (onDestroy.getMin(parent, view, this.setMax, i, i2)) {
                setMin(i2, parent);
                onDestroy.length(parent, view, this.setMax, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public final boolean setMax(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return length(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final boolean getMax(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5) {
        return length(i, i2, i3, i4, iArr, i5, (int[]) null);
    }

    public final boolean length(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @Nullable int[] iArr2) {
        ViewParent min;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!getMin() || (min = setMin(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.setMax.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.getMin == null) {
                this.getMin = new int[2];
            }
            int[] iArr5 = this.getMin;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        onDestroy.setMax(min, this.setMax, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.setMax.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    public final boolean getMax(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return length(i, i2, iArr, iArr2, 0);
    }

    public final boolean length(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        ViewParent min;
        int i4;
        int i5;
        if (!getMin() || (min = setMin(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.setMax.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            if (this.getMin == null) {
                this.getMin = new int[2];
            }
            iArr = this.getMin;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        onDestroy.getMin(min, this.setMax, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.setMax.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean getMin(float f, float f2, boolean z) {
        ViewParent min;
        if (!getMin() || (min = setMin(0)) == null) {
            return false;
        }
        return onDestroy.length(min, this.setMax, f, f2, z);
    }

    public final boolean length(float f, float f2) {
        ViewParent min;
        if (!getMin() || (min = setMin(0)) == null) {
            return false;
        }
        return onDestroy.getMin(min, this.setMax, f, f2);
    }

    public final ViewParent setMin(int i) {
        if (i == 0) {
            return this.length;
        }
        if (i != 1) {
            return null;
        }
        return this.getMax;
    }

    public final void setMin(int i, ViewParent viewParent) {
        if (i == 0) {
            this.length = viewParent;
        } else if (i == 1) {
            this.getMax = viewParent;
        }
    }
}
