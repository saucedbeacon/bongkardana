package o;

import io.split.android.client.Evaluator;
import io.split.android.client.dtos.DataType;
import java.util.Map;

public final class addTranslucentView implements transparentStatusBar {
    private final DataType getMax;
    private final long getMin;
    private final long setMax;

    public addTranslucentView(long j, DataType dataType) {
        this.getMin = j;
        this.getMax = dataType;
        if (dataType == DataType.DATETIME) {
            this.setMax = calculateStatusColor.setMax(Long.valueOf(this.getMin)).longValue();
        } else {
            this.setMax = this.getMin;
        }
    }

    public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
        Long l;
        if (this.getMax == DataType.DATETIME) {
            l = calculateStatusColor.setMax(obj);
        } else {
            l = calculateStatusColor.length(obj);
        }
        if (l != null && l.longValue() >= this.setMax) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(">= ");
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
        return (obj instanceof addTranslucentView) && this.getMin == ((addTranslucentView) obj).getMin;
    }
}
