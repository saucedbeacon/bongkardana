package o;

import java.util.concurrent.Callable;

final class RemoteDebugMessageUtils implements Callable {
    private final RemoteDebugViewBridgeExtension setMax;
    private final sendNetworkResponse setMin;

    public RemoteDebugMessageUtils(RemoteDebugViewBridgeExtension remoteDebugViewBridgeExtension, sendNetworkResponse sendnetworkresponse) {
        this.setMax = remoteDebugViewBridgeExtension;
        this.setMin = sendnetworkresponse;
    }

    public final Object call() {
        return this.setMax.lambda$updateSplitBillDetail$4(this.setMin);
    }
}
