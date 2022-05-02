package o;

import android.app.Activity;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.home.HomeTabActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureMerchantReview;", "", "activity", "Landroid/app/Activity;", "params", "", "", "(Landroid/app/Activity;Ljava/util/Map;)V", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class excludeChildren {
    @NotNull
    public static final setMin getMin = new setMin((byte) 0);

    public excludeChildren(@NotNull Activity activity, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(map, "params");
        String str = map.get(HomeTabActivity.EXTRA_SHOP_ID);
        if (str != null) {
            String str2 = map.get("source");
            str2 = str2 == null ? "" : str2;
            HomeTabActivity.getMax getmax = HomeTabActivity.Companion;
            HomeTabActivity.getMax.getMax(activity, str2, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureMerchantReview$Companion;", "", "()V", "SHOP_ID", "", "SOURCE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
