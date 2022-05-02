package o;

import java.util.ArrayList;
import java.util.List;
import o.GriverRVTransortServiceImpl;
import o.g;

public final class l extends setSpeed<List<GriverRVTransortServiceImpl.AnonymousClass1>, List<g.AnonymousClass1>> {
    public final /* synthetic */ Object map(Object obj) {
        g.AnonymousClass1 r2;
        List<GriverRVTransortServiceImpl.AnonymousClass1> list = (List) obj;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (GriverRVTransortServiceImpl.AnonymousClass1 r1 : list) {
            if (r1 != null) {
                r2 = new g.AnonymousClass1();
                r2.getMax = r1.getId();
                r2.getMin = r1.getName();
            } else {
                r2 = null;
            }
            arrayList.add(r2);
        }
        return arrayList;
    }
}
