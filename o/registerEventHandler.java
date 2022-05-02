package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;

final class registerEventHandler implements RedDotManager {
    public static final registerEventHandler setMin = new registerEventHandler();

    public final void accept(Object obj) {
        updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, ((Throwable) obj).getMessage());
    }
}
