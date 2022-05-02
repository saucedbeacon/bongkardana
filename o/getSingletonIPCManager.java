package o;

import o.b;

public final class getSingletonIPCManager implements getAdapterPosition<IIPCManager> {
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public getSingletonIPCManager(b.C0007b<UpdateAppCallback> bVar) {
        this.splitFacadeProvider = bVar;
    }

    public final IIPCManager get() {
        return newInstance(this.splitFacadeProvider.get());
    }

    public static getSingletonIPCManager create(b.C0007b<UpdateAppCallback> bVar) {
        return new getSingletonIPCManager(bVar);
    }

    public static IIPCManager newInstance(UpdateAppCallback updateAppCallback) {
        return new IIPCManager(updateAppCallback);
    }
}
