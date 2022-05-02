package o;

import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.infer.annotation.ThreadSafe;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@ThreadConfined("ANY")
public final class computeVerticalScrollExtent {
    private final Map<Class, Object> setMax = Collections.synchronizedMap(new HashMap());

    @ThreadSafe(enableChecks = false)
    public static computeVerticalScrollExtent setMin(computeVerticalScrollExtent computeverticalscrollextent) {
        computeVerticalScrollExtent computeverticalscrollextent2 = new computeVerticalScrollExtent();
        if (computeverticalscrollextent != null) {
            synchronized (computeverticalscrollextent.setMax) {
                computeverticalscrollextent2.setMax.putAll(computeverticalscrollextent.setMax);
            }
        }
        return computeverticalscrollextent2;
    }
}
