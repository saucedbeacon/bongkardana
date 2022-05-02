package o;

import o.b;

public final class access$302 implements getAdapterPosition<registerProxyGenerator> {
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public access$302(b.C0007b<UpdateAppCallback> bVar) {
        this.splitFacadeProvider = bVar;
    }

    public final registerProxyGenerator get() {
        return newInstance(this.splitFacadeProvider.get());
    }

    public static access$302 create(b.C0007b<UpdateAppCallback> bVar) {
        return new access$302(bVar);
    }

    public static registerProxyGenerator newInstance(UpdateAppCallback updateAppCallback) {
        return new registerProxyGenerator(updateAppCallback);
    }
}
