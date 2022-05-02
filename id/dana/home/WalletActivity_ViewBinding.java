package id.dana.home;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.richview.PaymentCardsView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class WalletActivity_ViewBinding extends BaseActivity_ViewBinding {
    private WalletActivity length;
    private View setMin;

    @UiThread
    public WalletActivity_ViewBinding(final WalletActivity walletActivity, View view) {
        super(walletActivity, view);
        this.length = walletActivity;
        walletActivity.clListCard = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39692131362449, "field 'clListCard'", ConstraintLayout.class);
        walletActivity.pcvCards = (PaymentCardsView) drawDividersHorizontal.setMin(view, R.id.f56702131364242, "field 'pcvCards'", PaymentCardsView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f72182131365853, "method 'closeActivity'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                walletActivity.closeActivity();
            }
        });
    }

    public final void setMax() {
        WalletActivity walletActivity = this.length;
        if (walletActivity != null) {
            this.length = null;
            walletActivity.clListCard = null;
            walletActivity.pcvCards = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
