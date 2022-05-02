package o;

import io.split.android.client.Evaluator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class createConnectionKeepAliveStrategy implements transparentStatusBar {
    private final Set<String> getMax;

    public createConnectionKeepAliveStrategy(Collection<String> collection) {
        HashSet hashSet = new HashSet();
        this.getMax = hashSet;
        if (collection != null) {
            hashSet.addAll(collection);
            return;
        }
        throw new IllegalArgumentException("Null whitelist");
    }

    public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
        if (obj == null || !(obj instanceof String) || this.getMax.isEmpty()) {
            return false;
        }
        String str2 = (String) obj;
        for (String next : this.getMax) {
            if (!next.isEmpty() && str2.endsWith(next)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ends with ");
        sb.append(this.getMax);
        return sb.toString();
    }

    public final int hashCode() {
        return this.getMax.hashCode() + 527;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createConnectionKeepAliveStrategy)) {
            return false;
        }
        return this.getMax.equals(((createConnectionKeepAliveStrategy) obj).getMax);
    }
}
