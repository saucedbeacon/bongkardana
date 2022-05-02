package o;

import o.b;

public final class sendBack implements getAdapterPosition<EventPoint> {
    private final b.C0007b<APWebViewPerformance> geocodeRepositoryProvider;

    public sendBack(b.C0007b<APWebViewPerformance> bVar) {
        this.geocodeRepositoryProvider = bVar;
    }

    public final EventPoint get() {
        return newInstance(this.geocodeRepositoryProvider.get());
    }

    public static sendBack create(b.C0007b<APWebViewPerformance> bVar) {
        return new sendBack(bVar);
    }

    public static EventPoint newInstance(APWebViewPerformance aPWebViewPerformance) {
        return new EventPoint(aPWebViewPerformance);
    }
}
