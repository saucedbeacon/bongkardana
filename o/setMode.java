package o;

import android.app.Activity;
import android.content.Intent;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.social.view.activity.ChangeUsernameActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\n"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureUpdateUsername;", "", "()V", "invoke", "", "activity", "Landroid/app/Activity;", "params", "", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setMode {
    @NotNull
    public static final setMode getMin = new setMode();

    private setMode() {
    }

    @JvmStatic
    public static final void setMax(@NotNull Activity activity, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(map, "params");
        activity.startActivity(new Intent(activity, ChangeUsernameActivity.class).putExtra(ChangeUsernameActivity.PARAM_FROM_DEEPLINK, true));
    }
}
