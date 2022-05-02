package o;

import java.util.concurrent.Callable;

final class pending implements Callable {
    private final invokeWithTargetExtensions setMax;

    public pending(invokeWithTargetExtensions invokewithtargetextensions) {
        this.setMax = invokewithtargetextensions;
    }

    public final Object call() {
        return this.setMax.lambda$getOldRecentBank$4();
    }
}
