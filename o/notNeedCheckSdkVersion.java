package o;

import o.b;

public final class notNeedCheckSdkVersion implements getAdapterPosition<checkAppxMinVersion> {
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public notNeedCheckSdkVersion(b.C0007b<UpdateAppCallback> bVar) {
        this.splitFacadeProvider = bVar;
    }

    public final checkAppxMinVersion get() {
        return newInstance(this.splitFacadeProvider.get());
    }

    public static notNeedCheckSdkVersion create(b.C0007b<UpdateAppCallback> bVar) {
        return new notNeedCheckSdkVersion(bVar);
    }

    public static checkAppxMinVersion newInstance(UpdateAppCallback updateAppCallback) {
        return new checkAppxMinVersion(updateAppCallback);
    }
}
