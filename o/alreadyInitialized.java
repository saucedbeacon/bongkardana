package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import kotlin.jvm.functions.Function1;

final class alreadyInitialized implements Function1 {
    public static final alreadyInitialized length = new alreadyInitialized();

    public final Object invoke(Object obj) {
        return updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, ((Throwable) obj).getMessage());
    }
}
