package o;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public final class isShortcutKey implements stopDispatchingItemsChanged {
    @NonNull
    private final RecyclerView.Adapter getMin;

    public isShortcutKey(@NonNull RecyclerView.Adapter adapter) {
        this.getMin = adapter;
    }

    public final void setMax(int i, int i2) {
        this.getMin.notifyItemRangeInserted(i, i2);
    }

    public final void length(int i, int i2) {
        this.getMin.notifyItemRangeRemoved(i, i2);
    }

    public final void getMin(int i, int i2) {
        this.getMin.notifyItemMoved(i, i2);
    }

    public final void getMax(int i, int i2, Object obj) {
        this.getMin.notifyItemRangeChanged(i, i2, obj);
    }
}
