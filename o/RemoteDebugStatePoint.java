package o;

import java.util.concurrent.Callable;

final class RemoteDebugStatePoint implements Callable {
    private final int setMax;
    private final RemoteDebugBridgeExtension setMin;

    public RemoteDebugStatePoint(RemoteDebugBridgeExtension remoteDebugBridgeExtension, int i) {
        this.setMin = remoteDebugBridgeExtension;
        this.setMax = i;
    }

    public final Object call() {
        return this.setMin.lambda$getRecentPayers$1(this.setMax);
    }
}
