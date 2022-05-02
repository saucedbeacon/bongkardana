package o;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\rHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006-"}, d2 = {"Lid/dana/data/here/model/Address;", "", "label", "", "countryCode", "countryName", "state", "county", "city", "district", "subdistrict", "street", "postalCode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCity", "()Ljava/lang/String;", "getCountryCode", "getCountryName", "getCounty", "getDistrict", "getLabel", "getPostalCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getState", "getStreet", "getSubdistrict", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lid/dana/data/here/model/Address;", "equals", "", "other", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class removeTabBarBadge {
    @SerializedName("city")
    @Nullable
    private final String city;
    @SerializedName("countryCode")
    @Nullable
    private final String countryCode;
    @SerializedName("countryName")
    @Nullable
    private final String countryName;
    @SerializedName("county")
    @Nullable
    private final String county;
    @SerializedName("district")
    @Nullable
    private final String district;
    @SerializedName("label")
    @Nullable
    private final String label;
    @SerializedName("postalCode")
    @Nullable
    private final Integer postalCode;
    @SerializedName("state")
    @Nullable
    private final String state;
    @SerializedName("street")
    @Nullable
    private final String street;
    @SerializedName("subdistrict")
    @Nullable
    private final String subdistrict;

    public static /* synthetic */ removeTabBarBadge copy$default(removeTabBarBadge removetabbarbadge, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, int i, Object obj) {
        removeTabBarBadge removetabbarbadge2 = removetabbarbadge;
        int i2 = i;
        return removetabbarbadge.copy((i2 & 1) != 0 ? removetabbarbadge2.label : str, (i2 & 2) != 0 ? removetabbarbadge2.countryCode : str2, (i2 & 4) != 0 ? removetabbarbadge2.countryName : str3, (i2 & 8) != 0 ? removetabbarbadge2.state : str4, (i2 & 16) != 0 ? removetabbarbadge2.county : str5, (i2 & 32) != 0 ? removetabbarbadge2.city : str6, (i2 & 64) != 0 ? removetabbarbadge2.district : str7, (i2 & 128) != 0 ? removetabbarbadge2.subdistrict : str8, (i2 & 256) != 0 ? removetabbarbadge2.street : str9, (i2 & 512) != 0 ? removetabbarbadge2.postalCode : num);
    }

    @Nullable
    public final String component1() {
        return this.label;
    }

    @Nullable
    public final Integer component10() {
        return this.postalCode;
    }

    @Nullable
    public final String component2() {
        return this.countryCode;
    }

    @Nullable
    public final String component3() {
        return this.countryName;
    }

    @Nullable
    public final String component4() {
        return this.state;
    }

    @Nullable
    public final String component5() {
        return this.county;
    }

    @Nullable
    public final String component6() {
        return this.city;
    }

    @Nullable
    public final String component7() {
        return this.district;
    }

    @Nullable
    public final String component8() {
        return this.subdistrict;
    }

    @Nullable
    public final String component9() {
        return this.street;
    }

    @NotNull
    public final removeTabBarBadge copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num) {
        return new removeTabBarBadge(str, str2, str3, str4, str5, str6, str7, str8, str9, num);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeTabBarBadge)) {
            return false;
        }
        removeTabBarBadge removetabbarbadge = (removeTabBarBadge) obj;
        return Intrinsics.areEqual((Object) this.label, (Object) removetabbarbadge.label) && Intrinsics.areEqual((Object) this.countryCode, (Object) removetabbarbadge.countryCode) && Intrinsics.areEqual((Object) this.countryName, (Object) removetabbarbadge.countryName) && Intrinsics.areEqual((Object) this.state, (Object) removetabbarbadge.state) && Intrinsics.areEqual((Object) this.county, (Object) removetabbarbadge.county) && Intrinsics.areEqual((Object) this.city, (Object) removetabbarbadge.city) && Intrinsics.areEqual((Object) this.district, (Object) removetabbarbadge.district) && Intrinsics.areEqual((Object) this.subdistrict, (Object) removetabbarbadge.subdistrict) && Intrinsics.areEqual((Object) this.street, (Object) removetabbarbadge.street) && Intrinsics.areEqual((Object) this.postalCode, (Object) removetabbarbadge.postalCode);
    }

    public final int hashCode() {
        String str = this.label;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.countryCode;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.countryName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.state;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.county;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.city;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.district;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.subdistrict;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.street;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Integer num = this.postalCode;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode9 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Address(label=");
        sb.append(this.label);
        sb.append(", countryCode=");
        sb.append(this.countryCode);
        sb.append(", countryName=");
        sb.append(this.countryName);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", county=");
        sb.append(this.county);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", district=");
        sb.append(this.district);
        sb.append(", subdistrict=");
        sb.append(this.subdistrict);
        sb.append(", street=");
        sb.append(this.street);
        sb.append(", postalCode=");
        sb.append(this.postalCode);
        sb.append(")");
        return sb.toString();
    }

    public removeTabBarBadge(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num) {
        this.label = str;
        this.countryCode = str2;
        this.countryName = str3;
        this.state = str4;
        this.county = str5;
        this.city = str6;
        this.district = str7;
        this.subdistrict = str8;
        this.street = str9;
        this.postalCode = num;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    public final String getCountryName() {
        return this.countryName;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getCounty() {
        return this.county;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getDistrict() {
        return this.district;
    }

    @Nullable
    public final String getSubdistrict() {
        return this.subdistrict;
    }

    @Nullable
    public final String getStreet() {
        return this.street;
    }

    @Nullable
    public final Integer getPostalCode() {
        return this.postalCode;
    }
}
