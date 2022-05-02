package o;

import android.content.Context;
import o.b;

public final class setLink implements getAdapterPosition<setApiLevelStr> {
    private final b.C0007b<onAppResume> apSecurityFacadeProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public setLink(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        this.rpcConnectorProvider = bVar;
        this.threadExecutorProvider = bVar2;
        this.apSecurityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
    }

    public final setApiLevelStr get() {
        return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.apSecurityFacadeProvider.get(), this.contextProvider.get());
    }

    public static setLink create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        return new setLink(bVar, bVar2, bVar3, bVar4);
    }

    public static setApiLevelStr newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        return new setApiLevelStr(setisurgentresource, appxloadfailed, onappresume, context);
    }
}
