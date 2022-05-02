package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.initForMode;
import o.onInitializeAccessibilityEvent;
import o.setChecked;
import o.setItemInvoker;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements setItemInvoker {
    private final onInitializeAccessibilityEvent getMax;

    public Recreator(onInitializeAccessibilityEvent oninitializeaccessibilityevent) {
        this.getMax = oninitializeaccessibilityevent;
    }

    public final void setMax(setChecked setchecked, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            setchecked.getLifecycle().length(this);
            Bundle min = this.getMax.getSavedStateRegistry().setMin("androidx.savedstate.Restarter");
            if (min != null) {
                ArrayList<String> stringArrayList = min.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(initForMode.length.class);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((initForMode.length) declaredConstructor.newInstance(new Object[0])).getMin(this.getMax);
                                } catch (Exception e) {
                                    throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(next)), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder sb = new StringBuilder("Class");
                                sb.append(asSubclass.getSimpleName());
                                sb.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(sb.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            StringBuilder sb2 = new StringBuilder("Class ");
                            sb2.append(next);
                            sb2.append(" wasn't found");
                            throw new RuntimeException(sb2.toString(), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    public static final class getMax implements initForMode.setMax {
        public final Set<String> length = new HashSet();

        public getMax(initForMode initformode) {
            if (initformode.setMin.length("androidx.savedstate.Restarter", this) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }

        @NonNull
        public final Bundle length() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.length));
            return bundle;
        }
    }
}
