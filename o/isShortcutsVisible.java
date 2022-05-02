package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class isShortcutsVisible {
    public final setMin getMin;
    public final getMax length = new getMax();
    public final List<View> setMin = new ArrayList();

    public interface setMin {
        View getMax(int i);

        void getMax();

        void getMin(View view);

        void getMin(View view, int i, ViewGroup.LayoutParams layoutParams);

        RecyclerView.valueOf length(View view);

        void length(int i);

        void length(View view, int i);

        int setMax(View view);

        void setMax(int i);

        int setMin();

        void setMin(View view);
    }

    public isShortcutsVisible(setMin setmin) {
        this.getMin = setmin;
    }

    public final boolean getMin(View view) {
        if (!this.setMin.remove(view)) {
            return false;
        }
        this.getMin.getMin(view);
        return true;
    }

    public final void getMax(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.getMin.setMin();
        } else {
            i2 = getMin(i);
        }
        this.length.getMax(i2, z);
        if (z) {
            this.setMin.add(view);
            this.getMin.setMin(view);
        }
        this.getMin.length(view, i2);
    }

    public final int getMin(int i) {
        if (i < 0) {
            return -1;
        }
        int min = this.getMin.setMin();
        int i2 = i;
        while (i2 < min) {
            int min2 = i - (i2 - this.length.getMin(i2));
            if (min2 == 0) {
                while (this.length.setMin(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += min2;
        }
        return -1;
    }

    public final void setMax(int i) {
        int min = getMin(i);
        View max = this.getMin.getMax(min);
        if (max != null) {
            if (this.length.setMax(min)) {
                getMin(max);
            }
            this.getMin.length(min);
        }
    }

    public final void setMax(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.getMin.setMin();
        } else {
            i2 = getMin(i);
        }
        this.length.getMax(i2, z);
        if (z) {
            this.setMin.add(view);
            this.getMin.setMin(view);
        }
        this.getMin.getMin(view, i2, layoutParams);
    }

    public final void setMin(int i) {
        int min = getMin(i);
        this.length.setMax(min);
        this.getMin.setMax(min);
    }

    public final int getMax(View view) {
        int max = this.getMin.setMax(view);
        if (max != -1 && !this.length.setMin(max)) {
            return max - this.length.getMin(max);
        }
        return -1;
    }

    public final boolean setMin(View view) {
        return this.setMin.contains(view);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.length.toString());
        sb.append(", hidden list:");
        sb.append(this.setMin.size());
        return sb.toString();
    }

    public final boolean length(View view) {
        int max = this.getMin.setMax(view);
        if (max == -1) {
            getMin(view);
            return true;
        } else if (!this.length.setMin(max)) {
            return false;
        } else {
            this.length.setMax(max);
            getMin(view);
            this.getMin.length(max);
            return true;
        }
    }

    public static class getMax {
        public getMax getMin;
        public long setMin = 0;

        getMax() {
        }

        public final void getMax(int i) {
            getMax getmax = this;
            while (i >= 64) {
                getmax = getmax.getMin;
                if (getmax != null) {
                    i -= 64;
                } else {
                    return;
                }
            }
            getmax.setMin &= (1 << i) ^ -1;
        }

        /* access modifiers changed from: package-private */
        public final int getMin(int i) {
            getMax getmax = this.getMin;
            if (getmax == null) {
                if (i >= 64) {
                    return Long.bitCount(this.setMin);
                }
                return Long.bitCount(this.setMin & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.setMin & ((1 << i) - 1));
            } else {
                return getmax.getMin(i - 64) + Long.bitCount(this.setMin);
            }
        }

        public final String toString() {
            if (this.getMin == null) {
                return Long.toBinaryString(this.setMin);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.getMin.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.setMin));
            return sb.toString();
        }

        public final void length(int i) {
            getMax getmax = this;
            while (i >= 64) {
                if (getmax.getMin == null) {
                    getmax.getMin = new getMax();
                }
                getmax = getmax.getMin;
                i -= 64;
            }
            getmax.setMin |= 1 << i;
        }

        public final boolean setMin(int i) {
            getMax getmax = this;
            while (i >= 64) {
                if (getmax.getMin == null) {
                    getmax.getMin = new getMax();
                }
                getmax = getmax.getMin;
                i -= 64;
            }
            return (getmax.setMin & (1 << i)) != 0;
        }

        /* access modifiers changed from: package-private */
        public final void getMax(int i, boolean z) {
            getMax getmax = this;
            while (true) {
                if (i >= 64) {
                    if (getmax.getMin == null) {
                        getmax.getMin = new getMax();
                    }
                    getmax = getmax.getMin;
                    i -= 64;
                } else {
                    boolean z2 = (getmax.setMin & Long.MIN_VALUE) != 0;
                    long j = (1 << i) - 1;
                    long j2 = getmax.setMin;
                    getmax.setMin = ((j2 & (j ^ -1)) << 1) | (j2 & j);
                    if (z) {
                        getmax.length(i);
                    } else {
                        getmax.getMax(i);
                    }
                    if (z2 || getmax.getMin != null) {
                        if (getmax.getMin == null) {
                            getmax.getMin = new getMax();
                        }
                        getmax = getmax.getMin;
                        z = z2;
                        i = 0;
                    } else {
                        return;
                    }
                }
            }
        }

        public final boolean setMax(int i) {
            getMax getmax = this;
            while (i >= 64) {
                if (getmax.getMin == null) {
                    getmax.getMin = new getMax();
                }
                getmax = getmax.getMin;
                i -= 64;
            }
            long j = 1 << i;
            boolean z = (getmax.setMin & j) != 0;
            long j2 = getmax.setMin & (j ^ -1);
            getmax.setMin = j2;
            long j3 = j - 1;
            getmax.setMin = (j2 & j3) | Long.rotateRight((j3 ^ -1) & j2, 1);
            getMax getmax2 = getmax.getMin;
            if (getmax2 != null) {
                if (getmax2.setMin(0)) {
                    getmax.length(63);
                }
                getmax.getMin.setMax(0);
            }
            return z;
        }
    }
}
