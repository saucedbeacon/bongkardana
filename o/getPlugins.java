package o;

import id.dana.data.userconfig.UserConfigBizTypeConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/data/userconfig/model/SecureRecentRecipientStoreConfig;", "Lid/dana/domain/userconfig/model/StoreConfig;", "", "Lid/dana/data/recentrecipient/model/RecentRecipientEntity;", "content", "([Lid/dana/data/recentrecipient/model/RecentRecipientEntity;)V", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getPlugins extends onConnectedSuccessful<isRemoteExtension[]> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getPlugins(@NotNull isRemoteExtension[] isremoteextensionArr) {
        super(UserConfigBizTypeConstant.CONFIG_SECURE_RECENT_TRANSACTION, "feature_secure_recent_transaction", isremoteextensionArr);
        Intrinsics.checkNotNullParameter(isremoteextensionArr, "content");
    }
}
