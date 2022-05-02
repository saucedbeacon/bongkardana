package o;

import io.split.android.client.SplitFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class getUMIDComp {
    public List<SplitFilter> group(List<SplitFilter> list) {
        HashMap hashMap = new HashMap();
        for (SplitFilter next : list) {
            List list2 = (List) hashMap.get(next.getType());
            if (list2 == null) {
                list2 = new ArrayList();
                hashMap.put(next.getType(), list2);
            }
            list2.addAll(next.getValues());
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 0) {
                arrayList.add(new SplitFilter((SplitFilter.Type) entry.getKey(), (List) entry.getValue()));
            }
        }
        return arrayList;
    }
}
