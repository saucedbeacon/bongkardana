package o;

import o.b;

public final class setResponse implements getAdapterPosition<getH5AuthParams> {
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;

    public setResponse(b.C0007b<onCallBack> bVar) {
        this.configEntityDataFactoryProvider = bVar;
    }

    public final getH5AuthParams get() {
        return newInstance(this.configEntityDataFactoryProvider.get());
    }

    public static setResponse create(b.C0007b<onCallBack> bVar) {
        return new setResponse(bVar);
    }

    public static getH5AuthParams newInstance(onCallBack oncallback) {
        return new getH5AuthParams(oncallback);
    }
}
