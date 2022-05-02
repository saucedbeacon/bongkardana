package o;

import android.content.Context;
import o.GriverAppXInterceptor;
import o.b;

public final class IpcClientUtils implements getAdapterPosition<AppRestartExtension> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<appxLoadFailed> executorProvider;
    private final b.C0007b<onAppCreate> feedsEntityDataFactoryProvider;
    private final b.C0007b<needCheckDslError> notificationCenterEntityDataFactoryProvider;
    private final b.C0007b<GriverAppXInterceptor.AnonymousClass1> promotionRepositoryProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<onAppResume> securityFacadeProvider;
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public IpcClientUtils(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<onAppCreate> bVar5, b.C0007b<GriverAppXInterceptor.AnonymousClass1> bVar6, b.C0007b<needCheckDslError> bVar7, b.C0007b<UpdateAppCallback> bVar8) {
        this.rpcConnectorProvider = bVar;
        this.executorProvider = bVar2;
        this.securityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
        this.feedsEntityDataFactoryProvider = bVar5;
        this.promotionRepositoryProvider = bVar6;
        this.notificationCenterEntityDataFactoryProvider = bVar7;
        this.splitFacadeProvider = bVar8;
    }

    public final AppRestartExtension get() {
        return newInstance(this.rpcConnectorProvider.get(), this.executorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get(), this.feedsEntityDataFactoryProvider.get(), this.promotionRepositoryProvider.get(), this.notificationCenterEntityDataFactoryProvider.get(), this.splitFacadeProvider.get());
    }

    public static IpcClientUtils create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<onAppCreate> bVar5, b.C0007b<GriverAppXInterceptor.AnonymousClass1> bVar6, b.C0007b<needCheckDslError> bVar7, b.C0007b<UpdateAppCallback> bVar8) {
        return new IpcClientUtils(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public static AppRestartExtension newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context, onAppCreate onappcreate, GriverAppXInterceptor.AnonymousClass1 r15, needCheckDslError needcheckdslerror, UpdateAppCallback updateAppCallback) {
        return new AppRestartExtension(setisurgentresource, appxloadfailed, onappresume, context, onappcreate, r15, needcheckdslerror, updateAppCallback);
    }
}
