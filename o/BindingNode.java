package o;

import android.content.Context;
import o.b;

public final class BindingNode implements getAdapterPosition<isSticky> {
    private final b.C0007b<onAppResume> apSecurityFacadeProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;

    public BindingNode(b.C0007b<setIsUrgentResource> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<Context> bVar3) {
        this.rpcConnectorProvider = bVar;
        this.apSecurityFacadeProvider = bVar2;
        this.contextProvider = bVar3;
    }

    public final isSticky get() {
        return newInstance(this.rpcConnectorProvider.get(), this.apSecurityFacadeProvider.get(), this.contextProvider.get());
    }

    public static BindingNode create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<Context> bVar3) {
        return new BindingNode(bVar, bVar2, bVar3);
    }

    public static isSticky newInstance(setIsUrgentResource setisurgentresource, onAppResume onappresume, Context context) {
        return new isSticky(setisurgentresource, onappresume, context);
    }
}
