package id.dana.richview.boundcard;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class DebitCardView_ViewBinding implements Unbinder {
    private DebitCardView setMin;

    @UiThread
    public DebitCardView_ViewBinding(DebitCardView debitCardView, View view) {
        this.setMin = debitCardView;
        debitCardView.ivChannel = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48252131363379, "field 'ivChannel'", ImageView.class);
        debitCardView.llDebitCardBackground = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53042131363860, "field 'llDebitCardBackground'", LinearLayout.class);
        debitCardView.clDebitCard = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39362131362415, "field 'clDebitCard'", ConstraintLayout.class);
        debitCardView.clGnDebitCard = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39372131362416, "field 'clGnDebitCard'", ConstraintLayout.class);
        debitCardView.clGnDebitCardBackground = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39382131362417, "field 'clGnDebitCardBackground'", ConstraintLayout.class);
        debitCardView.ivCardLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48192131363372, "field 'ivCardLogo'", ImageView.class);
        debitCardView.ivExpressPay = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48812131363436, "field 'ivExpressPay'", ImageView.class);
        debitCardView.tvMaskNumber = (TextView) drawDividersHorizontal.setMin(view, R.id.f67112131365338, "field 'tvMaskNumber'", TextView.class);
        debitCardView.tvPreferred = (TextView) drawDividersHorizontal.setMin(view, R.id.f68212131365448, "field 'tvPreferred'", TextView.class);
        debitCardView.tvUpdateCard = (TextView) drawDividersHorizontal.setMin(view, R.id.f70252131365655, "field 'tvUpdateCard'", TextView.class);
        debitCardView.tvValidThru = (TextView) drawDividersHorizontal.setMin(view, R.id.f70292131365659, "field 'tvValidThru'", TextView.class);
        debitCardView.tvDebit = (TextView) drawDividersHorizontal.setMin(view, R.id.f69782131365605, "field 'tvDebit'", TextView.class);
        debitCardView.tvValidThruLabel = (TextView) drawDividersHorizontal.setMin(view, R.id.f70302131365660, "field 'tvValidThruLabel'", TextView.class);
        debitCardView.tvTitleCardGn = (TextView) drawDividersHorizontal.setMin(view, R.id.f69792131365606, "field 'tvTitleCardGn'", TextView.class);
        debitCardView.ivChannelGn = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48262131363380, "field 'ivChannelGn'", ImageView.class);
        debitCardView.tvMaskNumberGn = (TextView) drawDividersHorizontal.setMin(view, R.id.f67122131365339, "field 'tvMaskNumberGn'", TextView.class);
        debitCardView.ivCardLogoGn = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48202131363373, "field 'ivCardLogoGn'", ImageView.class);
        debitCardView.tvReferenceGn = (TextView) drawDividersHorizontal.setMin(view, R.id.f68702131365497, "field 'tvReferenceGn'", TextView.class);
        debitCardView.tvFromCurrencyGnSymbol = (TextView) drawDividersHorizontal.setMin(view, R.id.f66402131365267, "field 'tvFromCurrencyGnSymbol'", TextView.class);
        debitCardView.tvFromCurrencyGn = (TextView) drawDividersHorizontal.setMin(view, R.id.f66392131365266, "field 'tvFromCurrencyGn'", TextView.class);
        debitCardView.tvRightArrowGn = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50622131363617, "field 'tvRightArrowGn'", ImageView.class);
        debitCardView.tvRpCurrencyGn = (TextView) drawDividersHorizontal.setMin(view, R.id.f69982131365628, "field 'tvRpCurrencyGn'", TextView.class);
        debitCardView.tvToCurrencyGn = (TextView) drawDividersHorizontal.setMin(view, R.id.f70062131365636, "field 'tvToCurrencyGn'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        DebitCardView debitCardView = this.setMin;
        if (debitCardView != null) {
            this.setMin = null;
            debitCardView.ivChannel = null;
            debitCardView.llDebitCardBackground = null;
            debitCardView.clDebitCard = null;
            debitCardView.clGnDebitCard = null;
            debitCardView.clGnDebitCardBackground = null;
            debitCardView.ivCardLogo = null;
            debitCardView.ivExpressPay = null;
            debitCardView.tvMaskNumber = null;
            debitCardView.tvPreferred = null;
            debitCardView.tvUpdateCard = null;
            debitCardView.tvValidThru = null;
            debitCardView.tvDebit = null;
            debitCardView.tvValidThruLabel = null;
            debitCardView.tvTitleCardGn = null;
            debitCardView.ivChannelGn = null;
            debitCardView.tvMaskNumberGn = null;
            debitCardView.ivCardLogoGn = null;
            debitCardView.tvReferenceGn = null;
            debitCardView.tvFromCurrencyGnSymbol = null;
            debitCardView.tvFromCurrencyGn = null;
            debitCardView.tvRightArrowGn = null;
            debitCardView.tvRpCurrencyGn = null;
            debitCardView.tvToCurrencyGn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
