package o;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

public class setTint implements onInitializeAccessibilityEvent, ListMenuItemView {
    public hasText getMin = null;
    private final adjustListItemSelectionBounds length;
    getSubtitle setMax = null;
    private final Fragment setMin;

    public setTint(@NonNull Fragment fragment, @NonNull adjustListItemSelectionBounds adjustlistitemselectionbounds) {
        this.setMin = fragment;
        this.length = adjustlistitemselectionbounds;
    }

    public final void setMin() {
        if (this.getMin == null) {
            this.getMin = new hasText(this);
            this.setMax = getSubtitle.getMin((onInitializeAccessibilityEvent) this);
        }
    }

    public final boolean setMax() {
        return this.getMin != null;
    }

    public final void getMin(@NonNull Lifecycle.Event event) {
        hasText hastext = this.getMin;
        hastext.getMin("handleLifecycleEvent");
        hastext.getMax(event.getTargetState());
    }

    public final void setMin(@Nullable Bundle bundle) {
        this.setMax.getMin(bundle);
    }

    @NonNull
    public adjustListItemSelectionBounds getViewModelStore() {
        if (this.getMin == null) {
            this.getMin = new hasText(this);
            this.setMax = getSubtitle.getMin((onInitializeAccessibilityEvent) this);
        }
        return this.length;
    }

    @NonNull
    public Lifecycle getLifecycle() {
        if (this.getMin == null) {
            this.getMin = new hasText(this);
            this.setMax = getSubtitle.getMin((onInitializeAccessibilityEvent) this);
        }
        return this.getMin;
    }

    @NonNull
    public initForMode getSavedStateRegistry() {
        if (this.getMin == null) {
            this.getMin = new hasText(this);
            this.setMax = getSubtitle.getMin((onInitializeAccessibilityEvent) this);
        }
        return this.setMax.getMin;
    }
}
