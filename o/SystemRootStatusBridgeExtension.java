package o;

import o.MemoryWarningBridgeExtension;
import o.b;

public final class SystemRootStatusBridgeExtension implements getAdapterPosition<isSystemRoot> {
    private final b.C0007b<Constants> getMin;
    private final b.C0007b<setFullScreen> length;
    private final b.C0007b<MemoryWarningBridgeExtension.AnonymousClass1.getMin> setMax;

    private SystemRootStatusBridgeExtension(b.C0007b<MemoryWarningBridgeExtension.AnonymousClass1.getMin> bVar, b.C0007b<setFullScreen> bVar2, b.C0007b<Constants> bVar3) {
        this.setMax = bVar;
        this.length = bVar2;
        this.getMin = bVar3;
    }

    public static SystemRootStatusBridgeExtension length(b.C0007b<MemoryWarningBridgeExtension.AnonymousClass1.getMin> bVar, b.C0007b<setFullScreen> bVar2, b.C0007b<Constants> bVar3) {
        return new SystemRootStatusBridgeExtension(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new isSystemRoot(this.setMax.get(), this.length.get(), this.getMin.get());
    }
}
