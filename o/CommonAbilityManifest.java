package o;

import o.RenderLoadingStatusChangePoint;
import o.b;

public final class CommonAbilityManifest implements getAdapterPosition<addInitSuccessListener> {
    private final b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> globalSearchRepositoryProvider;

    public CommonAbilityManifest(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        this.globalSearchRepositoryProvider = bVar;
    }

    public final addInitSuccessListener get() {
        return newInstance(this.globalSearchRepositoryProvider.get());
    }

    public static CommonAbilityManifest create(b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar) {
        return new CommonAbilityManifest(bVar);
    }

    public static addInitSuccessListener newInstance(RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        return new addInitSuccessListener(loadingStatusChangeListener);
    }
}
