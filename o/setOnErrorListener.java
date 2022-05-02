package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;

final class setOnErrorListener implements RedDotManager {
    public static final setOnErrorListener length = new setOnErrorListener();

    public final void accept(Object obj) {
        updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, ((Throwable) obj).getMessage());
    }
}
