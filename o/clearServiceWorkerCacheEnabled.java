package o;

import o.RenderLoadingStatusChangePoint;
import o.b;

public final class clearServiceWorkerCacheEnabled implements getAdapterPosition<createWebViewForNebulaX> {
    private final b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> globalSearchRepositoryProvider;

    public clearServiceWorkerCacheEnabled(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        this.globalSearchRepositoryProvider = bVar;
    }

    public final createWebViewForNebulaX get() {
        return newInstance(this.globalSearchRepositoryProvider.get());
    }

    public static clearServiceWorkerCacheEnabled create(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        return new clearServiceWorkerCacheEnabled(bVar);
    }

    public static createWebViewForNebulaX newInstance(RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        return new createWebViewForNebulaX(loadingStatusChangeListener);
    }
}
