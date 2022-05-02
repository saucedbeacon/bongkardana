package o;

import o.RenderLoadingStatusChangePoint;
import o.b;

public final class goForward implements getAdapterPosition<evaluateJavascript> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;
    private final b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> globalSearchRepositoryProvider;
    private final b.C0007b<toUuidString> servicesRepositoryProvider;

    public goForward(b.C0007b<setDefaultFontSize> bVar, b.C0007b<toUuidString> bVar2, b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar3) {
        this.featureConfigRepositoryProvider = bVar;
        this.servicesRepositoryProvider = bVar2;
        this.globalSearchRepositoryProvider = bVar3;
    }

    public final evaluateJavascript get() {
        return newInstance(this.featureConfigRepositoryProvider.get(), this.servicesRepositoryProvider.get(), this.globalSearchRepositoryProvider.get());
    }

    public static goForward create(b.C0007b<setDefaultFontSize> bVar, b.C0007b<toUuidString> bVar2, b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> bVar3) {
        return new goForward(bVar, bVar2, bVar3);
    }

    public static evaluateJavascript newInstance(setDefaultFontSize setdefaultfontsize, toUuidString touuidstring, RenderLoadingStatusChangePoint.LoadingStatusChangeListener loadingStatusChangeListener) {
        return new evaluateJavascript(setdefaultfontsize, touuidstring, loadingStatusChangeListener);
    }
}
