package o;

import android.content.Context;
import o.b;
import o.onFrameData;

public final class startPreview implements getAdapterPosition<afterReopen> {
    private final b.C0007b<Context> getMax;
    private final b.C0007b<notifyCharacteristicValue> getMin;
    private final b.C0007b<setMultiFrameBeacon> length;
    private final b.C0007b<onFrameData.getMin> setMax;
    private final b.C0007b<setDataFields> setMin;

    private startPreview(b.C0007b<onFrameData.getMin> bVar, b.C0007b<Context> bVar2, b.C0007b<notifyCharacteristicValue> bVar3, b.C0007b<setDataFields> bVar4, b.C0007b<setMultiFrameBeacon> bVar5) {
        this.setMax = bVar;
        this.getMax = bVar2;
        this.getMin = bVar3;
        this.setMin = bVar4;
        this.length = bVar5;
    }

    public static startPreview getMin(b.C0007b<onFrameData.getMin> bVar, b.C0007b<Context> bVar2, b.C0007b<notifyCharacteristicValue> bVar3, b.C0007b<setDataFields> bVar4, b.C0007b<setMultiFrameBeacon> bVar5) {
        return new startPreview(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new afterReopen(this.setMax.get(), this.getMax.get(), this.getMin.get(), this.setMin.get(), this.length.get());
    }
}
