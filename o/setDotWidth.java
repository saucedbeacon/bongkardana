package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jw\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006-"}, d2 = {"Lid/dana/data/kycrenewal/repository/source/network/result/KYCRenewalUserInfoResult;", "", "fullName", "", "gender", "certId", "dateOfBirth", "occupation", "address", "addressRT", "addressRW", "city", "district", "province", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getAddressRT", "getAddressRW", "getCertId", "getCity", "getDateOfBirth", "getDistrict", "getFullName", "getGender", "getOccupation", "getProvince", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setDotWidth {
    @NotNull
    public final String IsOverlapping;
    @NotNull
    public final String equals;
    @NotNull
    public final String getMax;
    @NotNull
    public final String getMin;
    @NotNull
    public final String isInside;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    @NotNull
    public final String setMin;
    @NotNull
    public final String toFloatRange;
    @NotNull
    public final String toIntRange;
    @NotNull
    public final String values;

    public setDotWidth() {
        this((byte) 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDotWidth)) {
            return false;
        }
        setDotWidth setdotwidth = (setDotWidth) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) setdotwidth.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) setdotwidth.getMax) && Intrinsics.areEqual((Object) this.setMax, (Object) setdotwidth.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) setdotwidth.getMin) && Intrinsics.areEqual((Object) this.length, (Object) setdotwidth.length) && Intrinsics.areEqual((Object) this.isInside, (Object) setdotwidth.isInside) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) setdotwidth.IsOverlapping) && Intrinsics.areEqual((Object) this.equals, (Object) setdotwidth.equals) && Intrinsics.areEqual((Object) this.toIntRange, (Object) setdotwidth.toIntRange) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) setdotwidth.toFloatRange) && Intrinsics.areEqual((Object) this.values, (Object) setdotwidth.values);
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMax;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMax;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.getMin;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.length;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.isInside;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.IsOverlapping;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.equals;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.toIntRange;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.toFloatRange;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.values;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode10 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("KYCRenewalUserInfoResult(fullName=");
        sb.append(this.setMin);
        sb.append(", gender=");
        sb.append(this.getMax);
        sb.append(", certId=");
        sb.append(this.setMax);
        sb.append(", dateOfBirth=");
        sb.append(this.getMin);
        sb.append(", occupation=");
        sb.append(this.length);
        sb.append(", address=");
        sb.append(this.isInside);
        sb.append(", addressRT=");
        sb.append(this.IsOverlapping);
        sb.append(", addressRW=");
        sb.append(this.equals);
        sb.append(", city=");
        sb.append(this.toIntRange);
        sb.append(", district=");
        sb.append(this.toFloatRange);
        sb.append(", province=");
        sb.append(this.values);
        sb.append(")");
        return sb.toString();
    }

    private setDotWidth(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "fullName");
        Intrinsics.checkNotNullParameter(str2, "gender");
        Intrinsics.checkNotNullParameter(str3, "certId");
        Intrinsics.checkNotNullParameter(str4, "dateOfBirth");
        Intrinsics.checkNotNullParameter(str5, "occupation");
        Intrinsics.checkNotNullParameter(str6, "address");
        Intrinsics.checkNotNullParameter(str7, "addressRT");
        Intrinsics.checkNotNullParameter(str8, "addressRW");
        Intrinsics.checkNotNullParameter(str9, desc.USER_CITY);
        Intrinsics.checkNotNullParameter(str10, "district");
        Intrinsics.checkNotNullParameter(str11, "province");
        this.setMin = str;
        this.getMax = str2;
        this.setMax = str3;
        this.getMin = str4;
        this.length = str5;
        this.isInside = str6;
        this.IsOverlapping = str7;
        this.equals = str8;
        this.toIntRange = str9;
        this.toFloatRange = str10;
        this.values = str11;
    }

    public /* synthetic */ setDotWidth(byte b) {
        this("", "", "", "", "", "", "", "", "", "", "");
    }
}
