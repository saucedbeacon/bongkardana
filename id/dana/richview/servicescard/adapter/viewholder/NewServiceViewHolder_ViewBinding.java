package id.dana.richview.servicescard.adapter.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class NewServiceViewHolder_ViewBinding implements Unbinder {
    private NewServiceViewHolder getMax;

    @UiThread
    public NewServiceViewHolder_ViewBinding(NewServiceViewHolder newServiceViewHolder, View view) {
        this.getMax = newServiceViewHolder;
        newServiceViewHolder.badgesText = (TextView) drawDividersHorizontal.setMin(view, R.id.f41352131362622, "field 'badgesText'", TextView.class);
        newServiceViewHolder.ivIcon = (ImageView) drawDividersHorizontal.setMin(view, R.id.f41342131362621, "field 'ivIcon'", ImageView.class);
        newServiceViewHolder.ivRedDot = (ImageView) drawDividersHorizontal.setMin(view, R.id.f41362131362623, "field 'ivRedDot'", ImageView.class);
        newServiceViewHolder.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f41372131362624, "field 'tvTitle'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        NewServiceViewHolder newServiceViewHolder = this.getMax;
        if (newServiceViewHolder != null) {
            this.getMax = null;
            newServiceViewHolder.badgesText = null;
            newServiceViewHolder.ivIcon = null;
            newServiceViewHolder.ivRedDot = null;
            newServiceViewHolder.tvTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
