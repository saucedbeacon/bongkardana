package o;

import o.b;

public final class fail implements getAdapterPosition<createSplashFragment> {
    private final b.C0007b<GriverSplashFragmentExtension> faceAuthenticationRepositoryProvider;

    public fail(b.C0007b<GriverSplashFragmentExtension> bVar) {
        this.faceAuthenticationRepositoryProvider = bVar;
    }

    public final createSplashFragment get() {
        return newInstance(this.faceAuthenticationRepositoryProvider.get());
    }

    public static fail create(b.C0007b<GriverSplashFragmentExtension> bVar) {
        return new fail(bVar);
    }

    public static createSplashFragment newInstance(GriverSplashFragmentExtension griverSplashFragmentExtension) {
        return new createSplashFragment(griverSplashFragmentExtension);
    }
}
