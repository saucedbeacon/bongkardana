package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\bø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\bø\u0001\u0000ø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\bø\u0001\u0001\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0002\u000b\n\u0002\b\u0019\n\u0005\b20\u0001¨\u0006\u000b"}, d2 = {"measureTime", "Lkotlin/time/Duration;", "block", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)D", "measureTimedValue", "Lkotlin/time/TimedValue;", "T", "Lkotlin/time/TimeSource;", "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)D", "kotlin-stdlib"}, k = 2, mv = {1, 4, 1})
public final class MeasureTimeKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final double measureTime(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        TimeMark markNow = TimeSource.Monotonic.INSTANCE.markNow();
        function0.invoke();
        return markNow.m1108elapsedNowUwyO8pc();
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalTime
    public static final double measureTime(@NotNull TimeSource timeSource, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(timeSource, "$this$measureTime");
        Intrinsics.checkNotNullParameter(function0, "block");
        TimeMark markNow = timeSource.markNow();
        function0.invoke();
        return markNow.m1108elapsedNowUwyO8pc();
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    @ExperimentalTime
    public static final <T> TimedValue<T> measureTimedValue(@NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        return new TimedValue<>(function0.invoke(), TimeSource.Monotonic.INSTANCE.markNow().m1108elapsedNowUwyO8pc(), (DefaultConstructorMarker) null);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    @ExperimentalTime
    public static final <T> TimedValue<T> measureTimedValue(@NotNull TimeSource timeSource, @NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(timeSource, "$this$measureTimedValue");
        Intrinsics.checkNotNullParameter(function0, "block");
        return new TimedValue<>(function0.invoke(), timeSource.markNow().m1108elapsedNowUwyO8pc(), (DefaultConstructorMarker) null);
    }
}
