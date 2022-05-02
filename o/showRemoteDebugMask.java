package o;

import java.util.concurrent.Callable;

final class showRemoteDebugMask implements Callable {
    private final RemoteDebugViewBridgeExtension setMax;

    public showRemoteDebugMask(RemoteDebugViewBridgeExtension remoteDebugViewBridgeExtension) {
        this.setMax = remoteDebugViewBridgeExtension;
    }

    public final Object call() {
        return this.setMax.lambda$getSplitBillHistories$1();
    }
}
