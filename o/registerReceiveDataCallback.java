package o;

import o.b;

public final class registerReceiveDataCallback implements getAdapterPosition<incrementRef> {
    private final b.C0007b<BigDataChannelManager> localReferralEntityDataProvider;
    private final b.C0007b<isConsumerReady> networkReferralEntityDataProvider;

    public registerReceiveDataCallback(b.C0007b<isConsumerReady> bVar, b.C0007b<BigDataChannelManager> bVar2) {
        this.networkReferralEntityDataProvider = bVar;
        this.localReferralEntityDataProvider = bVar2;
    }

    public final incrementRef get() {
        return newInstance(this.networkReferralEntityDataProvider.get(), this.localReferralEntityDataProvider.get());
    }

    public static registerReceiveDataCallback create(b.C0007b<isConsumerReady> bVar, b.C0007b<BigDataChannelManager> bVar2) {
        return new registerReceiveDataCallback(bVar, bVar2);
    }

    public static incrementRef newInstance(isConsumerReady isconsumerready, BigDataChannelManager bigDataChannelManager) {
        return new incrementRef(isconsumerready, bigDataChannelManager);
    }
}
