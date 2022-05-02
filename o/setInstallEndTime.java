package o;

import android.content.Context;
import o.b;

public final class setInstallEndTime implements getAdapterPosition<getDownloadTime> {
    private final b.C0007b<PluginInstallCallback> getMax;
    private final b.C0007b<Context> setMax;

    private setInstallEndTime(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.setMax = bVar;
        this.getMax = bVar2;
    }

    public static setInstallEndTime setMax(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new setInstallEndTime(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new getDownloadTime(this.setMax.get(), this.getMax.get());
    }
}
