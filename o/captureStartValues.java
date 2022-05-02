package o;

import android.app.Activity;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.globalsearch.model.TrackerGlobalSearchOpen;
import id.dana.globalsearch.view.GlobalSearchActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\u000b\u0010\u0005\u001a\u00070\u0006¢\u0006\u0002\b\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureGlobalSearch;", "", "()V", "invoke", "", "activity", "Landroid/app/Activity;", "Lorg/jetbrains/annotations/NotNull;", "params", "", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class captureStartValues {
    @NotNull
    public static final captureStartValues length = new captureStartValues();

    private captureStartValues() {
    }

    @JvmStatic
    public static final void getMin(@NotNull Activity activity, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(map, "params");
        String str = map.get(FeatureParams.KEYWORD);
        if (str == null) {
            str = "";
        }
        TrackerGlobalSearchOpen.setGlobalSearchOpen("Deeplink");
        if (str.length() == 0) {
            GlobalSearchActivity.getMax getmax = GlobalSearchActivity.Companion;
            GlobalSearchActivity.getMax.setMax(activity);
            return;
        }
        GlobalSearchActivity.getMax getmax2 = GlobalSearchActivity.Companion;
        GlobalSearchActivity.getMax.setMin(activity, str);
    }
}
