package o;

import o.b;

public final class getHandlerName implements getAdapterPosition<doCheckPermission> {
    private final b.C0007b<dispatch> amcsConfigOpenBankAccountEntityDataProvider;
    private final b.C0007b<DefaultBridgeCallback> defaultConfigOpenBankAccountEntityDataProvider;

    public getHandlerName(b.C0007b<dispatch> bVar, b.C0007b<DefaultBridgeCallback> bVar2) {
        this.amcsConfigOpenBankAccountEntityDataProvider = bVar;
        this.defaultConfigOpenBankAccountEntityDataProvider = bVar2;
    }

    public final doCheckPermission get() {
        return newInstance(this.amcsConfigOpenBankAccountEntityDataProvider.get(), this.defaultConfigOpenBankAccountEntityDataProvider.get());
    }

    public static getHandlerName create(b.C0007b<dispatch> bVar, b.C0007b<DefaultBridgeCallback> bVar2) {
        return new getHandlerName(bVar, bVar2);
    }

    public static doCheckPermission newInstance(dispatch dispatch, DefaultBridgeCallback defaultBridgeCallback) {
        return new doCheckPermission(dispatch, defaultBridgeCallback);
    }
}
