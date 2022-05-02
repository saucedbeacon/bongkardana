package o;

import o.b;

public final class getBufferedData implements getAdapterPosition<releaseBuffer> {
    private final b.C0007b<setConsumerReady> amcsReferralConfigEntityDataProvider;
    private final b.C0007b<onReceiveData> defaultReferralConfigEntityDataProvider;

    public getBufferedData(b.C0007b<setConsumerReady> bVar, b.C0007b<onReceiveData> bVar2) {
        this.amcsReferralConfigEntityDataProvider = bVar;
        this.defaultReferralConfigEntityDataProvider = bVar2;
    }

    public final releaseBuffer get() {
        return newInstance(this.amcsReferralConfigEntityDataProvider.get(), this.defaultReferralConfigEntityDataProvider.get());
    }

    public static getBufferedData create(b.C0007b<setConsumerReady> bVar, b.C0007b<onReceiveData> bVar2) {
        return new getBufferedData(bVar, bVar2);
    }

    public static releaseBuffer newInstance(setConsumerReady setconsumerready, onReceiveData onreceivedata) {
        return new releaseBuffer(setconsumerready, onreceivedata);
    }
}
