package o;

import android.content.Context;
import o.b;

public final class setFallbackListener implements getAdapterPosition<getOnlineResource> {
    private final b.C0007b<onAppResume> apSecurityFacadeProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<BackKeyDownPoint> securityGuardFacadeProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public setFallbackListener(b.C0007b<Context> bVar, b.C0007b<setIsUrgentResource> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<onAppResume> bVar4, b.C0007b<BackKeyDownPoint> bVar5) {
        this.contextProvider = bVar;
        this.rpcConnectorProvider = bVar2;
        this.threadExecutorProvider = bVar3;
        this.apSecurityFacadeProvider = bVar4;
        this.securityGuardFacadeProvider = bVar5;
    }

    public final getOnlineResource get() {
        return newInstance(this.contextProvider.get(), this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.apSecurityFacadeProvider.get(), this.securityGuardFacadeProvider.get());
    }

    public static setFallbackListener create(b.C0007b<Context> bVar, b.C0007b<setIsUrgentResource> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<onAppResume> bVar4, b.C0007b<BackKeyDownPoint> bVar5) {
        return new setFallbackListener(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static getOnlineResource newInstance(Context context, setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, BackKeyDownPoint backKeyDownPoint) {
        return new getOnlineResource(context, setisurgentresource, appxloadfailed, onappresume, backKeyDownPoint);
    }
}
