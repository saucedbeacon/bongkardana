package o;

import io.split.android.client.Evaluator;
import io.split.android.client.dtos.DataType;
import java.util.Map;

public final class hideFakeStatusBarView implements transparentStatusBar {
    private final long getMax;
    private final long getMin;
    private final long length;
    private final DataType setMax;
    private final long setMin;

    public hideFakeStatusBarView(long j, long j2, DataType dataType) {
        this.getMax = j;
        this.length = j2;
        this.setMax = dataType;
        if (dataType == DataType.DATETIME) {
            this.setMin = calculateStatusColor.setMax(Long.valueOf(this.getMax)).longValue();
            this.getMin = calculateStatusColor.setMax(Long.valueOf(this.length)).longValue();
            return;
        }
        this.setMin = this.getMax;
        this.getMin = this.length;
    }

    public final boolean length(Object obj, String str, Map<String, Object> map, Evaluator evaluator) {
        Long l;
        if (this.setMax == DataType.DATETIME) {
            l = calculateStatusColor.setMax(obj);
        } else {
            l = calculateStatusColor.length(obj);
        }
        if (l != null && l.longValue() >= this.setMin && l.longValue() <= this.getMin) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("between ");
        sb.append(this.getMax);
        sb.append(" and ");
        sb.append(this.length);
        return sb.toString();
    }

    public final int hashCode() {
        long j = this.getMax;
        long j2 = this.length;
        return ((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hideFakeStatusBarView)) {
            return false;
        }
        hideFakeStatusBarView hidefakestatusbarview = (hideFakeStatusBarView) obj;
        return this.getMax == hidefakestatusbarview.getMax && this.length == hidefakestatusbarview.length;
    }
}
