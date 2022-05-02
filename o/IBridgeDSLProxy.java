package o;

import o.b;

public final class IBridgeDSLProxy implements getAdapterPosition<authority> {
    private final b.C0007b<BridgeGuard> getMin;

    private IBridgeDSLProxy(b.C0007b<BridgeGuard> bVar) {
        this.getMin = bVar;
    }

    public static IBridgeDSLProxy getMax(b.C0007b<BridgeGuard> bVar) {
        return new IBridgeDSLProxy(bVar);
    }

    public final /* synthetic */ Object get() {
        return new authority(this.getMin.get());
    }
}
