package o;

import android.content.Context;
import o.b;

public final class getIncludeFiles implements getAdapterPosition<getPages> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public getIncludeFiles(b.C0007b<PluginInstallCallback> bVar, b.C0007b<Context> bVar2) {
        this.serializerProvider = bVar;
        this.contextProvider = bVar2;
    }

    public final getPages get() {
        return newInstance(this.serializerProvider.get(), this.contextProvider.get());
    }

    public static getIncludeFiles create(b.C0007b<PluginInstallCallback> bVar, b.C0007b<Context> bVar2) {
        return new getIncludeFiles(bVar, bVar2);
    }

    public static getPages newInstance(PluginInstallCallback pluginInstallCallback, Context context) {
        return new getPages(pluginInstallCallback, context);
    }
}
