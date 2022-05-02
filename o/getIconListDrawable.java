package o;

import o.b;
import o.getTitleIcon_White;

public final class getIconListDrawable implements getAdapterPosition<loadThumbPhoto> {
    private final b.C0007b<getTitleIcon_White.getMin> setMax;
    private final b.C0007b<updateScanPeriods> setMin;

    private getIconListDrawable(b.C0007b<updateScanPeriods> bVar, b.C0007b<getTitleIcon_White.getMin> bVar2) {
        this.setMin = bVar;
        this.setMax = bVar2;
    }

    public static getIconListDrawable setMin(b.C0007b<updateScanPeriods> bVar, b.C0007b<getTitleIcon_White.getMin> bVar2) {
        return new getIconListDrawable(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new loadThumbPhoto(this.setMin.get(), this.setMax.get());
    }
}
