package o;

import android.app.Activity;
import android.util.Base64;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.nearbyme.merchantdetail.MerchantDetailActivity;
import id.dana.nearbyrevamp.NewNearbyMeActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J7\u0010\u000b\u001a\u00020\f2\u000b\u0010\r\u001a\u00070\u000e¢\u0006\u0002\b\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u000f2\u0006\u0010\u0012\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureMerchantDetail;", "", "()V", "MERCHANT_ID_PARAM_KEY", "", "SHOP_ID_PARAM_KEY", "SOURCE", "getAndCheckParam", "param", "shouldDecodeParam", "", "invoke", "", "activity", "Landroid/app/Activity;", "Lorg/jetbrains/annotations/NotNull;", "params", "", "isOldDeeplink", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class excludeObject {
    @NotNull
    public static final excludeObject setMin = new excludeObject();

    private excludeObject() {
    }

    @JvmStatic
    public static final void getMin(@NotNull Activity activity, @NotNull Map<String, String> map, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(map, "params");
        String str2 = map.get("s");
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        String length = length(str2, z);
        String str4 = map.get("m");
        if (str4 != null) {
            str3 = str4;
        }
        String length2 = length(str3, z);
        String str5 = map.get("source");
        if (str5 == null) {
            str5 = "Deeplink";
        }
        String str6 = map.get(FeatureParams.NEARBY_REVAMP);
        if (str6 == null) {
            str = null;
        } else if (str6 != null) {
            str = StringsKt.trim((CharSequence) str6).toString();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        if (z || !parseBoolean) {
            MerchantDetailActivity.setMin setmin = MerchantDetailActivity.Companion;
            MerchantDetailActivity.setMin.setMax(activity, length2, length, str5);
            return;
        }
        NewNearbyMeActivity.setMin setmin2 = NewNearbyMeActivity.Companion;
        NewNearbyMeActivity.setMin.setMax(activity, length2, length, str5);
    }

    private static String length(String str, boolean z) {
        if (!z) {
            return str;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "Base64.decode(param, Base64.DEFAULT)");
            return new String(decode, Charsets.UTF_8);
        } catch (Exception unused) {
            return str;
        }
    }
}
