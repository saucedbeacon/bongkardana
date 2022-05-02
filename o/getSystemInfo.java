package o;

import o.OrientationDetector;
import o.b;

public final class getSystemInfo implements getAdapterPosition<parseBatteryPercentage> {
    private final b.C0007b<OrientationDetector.OrientationListener> setMax;

    private getSystemInfo(b.C0007b<OrientationDetector.OrientationListener> bVar) {
        this.setMax = bVar;
    }

    public static getSystemInfo setMax(b.C0007b<OrientationDetector.OrientationListener> bVar) {
        return new getSystemInfo(bVar);
    }

    public final /* synthetic */ Object get() {
        return new parseBatteryPercentage(this.setMax.get());
    }
}
