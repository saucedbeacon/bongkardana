package o;

import android.app.Activity;
import android.content.Intent;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.domain.statement.StatementType;
import id.dana.statement.StatementActivity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureStatement;", "", "activity", "Landroid/app/Activity;", "params", "", "", "(Landroid/app/Activity;Ljava/util/Map;)V", "openStatementActivity", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class clone {
    private final Map<String, String> setMax;
    private final Activity setMin;

    public clone(@NotNull Activity activity, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(map, "params");
        this.setMin = activity;
        this.setMax = map;
        Intent intent = new Intent(this.setMin, StatementActivity.class);
        intent.putExtra("EXTRA_SOURCE", this.setMax.get("source"));
        intent.putExtra(StatementActivity.TAB_MENU_SELECTED, StatementType.EXPENSE.name());
        this.setMin.startActivity(intent);
    }
}
