package o;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Singleton;

@Singleton
public class lastIndexOf extends setSpeed<Map<String, containsValue>, List<AltBeaconParser>> {
    private List<AltBeaconParser> transform(Map<String, containsValue> map) {
        if (map == null) {
            return null;
        }
        ArrayList<containsValue> arrayList = new ArrayList<>(map.values());
        ArrayList arrayList2 = new ArrayList();
        for (containsValue transform : arrayList) {
            arrayList2.add(transform(transform));
        }
        return arrayList2;
    }

    private AltBeaconParser transform(containsValue containsvalue) {
        if (containsvalue == null) {
            return null;
        }
        AltBeaconParser altBeaconParser = new AltBeaconParser();
        altBeaconParser.setTitle(containsvalue.title);
        altBeaconParser.setRedirectUrl(containsvalue.redirectUrl);
        altBeaconParser.setKey(containsvalue.key);
        altBeaconParser.setEnable(containsvalue.enable);
        return altBeaconParser;
    }

    /* access modifiers changed from: protected */
    public List<AltBeaconParser> map(Map<String, containsValue> map) {
        return transform(map);
    }
}
