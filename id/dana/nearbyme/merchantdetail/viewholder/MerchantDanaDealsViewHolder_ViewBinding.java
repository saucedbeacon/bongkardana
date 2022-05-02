package id.dana.nearbyme.merchantdetail.viewholder;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public final class MerchantDanaDealsViewHolder_ViewBinding implements Unbinder {
    private MerchantDanaDealsViewHolder length;

    @UiThread
    public MerchantDanaDealsViewHolder_ViewBinding(MerchantDanaDealsViewHolder merchantDanaDealsViewHolder, View view) {
        this.length = merchantDanaDealsViewHolder;
        merchantDanaDealsViewHolder.voucherPercentageValue = (TextView) drawDividersHorizontal.setMin(view, R.id.f70352131365665, "field 'voucherPercentageValue'", TextView.class);
        merchantDanaDealsViewHolder.merchantLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49732131363528, "field 'merchantLogo'", ImageView.class);
        merchantDanaDealsViewHolder.voucherPriceValue = (TextView) drawDividersHorizontal.setMin(view, R.id.f70382131365668, "field 'voucherPriceValue'", TextView.class);
        merchantDanaDealsViewHolder.danaDealVoucherImage = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48472131363401, "field 'danaDealVoucherImage'", ImageView.class);
        merchantDanaDealsViewHolder.buyNowButton = (Button) drawDividersHorizontal.setMin(view, R.id.f36072131362053, "field 'buyNowButton'", Button.class);
        merchantDanaDealsViewHolder.voucherTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f70392131365669, "field 'voucherTitle'", TextView.class);
        merchantDanaDealsViewHolder.voucherPrice = (TextView) drawDividersHorizontal.setMin(view, R.id.f70362131365666, "field 'voucherPrice'", TextView.class);
        merchantDanaDealsViewHolder.voucherDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f70342131365664, "field 'voucherDescription'", TextView.class);
    }

    public final void setMax() {
        MerchantDanaDealsViewHolder merchantDanaDealsViewHolder = this.length;
        if (merchantDanaDealsViewHolder != null) {
            this.length = null;
            merchantDanaDealsViewHolder.voucherPercentageValue = null;
            merchantDanaDealsViewHolder.merchantLogo = null;
            merchantDanaDealsViewHolder.voucherPriceValue = null;
            merchantDanaDealsViewHolder.danaDealVoucherImage = null;
            merchantDanaDealsViewHolder.buyNowButton = null;
            merchantDanaDealsViewHolder.voucherTitle = null;
            merchantDanaDealsViewHolder.voucherPrice = null;
            merchantDanaDealsViewHolder.voucherDescription = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
