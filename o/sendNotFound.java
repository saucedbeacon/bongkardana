package o;

import java.math.BigDecimal;
import java.util.Comparator;

final class sendNotFound implements Comparator {
    public static final sendNotFound length = new sendNotFound();

    public final int compare(Object obj, Object obj2) {
        return BigDecimal.valueOf(((GriverConfigUtils) obj).getDistance()).compareTo(BigDecimal.valueOf(((GriverConfigUtils) obj2).getDistance()));
    }
}
