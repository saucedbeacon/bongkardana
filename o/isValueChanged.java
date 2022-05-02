package o;

import android.app.Activity;
import id.dana.base.BaseActivity;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.savings.activity.SavingDetailActivity;
import id.dana.savings.activity.SavingsActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureSaving;", "", "()V", "GOALS_ID_PARAM", "", "invoke", "", "activity", "Landroid/app/Activity;", "params", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isValueChanged {
    @NotNull
    public static final isValueChanged getMin = new isValueChanged();

    private isValueChanged() {
    }

    @JvmStatic
    public static final void length(@NotNull Activity activity, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(map, "params");
        String str = map.get("goalsId");
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                SavingDetailActivity.getMin getmin = SavingDetailActivity.Companion;
                SavingDetailActivity.getMin.setMax((BaseActivity) activity, str, map);
                return;
            }
        }
        SavingsActivity.setMax setmax = SavingsActivity.Companion;
        SavingsActivity.setMax.setMin(activity);
    }
}
