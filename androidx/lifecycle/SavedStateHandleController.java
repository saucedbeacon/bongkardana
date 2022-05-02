package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import java.util.HashSet;
import o.ListMenuItemView;
import o.adjustListItemSelectionBounds;
import o.initForMode;
import o.onInitializeAccessibilityEvent;
import o.onItemClick;
import o.setChecked;
import o.setGroupDividerEnabled;
import o.setPopupCallback;

public final class SavedStateHandleController implements setPopupCallback {
    public final onItemClick getMax;
    private boolean getMin = false;
    private final String setMin;

    private SavedStateHandleController(String str, onItemClick onitemclick) {
        this.setMin = str;
        this.getMax = onitemclick;
    }

    private boolean getMax() {
        return this.getMin;
    }

    private void setMax(initForMode initformode, Lifecycle lifecycle) {
        if (!this.getMin) {
            this.getMin = true;
            lifecycle.setMax(this);
            if (initformode.setMin.length(this.setMin, this.getMax.getMax) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public final void setMax(@NonNull setChecked setchecked, @NonNull Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.getMin = false;
            setchecked.getLifecycle().length(this);
        }
    }

    public static SavedStateHandleController getMax(initForMode initformode, Lifecycle lifecycle, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, onItemClick.setMin(initformode.setMin(str), bundle));
        savedStateHandleController.setMax(initformode, lifecycle);
        setMin(initformode, lifecycle);
        return savedStateHandleController;
    }

    static final class setMax implements initForMode.length {
        setMax() {
        }

        public final void getMin(@NonNull onInitializeAccessibilityEvent oninitializeaccessibilityevent) {
            if (oninitializeaccessibilityevent instanceof ListMenuItemView) {
                adjustListItemSelectionBounds viewModelStore = ((ListMenuItemView) oninitializeaccessibilityevent).getViewModelStore();
                initForMode savedStateRegistry = oninitializeaccessibilityevent.getSavedStateRegistry();
                for (String str : new HashSet(viewModelStore.getMax.keySet())) {
                    SavedStateHandleController.length(viewModelStore.getMax.get(str), savedStateRegistry, oninitializeaccessibilityevent.getLifecycle());
                }
                if (!new HashSet(viewModelStore.getMax.keySet()).isEmpty()) {
                    savedStateRegistry.setMin((Class<? extends initForMode.length>) setMax.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public static void length(setGroupDividerEnabled setgroupdividerenabled, initForMode initformode, Lifecycle lifecycle) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) setgroupdividerenabled.getMax("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.getMax()) {
            savedStateHandleController.setMax(initformode, lifecycle);
            setMin(initformode, lifecycle);
        }
    }

    private static void setMin(final initForMode initformode, final Lifecycle lifecycle) {
        Lifecycle.State length = lifecycle.length();
        if (length == Lifecycle.State.INITIALIZED || length.isAtLeast(Lifecycle.State.STARTED)) {
            initformode.setMin((Class<? extends initForMode.length>) setMax.class);
        } else {
            lifecycle.setMax(new setPopupCallback() {
                public void setMax(@NonNull setChecked setchecked, @NonNull Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        Lifecycle.this.length(this);
                        initformode.setMin((Class<? extends initForMode.length>) setMax.class);
                    }
                }
            });
        }
    }
}
