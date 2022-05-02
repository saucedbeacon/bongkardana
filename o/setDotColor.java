package o;

import android.content.Context;
import o.b;

public final class setDotColor implements getAdapterPosition<getSmallDotView> {
    private final b.C0007b<Context> length;
    private final b.C0007b<PluginInstallCallback> setMax;

    private setDotColor(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.length = bVar;
        this.setMax = bVar2;
    }

    public static setDotColor setMax(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new setDotColor(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new getSmallDotView(this.length.get(), this.setMax.get());
    }
}
