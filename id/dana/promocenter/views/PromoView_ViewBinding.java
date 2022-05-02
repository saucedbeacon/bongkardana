package id.dana.promocenter.views;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import o.drawDividersHorizontal;

public class PromoView_ViewBinding implements Unbinder {
    private PromoView length;

    @UiThread
    public PromoView_ViewBinding(PromoView promoView, View view) {
        this.length = promoView;
        promoView.btnFirstPromoAction = (DanaButtonSecondaryView) drawDividersHorizontal.setMin(view, R.id.f36322131362082, "field 'btnFirstPromoAction'", DanaButtonSecondaryView.class);
        promoView.btnSecondPromoAction = (DanaButtonPrimaryView) drawDividersHorizontal.setMin(view, R.id.f36752131362127, "field 'btnSecondPromoAction'", DanaButtonPrimaryView.class);
        promoView.ivHotPromoRibbon = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49232131363478, "field 'ivHotPromoRibbon'", ImageView.class);
        promoView.ivPromoBanner = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50322131363587, "field 'ivPromoBanner'", ImageView.class);
        promoView.tvPromoExpiryDate = (TextView) drawDividersHorizontal.setMin(view, R.id.f68392131365466, "field 'tvPromoExpiryDate'", TextView.class);
        promoView.tvPromoTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f68442131365471, "field 'tvPromoTitle'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        PromoView promoView = this.length;
        if (promoView != null) {
            this.length = null;
            promoView.btnFirstPromoAction = null;
            promoView.btnSecondPromoAction = null;
            promoView.ivHotPromoRibbon = null;
            promoView.ivPromoBanner = null;
            promoView.tvPromoExpiryDate = null;
            promoView.tvPromoTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
