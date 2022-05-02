package o;

import io.split.android.client.dtos.ConditionType;
import io.split.android.client.dtos.Partition;
import java.util.List;

public final class setTransparent {
    public final setMIUIStatusBarDarkIcon getMax;
    public final ConditionType getMin;
    public final List<Partition> length;
    public final String setMax;

    public setTransparent(ConditionType conditionType, setMIUIStatusBarDarkIcon setmiuistatusbardarkicon, List<Partition> list, String str) {
        this.getMin = conditionType;
        this.getMax = setmiuistatusbardarkicon;
        this.length = list;
        this.setMax = str;
    }

    public final int hashCode() {
        int hashCode = this.getMax.hashCode() + 527;
        int i = 17;
        for (Partition next : this.length) {
            i = (((i * 31) + next.treatment.hashCode()) * 31) + next.size;
        }
        return (hashCode * 31) + i;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTransparent)) {
            return false;
        }
        setTransparent settransparent = (setTransparent) obj;
        boolean equals = this.getMax.equals(settransparent.getMax);
        if (!equals) {
            return false;
        }
        if (this.length.size() != settransparent.length.size()) {
            return equals;
        }
        for (int i = 0; i < this.length.size(); i++) {
            Partition partition = this.length.get(i);
            Partition partition2 = settransparent.length.get(i);
            equals &= partition.size == partition2.size && partition.treatment.equals(partition2.treatment);
        }
        return equals;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMax);
        sb.append(" then split ");
        boolean z = true;
        for (Partition next : this.length) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next.size);
            sb.append(':');
            sb.append(next.treatment);
            z = false;
        }
        return sb.toString();
    }
}
