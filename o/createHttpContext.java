package o;

import io.split.android.client.Evaluator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class createHttpContext implements transparentStatusBar {
    private final Set<String> setMax;

    public createHttpContext(Collection<String> collection) {
        HashSet hashSet = new HashSet();
        this.setMax = hashSet;
        if (collection != null) {
            hashSet.addAll(collection);
            return;
        }
        throw new IllegalArgumentException("Null whitelist");
    }

    public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
        if (obj == null || !(obj instanceof Collection)) {
            return false;
        }
        Set<String> min = calculateStatusColor.getMin((Collection) obj);
        for (String contains : this.setMax) {
            if (min.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("contains any of ");
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
        if (!(obj instanceof createHttpContext)) {
            return false;
        }
        return this.setMax.equals(((createHttpContext) obj).setMax);
    }
}
