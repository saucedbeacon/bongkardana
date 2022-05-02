package o;

import o.RenderLoadingStatusChangePoint;
import o.b;

public final class ImageLoader implements getAdapterPosition<GriverAccount> {
    private final b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> globalSearchRepositoryProvider;

    public ImageLoader(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        this.globalSearchRepositoryProvider = bVar;
    }

    public final GriverAccount get() {
        return newInstance(this.globalSearchRepositoryProvider.get());
    }

    public static ImageLoader create(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        return new ImageLoader(bVar);
    }

    public static GriverAccount newInstance(RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        return new GriverAccount(loadingStatusChangeListener);
    }
}
