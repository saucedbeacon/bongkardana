package o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

public class onItemActionRequestChanged extends setOnCancelListener {
    private final getMin mItemDelegate;
    final RecyclerView mRecyclerView;

    public onItemActionRequestChanged(@NonNull RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        setOnCancelListener itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof getMin)) {
            this.mItemDelegate = new getMin(this);
        } else {
            this.mItemDelegate = (getMin) itemDelegate;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    public void onInitializeAccessibilityNodeInfo(View view, onSupportActionModeFinished onsupportactionmodefinished) {
        super.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished);
        if (!shouldIgnore() && this.mRecyclerView.getLayoutManager() != null) {
            this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(onsupportactionmodefinished);
        }
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !shouldIgnore()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    @NonNull
    public setOnCancelListener getItemDelegate() {
        return this.mItemDelegate;
    }

    public static class getMin extends setOnCancelListener {
        final onItemActionRequestChanged getMax;
        public Map<View, setOnCancelListener> length = new WeakHashMap();

        public getMin(@NonNull onItemActionRequestChanged onitemactionrequestchanged) {
            this.getMax = onitemactionrequestchanged;
        }

        public void onInitializeAccessibilityNodeInfo(View view, onSupportActionModeFinished onsupportactionmodefinished) {
            if (this.getMax.shouldIgnore() || this.getMax.mRecyclerView.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished);
                return;
            }
            this.getMax.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, onsupportactionmodefinished);
            setOnCancelListener setoncancellistener = this.length.get(view);
            if (setoncancellistener != null) {
                setoncancellistener.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (this.getMax.shouldIgnore() || this.getMax.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            setOnCancelListener setoncancellistener = this.length.get(view);
            if (setoncancellistener != null) {
                if (setoncancellistener.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return this.getMax.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        public void sendAccessibilityEvent(@NonNull View view, int i) {
            setOnCancelListener setoncancellistener = this.length.get(view);
            if (setoncancellistener != null) {
                setoncancellistener.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        public void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            setOnCancelListener setoncancellistener = this.length.get(view);
            if (setoncancellistener != null) {
                setoncancellistener.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }

        public boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            setOnCancelListener setoncancellistener = this.length.get(view);
            if (setoncancellistener != null) {
                return setoncancellistener.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            setOnCancelListener setoncancellistener = this.length.get(view);
            if (setoncancellistener != null) {
                setoncancellistener.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            setOnCancelListener setoncancellistener = this.length.get(view);
            if (setoncancellistener != null) {
                setoncancellistener.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            setOnCancelListener setoncancellistener = this.length.get(viewGroup);
            if (setoncancellistener != null) {
                return setoncancellistener.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Nullable
        public onWindowStartingSupportActionMode getAccessibilityNodeProvider(@NonNull View view) {
            setOnCancelListener setoncancellistener = this.length.get(view);
            if (setoncancellistener != null) {
                return setoncancellistener.getAccessibilityNodeProvider(view);
            }
            return super.getAccessibilityNodeProvider(view);
        }
    }
}
