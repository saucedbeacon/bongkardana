package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import o.flagActionItems;
import o.onItemVisibleChanged;
import o.setHeaderViewInt;

public final class setShortcutsVisibleInner implements onItemVisibleChanged.getMin {
    private final flagActionItems equals;
    public setMax getMax = new setMax();
    public final setHeaderViewInt getMin;
    @NonNull
    private final ConcatAdapter.Config.StableIdMode isInside;
    public final IdentityHashMap<RecyclerView.valueOf, onItemVisibleChanged> length = new IdentityHashMap<>();
    public List<onItemVisibleChanged> setMax = new ArrayList();
    public List<WeakReference<RecyclerView>> setMin = new ArrayList();
    private final ConcatAdapter toFloatRange;

    public setShortcutsVisibleInner(ConcatAdapter concatAdapter, ConcatAdapter.Config config) {
        this.toFloatRange = concatAdapter;
        if (config.getMin) {
            this.getMin = new setHeaderViewInt.length();
        } else {
            this.getMin = new setHeaderViewInt.setMin();
        }
        this.isInside = config.setMin;
        if (config.setMin == ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.equals = new flagActionItems.length();
        } else if (config.setMin == ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            this.equals = new flagActionItems.getMax();
        } else if (config.setMin == ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
            this.equals = new flagActionItems.setMin();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    public final boolean setMax(RecyclerView.Adapter<RecyclerView.valueOf> adapter) {
        return getMin(this.setMax.size(), adapter);
    }

    private boolean getMin(int i, RecyclerView.Adapter<RecyclerView.valueOf> adapter) {
        if (i < 0 || i > this.setMax.size()) {
            StringBuilder sb = new StringBuilder("Index must be between 0 and ");
            sb.append(this.setMax.size());
            sb.append(". Given:");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (!getMax()) {
            adapter.hasStableIds();
        } else if (!adapter.hasStableIds()) {
            throw new IllegalArgumentException("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        }
        if (getMax(adapter) != null) {
            return false;
        }
        onItemVisibleChanged onitemvisiblechanged = new onItemVisibleChanged(adapter, this, this.getMin, this.equals.setMax());
        this.setMax.add(i, onitemvisiblechanged);
        for (WeakReference<RecyclerView> weakReference : this.setMin) {
            RecyclerView recyclerView = (RecyclerView) weakReference.get();
            if (recyclerView != null) {
                adapter.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (onitemvisiblechanged.setMin > 0) {
            this.toFloatRange.notifyItemRangeInserted(setMax(onitemvisiblechanged), onitemvisiblechanged.setMin);
        }
        RecyclerView.Adapter.StateRestorationPolicy length2 = length();
        if (length2 == this.toFloatRange.getStateRestorationPolicy()) {
            return true;
        }
        this.toFloatRange.getMax(length2);
        return true;
    }

    public final int setMax(onItemVisibleChanged onitemvisiblechanged) {
        onItemVisibleChanged next;
        Iterator<onItemVisibleChanged> it = this.setMax.iterator();
        int i = 0;
        while (it.hasNext() && (next = it.next()) != onitemvisiblechanged) {
            i += next.setMin;
        }
        return i;
    }

    public final void setMin() {
        this.toFloatRange.notifyDataSetChanged();
        RecyclerView.Adapter.StateRestorationPolicy length2 = length();
        if (length2 != this.toFloatRange.getStateRestorationPolicy()) {
            this.toFloatRange.getMax(length2);
        }
    }

    public final void getMin(@NonNull onItemVisibleChanged onitemvisiblechanged, int i, int i2, @Nullable Object obj) {
        this.toFloatRange.notifyItemRangeChanged(i + setMax(onitemvisiblechanged), i2, obj);
    }

    public final void length(@NonNull onItemVisibleChanged onitemvisiblechanged, int i, int i2) {
        this.toFloatRange.notifyItemRangeInserted(i + setMax(onitemvisiblechanged), i2);
    }

    public final void setMax(@NonNull onItemVisibleChanged onitemvisiblechanged, int i, int i2) {
        this.toFloatRange.notifyItemRangeRemoved(i + setMax(onitemvisiblechanged), i2);
    }

    public final void getMin(@NonNull onItemVisibleChanged onitemvisiblechanged, int i, int i2) {
        int max = setMax(onitemvisiblechanged);
        this.toFloatRange.notifyItemMoved(i + max, i2 + max);
    }

    private RecyclerView.Adapter.StateRestorationPolicy length() {
        for (onItemVisibleChanged next : this.setMax) {
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy = next.length.getStateRestorationPolicy();
            if (stateRestorationPolicy == RecyclerView.Adapter.StateRestorationPolicy.PREVENT) {
                return RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            }
            if (stateRestorationPolicy == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && next.setMin == 0) {
                return RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            }
        }
        return RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
    }

    @NonNull
    public final setMax length(int i) {
        setMax setmax;
        if (this.getMax.setMin) {
            setmax = new setMax();
        } else {
            this.getMax.setMin = true;
            setmax = this.getMax;
        }
        Iterator<onItemVisibleChanged> it = this.setMax.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            onItemVisibleChanged next = it.next();
            if (next.setMin > i2) {
                setmax.getMax = next;
                setmax.getMin = i2;
                break;
            }
            i2 -= next.setMin;
        }
        if (setmax.getMax != null) {
            return setmax;
        }
        throw new IllegalArgumentException("Cannot find wrapper for ".concat(String.valueOf(i)));
    }

    public final boolean length(RecyclerView.valueOf valueof) {
        onItemVisibleChanged remove = this.length.remove(valueof);
        if (remove != null) {
            return remove.length.onFailedToRecycleView(valueof);
        }
        StringBuilder sb = new StringBuilder("Cannot find wrapper for ");
        sb.append(valueof);
        sb.append(", seems like it is not bound by this adapter: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    @NonNull
    public final onItemVisibleChanged setMax(RecyclerView.valueOf valueof) {
        onItemVisibleChanged onitemvisiblechanged = this.length.get(valueof);
        if (onitemvisiblechanged != null) {
            return onitemvisiblechanged;
        }
        StringBuilder sb = new StringBuilder("Cannot find wrapper for ");
        sb.append(valueof);
        sb.append(", seems like it is not bound by this adapter: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean getMax(RecyclerView recyclerView) {
        for (WeakReference<RecyclerView> weakReference : this.setMin) {
            if (weakReference.get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public final boolean getMax() {
        return this.isInside != ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS;
    }

    public static class setMax {
        public onItemVisibleChanged getMax;
        public int getMin;
        public boolean setMin;

        setMax() {
        }
    }

    @Nullable
    private onItemVisibleChanged getMax(RecyclerView.Adapter<RecyclerView.valueOf> adapter) {
        int size = this.setMax.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (this.setMax.get(i).length == adapter) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.setMax.get(i);
    }

    public final void getMin() {
        RecyclerView.Adapter.StateRestorationPolicy length2 = length();
        if (length2 != this.toFloatRange.getStateRestorationPolicy()) {
            this.toFloatRange.getMax(length2);
        }
    }
}
