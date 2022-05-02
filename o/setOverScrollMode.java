package o;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.bumptech.glide.Glide;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"loadAvatar", "", "Landroid/widget/ImageView;", "url", "", "placeholderResId", "", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setOverScrollMode {
    public static final void getMax(@NotNull ImageView imageView, @NotNull String str, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(imageView, "$this$loadAvatar");
        Intrinsics.checkNotNullParameter(str, "url");
        if (imageView.getContext() instanceof Activity) {
            Context context = imageView.getContext();
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            } else if (((Activity) context).isDestroyed()) {
                return;
            }
        }
        ((updateCornerMarking) Glide.getMax(imageView.getContext())).getMin((Object) stopBeaconDiscovery.setMax(str)).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax(i).setMin(i).length(imageView);
    }
}
