package o;

import o.b;

public final class RVRpcException implements getAdapterPosition<access$2300> {
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public RVRpcException(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2) {
        this.rpcConnectorProvider = bVar;
        this.threadExecutorProvider = bVar2;
    }

    public final access$2300 get() {
        return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get());
    }

    public static RVRpcException create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2) {
        return new RVRpcException(bVar, bVar2);
    }

    public static access$2300 newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed) {
        return new access$2300(setisurgentresource, appxloadfailed);
    }
}
