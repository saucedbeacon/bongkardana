package o;

import java.util.List;
import java.util.concurrent.Callable;

final class onSocketError implements Callable {
    private final RemoteDebugBridgeExtension getMin;
    private final List length;

    public onSocketError(RemoteDebugBridgeExtension remoteDebugBridgeExtension, List list) {
        this.getMin = remoteDebugBridgeExtension;
        this.length = list;
    }

    public final Object call() {
        return this.getMin.lambda$saveRecentPayers$0(this.length);
    }
}
