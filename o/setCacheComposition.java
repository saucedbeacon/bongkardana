package o;

import o.b;

public final class setCacheComposition implements getAdapterPosition<LottieAnimationView> {
    private final b.C0007b<setComposition> mockAutoRouteEntityDataProvider;
    private final b.C0007b<hasMasks> networkAutoRouteEntityDataProvider;

    public setCacheComposition(b.C0007b<hasMasks> bVar, b.C0007b<setComposition> bVar2) {
        this.networkAutoRouteEntityDataProvider = bVar;
        this.mockAutoRouteEntityDataProvider = bVar2;
    }

    public final LottieAnimationView get() {
        return newInstance(this.networkAutoRouteEntityDataProvider.get(), this.mockAutoRouteEntityDataProvider.get());
    }

    public static setCacheComposition create(b.C0007b<hasMasks> bVar, b.C0007b<setComposition> bVar2) {
        return new setCacheComposition(bVar, bVar2);
    }

    public static LottieAnimationView newInstance(hasMasks hasmasks, setComposition setcomposition) {
        return new LottieAnimationView(hasmasks, setcomposition);
    }
}
