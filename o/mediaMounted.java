package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0011HÆ\u0003J\t\u0010*\u001a\u00020\u0013HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00104\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00069"}, d2 = {"Lid/dana/domain/nearbyme/model/MerchantProductInfo;", "", "goodsId", "", "provider", "type", "description", "goodsTitle", "price", "Lid/dana/domain/nearbyme/model/MoneyView;", "denom", "available", "", "productCode", "extendInfo", "", "voucherInfo", "Lid/dana/domain/nearbyme/model/VoucherInfo;", "savingRate", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/nearbyme/model/MoneyView;Lid/dana/domain/nearbyme/model/MoneyView;ZLjava/lang/String;Ljava/util/Map;Lid/dana/domain/nearbyme/model/VoucherInfo;D)V", "getAvailable", "()Z", "getDenom", "()Lid/dana/domain/nearbyme/model/MoneyView;", "getDescription", "()Ljava/lang/String;", "getExtendInfo", "()Ljava/util/Map;", "getGoodsId", "getGoodsTitle", "getPrice", "getProductCode", "getProvider", "getSavingRate", "()D", "getType", "getVoucherInfo", "()Lid/dana/domain/nearbyme/model/VoucherInfo;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class mediaMounted {
    private final boolean available;
    @NotNull
    private final getAppDir denom;
    @NotNull
    private final String description;
    @NotNull
    private final Map<String, String> extendInfo;
    @NotNull
    private final String goodsId;
    @NotNull
    private final String goodsTitle;
    @NotNull
    private final getAppDir price;
    @NotNull
    private final String productCode;
    @NotNull
    private final String provider;
    private final double savingRate;
    @NotNull
    private final String type;
    @NotNull
    private final fileName voucherInfo;

    public static /* synthetic */ mediaMounted copy$default(mediaMounted mediamounted, String str, String str2, String str3, String str4, String str5, getAppDir getappdir, getAppDir getappdir2, boolean z, String str6, Map map, fileName filename, double d, int i, Object obj) {
        mediaMounted mediamounted2 = mediamounted;
        int i2 = i;
        return mediamounted.copy((i2 & 1) != 0 ? mediamounted2.goodsId : str, (i2 & 2) != 0 ? mediamounted2.provider : str2, (i2 & 4) != 0 ? mediamounted2.type : str3, (i2 & 8) != 0 ? mediamounted2.description : str4, (i2 & 16) != 0 ? mediamounted2.goodsTitle : str5, (i2 & 32) != 0 ? mediamounted2.price : getappdir, (i2 & 64) != 0 ? mediamounted2.denom : getappdir2, (i2 & 128) != 0 ? mediamounted2.available : z, (i2 & 256) != 0 ? mediamounted2.productCode : str6, (i2 & 512) != 0 ? mediamounted2.extendInfo : map, (i2 & 1024) != 0 ? mediamounted2.voucherInfo : filename, (i2 & 2048) != 0 ? mediamounted2.savingRate : d);
    }

    @NotNull
    public final String component1() {
        return this.goodsId;
    }

    @NotNull
    public final Map<String, String> component10() {
        return this.extendInfo;
    }

    @NotNull
    public final fileName component11() {
        return this.voucherInfo;
    }

    public final double component12() {
        return this.savingRate;
    }

    @NotNull
    public final String component2() {
        return this.provider;
    }

    @NotNull
    public final String component3() {
        return this.type;
    }

    @NotNull
    public final String component4() {
        return this.description;
    }

    @NotNull
    public final String component5() {
        return this.goodsTitle;
    }

    @NotNull
    public final getAppDir component6() {
        return this.price;
    }

    @NotNull
    public final getAppDir component7() {
        return this.denom;
    }

    public final boolean component8() {
        return this.available;
    }

    @NotNull
    public final String component9() {
        return this.productCode;
    }

    @NotNull
    public final mediaMounted copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull getAppDir getappdir, @NotNull getAppDir getappdir2, boolean z, @NotNull String str6, @NotNull Map<String, String> map, @NotNull fileName filename, double d) {
        String str7 = str;
        Intrinsics.checkNotNullParameter(str7, "goodsId");
        String str8 = str2;
        Intrinsics.checkNotNullParameter(str8, "provider");
        String str9 = str3;
        Intrinsics.checkNotNullParameter(str9, "type");
        String str10 = str4;
        Intrinsics.checkNotNullParameter(str10, "description");
        String str11 = str5;
        Intrinsics.checkNotNullParameter(str11, "goodsTitle");
        getAppDir getappdir3 = getappdir;
        Intrinsics.checkNotNullParameter(getappdir3, FirebaseAnalytics.Param.PRICE);
        getAppDir getappdir4 = getappdir2;
        Intrinsics.checkNotNullParameter(getappdir4, "denom");
        String str12 = str6;
        Intrinsics.checkNotNullParameter(str12, "productCode");
        Map<String, String> map2 = map;
        Intrinsics.checkNotNullParameter(map2, "extendInfo");
        fileName filename2 = filename;
        Intrinsics.checkNotNullParameter(filename2, "voucherInfo");
        return new mediaMounted(str7, str8, str9, str10, str11, getappdir3, getappdir4, z, str12, map2, filename2, d);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mediaMounted)) {
            return false;
        }
        mediaMounted mediamounted = (mediaMounted) obj;
        return Intrinsics.areEqual((Object) this.goodsId, (Object) mediamounted.goodsId) && Intrinsics.areEqual((Object) this.provider, (Object) mediamounted.provider) && Intrinsics.areEqual((Object) this.type, (Object) mediamounted.type) && Intrinsics.areEqual((Object) this.description, (Object) mediamounted.description) && Intrinsics.areEqual((Object) this.goodsTitle, (Object) mediamounted.goodsTitle) && Intrinsics.areEqual((Object) this.price, (Object) mediamounted.price) && Intrinsics.areEqual((Object) this.denom, (Object) mediamounted.denom) && this.available == mediamounted.available && Intrinsics.areEqual((Object) this.productCode, (Object) mediamounted.productCode) && Intrinsics.areEqual((Object) this.extendInfo, (Object) mediamounted.extendInfo) && Intrinsics.areEqual((Object) this.voucherInfo, (Object) mediamounted.voucherInfo) && Double.compare(this.savingRate, mediamounted.savingRate) == 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantProductInfo(goodsId=");
        sb.append(this.goodsId);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", goodsTitle=");
        sb.append(this.goodsTitle);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", denom=");
        sb.append(this.denom);
        sb.append(", available=");
        sb.append(this.available);
        sb.append(", productCode=");
        sb.append(this.productCode);
        sb.append(", extendInfo=");
        sb.append(this.extendInfo);
        sb.append(", voucherInfo=");
        sb.append(this.voucherInfo);
        sb.append(", savingRate=");
        sb.append(this.savingRate);
        sb.append(")");
        return sb.toString();
    }

    public mediaMounted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull getAppDir getappdir, @NotNull getAppDir getappdir2, boolean z, @NotNull String str6, @NotNull Map<String, String> map, @NotNull fileName filename, double d) {
        Intrinsics.checkNotNullParameter(str, "goodsId");
        Intrinsics.checkNotNullParameter(str2, "provider");
        Intrinsics.checkNotNullParameter(str3, "type");
        Intrinsics.checkNotNullParameter(str4, "description");
        Intrinsics.checkNotNullParameter(str5, "goodsTitle");
        Intrinsics.checkNotNullParameter(getappdir, FirebaseAnalytics.Param.PRICE);
        Intrinsics.checkNotNullParameter(getappdir2, "denom");
        Intrinsics.checkNotNullParameter(str6, "productCode");
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        Intrinsics.checkNotNullParameter(filename, "voucherInfo");
        this.goodsId = str;
        this.provider = str2;
        this.type = str3;
        this.description = str4;
        this.goodsTitle = str5;
        this.price = getappdir;
        this.denom = getappdir2;
        this.available = z;
        this.productCode = str6;
        this.extendInfo = map;
        this.voucherInfo = filename;
        this.savingRate = d;
    }

    @NotNull
    public final String getGoodsId() {
        return this.goodsId;
    }

    @NotNull
    public final String getProvider() {
        return this.provider;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getGoodsTitle() {
        return this.goodsTitle;
    }

    @NotNull
    public final getAppDir getPrice() {
        return this.price;
    }

    @NotNull
    public final getAppDir getDenom() {
        return this.denom;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    @NotNull
    public final String getProductCode() {
        return this.productCode;
    }

    @NotNull
    public final Map<String, String> getExtendInfo() {
        return this.extendInfo;
    }

    @NotNull
    public final fileName getVoucherInfo() {
        return this.voucherInfo;
    }

    public final double getSavingRate() {
        return this.savingRate;
    }

    public final int hashCode() {
        String str = this.goodsId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.provider;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.goodsTitle;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        getAppDir getappdir = this.price;
        int hashCode6 = (hashCode5 + (getappdir != null ? getappdir.hashCode() : 0)) * 31;
        getAppDir getappdir2 = this.denom;
        int hashCode7 = (hashCode6 + (getappdir2 != null ? getappdir2.hashCode() : 0)) * 31;
        boolean z = this.available;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
        String str6 = this.productCode;
        int hashCode8 = (i2 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Map<String, String> map = this.extendInfo;
        int hashCode9 = (hashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        fileName filename = this.voucherInfo;
        if (filename != null) {
            i = filename.hashCode();
        }
        return ((hashCode9 + i) * 31) + Double.valueOf(this.savingRate).hashCode();
    }
}
