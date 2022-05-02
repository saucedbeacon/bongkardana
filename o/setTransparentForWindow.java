package o;

import io.split.android.client.Evaluator;
import io.split.android.client.dtos.DataType;
import java.util.Map;

public final class setTransparentForWindow implements transparentStatusBar {
    private final long getMax;
    private final long getMin;
    private final DataType setMin;

    public setTransparentForWindow(long j, DataType dataType) {
        this.getMin = j;
        this.setMin = dataType;
        if (dataType == DataType.DATETIME) {
            this.getMax = calculateStatusColor.setMax(Long.valueOf(this.getMin)).longValue();
        } else {
            this.getMax = this.getMin;
        }
    }

    public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
        Long l;
        if (this.setMin == DataType.DATETIME) {
            l = calculateStatusColor.setMax(obj);
        } else {
            l = calculateStatusColor.length(obj);
        }
        if (l != null && l.longValue() <= this.getMax) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<= ");
        sb.append(this.getMin);
        return sb.toString();
    }

    public final int hashCode() {
        long j = this.getMin;
        return ((int) (j ^ (j >>> 32))) + 527;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof setTransparentForWindow) && this.getMin == ((setTransparentForWindow) obj).getMin;
    }
}
