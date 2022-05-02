package o;

import o.b;
import o.setParallaxDistance;

public final class setPanelSlideListener implements getAdapterPosition<setCoveredFadeColor> {
    private final b.C0007b<setParallaxDistance.setMin> getMax;
    private final b.C0007b<GriverCreateDialogParam> getMin;
    private final b.C0007b<AccelerometerForH5SensorService> setMin;

    private setPanelSlideListener(b.C0007b<AccelerometerForH5SensorService> bVar, b.C0007b<setParallaxDistance.setMin> bVar2, b.C0007b<GriverCreateDialogParam> bVar3) {
        this.setMin = bVar;
        this.getMax = bVar2;
        this.getMin = bVar3;
    }

    public static setPanelSlideListener setMax(b.C0007b<AccelerometerForH5SensorService> bVar, b.C0007b<setParallaxDistance.setMin> bVar2, b.C0007b<GriverCreateDialogParam> bVar3) {
        return new setPanelSlideListener(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new setCoveredFadeColor(this.setMin.get(), this.getMax.get(), this.getMin.get());
    }
}
