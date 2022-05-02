package o;

import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.social.model.RelationshipItemModel;
import java.util.List;
import kotlin.Metadata;
import o.onDelete;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/social/contract/SocialProfileContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface getRightButtonIconView {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0003H&J\u0016\u0010\u0017\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Lid/dana/social/contract/SocialProfileContract$View;", "Lid/dana/base/AbstractContract$AbstractView;", "onGetFeedCommentEnableSuccess", "", "isEnable", "", "onGetProfileSettingModelFail", "onGetProfileSettingModelSuccess", "settingModel", "Lid/dana/domain/profilemenu/model/SettingModel;", "onGetUserProfileHeaderFail", "onGetUserProfileHeaderSuccess", "data", "Lid/dana/social/model/RelationshipItemModel;", "onGetUserTimelineFeedFail", "onGetUserTimelineFeedSuccess", "feedViewModelList", "", "Lid/dana/social/model/FeedViewHolderModel;", "onModifyRelationshipComplete", "operationType", "Lid/dana/domain/social/ModifyRelationOperationType;", "onModifyRelationshipFailed", "onRefreshTimeline", "onStatusChange", "status", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends onDelete.length {
        void getMax(@NotNull SettingModel settingModel);

        void getMax(@NotNull List<setEmptyView> list);

        void getMin();

        void length();

        void length(@NotNull RelationshipItemModel relationshipItemModel);

        void length(@NotNull List<setEmptyView> list);

        void length(boolean z);

        void setMax();

        void setMin();

        void setMin(@NotNull ModifyRelationOperationType modifyRelationOperationType);

        void setMin(@NotNull String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lid/dana/social/contract/SocialProfileContract$Presenter;", "Lid/dana/base/AbstractContract$AbstractPresenter;", "doFeedsContentAction", "", "redirectValue", "Ljava/util/HashMap;", "", "getFeedCommentEnable", "getProfileSettingModel", "getUserProfileHeaderById", "userId", "getUserTimelineFeedByUserId", "isHasMore", "", "modifyFollowerRelationshipAction", "status", "Lid/dana/domain/social/ModifyRelationOperationType;", "modifyFollowingRelationshipAction", "refreshTimeline", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax extends onDelete.getMin {
        void getMax(@NotNull String str);

        void getMax(@NotNull String str, @NotNull ModifyRelationOperationType modifyRelationOperationType);

        void getMin(@NotNull String str);

        void getMin(@NotNull String str, @NotNull ModifyRelationOperationType modifyRelationOperationType);

        boolean getMin();

        void length();

        void length(@NotNull String str);

        void setMin();

        void setMin(@NotNull String str);
    }
}
