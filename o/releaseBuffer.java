package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class releaseBuffer extends uncheckItems<setBufferSize> {
    private final setConsumerReady amcsReferralConfigEntityData;
    private final onReceiveData defaultReferralConfigEntityData;

    @Inject
    public releaseBuffer(setConsumerReady setconsumerready, onReceiveData onreceivedata) {
        this.amcsReferralConfigEntityData = setconsumerready;
        this.defaultReferralConfigEntityData = onreceivedata;
    }

    public setBufferSize createData(String str) {
        if ("network".equals(str)) {
            return this.amcsReferralConfigEntityData;
        }
        return this.defaultReferralConfigEntityData;
    }
}
