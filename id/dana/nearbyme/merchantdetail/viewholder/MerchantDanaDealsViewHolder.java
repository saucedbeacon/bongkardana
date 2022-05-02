package id.dana.nearbyme.merchantdetail.viewholder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.home.RoundedCornersTransformation;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.OptionMenuRecyclerAdapter;
import o.SettingMenu;
import o.dispatchApplyWindowInsetsToBehaviors;
import o.getTopSortedChildren;
import o.setFirstVerticalBias;
import o.updatePostLayout;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0012\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u000200H\u0002J\u0010\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u000200H\u0002J\u0010\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0002H\u0002R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001e\u0010#\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001e\u0010&\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR\u001e\u0010)\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001f¨\u0006:"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewholder/MerchantDanaDealsViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "parent", "Landroid/view/ViewGroup;", "onClick", "Lkotlin/Function1;", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "buyNowButton", "Landroid/widget/Button;", "getBuyNowButton", "()Landroid/widget/Button;", "setBuyNowButton", "(Landroid/widget/Button;)V", "danaDealVoucherImage", "Landroid/widget/ImageView;", "getDanaDealVoucherImage", "()Landroid/widget/ImageView;", "setDanaDealVoucherImage", "(Landroid/widget/ImageView;)V", "merchantLogo", "getMerchantLogo", "setMerchantLogo", "getParent", "()Landroid/view/ViewGroup;", "voucherDescription", "Landroid/widget/TextView;", "getVoucherDescription", "()Landroid/widget/TextView;", "setVoucherDescription", "(Landroid/widget/TextView;)V", "voucherPercentageValue", "getVoucherPercentageValue", "setVoucherPercentageValue", "voucherPrice", "getVoucherPrice", "setVoucherPrice", "voucherPriceValue", "getVoucherPriceValue", "setVoucherPriceValue", "voucherTitle", "getVoucherTitle", "setVoucherTitle", "bindData", "data", "setupDanaDealVoucherImage", "voucherBackgroundImageUrl", "", "setupMerchantLogo", "merchantLogoUrl", "setupMerchantSavingRateText", "voucherPercentageValueText", "setupMerchantVoucherValueText", "voucherInfo", "Lid/dana/nearbyme/merchantdetail/model/MerchantVoucherInfoModel;", "setupOnBuyButtonClick", "productInfo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantDanaDealsViewHolder extends Ignore<OptionMenuRecyclerAdapter.OptionMenuViewHolder> {
    @BindView(2131362053)
    public Button buyNowButton;
    @BindView(2131363401)
    public ImageView danaDealVoucherImage;
    /* access modifiers changed from: private */
    public final Function1<OptionMenuRecyclerAdapter.OptionMenuViewHolder, Unit> getMin;
    @BindView(2131363528)
    public ImageView merchantLogo;
    @NotNull
    private final ViewGroup setMax;
    @BindView(2131365664)
    public TextView voucherDescription;
    @BindView(2131365665)
    public TextView voucherPercentageValue;
    @BindView(2131365666)
    public TextView voucherPrice;
    @BindView(2131365668)
    public TextView voucherPriceValue;
    @BindView(2131365669)
    public TextView voucherTitle;

    public final /* synthetic */ void setMax(Object obj) {
        CharSequence charSequence;
        OptionMenuRecyclerAdapter.OptionMenuViewHolder optionMenuViewHolder = (OptionMenuRecyclerAdapter.OptionMenuViewHolder) obj;
        if (optionMenuViewHolder != null) {
            TextView textView = this.voucherPriceValue;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("voucherPriceValue");
            }
            MoneyViewModel moneyViewModel = optionMenuViewHolder.isInside.toFloatRange;
            StringBuilder sb = new StringBuilder();
            sb.append(moneyViewModel.getMin);
            sb.append(moneyViewModel.setMin);
            textView.setText(sb.toString());
            TextView textView2 = this.voucherTitle;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("voucherTitle");
            }
            textView2.setText(optionMenuViewHolder.setMax);
            TextView textView3 = this.voucherDescription;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("voucherDescription");
            }
            textView3.setText(optionMenuViewHolder.isInside.setMin);
            setFirstVerticalBias<Bitmap> min = Glide.getMax(this.length).length().getMax(optionMenuViewHolder.isInside.getMin).getMin((getTopSortedChildren<?>) new dispatchApplyWindowInsetsToBehaviors().length((updatePostLayout<Bitmap>[]) new updatePostLayout[]{new RoundedCornersTransformation(8, 0, RoundedCornersTransformation.CornerType.TOP)}));
            ImageView imageView = this.danaDealVoucherImage;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("danaDealVoucherImage");
            }
            min.length(imageView);
            Button button = this.buyNowButton;
            if (button == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buyNowButton");
            }
            button.setOnClickListener(new setMax(this, optionMenuViewHolder));
            setFirstVerticalBias<Drawable> max = Glide.getMax(this.length).getMax(optionMenuViewHolder.isInside.length);
            ImageView imageView2 = this.merchantLogo;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantLogo");
            }
            max.length(imageView2);
            String valueOf = String.valueOf((int) optionMenuViewHolder.equals);
            TextView textView4 = this.voucherPercentageValue;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("voucherPercentageValue");
            }
            Context context = this.length;
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            textView4.setText(context.getResources().getString(R.string.nearby_dana_deals_save_up_to, new Object[]{valueOf}));
            SettingMenu settingMenu = optionMenuViewHolder.isInside;
            TextView textView5 = this.voucherPrice;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("voucherPrice");
            }
            if (settingMenu.isInside.length() > 0) {
                Context context2 = this.length;
                Intrinsics.checkNotNullExpressionValue(context2, HummerConstants.CONTEXT);
                charSequence = context2.getResources().getString(R.string.nearby_dana_deals_voucher_price_percent, new Object[]{Integer.valueOf((int) (Double.parseDouble(settingMenu.isInside) * 100.0d))});
            } else {
                MoneyViewModel moneyViewModel2 = settingMenu.toIntRange;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(moneyViewModel2.getMin);
                sb2.append(moneyViewModel2.setMin);
                charSequence = sb2.toString();
            }
            textView5.setText(charSequence);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MerchantDanaDealsViewHolder(@NotNull ViewGroup viewGroup, @NotNull Function1<? super OptionMenuRecyclerAdapter.OptionMenuViewHolder, Unit> function1) {
        super(viewGroup.getContext(), R.layout.view_merchant_dana_deal_card, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(function1, "onClick");
        this.setMax = viewGroup;
        this.getMin = function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ OptionMenuRecyclerAdapter.OptionMenuViewHolder setMax;
        final /* synthetic */ MerchantDanaDealsViewHolder setMin;

        setMax(MerchantDanaDealsViewHolder merchantDanaDealsViewHolder, OptionMenuRecyclerAdapter.OptionMenuViewHolder optionMenuViewHolder) {
            this.setMin = merchantDanaDealsViewHolder;
            this.setMax = optionMenuViewHolder;
        }

        public final void onClick(View view) {
            this.setMin.getMin.invoke(this.setMax);
        }
    }
}
