package o;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class setSmoothScrollbarEnabled implements updateLayoutState {
    private byte[] length;
    public TreeMap<String, String> setMin = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    public final Iterator<String> length() {
        return Collections.unmodifiableSet(this.setMin.keySet()).iterator();
    }

    public final String getMin(String str) {
        String str2 = this.setMin.get(str);
        return str2 == null ? "" : str2;
    }

    public final byte[] getMax() {
        return this.length;
    }

    public final void length(byte[] bArr) {
        this.length = bArr;
    }

    public final void length(String str, String str2) {
        this.setMin.put(str, str2);
    }

    public final boolean setMax(String str) {
        return this.setMin.containsKey(str);
    }
}
