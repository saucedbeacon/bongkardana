package o;

import io.split.android.client.Evaluator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class createStatusBarView implements transparentStatusBar {
    private final Set<String> getMin;

    public createStatusBarView(Collection<String> collection) {
        HashSet hashSet = new HashSet();
        this.getMin = hashSet;
        if (collection != null) {
            hashSet.addAll(collection);
            return;
        }
        throw new IllegalArgumentException("Null whitelist");
    }

    public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
        if (obj != null && (obj instanceof Collection) && !this.getMin.isEmpty()) {
            return calculateStatusColor.getMin((Collection) obj).containsAll(this.getMin);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("contains all of ");
        sb.append(this.getMin);
        return sb.toString();
    }

    public final int hashCode() {
        return this.getMin.hashCode() + 527;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createStatusBarView)) {
            return false;
        }
        return this.getMin.equals(((createStatusBarView) obj).getMin);
    }
}
