package o;

import java.util.concurrent.Callable;

final class proceed implements Callable {
    private final invokeWithTargetExtensions length;
    private final RemoteNormalExtensionInvoker setMin;

    public proceed(invokeWithTargetExtensions invokewithtargetextensions, RemoteNormalExtensionInvoker remoteNormalExtensionInvoker) {
        this.length = invokewithtargetextensions;
        this.setMin = remoteNormalExtensionInvoker;
    }

    public final Object call() {
        return this.length.lambda$saveRecentBank$0(this.setMin);
    }
}
