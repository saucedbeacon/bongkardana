package o;

import o.RenderLoadingStatusChangePoint;
import o.b;

public final class registerStatusListener implements getAdapterPosition<onLoadingStatusChanged> {
    private final b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> repositoryProvider;

    public registerStatusListener(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        this.repositoryProvider = bVar;
    }

    public final onLoadingStatusChanged get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static registerStatusListener create(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        return new registerStatusListener(bVar);
    }

    public static onLoadingStatusChanged newInstance(RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        return new onLoadingStatusChanged(loadingStatusChangeListener);
    }
}
