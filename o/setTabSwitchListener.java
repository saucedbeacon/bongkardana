package o;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/social/adapter/viewholder/FeedHighlightLoadingViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/FeedHighlightModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setTabSwitchListener extends Ignore<getContextMenuInfo> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setTabSwitchListener(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_feed_highlight_loading, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.setFilterBitmap);
        if (appCompatImageView != null) {
            View view2 = appCompatImageView;
            Intrinsics.checkNotNullParameter(view2, "$this$animateRotation");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "rotation", new float[]{0.0f, 360.0f});
            ofFloat.setRepeatCount(-1);
            ofFloat.setInterpolator(new LinearInterpolator());
            Intrinsics.checkNotNullExpressionValue(ofFloat, "this");
            ofFloat.setDuration(500);
            ofFloat.start();
        }
    }
}
