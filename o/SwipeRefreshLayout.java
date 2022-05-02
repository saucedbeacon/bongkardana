package o;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.DrawableRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.setBackgroundColorRes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007JD\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J4\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¨\u0006\u0014"}, d2 = {"Lid/dana/component/customtoastcomponent/CustomToast;", "", "()V", "showCustomToast", "", "context", "Landroid/app/Activity;", "image", "", "background", "message", "", "gravity", "xOffsetInDp", "yOffsetInDp", "fillHorizontal", "", "showCustomToastWithoutIcon", "showTopCustomToast", "border", "design_release"}, k = 1, mv = {1, 4, 2})
public final class SwipeRefreshLayout {
    @NotNull
    public static final SwipeRefreshLayout setMax = new SwipeRefreshLayout();

    private SwipeRefreshLayout() {
    }

    public static void length(@NotNull Activity activity, @DrawableRes int i, @DrawableRes int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(activity, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(str, "message");
        getMax(activity, i, i2, str);
    }

    @JvmStatic
    @JvmOverloads
    public static final void getMax(@NotNull Activity activity, @DrawableRes int i, @DrawableRes int i2, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, HummerConstants.CONTEXT);
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "context.layoutInflater");
        View inflate = layoutInflater.inflate(setBackgroundColorRes.toIntRange.view_custom_overlays_toast, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(setBackgroundColorRes.length.getCause);
        imageView.setImageResource(i);
        TextView textView = (TextView) inflate.findViewById(setBackgroundColorRes.length.mayLaunchUrl);
        Intrinsics.checkNotNullExpressionValue(textView, "textView");
        textView.setText(str);
        View findViewById = inflate.findViewById(setBackgroundColorRes.length.equals);
        Intrinsics.checkNotNullExpressionValue(findViewById, "layout.findViewById(R.id.clCustomToast)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        constraintLayout.setBackgroundResource(i2);
        if (i == 0) {
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            imageView.setVisibility(4);
            from from = new from();
            from.setMax(constraintLayout);
            int i3 = setBackgroundColorRes.length.mayLaunchUrl;
            ViewParent parent = textView.getParent();
            if (parent != null) {
                from.length(i3, 1, ((View) parent).getId(), 1, 16);
                from.setMin(constraintLayout);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
        }
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setDuration(0);
        toast.setGravity(55, setRefreshing.setMax(activity, 0.0f), setRefreshing.setMax(activity, 24.0f));
        toast.setView(inflate);
        toast.show();
    }
}
