package o;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;

public class setLightMode {
    public final int IsOverlapping;
    public final Map<String, String> equals;
    public final String getMax;
    public final int getMin;
    public final int isInside;
    public final ImmutableList<setTransparent> length;
    public final String setMax;
    public final String setMin;
    public final long toFloatRange;
    public final int toIntRange;
    private final boolean values;

    public setLightMode(String str, int i, boolean z, String str2, List<setTransparent> list, String str3, long j, int i2, int i3, int i4, Map<String, String> map) {
        this.setMax = str;
        this.getMin = i;
        this.values = z;
        this.setMin = str2;
        this.length = ImmutableList.copyOf(list);
        this.getMax = str3;
        this.toFloatRange = j;
        this.isInside = i4;
        this.equals = map;
        if (this.setMin != null) {
            this.toIntRange = i2;
            this.IsOverlapping = i3;
            return;
        }
        throw new IllegalArgumentException("DefaultTreatment is null");
    }

    public final boolean length() {
        return this.values;
    }

    public int hashCode() {
        int i = this.getMin;
        int hashCode = (((((((((this.setMax.hashCode() + 527) * 31) + (i ^ (i >>> 32))) * 31) + (this.values ? 1 : 0)) * 31) + this.setMin.hashCode()) * 31) + this.length.hashCode()) * 31;
        String str = this.getMax;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.toFloatRange;
        int i2 = this.isInside;
        return ((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (i2 ^ (i2 >>> 32));
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLightMode)) {
            return false;
        }
        setLightMode setlightmode = (setLightMode) obj;
        if (this.setMax.equals(setlightmode.setMax) && this.getMin == setlightmode.getMin && this.values == setlightmode.values && this.setMin.equals(setlightmode.setMin) && this.length.equals(setlightmode.length) && ((str = this.getMax) != null ? str.equals(setlightmode.getMax) : setlightmode.getMax == null) && this.toFloatRange == setlightmode.toFloatRange && this.isInside == setlightmode.isInside) {
            Map<String, String> map = this.equals;
            Map<String, String> map2 = setlightmode.equals;
            return map != null ? map.equals(map2) : map2 == null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("name:");
        sb.append(this.setMax);
        sb.append(", seed:");
        sb.append(this.getMin);
        sb.append(", killed:");
        sb.append(this.values);
        sb.append(", default treatment:");
        sb.append(this.setMin);
        sb.append(", parsedConditions:");
        sb.append(this.length);
        sb.append(", trafficTypeName:");
        sb.append(this.getMax);
        sb.append(", changeNumber:");
        sb.append(this.toFloatRange);
        sb.append(", algo:");
        sb.append(this.isInside);
        sb.append(", config:");
        sb.append(this.equals);
        return sb.toString();
    }
}
