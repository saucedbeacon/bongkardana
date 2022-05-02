package o;

import android.content.Context;
import o.b;

public final class RVRpcConfig implements getAdapterPosition<getResStream> {
    private final b.C0007b<requestData> savingCategoryEntityDataFactoryProvider;

    public RVRpcConfig(b.C0007b<requestData> bVar) {
        this.savingCategoryEntityDataFactoryProvider = bVar;
    }

    public final getResStream get() {
        return newInstance(this.savingCategoryEntityDataFactoryProvider.get());
    }

    public final class Builder implements getAdapterPosition<getBizLog> {
        private final b.C0007b<Context> contextProvider;
        private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
        private final b.C0007b<onAppResume> securityFacadeProvider;
        private final b.C0007b<appxLoadFailed> threadExecutorProvider;

        public Builder(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
            this.rpcConnectorProvider = bVar;
            this.threadExecutorProvider = bVar2;
            this.securityFacadeProvider = bVar3;
            this.contextProvider = bVar4;
        }

        public final getBizLog get() {
            return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get());
        }

        public static Builder create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
            return new Builder(bVar, bVar2, bVar3, bVar4);
        }

        public static getBizLog newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
            return new getBizLog(setisurgentresource, appxloadfailed, onappresume, context);
        }
    }

    public static RVRpcConfig create(b.C0007b<requestData> bVar) {
        return new RVRpcConfig(bVar);
    }

    public static getResStream newInstance(requestData requestdata) {
        return new getResStream(requestdata);
    }
}
