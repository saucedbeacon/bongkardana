package o;

import o.RenderLoadingStatusChangePoint;
import o.b;

public final class OutFilePathProxy implements getAdapterPosition<onImage> {
    private final b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> globalSearchRepositoryProvider;

    public OutFilePathProxy(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        this.globalSearchRepositoryProvider = bVar;
    }

    public final onImage get() {
        return newInstance(this.globalSearchRepositoryProvider.get());
    }

    public static OutFilePathProxy create(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        return new OutFilePathProxy(bVar);
    }

    public static onImage newInstance(RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        return new onImage(loadingStatusChangeListener);
    }
}
