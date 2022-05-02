package o;

import o.b;

public final class setApplyingOpacityToLayersEnabled implements getAdapterPosition<pauseAnimation> {
    private final b.C0007b<setFrame> cardPreferencesProvider;

    public setApplyingOpacityToLayersEnabled(b.C0007b<setFrame> bVar) {
        this.cardPreferencesProvider = bVar;
    }

    public final pauseAnimation get() {
        return newInstance(this.cardPreferencesProvider.get());
    }

    public static setApplyingOpacityToLayersEnabled create(b.C0007b<setFrame> bVar) {
        return new setApplyingOpacityToLayersEnabled(bVar);
    }

    public static pauseAnimation newInstance(setFrame setframe) {
        return new pauseAnimation(setframe);
    }
}
