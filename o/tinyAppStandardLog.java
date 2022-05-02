package o;

import java.util.List;
import java.util.concurrent.Callable;

final class tinyAppStandardLog implements Callable {
    private final RemoteDebugViewBridgeExtension getMax;
    private final List length;

    public tinyAppStandardLog(RemoteDebugViewBridgeExtension remoteDebugViewBridgeExtension, List list) {
        this.getMax = remoteDebugViewBridgeExtension;
        this.length = list;
    }

    public final Object call() {
        return this.getMax.lambda$updateSplitBillHistories$2(this.length);
    }
}
