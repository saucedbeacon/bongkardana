package o;

import android.content.Context;
import o.b;

public final class com_alibaba_ariver_app_api_ExtOpt$55$1 implements getAdapterPosition<com_alibaba_ariver_app_api_ExtOpt$107$1> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<onAppResume> securityFacadeProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public com_alibaba_ariver_app_api_ExtOpt$55$1(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        this.rpcConnectorProvider = bVar;
        this.threadExecutorProvider = bVar2;
        this.securityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
    }

    public final com_alibaba_ariver_app_api_ExtOpt$107$1 get() {
        return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get());
    }

    public static com_alibaba_ariver_app_api_ExtOpt$55$1 create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
        return new com_alibaba_ariver_app_api_ExtOpt$55$1(bVar, bVar2, bVar3, bVar4);
    }

    public static com_alibaba_ariver_app_api_ExtOpt$107$1 newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        return new com_alibaba_ariver_app_api_ExtOpt$107$1(setisurgentresource, appxloadfailed, onappresume, context);
    }
}
