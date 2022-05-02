package o;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lid/dana/data/config/source/amcs/result/GnBindingBenefitsResult;", "", "gnBenefitEntitySendmoney", "Lid/dana/data/config/model/BindingBenefitEntity;", "gnBenefitEntityBillpayment", "gnBenefitEntityCashoutBalance", "gnBenefitEntityDanaProtection", "(Lid/dana/data/config/model/BindingBenefitEntity;Lid/dana/data/config/model/BindingBenefitEntity;Lid/dana/data/config/model/BindingBenefitEntity;Lid/dana/data/config/model/BindingBenefitEntity;)V", "getGnBenefitEntityBillpayment", "()Lid/dana/data/config/model/BindingBenefitEntity;", "getGnBenefitEntityCashoutBalance", "getGnBenefitEntityDanaProtection", "getGnBenefitEntitySendmoney", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$502 {
    @SerializedName("gn_benefit_billpayment")
    @NotNull
    private final JsonReader$Token gnBenefitEntityBillpayment;
    @SerializedName("gn_benefit_cashoutbalance")
    @NotNull
    private final JsonReader$Token gnBenefitEntityCashoutBalance;
    @SerializedName("gn_benefit_danaprotection")
    @NotNull
    private final JsonReader$Token gnBenefitEntityDanaProtection;
    @SerializedName("gn_benefit_sendmoney")
    @NotNull
    private final JsonReader$Token gnBenefitEntitySendmoney;

    public static /* synthetic */ access$502 copy$default(access$502 access_502, JsonReader$Token jsonReader$Token, JsonReader$Token jsonReader$Token2, JsonReader$Token jsonReader$Token3, JsonReader$Token jsonReader$Token4, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonReader$Token = access_502.gnBenefitEntitySendmoney;
        }
        if ((i & 2) != 0) {
            jsonReader$Token2 = access_502.gnBenefitEntityBillpayment;
        }
        if ((i & 4) != 0) {
            jsonReader$Token3 = access_502.gnBenefitEntityCashoutBalance;
        }
        if ((i & 8) != 0) {
            jsonReader$Token4 = access_502.gnBenefitEntityDanaProtection;
        }
        return access_502.copy(jsonReader$Token, jsonReader$Token2, jsonReader$Token3, jsonReader$Token4);
    }

    @NotNull
    public final JsonReader$Token component1() {
        return this.gnBenefitEntitySendmoney;
    }

    @NotNull
    public final JsonReader$Token component2() {
        return this.gnBenefitEntityBillpayment;
    }

    @NotNull
    public final JsonReader$Token component3() {
        return this.gnBenefitEntityCashoutBalance;
    }

    @NotNull
    public final JsonReader$Token component4() {
        return this.gnBenefitEntityDanaProtection;
    }

    @NotNull
    public final access$502 copy(@NotNull JsonReader$Token jsonReader$Token, @NotNull JsonReader$Token jsonReader$Token2, @NotNull JsonReader$Token jsonReader$Token3, @NotNull JsonReader$Token jsonReader$Token4) {
        Intrinsics.checkNotNullParameter(jsonReader$Token, "gnBenefitEntitySendmoney");
        Intrinsics.checkNotNullParameter(jsonReader$Token2, "gnBenefitEntityBillpayment");
        Intrinsics.checkNotNullParameter(jsonReader$Token3, "gnBenefitEntityCashoutBalance");
        Intrinsics.checkNotNullParameter(jsonReader$Token4, "gnBenefitEntityDanaProtection");
        return new access$502(jsonReader$Token, jsonReader$Token2, jsonReader$Token3, jsonReader$Token4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$502)) {
            return false;
        }
        access$502 access_502 = (access$502) obj;
        return Intrinsics.areEqual((Object) this.gnBenefitEntitySendmoney, (Object) access_502.gnBenefitEntitySendmoney) && Intrinsics.areEqual((Object) this.gnBenefitEntityBillpayment, (Object) access_502.gnBenefitEntityBillpayment) && Intrinsics.areEqual((Object) this.gnBenefitEntityCashoutBalance, (Object) access_502.gnBenefitEntityCashoutBalance) && Intrinsics.areEqual((Object) this.gnBenefitEntityDanaProtection, (Object) access_502.gnBenefitEntityDanaProtection);
    }

    public final int hashCode() {
        JsonReader$Token jsonReader$Token = this.gnBenefitEntitySendmoney;
        int i = 0;
        int hashCode = (jsonReader$Token != null ? jsonReader$Token.hashCode() : 0) * 31;
        JsonReader$Token jsonReader$Token2 = this.gnBenefitEntityBillpayment;
        int hashCode2 = (hashCode + (jsonReader$Token2 != null ? jsonReader$Token2.hashCode() : 0)) * 31;
        JsonReader$Token jsonReader$Token3 = this.gnBenefitEntityCashoutBalance;
        int hashCode3 = (hashCode2 + (jsonReader$Token3 != null ? jsonReader$Token3.hashCode() : 0)) * 31;
        JsonReader$Token jsonReader$Token4 = this.gnBenefitEntityDanaProtection;
        if (jsonReader$Token4 != null) {
            i = jsonReader$Token4.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GnBindingBenefitsResult(gnBenefitEntitySendmoney=");
        sb.append(this.gnBenefitEntitySendmoney);
        sb.append(", gnBenefitEntityBillpayment=");
        sb.append(this.gnBenefitEntityBillpayment);
        sb.append(", gnBenefitEntityCashoutBalance=");
        sb.append(this.gnBenefitEntityCashoutBalance);
        sb.append(", gnBenefitEntityDanaProtection=");
        sb.append(this.gnBenefitEntityDanaProtection);
        sb.append(")");
        return sb.toString();
    }

    public access$502(@NotNull JsonReader$Token jsonReader$Token, @NotNull JsonReader$Token jsonReader$Token2, @NotNull JsonReader$Token jsonReader$Token3, @NotNull JsonReader$Token jsonReader$Token4) {
        Intrinsics.checkNotNullParameter(jsonReader$Token, "gnBenefitEntitySendmoney");
        Intrinsics.checkNotNullParameter(jsonReader$Token2, "gnBenefitEntityBillpayment");
        Intrinsics.checkNotNullParameter(jsonReader$Token3, "gnBenefitEntityCashoutBalance");
        Intrinsics.checkNotNullParameter(jsonReader$Token4, "gnBenefitEntityDanaProtection");
        this.gnBenefitEntitySendmoney = jsonReader$Token;
        this.gnBenefitEntityBillpayment = jsonReader$Token2;
        this.gnBenefitEntityCashoutBalance = jsonReader$Token3;
        this.gnBenefitEntityDanaProtection = jsonReader$Token4;
    }

    @NotNull
    public final JsonReader$Token getGnBenefitEntitySendmoney() {
        return this.gnBenefitEntitySendmoney;
    }

    @NotNull
    public final JsonReader$Token getGnBenefitEntityBillpayment() {
        return this.gnBenefitEntityBillpayment;
    }

    @NotNull
    public final JsonReader$Token getGnBenefitEntityCashoutBalance() {
        return this.gnBenefitEntityCashoutBalance;
    }

    @NotNull
    public final JsonReader$Token getGnBenefitEntityDanaProtection() {
        return this.gnBenefitEntityDanaProtection;
    }
}
