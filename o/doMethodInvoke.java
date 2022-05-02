package o;

import o.ExtensionOpt;
import o.b;

public final class doMethodInvoke implements getAdapterPosition<reportException> {
    private final b.C0007b<as> amcsQrScanWhitelistConfigProvider;
    private final b.C0007b<ExtensionOpt.MismatchMethodException> mockQrScanWhitelistEntityDataProvider;
    private final b.C0007b<registerProxyGenerator> splitQrScanWhitelistConfigProvider;

    public doMethodInvoke(b.C0007b<registerProxyGenerator> bVar, b.C0007b<as> bVar2, b.C0007b<ExtensionOpt.MismatchMethodException> bVar3) {
        this.splitQrScanWhitelistConfigProvider = bVar;
        this.amcsQrScanWhitelistConfigProvider = bVar2;
        this.mockQrScanWhitelistEntityDataProvider = bVar3;
    }

    public final reportException get() {
        return newInstance(this.splitQrScanWhitelistConfigProvider.get(), this.amcsQrScanWhitelistConfigProvider.get(), this.mockQrScanWhitelistEntityDataProvider.get());
    }

    public static doMethodInvoke create(b.C0007b<registerProxyGenerator> bVar, b.C0007b<as> bVar2, b.C0007b<ExtensionOpt.MismatchMethodException> bVar3) {
        return new doMethodInvoke(bVar, bVar2, bVar3);
    }

    public static reportException newInstance(registerProxyGenerator registerproxygenerator, as asVar, ExtensionOpt.MismatchMethodException mismatchMethodException) {
        return new reportException(registerproxygenerator, asVar, mismatchMethodException);
    }
}
