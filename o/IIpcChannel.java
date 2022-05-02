package o;

import android.content.Context;
import o.addAnimatorUpdateListener;
import o.b;

final class IIpcChannel implements addAnimatorUpdateListener.getMax {
    private final ThreadType getMax;

    public IIpcChannel(ThreadType threadType) {
        this.getMax = threadType;
    }

    public final Object processFacade(Object obj) {
        return ((canOverride) obj).queryCategory(this.getMax);
    }

    final class Stub implements addAnimatorUpdateListener.getMax {
        private final NativePermissionRequire setMax;

        public Stub(NativePermissionRequire nativePermissionRequire) {
            this.setMax = nativePermissionRequire;
        }

        public final Object processFacade(Object obj) {
            return ((canOverride) obj).queryPromoCenterAds(this.setMax);
        }

        public final class Proxy implements getAdapterPosition<RVEvents> {
            private final b.C0007b<Context> contextProvider;
            private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
            private final b.C0007b<onAppResume> securityFacadeProvider;
            private final b.C0007b<appxLoadFailed> threadExecutorProvider;

            public Proxy(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
                this.rpcConnectorProvider = bVar;
                this.threadExecutorProvider = bVar2;
                this.securityFacadeProvider = bVar3;
                this.contextProvider = bVar4;
            }

            public final RVEvents get() {
                return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get());
            }

            public static Proxy create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
                return new Proxy(bVar, bVar2, bVar3, bVar4);
            }

            public static RVEvents newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
                return new RVEvents(setisurgentresource, appxloadfailed, onappresume, context);
            }
        }
    }
}
