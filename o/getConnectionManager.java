package o;

import io.split.android.client.Evaluator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class getConnectionManager implements transparentStatusBar {
    private final Set<String> setMax;

    public getConnectionManager(Collection<String> collection) {
        HashSet hashSet = new HashSet();
        this.setMax = hashSet;
        if (collection != null) {
            hashSet.addAll(collection);
            return;
        }
        throw new IllegalArgumentException("Null whitelist");
    }

    public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
        if (obj == null || !(obj instanceof String) || this.setMax.isEmpty()) {
            return false;
        }
        String str2 = (String) obj;
        for (String next : this.setMax) {
            if (!next.isEmpty() && str2.contains(next)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("contains ");
        sb.append(this.setMax);
        return sb.toString();
    }

    public final int hashCode() {
        return this.setMax.hashCode() + 527;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getConnectionManager)) {
            return false;
        }
        return this.setMax.equals(((getConnectionManager) obj).setMax);
    }
}
