package o;

import android.content.Context;
import o.b;

public final class com_alibaba_ariver_app_api_ExtOpt$59$1 implements getAdapterPosition<com_alibaba_ariver_app_api_ExtOpt$108$1> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<b.AnonymousClass13> holdLoginEntityDataFactoryProvider;
    private final b.C0007b<onRelease> rdsTrackerProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<onAppResume> securityFacadeProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public com_alibaba_ariver_app_api_ExtOpt$59$1(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<onRelease> bVar5, b.C0007b<b.AnonymousClass13> bVar6) {
        this.rpcConnectorProvider = bVar;
        this.threadExecutorProvider = bVar2;
        this.securityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
        this.rdsTrackerProvider = bVar5;
        this.holdLoginEntityDataFactoryProvider = bVar6;
    }

    public final com_alibaba_ariver_app_api_ExtOpt$108$1 get() {
        return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get(), this.rdsTrackerProvider.get(), this.holdLoginEntityDataFactoryProvider.get());
    }

    public static com_alibaba_ariver_app_api_ExtOpt$59$1 create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<onRelease> bVar5, b.C0007b<b.AnonymousClass13> bVar6) {
        return new com_alibaba_ariver_app_api_ExtOpt$59$1(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static com_alibaba_ariver_app_api_ExtOpt$108$1 newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context, onRelease onrelease, b.AnonymousClass13 r13) {
        return new com_alibaba_ariver_app_api_ExtOpt$108$1(setisurgentresource, appxloadfailed, onappresume, context, onrelease, r13);
    }
}
