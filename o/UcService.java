package o;

import o.RenderLoadingStatusChangePoint;
import o.b;

public final class UcService implements getAdapterPosition<ShouldLoadUrlPoint> {
    private final b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> globalSearchRepositoryProvider;

    public final class UCInitListener implements getAdapterPosition<shouldLoad> {
        private final b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> globalSearchRepositoryProvider;

        public UCInitListener(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
            this.globalSearchRepositoryProvider = bVar;
        }

        public final shouldLoad get() {
            return newInstance(this.globalSearchRepositoryProvider.get());
        }

        public static UCInitListener create(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
            return new UCInitListener(bVar);
        }

        public static shouldLoad newInstance(RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
            return new shouldLoad(loadingStatusChangeListener);
        }
    }

    public UcService(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        this.globalSearchRepositoryProvider = bVar;
    }

    public final ShouldLoadUrlPoint get() {
        return newInstance(this.globalSearchRepositoryProvider.get());
    }

    public static UcService create(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        return new UcService(bVar);
    }

    public static ShouldLoadUrlPoint newInstance(RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        return new ShouldLoadUrlPoint(loadingStatusChangeListener);
    }
}
