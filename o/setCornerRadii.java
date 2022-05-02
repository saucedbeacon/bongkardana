package o;

import android.content.Context;
import o.b;

public final class setCornerRadii implements getAdapterPosition<getFrameMarginVerticalLess$core> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public setCornerRadii(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final getFrameMarginVerticalLess$core get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static setCornerRadii create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new setCornerRadii(bVar, bVar2);
    }

    public static getFrameMarginVerticalLess$core newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new getFrameMarginVerticalLess$core(context, pluginInstallCallback);
    }
}
