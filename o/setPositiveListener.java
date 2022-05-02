package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o.ExtensionPoint;

public class setPositiveListener extends setSpeed<List<setExtraBeaconDataTracker>, List<ExtensionPoint.AnonymousClass2>> {
    private static final String DEFAULT_PAYER_KEY = "splitBillPayer";

    /* access modifiers changed from: protected */
    public List<ExtensionPoint.AnonymousClass2> map(List<setExtraBeaconDataTracker> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (setExtraBeaconDataTracker map : list) {
            arrayList.add(map(map));
        }
        return arrayList;
    }

    private ExtensionPoint.AnonymousClass2 map(setExtraBeaconDataTracker setextrabeacondatatracker) {
        ExtensionPoint.AnonymousClass2 r0 = new Serializable() {
            public String fundAmount;
            public String loginId;
            public String name;
            public String userId;
        };
        r0.fundAmount = setextrabeacondatatracker.getFundAmount();
        r0.name = DEFAULT_PAYER_KEY.equals(setextrabeacondatatracker.getName()) ? "" : setextrabeacondatatracker.getName();
        r0.userId = setextrabeacondatatracker.getUserId();
        r0.loginId = isOriginHasAppInfo.getIndoPhoneNumber(setextrabeacondatatracker.getLoginId());
        return r0;
    }
}
