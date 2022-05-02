package o;

import java.util.concurrent.Callable;

final class showRemoteDebugPanel implements Callable {
    private final sendNetworkResponse getMin;
    private final RemoteDebugViewBridgeExtension length;

    public showRemoteDebugPanel(RemoteDebugViewBridgeExtension remoteDebugViewBridgeExtension, sendNetworkResponse sendnetworkresponse) {
        this.length = remoteDebugViewBridgeExtension;
        this.getMin = sendnetworkresponse;
    }

    public final Object call() {
        return this.length.lambda$saveSplitBillHistory$0(this.getMin);
    }
}
