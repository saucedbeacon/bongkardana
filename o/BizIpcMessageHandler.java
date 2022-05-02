package o;

import o.WorkerBridgeExtension;

final class BizIpcMessageHandler implements RedDotManager {
    private final WorkerBridgeExtension.AnonymousClass1 setMax;

    public BizIpcMessageHandler(WorkerBridgeExtension.AnonymousClass1 r1) {
        this.setMax = r1;
    }

    public final void accept(Object obj) {
        this.setMax.setMax = (appxrpc) obj;
    }
}
