package o;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lid/dana/data/merchant/repository/source/network/request/CreateProductOrderExtendInfo;", "", "adminFee", "Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;", "customerName", "", "fare", "inquiryId", "totalEnergy", "(Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdminFee", "()Lid/dana/data/merchant/repository/source/network/response/MultiCurrencyMoney;", "getCustomerName", "()Ljava/lang/String;", "getFare", "getInquiryId", "getTotalEnergy", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class IDebugConsoleController {
    @SerializedName("adminFee")
    @NotNull
    private final toggleConsole adminFee;
    @SerializedName("customerName")
    @NotNull
    private final String customerName;
    @SerializedName("fare")
    @NotNull
    private final String fare;
    @SerializedName("inquiryId")
    @NotNull
    private final String inquiryId;
    @SerializedName("totalEnergy")
    @NotNull
    private final String totalEnergy;

    public static /* synthetic */ IDebugConsoleController copy$default(IDebugConsoleController iDebugConsoleController, toggleConsole toggleconsole, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            toggleconsole = iDebugConsoleController.adminFee;
        }
        if ((i & 2) != 0) {
            str = iDebugConsoleController.customerName;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = iDebugConsoleController.fare;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = iDebugConsoleController.inquiryId;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = iDebugConsoleController.totalEnergy;
        }
        return iDebugConsoleController.copy(toggleconsole, str5, str6, str7, str4);
    }

    @NotNull
    public final toggleConsole component1() {
        return this.adminFee;
    }

    @NotNull
    public final String component2() {
        return this.customerName;
    }

    @NotNull
    public final String component3() {
        return this.fare;
    }

    @NotNull
    public final String component4() {
        return this.inquiryId;
    }

    @NotNull
    public final String component5() {
        return this.totalEnergy;
    }

    @NotNull
    public final IDebugConsoleController copy(@NotNull toggleConsole toggleconsole, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(toggleconsole, "adminFee");
        Intrinsics.checkNotNullParameter(str, "customerName");
        Intrinsics.checkNotNullParameter(str2, "fare");
        Intrinsics.checkNotNullParameter(str3, "inquiryId");
        Intrinsics.checkNotNullParameter(str4, "totalEnergy");
        return new IDebugConsoleController(toggleconsole, str, str2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IDebugConsoleController)) {
            return false;
        }
        IDebugConsoleController iDebugConsoleController = (IDebugConsoleController) obj;
        return Intrinsics.areEqual((Object) this.adminFee, (Object) iDebugConsoleController.adminFee) && Intrinsics.areEqual((Object) this.customerName, (Object) iDebugConsoleController.customerName) && Intrinsics.areEqual((Object) this.fare, (Object) iDebugConsoleController.fare) && Intrinsics.areEqual((Object) this.inquiryId, (Object) iDebugConsoleController.inquiryId) && Intrinsics.areEqual((Object) this.totalEnergy, (Object) iDebugConsoleController.totalEnergy);
    }

    public final int hashCode() {
        toggleConsole toggleconsole = this.adminFee;
        int i = 0;
        int hashCode = (toggleconsole != null ? toggleconsole.hashCode() : 0) * 31;
        String str = this.customerName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.fare;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.inquiryId;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.totalEnergy;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateProductOrderExtendInfo(adminFee=");
        sb.append(this.adminFee);
        sb.append(", customerName=");
        sb.append(this.customerName);
        sb.append(", fare=");
        sb.append(this.fare);
        sb.append(", inquiryId=");
        sb.append(this.inquiryId);
        sb.append(", totalEnergy=");
        sb.append(this.totalEnergy);
        sb.append(")");
        return sb.toString();
    }

    public IDebugConsoleController(@NotNull toggleConsole toggleconsole, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(toggleconsole, "adminFee");
        Intrinsics.checkNotNullParameter(str, "customerName");
        Intrinsics.checkNotNullParameter(str2, "fare");
        Intrinsics.checkNotNullParameter(str3, "inquiryId");
        Intrinsics.checkNotNullParameter(str4, "totalEnergy");
        this.adminFee = toggleconsole;
        this.customerName = str;
        this.fare = str2;
        this.inquiryId = str3;
        this.totalEnergy = str4;
    }

    @NotNull
    public final toggleConsole getAdminFee() {
        return this.adminFee;
    }

    @NotNull
    public final String getCustomerName() {
        return this.customerName;
    }

    @NotNull
    public final String getFare() {
        return this.fare;
    }

    @NotNull
    public final String getInquiryId() {
        return this.inquiryId;
    }

    @NotNull
    public final String getTotalEnergy() {
        return this.totalEnergy;
    }
}
