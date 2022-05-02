package o;

import o.b;

public final class localIdToBytes implements getAdapterPosition<requestAppWithAppId> {
    private final b.C0007b<GriverPrepareInterceptor> qrBarcodeRepositoryProvider;

    public localIdToBytes(b.C0007b<GriverPrepareInterceptor> bVar) {
        this.qrBarcodeRepositoryProvider = bVar;
    }

    public final requestAppWithAppId get() {
        return newInstance(this.qrBarcodeRepositoryProvider.get());
    }

    public static localIdToBytes create(b.C0007b<GriverPrepareInterceptor> bVar) {
        return new localIdToBytes(bVar);
    }

    public static requestAppWithAppId newInstance(GriverPrepareInterceptor griverPrepareInterceptor) {
        return new requestAppWithAppId(griverPrepareInterceptor);
    }
}
