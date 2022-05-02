package o;

import o.b;

public final class isCompress implements getAdapterPosition<getGwUrl> {
    private final b.C0007b<isGetMethod> defaultConfigEntityDataProvider;
    private final b.C0007b<region> splitConfigEntityDataProvider;

    public isCompress(b.C0007b<region> bVar, b.C0007b<isGetMethod> bVar2) {
        this.splitConfigEntityDataProvider = bVar;
        this.defaultConfigEntityDataProvider = bVar2;
    }

    public final getGwUrl get() {
        return newInstance(this.splitConfigEntityDataProvider.get(), this.defaultConfigEntityDataProvider.get());
    }

    public static isCompress create(b.C0007b<region> bVar, b.C0007b<isGetMethod> bVar2) {
        return new isCompress(bVar, bVar2);
    }

    public static getGwUrl newInstance(region region, isGetMethod isgetmethod) {
        return new getGwUrl(region, isgetmethod);
    }
}
