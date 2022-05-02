package o;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/utils/WindowUtil;", "", "()V", "getNavBarHeight", "", "context", "Landroid/content/Context;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setRecentUseTinyAppList {
    @NotNull
    public static final setRecentUseTinyAppList getMax = new setRecentUseTinyAppList();

    private setRecentUseTinyAppList() {
    }

    @JvmStatic
    public static final int setMin(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            WindowManager windowManager = (WindowManager) systemService;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            int i2 = displayMetrics.heightPixels;
            if (i2 > i) {
                return i2 - i;
            }
            return 0;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
