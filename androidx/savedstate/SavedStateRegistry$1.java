package androidx.savedstate;

import androidx.lifecycle.Lifecycle;
import o.initForMode;
import o.setChecked;
import o.setItemInvoker;

public class SavedStateRegistry$1 implements setItemInvoker {
    final /* synthetic */ initForMode setMax;

    public SavedStateRegistry$1(initForMode initformode) {
        this.setMax = initformode;
    }

    public void setMax(setChecked setchecked, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            this.setMax.setMax = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            this.setMax.setMax = false;
        }
    }
}
