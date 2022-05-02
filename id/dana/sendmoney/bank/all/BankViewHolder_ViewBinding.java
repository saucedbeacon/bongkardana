package id.dana.sendmoney.bank.all;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatImageView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class BankViewHolder_ViewBinding implements Unbinder {
    private BankViewHolder length;

    @UiThread
    public BankViewHolder_ViewBinding(BankViewHolder bankViewHolder, View view) {
        this.length = bankViewHolder;
        bankViewHolder.ivLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49642131363519, "field 'ivLogo'", ImageView.class);
        bankViewHolder.tvPrefixDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f68232131365450, "field 'tvPrefixDescription'", TextView.class);
        bankViewHolder.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
        bankViewHolder.tvViewDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvViewDescription'", TextView.class);
        bankViewHolder.ivChangeIcon = (AppCompatImageView) drawDividersHorizontal.setMin(view, R.id.f48242131363378, "field 'ivChangeIcon'", AppCompatImageView.class);
        bankViewHolder.vDividerFull = drawDividersHorizontal.getMax(view, R.id.f72262131365861, "field 'vDividerFull'");
        bankViewHolder.vDividerWithMargin = drawDividersHorizontal.getMax(view, R.id.f72292131365864, "field 'vDividerWithMargin'");
    }

    @CallSuper
    public final void setMax() {
        BankViewHolder bankViewHolder = this.length;
        if (bankViewHolder != null) {
            this.length = null;
            bankViewHolder.ivLogo = null;
            bankViewHolder.tvPrefixDescription = null;
            bankViewHolder.tvTitle = null;
            bankViewHolder.tvViewDescription = null;
            bankViewHolder.ivChangeIcon = null;
            bankViewHolder.vDividerFull = null;
            bankViewHolder.vDividerWithMargin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
