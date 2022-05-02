package o;

import android.content.Context;
import o.b;

public final class ResourceInterceptRequestPoint implements getAdapterPosition<ResourceInterceptPoint> {
    private final b.C0007b<onAppResume> apSecurityFacadeProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;

    public ResourceInterceptRequestPoint(b.C0007b<setIsUrgentResource> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<Context> bVar3) {
        this.rpcConnectorProvider = bVar;
        this.apSecurityFacadeProvider = bVar2;
        this.contextProvider = bVar3;
    }

    public final ResourceInterceptPoint get() {
        return newInstance(this.rpcConnectorProvider.get(), this.apSecurityFacadeProvider.get(), this.contextProvider.get());
    }

    public static ResourceInterceptRequestPoint create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<Context> bVar3) {
        return new ResourceInterceptRequestPoint(bVar, bVar2, bVar3);
    }

    public static ResourceInterceptPoint newInstance(setIsUrgentResource setisurgentresource, onAppResume onappresume, Context context) {
        return new ResourceInterceptPoint(setisurgentresource, onappresume, context);
    }
}
