package o;

import android.app.Activity;
import android.content.Context;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.nearbyme.OtherStoreListActivity;
import id.dana.nearbyme.enums.SearchType;
import id.dana.tracker.TrackerKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureNearbyShopList;", "", "()V", "EMPTY_STRING", "", "MERCHANT_ID", "invoke", "", "activity", "Landroid/app/Activity;", "params", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getTargetIds {
    @NotNull
    public static final getTargetIds setMax = new getTargetIds();

    private getTargetIds() {
    }

    @JvmStatic
    public static final void setMax(@NotNull Activity activity, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(map, "params");
        OtherStoreListActivity.length length = OtherStoreListActivity.Companion;
        Context context = activity;
        String str = map.get("mid");
        if (str == null) {
            str = "";
        }
        OtherStoreListActivity.length.getMin(context, str, "", SearchType.MERCHANTID_SORTED_BY_DISTANCE, "", TrackerKey.SourceType.DEEP_LINK);
    }
}
