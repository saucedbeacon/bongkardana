package o;

import java.util.Collections;
import java.util.Map;
import o.access$1600;

public interface access$1800 {
    @Deprecated
    public static final access$1800 getMax = new access$1800() {
        public final Map<String, String> getMin() {
            return Collections.emptyMap();
        }
    };
    public static final access$1800 setMax;

    Map<String, String> getMin();

    static {
        access$1600.length length = new access$1600.length();
        length.length = true;
        setMax = new access$1600(length.getMin);
    }
}
