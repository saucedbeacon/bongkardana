package o;

import o.b;
import o.setShadowDrawable;

public final class smoothSlideTo implements getAdapterPosition<onPanelDragged> {
    private final b.C0007b<crashDetected> getMax;
    private final b.C0007b<getContentWidth> getMin;
    private final b.C0007b<getAnalyticsMonitorConfig> length;
    private final b.C0007b<setShadowDrawable.setMin> setMin;

    private smoothSlideTo(b.C0007b<setShadowDrawable.setMin> bVar, b.C0007b<getContentWidth> bVar2, b.C0007b<crashDetected> bVar3, b.C0007b<getAnalyticsMonitorConfig> bVar4) {
        this.setMin = bVar;
        this.getMin = bVar2;
        this.getMax = bVar3;
        this.length = bVar4;
    }

    public static smoothSlideTo setMax(b.C0007b<setShadowDrawable.setMin> bVar, b.C0007b<getContentWidth> bVar2, b.C0007b<crashDetected> bVar3, b.C0007b<getAnalyticsMonitorConfig> bVar4) {
        return new smoothSlideTo(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new onPanelDragged(this.setMin.get(), this.getMin.get(), this.getMax.get(), this.length.get());
    }
}
