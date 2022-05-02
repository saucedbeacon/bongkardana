package o;

import java.util.Arrays;
import java.util.Comparator;
import o.RecyclerView;
import o.RecyclerView.SavedState;

public final class getViewLayoutPosition<E extends RecyclerView.SavedState> {
    private static final Comparator<RecyclerView.SavedState> COMPARATOR = new Comparator<RecyclerView.SavedState>() {
        public final int compare(RecyclerView.SavedState savedState, RecyclerView.SavedState savedState2) {
            return savedState.getValue() - savedState2.getValue();
        }
    };
    private final E[] constants;
    private final boolean isDense;
    private final Class<E> type;
    private final int[] values;

    getViewLayoutPosition(Class<E> cls) {
        this.type = cls;
        E[] eArr = (RecyclerView.SavedState[]) cls.getEnumConstants();
        this.constants = eArr;
        Arrays.sort(eArr, COMPARATOR);
        E[] eArr2 = this.constants;
        int length = eArr2.length;
        if (eArr2[0].getValue() == 1 && this.constants[length - 1].getValue() == length) {
            this.isDense = true;
            this.values = null;
            return;
        }
        this.isDense = false;
        this.values = new int[length];
        for (int i = 0; i < length; i++) {
            this.values[i] = this.constants[i].getValue();
        }
    }

    public final int toInt(E e) {
        return e.getValue();
    }

    public final E fromInt(int i) {
        try {
            return this.constants[this.isDense ? i - 1 : Arrays.binarySearch(this.values, i)];
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb = new StringBuilder("Unknown enum tag ");
            sb.append(i);
            sb.append(" for ");
            sb.append(this.type.getCanonicalName());
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
