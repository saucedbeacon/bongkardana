package kotlin.ranges;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/ClosedDoubleRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "start", "endInclusive", "(DD)V", "_endInclusive", "_start", "getEndInclusive", "()Ljava/lang/Double;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "lessThanOrEquals", "a", "b", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 4, 1})
public final class ClosedDoubleRange implements ClosedFloatingPointRange<Double> {
    private final double _endInclusive;
    private final double _start;

    public final boolean lessThanOrEquals(double d, double d2) {
        return d <= d2;
    }

    public ClosedDoubleRange(double d, double d2) {
        this._start = d;
        this._endInclusive = d2;
    }

    public final /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public final /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    @NotNull
    public final Double getStart() {
        return Double.valueOf(this._start);
    }

    @NotNull
    public final Double getEndInclusive() {
        return Double.valueOf(this._endInclusive);
    }

    public final boolean contains(double d) {
        return d >= this._start && d <= this._endInclusive;
    }

    public final boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ClosedDoubleRange)) {
            return false;
        }
        if (isEmpty() && ((ClosedDoubleRange) obj).isEmpty()) {
            return true;
        }
        ClosedDoubleRange closedDoubleRange = (ClosedDoubleRange) obj;
        return this._start == closedDoubleRange._start && this._endInclusive == closedDoubleRange._endInclusive;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this._start).hashCode() * 31) + Double.valueOf(this._endInclusive).hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._start);
        sb.append("..");
        sb.append(this._endInclusive);
        return sb.toString();
    }
}
