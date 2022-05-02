package o;

import android.content.Context;
import o.MemoryWarningBridgeExtension;
import o.b;

public final class sendUdpMessage implements getAdapterPosition<SendUPDMessageExtension> {
    private final b.C0007b<Context> getMax;
    private final b.C0007b<MemoryWarningBridgeExtension.getMax> getMin;
    private final b.C0007b<OpenAPIBridgeExtension> length;
    private final b.C0007b<onEmbedViewParamChanged> setMin;

    private sendUdpMessage(b.C0007b<Context> bVar, b.C0007b<MemoryWarningBridgeExtension.getMax> bVar2, b.C0007b<OpenAPIBridgeExtension> bVar3, b.C0007b<onEmbedViewParamChanged> bVar4) {
        this.getMax = bVar;
        this.getMin = bVar2;
        this.length = bVar3;
        this.setMin = bVar4;
    }

    public static sendUdpMessage length(b.C0007b<Context> bVar, b.C0007b<MemoryWarningBridgeExtension.getMax> bVar2, b.C0007b<OpenAPIBridgeExtension> bVar3, b.C0007b<onEmbedViewParamChanged> bVar4) {
        return new sendUdpMessage(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new SendUPDMessageExtension(this.getMax.get(), this.getMin.get(), this.length.get(), this.setMin.get());
    }
}
