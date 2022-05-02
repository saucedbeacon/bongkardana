package o;

import o.R;
import o.b;

public final class isPageLoaded implements getAdapterPosition<setPageLoaded> {
    private final b.C0007b<R.raw> branchGenerateLinkEntityDataProvider;
    private final b.C0007b<handleStartClientBundleNull> preferencesGenerateLinkEntityDataProvider;

    public isPageLoaded(b.C0007b<R.raw> bVar, b.C0007b<handleStartClientBundleNull> bVar2) {
        this.branchGenerateLinkEntityDataProvider = bVar;
        this.preferencesGenerateLinkEntityDataProvider = bVar2;
    }

    public final setPageLoaded get() {
        return newInstance(this.branchGenerateLinkEntityDataProvider.get(), this.preferencesGenerateLinkEntityDataProvider.get());
    }

    public static isPageLoaded create(b.C0007b<R.raw> bVar, b.C0007b<handleStartClientBundleNull> bVar2) {
        return new isPageLoaded(bVar, bVar2);
    }

    public static setPageLoaded newInstance(R.raw raw, handleStartClientBundleNull handlestartclientbundlenull) {
        return new setPageLoaded(raw, handlestartclientbundlenull);
    }
}
