package o;

import o.b;

public final class getPluginPermissions implements getAdapterPosition<setHttpLinkSubResMimeList> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getIgnorePermissionCheck> userEducationDataFactoryProvider;

    public getPluginPermissions(b.C0007b<getIgnorePermissionCheck> bVar, b.C0007b<DialogLayout> bVar2) {
        this.userEducationDataFactoryProvider = bVar;
        this.accountEntityDataFactoryProvider = bVar2;
    }

    public final setHttpLinkSubResMimeList get() {
        return newInstance(this.userEducationDataFactoryProvider.get(), this.accountEntityDataFactoryProvider.get());
    }

    public static getPluginPermissions create(b.C0007b<getIgnorePermissionCheck> bVar, b.C0007b<DialogLayout> bVar2) {
        return new getPluginPermissions(bVar, bVar2);
    }

    public static setHttpLinkSubResMimeList newInstance(getIgnorePermissionCheck getignorepermissioncheck, DialogLayout dialogLayout) {
        return new setHttpLinkSubResMimeList(getignorepermissioncheck, dialogLayout);
    }
}
