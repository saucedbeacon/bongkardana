package o;

import android.view.View;
import android.view.ViewGroup;
import id.dana.social.model.FeedModel;
import id.dana.social.view.BubbleFeedView;
import id.dana.social.view.GroupedFeedsView;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lid/dana/social/adapter/GroupedFeedNotificationViewHolder;", "Lid/dana/social/adapter/GroupedFeedViewHolder;", "parent", "Landroid/view/ViewGroup;", "socialFeedClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "(Landroid/view/ViewGroup;Lid/dana/social/adapter/SocialFeedClickListener;)V", "bindData", "", "data", "Lid/dana/social/model/FeedViewHolderModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class closeSocket extends WebSocketBridgeExtension {
    public final /* synthetic */ void setMax(Object obj) {
        setMax((setEmptyView) obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public closeSocket(@NotNull ViewGroup viewGroup, @NotNull initContent initcontent) {
        super(viewGroup, initcontent);
        BubbleFeedView bubbleFeedView;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(initcontent, "socialFeedClickListener");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        GroupedFeedsView groupedFeedsView = (GroupedFeedsView) view.findViewById(resetInternal.setMax.setVerticalAlign);
        if (groupedFeedsView != null) {
            groupedFeedsView.setNotificationMode(true);
        }
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        GroupedFeedsView groupedFeedsView2 = (GroupedFeedsView) view2.findViewById(resetInternal.setMax.setVerticalAlign);
        if (groupedFeedsView2 != null && (bubbleFeedView = (BubbleFeedView) groupedFeedsView2._$_findCachedViewById(resetInternal.setMax.setHorizontalBias)) != null) {
            bubbleFeedView.hideSpace();
        }
    }

    public final void setMin(@NotNull setEmptyView setemptyview) {
        String str;
        Intrinsics.checkNotNullParameter(setemptyview, "data");
        super.setMax(setemptyview);
        setFocusableInTouchMode setfocusableintouchmode = setemptyview.getMax;
        if (setfocusableintouchmode != null) {
            FeedModel feedModel = (FeedModel) CollectionsKt.firstOrNull(setfocusableintouchmode.setMin);
            if (feedModel == null || (str = feedModel.toIntRange) == null) {
                str = "";
            }
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            GroupedFeedsView groupedFeedsView = (GroupedFeedsView) view.findViewById(resetInternal.setMax.setVerticalAlign);
            if (groupedFeedsView != null) {
                groupedFeedsView.setupNotificationTypeBadge(str);
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            GroupedFeedsView groupedFeedsView2 = (GroupedFeedsView) view2.findViewById(resetInternal.setMax.setVerticalAlign);
            if (groupedFeedsView2 != null) {
                groupedFeedsView2.toggleUnreadNotificationBadge(setfocusableintouchmode.setMax());
            }
        }
    }
}
