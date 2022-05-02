package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVProxy;

@Singleton
public class getExtraAttrByJoinList extends uncheckItems<getTrackerIdWithIndex> {
    private final setLazyInitializer localMyReferralConsultEntityData;
    private final RVProxy.AnonymousClass1 networkMyReferralConsultEntityData;

    @Inject
    public getExtraAttrByJoinList(RVProxy.AnonymousClass1 r1, setLazyInitializer setlazyinitializer) {
        this.networkMyReferralConsultEntityData = r1;
        this.localMyReferralConsultEntityData = setlazyinitializer;
    }

    public getTrackerIdWithIndex createData(String str) {
        if (str.equals("local")) {
            return this.localMyReferralConsultEntityData;
        }
        return this.networkMyReferralConsultEntityData;
    }
}
