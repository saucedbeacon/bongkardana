package o;

import android.content.Context;
import o.b;

public final class TemplateExtModel implements getAdapterPosition<getExtObj> {
    private final b.C0007b<onAppResume> apSecurityFacadeProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public TemplateExtModel(b.C0007b<Context> bVar, b.C0007b<setIsUrgentResource> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<onAppResume> bVar4) {
        this.contextProvider = bVar;
        this.rpcConnectorProvider = bVar2;
        this.threadExecutorProvider = bVar3;
        this.apSecurityFacadeProvider = bVar4;
    }

    public final getExtObj get() {
        return newInstance(this.contextProvider.get(), this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.apSecurityFacadeProvider.get());
    }

    public static TemplateExtModel create(b.C0007b<Context> bVar, b.C0007b<setIsUrgentResource> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<onAppResume> bVar4) {
        return new TemplateExtModel(bVar, bVar2, bVar3, bVar4);
    }

    public static getExtObj newInstance(Context context, setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume) {
        return new getExtObj(context, setisurgentresource, appxloadfailed, onappresume);
    }
}
