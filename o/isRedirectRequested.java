package o;

import io.split.android.client.Evaluator;
import java.util.Map;
import java.util.regex.Pattern;

public final class isRedirectRequested implements transparentStatusBar {
    private Pattern getMin;
    private String length;

    public isRedirectRequested(String str) {
        this.length = str;
        this.getMin = Pattern.compile(str);
    }

    public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
        if (obj != null && (obj instanceof String)) {
            return this.getMin.matcher((String) obj).find();
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("matches ");
        sb.append(this.length);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.length;
            String str2 = ((isRedirectRequested) obj).length;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.length;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
