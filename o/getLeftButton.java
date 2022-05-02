package o;

import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.social.model.RelationshipItemModel;
import java.util.List;
import kotlin.Metadata;
import o.onDelete;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/social/contract/FriendshipContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface getLeftButton {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lid/dana/social/contract/FriendshipContract$Presenter;", "Lid/dana/base/AbstractContract$AbstractPresenter;", "createDebouncerForSearch", "", "searchViewPublishSubject", "Lio/reactivex/subjects/PublishSubject;", "", "getActiveFollower", "getActiveFollowing", "registerFollowerRelationshipAction", "userId", "status", "Lid/dana/domain/social/ModifyRelationOperationType;", "registerFollowingRelationshipAction", "startFetchingFollower", "startFetchingFollowing", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin extends onDelete.getMin {
        void getMax();

        void getMin();

        void getMin(@NotNull String str, @NotNull ModifyRelationOperationType modifyRelationOperationType);

        void length();

        void setMax(@NotNull String str, @NotNull ModifyRelationOperationType modifyRelationOperationType);

        void setMin();

        void setMin(@NotNull IComponent<String> iComponent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/social/contract/FriendshipContract$View;", "Lid/dana/base/AbstractContract$AbstractView;", "onGetRelationshipItem", "", "relationshipItemModelList", "", "Lid/dana/social/model/RelationshipItemModel;", "updateRelationshipList", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax extends onDelete.length {
        void setMax(@NotNull List<RelationshipItemModel> list);

        void setMin(@NotNull List<RelationshipItemModel> list);
    }
}
