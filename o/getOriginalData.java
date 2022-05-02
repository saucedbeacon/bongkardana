package o;

import android.content.Context;
import o.b;

public final class getOriginalData implements getAdapterPosition<getAppxDomain> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setCallMode> nearbyMePreferencesProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public getOriginalData(b.C0007b<Context> bVar, b.C0007b<setCallMode> bVar2, b.C0007b<PluginInstallCallback> bVar3) {
        this.contextProvider = bVar;
        this.nearbyMePreferencesProvider = bVar2;
        this.serializerProvider = bVar3;
    }

    public final getAppxDomain get() {
        return newInstance(this.contextProvider.get(), this.nearbyMePreferencesProvider.get(), this.serializerProvider.get());
    }

    public static getOriginalData create(b.C0007b<Context> bVar, b.C0007b<setCallMode> bVar2, b.C0007b<PluginInstallCallback> bVar3) {
        return new getOriginalData(bVar, bVar2, bVar3);
    }

    public static getAppxDomain newInstance(Context context, setCallMode setcallmode, PluginInstallCallback pluginInstallCallback) {
        return new getAppxDomain(context, setcallmode, pluginInstallCallback);
    }
}
