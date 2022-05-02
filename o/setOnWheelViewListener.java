package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0007J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000eH\u0007J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u001b"}, d2 = {"Lid/dana/utils/KeyboardHelper;", "", "()V", "forceHide", "", "activity", "Landroid/app/Activity;", "getInputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "context", "Landroid/content/Context;", "getKeyboardHeight", "", "mainView", "Landroid/view/View;", "getSoftButtomBarSize", "hasFocus", "", "hide", "view", "setKeyboardVisibilityListener", "rootView", "keyboardVisibilityListener", "Lid/dana/utils/KeyboardHelper$KeyboardVisibilityListener;", "show", "showKeyboardImplicit", "KeyboardVisibilityListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setOnWheelViewListener {
    @NotNull
    public static final setOnWheelViewListener setMin = new setOnWheelViewListener();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lid/dana/utils/KeyboardHelper$KeyboardVisibilityListener;", "", "onKeyboardHide", "", "onKeyboardShow", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length {
        void length();

        void setMax();
    }

    private setOnWheelViewListener() {
    }

    @JvmStatic
    public static final void setMin(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        activity.getWindow().setSoftInputMode(4);
    }

    @JvmStatic
    public static final void getMax(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        Object systemService = context.getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).showSoftInput(view, 2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    @JvmStatic
    public static final void getMax(@Nullable Activity activity) {
        if (activity != null && length(activity)) {
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "activity.window");
            View currentFocus = window.getCurrentFocus();
            if (currentFocus != null) {
                Context context = currentFocus.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                Object systemService = context.getSystemService("input_method");
                if (systemService != null) {
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        }
    }

    @JvmStatic
    public static final void getMin(@Nullable Activity activity) {
        View findViewById;
        if (activity != null && (findViewById = activity.findViewById(16908290)) != null) {
            Object systemService = activity.getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).hideSoftInputFromWindow(findViewById.getWindowToken(), 0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    @JvmStatic
    public static final void length(@Nullable View view) {
        if (view != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            Object systemService = context.getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    private static boolean length(Activity activity) {
        return activity.getCurrentFocus() != null;
    }

    @JvmStatic
    public static final int getMin(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "mainView");
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        View rootView = view.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "mainView.rootView");
        return rootView.getHeight() - (rect.bottom - rect.top);
    }

    @JvmStatic
    public static final void getMax(@Nullable View view, @NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "keyboardVisibilityListener");
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new setMax(view, new boolean[]{false}, length2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ length getMax;
        final /* synthetic */ boolean[] setMax;
        final /* synthetic */ View setMin;

        setMax(View view, boolean[] zArr, length length) {
            this.setMin = view;
            this.setMax = zArr;
            this.getMax = length;
        }

        public final void onGlobalLayout() {
            int min = setOnWheelViewListener.getMin(this.setMin);
            View rootView = this.setMin.getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "rootView.rootView");
            if (min > rootView.getHeight() / 4) {
                this.setMax[0] = true;
                this.getMax.length();
                return;
            }
            boolean[] zArr = this.setMax;
            if (zArr[0]) {
                zArr[0] = false;
                this.getMax.setMax();
            }
        }
    }

    @JvmStatic
    public static final int setMax(@Nullable Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = activity.getWindowManager();
        Intrinsics.checkNotNullExpressionValue(windowManager, "activity.windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        WindowManager windowManager2 = activity.getWindowManager();
        Intrinsics.checkNotNullExpressionValue(windowManager2, "activity.windowManager");
        windowManager2.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        if (i2 > i) {
            return i2 - i;
        }
        return 0;
    }

    @JvmStatic
    public static final void setMax(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Object systemService = context.getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).toggleSoftInput(1, 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
