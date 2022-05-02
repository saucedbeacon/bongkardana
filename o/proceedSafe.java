package o;

import java.util.concurrent.Callable;

final class proceedSafe implements Callable {
    private final invokeWithTargetExtensions length;

    public proceedSafe(invokeWithTargetExtensions invokewithtargetextensions) {
        this.length = invokewithtargetextensions;
    }

    public final Object call() {
        return this.length.lambda$getRecentBank$2();
    }
}
