package o;

import android.app.Activity;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.nearbyme.OtherStoreListActivity;
import id.dana.nearbyme.enums.SearchType;
import id.dana.nearbyrevamp.NewNearbyMeActivity;
import id.dana.tracker.TrackerKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureNearbyAllShops;", "", "()V", "MERCHANT_ID", "", "SOURCE", "invoke", "", "activity", "Landroid/app/Activity;", "params", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class excludeTarget {
    @NotNull
    public static final excludeTarget getMin = new excludeTarget();

    private excludeTarget() {
    }

    @JvmStatic
    public static final void getMax(@NotNull Activity activity, @NotNull Map<String, String> map) {
        String str;
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(map, "params");
        String str2 = map.get("mid");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        String str4 = map.get("source");
        if (str4 == null) {
            str4 = TrackerKey.SourceType.DEEP_LINK;
        }
        String str5 = str4;
        String str6 = map.get(FeatureParams.NEARBY_REVAMP);
        if (str6 == null) {
            str = null;
        } else if (str6 != null) {
            str = StringsKt.trim((CharSequence) str6).toString();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        if (!Boolean.parseBoolean(str)) {
            OtherStoreListActivity.length length = OtherStoreListActivity.Companion;
            OtherStoreListActivity.length.getMin(activity, str3, "", SearchType.MERCHANTID_SORTED_BY_DISTANCE, "", str5);
            return;
        }
        NewNearbyMeActivity.setMin setmin = NewNearbyMeActivity.Companion;
        NewNearbyMeActivity.setMin.length(activity, str3, str5);
    }
}
