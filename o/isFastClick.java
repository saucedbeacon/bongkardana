package o;

import android.content.Context;
import o.b;

public final class isFastClick implements getAdapterPosition<setSelectedIndex> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<onAppResume> securityFacadeProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public isFastClick(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        this.rpcConnectorProvider = bVar;
        this.threadExecutorProvider = bVar2;
        this.securityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
    }

    public final setSelectedIndex get() {
        return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get());
    }

    public static isFastClick create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        return new isFastClick(bVar, bVar2, bVar3, bVar4);
    }

    public static setSelectedIndex newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        return new setSelectedIndex(setisurgentresource, appxloadfailed, onappresume, context);
    }
}
