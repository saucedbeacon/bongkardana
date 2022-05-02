package o;

import o.b;

public final class getBridgeContext implements getAdapterPosition<getList> {
    private final b.C0007b<generateKey> okHttpClientProvider;

    public getBridgeContext(b.C0007b<generateKey> bVar) {
        this.okHttpClientProvider = bVar;
    }

    public final getList get() {
        return newInstance(this.okHttpClientProvider.get());
    }

    public static getBridgeContext create(b.C0007b<generateKey> bVar) {
        return new getBridgeContext(bVar);
    }

    public static getList newInstance(generateKey generatekey) {
        return new getList(generatekey);
    }
}
