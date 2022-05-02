package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003JV\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006*"}, d2 = {"Lid/dana/domain/investment/model/MultiCurrencyMoneyView;", "", "amount", "", "cent", "centFactor", "currency", "", "currencyCode", "currencyValue", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCent", "setCent", "getCentFactor", "setCentFactor", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getCurrencyCode", "setCurrencyCode", "getCurrencyValue", "setCurrencyValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lid/dana/domain/investment/model/MultiCurrencyMoneyView;", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isForeground {
    @Nullable
    private Long amount;
    @Nullable
    private Long cent;
    @Nullable
    private Long centFactor;
    @Nullable
    private String currency;
    @Nullable
    private String currencyCode;
    @Nullable
    private String currencyValue;

    public isForeground() {
        this((Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ isForeground copy$default(isForeground isforeground, Long l, Long l2, Long l3, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = isforeground.amount;
        }
        if ((i & 2) != 0) {
            l2 = isforeground.cent;
        }
        Long l4 = l2;
        if ((i & 4) != 0) {
            l3 = isforeground.centFactor;
        }
        Long l5 = l3;
        if ((i & 8) != 0) {
            str = isforeground.currency;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            str2 = isforeground.currencyCode;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = isforeground.currencyValue;
        }
        return isforeground.copy(l, l4, l5, str4, str5, str3);
    }

    @Nullable
    public final Long component1() {
        return this.amount;
    }

    @Nullable
    public final Long component2() {
        return this.cent;
    }

    @Nullable
    public final Long component3() {
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

    @NotNull
    public final isForeground copy(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new isForeground(l, l2, l3, str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isForeground)) {
            return false;
        }
        isForeground isforeground = (isForeground) obj;
        return Intrinsics.areEqual((Object) this.amount, (Object) isforeground.amount) && Intrinsics.areEqual((Object) this.cent, (Object) isforeground.cent) && Intrinsics.areEqual((Object) this.centFactor, (Object) isforeground.centFactor) && Intrinsics.areEqual((Object) this.currency, (Object) isforeground.currency) && Intrinsics.areEqual((Object) this.currencyCode, (Object) isforeground.currencyCode) && Intrinsics.areEqual((Object) this.currencyValue, (Object) isforeground.currencyValue);
    }

    public final int hashCode() {
        Long l = this.amount;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.cent;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.centFactor;
        int hashCode3 = (hashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31;
        String str = this.currency;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.currencyCode;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.currencyValue;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiCurrencyMoneyView(amount=");
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
        sb.append(")");
        return sb.toString();
    }

    public isForeground(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.amount = l;
        this.cent = l2;
        this.centFactor = l3;
        this.currency = str;
        this.currencyCode = str2;
        this.currencyValue = str3;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    public final void setAmount(@Nullable Long l) {
        this.amount = l;
    }

    @Nullable
    public final Long getCent() {
        return this.cent;
    }

    public final void setCent(@Nullable Long l) {
        this.cent = l;
    }

    @Nullable
    public final Long getCentFactor() {
        return this.centFactor;
    }

    public final void setCentFactor(@Nullable Long l) {
        this.centFactor = l;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final void setCurrencyCode(@Nullable String str) {
        this.currencyCode = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ isForeground(java.lang.Long r5, java.lang.Long r6, java.lang.Long r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0007
            r12 = r0
            goto L_0x0008
        L_0x0007:
            r12 = r5
        L_0x0008:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = r7
        L_0x0015:
            r5 = r11 & 8
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x001d
            r2 = r6
            goto L_0x001e
        L_0x001d:
            r2 = r8
        L_0x001e:
            r5 = r11 & 16
            if (r5 == 0) goto L_0x0024
            r3 = r6
            goto L_0x0025
        L_0x0024:
            r3 = r9
        L_0x0025:
            r5 = r11 & 32
            if (r5 == 0) goto L_0x002b
            r11 = r6
            goto L_0x002c
        L_0x002b:
            r11 = r10
        L_0x002c:
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r0
            r9 = r2
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isForeground.<init>(java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getCurrencyValue() {
        return this.currencyValue;
    }

    public final void setCurrencyValue(@Nullable String str) {
        this.currencyValue = str;
    }
}
