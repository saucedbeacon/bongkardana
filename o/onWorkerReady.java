package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/data/nearbyme/model/MoneyViewEntity;", "", "amount", "", "currency", "currencyCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "getCurrencyCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onWorkerReady {
    @Nullable
    private final String amount;
    @Nullable
    private final String currency;
    @Nullable
    private final String currencyCode;

    public onWorkerReady() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ onWorkerReady copy$default(onWorkerReady onworkerready, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onworkerready.amount;
        }
        if ((i & 2) != 0) {
            str2 = onworkerready.currency;
        }
        if ((i & 4) != 0) {
            str3 = onworkerready.currencyCode;
        }
        return onworkerready.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.amount;
    }

    @Nullable
    public final String component2() {
        return this.currency;
    }

    @Nullable
    public final String component3() {
        return this.currencyCode;
    }

    @NotNull
    public final onWorkerReady copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new onWorkerReady(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onWorkerReady)) {
            return false;
        }
        onWorkerReady onworkerready = (onWorkerReady) obj;
        return Intrinsics.areEqual((Object) this.amount, (Object) onworkerready.amount) && Intrinsics.areEqual((Object) this.currency, (Object) onworkerready.currency) && Intrinsics.areEqual((Object) this.currencyCode, (Object) onworkerready.currencyCode);
    }

    public final int hashCode() {
        String str = this.amount;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.currency;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.currencyCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyViewEntity(amount=");
        sb.append(this.amount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", currencyCode=");
        sb.append(this.currencyCode);
        sb.append(")");
        return sb.toString();
    }

    public onWorkerReady(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.amount = str;
        this.currency = str2;
        this.currencyCode = str3;
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onWorkerReady(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }
}
