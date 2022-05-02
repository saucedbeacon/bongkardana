package o;

import id.dana.data.userconfig.UserConfigBizTypeConstant;

public final class setPlugins extends onConnectedSuccessful<isRemoteExtension[]> {
    public setPlugins(isRemoteExtension[] isremoteextensionArr) {
        super(UserConfigBizTypeConstant.CONFIG_RECENT_TRANSACTION, "feature_sync_recent_transaction", isremoteextensionArr);
    }
}
