package id.dana.social.view.activity.detail;

import id.dana.social.model.FeedModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.AUIconDrawable;
import o.GriverRpcUtils;
import o.setNextSelectedPositionInt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/social/view/activity/detail/SocialActivityDetail$socialFeedClickListener$1", "Lid/dana/social/adapter/BaseSocialFeedInteraction;", "onFeedAvatarImageClicked", "", "itemPosition", "", "onSocialFeedSpanClicked", "content", "Lid/dana/social/utils/Content;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SocialActivityDetail$FastBitmap$CoordinateSystem extends GriverRpcUtils.AnonymousClass1 {
    final /* synthetic */ SocialActivityDetail getMax;

    SocialActivityDetail$FastBitmap$CoordinateSystem(SocialActivityDetail socialActivityDetail) {
        this.getMax = socialActivityDetail;
    }

    public final void setMax(@NotNull AUHorizontalListView.SavedState.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "content");
        AUIconDrawable feedsContentAction = this.getMax.getFeedsContentAction();
        String str = r2.getMin;
        if (str == null) {
            str = "";
        }
        feedsContentAction.getMax(str);
    }

    public final void getMin(int i) {
        FeedModel access$getFeedData$p = this.getMax.toIntRange;
        if (access$getFeedData$p == null) {
            return;
        }
        if (this.getMax.getMin(access$getFeedData$p)) {
            SocialActivityDetail.access$openSelfProfileActivity(this.getMax, access$getFeedData$p);
        } else {
            SocialActivityDetail.access$openProfileActivity(this.getMax, setNextSelectedPositionInt.setMax(access$getFeedData$p));
        }
    }
}
