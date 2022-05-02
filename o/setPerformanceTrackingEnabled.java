package o;

import o.b;

public final class setPerformanceTrackingEnabled implements getAdapterPosition<cancelAnimation> {
    private final b.C0007b<pauseAnimation> cardPreferencesDataFactoryProvider;

    public setPerformanceTrackingEnabled(b.C0007b<pauseAnimation> bVar) {
        this.cardPreferencesDataFactoryProvider = bVar;
    }

    public final cancelAnimation get() {
        return newInstance(this.cardPreferencesDataFactoryProvider.get());
    }

    public static setPerformanceTrackingEnabled create(b.C0007b<pauseAnimation> bVar) {
        return new setPerformanceTrackingEnabled(bVar);
    }

    public static cancelAnimation newInstance(pauseAnimation pauseanimation) {
        return new cancelAnimation(pauseanimation);
    }
}
