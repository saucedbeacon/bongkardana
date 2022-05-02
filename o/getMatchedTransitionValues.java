package o;

import android.app.Activity;
import android.content.Intent;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.promocode.views.RedeemPromoCodeActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Lid/dana/contract/deeplink/path/FeaturePromoCode;", "", "()V", "openFeature", "", "activity", "Landroid/app/Activity;", "promoCode", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getMatchedTransitionValues {
    @NotNull
    public static final getMatchedTransitionValues getMin = new getMatchedTransitionValues();

    private getMatchedTransitionValues() {
    }

    @JvmStatic
    public static final void setMin(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intent intent = new Intent(activity, RedeemPromoCodeActivity.class);
        intent.putExtra("promoCode", str);
        activity.startActivity(intent);
    }
}
