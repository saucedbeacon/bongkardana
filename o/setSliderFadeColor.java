package o;

import id.dana.challenge.pinwithface.ChallengePinWithFaceModule;
import o.b;
import o.setParallaxDistance;

public final class setSliderFadeColor implements getAdapterPosition<setParallaxDistance.length> {
    private final ChallengePinWithFaceModule setMax;
    private final b.C0007b<setCoveredFadeColor> setMin;

    private setSliderFadeColor(ChallengePinWithFaceModule challengePinWithFaceModule, b.C0007b<setCoveredFadeColor> bVar) {
        this.setMax = challengePinWithFaceModule;
        this.setMin = bVar;
    }

    public static setSliderFadeColor setMax(ChallengePinWithFaceModule challengePinWithFaceModule, b.C0007b<setCoveredFadeColor> bVar) {
        return new setSliderFadeColor(challengePinWithFaceModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setParallaxDistance.length length = this.setMax.length(this.setMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
