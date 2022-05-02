package o;

import io.split.android.client.Evaluator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class createRedirectHandler implements transparentStatusBar {
    private final Set<String> setMax;

    public createRedirectHandler(Collection<String> collection) {
        HashSet hashSet = new HashSet();
        this.setMax = hashSet;
        if (collection != null) {
            hashSet.addAll(collection);
            return;
        }
        throw new IllegalArgumentException("Null whitelist");
    }

    public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
        if (obj != null && (obj instanceof Collection)) {
            return calculateStatusColor.getMin((Collection) obj).equals(this.setMax);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("is equal to  ");
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
        if (!(obj instanceof createRedirectHandler)) {
            return false;
        }
        return this.setMax.equals(((createRedirectHandler) obj).setMax);
    }
}
