package o;

import android.app.Activity;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.andrognito.flashbar.util.NavigationBarPosition;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\u0019\b\u0004\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\b¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\tH\u0000\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\n2\u0006\u0010\r\u001a\u00020\tH\u0000\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0010H\u0000\u001a\f\u0010\u0013\u001a\u00020\t*\u00020\u0010H\u0000\u001a\f\u0010\u0014\u001a\u00020\u000f*\u00020\u0010H\u0002\u001a\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u0004\u0018\u00010\u0010H\u0000\u001a\f\u0010\u0017\u001a\u00020\t*\u00020\u0010H\u0000¨\u0006\u0018"}, d2 = {"afterMeasured", "", "T", "Landroid/view/View;", "f", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "convertDpToPx", "", "Landroid/content/Context;", "dp", "convertPxToDp", "px", "getAppUsableScreenSize", "Landroid/graphics/Point;", "Landroid/app/Activity;", "getNavigationBarPosition", "Lcom/andrognito/flashbar/util/NavigationBarPosition;", "getNavigationBarSizeInPx", "getRealScreenSize", "getRootView", "Landroid/view/ViewGroup;", "getStatusBarHeightInPx", "flashbar_release"}, k = 2, mv = {1, 1, 10})
public final class getCollapseIcon {
    @NotNull
    public static final NavigationBarPosition length(@NotNull Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "$receiver");
        WindowManager windowManager = activity.getWindowManager();
        Intrinsics.checkExpressionValueIsNotNull(windowManager, "windowManager");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Intrinsics.checkExpressionValueIsNotNull(defaultDisplay, "windowManager.defaultDisplay");
        int rotation = defaultDisplay.getRotation();
        if (rotation == 0) {
            return NavigationBarPosition.BOTTOM;
        }
        if (rotation == 1) {
            return NavigationBarPosition.RIGHT;
        }
        if (rotation != 3) {
            return NavigationBarPosition.TOP;
        }
        return NavigationBarPosition.LEFT;
    }

    public static final Point setMin(@NotNull Activity activity) {
        Object systemService = activity.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else if (Build.VERSION.SDK_INT >= 14) {
                try {
                    Object invoke = Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0]);
                    if (invoke != null) {
                        point.x = ((Integer) invoke).intValue();
                        Object invoke2 = Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0]);
                        if (invoke2 != null) {
                            point.y = ((Integer) invoke2).intValue();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            return point;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
