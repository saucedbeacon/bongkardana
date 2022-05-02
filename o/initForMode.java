package o;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$1;
import java.util.Map;
import o.stop;

@SuppressLint({"RestrictedApi"})
public final class initForMode {
    @Nullable
    private Bundle getMax;
    private Recreator.getMax getMin;
    private boolean length;
    public boolean setMax = true;
    public stop<String, setMax> setMin = new stop<>();

    public interface length {
        void getMin(@NonNull onInitializeAccessibilityEvent oninitializeaccessibilityevent);
    }

    public interface setMax {
        @NonNull
        Bundle length();
    }

    initForMode() {
    }

    @MainThread
    @Nullable
    public final Bundle setMin(@NonNull String str) {
        if (this.length) {
            Bundle bundle = this.getMax;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.getMax.remove(str);
            if (this.getMax.isEmpty()) {
                this.getMax = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    @MainThread
    public final void setMin(@NonNull Class<? extends length> cls) {
        if (this.setMax) {
            if (this.getMin == null) {
                this.getMin = new Recreator.getMax(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.getMax getmax = this.getMin;
                getmax.length.add(cls.getName());
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder("Class");
                sb.append(cls.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* access modifiers changed from: package-private */
    @MainThread
    public final void setMin(@NonNull Lifecycle lifecycle, @Nullable Bundle bundle) {
        if (!this.length) {
            if (bundle != null) {
                this.getMax = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            lifecycle.setMax(new SavedStateRegistry$1(this));
            this.length = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    @MainThread
    public final void setMin(@NonNull Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.getMax;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        stop<String, setMax> stop = this.setMin;
        stop.setMin setmin = new stop.setMin();
        stop.getMin.put(setmin, Boolean.FALSE);
        while (setmin.hasNext()) {
            Map.Entry entry = (Map.Entry) setmin.next();
            bundle2.putBundle((String) entry.getKey(), ((setMax) entry.getValue()).length());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
