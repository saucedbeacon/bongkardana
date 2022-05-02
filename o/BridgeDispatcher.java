package o;

import o.b;

public final class BridgeDispatcher implements getAdapterPosition<getRaw> {
    private final b.C0007b<AnonymousClass1> mockOpenBankAccountEntityDataProvider;
    private final b.C0007b<getMethodInvokeOptimizer> networkOpenBankAccountEntityDataProvider;

    public BridgeDispatcher(b.C0007b<getMethodInvokeOptimizer> bVar, b.C0007b<AnonymousClass1> bVar2) {
        this.networkOpenBankAccountEntityDataProvider = bVar;
        this.mockOpenBankAccountEntityDataProvider = bVar2;
    }

    public final getRaw get() {
        return newInstance(this.networkOpenBankAccountEntityDataProvider.get(), this.mockOpenBankAccountEntityDataProvider.get());
    }

    public static BridgeDispatcher create(b.C0007b<getMethodInvokeOptimizer> bVar, b.C0007b<AnonymousClass1> bVar2) {
        return new BridgeDispatcher(bVar, bVar2);
    }

    public static getRaw newInstance(getMethodInvokeOptimizer getmethodinvokeoptimizer, AnonymousClass1 r2) {
        return new getRaw(getmethodinvokeoptimizer, r2);
    }
}
