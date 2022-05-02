package id.dana.social.adapter;

import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.IntRange;
import o.getInsetDodgeRect;
import o.setEmptyView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lid/dana/social/adapter/SocialFeedShimmerViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/FeedViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "getParent", "()Landroid/view/ViewGroup;", "viewShimmer", "Landroid/view/View;", "getViewShimmer", "()Landroid/view/View;", "setViewShimmer", "(Landroid/view/View;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SocialFeedShimmerViewHolder extends Ignore<setEmptyView> {
    @NotNull
    private final ViewGroup getMin;
    @BindView(2131365953)
    public View viewShimmer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SocialFeedShimmerViewHolder(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.viewholder_feed_shimmer, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.getMin = viewGroup;
    }

    public final /* synthetic */ void setMax(Object obj) {
        View view = this.viewShimmer;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewShimmer");
        }
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(view);
        setmax.getMax = R.layout.view_feed_skeleton;
        setmax.setMax = 1500;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        setmax.isInside = 20;
        new getInsetDodgeRect(setmax, (byte) 0).getMin();
    }
}
