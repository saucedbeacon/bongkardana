package o;

import android.app.Activity;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.home.HomeTabActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000b\u0010\u0005\u001a\u00070\u0006¢\u0006\u0002\b\u0007H\u0002¨\u0006\b"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureHome;", "", "()V", "invoke", "", "activity", "Landroid/app/Activity;", "Lorg/jetbrains/annotations/NotNull;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class addTarget {
    @NotNull
    public static final addTarget getMax = new addTarget();

    private addTarget() {
    }

    @JvmStatic
    public static final void setMax(@NotNull Activity activity) {
        Integer num;
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        if (activity instanceof HomeTabActivity) {
            IH5TinyPopMenu viewPagerAdapter$app_productionRelease = ((HomeTabActivity) activity).getViewPagerAdapter$app_productionRelease();
            if (viewPagerAdapter$app_productionRelease != null) {
                num = Integer.valueOf(viewPagerAdapter$app_productionRelease.setMin.getCurrentItem());
            } else {
                num = null;
            }
            if (num != null) {
                viewPagerAdapter$app_productionRelease.setMin.setCurrentItem(1);
            }
        }
    }
}
