package o;

import java.util.concurrent.Callable;

final class access$102 implements Callable {
    private final String getMax;
    private final invokeWithTargetExtensions getMin;
    private final int length;
    private final RemoteNormalExtensionInvoker setMax;

    public access$102(invokeWithTargetExtensions invokewithtargetextensions, String str, RemoteNormalExtensionInvoker remoteNormalExtensionInvoker, int i) {
        this.getMin = invokewithtargetextensions;
        this.getMax = str;
        this.setMax = remoteNormalExtensionInvoker;
        this.length = i;
    }

    public final Object call() {
        return this.getMin.lambda$removeAndUpdateRecentBank$5(this.getMax, this.setMax, this.length);
    }
}
