package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import o.OpenAPIBridgeExtension;

@Singleton
public class Event$Stub {
    public ifNullConvertToEmpty transform(pickNext picknext) {
        if (picknext == null) {
            return null;
        }
        ifNullConvertToEmpty ifnullconverttoempty = new ifNullConvertToEmpty(picknext.enabled, transform(picknext.prizeAmount), picknext.referralCode);
        uncheckAllItems.transform(ifnullconverttoempty, picknext);
        return ifnullconverttoempty;
    }

    private stopBleScan transform(registerWorker registerworker) {
        if (registerworker != null) {
            return new stopBleScan(registerworker.getAmount(), registerworker.getCurrency());
        }
        return null;
    }

    public OpenAPIBridgeExtension.AnonymousClass2 transform(setViewId setviewid) {
        OpenAPIBridgeExtension.AnonymousClass2 r0 = new initWithSecurityGuard() {
            private boolean valid;

            public boolean isValid() {
                return this.valid;
            }

            public void setValid(boolean z) {
                this.valid = z;
            }
        };
        r0.setValid(setviewid.valid);
        uncheckAllItems.transform(r0, setviewid);
        return r0;
    }

    public result transform(setChannelId setchannelid) {
        if (setchannelid == null) {
            return null;
        }
        result result = new result();
        result.setReferredNextTask(setchannelid.referredNextTask);
        result.setNextTaskRedirectUrl(setchannelid.urlNextTask);
        uncheckAllItems.transform(result, setchannelid);
        return result;
    }

    public List<OpenAPIBridgeExtension.AnonymousClass3> transform(List<createChannelWithBuffer> list) {
        ArrayList arrayList = new ArrayList();
        for (createChannelWithBuffer referralEngagementDialogCache : list) {
            arrayList.add(referralEngagementDialogCache.toReferralEngagementDialogCache());
        }
        return arrayList;
    }

    public List<createChannelWithBuffer> toDialogCacheEntities(List<OpenAPIBridgeExtension.AnonymousClass3> list) {
        ArrayList arrayList = new ArrayList();
        for (OpenAPIBridgeExtension.AnonymousClass3 next : list) {
            arrayList.add(new createChannelWithBuffer(next.getScenario(), next.getShowHomeReferralPopup(), next.getShowPopUpTimerSeed()));
        }
        return arrayList;
    }
}
