package id.dana.nearbyme.merchantdetail.viewcomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.danah5.DanaH5;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.SettingMenu;
import o.containsFavoriteMenuItem;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantDanaDealsCardView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "Lid/dana/nearbyme/merchantdetail/model/MerchantVoucherInfoModel;", "merchantVoucherInfo", "getMerchantVoucherInfo", "()Lid/dana/nearbyme/merchantdetail/model/MerchantVoucherInfoModel;", "setMerchantVoucherInfo", "(Lid/dana/nearbyme/merchantdetail/model/MerchantVoucherInfoModel;)V", "getLayout", "", "setup", "", "setupButtonOnClick", "voucherValue", "", "setupDanaDealVoucherImage", "voucherBackgroundImageUrl", "setupMerchantLogo", "merchantLogoUrl", "setupMerchantVoucherInfo", "setupMerchantVoucherValueText", "voucherPercentageValueText", "showShimmer", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantDanaDealsCardView extends BaseRichView {
    private HashMap getMin;
    @Nullable
    private SettingMenu length;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1238499673, oncanceled);
            onCancelLoad.getMin(-1238499673, oncanceled);
        }
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_dana_deal_card;
    }

    public final void setup() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MerchantDanaDealsCardView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
    }

    @Nullable
    public final SettingMenu getMerchantVoucherInfo() {
        return this.length;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ String setMax;

        length(String str) {
            this.setMax = str;
        }

        public final void onClick(View view) {
            DanaH5.startContainerFullUrl(this.setMax);
        }
    }

    public final void setMerchantVoucherInfo(@Nullable SettingMenu settingMenu) {
        int i;
        if (settingMenu != null) {
            if (settingMenu.setMin()) {
                containsFavoriteMenuItem.getMin((ImageView) _$_findCachedViewById(resetInternal.setMax.createTextView), R.layout.view_skeleton_voucher_image);
                containsFavoriteMenuItem.getMin((Button) _$_findCachedViewById(resetInternal.setMax.ITrustedWebActivityCallback$Stub$Proxy), R.layout.view_skeleton_buy_now_button);
                containsFavoriteMenuItem.getMin((TextView) _$_findCachedViewById(resetInternal.setMax.TrustedWebActivityServiceConnection$1), R.layout.view_skeleton_voucher_price_value);
                containsFavoriteMenuItem.getMin((TextView) _$_findCachedViewById(resetInternal.setMax.getTokenStore), R.layout.view_skeleton_voucher_price_label);
            } else {
                TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.TrustedWebActivityServiceConnection$1);
                Intrinsics.checkNotNullExpressionValue(textView, "tv_voucher_price_value");
                MoneyViewModel moneyViewModel = settingMenu.toFloatRange;
                StringBuilder sb = new StringBuilder();
                sb.append(moneyViewModel.getMin);
                sb.append(moneyViewModel.setMin);
                textView.setText(sb.toString());
                String str = settingMenu.getMin;
                if (str != null) {
                    i = str.length();
                } else {
                    i = 0;
                }
                int max = dispatchOnCancelled.setMax(i);
                if (i != max) {
                    onCanceled oncanceled = new onCanceled(i, max, 1);
                    onCancelLoad.setMax(-200375258, oncanceled);
                    onCancelLoad.getMin(-200375258, oncanceled);
                }
                Glide.getMax(getContext()).getMax(str).length((ImageView) _$_findCachedViewById(resetInternal.setMax.createTextView));
                ((Button) _$_findCachedViewById(resetInternal.setMax.ITrustedWebActivityCallback$Stub$Proxy)).setOnClickListener(new length(settingMenu.setMax.setMin));
                Glide.getMax(getContext()).getMax(settingMenu.length).length((ImageView) _$_findCachedViewById(resetInternal.setMax.invalidateDrawable));
                MoneyViewModel moneyViewModel2 = settingMenu.toIntRange;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(moneyViewModel2.getMin);
                sb2.append(moneyViewModel2.setMin);
                String obj = sb2.toString();
                TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.onExtraCommand);
                Intrinsics.checkNotNullExpressionValue(textView2, "tv_voucher_percentage_value");
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                textView2.setText(context.getResources().getString(R.string.nearby_dana_deals_save_up_to, new Object[]{obj}));
            }
        }
        this.length = settingMenu;
    }
}
