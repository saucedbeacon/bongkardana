package o;

import o.b;

public final class com_alibaba_ariver_resource_api_ExtOpt$21$1 implements getAdapterPosition<createWorker> {
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<addAnimatorListener> danaContentApiProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public com_alibaba_ariver_resource_api_ExtOpt$21$1(b.C0007b<PluginInstallCallback> bVar, b.C0007b<onCallBack> bVar2, b.C0007b<addAnimatorListener> bVar3) {
        this.serializerProvider = bVar;
        this.configEntityDataFactoryProvider = bVar2;
        this.danaContentApiProvider = bVar3;
    }

    public final createWorker get() {
        return newInstance(this.serializerProvider.get(), this.configEntityDataFactoryProvider.get(), this.danaContentApiProvider.get());
    }

    public static com_alibaba_ariver_resource_api_ExtOpt$21$1 create(b.C0007b<PluginInstallCallback> bVar, b.C0007b<onCallBack> bVar2, b.C0007b<addAnimatorListener> bVar3) {
        return new com_alibaba_ariver_resource_api_ExtOpt$21$1(bVar, bVar2, bVar3);
    }

    public static createWorker newInstance(PluginInstallCallback pluginInstallCallback, onCallBack oncallback, addAnimatorListener addanimatorlistener) {
        return new createWorker(pluginInstallCallback, oncallback, addanimatorlistener);
    }
}
