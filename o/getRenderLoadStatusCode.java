package o;

import o.RenderLoadingStatusChangePoint;
import o.b;

public final class getRenderLoadStatusCode implements getAdapterPosition<unRegisterStatusListener> {
    private final b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> globalSearchRepositoryProvider;

    public getRenderLoadStatusCode(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        this.globalSearchRepositoryProvider = bVar;
    }

    public final unRegisterStatusListener get() {
        return newInstance(this.globalSearchRepositoryProvider.get());
    }

    public static getRenderLoadStatusCode create(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        return new getRenderLoadStatusCode(bVar);
    }

    public static unRegisterStatusListener newInstance(RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        return new unRegisterStatusListener(loadingStatusChangeListener);
    }
}
