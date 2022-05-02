package o;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"setSupportImageResource", "", "Landroid/widget/ImageView;", "resId", "", "show", "Lcom/afollestad/materialdialogs/MaterialDialog;", "delay", "", "design_release"}, k = 2, mv = {1, 4, 2})
public final class setSlingshotDistance {
    public static final void getMax(@NotNull ImageView imageView, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(imageView, "$this$setSupportImageResource");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(context, "$this$getSupportDrawable");
        imageView.setImageDrawable(cancelAll.getMin(context, i));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    public static final class setMin implements Runnable {
        final /* synthetic */ isBaselineAligned length;

        public setMin(isBaselineAligned isbaselinealigned) {
            this.length = isbaselinealigned;
        }

        public final void run() {
            if (setProgressViewEndTarget.setMax(this.length.getContext())) {
                this.length.dismiss();
            }
        }
    }
}
