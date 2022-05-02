package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;

final class registerBridge implements RedDotManager {
    public static final registerBridge getMin = new registerBridge();

    public final void accept(Object obj) {
        updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, ((Throwable) obj).getMessage());
    }
}
