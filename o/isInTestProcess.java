package o;

import o.IIPCManager;
import o.b;

public final class isInTestProcess implements getAdapterPosition<isTinyProcess> {
    private final b.C0007b<RVTraceKey> amcsRecipientHomeMenuEntityDataProvider;
    private final b.C0007b<parseColorLong> defaultRecipientHomeMenuEntityDataProvider;
    private final b.C0007b<IIPCManager.Stub> splitSendMoneyHomeMenuEntityDataProvider;

    public isInTestProcess(b.C0007b<RVTraceKey> bVar, b.C0007b<IIPCManager.Stub> bVar2, b.C0007b<parseColorLong> bVar3) {
        this.amcsRecipientHomeMenuEntityDataProvider = bVar;
        this.splitSendMoneyHomeMenuEntityDataProvider = bVar2;
        this.defaultRecipientHomeMenuEntityDataProvider = bVar3;
    }

    public final isTinyProcess get() {
        return newInstance(this.amcsRecipientHomeMenuEntityDataProvider.get(), this.splitSendMoneyHomeMenuEntityDataProvider.get(), this.defaultRecipientHomeMenuEntityDataProvider.get());
    }

    public static isInTestProcess create(b.C0007b<RVTraceKey> bVar, b.C0007b<IIPCManager.Stub> bVar2, b.C0007b<parseColorLong> bVar3) {
        return new isInTestProcess(bVar, bVar2, bVar3);
    }

    public static isTinyProcess newInstance(RVTraceKey rVTraceKey, IIPCManager.Stub stub, parseColorLong parsecolorlong) {
        return new isTinyProcess(rVTraceKey, stub, parsecolorlong);
    }
}
