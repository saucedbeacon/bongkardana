package o;

import android.view.MotionEvent;
import android.view.View;
import id.dana.component.edittextcomponent.DanaEditTextView;

public final class setSize implements View.OnTouchListener {
    private final DanaEditTextView setMax;

    public setSize(DanaEditTextView danaEditTextView) {
        this.setMax = danaEditTextView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.setMax.setMin(motionEvent);
    }
}
