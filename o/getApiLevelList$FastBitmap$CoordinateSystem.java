package o;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/RelationshipItem;", "it", "Lid/dana/data/social/repository/source/persistence/entity/FollowerItemEntity;", "invoke"}, k = 3, mv = {1, 4, 2})
final class getApiLevelList$FastBitmap$CoordinateSystem extends Lambda implements Function1<AuthSkipResultModel, processScanResult> {
    final /* synthetic */ boolean $maskUntilUsername;
    final /* synthetic */ String $userId;
    final /* synthetic */ getApiLevelList this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    getApiLevelList$FastBitmap$CoordinateSystem(getApiLevelList getapilevellist, String str, boolean z) {
        super(1);
        this.this$0 = getapilevellist;
        this.$userId = str;
        this.$maskUntilUsername = z;
    }

    @NotNull
    public final processScanResult invoke(@NotNull AuthSkipResultModel authSkipResultModel) {
        Intrinsics.checkNotNullParameter(authSkipResultModel, "it");
        if (authSkipResultModel.getStatus().length() == 0) {
            authSkipResultModel.setStatus(this.this$0.getFollowerItemEntity(this.$userId).getStatus());
        }
        this.this$0.mapRelationshipEntityNickNameToLocalContact(CollectionsKt.listOf(authSkipResultModel), this.$maskUntilUsername);
        return interceptSchemeForTiny.toFollowerItem(authSkipResultModel);
    }
}
