package o;

import o.RVProxy;
import o.b;

public final class logPageAbnormal implements getAdapterPosition<getExtraAttrByJoinList> {
    private final b.C0007b<setLazyInitializer> localMyReferralConsultEntityDataProvider;
    private final b.C0007b<RVProxy.AnonymousClass1> networkMyReferralConsultEntityDataProvider;

    public logPageAbnormal(b.C0007b<RVProxy.AnonymousClass1> bVar, b.C0007b<setLazyInitializer> bVar2) {
        this.networkMyReferralConsultEntityDataProvider = bVar;
        this.localMyReferralConsultEntityDataProvider = bVar2;
    }

    public final getExtraAttrByJoinList get() {
        return newInstance(this.networkMyReferralConsultEntityDataProvider.get(), this.localMyReferralConsultEntityDataProvider.get());
    }

    public static logPageAbnormal create(b.C0007b<RVProxy.AnonymousClass1> bVar, b.C0007b<setLazyInitializer> bVar2) {
        return new logPageAbnormal(bVar, bVar2);
    }

    public static getExtraAttrByJoinList newInstance(RVProxy.AnonymousClass1 r1, setLazyInitializer setlazyinitializer) {
        return new getExtraAttrByJoinList(r1, setlazyinitializer);
    }
}
