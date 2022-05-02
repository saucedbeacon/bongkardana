package o;

import o.b;

public final class getBridgeDSL implements getAdapterPosition<BridgeGuard> {
    private final b.C0007b<BridgeExtensionRegistry> setMin;

    private getBridgeDSL(b.C0007b<BridgeExtensionRegistry> bVar) {
        this.setMin = bVar;
    }

    public static getBridgeDSL getMin(b.C0007b<BridgeExtensionRegistry> bVar) {
        return new getBridgeDSL(bVar);
    }

    public final /* synthetic */ Object get() {
        return new BridgeGuard(this.setMin.get());
    }
}
