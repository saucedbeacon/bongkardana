package o;

import id.dana.domain.social.InitStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ScanDataProcessor;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toFeedInit", "Lid/dana/domain/social/model/FeedInit;", "Lid/dana/data/social/repository/source/network/result/InitFeedResponse;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class clearPermissionModel {
    @NotNull
    public static final ScanDataProcessor.ScanData toFeedInit(@NotNull setAuthCode setauthcode) {
        Intrinsics.checkNotNullParameter(setauthcode, "$this$toFeedInit");
        return new ScanDataProcessor.ScanData(setauthcode.getInitProgress(), InitStatus.valueOf(setauthcode.getStatus()));
    }
}
