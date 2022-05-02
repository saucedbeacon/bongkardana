package o;

import android.content.Context;
import o.b;

public final class putPluginConfig implements getAdapterPosition<getPageLaunchParams> {
    private final b.C0007b<AppPausePoint> amcsManagerProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setPages> errorConfigPreferencesProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public putPluginConfig(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2, b.C0007b<AppPausePoint> bVar3, b.C0007b<setPages> bVar4) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
        this.amcsManagerProvider = bVar3;
        this.errorConfigPreferencesProvider = bVar4;
    }

    public final getPageLaunchParams get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get(), this.amcsManagerProvider.get(), this.errorConfigPreferencesProvider.get());
    }

    public static putPluginConfig create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2, b.C0007b<AppPausePoint> bVar3, b.C0007b<setPages> bVar4) {
        return new putPluginConfig(bVar, bVar2, bVar3, bVar4);
    }

    public static getPageLaunchParams newInstance(Context context, PluginInstallCallback pluginInstallCallback, AppPausePoint appPausePoint, setPages setpages) {
        return new getPageLaunchParams(context, pluginInstallCallback, appPausePoint, setpages);
    }
}
