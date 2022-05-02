package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/social/onboarding/viewholder/FeedOnboardingViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/onboarding/model/FeedOnboardingModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getSelectedPosition extends Ignore<AUHorizontalListView.CheckForTap> {
    public final /* synthetic */ void setMax(Object obj) {
        AUHorizontalListView.CheckForTap checkForTap = (AUHorizontalListView.CheckForTap) obj;
        if (checkForTap != null) {
            View view = this.itemView;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(resetInternal.setMax.removeMenuPresenter);
            if (lottieAnimationView != null) {
                lottieAnimationView.setAnimation(checkForTap.getMin);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            if (appCompatTextView != null) {
                appCompatTextView.setText(checkForTap.length);
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(resetInternal.setMax.setSplitTrack);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText(checkForTap.setMin);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getSelectedPosition(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_feed_onboarding, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }
}
