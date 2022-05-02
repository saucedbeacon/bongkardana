package o;

import o.b;

public final class invokeZoomPicker implements getAdapterPosition<freeMemory> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;

    public invokeZoomPicker(b.C0007b<setDefaultFontSize> bVar) {
        this.featureConfigRepositoryProvider = bVar;
    }

    public final freeMemory get() {
        return newInstance(this.featureConfigRepositoryProvider.get());
    }

    public static invokeZoomPicker create(b.C0007b<setDefaultFontSize> bVar) {
        return new invokeZoomPicker(bVar);
    }

    public static freeMemory newInstance(setDefaultFontSize setdefaultfontsize) {
        return new freeMemory(setdefaultfontsize);
    }
}
