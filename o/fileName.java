package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Jw\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006/"}, d2 = {"Lid/dana/domain/nearbyme/model/VoucherInfo;", "", "voucherName", "", "voucherIcon", "voucherBackground", "voucherShortDescription", "voucherValue", "Lid/dana/domain/nearbyme/model/MoneyView;", "voucherPrice", "displayVoucherValue", "displayVoucherPrice", "tnc", "howTo", "discountOffRate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/nearbyme/model/MoneyView;Lid/dana/domain/nearbyme/model/MoneyView;Lid/dana/domain/nearbyme/model/MoneyView;Lid/dana/domain/nearbyme/model/MoneyView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDiscountOffRate", "()Ljava/lang/String;", "getDisplayVoucherPrice", "()Lid/dana/domain/nearbyme/model/MoneyView;", "getDisplayVoucherValue", "getHowTo", "getTnc", "getVoucherBackground", "getVoucherIcon", "getVoucherName", "getVoucherPrice", "getVoucherShortDescription", "getVoucherValue", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class fileName {
    @NotNull
    private final String discountOffRate;
    @NotNull
    private final getAppDir displayVoucherPrice;
    @NotNull
    private final getAppDir displayVoucherValue;
    @NotNull
    private final String howTo;
    @NotNull
    private final String tnc;
    @NotNull
    private final String voucherBackground;
    @NotNull
    private final String voucherIcon;
    @NotNull
    private final String voucherName;
    @NotNull
    private final getAppDir voucherPrice;
    @NotNull
    private final String voucherShortDescription;
    @NotNull
    private final getAppDir voucherValue;

    public static /* synthetic */ fileName copy$default(fileName filename, String str, String str2, String str3, String str4, getAppDir getappdir, getAppDir getappdir2, getAppDir getappdir3, getAppDir getappdir4, String str5, String str6, String str7, int i, Object obj) {
        fileName filename2 = filename;
        int i2 = i;
        return filename.copy((i2 & 1) != 0 ? filename2.voucherName : str, (i2 & 2) != 0 ? filename2.voucherIcon : str2, (i2 & 4) != 0 ? filename2.voucherBackground : str3, (i2 & 8) != 0 ? filename2.voucherShortDescription : str4, (i2 & 16) != 0 ? filename2.voucherValue : getappdir, (i2 & 32) != 0 ? filename2.voucherPrice : getappdir2, (i2 & 64) != 0 ? filename2.displayVoucherValue : getappdir3, (i2 & 128) != 0 ? filename2.displayVoucherPrice : getappdir4, (i2 & 256) != 0 ? filename2.tnc : str5, (i2 & 512) != 0 ? filename2.howTo : str6, (i2 & 1024) != 0 ? filename2.discountOffRate : str7);
    }

    @NotNull
    public final String component1() {
        return this.voucherName;
    }

    @NotNull
    public final String component10() {
        return this.howTo;
    }

    @NotNull
    public final String component11() {
        return this.discountOffRate;
    }

    @NotNull
    public final String component2() {
        return this.voucherIcon;
    }

    @NotNull
    public final String component3() {
        return this.voucherBackground;
    }

    @NotNull
    public final String component4() {
        return this.voucherShortDescription;
    }

    @NotNull
    public final getAppDir component5() {
        return this.voucherValue;
    }

    @NotNull
    public final getAppDir component6() {
        return this.voucherPrice;
    }

    @NotNull
    public final getAppDir component7() {
        return this.displayVoucherValue;
    }

    @NotNull
    public final getAppDir component8() {
        return this.displayVoucherPrice;
    }

    @NotNull
    public final String component9() {
        return this.tnc;
    }

    @NotNull
    public final fileName copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull getAppDir getappdir, @NotNull getAppDir getappdir2, @NotNull getAppDir getappdir3, @NotNull getAppDir getappdir4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "voucherName");
        Intrinsics.checkNotNullParameter(str2, "voucherIcon");
        String str8 = str3;
        Intrinsics.checkNotNullParameter(str8, "voucherBackground");
        String str9 = str4;
        Intrinsics.checkNotNullParameter(str9, "voucherShortDescription");
        getAppDir getappdir5 = getappdir;
        Intrinsics.checkNotNullParameter(getappdir5, "voucherValue");
        getAppDir getappdir6 = getappdir2;
        Intrinsics.checkNotNullParameter(getappdir6, "voucherPrice");
        getAppDir getappdir7 = getappdir3;
        Intrinsics.checkNotNullParameter(getappdir7, "displayVoucherValue");
        getAppDir getappdir8 = getappdir4;
        Intrinsics.checkNotNullParameter(getappdir8, "displayVoucherPrice");
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, "tnc");
        String str11 = str6;
        Intrinsics.checkNotNullParameter(str11, "howTo");
        String str12 = str7;
        Intrinsics.checkNotNullParameter(str12, "discountOffRate");
        return new fileName(str, str2, str8, str9, getappdir5, getappdir6, getappdir7, getappdir8, str10, str11, str12);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fileName)) {
            return false;
        }
        fileName filename = (fileName) obj;
        return Intrinsics.areEqual((Object) this.voucherName, (Object) filename.voucherName) && Intrinsics.areEqual((Object) this.voucherIcon, (Object) filename.voucherIcon) && Intrinsics.areEqual((Object) this.voucherBackground, (Object) filename.voucherBackground) && Intrinsics.areEqual((Object) this.voucherShortDescription, (Object) filename.voucherShortDescription) && Intrinsics.areEqual((Object) this.voucherValue, (Object) filename.voucherValue) && Intrinsics.areEqual((Object) this.voucherPrice, (Object) filename.voucherPrice) && Intrinsics.areEqual((Object) this.displayVoucherValue, (Object) filename.displayVoucherValue) && Intrinsics.areEqual((Object) this.displayVoucherPrice, (Object) filename.displayVoucherPrice) && Intrinsics.areEqual((Object) this.tnc, (Object) filename.tnc) && Intrinsics.areEqual((Object) this.howTo, (Object) filename.howTo) && Intrinsics.areEqual((Object) this.discountOffRate, (Object) filename.discountOffRate);
    }

    public final int hashCode() {
        String str = this.voucherName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.voucherIcon;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.voucherBackground;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.voucherShortDescription;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        getAppDir getappdir = this.voucherValue;
        int hashCode5 = (hashCode4 + (getappdir != null ? getappdir.hashCode() : 0)) * 31;
        getAppDir getappdir2 = this.voucherPrice;
        int hashCode6 = (hashCode5 + (getappdir2 != null ? getappdir2.hashCode() : 0)) * 31;
        getAppDir getappdir3 = this.displayVoucherValue;
        int hashCode7 = (hashCode6 + (getappdir3 != null ? getappdir3.hashCode() : 0)) * 31;
        getAppDir getappdir4 = this.displayVoucherPrice;
        int hashCode8 = (hashCode7 + (getappdir4 != null ? getappdir4.hashCode() : 0)) * 31;
        String str5 = this.tnc;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.howTo;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.discountOffRate;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode10 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VoucherInfo(voucherName=");
        sb.append(this.voucherName);
        sb.append(", voucherIcon=");
        sb.append(this.voucherIcon);
        sb.append(", voucherBackground=");
        sb.append(this.voucherBackground);
        sb.append(", voucherShortDescription=");
        sb.append(this.voucherShortDescription);
        sb.append(", voucherValue=");
        sb.append(this.voucherValue);
        sb.append(", voucherPrice=");
        sb.append(this.voucherPrice);
        sb.append(", displayVoucherValue=");
        sb.append(this.displayVoucherValue);
        sb.append(", displayVoucherPrice=");
        sb.append(this.displayVoucherPrice);
        sb.append(", tnc=");
        sb.append(this.tnc);
        sb.append(", howTo=");
        sb.append(this.howTo);
        sb.append(", discountOffRate=");
        sb.append(this.discountOffRate);
        sb.append(")");
        return sb.toString();
    }

    public fileName(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull getAppDir getappdir, @NotNull getAppDir getappdir2, @NotNull getAppDir getappdir3, @NotNull getAppDir getappdir4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "voucherName");
        Intrinsics.checkNotNullParameter(str2, "voucherIcon");
        Intrinsics.checkNotNullParameter(str3, "voucherBackground");
        Intrinsics.checkNotNullParameter(str4, "voucherShortDescription");
        Intrinsics.checkNotNullParameter(getappdir, "voucherValue");
        Intrinsics.checkNotNullParameter(getappdir2, "voucherPrice");
        Intrinsics.checkNotNullParameter(getappdir3, "displayVoucherValue");
        Intrinsics.checkNotNullParameter(getappdir4, "displayVoucherPrice");
        Intrinsics.checkNotNullParameter(str5, "tnc");
        Intrinsics.checkNotNullParameter(str6, "howTo");
        Intrinsics.checkNotNullParameter(str7, "discountOffRate");
        this.voucherName = str;
        this.voucherIcon = str2;
        this.voucherBackground = str3;
        this.voucherShortDescription = str4;
        this.voucherValue = getappdir;
        this.voucherPrice = getappdir2;
        this.displayVoucherValue = getappdir3;
        this.displayVoucherPrice = getappdir4;
        this.tnc = str5;
        this.howTo = str6;
        this.discountOffRate = str7;
    }

    @NotNull
    public final String getVoucherName() {
        return this.voucherName;
    }

    @NotNull
    public final String getVoucherIcon() {
        return this.voucherIcon;
    }

    @NotNull
    public final String getVoucherBackground() {
        return this.voucherBackground;
    }

    @NotNull
    public final String getVoucherShortDescription() {
        return this.voucherShortDescription;
    }

    @NotNull
    public final getAppDir getVoucherValue() {
        return this.voucherValue;
    }

    @NotNull
    public final getAppDir getVoucherPrice() {
        return this.voucherPrice;
    }

    @NotNull
    public final getAppDir getDisplayVoucherValue() {
        return this.displayVoucherValue;
    }

    @NotNull
    public final getAppDir getDisplayVoucherPrice() {
        return this.displayVoucherPrice;
    }

    @NotNull
    public final String getTnc() {
        return this.tnc;
    }

    @NotNull
    public final String getHowTo() {
        return this.howTo;
    }

    @NotNull
    public final String getDiscountOffRate() {
        return this.discountOffRate;
    }
}
