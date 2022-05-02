package o;

import android.content.Context;
import o.b;

public final class removeAppRecord implements getAdapterPosition<getAppRecord> {
    private final b.C0007b<PluginInstallCallback> length;
    private final b.C0007b<Context> setMin;

    private removeAppRecord(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.setMin = bVar;
        this.length = bVar2;
    }

    public static removeAppRecord getMax(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new removeAppRecord(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new getAppRecord(this.setMin.get(), this.length.get());
    }
}
