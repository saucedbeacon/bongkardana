package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u0007J\u001b\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/time/AdjustedTimeMark;", "Lkotlin/time/TimeMark;", "mark", "adjustment", "Lkotlin/time/Duration;", "(Lkotlin/time/TimeMark;DLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdjustment-UwyO8pc", "()D", "D", "getMark", "()Lkotlin/time/TimeMark;", "elapsedNow", "elapsedNow-UwyO8pc", "plus", "duration", "plus-LRDsOJo", "(D)Lkotlin/time/TimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 4, 1})
@ExperimentalTime
final class AdjustedTimeMark extends TimeMark {
    private final double adjustment;
    @NotNull
    private final TimeMark mark;

    private AdjustedTimeMark(TimeMark timeMark, double d) {
        this.mark = timeMark;
        this.adjustment = d;
    }

    public /* synthetic */ AdjustedTimeMark(TimeMark timeMark, double d, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeMark, d);
    }

    /* renamed from: getAdjustment-UwyO8pc  reason: not valid java name */
    public final double m1515getAdjustmentUwyO8pc() {
        return this.adjustment;
    }

    @NotNull
    public final TimeMark getMark() {
        return this.mark;
    }

    /* renamed from: elapsedNow-UwyO8pc  reason: not valid java name */
    public final double m1514elapsedNowUwyO8pc() {
        return Duration.m1544minusLRDsOJo(this.mark.m1108elapsedNowUwyO8pc(), this.adjustment);
    }

    @NotNull
    /* renamed from: plus-LRDsOJo  reason: not valid java name */
    public final TimeMark m1516plusLRDsOJo(double d) {
        return new AdjustedTimeMark(this.mark, Duration.m1545plusLRDsOJo(this.adjustment, d), (DefaultConstructorMarker) null);
    }
}
