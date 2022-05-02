package o;

import android.content.Context;
import o.b;

public final class setDownloadTime implements getAdapterPosition<setRequestBeginTime> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<onAppResume> securityFacadeProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public setDownloadTime(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        this.rpcConnectorProvider = bVar;
        this.threadExecutorProvider = bVar2;
        this.securityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
    }

    public final setRequestBeginTime get() {
        return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get());
    }

    public static setDownloadTime create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        return new setDownloadTime(bVar, bVar2, bVar3, bVar4);
    }

    public static setRequestBeginTime newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        return new setRequestBeginTime(setisurgentresource, appxloadfailed, onappresume, context);
    }
}
