package o;

import o.b;
import o.setLeftButtonFont;

public final class setColorOriginalStyle implements getAdapterPosition<setColorWhiteStyle> {
    private final b.C0007b<setLeftButtonFont.setMin> getMax;
    private final b.C0007b<updateTrackingHashes> getMin;
    private final b.C0007b<AbstractAndroidLogger> length;
    private final b.C0007b<doInBackground> setMin;

    private setColorOriginalStyle(b.C0007b<setLeftButtonFont.setMin> bVar, b.C0007b<updateTrackingHashes> bVar2, b.C0007b<doInBackground> bVar3, b.C0007b<AbstractAndroidLogger> bVar4) {
        this.getMax = bVar;
        this.getMin = bVar2;
        this.setMin = bVar3;
        this.length = bVar4;
    }

    public static setColorOriginalStyle getMax(b.C0007b<setLeftButtonFont.setMin> bVar, b.C0007b<updateTrackingHashes> bVar2, b.C0007b<doInBackground> bVar3, b.C0007b<AbstractAndroidLogger> bVar4) {
        return new setColorOriginalStyle(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new setColorWhiteStyle(this.getMax.get(), this.getMin.get(), this.setMin.get(), this.length.get());
    }
}
