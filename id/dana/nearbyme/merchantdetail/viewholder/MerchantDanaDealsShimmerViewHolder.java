package id.dana.nearbyme.merchantdetail.viewholder;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.OptionMenuRecyclerAdapter;
import o.containsFavoriteMenuItem;
import o.onDetachedFromLayoutParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0002H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001c\u0010$\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001e\u0010'\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u00020+8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/¨\u00066"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewholder/MerchantDanaDealsShimmerViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "buyNowButton", "Landroid/widget/Button;", "getBuyNowButton", "()Landroid/widget/Button;", "setBuyNowButton", "(Landroid/widget/Button;)V", "buyNowButtonSkeleton", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getBuyNowButtonSkeleton", "()Lcom/ethanhua/skeleton/SkeletonScreen;", "setBuyNowButtonSkeleton", "(Lcom/ethanhua/skeleton/SkeletonScreen;)V", "danaDealVoucherImage", "Landroid/widget/ImageView;", "getDanaDealVoucherImage", "()Landroid/widget/ImageView;", "setDanaDealVoucherImage", "(Landroid/widget/ImageView;)V", "danaDealVoucherImageSkeleton", "getDanaDealVoucherImageSkeleton", "setDanaDealVoucherImageSkeleton", "merchantLogo", "Landroid/widget/FrameLayout;", "getMerchantLogo", "()Landroid/widget/FrameLayout;", "setMerchantLogo", "(Landroid/widget/FrameLayout;)V", "priceLabelSkeleton", "getPriceLabelSkeleton", "setPriceLabelSkeleton", "priceValueSkeleton", "getPriceValueSkeleton", "setPriceValueSkeleton", "voucherPercentageValue", "getVoucherPercentageValue", "setVoucherPercentageValue", "voucherPriceLabel", "Landroid/widget/TextView;", "getVoucherPriceLabel", "()Landroid/widget/TextView;", "setVoucherPriceLabel", "(Landroid/widget/TextView;)V", "voucherPriceValue", "getVoucherPriceValue", "setVoucherPriceValue", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantDanaDealsShimmerViewHolder extends Ignore<OptionMenuRecyclerAdapter.OptionMenuViewHolder> {
    @BindView(2131362053)
    public Button buyNowButton;
    @BindView(2131363401)
    public ImageView danaDealVoucherImage;
    @Nullable
    private onDetachedFromLayoutParams getMax;
    @Nullable
    private onDetachedFromLayoutParams getMin;
    @BindView(2131362959)
    public FrameLayout merchantLogo;
    @Nullable
    private onDetachedFromLayoutParams setMax;
    @Nullable
    private onDetachedFromLayoutParams setMin;
    @BindView(2131362970)
    public FrameLayout voucherPercentageValue;
    @BindView(2131365667)
    public TextView voucherPriceLabel;
    @BindView(2131365668)
    public TextView voucherPriceValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MerchantDanaDealsShimmerViewHolder(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.view_merchant_dana_deal_card, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    public final /* synthetic */ void setMax(Object obj) {
        FrameLayout frameLayout = this.voucherPercentageValue;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("voucherPercentageValue");
        }
        frameLayout.setVisibility(8);
        FrameLayout frameLayout2 = this.merchantLogo;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantLogo");
        }
        frameLayout2.setVisibility(8);
        ImageView imageView = this.danaDealVoucherImage;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaDealVoucherImage");
        }
        this.setMin = containsFavoriteMenuItem.getMin(imageView, R.layout.view_skeleton_voucher_image);
        Button button = this.buyNowButton;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buyNowButton");
        }
        this.setMax = containsFavoriteMenuItem.getMin(button, R.layout.view_skeleton_buy_now_button);
        TextView textView = this.voucherPriceValue;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("voucherPriceValue");
        }
        this.getMax = containsFavoriteMenuItem.getMin(textView, R.layout.view_skeleton_voucher_price_value);
        TextView textView2 = this.voucherPriceLabel;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("voucherPriceLabel");
        }
        this.getMin = containsFavoriteMenuItem.getMin(textView2, R.layout.view_skeleton_voucher_price_label);
    }
}
