package o;

import android.graphics.Paint;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class onForwardedEvent<T> {
    private static final Map<Object, onForwardedEvent> toIntRange = new HashMap();
    final Map<String, onForwardedEvent<T>.setMax> IsOverlapping = new HashMap();
    FitWindowsLinearLayout<T> getMax = null;
    final T getMin;
    final getFixedWidthMinor length = new getFixedWidthMinor();
    boolean setMax = false;
    final Set<getFixedHeightMinor> setMin = new HashSet();

    class setMax {
        int getMax;
        Float getMin;
        Float length;

        private setMax() {
            this.getMax = 0;
            this.getMin = null;
            this.length = null;
        }

        /* synthetic */ setMax(onForwardedEvent onforwardedevent, byte b) {
            this();
        }
    }

    static <T> onForwardedEvent<T> getMin(T t) {
        if (t == null) {
            return null;
        }
        onForwardedEvent<T> onforwardedevent = toIntRange.get(t);
        if (onforwardedevent != null) {
            return onforwardedevent;
        }
        onForwardedEvent<T> onforwardedevent2 = new onForwardedEvent<>(t);
        toIntRange.put(t, onforwardedevent2);
        return onforwardedevent2;
    }

    private onForwardedEvent(T t) {
        this.getMin = t;
    }

    /* access modifiers changed from: package-private */
    public final onForwardedEvent<T>.setMax setMax(String str, boolean z) {
        onForwardedEvent<T>.setMax setmax = this.IsOverlapping.get(str);
        if (setmax != null || !z) {
            return setmax;
        }
        onForwardedEvent<T>.setMax setmax2 = new setMax(this, (byte) 0);
        this.IsOverlapping.put(str, setmax2);
        return setmax2;
    }

    /* access modifiers changed from: package-private */
    public final void getMax(getFixedHeightMinor getfixedheightminor) {
        for (DialogTitle next : getfixedheightminor.length(this.getMin)) {
            if (next.toDoubleRange != null) {
                if (!next.toDoubleRange.setMax(this.getMax)) {
                    getfixedheightminor.length(next.getMax, next.toIntRange);
                } else if (next.toDoubleRange.setMin() != null) {
                    next.toDoubleRange.setMin().length(this.getMin);
                }
            }
        }
        if (getfixedheightminor.getMin().isEmpty()) {
            this.setMin.remove(getfixedheightminor);
            length();
        } else if (this.setMax) {
            T t = this.getMin;
            if ((t instanceof View) && ((View) t).getLayerType() != 2) {
                ((View) this.getMin).setLayerType(2, (Paint) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void length() {
        if (this.setMin.isEmpty()) {
            toIntRange.remove(this.getMin);
            if (this.setMax) {
                T t = this.getMin;
                if (t instanceof View) {
                    ((View) t).setLayerType(0, (Paint) null);
                }
            }
        }
    }
}
