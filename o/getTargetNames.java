package o;

import kotlin.jvm.functions.Function1;

final class getTargetNames implements Function1 {
    public static final getTargetNames length = new getTargetNames();

    public final Object invoke(Object obj) {
        return updateActionSheetContent.e(getTargets.class.getSimpleName(), "Fail to get whitelisted domain", (Throwable) obj);
    }
}
