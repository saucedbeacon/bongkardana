package id.dana.richview.boundcard;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class AddCardViewHolder_ViewBinding implements Unbinder {
    private AddCardViewHolder setMin;

    @UiThread
    public AddCardViewHolder_ViewBinding(AddCardViewHolder addCardViewHolder, View view) {
        this.setMin = addCardViewHolder;
        addCardViewHolder.addCardContainer = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f37482131362203, "field 'addCardContainer'", ConstraintLayout.class);
        addCardViewHolder.cardView = (ImageView) drawDividersHorizontal.setMin(view, R.id.f41792131362669, "field 'cardView'", ImageView.class);
    }

    @CallSuper
    public final void setMax() {
        AddCardViewHolder addCardViewHolder = this.setMin;
        if (addCardViewHolder != null) {
            this.setMin = null;
            addCardViewHolder.addCardContainer = null;
            addCardViewHolder.cardView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
