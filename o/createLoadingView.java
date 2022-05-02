package o;

import o.DefaultEmbedViewManager;
import o.b;

public final class createLoadingView implements getAdapterPosition<createErrorView> {
    private final b.C0007b<isConfigSupport> amcsGnConfigEntityDataProvider;
    private final b.C0007b<getTabBarHeightSpec> preferenceGnConfigEntityDataProvider;
    private final b.C0007b<DefaultEmbedViewManager.AnonymousClass1> splitGnConfigEntityDataProvider;

    public createLoadingView(b.C0007b<DefaultEmbedViewManager.AnonymousClass1> bVar, b.C0007b<isConfigSupport> bVar2, b.C0007b<getTabBarHeightSpec> bVar3) {
        this.splitGnConfigEntityDataProvider = bVar;
        this.amcsGnConfigEntityDataProvider = bVar2;
        this.preferenceGnConfigEntityDataProvider = bVar3;
    }

    public final createErrorView get() {
        return newInstance(this.splitGnConfigEntityDataProvider.get(), this.amcsGnConfigEntityDataProvider.get(), this.preferenceGnConfigEntityDataProvider.get());
    }

    public static createLoadingView create(b.C0007b<DefaultEmbedViewManager.AnonymousClass1> bVar, b.C0007b<isConfigSupport> bVar2, b.C0007b<getTabBarHeightSpec> bVar3) {
        return new createLoadingView(bVar, bVar2, bVar3);
    }

    public static createErrorView newInstance(DefaultEmbedViewManager.AnonymousClass1 r1, isConfigSupport isconfigsupport, getTabBarHeightSpec gettabbarheightspec) {
        return new createErrorView(r1, isconfigsupport, gettabbarheightspec);
    }
}
