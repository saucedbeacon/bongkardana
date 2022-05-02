package o;

import o.b;

public final class getTabPages implements getAdapterPosition<getTabbarModel> {
    private final b.C0007b<setSelectedColor> hereTokenApiProvider;

    public getTabPages(b.C0007b<setSelectedColor> bVar) {
        this.hereTokenApiProvider = bVar;
    }

    public final getTabbarModel get() {
        return newInstance(this.hereTokenApiProvider.get());
    }

    public static getTabPages create(b.C0007b<setSelectedColor> bVar) {
        return new getTabPages(bVar);
    }

    public static getTabbarModel newInstance(setSelectedColor setselectedcolor) {
        return new getTabbarModel(setselectedcolor);
    }
}
