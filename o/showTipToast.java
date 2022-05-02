package o;

import java.util.Iterator;
import java.util.List;

public class showTipToast {
    public String join(String str, List<String> list) {
        if (list == null || list.size() == 0 || str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(str);
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public String join(String str, Iterable<String> iterable) {
        if (iterable == null || str == null) {
            return "";
        }
        Iterator<String> it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(it.next().toString());
        while (it.hasNext()) {
            sb.append(str);
            sb.append(it.next().toString());
        }
        return sb.toString();
    }
}
