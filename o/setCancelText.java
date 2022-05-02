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
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0007JD\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\"\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\u0014"}, d2 = {"Lid/dana/utils/CustomToastUtil;", "", "()V", "showCustomToast", "", "context", "Landroid/app/Activity;", "image", "", "background", "message", "", "gravity", "xOffsetInDp", "yOffsetInDp", "fillHorizontal", "", "contentDescription", "showCustomToastWithoutIcon", "showTopCustomToast", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setCancelText {
    @NotNull
    public static final setCancelText length = new setCancelText();

    @JvmStatic
    @JvmOverloads
    public static final void setMax(@NotNull Activity activity, @DrawableRes int i, @Nullable String str) {
        length(activity, i, R.drawable.bg_rounded_toast_payment_auth, str, 48, 60, false, (String) null, 384);
    }

    @JvmStatic
    @JvmOverloads
    public static final void setMax(@NotNull Activity activity, @Nullable String str) {
        length(activity, R.drawable.ic_warning_orange, R.drawable.bg_rounded_tangerine, str, 48, 60, true, (String) null, 256);
    }

    private setCancelText() {
    }

    public static void getMax(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, HummerConstants.CONTEXT);
        length(activity, R.drawable.ic_success, R.drawable.bg_rounded_toast, str, 48, 24, false, (String) null, 384);
    }

    public static void setMax(@NotNull Activity activity, @DrawableRes int i, @Nullable String str, int i2, int i3) {
        Intrinsics.checkNotNullParameter(activity, HummerConstants.CONTEXT);
        length(activity, 0, i, str, i2, i3, true, (String) null, 256);
    }

    public static /* synthetic */ void length(Activity activity, int i, int i2, String str, int i3, int i4, boolean z, String str2, int i5) {
        int i6 = i5;
        length(activity, i, i2, str, i3, i4, (i6 & 128) != 0 ? false : z, (i6 & 256) != 0 ? null : str2);
    }

    @JvmStatic
    @JvmOverloads
    private static void length(@NotNull Activity activity, @DrawableRes int i, @DrawableRes int i2, @Nullable String str, int i3, int i4, boolean z, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(activity, HummerConstants.CONTEXT);
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "context.layoutInflater");
        View inflate = layoutInflater.inflate(R.layout.view_custom_toast, (ViewGroup) null);
        if (inflate != null) {
            inflate.setContentDescription(str2);
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.f48462131363400);
        imageView.setImageResource(i);
        TextView textView = (TextView) inflate.findViewById(R.id.f65432131365168);
        Intrinsics.checkNotNullExpressionValue(textView, "textView");
        textView.setText(str);
        View findViewById = inflate.findViewById(R.id.f39312131362410);
        Intrinsics.checkNotNullExpressionValue(findViewById, "layout.findViewById(R.id.cl_custom_toast)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        constraintLayout.setBackgroundResource(i2);
        if (i == 0) {
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
            imageView.setVisibility(4);
            from from = new from();
            from.setMax(constraintLayout);
            ViewParent parent = textView.getParent();
            if (parent != null) {
                from.length(R.id.f65432131365168, 1, ((View) parent).getId(), 1, 16);
                from.setMin(constraintLayout);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
        }
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setDuration(0);
        if (z) {
            toast.setGravity(i3 | 7, isLineVisible.length(activity, 0.0f), isLineVisible.length(activity, (float) i4));
        } else {
            toast.setGravity(i3, isLineVisible.length(activity, 0.0f), isLineVisible.length(activity, (float) i4));
        }
        toast.setView(inflate);
        toast.show();
    }
}
