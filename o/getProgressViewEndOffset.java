package o;

import android.view.View;
import id.dana.component.cellcomponent.DanaStepperView;

public final class getProgressViewEndOffset implements View.OnClickListener {
    private final DanaStepperView length;

    public getProgressViewEndOffset(DanaStepperView danaStepperView) {
        this.length = danaStepperView;
    }

    public final void onClick(View view) {
        this.length.minusCounter();
    }
}
