package o;

import android.content.Context;
import o.IIPCManager;
import o.b;

public final class getIPCManager implements getAdapterPosition<IIPCManager.Stub> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public getIPCManager(b.C0007b<Context> bVar, b.C0007b<UpdateAppCallback> bVar2) {
        this.contextProvider = bVar;
        this.splitFacadeProvider = bVar2;
    }

    public final IIPCManager.Stub get() {
        return newInstance(this.contextProvider.get(), this.splitFacadeProvider.get());
    }

    public static getIPCManager create(b.C0007b<Context> bVar, b.C0007b<UpdateAppCallback> bVar2) {
        return new getIPCManager(bVar, bVar2);
    }

    public static IIPCManager.Stub newInstance(Context context, UpdateAppCallback updateAppCallback) {
        return new IIPCManager.Stub(context, updateAppCallback);
    }
}
