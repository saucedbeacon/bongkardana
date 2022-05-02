package o;

import id.dana.social.model.FeedModel;
import id.dana.social.model.RelationshipItemModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toRelationshipModel", "Lid/dana/social/model/RelationshipItemModel;", "Lid/dana/social/model/FeedModel;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setNextSelectedPositionInt {
    @NotNull
    public static final RelationshipItemModel setMax(@NotNull FeedModel feedModel) {
        FeedModel feedModel2 = feedModel;
        Intrinsics.checkNotNullParameter(feedModel2, "$this$toRelationshipModel");
        HashMap<String, String> hashMap = feedModel2.IsOverlapping;
        if (hashMap != null) {
            return new RelationshipItemModel(setBuildNumber.getUserId(hashMap), "", setBuildNumber.getNickName(hashMap), "", setBuildNumber.getProfileAvatar(hashMap), feedModel.setMin(), 64);
        }
        return new RelationshipItemModel((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127);
    }
}
