package o;

import android.content.Context;
import o.b;

public final class getCost implements getAdapterPosition<toMap> {
    private final b.C0007b<onAppResume> apSecurityFacadeProvider;
    private final b.C0007b<Context> appContextProvider;
    private final b.C0007b<ValueStore> bankCardConversionMapperProvider;
    private final b.C0007b<setAttrData> convertCardIndexNoSecureApiProvider;
    private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getCost(b.C0007b<Context> bVar, b.C0007b<setIsUrgentResource> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<onAppResume> bVar4, b.C0007b<ValueStore> bVar5, b.C0007b<setAttrData> bVar6) {
        this.appContextProvider = bVar;
        this.rpcConnectorProvider = bVar2;
        this.threadExecutorProvider = bVar3;
        this.apSecurityFacadeProvider = bVar4;
        this.bankCardConversionMapperProvider = bVar5;
        this.convertCardIndexNoSecureApiProvider = bVar6;
    }

    public final toMap get() {
        return newInstance(this.appContextProvider.get(), this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.apSecurityFacadeProvider.get(), this.bankCardConversionMapperProvider.get(), this.convertCardIndexNoSecureApiProvider.get());
    }

    public static getCost create(b.C0007b<Context> bVar, b.C0007b<setIsUrgentResource> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<onAppResume> bVar4, b.C0007b<ValueStore> bVar5, b.C0007b<setAttrData> bVar6) {
        return new getCost(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static toMap newInstance(Context context, setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, ValueStore valueStore, setAttrData setattrdata) {
        return new toMap(context, setisurgentresource, appxloadfailed, onappresume, valueStore, setattrdata);
    }
}
