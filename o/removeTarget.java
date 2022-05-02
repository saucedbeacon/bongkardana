package o;

import android.app.Activity;
import android.content.Intent;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.merchantmanagement.view.MerchantManagementActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureMerchantBinding;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class removeTarget {
    public removeTarget(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        activity.startActivity(new Intent(activity, MerchantManagementActivity.class));
    }
}
