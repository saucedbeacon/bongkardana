package id.dana.richview;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.boundcard.BoundCardView;
import id.dana.richview.boundcard.DanaBalanceCardView;
import id.dana.richview.boundcard.DebitCardView;
import o.drawDividersHorizontal;

public class PaymentCardsView_ViewBinding implements Unbinder {
    private PaymentCardsView setMin;

    @UiThread
    public PaymentCardsView_ViewBinding(PaymentCardsView paymentCardsView, View view) {
        this.setMin = paymentCardsView;
        paymentCardsView.bcvPaymentMethod = (BoundCardView) drawDividersHorizontal.setMin(view, R.id.f34942131361938, "field 'bcvPaymentMethod'", BoundCardView.class);
        paymentCardsView.dbvCard = (DanaBalanceCardView) drawDividersHorizontal.setMin(view, R.id.f41882131362679, "field 'dbvCard'", DanaBalanceCardView.class);
        paymentCardsView.dcvDebit = (DebitCardView) drawDividersHorizontal.setMin(view, R.id.f41962131362687, "field 'dcvDebit'", DebitCardView.class);
        paymentCardsView.llSingleCard = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53772131363933, "field 'llSingleCard'", LinearLayout.class);
        paymentCardsView.clMainParent = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39732131362453, "field 'clMainParent'", ConstraintLayout.class);
        paymentCardsView.clHighlightedCardSwapper = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39622131362442, "field 'clHighlightedCardSwapper'", ConstraintLayout.class);
        paymentCardsView.clChoosenCardSwapper = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39162131362395, "field 'clChoosenCardSwapper'", ConstraintLayout.class);
        paymentCardsView.dbvHighlightedCardSwapper = (DanaBalanceCardView) drawDividersHorizontal.setMin(view, R.id.f41902131362681, "field 'dbvHighlightedCardSwapper'", DanaBalanceCardView.class);
        paymentCardsView.dcvHighlightedCardSwapper = (DebitCardView) drawDividersHorizontal.setMin(view, R.id.f41972131362688, "field 'dcvHighlightedCardSwapper'", DebitCardView.class);
        paymentCardsView.dbvChoosenCardSwapper = (DanaBalanceCardView) drawDividersHorizontal.setMin(view, R.id.f41892131362680, "field 'dbvChoosenCardSwapper'", DanaBalanceCardView.class);
        paymentCardsView.dcvChoosenCardSwapper = (DebitCardView) drawDividersHorizontal.setMin(view, R.id.f41952131362686, "field 'dcvChoosenCardSwapper'", DebitCardView.class);
        paymentCardsView.viewDummy = drawDividersHorizontal.getMax(view, R.id.f72302131365865, "field 'viewDummy'");
    }

    @CallSuper
    public final void setMax() {
        PaymentCardsView paymentCardsView = this.setMin;
        if (paymentCardsView != null) {
            this.setMin = null;
            paymentCardsView.bcvPaymentMethod = null;
            paymentCardsView.dbvCard = null;
            paymentCardsView.dcvDebit = null;
            paymentCardsView.llSingleCard = null;
            paymentCardsView.clMainParent = null;
            paymentCardsView.clHighlightedCardSwapper = null;
            paymentCardsView.clChoosenCardSwapper = null;
            paymentCardsView.dbvHighlightedCardSwapper = null;
            paymentCardsView.dcvHighlightedCardSwapper = null;
            paymentCardsView.dbvChoosenCardSwapper = null;
            paymentCardsView.dcvChoosenCardSwapper = null;
            paymentCardsView.viewDummy = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
