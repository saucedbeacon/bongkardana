package id.dana.pay;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.pay.view.BasePayView;
import o.drawDividersHorizontal;

public class BasePayFragment_ViewBinding implements Unbinder {
    private BasePayFragment setMin;

    @UiThread
    public BasePayFragment_ViewBinding(BasePayFragment basePayFragment, View view) {
        this.setMin = basePayFragment;
        basePayFragment.qrBarcodePayView = (BasePayView) drawDividersHorizontal.length(view, R.id.f56562131364227, "field 'qrBarcodePayView'", BasePayView.class);
        basePayFragment.cardBackground = (ImageView) drawDividersHorizontal.length(view, R.id.f37492131362204, "field 'cardBackground'", ImageView.class);
        basePayFragment.cardSchemeLogo = (ImageView) drawDividersHorizontal.length(view, R.id.iv_card_scheme_logo, "field 'cardSchemeLogo'", ImageView.class);
        basePayFragment.ivExpressPay = (ImageView) drawDividersHorizontal.length(view, R.id.f48812131363436, "field 'ivExpressPay'", ImageView.class);
        basePayFragment.payContent = (TextView) drawDividersHorizontal.length(view, R.id.pay_content, "field 'payContent'", TextView.class);
        basePayFragment.payContentIdentifier = (TextView) drawDividersHorizontal.length(view, R.id.f56492131364220, "field 'payContentIdentifier'", TextView.class);
        basePayFragment.payId = (TextView) drawDividersHorizontal.length(view, R.id.f56502131364221, "field 'payId'", TextView.class);
        basePayFragment.payLogo = (ImageView) drawDividersHorizontal.length(view, R.id.f56512131364222, "field 'payLogo'", ImageView.class);
        basePayFragment.payTitle = (TextView) drawDividersHorizontal.length(view, R.id.f56582131364229, "field 'payTitle'", TextView.class);
        basePayFragment.preferredText = (TextView) drawDividersHorizontal.length(view, R.id.f68212131365448, "field 'preferredText'", TextView.class);
        basePayFragment.scanInfoText = (TextView) drawDividersHorizontal.length(view, R.id.f69072131365534, "field 'scanInfoText'", TextView.class);
    }

    @CallSuper
    public void setMax() {
        BasePayFragment basePayFragment = this.setMin;
        if (basePayFragment != null) {
            this.setMin = null;
            basePayFragment.qrBarcodePayView = null;
            basePayFragment.cardBackground = null;
            basePayFragment.cardSchemeLogo = null;
            basePayFragment.ivExpressPay = null;
            basePayFragment.payContent = null;
            basePayFragment.payContentIdentifier = null;
            basePayFragment.payId = null;
            basePayFragment.payLogo = null;
            basePayFragment.payTitle = null;
            basePayFragment.preferredText = null;
            basePayFragment.scanInfoText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
