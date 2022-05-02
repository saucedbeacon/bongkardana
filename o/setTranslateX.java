package o;

import o.b;
import o.getScaleY;

public final class setTranslateX implements getAdapterPosition<getTranslateX> {
    private final b.C0007b<APWebViewListener> getMin;
    private final b.C0007b<getScaleY.getMin> length;
    private final b.C0007b<notifyBLECharacteristicValueChange> setMax;
    private final b.C0007b<onReceivedHttpAuthRequest> setMin;

    private setTranslateX(b.C0007b<getScaleY.getMin> bVar, b.C0007b<APWebViewListener> bVar2, b.C0007b<onReceivedHttpAuthRequest> bVar3, b.C0007b<notifyBLECharacteristicValueChange> bVar4) {
        this.length = bVar;
        this.getMin = bVar2;
        this.setMin = bVar3;
        this.setMax = bVar4;
    }

    public static setTranslateX setMin(b.C0007b<getScaleY.getMin> bVar, b.C0007b<APWebViewListener> bVar2, b.C0007b<onReceivedHttpAuthRequest> bVar3, b.C0007b<notifyBLECharacteristicValueChange> bVar4) {
        return new setTranslateX(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new getTranslateX(this.length.get(), this.getMin.get(), this.setMin.get(), this.setMax.get());
    }
}
