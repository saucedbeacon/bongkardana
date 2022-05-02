package o;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import o.fromInclusive;
import o.onSupportActionModeFinished;

public class setOnCancelListener {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    public static final class setMin extends View.AccessibilityDelegate {
        public final setOnCancelListener setMax;

        setMin(setOnCancelListener setoncancellistener) {
            this.setMax = setoncancellistener;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.setMax.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.setMax.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            onSupportActionModeFinished min = onSupportActionModeFinished.getMin(accessibilityNodeInfo);
            min.toString(ViewCompat.getDefaultImpl(view));
            min.invokeSuspend(ViewCompat.newSession(view));
            min.isInside(ViewCompat.extraCommand(view));
            min.toIntRange(ViewCompat.toFloatRange(view));
            this.setMax.onInitializeAccessibilityNodeInfo(view, min);
            min.getMax(accessibilityNodeInfo.getText(), view);
            List<onSupportActionModeFinished.setMax> actionList = setOnCancelListener.getActionList(view);
            for (int i = 0; i < actionList.size(); i++) {
                min.setMin(actionList.get(i));
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.setMax.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.setMax.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public final void sendAccessibilityEvent(View view, int i) {
            this.setMax.sendAccessibilityEvent(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.setMax.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }

        @RequiresApi(16)
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            onWindowStartingSupportActionMode accessibilityNodeProvider = this.setMax.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.length();
            }
            return null;
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.setMax.performAccessibilityAction(view, i, bundle);
        }
    }

    public setOnCancelListener() {
        this(DEFAULT_DELEGATE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public setOnCancelListener(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new setMin(this);
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, onSupportActionModeFinished onsupportactionmodefinished) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished.getMin());
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public onWindowStartingSupportActionMode getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new onWindowStartingSupportActionMode(accessibilityNodeProvider);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        List<onSupportActionModeFinished.setMax> actionList = getActionList(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            onSupportActionModeFinished.setMax setmax = actionList.get(i2);
            if (setmax.length() == i) {
                z = setmax.getMin(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.mOriginalDelegate.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != fromInclusive.getMax.setMin) ? z : performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    private boolean performClickableSpanAction(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(fromInclusive.getMax.extraCommand);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] min = onSupportActionModeFinished.getMin(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (min != null && i < min.length) {
                if (clickableSpan.equals(min[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    static List<onSupportActionModeFinished.setMax> getActionList(View view) {
        List<onSupportActionModeFinished.setMax> list = (List) view.getTag(fromInclusive.getMax.newSession);
        return list == null ? Collections.emptyList() : list;
    }
}
