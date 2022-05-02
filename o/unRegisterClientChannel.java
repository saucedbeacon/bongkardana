package o;

import android.content.Context;
import o.b;

public final class unRegisterClientChannel implements getAdapterPosition<isValidUrl> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<appxLoadFailed> executorProvider;
    private final b.C0007b<extractAppIdFromUrl> nameCheckParamMapperProvider;
    private final b.C0007b<decode> nameCheckSecureApiProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<onAppResume> securityFacadeProvider;
    private final b.C0007b<getSerializable> transferSubmitRequestMapperProvider;

    public unRegisterClientChannel(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<decode> bVar5, b.C0007b<extractAppIdFromUrl> bVar6, b.C0007b<getSerializable> bVar7) {
        this.rpcConnectorProvider = bVar;
        this.executorProvider = bVar2;
        this.securityFacadeProvider = bVar3;
        this.contextProvider = bVar4;
        this.nameCheckSecureApiProvider = bVar5;
        this.nameCheckParamMapperProvider = bVar6;
        this.transferSubmitRequestMapperProvider = bVar7;
    }

    public final isValidUrl get() {
        return newInstance(this.rpcConnectorProvider.get(), this.executorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get(), this.nameCheckSecureApiProvider.get(), this.nameCheckParamMapperProvider.get(), this.transferSubmitRequestMapperProvider.get());
    }

    public static unRegisterClientChannel create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4, b.C0007b<decode> bVar5, b.C0007b<extractAppIdFromUrl> bVar6, b.C0007b<getSerializable> bVar7) {
        return new unRegisterClientChannel(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public static isValidUrl newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context, decode decode, extractAppIdFromUrl extractappidfromurl, getSerializable getserializable) {
        return new isValidUrl(setisurgentresource, appxloadfailed, onappresume, context, decode, extractappidfromurl, getserializable);
    }
}
