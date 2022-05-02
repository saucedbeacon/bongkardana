package o;

import com.google.gson.Gson;
import o.b;

public final class isOnline implements getAdapterPosition<getOrigin> {
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<setExtendInfos> persistenceEtagEntityDataProvider;
    private final b.C0007b<Gson> serializerProvider;
    private final b.C0007b<getContainerInfo> userConfigEntityDataFactoryProvider;

    public isOnline(b.C0007b<Gson> bVar, b.C0007b<getContainerInfo> bVar2, b.C0007b<setExtendInfos> bVar3, b.C0007b<onCallBack> bVar4) {
        this.serializerProvider = bVar;
        this.userConfigEntityDataFactoryProvider = bVar2;
        this.persistenceEtagEntityDataProvider = bVar3;
        this.configEntityDataFactoryProvider = bVar4;
    }

    public final getOrigin get() {
        return newInstance(this.serializerProvider.get(), this.userConfigEntityDataFactoryProvider.get(), this.persistenceEtagEntityDataProvider.get(), this.configEntityDataFactoryProvider.get());
    }

    public static isOnline create(b.C0007b<Gson> bVar, b.C0007b<getContainerInfo> bVar2, b.C0007b<setExtendInfos> bVar3, b.C0007b<onCallBack> bVar4) {
        return new isOnline(bVar, bVar2, bVar3, bVar4);
    }

    public static getOrigin newInstance(Gson gson, getContainerInfo getcontainerinfo, setExtendInfos setextendinfos, onCallBack oncallback) {
        return new getOrigin(gson, getcontainerinfo, setextendinfos, oncallback);
    }
}
