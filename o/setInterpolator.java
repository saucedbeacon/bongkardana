package o;

import o.AutoTransition;
import o.LocationBridgeExtension;
import o.b;

public final class setInterpolator implements getAdapterPosition<setStartDelay> {
    private final b.C0007b<AutoTransition.setMax> getMax;
    private final b.C0007b<LocationBridgeExtension.AnonymousClass2> getMin;
    private final b.C0007b<GriverCreateDialogParam> setMax;
    private final b.C0007b<onMessage> setMin;

    private setInterpolator(b.C0007b<AutoTransition.setMax> bVar, b.C0007b<onMessage> bVar2, b.C0007b<LocationBridgeExtension.AnonymousClass2> bVar3, b.C0007b<GriverCreateDialogParam> bVar4) {
        this.getMax = bVar;
        this.setMin = bVar2;
        this.getMin = bVar3;
        this.setMax = bVar4;
    }

    public static setInterpolator setMin(b.C0007b<AutoTransition.setMax> bVar, b.C0007b<onMessage> bVar2, b.C0007b<LocationBridgeExtension.AnonymousClass2> bVar3, b.C0007b<GriverCreateDialogParam> bVar4) {
        return new setInterpolator(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new setStartDelay(this.getMax.get(), this.setMin.get(), this.getMin.get(), this.setMax.get());
    }
}
