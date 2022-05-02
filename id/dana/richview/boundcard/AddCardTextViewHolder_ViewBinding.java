package id.dana.richview.boundcard;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class AddCardTextViewHolder_ViewBinding implements Unbinder {
    private AddCardTextViewHolder getMax;

    @UiThread
    public AddCardTextViewHolder_ViewBinding(AddCardTextViewHolder addCardTextViewHolder, View view) {
        this.getMax = addCardTextViewHolder;
        addCardTextViewHolder.llCardAdd = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f52922131363848, "field 'llCardAdd'", LinearLayout.class);
        addCardTextViewHolder.tvAddCard = (TextView) drawDividersHorizontal.setMin(view, R.id.f64592131365084, "field 'tvAddCard'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        AddCardTextViewHolder addCardTextViewHolder = this.getMax;
        if (addCardTextViewHolder != null) {
            this.getMax = null;
            addCardTextViewHolder.llCardAdd = null;
            addCardTextViewHolder.tvAddCard = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
