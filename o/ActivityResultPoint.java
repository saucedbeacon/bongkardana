package o;

import android.content.Context;
import o.b;

public final class ActivityResultPoint implements getAdapterPosition<onAppCreate> {
    private final b.C0007b<onAppResume> apSecurityFacadeProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public ActivityResultPoint(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        this.rpcConnectorProvider = bVar;
        this.threadExecutorProvider = bVar2;
        this.apSecurityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
    }

    public final onAppCreate get() {
        return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.apSecurityFacadeProvider.get(), this.contextProvider.get());
    }

    public static ActivityResultPoint create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        return new ActivityResultPoint(bVar, bVar2, bVar3, bVar4);
    }

    public static onAppCreate newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        return new onAppCreate(setisurgentresource, appxloadfailed, onappresume, context);
    }
}
