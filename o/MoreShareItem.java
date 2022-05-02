package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import kotlin.jvm.functions.Function1;
import o.GriverShareExtensionImpl;

final class MoreShareItem implements Function1 {
    private final GriverShareExtensionImpl.AnonymousClass3 getMin;

    public MoreShareItem(GriverShareExtensionImpl.AnonymousClass3 r1) {
        this.getMin = r1;
    }

    public final Object invoke(Object obj) {
        return updateActionSheetContent.d(DanaLogConstants.TAG.PROFILE_TAG, ((setBeaconParsers) obj).getStatus().toString());
    }
}
