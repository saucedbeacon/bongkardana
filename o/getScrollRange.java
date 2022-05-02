package o;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

final class getScrollRange<V> {
    final Map<String, pageScroll> getMax = new LinkedHashMap();
    final Map<pageScroll, V> getMin = new HashMap();
    final Map<String, pageScroll> length = new LinkedHashMap();
    final Map<String, Map<String, pageScroll>> setMax = new LinkedHashMap();

    getScrollRange() {
    }

    /* access modifiers changed from: package-private */
    public final boolean setMin(pageScroll pagescroll) {
        return this.getMin.containsKey(pagescroll);
    }

    /* access modifiers changed from: package-private */
    public final void getMin(pageScroll pagescroll, V v) {
        if (this.getMin.put(pagescroll, v) == null) {
            int i = pagescroll.length;
            if (i == 1) {
                this.getMax.put(pagescroll.setMin, pagescroll);
            } else if (i == 2) {
                String str = pagescroll.getMax;
                Map map = this.setMax.get(str);
                if (map == null) {
                    map = new LinkedHashMap();
                    this.setMax.put(str, map);
                }
                map.put(pagescroll.setMin, pagescroll);
            } else if (i == 3) {
                this.length.put(pagescroll.setMin, pagescroll);
            } else {
                StringBuilder sb = new StringBuilder("Unknown TransitionId type ");
                sb.append(pagescroll.length);
                throw new RuntimeException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void length(pageScroll pagescroll) {
        if (this.getMin.remove(pagescroll) != null) {
            int i = pagescroll.length;
            if (i == 1) {
                this.getMax.remove(pagescroll.setMin);
            } else if (i == 2) {
                String str = pagescroll.getMax;
                Map map = this.setMax.get(str);
                map.remove(pagescroll.setMin);
                if (map.isEmpty()) {
                    this.setMax.remove(str);
                }
            } else if (i == 3) {
                this.length.remove(pagescroll.setMin);
            }
        }
    }
}
