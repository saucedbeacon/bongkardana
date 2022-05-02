package o;

import android.content.Context;
import id.dana.data.risk.riskevent.SendRiskEventReceiver;
import o.addAnimatorUpdateListener;
import o.b;

final class NetworkUtil implements addAnimatorUpdateListener.getMax {
    private final setDownloadFileName length;

    public NetworkUtil(setDownloadFileName setdownloadfilename) {
        this.length = setdownloadfilename;
    }

    public final Object processFacade(Object obj) {
        return ((RVDownloadCallback) obj).sendRiskEvent(this.length);
    }

    public final class Network implements getAdapterPosition<AnonymousClass1> {
        private final b.C0007b<getCurrentNetworkType> networkSendRiskEventEntityDataProvider;

        public Network(b.C0007b<getCurrentNetworkType> bVar) {
            this.networkSendRiskEventEntityDataProvider = bVar;
        }

        public final AnonymousClass1 get() {
            return newInstance(this.networkSendRiskEventEntityDataProvider.get());
        }

        public static Network create(b.C0007b<getCurrentNetworkType> bVar) {
            return new Network(bVar);
        }

        public static AnonymousClass1 newInstance(getCurrentNetworkType getcurrentnetworktype) {
            return new uncheckItems<RVTransportService>(getcurrentnetworktype) {
                private getCurrentNetworkType networkSendRiskEventEntityData;

                {
                    this.networkSendRiskEventEntityData = r1;
                }

                public RVTransportService createData(String str) {
                    return this.networkSendRiskEventEntityData;
                }
            };
        }
    }

    public final class NetworkListener implements getAdapterPosition<SendRiskEventReceiver> {
        private final b.C0007b<addDownload> sendRiskEventEntityRepositoryProvider;

        public NetworkListener(b.C0007b<addDownload> bVar) {
            this.sendRiskEventEntityRepositoryProvider = bVar;
        }

        public final SendRiskEventReceiver get() {
            return newInstance(this.sendRiskEventEntityRepositoryProvider.get());
        }

        public static NetworkListener create(b.C0007b<addDownload> bVar) {
            return new NetworkListener(bVar);
        }

        public static SendRiskEventReceiver newInstance(addDownload adddownload) {
            return new SendRiskEventReceiver(adddownload);
        }
    }

    public final class MyBroadcastReceiver implements getAdapterPosition<getCurrentNetworkType> {
        private final b.C0007b<Context> contextProvider;
        private final b.C0007b<setIsUrgentResource> rpcConnectorProvider;
        private final b.C0007b<onAppResume> securityFacadeProvider;
        private final b.C0007b<appxLoadFailed> threadExecutorProvider;

        public MyBroadcastReceiver(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
            this.rpcConnectorProvider = bVar;
            this.threadExecutorProvider = bVar2;
            this.securityFacadeProvider = bVar3;
            this.contextProvider = bVar4;
        }

        public final getCurrentNetworkType get() {
            return newInstance(this.rpcConnectorProvider.get(), this.threadExecutorProvider.get(), this.securityFacadeProvider.get(), this.contextProvider.get());
        }

        public static MyBroadcastReceiver create(b.C0007b<setIsUrgentResource> bVar, b.C0007b<appxLoadFailed> bVar2, b.C0007b<onAppResume> bVar3, b.C0007b<Context> bVar4) {
            return new MyBroadcastReceiver(bVar, bVar2, bVar3, bVar4);
        }

        public static getCurrentNetworkType newInstance(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
            return new getCurrentNetworkType(setisurgentresource, appxloadfailed, onappresume, context);
        }
    }
}
