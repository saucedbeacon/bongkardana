package o;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import o.getFocusedVirtualView;

public abstract class getAccessibilityFocusedVirtualViewId extends scrollTo {
    private final getFocusedVirtualView length;

    /* access modifiers changed from: protected */
    public abstract void getMax(dispatchHoverEvent dispatchhoverevent);

    @VisibleForTesting
    private getAccessibilityFocusedVirtualViewId(getFocusedVirtualView getfocusedvirtualview) {
        this.length = getfocusedvirtualview;
        AnonymousClass4 r0 = new invalidateRoot() {
            public final void getMax() {
                getAccessibilityFocusedVirtualViewId getaccessibilityfocusedvirtualviewid = getAccessibilityFocusedVirtualViewId.this;
                getaccessibilityfocusedvirtualviewid.toIntRange();
                getaccessibilityfocusedvirtualviewid.setMin();
            }
        };
        if (getfocusedvirtualview.getMin == null) {
            getfocusedvirtualview.getMin = r0;
            return;
        }
        throw new RuntimeException("Overriding existing listener!");
    }

    public final void length(createNodeForChild createnodeforchild, createNodeForChild createnodeforchild2, String str) {
        this.length.setMin(createnodeforchild, createnodeforchild2, str);
    }

    public final void setMax(createNodeForChild createnodeforchild, createNodeForChild createnodeforchild2) {
        this.length.setMin(createnodeforchild, createnodeforchild2, "default_input");
    }

    public final void setMax(dispatchHoverEvent dispatchhoverevent) {
        createNodeForChild createnodeforchild;
        if (!length()) {
            getMin();
            return;
        }
        isInside();
        getMax(dispatchhoverevent);
        getFocusedVirtualView getfocusedvirtualview = this.length;
        getFocusedVirtualView.getMin getmin = getfocusedvirtualview.setMax;
        for (int i = 0; i < getmin.setMax.size(); i++) {
            createNodeForChild createnodeforchild2 = getmin.setMax.get(i);
            createNodeForChild createnodeforchild3 = getmin.length.get(i);
            String str = getmin.getMin.get(i);
            if (createnodeforchild3.length == null) {
                createnodeforchild = null;
            } else {
                createnodeforchild = createnodeforchild3.length.get(str);
            }
            if (createnodeforchild != null) {
                if (createnodeforchild.getMin.remove(createnodeforchild3)) {
                    createnodeforchild3.setMax(str);
                } else {
                    throw new RuntimeException("Tried to remove non-existent input!");
                }
            }
            if (createnodeforchild2.getMin == null) {
                createnodeforchild2.getMin = new ArrayList<>();
            }
            createnodeforchild2.getMin.add(createnodeforchild3);
            if (createnodeforchild3.length == null) {
                createnodeforchild3.length = new LinkedHashMap();
            }
            createnodeforchild3.length.put(str, createnodeforchild2);
        }
        getfocusedvirtualview.toFloatRange = true;
        getfocusedvirtualview.setMin = true;
        getfocusedvirtualview.getMax.setMax(getfocusedvirtualview);
    }

    public final void setMin() {
        if (setMax()) {
            getFocusedVirtualView getfocusedvirtualview = this.length;
            if (getfocusedvirtualview.setMin) {
                getfocusedvirtualview.setMin = false;
                getfocusedvirtualview.getMax.setMin(getfocusedvirtualview);
                getfocusedvirtualview.setMax.setMax();
            }
        }
    }

    public final boolean setMax() {
        return this.length.getMax();
    }

    public final void getMax() {
        equals();
    }

    public getAccessibilityFocusedVirtualViewId() {
        this(new getFocusedVirtualView(updateHoveredVirtualView.setMax()));
    }
}
