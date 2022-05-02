package id.dana.richview.servicescard.adapter.viewholder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class NewPromotedServiceViewHolder_ViewBinding implements Unbinder {
    private NewPromotedServiceViewHolder setMin;

    @UiThread
    public NewPromotedServiceViewHolder_ViewBinding(NewPromotedServiceViewHolder newPromotedServiceViewHolder, View view) {
        this.setMin = newPromotedServiceViewHolder;
        newPromotedServiceViewHolder.btnAction = (Button) drawDividersHorizontal.setMin(view, R.id.f36792131362131, "field 'btnAction'", Button.class);
        newPromotedServiceViewHolder.ivPromotedService = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50352131363590, "field 'ivPromotedService'", ImageView.class);
        newPromotedServiceViewHolder.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f68462131365473, "field 'tvDescription'", TextView.class);
        newPromotedServiceViewHolder.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f68452131365472, "field 'tvTitle'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        NewPromotedServiceViewHolder newPromotedServiceViewHolder = this.setMin;
        if (newPromotedServiceViewHolder != null) {
            this.setMin = null;
            newPromotedServiceViewHolder.btnAction = null;
            newPromotedServiceViewHolder.ivPromotedService = null;
            newPromotedServiceViewHolder.tvDescription = null;
            newPromotedServiceViewHolder.tvTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
