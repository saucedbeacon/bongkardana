package o;

import android.content.Context;
import o.b;

public final class setTerminalType implements getAdapterPosition<getCurrentLongitudeAndLatitude> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public setTerminalType(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final getCurrentLongitudeAndLatitude get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static setTerminalType create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new setTerminalType(bVar, bVar2);
    }

    public static getCurrentLongitudeAndLatitude newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new getCurrentLongitudeAndLatitude(context, pluginInstallCallback);
    }
}
