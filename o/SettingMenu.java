package o;

import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0010HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u00062"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantVoucherInfoModel;", "", "voucherName", "", "voucherIcon", "voucherBackground", "voucherShortDescription", "voucherValue", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "voucherPrice", "displayVoucherValue", "displayVoucherPrice", "tnc", "howTo", "discountOffRate", "isShimmer", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDiscountOffRate", "()Ljava/lang/String;", "getDisplayVoucherPrice", "()Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "getDisplayVoucherValue", "getHowTo", "()Z", "getTnc", "getVoucherBackground", "getVoucherIcon", "getVoucherName", "getVoucherPrice", "getVoucherShortDescription", "getVoucherValue", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SettingMenu {
    @NotNull
    private final MoneyViewModel IsOverlapping;
    @NotNull
    private final String equals;
    @NotNull
    public final String getMax;
    @NotNull
    public final String getMin;
    @NotNull
    public final String isInside;
    @NotNull
    public final String length;
    @NotNull
    public final MoneyViewModel setMax;
    @NotNull
    public final String setMin;
    private final boolean toDoubleRange;
    @NotNull
    public final MoneyViewModel toFloatRange;
    @NotNull
    public final MoneyViewModel toIntRange;
    @NotNull
    private final String values;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingMenu)) {
            return false;
        }
        SettingMenu settingMenu = (SettingMenu) obj;
        return Intrinsics.areEqual((Object) this.getMax, (Object) settingMenu.getMax) && Intrinsics.areEqual((Object) this.length, (Object) settingMenu.length) && Intrinsics.areEqual((Object) this.getMin, (Object) settingMenu.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) settingMenu.setMin) && Intrinsics.areEqual((Object) this.setMax, (Object) settingMenu.setMax) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) settingMenu.IsOverlapping) && Intrinsics.areEqual((Object) this.toIntRange, (Object) settingMenu.toIntRange) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) settingMenu.toFloatRange) && Intrinsics.areEqual((Object) this.equals, (Object) settingMenu.equals) && Intrinsics.areEqual((Object) this.values, (Object) settingMenu.values) && Intrinsics.areEqual((Object) this.isInside, (Object) settingMenu.isInside) && this.toDoubleRange == settingMenu.toDoubleRange;
    }

    public final int hashCode() {
        String str = this.getMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.length;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMin;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.setMin;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        MoneyViewModel moneyViewModel = this.setMax;
        int hashCode5 = (hashCode4 + (moneyViewModel != null ? moneyViewModel.hashCode() : 0)) * 31;
        MoneyViewModel moneyViewModel2 = this.IsOverlapping;
        int hashCode6 = (hashCode5 + (moneyViewModel2 != null ? moneyViewModel2.hashCode() : 0)) * 31;
        MoneyViewModel moneyViewModel3 = this.toIntRange;
        int hashCode7 = (hashCode6 + (moneyViewModel3 != null ? moneyViewModel3.hashCode() : 0)) * 31;
        MoneyViewModel moneyViewModel4 = this.toFloatRange;
        int hashCode8 = (hashCode7 + (moneyViewModel4 != null ? moneyViewModel4.hashCode() : 0)) * 31;
        String str5 = this.equals;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.values;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.isInside;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int i2 = (hashCode10 + i) * 31;
        boolean z = this.toDoubleRange;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantVoucherInfoModel(voucherName=");
        sb.append(this.getMax);
        sb.append(", voucherIcon=");
        sb.append(this.length);
        sb.append(", voucherBackground=");
        sb.append(this.getMin);
        sb.append(", voucherShortDescription=");
        sb.append(this.setMin);
        sb.append(", voucherValue=");
        sb.append(this.setMax);
        sb.append(", voucherPrice=");
        sb.append(this.IsOverlapping);
        sb.append(", displayVoucherValue=");
        sb.append(this.toIntRange);
        sb.append(", displayVoucherPrice=");
        sb.append(this.toFloatRange);
        sb.append(", tnc=");
        sb.append(this.equals);
        sb.append(", howTo=");
        sb.append(this.values);
        sb.append(", discountOffRate=");
        sb.append(this.isInside);
        sb.append(", isShimmer=");
        sb.append(this.toDoubleRange);
        sb.append(")");
        return sb.toString();
    }

    public SettingMenu(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull MoneyViewModel moneyViewModel, @NotNull MoneyViewModel moneyViewModel2, @NotNull MoneyViewModel moneyViewModel3, @NotNull MoneyViewModel moneyViewModel4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "voucherName");
        Intrinsics.checkNotNullParameter(str2, "voucherIcon");
        Intrinsics.checkNotNullParameter(str3, "voucherBackground");
        Intrinsics.checkNotNullParameter(str4, "voucherShortDescription");
        Intrinsics.checkNotNullParameter(moneyViewModel, "voucherValue");
        Intrinsics.checkNotNullParameter(moneyViewModel2, "voucherPrice");
        Intrinsics.checkNotNullParameter(moneyViewModel3, "displayVoucherValue");
        Intrinsics.checkNotNullParameter(moneyViewModel4, "displayVoucherPrice");
        Intrinsics.checkNotNullParameter(str5, "tnc");
        Intrinsics.checkNotNullParameter(str6, "howTo");
        Intrinsics.checkNotNullParameter(str7, "discountOffRate");
        this.getMax = str;
        this.length = str2;
        this.getMin = str3;
        this.setMin = str4;
        this.setMax = moneyViewModel;
        this.IsOverlapping = moneyViewModel2;
        this.toIntRange = moneyViewModel3;
        this.toFloatRange = moneyViewModel4;
        this.equals = str5;
        this.values = str6;
        this.isInside = str7;
        this.toDoubleRange = z;
    }

    public final boolean setMin() {
        return this.toDoubleRange;
    }
}
