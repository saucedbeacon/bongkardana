package o;

import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class setQueryRefinementEnabled {
    private final String getMax;
    private final char getMin;
    private final double length;
    public final double setMax;
    public final List<showSoftInputIfNecessary> setMin;
    private final String toIntRange;

    public setQueryRefinementEnabled(List<showSoftInputIfNecessary> list, char c, double d, double d2, String str, String str2) {
        this.setMin = list;
        this.getMin = c;
        this.length = d;
        this.setMax = d2;
        this.getMax = str;
        this.toIntRange = str2;
    }

    public final int hashCode() {
        return ((((this.getMin + 0) * 31) + this.toIntRange.hashCode()) * 31) + this.getMax.hashCode();
    }
}
