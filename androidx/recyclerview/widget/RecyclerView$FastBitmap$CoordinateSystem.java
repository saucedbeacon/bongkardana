package androidx.recyclerview.widget;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerView$FastBitmap$CoordinateSystem {
    SparseArray<getMin> getMax = new SparseArray<>();
    int setMax = 0;

    public static class getMin {
        public final ArrayList<RecyclerView.valueOf> getMax = new ArrayList<>();
        long length = 0;
        public int setMax = 5;
        long setMin = 0;

        getMin() {
        }
    }

    @Nullable
    public final RecyclerView.valueOf setMin(int i) {
        getMin getmin = this.getMax.get(i);
        if (getmin == null || getmin.getMax.isEmpty()) {
            return null;
        }
        ArrayList<RecyclerView.valueOf> arrayList = getmin.getMax;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                return arrayList.remove(size);
            }
        }
        return null;
    }

    public final void setMin(RecyclerView.valueOf valueof) {
        int itemViewType = valueof.getItemViewType();
        ArrayList<RecyclerView.valueOf> arrayList = setMax(itemViewType).getMax;
        if (this.getMax.get(itemViewType).setMax > arrayList.size()) {
            valueof.resetInternal();
            arrayList.add(valueof);
        }
    }

    static long getMax(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    /* access modifiers changed from: package-private */
    public final void setMin(int i, long j) {
        getMin max = setMax(i);
        long j2 = max.length;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        max.length = j;
    }

    /* access modifiers changed from: package-private */
    public final boolean length(int i, long j, long j2) {
        long j3 = setMax(i).length;
        return j3 == 0 || j + j3 < j2;
    }

    /* access modifiers changed from: package-private */
    public final boolean setMax(int i, long j, long j2) {
        long j3 = setMax(i).setMin;
        return j3 == 0 || j + j3 < j2;
    }

    public final getMin setMax(int i) {
        getMin getmin = this.getMax.get(i);
        if (getmin != null) {
            return getmin;
        }
        getMin getmin2 = new getMin();
        this.getMax.put(i, getmin2);
        return getmin2;
    }
}
