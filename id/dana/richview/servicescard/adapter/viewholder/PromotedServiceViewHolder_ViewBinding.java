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

public class PromotedServiceViewHolder_ViewBinding implements Unbinder {
    private PromotedServiceViewHolder getMax;

    @UiThread
    public PromotedServiceViewHolder_ViewBinding(PromotedServiceViewHolder promotedServiceViewHolder, View view) {
        this.getMax = promotedServiceViewHolder;
        promotedServiceViewHolder.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f68462131365473, "field 'tvDescription'", TextView.class);
        promotedServiceViewHolder.ivPromotedService = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50352131363590, "field 'ivPromotedService'", ImageView.class);
        promotedServiceViewHolder.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f68452131365472, "field 'tvTitle'", TextView.class);
        promotedServiceViewHolder.btnAction = (Button) drawDividersHorizontal.setMin(view, R.id.f36792131362131, "field 'btnAction'", Button.class);
    }

    @CallSuper
    public final void setMax() {
        PromotedServiceViewHolder promotedServiceViewHolder = this.getMax;
        if (promotedServiceViewHolder != null) {
            this.getMax = null;
            promotedServiceViewHolder.tvDescription = null;
            promotedServiceViewHolder.ivPromotedService = null;
            promotedServiceViewHolder.tvTitle = null;
            promotedServiceViewHolder.btnAction = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
