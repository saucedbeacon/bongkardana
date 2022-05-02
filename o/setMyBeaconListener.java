package o;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import id.dana.base.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"executeInMainThread", "", "Lid/dana/base/BaseActivity;", "runnable", "Ljava/lang/Runnable;", "hideKeyboard", "Landroid/app/Activity;", "view", "Landroid/view/View;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setMyBeaconListener {
    public static final void setMin(@NotNull Activity activity, @Nullable View view) {
        Intrinsics.checkNotNullParameter(activity, "$this$hideKeyboard");
        Object systemService = activity.getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (view != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    public static final void length(@NotNull BaseActivity baseActivity, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(baseActivity, "$this$executeInMainThread");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        setFavoriteBtnVisibility min = setFavoriteBtnVisibility.getMin(runnable);
        hasCornerMarking length = hideProgress.length();
        setRefreshAnimation.getMax(length, "scheduler is null");
        dismissBadgeView setheaderviewheight = new setHeaderViewHeight(min, length);
        RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable = SecuritySignature.valueOf;
        if (redDotDrawable != null) {
            setheaderviewheight = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable, setheaderviewheight);
        }
        hasCornerMarking length2 = hideProgress.length();
        setRefreshAnimation.getMax(length2, "scheduler is null");
        setFavoriteBtnVisibility setrefreshoffset = new setRefreshOffset(setheaderviewheight, length2);
        RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable2 = SecuritySignature.valueOf;
        if (redDotDrawable2 != null) {
            setrefreshoffset = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable2, setrefreshoffset);
        }
        baseActivity.addDisposable(setrefreshoffset.v_());
    }
}
