package o;

import android.content.Context;
import o.b;

public final class SimpleBridgeExtension implements getAdapterPosition<BridgeExtensionRegistry> {
    private final b.C0007b<BridgeDSLRegistry> getMin;
    private final b.C0007b<Context> length;
    private final b.C0007b<PluginInstallCallback> setMin;

    private SimpleBridgeExtension(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2, b.C0007b<BridgeDSLRegistry> bVar3) {
        this.length = bVar;
        this.setMin = bVar2;
        this.getMin = bVar3;
    }

    public static SimpleBridgeExtension getMax(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2, b.C0007b<BridgeDSLRegistry> bVar3) {
        return new SimpleBridgeExtension(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new BridgeExtensionRegistry(this.length.get(), this.setMin.get(), this.getMin.get());
    }
}
