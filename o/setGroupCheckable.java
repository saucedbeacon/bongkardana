package o;

import androidx.annotation.NonNull;
import o.changeMenuMode;

final class setGroupCheckable {

    static class getMin implements stopDispatchingItemsChanged {
        private final stopDispatchingItemsChanged getMin;
        private final int setMin;

        getMin(int i, stopDispatchingItemsChanged stopdispatchingitemschanged) {
            this.setMin = i;
            this.getMin = stopdispatchingitemschanged;
        }

        public final void setMax(int i, int i2) {
            this.getMin.setMax(i + this.setMin, i2);
        }

        public final void length(int i, int i2) {
            this.getMin.length(i + this.setMin, i2);
        }

        public final void getMin(int i, int i2) {
            stopDispatchingItemsChanged stopdispatchingitemschanged = this.getMin;
            int i3 = this.setMin;
            stopdispatchingitemschanged.getMin(i + i3, i2 + i3);
        }

        public final void getMax(int i, int i2, Object obj) {
            this.getMin.getMax(i + this.setMin, i2, obj);
        }
    }

    static int setMax(@NonNull changeMenuMode.getMin getmin, @NonNull hasVisibleItems hasvisibleitems, @NonNull hasVisibleItems hasvisibleitems2, int i) {
        int max = hasvisibleitems.getMax();
        int i2 = i - max;
        int size = (hasvisibleitems.size() - max) - hasvisibleitems.length();
        if (i2 >= 0 && i2 < size) {
            for (int i3 = 0; i3 < 30; i3++) {
                int i4 = ((i3 / 2) * (i3 % 2 == 1 ? -1 : 1)) + i2;
                if (i4 >= 0 && i4 < hasvisibleitems.toFloatRange) {
                    if (i4 >= 0) {
                        try {
                            if (i4 < getmin.setMax) {
                                int i5 = getmin.length[i4];
                                int i6 = (i5 & 15) == 0 ? -1 : i5 >> 4;
                                if (i6 != -1) {
                                    return i6 + hasvisibleitems2.length;
                                }
                            }
                        } catch (IndexOutOfBoundsException unused) {
                        }
                    }
                    StringBuilder sb = new StringBuilder("Index out of bounds - passed position = ");
                    sb.append(i4);
                    sb.append(", old list size = ");
                    sb.append(getmin.setMax);
                    throw new IndexOutOfBoundsException(sb.toString());
                }
            }
        }
        return Math.max(0, Math.min(i, hasvisibleitems2.size() - 1));
    }
}
