package o;

import o.AppModel;
import o.b;

public final class setAppInfoModel implements getAdapterPosition<getContainerInfo> {
    private final b.C0007b<AppModel.AnonymousClass2> localDataSourceProvider;
    private final b.C0007b<addPlugin> networkDataSourceProvider;

    public setAppInfoModel(b.C0007b<addPlugin> bVar, b.C0007b<AppModel.AnonymousClass2> bVar2) {
        this.networkDataSourceProvider = bVar;
        this.localDataSourceProvider = bVar2;
    }

    public final getContainerInfo get() {
        return newInstance(this.networkDataSourceProvider.get(), this.localDataSourceProvider.get());
    }

    public static setAppInfoModel create(b.C0007b<addPlugin> bVar, b.C0007b<AppModel.AnonymousClass2> bVar2) {
        return new setAppInfoModel(bVar, bVar2);
    }

    public static getContainerInfo newInstance(addPlugin addplugin, AppModel.AnonymousClass2 r2) {
        return new getContainerInfo(addplugin, r2);
    }
}
