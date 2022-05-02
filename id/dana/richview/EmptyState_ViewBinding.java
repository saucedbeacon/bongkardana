package id.dana.richview;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class EmptyState_ViewBinding implements Unbinder {
    private EmptyState getMax;

    @UiThread
    public EmptyState_ViewBinding(EmptyState emptyState, View view) {
        this.getMax = emptyState;
        emptyState.btnAction = (Button) drawDividersHorizontal.setMin(view, R.id.f35942131362040, "field 'btnAction'", Button.class);
        emptyState.ivEmptyState = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49372131363492, "field 'ivEmptyState'", ImageView.class);
        emptyState.tvMessage = (TextView) drawDividersHorizontal.setMin(view, R.id.f67302131365357, "field 'tvMessage'", TextView.class);
        emptyState.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69852131365614, "field 'tvTitle'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        EmptyState emptyState = this.getMax;
        if (emptyState != null) {
            this.getMax = null;
            emptyState.btnAction = null;
            emptyState.ivEmptyState = null;
            emptyState.tvMessage = null;
            emptyState.tvTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
