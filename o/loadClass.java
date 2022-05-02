package o;

import android.content.Context;
import o.b;

public final class loadClass implements getAdapterPosition<BridgeDSLRegistry> {
    private final b.C0007b<PluginInstallCallback> getMax;
    private final b.C0007b<Context> setMax;

    private loadClass(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.setMax = bVar;
        this.getMax = bVar2;
    }

    public static loadClass length(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new loadClass(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new BridgeDSLRegistry(this.setMax.get(), this.getMax.get());
    }
}
