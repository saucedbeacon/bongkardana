package o;

import kotlin.jvm.functions.Function1;

final class pageEnd implements Function1 {
    public static final pageEnd getMax = new pageEnd();

    public final Object invoke(Object obj) {
        return updateActionSheetContent.e(GriverExtensionRegistry.class.getSimpleName(), ((Throwable) obj).getMessage());
    }
}
