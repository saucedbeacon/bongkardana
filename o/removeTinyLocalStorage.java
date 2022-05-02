package o;

import java.util.ArrayList;
import java.util.List;

public final class removeTinyLocalStorage extends setSpeed<List<AltBeaconParser>, List<handlePerformanceLog>> {
    public final /* synthetic */ Object map(Object obj) {
        handlePerformanceLog handleperformancelog;
        List<AltBeaconParser> list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AltBeaconParser altBeaconParser : list) {
            if (altBeaconParser != null) {
                handleperformancelog = new handlePerformanceLog();
                handleperformancelog.getMin = altBeaconParser.isEnable();
                handleperformancelog.setMax = altBeaconParser.getTitle();
                handleperformancelog.length = altBeaconParser.getRedirectUrl();
            } else {
                handleperformancelog = null;
            }
            arrayList.add(handleperformancelog);
        }
        return arrayList;
    }
}
