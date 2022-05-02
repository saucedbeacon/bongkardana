package o;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public interface setHeaderViewInt {

    public interface getMax {
        int getMin(int i);

        int setMin(int i);
    }

    @NonNull
    onItemVisibleChanged getMax(int i);

    @NonNull
    getMax length(@NonNull onItemVisibleChanged onitemvisiblechanged);

    public static class setMin implements setHeaderViewInt {
        SparseArray<List<onItemVisibleChanged>> getMin = new SparseArray<>();

        @NonNull
        public final onItemVisibleChanged getMax(int i) {
            List list = this.getMin.get(i);
            if (list != null && !list.isEmpty()) {
                return (onItemVisibleChanged) list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type ".concat(String.valueOf(i)));
        }

        @NonNull
        public final getMax length(@NonNull onItemVisibleChanged onitemvisiblechanged) {
            return new length(onitemvisiblechanged);
        }

        class length implements getMax {
            final onItemVisibleChanged setMax;

            public final int getMin(int i) {
                return i;
            }

            length(onItemVisibleChanged onitemvisiblechanged) {
                this.setMax = onitemvisiblechanged;
            }

            public final int setMin(int i) {
                List list = setMin.this.getMin.get(i);
                if (list == null) {
                    list = new ArrayList();
                    setMin.this.getMin.put(i, list);
                }
                if (!list.contains(this.setMax)) {
                    list.add(this.setMax);
                }
                return i;
            }
        }
    }

    public static class length implements setHeaderViewInt {
        SparseArray<onItemVisibleChanged> length = new SparseArray<>();
        int setMin = 0;

        @NonNull
        public final onItemVisibleChanged getMax(int i) {
            onItemVisibleChanged onitemvisiblechanged = this.length.get(i);
            if (onitemvisiblechanged != null) {
                return onitemvisiblechanged;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type ".concat(String.valueOf(i)));
        }

        @NonNull
        public final getMax length(@NonNull onItemVisibleChanged onitemvisiblechanged) {
            return new C0010length(onitemvisiblechanged);
        }

        /* renamed from: o.setHeaderViewInt$length$length  reason: collision with other inner class name */
        class C0010length implements getMax {
            private SparseIntArray getMax = new SparseIntArray(1);
            final onItemVisibleChanged length;
            private SparseIntArray setMax = new SparseIntArray(1);

            C0010length(onItemVisibleChanged onitemvisiblechanged) {
                this.length = onitemvisiblechanged;
            }

            public final int setMin(int i) {
                int indexOfKey = this.setMax.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.setMax.valueAt(indexOfKey);
                }
                length length2 = length.this;
                onItemVisibleChanged onitemvisiblechanged = this.length;
                int i2 = length2.setMin;
                length2.setMin = i2 + 1;
                length2.length.put(i2, onitemvisiblechanged);
                this.setMax.put(i, i2);
                this.getMax.put(i2, i);
                return i2;
            }

            public final int getMin(int i) {
                int indexOfKey = this.getMax.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.getMax.valueAt(indexOfKey);
                }
                StringBuilder sb = new StringBuilder("requested global type ");
                sb.append(i);
                sb.append(" does not belong to the adapter:");
                sb.append(this.length.length);
                throw new IllegalStateException(sb.toString());
            }
        }
    }
}
