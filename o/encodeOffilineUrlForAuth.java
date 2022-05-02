package o;

import android.content.Context;
import o.b;

public final class encodeOffilineUrlForAuth implements getAdapterPosition<getPathAndHash> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public encodeOffilineUrlForAuth(b.C0007b<PluginInstallCallback> bVar, b.C0007b<Context> bVar2) {
        this.serializerProvider = bVar;
        this.contextProvider = bVar2;
    }

    public final getPathAndHash get() {
        return newInstance(this.serializerProvider.get(), this.contextProvider.get());
    }

    public static encodeOffilineUrlForAuth create(b.C0007b<PluginInstallCallback> bVar, b.C0007b<Context> bVar2) {
        return new encodeOffilineUrlForAuth(bVar, bVar2);
    }

    public static getPathAndHash newInstance(PluginInstallCallback pluginInstallCallback, Context context) {
        return new getPathAndHash(pluginInstallCallback, context);
    }
}
