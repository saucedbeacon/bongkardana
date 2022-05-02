package o;

import io.split.android.client.Evaluator;
import java.util.Map;

public final class setDarkMode implements transparentStatusBar {
    private boolean getMax;

    public setDarkMode(boolean z) {
        this.getMax = z;
    }

    public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
        Boolean min;
        if (obj == null || (min = calculateStatusColor.getMin(obj)) == null || min.booleanValue() != this.getMax) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("is ");
        sb.append(this.getMax);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getMax == ((setDarkMode) obj).getMax;
    }

    public final int hashCode() {
        return this.getMax ? 1 : 0;
    }
}
