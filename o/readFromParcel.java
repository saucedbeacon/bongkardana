package o;

import o.b;

public final class readFromParcel implements getAdapterPosition<getIPCContextManager> {
    private final b.C0007b<onCallBack> configDataFactoryProvider;

    public readFromParcel(b.C0007b<onCallBack> bVar) {
        this.configDataFactoryProvider = bVar;
    }

    public final getIPCContextManager get() {
        return newInstance(this.configDataFactoryProvider.get());
    }

    public static readFromParcel create(b.C0007b<onCallBack> bVar) {
        return new readFromParcel(bVar);
    }

    public static getIPCContextManager newInstance(onCallBack oncallback) {
        return new getIPCContextManager(oncallback);
    }
}
