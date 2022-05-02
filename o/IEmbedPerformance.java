package o;

import o.CommonBackPerform;

final class IEmbedPerformance implements RedDotDrawable {
    private final CommonBackPerform.AnonymousClass1 getMax;

    public IEmbedPerformance(CommonBackPerform.AnonymousClass1 r1) {
        this.getMax = r1;
    }

    public final Object apply(Object obj) {
        return this.getMax.transform((onSurfaceAvailable) obj);
    }
}
