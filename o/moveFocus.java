package o;

import java.util.HashMap;
import java.util.Map;

public abstract class moveFocus {
    Map<String, getKeyboardFocusedVirtualViewId> setMax = new HashMap();

    /* access modifiers changed from: protected */
    public abstract getKeyboardFocusedVirtualViewId setMax();

    public final getKeyboardFocusedVirtualViewId length(String str) {
        getKeyboardFocusedVirtualViewId getkeyboardfocusedvirtualviewid = this.setMax.get(str);
        if (getkeyboardfocusedvirtualviewid != null) {
            return getkeyboardfocusedvirtualviewid;
        }
        getKeyboardFocusedVirtualViewId max = setMax();
        this.setMax.put(str, max);
        return max;
    }
}
