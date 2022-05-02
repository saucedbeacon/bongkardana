package o;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import java.util.Iterator;
import o.onFinishInflate;

public final class getMinimumWidth extends setGroupDividerEnabled {
    private static final onFinishInflate.setMax isInside = new onFinishInflate.setMax() {
        @NonNull
        public final <T extends setGroupDividerEnabled> T getMin(@NonNull Class<T> cls) {
            return new getMinimumWidth(true);
        }
    };
    private boolean IsOverlapping = false;
    public boolean getMax = false;
    public final boolean getMin;
    public final HashMap<String, getMinimumWidth> length = new HashMap<>();
    public final HashMap<String, Fragment> setMax = new HashMap<>();
    public final HashMap<String, adjustListItemSelectionBounds> setMin = new HashMap<>();
    private boolean toFloatRange = false;

    @NonNull
    public static getMinimumWidth getMax(adjustListItemSelectionBounds adjustlistitemselectionbounds) {
        return (getMinimumWidth) new onFinishInflate(adjustlistitemselectionbounds, isInside).setMax(getMinimumWidth.class);
    }

    public getMinimumWidth(boolean z) {
        this.getMin = z;
    }

    public final void getMin() {
        FragmentManager.getMin(3);
        this.IsOverlapping = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean setMin() {
        return this.IsOverlapping;
    }

    public final void length(@NonNull Fragment fragment) {
        if (this.getMax) {
            FragmentManager.getMin(2);
        } else if (!this.setMax.containsKey(fragment.mWho)) {
            this.setMax.put(fragment.mWho, fragment);
            FragmentManager.getMin(2);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean setMin(@NonNull Fragment fragment) {
        if (!this.setMax.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.getMin) {
            return this.IsOverlapping;
        }
        if (!this.toFloatRange) {
            return true;
        }
        return false;
    }

    public final void getMax(@NonNull Fragment fragment) {
        if (this.getMax) {
            FragmentManager.getMin(2);
            return;
        }
        if (this.setMax.remove(fragment.mWho) != null) {
            FragmentManager.getMin(2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMin(@NonNull Fragment fragment) {
        FragmentManager.getMin(3);
        getMinimumWidth getminimumwidth = this.length.get(fragment.mWho);
        if (getminimumwidth != null) {
            FragmentManager.getMin(3);
            getminimumwidth.IsOverlapping = true;
            this.length.remove(fragment.mWho);
        }
        adjustListItemSelectionBounds adjustlistitemselectionbounds = this.setMin.get(fragment.mWho);
        if (adjustlistitemselectionbounds != null) {
            adjustlistitemselectionbounds.getMin();
            this.setMin.remove(fragment.mWho);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            getMinimumWidth getminimumwidth = (getMinimumWidth) obj;
            return this.setMax.equals(getminimumwidth.setMax) && this.length.equals(getminimumwidth.length) && this.setMin.equals(getminimumwidth.setMin);
        }
    }

    public final int hashCode() {
        return (((this.setMax.hashCode() * 31) + this.length.hashCode()) * 31) + this.setMin.hashCode();
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.setMax.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.length.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.setMin.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
