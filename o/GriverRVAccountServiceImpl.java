package o;

import o.RenderLoadingStatusChangePoint;
import o.b;

public final class GriverRVAccountServiceImpl implements getAdapterPosition<getOuterRootPath> {
    private final b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> globalSearchRepositoryProvider;

    public GriverRVAccountServiceImpl(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        this.globalSearchRepositoryProvider = bVar;
    }

    public final getOuterRootPath get() {
        return newInstance(this.globalSearchRepositoryProvider.get());
    }

    public static GriverRVAccountServiceImpl create(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        return new GriverRVAccountServiceImpl(bVar);
    }

    public static getOuterRootPath newInstance(RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        return new getOuterRootPath(loadingStatusChangeListener);
    }
}
