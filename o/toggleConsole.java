package o;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010¨\u0006-"}, d2 = {"Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;", "Ljava/io/Serializable;", "amount", "", "cent", "", "centFactor", "", "currency", "currencyCode", "currencyValue", "currencyMoney", "Ljava/util/Currency;", "value", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Currency;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCent", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCentFactor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency", "getCurrencyCode", "getCurrencyMoney", "()Ljava/util/Currency;", "getCurrencyValue", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Currency;Ljava/lang/String;)Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class toggleConsole implements Serializable {
    @SerializedName("amount")
    @Nullable
    private final String amount;
    @SerializedName("cent")
    @Nullable
    private final Long cent;
    @SerializedName("centFactor")
    @Nullable
    private final Integer centFactor;
    @SerializedName("currency")
    @Nullable
    private final String currency;
    @SerializedName("currencyCode")
    @Nullable
    private final String currencyCode;
    @SerializedName("currencyMoney")
    @Nullable
    private final Currency currencyMoney;
    @SerializedName("currencyValue")
    @Nullable
    private final String currencyValue;
    @SerializedName("value")
    @Nullable
    private final String value;

    public toggleConsole() {
        this((String) null, (Long) null, (Integer) null, (String) null, (String) null, (String) null, (Currency) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ toggleConsole copy$default(toggleConsole toggleconsole, String str, Long l, Integer num, String str2, String str3, String str4, Currency currency2, String str5, int i, Object obj) {
        toggleConsole toggleconsole2 = toggleconsole;
        int i2 = i;
        return toggleconsole.copy((i2 & 1) != 0 ? toggleconsole2.amount : str, (i2 & 2) != 0 ? toggleconsole2.cent : l, (i2 & 4) != 0 ? toggleconsole2.centFactor : num, (i2 & 8) != 0 ? toggleconsole2.currency : str2, (i2 & 16) != 0 ? toggleconsole2.currencyCode : str3, (i2 & 32) != 0 ? toggleconsole2.currencyValue : str4, (i2 & 64) != 0 ? toggleconsole2.currencyMoney : currency2, (i2 & 128) != 0 ? toggleconsole2.value : str5);
    }

    @Nullable
    public final String component1() {
        return this.amount;
    }

    @Nullable
    public final Long component2() {
        return this.cent;
    }

    @Nullable
    public final Integer component3() {
        return this.centFactor;
    }

    @Nullable
    public final String component4() {
        return this.currency;
    }

    @Nullable
    public final String component5() {
        return this.currencyCode;
    }

    @Nullable
    public final String component6() {
        return this.currencyValue;
    }

    @Nullable
    public final Currency component7() {
        return this.currencyMoney;
    }

    @Nullable
    public final String component8() {
        return this.value;
    }

    @NotNull
    public final toggleConsole copy(@Nullable String str, @Nullable Long l, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Currency currency2, @Nullable String str5) {
        return new toggleConsole(str, l, num, str2, str3, str4, currency2, str5);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toggleConsole)) {
            return false;
        }
        toggleConsole toggleconsole = (toggleConsole) obj;
        return Intrinsics.areEqual((Object) this.amount, (Object) toggleconsole.amount) && Intrinsics.areEqual((Object) this.cent, (Object) toggleconsole.cent) && Intrinsics.areEqual((Object) this.centFactor, (Object) toggleconsole.centFactor) && Intrinsics.areEqual((Object) this.currency, (Object) toggleconsole.currency) && Intrinsics.areEqual((Object) this.currencyCode, (Object) toggleconsole.currencyCode) && Intrinsics.areEqual((Object) this.currencyValue, (Object) toggleconsole.currencyValue) && Intrinsics.areEqual((Object) this.currencyMoney, (Object) toggleconsole.currencyMoney) && Intrinsics.areEqual((Object) this.value, (Object) toggleconsole.value);
    }

    public final int hashCode() {
        String str = this.amount;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.cent;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Integer num = this.centFactor;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.currency;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.currencyCode;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.currencyValue;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Currency currency2 = this.currencyMoney;
        int hashCode7 = (hashCode6 + (currency2 != null ? currency2.hashCode() : 0)) * 31;
        String str5 = this.value;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiCurrencyMoney(amount=");
        sb.append(this.amount);
        sb.append(", cent=");
        sb.append(this.cent);
        sb.append(", centFactor=");
        sb.append(this.centFactor);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", currencyCode=");
        sb.append(this.currencyCode);
        sb.append(", currencyValue=");
        sb.append(this.currencyValue);
        sb.append(", currencyMoney=");
        sb.append(this.currencyMoney);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(")");
        return sb.toString();
    }

    public toggleConsole(@Nullable String str, @Nullable Long l, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Currency currency2, @Nullable String str5) {
        this.amount = str;
        this.cent = l;
        this.centFactor = num;
        this.currency = str2;
        this.currencyCode = str3;
        this.currencyValue = str4;
        this.currencyMoney = currency2;
        this.value = str5;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final Long getCent() {
        return this.cent;
    }

    @Nullable
    public final Integer getCentFactor() {
        return this.centFactor;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public final String getCurrencyValue() {
        return this.currencyValue;
    }

    @Nullable
    public final Currency getCurrencyMoney() {
        return this.currencyMoney;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ toggleConsole(java.lang.String r10, java.lang.Long r11, java.lang.Integer r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.Currency r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            java.lang.String r5 = ""
            goto L_0x0020
        L_0x001f:
            r5 = r13
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0027
        L_0x0026:
            r6 = r14
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002e
        L_0x002d:
            r7 = r15
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r16
        L_0x0036:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r2 = r17
        L_0x003d:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.toggleConsole.<init>(java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Currency, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }
}
