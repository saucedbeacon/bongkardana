package o;

import o.RVManifest;
import o.b;

public final class getOuterPage implements getAdapterPosition<RVManifest.LazyProxyManifest> {
    private final b.C0007b<getViewId> playStoreReviewPreferenceProvider;

    public getOuterPage(b.C0007b<getViewId> bVar) {
        this.playStoreReviewPreferenceProvider = bVar;
    }

    public final RVManifest.LazyProxyManifest get() {
        return newInstance(this.playStoreReviewPreferenceProvider.get());
    }

    public static getOuterPage create(b.C0007b<getViewId> bVar) {
        return new getOuterPage(bVar);
    }

    public static RVManifest.LazyProxyManifest newInstance(getViewId getviewid) {
        return new RVManifest.LazyProxyManifest(getviewid);
    }
}
