package o;

import android.content.Context;
import o.b;

public final class setDownloadType implements getAdapterPosition<addPlugin> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<onAppResume> securityFacadeProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public setDownloadType(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        this.rpcConnectorProvider = bVar;
        this.threadExecutorProvider = bVar2;
        this.securityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
    }

    public final addPlugin get() {
        return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get());
    }

    public static setDownloadType create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        return new setDownloadType(bVar, bVar2, bVar3, bVar4);
    }

    public static addPlugin newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        return new addPlugin(setisurgentresource, appxloadfailed, onappresume, context);
    }
}
