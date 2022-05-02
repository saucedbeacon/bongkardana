package o;

import io.split.android.client.Evaluator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class createHttpProcessor implements transparentStatusBar {
    private final Set<String> length;

    public createHttpProcessor(Collection<String> collection) {
        HashSet hashSet = new HashSet();
        this.length = hashSet;
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
        if (min.isEmpty()) {
            return false;
        }
        return this.length.containsAll(min);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("is part of ");
        sb.append(this.length);
        return sb.toString();
    }

    public final int hashCode() {
        return this.length.hashCode() + 527;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createHttpProcessor)) {
            return false;
        }
        return this.length.equals(((createHttpProcessor) obj).length);
    }
}
