package o;

import o.b;

public final class onPageDestroy implements getAdapterPosition<PageExitInterceptPoint> {
    private final b.C0007b<PageExitPoint> localPoiEntityDataProvider;
    private final b.C0007b<onPageInit> networkPoiEntityDataProvider;

    public onPageDestroy(b.C0007b<onPageInit> bVar, b.C0007b<PageExitPoint> bVar2) {
        this.networkPoiEntityDataProvider = bVar;
        this.localPoiEntityDataProvider = bVar2;
    }

    public final PageExitInterceptPoint get() {
        return newInstance(this.networkPoiEntityDataProvider.get(), this.localPoiEntityDataProvider.get());
    }

    public static onPageDestroy create(b.C0007b<onPageInit> bVar, b.C0007b<PageExitPoint> bVar2) {
        return new onPageDestroy(bVar, bVar2);
    }

    public static PageExitInterceptPoint newInstance(onPageInit onpageinit, PageExitPoint pageExitPoint) {
        return new PageExitInterceptPoint(onpageinit, pageExitPoint);
    }
}
