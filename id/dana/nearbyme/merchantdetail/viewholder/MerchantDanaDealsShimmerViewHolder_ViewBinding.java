package id.dana.nearbyme.merchantdetail.viewholder;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public final class MerchantDanaDealsShimmerViewHolder_ViewBinding implements Unbinder {
    private MerchantDanaDealsShimmerViewHolder length;

    @UiThread
    public MerchantDanaDealsShimmerViewHolder_ViewBinding(MerchantDanaDealsShimmerViewHolder merchantDanaDealsShimmerViewHolder, View view) {
        this.length = merchantDanaDealsShimmerViewHolder;
        merchantDanaDealsShimmerViewHolder.voucherPercentageValue = (FrameLayout) drawDividersHorizontal.setMin(view, R.id.f44452131362970, "field 'voucherPercentageValue'", FrameLayout.class);
        merchantDanaDealsShimmerViewHolder.merchantLogo = (FrameLayout) drawDividersHorizontal.setMin(view, R.id.f44342131362959, "field 'merchantLogo'", FrameLayout.class);
        merchantDanaDealsShimmerViewHolder.voucherPriceValue = (TextView) drawDividersHorizontal.setMin(view, R.id.f70382131365668, "field 'voucherPriceValue'", TextView.class);
        merchantDanaDealsShimmerViewHolder.voucherPriceLabel = (TextView) drawDividersHorizontal.setMin(view, R.id.f70372131365667, "field 'voucherPriceLabel'", TextView.class);
        merchantDanaDealsShimmerViewHolder.danaDealVoucherImage = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48472131363401, "field 'danaDealVoucherImage'", ImageView.class);
        merchantDanaDealsShimmerViewHolder.buyNowButton = (Button) drawDividersHorizontal.setMin(view, R.id.f36072131362053, "field 'buyNowButton'", Button.class);
    }

    public final void setMax() {
        MerchantDanaDealsShimmerViewHolder merchantDanaDealsShimmerViewHolder = this.length;
        if (merchantDanaDealsShimmerViewHolder != null) {
            this.length = null;
            merchantDanaDealsShimmerViewHolder.voucherPercentageValue = null;
            merchantDanaDealsShimmerViewHolder.merchantLogo = null;
            merchantDanaDealsShimmerViewHolder.voucherPriceValue = null;
            merchantDanaDealsShimmerViewHolder.voucherPriceLabel = null;
            merchantDanaDealsShimmerViewHolder.danaDealVoucherImage = null;
            merchantDanaDealsShimmerViewHolder.buyNowButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
