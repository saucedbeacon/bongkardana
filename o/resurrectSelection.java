package o;

import id.dana.social.state.FeedCommentModelState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.recycleOnMeasure;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0001H\u0002¨\u0006\u0005"}, d2 = {"toFeedCommentModel", "", "Lid/dana/social/state/ViewHolderState$Item;", "Lid/dana/social/model/FeedCommentModel;", "Lid/dana/domain/social/model/Comment;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class resurrectSelection {
    public static final List<AUHorizontalListView.RecyclerListener.length<resurrectSelectionIfNeeded>> setMin(List<ScanDataProcessor> list) {
        Iterable<ScanDataProcessor> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ScanDataProcessor scanDataProcessor : iterable) {
            String id2 = scanDataProcessor.getId();
            recycleOnMeasure.setMin setmin = recycleOnMeasure.IsOverlapping;
            markOutsideIfExpired user = scanDataProcessor.getUser();
            Intrinsics.checkNotNullParameter(user, "activityReactionsUser");
            String displayName = user.getDisplayName();
            String phoneNumber = user.getPhoneNumber();
            String id3 = user.getId();
            String nickName = user.getNickName();
            String kycStatus = user.getKycStatus();
            String profilePictureUrl = user.getProfilePictureUrl();
            String username = user.getUsername();
            if (username == null) {
                username = "";
            }
            arrayList.add(new AUHorizontalListView.RecyclerListener.length(new resurrectSelectionIfNeeded(id2, new recycleOnMeasure(displayName, phoneNumber, id3, nickName, kycStatus, profilePictureUrl, username), scanDataProcessor.getContent(), scanDataProcessor.getOwnComment(), scanDataProcessor.getCreatedTime(), FeedCommentModelState.DEFAULT)));
        }
        return (List) arrayList;
    }
}
