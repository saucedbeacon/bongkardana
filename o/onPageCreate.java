package o;

import android.content.Context;
import o.b;

public final class onPageCreate implements getAdapterPosition<CreatePageCallback> {
    private final b.C0007b<getFrameMarginVerticalLess$core> accountPreferencesProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<onAppResume> securityFacadeProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public onPageCreate(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<getFrameMarginVerticalLess$core> bVar5) {
        this.rpcConnectorProvider = bVar;
        this.threadExecutorProvider = bVar2;
        this.securityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
        this.accountPreferencesProvider = bVar5;
    }

    public final CreatePageCallback get() {
        return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get(), this.accountPreferencesProvider.get());
    }

    public static onPageCreate create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<getFrameMarginVerticalLess$core> bVar5) {
        return new onPageCreate(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static CreatePageCallback newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context, getFrameMarginVerticalLess$core getframemarginverticalless_core) {
        return new CreatePageCallback(setisurgentresource, appxloadfailed, onappresume, context, getframemarginverticalless_core);
    }
}
