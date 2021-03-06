package kotlin.time;

import id.dana.data.config.source.amcs.result.OTCAcceptExpiryTimeConfigResult;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.3")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\b@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u001e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010-J\u001b\u0010)\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010,J\u001a\u0010/\u001a\u0002002\b\u0010&\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b5\u0010\rJ\r\u00106\u001a\u000200¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u000200¢\u0006\u0004\b:\u00108J\r\u0010;\u001a\u000200¢\u0006\u0004\b<\u00108J\r\u0010=\u001a\u000200¢\u0006\u0004\b>\u00108J\u001b\u0010?\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010,J\u001b\u0010A\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\bB\u0010,J\u0017\u0010C\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0004\bD\u0010(J\u001e\u0010E\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010,J\u001e\u0010E\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010-J\u0001\u0010G\u001a\u0002HH\"\u0004\b\u0000\u0010H2u\u0010I\u001aq\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(M\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(O\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(P\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(Q\u0012\u0004\u0012\u0002HH0JH\bø\u0001\u0002\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bR\u0010SJ\u0001\u0010G\u001a\u0002HH\"\u0004\b\u0000\u0010H2`\u0010I\u001a\\\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(O\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(P\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(Q\u0012\u0004\u0012\u0002HH0TH\bø\u0001\u0002\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bR\u0010UJs\u0010G\u001a\u0002HH\"\u0004\b\u0000\u0010H2K\u0010I\u001aG\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(O\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(P\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(Q\u0012\u0004\u0012\u0002HH0VH\bø\u0001\u0002\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bR\u0010WJ^\u0010G\u001a\u0002HH\"\u0004\b\u0000\u0010H26\u0010I\u001a2\u0012\u0013\u0012\u00110Y¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(P\u0012\u0013\u0012\u00110\t¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(Q\u0012\u0004\u0012\u0002HH0XH\bø\u0001\u0002\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bR\u0010ZJ\u0019\u0010[\u001a\u00020\u00032\n\u0010\\\u001a\u00060]j\u0002`^¢\u0006\u0004\b_\u0010`J\u0019\u0010a\u001a\u00020\t2\n\u0010\\\u001a\u00060]j\u0002`^¢\u0006\u0004\bb\u0010cJ\r\u0010d\u001a\u00020e¢\u0006\u0004\bf\u0010gJ\u0019\u0010h\u001a\u00020Y2\n\u0010\\\u001a\u00060]j\u0002`^¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020Y¢\u0006\u0004\bl\u0010mJ\r\u0010n\u001a\u00020Y¢\u0006\u0004\bo\u0010mJ\u000f\u0010p\u001a\u00020eH\u0016¢\u0006\u0004\bq\u0010gJ#\u0010p\u001a\u00020e2\n\u0010\\\u001a\u00060]j\u0002`^2\b\b\u0002\u0010r\u001a\u00020\t¢\u0006\u0004\bq\u0010sJ\u0016\u0010t\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bu\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u001a\u0010\u001c\u001a\u00020\t8@X\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\t8@X\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\rR\u001a\u0010\"\u001a\u00020\t8@X\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000ø\u0001\u0000\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b20\u0001¨\u0006w"}, d2 = {"Lkotlin/time/Duration;", "", "value", "", "constructor-impl", "(D)D", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(D)I", "inDays", "getInDays-impl", "inHours", "getInHours-impl", "inMicroseconds", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds-impl", "inMinutes", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds-impl", "inSeconds", "getInSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "compareTo", "other", "compareTo-LRDsOJo", "(DD)I", "div", "scale", "div-UwyO8pc", "(DD)D", "(DI)D", "div-LRDsOJo", "equals", "", "", "equals-impl", "(DLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(D)Z", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "plus", "plus-LRDsOJo", "precision", "precision-impl", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(DLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(DLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(DLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "(DLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "toDouble-impl", "(DLjava/util/concurrent/TimeUnit;)D", "toInt", "toInt-impl", "(DLjava/util/concurrent/TimeUnit;)I", "toIsoString", "", "toIsoString-impl", "(D)Ljava/lang/String;", "toLong", "toLong-impl", "(DLjava/util/concurrent/TimeUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "(D)J", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(DLjava/util/concurrent/TimeUnit;I)Ljava/lang/String;", "unaryMinus", "unaryMinus-UwyO8pc", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 4, 1})
@ExperimentalTime
public final class Duration implements Comparable<Duration> {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final double INFINITE = m1521constructorimpl(Double.POSITIVE_INFINITY);
    /* access modifiers changed from: private */
    public static final double ZERO = m1521constructorimpl(0.0d);
    private final double value;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Duration m1519boximpl(double d) {
        return new Duration(d);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static double m1521constructorimpl(double d) {
        return d;
    }

    /* renamed from: div-LRDsOJo  reason: not valid java name */
    public static final double m1522divLRDsOJo(double d, double d2) {
        return d / d2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1525equalsimpl(double d, Object obj) {
        return (obj instanceof Duration) && Double.compare(d, ((Duration) obj).m1564unboximpl()) == 0;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1526equalsimpl0(double d, double d2) {
        return Double.compare(d, d2) == 0;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1539hashCodeimpl(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    /* renamed from: isNegative-impl  reason: not valid java name */
    public static final boolean m1542isNegativeimpl(double d) {
        return d < 0.0d;
    }

    /* renamed from: isPositive-impl  reason: not valid java name */
    public static final boolean m1543isPositiveimpl(double d) {
        return d > 0.0d;
    }

    /* renamed from: precision-impl  reason: not valid java name */
    private static final int m1546precisionimpl(double d, double d2) {
        if (d2 < 1.0d) {
            return 3;
        }
        if (d2 < 10.0d) {
            return 2;
        }
        return d2 < 100.0d ? 1 : 0;
    }

    /* renamed from: compareTo-LRDsOJo  reason: not valid java name */
    public final int m1563compareToLRDsOJo(double d) {
        return m1520compareToLRDsOJo(this.value, d);
    }

    public final boolean equals(Object obj) {
        return m1525equalsimpl(this.value, obj);
    }

    public final int hashCode() {
        return m1539hashCodeimpl(this.value);
    }

    @NotNull
    public final String toString() {
        return m1559toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ double m1564unboximpl() {
        return this.value;
    }

    private /* synthetic */ Duration(double d) {
        this.value = d;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return m1563compareToLRDsOJo(((Duration) obj).m1564unboximpl());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()D", "D", "ZERO", "getZERO-UwyO8pc", "convert", "", "value", "sourceUnit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "targetUnit", "kotlin-stdlib"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZERO-UwyO8pc  reason: not valid java name */
        public final double m1566getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* renamed from: getINFINITE-UwyO8pc  reason: not valid java name */
        public final double m1565getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        public final double convert(double d, @NotNull TimeUnit timeUnit, @NotNull TimeUnit timeUnit2) {
            Intrinsics.checkNotNullParameter(timeUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(timeUnit2, "targetUnit");
            return DurationUnitKt.convertDurationUnit(d, timeUnit, timeUnit2);
        }
    }

    /* renamed from: unaryMinus-UwyO8pc  reason: not valid java name */
    public static final double m1562unaryMinusUwyO8pc(double d) {
        return m1521constructorimpl(-d);
    }

    /* renamed from: plus-LRDsOJo  reason: not valid java name */
    public static final double m1545plusLRDsOJo(double d, double d2) {
        return m1521constructorimpl(d + d2);
    }

    /* renamed from: minus-LRDsOJo  reason: not valid java name */
    public static final double m1544minusLRDsOJo(double d, double d2) {
        return m1521constructorimpl(d - d2);
    }

    /* renamed from: times-UwyO8pc  reason: not valid java name */
    public static final double m1548timesUwyO8pc(double d, int i) {
        double d2 = (double) i;
        Double.isNaN(d2);
        return m1521constructorimpl(d * d2);
    }

    /* renamed from: times-UwyO8pc  reason: not valid java name */
    public static final double m1547timesUwyO8pc(double d, double d2) {
        return m1521constructorimpl(d * d2);
    }

    /* renamed from: div-UwyO8pc  reason: not valid java name */
    public static final double m1524divUwyO8pc(double d, int i) {
        double d2 = (double) i;
        Double.isNaN(d2);
        return m1521constructorimpl(d / d2);
    }

    /* renamed from: div-UwyO8pc  reason: not valid java name */
    public static final double m1523divUwyO8pc(double d, double d2) {
        return m1521constructorimpl(d / d2);
    }

    /* renamed from: isInfinite-impl  reason: not valid java name */
    public static final boolean m1541isInfiniteimpl(double d) {
        return Double.isInfinite(d);
    }

    /* renamed from: isFinite-impl  reason: not valid java name */
    public static final boolean m1540isFiniteimpl(double d) {
        return !Double.isInfinite(d) && !Double.isNaN(d);
    }

    /* renamed from: getAbsoluteValue-UwyO8pc  reason: not valid java name */
    public static final double m1527getAbsoluteValueUwyO8pc(double d) {
        return m1542isNegativeimpl(d) ? m1562unaryMinusUwyO8pc(d) : d;
    }

    /* renamed from: compareTo-LRDsOJo  reason: not valid java name */
    public static int m1520compareToLRDsOJo(double d, double d2) {
        return Double.compare(d, d2);
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m1552toComponentsimpl(double d, @NotNull Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> function5) {
        Intrinsics.checkNotNullParameter(function5, "action");
        return function5.invoke(Integer.valueOf((int) m1529getInDaysimpl(d)), Integer.valueOf(m1528getHoursComponentimpl(d)), Integer.valueOf(m1536getMinutesComponentimpl(d)), Integer.valueOf(m1538getSecondsComponentimpl(d)), Integer.valueOf(m1537getNanosecondsComponentimpl(d)));
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m1551toComponentsimpl(double d, @NotNull Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> function4) {
        Intrinsics.checkNotNullParameter(function4, "action");
        return function4.invoke(Integer.valueOf((int) m1530getInHoursimpl(d)), Integer.valueOf(m1536getMinutesComponentimpl(d)), Integer.valueOf(m1538getSecondsComponentimpl(d)), Integer.valueOf(m1537getNanosecondsComponentimpl(d)));
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m1550toComponentsimpl(double d, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, ? extends T> function3) {
        Intrinsics.checkNotNullParameter(function3, "action");
        return function3.invoke(Integer.valueOf((int) m1533getInMinutesimpl(d)), Integer.valueOf(m1538getSecondsComponentimpl(d)), Integer.valueOf(m1537getNanosecondsComponentimpl(d)));
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m1549toComponentsimpl(double d, @NotNull Function2<? super Long, ? super Integer, ? extends T> function2) {
        Intrinsics.checkNotNullParameter(function2, "action");
        return function2.invoke(Long.valueOf((long) m1535getInSecondsimpl(d)), Integer.valueOf(m1537getNanosecondsComponentimpl(d)));
    }

    /* renamed from: getHoursComponent-impl  reason: not valid java name */
    public static final int m1528getHoursComponentimpl(double d) {
        return (int) (m1530getInHoursimpl(d) % 24.0d);
    }

    /* renamed from: getMinutesComponent-impl  reason: not valid java name */
    public static final int m1536getMinutesComponentimpl(double d) {
        return (int) (m1533getInMinutesimpl(d) % 60.0d);
    }

    /* renamed from: getSecondsComponent-impl  reason: not valid java name */
    public static final int m1538getSecondsComponentimpl(double d) {
        return (int) (m1535getInSecondsimpl(d) % 60.0d);
    }

    /* renamed from: getNanosecondsComponent-impl  reason: not valid java name */
    public static final int m1537getNanosecondsComponentimpl(double d) {
        return (int) (m1534getInNanosecondsimpl(d) % 1.0E9d);
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    public static final double m1553toDoubleimpl(double d, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, OTCAcceptExpiryTimeConfigResult.JsonKey.UNIT);
        return DurationUnitKt.convertDurationUnit(d, DurationKt.getStorageUnit(), timeUnit);
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    public static final long m1556toLongimpl(double d, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, OTCAcceptExpiryTimeConfigResult.JsonKey.UNIT);
        return (long) m1553toDoubleimpl(d, timeUnit);
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    public static final int m1554toIntimpl(double d, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, OTCAcceptExpiryTimeConfigResult.JsonKey.UNIT);
        return (int) m1553toDoubleimpl(d, timeUnit);
    }

    /* renamed from: getInDays-impl  reason: not valid java name */
    public static final double m1529getInDaysimpl(double d) {
        return m1553toDoubleimpl(d, TimeUnit.DAYS);
    }

    /* renamed from: getInHours-impl  reason: not valid java name */
    public static final double m1530getInHoursimpl(double d) {
        return m1553toDoubleimpl(d, TimeUnit.HOURS);
    }

    /* renamed from: getInMinutes-impl  reason: not valid java name */
    public static final double m1533getInMinutesimpl(double d) {
        return m1553toDoubleimpl(d, TimeUnit.MINUTES);
    }

    /* renamed from: getInSeconds-impl  reason: not valid java name */
    public static final double m1535getInSecondsimpl(double d) {
        return m1553toDoubleimpl(d, TimeUnit.SECONDS);
    }

    /* renamed from: getInMilliseconds-impl  reason: not valid java name */
    public static final double m1532getInMillisecondsimpl(double d) {
        return m1553toDoubleimpl(d, TimeUnit.MILLISECONDS);
    }

    /* renamed from: getInMicroseconds-impl  reason: not valid java name */
    public static final double m1531getInMicrosecondsimpl(double d) {
        return m1553toDoubleimpl(d, TimeUnit.MICROSECONDS);
    }

    /* renamed from: getInNanoseconds-impl  reason: not valid java name */
    public static final double m1534getInNanosecondsimpl(double d) {
        return m1553toDoubleimpl(d, TimeUnit.NANOSECONDS);
    }

    /* renamed from: toLongNanoseconds-impl  reason: not valid java name */
    public static final long m1558toLongNanosecondsimpl(double d) {
        return m1556toLongimpl(d, TimeUnit.NANOSECONDS);
    }

    /* renamed from: toLongMilliseconds-impl  reason: not valid java name */
    public static final long m1557toLongMillisecondsimpl(double d) {
        return m1556toLongimpl(d, TimeUnit.MILLISECONDS);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1559toStringimpl(double d) {
        TimeUnit timeUnit;
        String str;
        if (m1541isInfiniteimpl(d)) {
            return String.valueOf(d);
        }
        if (d == 0.0d) {
            return "0s";
        }
        double r0 = m1534getInNanosecondsimpl(m1527getAbsoluteValueUwyO8pc(d));
        boolean z = true;
        int i = 0;
        if (r0 < 1.0E-6d) {
            timeUnit = TimeUnit.SECONDS;
        } else if (r0 < 1.0d) {
            timeUnit = TimeUnit.NANOSECONDS;
            z = false;
            i = 7;
        } else {
            if (r0 < 1000.0d) {
                timeUnit = TimeUnit.NANOSECONDS;
            } else if (r0 < 1000000.0d) {
                timeUnit = TimeUnit.MICROSECONDS;
            } else if (r0 < 1.0E9d) {
                timeUnit = TimeUnit.MILLISECONDS;
            } else if (r0 < 1.0E12d) {
                timeUnit = TimeUnit.SECONDS;
            } else if (r0 < 6.0E13d) {
                timeUnit = TimeUnit.MINUTES;
            } else if (r0 < 3.6E15d) {
                timeUnit = TimeUnit.HOURS;
            } else if (r0 < 8.64E20d) {
                timeUnit = TimeUnit.DAYS;
            } else {
                timeUnit = TimeUnit.DAYS;
            }
            z = false;
        }
        double r1 = m1553toDoubleimpl(d, timeUnit);
        StringBuilder sb = new StringBuilder();
        if (z) {
            str = FormatToDecimalsKt.formatScientific(r1);
        } else if (i > 0) {
            str = FormatToDecimalsKt.formatUpToDecimals(r1, i);
        } else {
            str = FormatToDecimalsKt.formatToExactDecimals(r1, m1546precisionimpl(d, Math.abs(r1)));
        }
        sb.append(str);
        sb.append(DurationUnitKt.shortName(timeUnit));
        return sb.toString();
    }

    /* renamed from: toString-impl$default  reason: not valid java name */
    public static /* synthetic */ String m1561toStringimpl$default(double d, TimeUnit timeUnit, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m1560toStringimpl(d, timeUnit, i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static final String m1560toStringimpl(double d, @NotNull TimeUnit timeUnit, int i) {
        String str;
        Intrinsics.checkNotNullParameter(timeUnit, OTCAcceptExpiryTimeConfigResult.JsonKey.UNIT);
        if (!(i >= 0)) {
            throw new IllegalArgumentException("decimals must be not negative, but was ".concat(String.valueOf(i)).toString());
        } else if (m1541isInfiniteimpl(d)) {
            return String.valueOf(d);
        } else {
            double r6 = m1553toDoubleimpl(d, timeUnit);
            StringBuilder sb = new StringBuilder();
            if (Math.abs(r6) < 1.0E14d) {
                str = FormatToDecimalsKt.formatToExactDecimals(r6, RangesKt.coerceAtMost(i, 12));
            } else {
                str = FormatToDecimalsKt.formatScientific(r6);
            }
            sb.append(str);
            sb.append(DurationUnitKt.shortName(timeUnit));
            return sb.toString();
        }
    }

    @NotNull
    /* renamed from: toIsoString-impl  reason: not valid java name */
    public static final String m1555toIsoStringimpl(double d) {
        StringBuilder sb = new StringBuilder();
        if (m1542isNegativeimpl(d)) {
            sb.append('-');
        }
        sb.append("PT");
        double r7 = m1527getAbsoluteValueUwyO8pc(d);
        int r1 = (int) m1530getInHoursimpl(r7);
        int r2 = m1536getMinutesComponentimpl(r7);
        int r3 = m1538getSecondsComponentimpl(r7);
        int r72 = m1537getNanosecondsComponentimpl(r7);
        boolean z = true;
        boolean z2 = r1 != 0;
        boolean z3 = (r3 == 0 && r72 == 0) ? false : true;
        if (r2 == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(r1);
            sb.append('H');
        }
        if (z) {
            sb.append(r2);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            sb.append(r3);
            if (r72 != 0) {
                sb.append('.');
                String padStart = StringsKt.padStart(String.valueOf(r72), 9, '0');
                if (r72 % 1000000 == 0) {
                    sb.append(padStart, 0, 3);
                    Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
                } else if (r72 % 1000 == 0) {
                    sb.append(padStart, 0, 6);
                    Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
                } else {
                    sb.append(padStart);
                }
            }
            sb.append('S');
        }
        String obj = sb.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "StringBuilder().apply(builderAction).toString()");
        return obj;
    }
}
