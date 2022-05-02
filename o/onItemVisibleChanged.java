package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import o.flagActionItems;
import o.setHeaderViewInt;

public final class onItemVisibleChanged {
    private RecyclerView.setMin IsOverlapping = new RecyclerView.setMin() {
        public final void onChanged() {
            onItemVisibleChanged onitemvisiblechanged = onItemVisibleChanged.this;
            onitemvisiblechanged.setMin = onitemvisiblechanged.length.getItemCount();
            onItemVisibleChanged.this.getMin.setMin();
        }

        public final void onItemRangeChanged(int i, int i2) {
            onItemVisibleChanged.this.getMin.getMin(onItemVisibleChanged.this, i, i2, (Object) null);
        }

        public final void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onItemVisibleChanged.this.getMin.getMin(onItemVisibleChanged.this, i, i2, obj);
        }

        public final void onItemRangeInserted(int i, int i2) {
            onItemVisibleChanged.this.setMin += i2;
            onItemVisibleChanged.this.getMin.length(onItemVisibleChanged.this, i, i2);
            if (onItemVisibleChanged.this.setMin > 0 && onItemVisibleChanged.this.length.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                onItemVisibleChanged.this.getMin.getMin();
            }
        }

        public final void onItemRangeRemoved(int i, int i2) {
            onItemVisibleChanged.this.setMin -= i2;
            onItemVisibleChanged.this.getMin.setMax(onItemVisibleChanged.this, i, i2);
            if (onItemVisibleChanged.this.setMin <= 0 && onItemVisibleChanged.this.length.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                onItemVisibleChanged.this.getMin.getMin();
            }
        }

        public final void onItemRangeMoved(int i, int i2, int i3) {
            boolean z = true;
            if (i3 != 1) {
                z = false;
            }
            if (z) {
                onItemVisibleChanged.this.getMin.getMin(onItemVisibleChanged.this, i, i2);
                return;
            }
            throw new IllegalArgumentException("moving more than 1 item is not supported in RecyclerView");
        }

        public final void onStateRestorationPolicyChanged() {
            onItemVisibleChanged.this.getMin.getMin();
        }
    };
    @NonNull
    public final flagActionItems.getMin getMax;
    final getMin getMin;
    public final RecyclerView.Adapter<RecyclerView.valueOf> length;
    @NonNull
    public final setHeaderViewInt.getMax setMax;
    public int setMin;

    interface getMin {
        void getMin();

        void getMin(@NonNull onItemVisibleChanged onitemvisiblechanged, int i, int i2);

        void getMin(@NonNull onItemVisibleChanged onitemvisiblechanged, int i, int i2, @Nullable Object obj);

        void length(@NonNull onItemVisibleChanged onitemvisiblechanged, int i, int i2);

        void setMax(@NonNull onItemVisibleChanged onitemvisiblechanged, int i, int i2);

        void setMin();
    }

    onItemVisibleChanged(RecyclerView.Adapter<RecyclerView.valueOf> adapter, getMin getmin, setHeaderViewInt setheaderviewint, flagActionItems.getMin getmin2) {
        this.length = adapter;
        this.getMin = getmin;
        this.setMax = setheaderviewint.length(this);
        this.getMax = getmin2;
        this.setMin = this.length.getItemCount();
        this.length.registerAdapterDataObserver(this.IsOverlapping);
    }
}
