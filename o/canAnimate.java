package o;

import id.dana.social.model.RelationshipItemModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toRelationshipItemModel", "Lid/dana/social/model/RelationshipItemModel;", "Lid/dana/domain/social/model/RelationshipItem;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class canAnimate {
    @NotNull
    public static final RelationshipItemModel getMin(@NotNull processScanResult processscanresult) {
        Intrinsics.checkNotNullParameter(processscanresult, "$this$toRelationshipItemModel");
        return new RelationshipItemModel(processscanresult.getUserId(), AuthenticationProxy.replaceIndoRegionDashWithPlusSixTwo(processscanresult.getLoginId()), processscanresult.getNickName(), processscanresult.getStatus(), processscanresult.getAvatar(), processscanresult.getUsername(), processscanresult.isNonReciprocal());
    }
}
