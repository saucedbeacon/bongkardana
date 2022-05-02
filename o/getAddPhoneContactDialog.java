package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.GyroscopeSensorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/nearbyrevamp/merchantbanner/MerchantBannerPagerAdapter;", "Lid/dana/onboarding/view/SimplePagerAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "viewList", "", "Lid/dana/onboarding/view/BaseSimpleView;", "getItemPosition", "", "item", "", "setViewList", "", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getAddPhoneContactDialog extends setStatusBar {
    private List<GyroscopeSensorService.SensorChangedListener> setMin;

    public final int getItemPosition(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "item");
        return -2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getAddPhoneContactDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void getMin(@Nullable List<? extends GyroscopeSensorService.SensorChangedListener> list) {
        if (list != null) {
            this.setMin = CollectionsKt.toMutableList(list);
            super.getMin(list);
            notifyDataSetChanged();
        }
    }
}
