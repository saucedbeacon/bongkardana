package o;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002JH\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\n¨\u0006\u0013"}, d2 = {"Lid/dana/utils/BorderedToastUtil;", "", "()V", "showToast", "", "context", "Landroid/app/Activity;", "view", "Landroid/view/View;", "gravity", "", "delayInMillis", "", "showToastMessage", "image", "borderColor", "message", "", "maxTextLines", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAnimationStyle {
    @NotNull
    public static final setAnimationStyle setMax = new setAnimationStyle();

    private setAnimationStyle() {
    }

    public static void getMax(@NotNull Activity activity, @DrawableRes int i, @ColorRes int i2, @NotNull String str, int i3, long j, int i4) {
        Intrinsics.checkNotNullParameter(activity, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(str, "message");
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "context.layoutInflater");
        View inflate = layoutInflater.inflate(R.layout.view_toast_template, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "view");
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(resetInternal.setMax.getWindowAnimations);
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(i);
        }
        TextView textView = (TextView) inflate.findViewById(resetInternal.setMax.CustomTabsSession$MockSession);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) inflate.findViewById(resetInternal.setMax.CustomTabsSession$MockSession);
        if (textView2 != null) {
            textView2.setMaxLines(i4);
        }
        ((CardView) inflate.findViewById(resetInternal.setMax.ColorRes)).setCardBackgroundColor(IntRange.setMax(activity, i2));
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setDuration(0);
        toast.setGravity(i3, 0, (int) (Resources.getSystem().getDisplayMetrics().density * 48.0f));
        toast.setView(inflate);
        toast.show();
        new Handler().postDelayed(new setFillScreen(new setMin(toast)), j);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class setMin extends FunctionReferenceImpl implements Function0<Unit> {
        setMin(Toast toast) {
            super(0, toast, Toast.class, "cancel", "cancel()V", 0);
        }

        public final void invoke() {
            ((Toast) this.receiver).cancel();
        }
    }
}
