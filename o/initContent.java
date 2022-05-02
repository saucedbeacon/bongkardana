package o;

import id.dana.social.model.ReactionCountModel;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import o.AUHorizontalListView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0017J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lid/dana/social/adapter/SocialFeedClickListener;", "", "onActivateFeed", "", "onAddFeedReaction", "feedModel", "Lid/dana/social/model/FeedModel;", "onFeedAvatarImageClicked", "itemPosition", "", "onGroupedContentClicked", "onItemClicked", "onLoadMoreClicked", "onMoreFeedReactionClicked", "onProfileHeaderNameSectionClicked", "onReactionClicked", "reactionCountModel", "Lid/dana/social/model/ReactionCountModel;", "onSeeAllButtonClick", "onSocialFeedSpanClicked", "content", "Lid/dana/social/utils/Content;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface initContent {
    void getMax();

    void getMax(int i);

    void getMin(int i);

    void length();

    void length(@NotNull ReactionCountModel reactionCountModel);

    @JvmDefault
    void setMax();

    void setMax(int i);

    void setMax(@NotNull AUHorizontalListView.SavedState.AnonymousClass1 r1);
}
