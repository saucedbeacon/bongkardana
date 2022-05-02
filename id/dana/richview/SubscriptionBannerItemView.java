package id.dana.richview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.evaluate;
import o.updateCornerMarking;
import o.updateMessageMenuItem;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001b\u001a\u00020\u0007H\u0016J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001fJ\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001fJ\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0007J\b\u0010(\u001a\u00020\u001dH\u0016R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006)"}, d2 = {"Lid/dana/richview/SubscriptionBannerItemView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ivMerchantLogo", "Landroid/widget/ImageView;", "getIvMerchantLogo", "()Landroid/widget/ImageView;", "setIvMerchantLogo", "(Landroid/widget/ImageView;)V", "tvMerchantTitle", "Landroid/widget/TextView;", "getTvMerchantTitle", "()Landroid/widget/TextView;", "setTvMerchantTitle", "(Landroid/widget/TextView;)V", "tvSubscriptionAmount", "getTvSubscriptionAmount", "setTvSubscriptionAmount", "tvSubscriptionStatus", "getTvSubscriptionStatus", "setTvSubscriptionStatus", "getLayout", "loadImage", "", "goodsType", "", "setMerchantTitle", "title", "setSubscriptionAmount", "amount", "setSubscriptionStatus", "status", "setSubscriptionStatusStyle", "color", "setup", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SubscriptionBannerItemView extends BaseRichView {
    public ImageView ivMerchantLogo;
    private HashMap length;
    public TextView tvMerchantTitle;
    public TextView tvSubscriptionAmount;
    public TextView tvSubscriptionStatus;

    @JvmOverloads
    public SubscriptionBannerItemView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.item_subscription_banner;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SubscriptionBannerItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SubscriptionBannerItemView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
    }

    @NotNull
    public final TextView getTvMerchantTitle() {
        TextView textView = this.tvMerchantTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvMerchantTitle");
        }
        return textView;
    }

    public final void setTvMerchantTitle(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvMerchantTitle = textView;
    }

    @NotNull
    public final TextView getTvSubscriptionStatus() {
        TextView textView = this.tvSubscriptionStatus;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSubscriptionStatus");
        }
        return textView;
    }

    public final void setTvSubscriptionStatus(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvSubscriptionStatus = textView;
    }

    @NotNull
    public final TextView getTvSubscriptionAmount() {
        TextView textView = this.tvSubscriptionAmount;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSubscriptionAmount");
        }
        return textView;
    }

    public final void setTvSubscriptionAmount(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvSubscriptionAmount = textView;
    }

    @NotNull
    public final ImageView getIvMerchantLogo() {
        ImageView imageView = this.ivMerchantLogo;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivMerchantLogo");
        }
        return imageView;
    }

    public final void setIvMerchantLogo(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.ivMerchantLogo = imageView;
    }

    public final void setup() {
        View findViewById = findViewById(R.id.f63662131364990);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.tvMerchantTitle)");
        this.tvMerchantTitle = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.f64262131365051);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.tvSubscriptionStatus)");
        this.tvSubscriptionStatus = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.f64252131365050);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.tvSubscriptionAmount)");
        this.tvSubscriptionAmount = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.f47622131363312);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.ivMerchantLogo)");
        this.ivMerchantLogo = (ImageView) findViewById4;
    }

    public final void setMerchantTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        TextView textView = this.tvMerchantTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvMerchantTitle");
        }
        textView.setText(str);
    }

    public final void setSubscriptionStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "status");
        TextView textView = this.tvSubscriptionStatus;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSubscriptionStatus");
        }
        textView.setText(str);
    }

    public final void setSubscriptionStatusStyle(int i) {
        TextView textView = this.tvSubscriptionStatus;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSubscriptionStatus");
        }
        textView.setTextColor(i);
    }

    public final void setSubscriptionAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "amount");
        TextView textView = this.tvSubscriptionAmount;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvSubscriptionAmount");
        }
        textView.setText(str);
    }

    public final void loadImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "goodsType");
        StringBuilder sb = new StringBuilder("https://a.m.dana.id/resource/imgs/merchant/subscription-");
        sb.append(str);
        sb.append(".png");
        updateMessageMenuItem<Drawable> max = ((updateCornerMarking) Glide.getMax(getContext())).setMax(sb.toString()).setMax(evaluate.setMin);
        ImageView imageView = this.ivMerchantLogo;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivMerchantLogo");
        }
        max.length(imageView);
    }
}
