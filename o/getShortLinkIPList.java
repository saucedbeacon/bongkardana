package o;

import android.content.Context;
import o.b;

public final class getShortLinkIPList implements getAdapterPosition<isNeedSignature> {
    private final b.C0007b<AppPausePoint> amcsManagerProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;
    private final b.C0007b<AppUtils> splitConfigEntityDataProvider;

    public getShortLinkIPList(b.C0007b<Context> bVar, b.C0007b<AppPausePoint> bVar2, b.C0007b<PluginInstallCallback> bVar3, b.C0007b<AppUtils> bVar4) {
        this.contextProvider = bVar;
        this.amcsManagerProvider = bVar2;
        this.serializerProvider = bVar3;
        this.splitConfigEntityDataProvider = bVar4;
    }

    public final isNeedSignature get() {
        return newInstance(this.contextProvider.get(), this.amcsManagerProvider.get(), this.serializerProvider.get(), this.splitConfigEntityDataProvider.get());
    }

    public static getShortLinkIPList create(b.C0007b<Context> bVar, b.C0007b<AppPausePoint> bVar2, b.C0007b<PluginInstallCallback> bVar3, b.C0007b<AppUtils> bVar4) {
        return new getShortLinkIPList(bVar, bVar2, bVar3, bVar4);
    }

    public static isNeedSignature newInstance(Context context, AppPausePoint appPausePoint, PluginInstallCallback pluginInstallCallback, AppUtils appUtils) {
        return new isNeedSignature(context, appPausePoint, pluginInstallCallback, appUtils);
    }
}
