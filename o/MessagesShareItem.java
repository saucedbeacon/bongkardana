package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import kotlin.jvm.functions.Function1;
import o.GriverShareExtensionImpl;

final class MessagesShareItem implements Function1 {
    private final GriverShareExtensionImpl.AnonymousClass3 length;

    public MessagesShareItem(GriverShareExtensionImpl.AnonymousClass3 r1) {
        this.length = r1;
    }

    public final Object invoke(Object obj) {
        return updateActionSheetContent.e(DanaLogConstants.TAG.PROFILE_TAG, GriverShareExtensionImpl.AnonymousClass3.class.getName(), (Exception) obj);
    }
}
