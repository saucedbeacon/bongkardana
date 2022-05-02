package o;

import android.content.Context;
import o.b;

public final class getIsvAppId implements getAdapterPosition<getExtInfo> {
    private final b.C0007b<onAppResume> apSecurityFacadeProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;

    public getIsvAppId(b.C0007b<setIsUrgentResource> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<Context> bVar3) {
        this.rpcConnectorProvider = bVar;
        this.apSecurityFacadeProvider = bVar2;
        this.contextProvider = bVar3;
    }

    public final getExtInfo get() {
        return newInstance(this.rpcConnectorProvider.get(), this.apSecurityFacadeProvider.get(), this.contextProvider.get());
    }

    public static getIsvAppId create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<Context> bVar3) {
        return new getIsvAppId(bVar, bVar2, bVar3);
    }

    public static getExtInfo newInstance(setIsUrgentResource setisurgentresource, onAppResume onappresume, Context context) {
        return new getExtInfo(setisurgentresource, onappresume, context);
    }
}
