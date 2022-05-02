package o;

import id.dana.domain.social.InitStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toInitFeed", "Lid/dana/domain/social/model/InitFeed;", "Lid/dana/data/social/repository/source/network/result/InitFeedResponse;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class H5OpenAuthProxy {
    @NotNull
    public static final setBeaconParsers toInitFeed(@NotNull setAuthCode setauthcode) {
        Intrinsics.checkNotNullParameter(setauthcode, "$this$toInitFeed");
        return new setBeaconParsers(InitStatus.valueOf(setauthcode.getStatus()), setauthcode.getInitProgress(), (Exception) null, false, 12, (DefaultConstructorMarker) null);
    }
}
