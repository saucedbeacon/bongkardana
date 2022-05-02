package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import kotlin.jvm.functions.Function1;

final class setAppendUserAgent implements Function1 {
    public static final setAppendUserAgent setMin = new setAppendUserAgent();

    public final Object invoke(Object obj) {
        return updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, ((Throwable) obj).getMessage());
    }
}
