package o;

import io.split.android.client.Evaluator;
import io.split.android.client.dtos.DataType;
import java.util.Map;

public final class clearPreviousSetting implements transparentStatusBar {
    private final long getMin;
    private final long setMax;
    private final DataType setMin;

    public clearPreviousSetting(long j, DataType dataType) {
        this.setMax = j;
        this.setMin = dataType;
        if (dataType == DataType.DATETIME) {
            this.getMin = calculateStatusColor.getMax(Long.valueOf(this.setMax)).longValue();
        } else {
            this.getMin = this.setMax;
        }
    }

    public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
        Long l;
        if (this.setMin == DataType.DATETIME) {
            l = calculateStatusColor.getMax(obj);
        } else {
            l = calculateStatusColor.length(obj);
        }
        return l != null && l.longValue() == this.getMin;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("== ");
        sb.append(this.setMax);
        return sb.toString();
    }

    public final int hashCode() {
        long j = this.setMax;
        return ((int) (j ^ (j >>> 32))) + 527;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof clearPreviousSetting) && this.setMax == ((clearPreviousSetting) obj).setMax;
    }
}
