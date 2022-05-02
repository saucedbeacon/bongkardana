package id.dana.social.adapter;

import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.social.model.FeedModel;
import id.dana.social.view.FeedsSectionView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.setEmptyView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lid/dana/social/adapter/FeedsSectionViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/FeedViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "viewFeedsSection", "Lid/dana/social/view/FeedsSectionView;", "getViewFeedsSection", "()Lid/dana/social/view/FeedsSectionView;", "setViewFeedsSection", "(Lid/dana/social/view/FeedsSectionView;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FeedsSectionViewHolder extends Ignore<setEmptyView> {
    @BindView(2131365873)
    public FeedsSectionView viewFeedsSection;

    public final /* synthetic */ void setMax(Object obj) {
        FeedModel feedModel;
        setEmptyView setemptyview = (setEmptyView) obj;
        if (setemptyview != null && (feedModel = setemptyview.setMax) != null) {
            FeedsSectionView feedsSectionView = this.viewFeedsSection;
            if (feedsSectionView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewFeedsSection");
            }
            feedsSectionView.setSection(feedModel.getMax);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedsSectionViewHolder(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.viewholder_feeds_section, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }
}
