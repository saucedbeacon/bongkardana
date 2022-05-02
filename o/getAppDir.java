package o;

import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lid/dana/domain/nearbyme/model/MoneyView;", "Ljava/io/Serializable;", "amount", "", "currency", "currencyCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "getCurrencyCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getAppDir implements Serializable {
    @SerializedName("amount")
    @NotNull
    private final String amount;
    @SerializedName("currency")
    @NotNull
    private final String currency;
    @SerializedName("currencyCode")
    @NotNull
    private final String currencyCode;

    public getAppDir() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getAppDir copy$default(getAppDir getappdir, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getappdir.amount;
        }
        if ((i & 2) != 0) {
            str2 = getappdir.currency;
        }
        if ((i & 4) != 0) {
            str3 = getappdir.currencyCode;
        }
        return getappdir.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.amount;
    }

    @NotNull
    public final String component2() {
        return this.currency;
    }

    @NotNull
    public final String component3() {
        return this.currencyCode;
    }

    @NotNull
    public final getAppDir copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CURRENCY);
        Intrinsics.checkNotNullParameter(str3, AppsFlyerProperties.CURRENCY_CODE);
        return new getAppDir(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAppDir)) {
            return false;
        }
        getAppDir getappdir = (getAppDir) obj;
        return Intrinsics.areEqual((Object) this.amount, (Object) getappdir.amount) && Intrinsics.areEqual((Object) this.currency, (Object) getappdir.currency) && Intrinsics.areEqual((Object) this.currencyCode, (Object) getappdir.currencyCode);
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
        StringBuilder sb = new StringBuilder("MoneyView(amount=");
        sb.append(this.amount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", currencyCode=");
        sb.append(this.currencyCode);
        sb.append(")");
        return sb.toString();
    }

    public getAppDir(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CURRENCY);
        Intrinsics.checkNotNullParameter(str3, AppsFlyerProperties.CURRENCY_CODE);
        this.amount = str;
        this.currency = str2;
        this.currencyCode = str3;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getAppDir(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    @NotNull
    public final String getCurrencyCode() {
        return this.currencyCode;
    }
}
