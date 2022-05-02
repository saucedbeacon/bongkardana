package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class staticSafeEncrypt {
    public boolean mySegmentsHaveChanged(List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list2);
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        return !arrayList.equals(arrayList2);
    }
}
