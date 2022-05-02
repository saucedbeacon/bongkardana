package o;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003Je\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006)"}, d2 = {"Lid/dana/data/saving/model/SavingCategoryEntity;", "", "categoryCode", "", "name", "iconUrlDefault", "iconUrlSelected", "iconUrlLevel1", "iconUrlLevel2", "iconUrlLevel3", "iconUrlLevel4", "iconUrlLevel5", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategoryCode", "()Ljava/lang/String;", "setCategoryCode", "(Ljava/lang/String;)V", "getIconUrlDefault", "getIconUrlLevel1", "getIconUrlLevel2", "getIconUrlLevel3", "getIconUrlLevel4", "getIconUrlLevel5", "getIconUrlSelected", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$702 {
    @Nullable
    private String categoryCode;
    @SerializedName("icon_url_default")
    @NotNull
    private final String iconUrlDefault;
    @SerializedName("icon_url_level1")
    @NotNull
    private final String iconUrlLevel1;
    @SerializedName("icon_url_level2")
    @NotNull
    private final String iconUrlLevel2;
    @SerializedName("icon_url_level3")
    @NotNull
    private final String iconUrlLevel3;
    @SerializedName("icon_url_level4")
    @NotNull
    private final String iconUrlLevel4;
    @SerializedName("icon_url_level5")
    @NotNull
    private final String iconUrlLevel5;
    @SerializedName("icon_url_selected")
    @NotNull
    private final String iconUrlSelected;
    @SerializedName("name")
    @NotNull
    private final String name;

    public static /* synthetic */ access$702 copy$default(access$702 access_702, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        access$702 access_7022 = access_702;
        int i2 = i;
        return access_702.copy((i2 & 1) != 0 ? access_7022.categoryCode : str, (i2 & 2) != 0 ? access_7022.name : str2, (i2 & 4) != 0 ? access_7022.iconUrlDefault : str3, (i2 & 8) != 0 ? access_7022.iconUrlSelected : str4, (i2 & 16) != 0 ? access_7022.iconUrlLevel1 : str5, (i2 & 32) != 0 ? access_7022.iconUrlLevel2 : str6, (i2 & 64) != 0 ? access_7022.iconUrlLevel3 : str7, (i2 & 128) != 0 ? access_7022.iconUrlLevel4 : str8, (i2 & 256) != 0 ? access_7022.iconUrlLevel5 : str9);
    }

    @Nullable
    public final String component1() {
        return this.categoryCode;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.iconUrlDefault;
    }

    @NotNull
    public final String component4() {
        return this.iconUrlSelected;
    }

    @NotNull
    public final String component5() {
        return this.iconUrlLevel1;
    }

    @NotNull
    public final String component6() {
        return this.iconUrlLevel2;
    }

    @NotNull
    public final String component7() {
        return this.iconUrlLevel3;
    }

    @NotNull
    public final String component8() {
        return this.iconUrlLevel4;
    }

    @NotNull
    public final String component9() {
        return this.iconUrlLevel5;
    }

    @NotNull
    public final access$702 copy(@Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "iconUrlDefault");
        Intrinsics.checkNotNullParameter(str4, "iconUrlSelected");
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, "iconUrlLevel1");
        String str11 = str6;
        Intrinsics.checkNotNullParameter(str11, "iconUrlLevel2");
        String str12 = str7;
        Intrinsics.checkNotNullParameter(str12, "iconUrlLevel3");
        String str13 = str8;
        Intrinsics.checkNotNullParameter(str13, "iconUrlLevel4");
        String str14 = str9;
        Intrinsics.checkNotNullParameter(str14, "iconUrlLevel5");
        return new access$702(str, str2, str3, str4, str10, str11, str12, str13, str14);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$702)) {
            return false;
        }
        access$702 access_702 = (access$702) obj;
        return Intrinsics.areEqual((Object) this.categoryCode, (Object) access_702.categoryCode) && Intrinsics.areEqual((Object) this.name, (Object) access_702.name) && Intrinsics.areEqual((Object) this.iconUrlDefault, (Object) access_702.iconUrlDefault) && Intrinsics.areEqual((Object) this.iconUrlSelected, (Object) access_702.iconUrlSelected) && Intrinsics.areEqual((Object) this.iconUrlLevel1, (Object) access_702.iconUrlLevel1) && Intrinsics.areEqual((Object) this.iconUrlLevel2, (Object) access_702.iconUrlLevel2) && Intrinsics.areEqual((Object) this.iconUrlLevel3, (Object) access_702.iconUrlLevel3) && Intrinsics.areEqual((Object) this.iconUrlLevel4, (Object) access_702.iconUrlLevel4) && Intrinsics.areEqual((Object) this.iconUrlLevel5, (Object) access_702.iconUrlLevel5);
    }

    public final int hashCode() {
        String str = this.categoryCode;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.iconUrlDefault;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.iconUrlSelected;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.iconUrlLevel1;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.iconUrlLevel2;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.iconUrlLevel3;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.iconUrlLevel4;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.iconUrlLevel5;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode8 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingCategoryEntity(categoryCode=");
        sb.append(this.categoryCode);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", iconUrlDefault=");
        sb.append(this.iconUrlDefault);
        sb.append(", iconUrlSelected=");
        sb.append(this.iconUrlSelected);
        sb.append(", iconUrlLevel1=");
        sb.append(this.iconUrlLevel1);
        sb.append(", iconUrlLevel2=");
        sb.append(this.iconUrlLevel2);
        sb.append(", iconUrlLevel3=");
        sb.append(this.iconUrlLevel3);
        sb.append(", iconUrlLevel4=");
        sb.append(this.iconUrlLevel4);
        sb.append(", iconUrlLevel5=");
        sb.append(this.iconUrlLevel5);
        sb.append(")");
        return sb.toString();
    }

    public access$702(@Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "iconUrlDefault");
        Intrinsics.checkNotNullParameter(str4, "iconUrlSelected");
        Intrinsics.checkNotNullParameter(str5, "iconUrlLevel1");
        Intrinsics.checkNotNullParameter(str6, "iconUrlLevel2");
        Intrinsics.checkNotNullParameter(str7, "iconUrlLevel3");
        Intrinsics.checkNotNullParameter(str8, "iconUrlLevel4");
        Intrinsics.checkNotNullParameter(str9, "iconUrlLevel5");
        this.categoryCode = str;
        this.name = str2;
        this.iconUrlDefault = str3;
        this.iconUrlSelected = str4;
        this.iconUrlLevel1 = str5;
        this.iconUrlLevel2 = str6;
        this.iconUrlLevel3 = str7;
        this.iconUrlLevel4 = str8;
        this.iconUrlLevel5 = str9;
    }

    @Nullable
    public final String getCategoryCode() {
        return this.categoryCode;
    }

    public final void setCategoryCode(@Nullable String str) {
        this.categoryCode = str;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getIconUrlDefault() {
        return this.iconUrlDefault;
    }

    @NotNull
    public final String getIconUrlSelected() {
        return this.iconUrlSelected;
    }

    @NotNull
    public final String getIconUrlLevel1() {
        return this.iconUrlLevel1;
    }

    @NotNull
    public final String getIconUrlLevel2() {
        return this.iconUrlLevel2;
    }

    @NotNull
    public final String getIconUrlLevel3() {
        return this.iconUrlLevel3;
    }

    @NotNull
    public final String getIconUrlLevel4() {
        return this.iconUrlLevel4;
    }

    @NotNull
    public final String getIconUrlLevel5() {
        return this.iconUrlLevel5;
    }
}
