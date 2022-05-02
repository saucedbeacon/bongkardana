package o;

import o.b;

public final class getByInstanceId implements getAdapterPosition<removeProxy> {
    private final b.C0007b<node> systemUtilsProvider;

    public getByInstanceId(b.C0007b<node> bVar) {
        this.systemUtilsProvider = bVar;
    }

    public final removeProxy get() {
        return newInstance(this.systemUtilsProvider.get());
    }

    public static getByInstanceId create(b.C0007b<node> bVar) {
        return new getByInstanceId(bVar);
    }

    public static removeProxy newInstance(node node) {
        return new removeProxy(node);
    }
}
