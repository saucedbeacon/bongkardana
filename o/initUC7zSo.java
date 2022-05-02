package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010 \u001a\u00020\u0003J\u0006\u0010!\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\u0006\u0010%\u001a\u00020\u001eJ\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Lid/dana/domain/globalnetwork/model/Forex;", "", "amount", "", "currency", "rate", "", "time", "", "(Ljava/lang/String;Ljava/lang/String;DJ)V", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "getCurrency", "setCurrency", "getRate", "()D", "setRate", "(D)V", "getTime", "()J", "setTime", "(J)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getCurrencySymbol", "getForexAmount", "getRoundedRate", "hashCode", "", "shouldRefreshForex", "toString", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class initUC7zSo {
    @NotNull
    public static final String CURRENCY_PATTERN = "###,###,###";
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String DEFAULT_AMOUNT = "0";
    @NotNull
    public static final String DEFAULT_CURRENCY = "Rp";
    public static final double DEFAULT_RATE = 1.0d;
    public static final long HOURS_TO_REFRESH = 24;
    @NotNull
    private String amount;
    @NotNull
    private String currency;
    private double rate;
    private long time;

    public initUC7zSo() {
        this((String) null, (String) null, 0.0d, 0, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ initUC7zSo copy$default(initUC7zSo inituc7zso, String str, String str2, double d, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inituc7zso.amount;
        }
        if ((i & 2) != 0) {
            str2 = inituc7zso.currency;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            d = inituc7zso.rate;
        }
        double d2 = d;
        if ((i & 8) != 0) {
            j = inituc7zso.time;
        }
        return inituc7zso.copy(str, str3, d2, j);
    }

    @NotNull
    public final String component1() {
        return this.amount;
    }

    @NotNull
    public final String component2() {
        return this.currency;
    }

    public final double component3() {
        return this.rate;
    }

    public final long component4() {
        return this.time;
    }

    @NotNull
    public final initUC7zSo copy(@NotNull String str, @NotNull String str2, double d, long j) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CURRENCY);
        return new initUC7zSo(str, str2, d, j);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof initUC7zSo)) {
            return false;
        }
        initUC7zSo inituc7zso = (initUC7zSo) obj;
        return Intrinsics.areEqual((Object) this.amount, (Object) inituc7zso.amount) && Intrinsics.areEqual((Object) this.currency, (Object) inituc7zso.currency) && Double.compare(this.rate, inituc7zso.rate) == 0 && this.time == inituc7zso.time;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Forex(amount=");
        sb.append(this.amount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", rate=");
        sb.append(this.rate);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(")");
        return sb.toString();
    }

    public initUC7zSo(@NotNull String str, @NotNull String str2, double d, long j) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CURRENCY);
        this.amount = str;
        this.currency = str2;
        this.rate = d;
        this.time = j;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.amount = str;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final void setCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currency = str;
    }

    public final double getRate() {
        return this.rate;
    }

    public final void setRate(double d) {
        this.rate = d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ initUC7zSo(java.lang.String r5, java.lang.String r6, double r7, long r9, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.lang.String r5 = "0"
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            java.lang.String r6 = "Rp"
        L_0x000c:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0013:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0025
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            java.lang.String r7 = "Calendar.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            long r9 = r6.getTimeInMillis()
        L_0x0025:
            r2 = r9
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r11 = r2
            r6.<init>(r7, r8, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initUC7zSo.<init>(java.lang.String, java.lang.String, double, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final long getTime() {
        return this.time;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final boolean shouldRefreshForex() {
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
        return TimeUnit.MILLISECONDS.toHours(instance.getTimeInMillis() - this.time) >= 24;
    }

    @NotNull
    public final String getRoundedRate() {
        String plainString = new BigDecimal(this.rate).setScale(0, RoundingMode.HALF_EVEN).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "BigDecimal(rate)\n       …\n        .toPlainString()");
        return plainString;
    }

    @NotNull
    public final String getForexAmount() {
        if ((this.amount.length() == 0) || this.rate == 0.0d) {
            return "0";
        }
        String format = new DecimalFormat(CURRENCY_PATTERN).format(Double.parseDouble(this.amount) / this.rate);
        Intrinsics.checkNotNullExpressionValue(format, "DecimalFormat(CURRENCY_P…amount.toDouble() / rate)");
        return StringsKt.replace$default(format, ',', '.', false, 4, (Object) null);
    }

    @NotNull
    public final String getCurrencySymbol() {
        String symbol = Currency.getInstance(this.currency).getSymbol(Locale.ENGLISH);
        Intrinsics.checkNotNullExpressionValue(symbol, "Currency.getInstance(cur…getSymbol(Locale.ENGLISH)");
        return symbol;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/globalnetwork/model/Forex$Companion;", "", "()V", "CURRENCY_PATTERN", "", "DEFAULT_AMOUNT", "DEFAULT_CURRENCY", "DEFAULT_RATE", "", "HOURS_TO_REFRESH", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int hashCode() {
        String str = this.amount;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.currency;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + i) * 31) + Double.valueOf(this.rate).hashCode()) * 31) + Long.valueOf(this.time).hashCode();
    }
}
