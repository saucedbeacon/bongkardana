package o;

import kotlin.jvm.functions.Function1;

final class getSpmId implements Function1 {
    public static final getSpmId getMin = new getSpmId();

    public final Object invoke(Object obj) {
        return updateActionSheetContent.e(GriverExtensionRegistry.class.getSimpleName(), ((Throwable) obj).getMessage());
    }
}
