package o;

import o.AddPhoneContactBridgeExtension;
import o.b;

public final class sendHCEMessage implements getAdapterPosition<getHCEState> {
    private final b.C0007b<onEmbedViewAttachedToWebView> getMax;
    private final b.C0007b<notifyBLECharacteristicValueChange> getMin;
    private final b.C0007b<AddPhoneContactBridgeExtension.AnonymousClass3.length> length;
    private final b.C0007b<onUnhandledKeyEvent> setMax;

    private sendHCEMessage(b.C0007b<AddPhoneContactBridgeExtension.AnonymousClass3.length> bVar, b.C0007b<onUnhandledKeyEvent> bVar2, b.C0007b<notifyBLECharacteristicValueChange> bVar3, b.C0007b<onEmbedViewAttachedToWebView> bVar4) {
        this.length = bVar;
        this.setMax = bVar2;
        this.getMin = bVar3;
        this.getMax = bVar4;
    }

    public static sendHCEMessage setMax(b.C0007b<AddPhoneContactBridgeExtension.AnonymousClass3.length> bVar, b.C0007b<onUnhandledKeyEvent> bVar2, b.C0007b<notifyBLECharacteristicValueChange> bVar3, b.C0007b<onEmbedViewAttachedToWebView> bVar4) {
        return new sendHCEMessage(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new getHCEState(this.length.get(), this.setMax.get(), this.getMin.get(), this.getMax.get());
    }
}
