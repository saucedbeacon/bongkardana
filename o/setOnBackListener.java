package o;

import id.dana.social.model.RelationshipItemModel;
import java.util.List;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/social/contract/MutedFragmentContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface setOnBackListener {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/social/contract/MutedFragmentContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onGetMutedFollowingFailed", "", "onGetMutedFollowingListSuccess", "mutedFollowingList", "", "Lid/dana/social/model/RelationshipItemModel;", "onUnmuteFollowingFailed", "onUnmuteFollowingSuccess", "relationshipItemModel", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends parentColumns.getMax {
        void getMin();

        void length();

        void setMax(@NotNull RelationshipItemModel relationshipItemModel);

        void setMin(@NotNull List<RelationshipItemModel> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/social/contract/MutedFragmentContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "getMutedFollowingList", "", "startFetchingFollowing", "unmuteFollowing", "relationshipItemModel", "Lid/dana/social/model/RelationshipItemModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax extends parentColumns.setMin {
        void getMax();

        void length();

        void length(@NotNull RelationshipItemModel relationshipItemModel);
    }
}
