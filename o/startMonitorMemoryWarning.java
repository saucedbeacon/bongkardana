package o;

import o.b;

public final class startMonitorMemoryWarning implements getAdapterPosition<getBatteryInfo> {
    private final b.C0007b<onFirstVisuallyRender> setMax;

    private startMonitorMemoryWarning(b.C0007b<onFirstVisuallyRender> bVar) {
        this.setMax = bVar;
    }

    public static startMonitorMemoryWarning setMax(b.C0007b<onFirstVisuallyRender> bVar) {
        return new startMonitorMemoryWarning(bVar);
    }

    public final /* synthetic */ Object get() {
        return new getBatteryInfo(this.setMax.get());
    }
}
