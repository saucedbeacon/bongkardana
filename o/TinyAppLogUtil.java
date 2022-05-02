package o;

import o.b;

public final class TinyAppLogUtil implements getAdapterPosition<getRemoteDebugUrlForDebug> {
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<setParam> okHttpSSLPinningManagerProvider;
    private final b.C0007b<getInternalMemorySize> sslPinningEntityDataFactoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public TinyAppLogUtil(b.C0007b<getInternalMemorySize> bVar, b.C0007b<onCallBack> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<setParam> bVar4) {
        this.sslPinningEntityDataFactoryProvider = bVar;
        this.configEntityDataFactoryProvider = bVar2;
        this.threadExecutorProvider = bVar3;
        this.okHttpSSLPinningManagerProvider = bVar4;
    }

    public final getRemoteDebugUrlForDebug get() {
        return newInstance(this.sslPinningEntityDataFactoryProvider.get(), this.configEntityDataFactoryProvider.get(), this.threadExecutorProvider.get(), this.okHttpSSLPinningManagerProvider.get());
    }

    public static TinyAppLogUtil create(b.C0007b<getInternalMemorySize> bVar, b.C0007b<onCallBack> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<setParam> bVar4) {
        return new TinyAppLogUtil(bVar, bVar2, bVar3, bVar4);
    }

    public static getRemoteDebugUrlForDebug newInstance(getInternalMemorySize getinternalmemorysize, onCallBack oncallback, appxLoadFailed appxloadfailed, setParam setparam) {
        return new getRemoteDebugUrlForDebug(getinternalmemorysize, oncallback, appxloadfailed, setparam);
    }
}
