package o;

import o.b;
import o.setTrimPathOffset;

public final class getScaleX implements getAdapterPosition<getLocalMatrix> {
    private final b.C0007b<setTrimPathOffset.setMin> getMin;
    private final b.C0007b<notifyBLECharacteristicValueChange> length;
    private final b.C0007b<onUnhandledKeyEvent> setMax;
    private final b.C0007b<onEmbedViewAttachedToWebView> setMin;

    private getScaleX(b.C0007b<setTrimPathOffset.setMin> bVar, b.C0007b<onUnhandledKeyEvent> bVar2, b.C0007b<notifyBLECharacteristicValueChange> bVar3, b.C0007b<onEmbedViewAttachedToWebView> bVar4) {
        this.getMin = bVar;
        this.setMax = bVar2;
        this.length = bVar3;
        this.setMin = bVar4;
    }

    public static getScaleX getMax(b.C0007b<setTrimPathOffset.setMin> bVar, b.C0007b<onUnhandledKeyEvent> bVar2, b.C0007b<notifyBLECharacteristicValueChange> bVar3, b.C0007b<onEmbedViewAttachedToWebView> bVar4) {
        return new getScaleX(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new getLocalMatrix(this.getMin.get(), this.setMax.get(), this.length.get(), this.setMin.get());
    }
}
