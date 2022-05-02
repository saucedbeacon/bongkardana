package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public abstract class createNodeForChild {
    private long getMax = 0;
    public ArrayList<createNodeForChild> getMin = null;
    public Map<String, createNodeForChild> length = null;
    public float setMax;

    /* access modifiers changed from: protected */
    public abstract float setMin(long j);

    public void getMax(float f) {
        this.setMax = f;
    }

    private boolean length(String str) {
        Map<String, createNodeForChild> map = this.length;
        if (map == null) {
            return false;
        }
        return map.containsKey(str);
    }

    private String length() {
        Map<String, createNodeForChild> map = this.length;
        if (map == null) {
            return "[]";
        }
        Iterator<String> it = map.keySet().iterator();
        String str = "";
        while (it.hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("'");
            sb.append(it.next());
            sb.append("'");
            str = sb.toString();
            if (!it.hasNext()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                str = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(str);
        sb3.append("]");
        return sb3.toString();
    }

    /* access modifiers changed from: package-private */
    public final void getMax(long j) {
        float min = setMin(j);
        if (j != this.getMax) {
            this.getMax = j;
            this.setMax = min;
            return;
        }
        throw new RuntimeException("Got a calculate value call multiple times in the same frame. This isn't expected.");
    }

    public final void setMax(String str) {
        Map<String, createNodeForChild> map = this.length;
        if (map == null || map.remove(str) == null) {
            throw new RuntimeException("Tried to remove non-existent input with name: ".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: protected */
    public final createNodeForChild getMax(String str) {
        createNodeForChild createnodeforchild;
        Map<String, createNodeForChild> map = this.length;
        if (map == null) {
            createnodeforchild = null;
        } else {
            createnodeforchild = map.get(str);
        }
        if (createnodeforchild != null) {
            return createnodeforchild;
        }
        StringBuilder sb = new StringBuilder("Tried to get non-existent input '");
        sb.append(str);
        sb.append("'. Node only has these inputs: ");
        sb.append(length());
        throw new RuntimeException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final createNodeForChild setMax() {
        Map<String, createNodeForChild> map = this.length;
        if ((map == null ? 0 : map.size()) <= 1) {
            return getMax("default_input");
        }
        throw new RuntimeException("Trying to get single input of node with multiple inputs!");
    }

    /* access modifiers changed from: protected */
    public final boolean getMax() {
        Map<String, createNodeForChild> map = this.length;
        if ((map == null ? 0 : map.size()) <= 1) {
            return length("default_input");
        }
        throw new RuntimeException("Trying to check for single input of node with multiple inputs!");
    }
}
