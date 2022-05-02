package o;

import o.b;

public final class createPermissionExtensionInvoker implements getAdapterPosition<SinglePageAppContext> {
    private final b.C0007b<onUpdateFail> networkPaymentAuthenticationEntityDataProvider;

    public createPermissionExtensionInvoker(b.C0007b<onUpdateFail> bVar) {
        this.networkPaymentAuthenticationEntityDataProvider = bVar;
    }

    public final SinglePageAppContext get() {
        return newInstance(this.networkPaymentAuthenticationEntityDataProvider.get());
    }

    public static createPermissionExtensionInvoker create(b.C0007b<onUpdateFail> bVar) {
        return new createPermissionExtensionInvoker(bVar);
    }

    public static SinglePageAppContext newInstance(onUpdateFail onupdatefail) {
        return new SinglePageAppContext(onupdatefail);
    }
}
