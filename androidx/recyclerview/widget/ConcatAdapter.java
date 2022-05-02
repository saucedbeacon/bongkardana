package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import o.onItemVisibleChanged;
import o.setShortcutsVisibleInner;

public final class ConcatAdapter extends RecyclerView.Adapter<RecyclerView.valueOf> {
    private final setShortcutsVisibleInner setMax;

    @SafeVarargs
    public ConcatAdapter(@NonNull RecyclerView.Adapter<? extends RecyclerView.valueOf>... adapterArr) {
        this(Config.length, adapterArr);
    }

    @SafeVarargs
    private ConcatAdapter(@NonNull Config config, @NonNull RecyclerView.Adapter<? extends RecyclerView.valueOf>... adapterArr) {
        this(config, (List<? extends RecyclerView.Adapter<? extends RecyclerView.valueOf>>) Arrays.asList(adapterArr));
    }

    private ConcatAdapter(@NonNull Config config, @NonNull List<? extends RecyclerView.Adapter<? extends RecyclerView.valueOf>> list) {
        this.setMax = new setShortcutsVisibleInner(this, config);
        for (RecyclerView.Adapter min : list) {
            setMin(min);
        }
        super.setHasStableIds(this.setMax.getMax());
    }

    private boolean setMin(@NonNull RecyclerView.Adapter<? extends RecyclerView.valueOf> adapter) {
        return this.setMax.setMax((RecyclerView.Adapter<RecyclerView.valueOf>) adapter);
    }

    public final int getItemViewType(int i) {
        setShortcutsVisibleInner setshortcutsvisibleinner = this.setMax;
        setShortcutsVisibleInner.setMax length = setshortcutsvisibleinner.length(i);
        onItemVisibleChanged onitemvisiblechanged = length.getMax;
        int min = onitemvisiblechanged.setMax.setMin(onitemvisiblechanged.length.getItemViewType(length.getMin));
        length.setMin = false;
        length.getMax = null;
        length.getMin = -1;
        setshortcutsvisibleinner.getMax = length;
        return min;
    }

    @NonNull
    public final RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        onItemVisibleChanged max = this.setMax.getMin.getMax(i);
        return max.length.onCreateViewHolder(viewGroup, max.setMax.getMin(i));
    }

    public final void onBindViewHolder(@NonNull RecyclerView.valueOf valueof, int i) {
        setShortcutsVisibleInner setshortcutsvisibleinner = this.setMax;
        setShortcutsVisibleInner.setMax length = setshortcutsvisibleinner.length(i);
        setshortcutsvisibleinner.length.put(valueof, length.getMax);
        onItemVisibleChanged onitemvisiblechanged = length.getMax;
        onitemvisiblechanged.length.bindViewHolder(valueof, length.getMin);
        length.setMin = false;
        length.getMax = null;
        length.getMin = -1;
        setshortcutsvisibleinner.getMax = length;
    }

    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    public final void setStateRestorationPolicy(@NonNull RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    public final long getItemId(int i) {
        setShortcutsVisibleInner setshortcutsvisibleinner = this.setMax;
        setShortcutsVisibleInner.setMax length = setshortcutsvisibleinner.length(i);
        onItemVisibleChanged onitemvisiblechanged = length.getMax;
        long max = onitemvisiblechanged.getMax.getMax(onitemvisiblechanged.length.getItemId(length.getMin));
        length.setMin = false;
        length.getMax = null;
        length.getMin = -1;
        setshortcutsvisibleinner.getMax = length;
        return max;
    }

    public final void getMax(@NonNull RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    public final int getItemCount() {
        int i = 0;
        for (onItemVisibleChanged onitemvisiblechanged : this.setMax.setMax) {
            i += onitemvisiblechanged.setMin;
        }
        return i;
    }

    public final boolean onFailedToRecycleView(@NonNull RecyclerView.valueOf valueof) {
        return this.setMax.length(valueof);
    }

    public final void onViewAttachedToWindow(@NonNull RecyclerView.valueOf valueof) {
        this.setMax.setMax(valueof).length.onViewAttachedToWindow(valueof);
    }

    public final void onViewDetachedFromWindow(@NonNull RecyclerView.valueOf valueof) {
        this.setMax.setMax(valueof).length.onViewDetachedFromWindow(valueof);
    }

    public final void onViewRecycled(@NonNull RecyclerView.valueOf valueof) {
        setShortcutsVisibleInner setshortcutsvisibleinner = this.setMax;
        onItemVisibleChanged remove = setshortcutsvisibleinner.length.remove(valueof);
        if (remove != null) {
            remove.length.onViewRecycled(valueof);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot find wrapper for ");
        sb.append(valueof);
        sb.append(", seems like it is not bound by this adapter: ");
        sb.append(setshortcutsvisibleinner);
        throw new IllegalStateException(sb.toString());
    }

    public final void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        setShortcutsVisibleInner setshortcutsvisibleinner = this.setMax;
        if (!setshortcutsvisibleinner.getMax(recyclerView)) {
            setshortcutsvisibleinner.setMin.add(new WeakReference(recyclerView));
            for (onItemVisibleChanged onitemvisiblechanged : setshortcutsvisibleinner.setMax) {
                onitemvisiblechanged.length.onAttachedToRecyclerView(recyclerView);
            }
        }
    }

    public final void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        setShortcutsVisibleInner setshortcutsvisibleinner = this.setMax;
        int size = setshortcutsvisibleinner.setMin.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = setshortcutsvisibleinner.setMin.get(size);
            if (weakReference.get() == null) {
                setshortcutsvisibleinner.setMin.remove(size);
            } else if (weakReference.get() == recyclerView) {
                setshortcutsvisibleinner.setMin.remove(size);
                break;
            }
            size--;
        }
        for (onItemVisibleChanged onitemvisiblechanged : setshortcutsvisibleinner.setMax) {
            onitemvisiblechanged.length.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public final int findRelativeAdapterPositionIn(@NonNull RecyclerView.Adapter<? extends RecyclerView.valueOf> adapter, @NonNull RecyclerView.valueOf valueof, int i) {
        setShortcutsVisibleInner setshortcutsvisibleinner = this.setMax;
        onItemVisibleChanged onitemvisiblechanged = setshortcutsvisibleinner.length.get(valueof);
        if (onitemvisiblechanged == null) {
            return -1;
        }
        int max = i - setshortcutsvisibleinner.setMax(onitemvisiblechanged);
        int itemCount = onitemvisiblechanged.length.getItemCount();
        if (max >= 0 && max < itemCount) {
            return onitemvisiblechanged.length.findRelativeAdapterPositionIn(adapter, valueof, max);
        }
        StringBuilder sb = new StringBuilder("Detected inconsistent adapter updates. The local position of the view holder maps to ");
        sb.append(max);
        sb.append(" which is out of bounds for the adapter with size ");
        sb.append(itemCount);
        sb.append(".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sb.append(valueof);
        sb.append("adapter:");
        sb.append(adapter);
        throw new IllegalStateException(sb.toString());
    }

    public static final class Config {
        @NonNull
        public static final Config length = new Config(StableIdMode.NO_STABLE_IDS);
        public final boolean getMin = true;
        @NonNull
        public final StableIdMode setMin;

        public enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        private Config(@NonNull StableIdMode stableIdMode) {
            this.setMin = stableIdMode;
        }
    }
}
