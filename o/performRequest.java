package o;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\u0010\u0015J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0015\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J«\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014HÆ\u0001J\u0013\u0010;\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u001a\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R\u001a\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010#R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017¨\u0006@"}, d2 = {"Lid/dana/domain/globalsearch/model/ProductBizId;", "", "bizId", "", "secondaryBizId", "transactionDate", "customerName", "goodsId", "goodsTitle", "goodsType", "denom", "Lid/dana/domain/globalsearch/model/Denom;", "provider", "providerName", "isGoodsActive", "", "productCode", "productDesc", "profileKey", "extendInfo", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/globalsearch/model/Denom;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getBizId", "()Ljava/lang/String;", "getCustomerName", "getDenom", "()Lid/dana/domain/globalsearch/model/Denom;", "getExtendInfo", "()Ljava/util/Map;", "getGoodsId", "getGoodsTitle", "getGoodsType", "()Z", "getProductCode", "setProductCode", "(Ljava/lang/String;)V", "getProductDesc", "setProductDesc", "getProfileKey", "getProvider", "getProviderName", "getSecondaryBizId", "getTransactionDate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class performRequest {
    @NotNull
    private final String bizId;
    @NotNull
    private final String customerName;
    @NotNull
    private final GriverNetworkPermissionExtension denom;
    @NotNull
    private final Map<String, Object> extendInfo;
    @NotNull
    private final String goodsId;
    @NotNull
    private final String goodsTitle;
    @NotNull
    private final String goodsType;
    private final boolean isGoodsActive;
    @NotNull
    private String productCode;
    @NotNull
    private String productDesc;
    @NotNull
    private final String profileKey;
    @NotNull
    private final String provider;
    @NotNull
    private final String providerName;
    @NotNull
    private final String secondaryBizId;
    @NotNull
    private final String transactionDate;

    public performRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (GriverNetworkPermissionExtension) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (Map) null, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ performRequest copy$default(performRequest performrequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, GriverNetworkPermissionExtension griverNetworkPermissionExtension, String str8, String str9, boolean z, String str10, String str11, String str12, Map map, int i, Object obj) {
        performRequest performrequest2 = performrequest;
        int i2 = i;
        return performrequest.copy((i2 & 1) != 0 ? performrequest2.bizId : str, (i2 & 2) != 0 ? performrequest2.secondaryBizId : str2, (i2 & 4) != 0 ? performrequest2.transactionDate : str3, (i2 & 8) != 0 ? performrequest2.customerName : str4, (i2 & 16) != 0 ? performrequest2.goodsId : str5, (i2 & 32) != 0 ? performrequest2.goodsTitle : str6, (i2 & 64) != 0 ? performrequest2.goodsType : str7, (i2 & 128) != 0 ? performrequest2.denom : griverNetworkPermissionExtension, (i2 & 256) != 0 ? performrequest2.provider : str8, (i2 & 512) != 0 ? performrequest2.providerName : str9, (i2 & 1024) != 0 ? performrequest2.isGoodsActive : z, (i2 & 2048) != 0 ? performrequest2.productCode : str10, (i2 & 4096) != 0 ? performrequest2.productDesc : str11, (i2 & 8192) != 0 ? performrequest2.profileKey : str12, (i2 & 16384) != 0 ? performrequest2.extendInfo : map);
    }

    @NotNull
    public final String component1() {
        return this.bizId;
    }

    @NotNull
    public final String component10() {
        return this.providerName;
    }

    public final boolean component11() {
        return this.isGoodsActive;
    }

    @NotNull
    public final String component12() {
        return this.productCode;
    }

    @NotNull
    public final String component13() {
        return this.productDesc;
    }

    @NotNull
    public final String component14() {
        return this.profileKey;
    }

    @NotNull
    public final Map<String, Object> component15() {
        return this.extendInfo;
    }

    @NotNull
    public final String component2() {
        return this.secondaryBizId;
    }

    @NotNull
    public final String component3() {
        return this.transactionDate;
    }

    @NotNull
    public final String component4() {
        return this.customerName;
    }

    @NotNull
    public final String component5() {
        return this.goodsId;
    }

    @NotNull
    public final String component6() {
        return this.goodsTitle;
    }

    @NotNull
    public final String component7() {
        return this.goodsType;
    }

    @NotNull
    public final GriverNetworkPermissionExtension component8() {
        return this.denom;
    }

    @NotNull
    public final String component9() {
        return this.provider;
    }

    @NotNull
    public final performRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull GriverNetworkPermissionExtension griverNetworkPermissionExtension, @NotNull String str8, @NotNull String str9, boolean z, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull Map<String, ? extends Object> map) {
        String str13 = str;
        Intrinsics.checkNotNullParameter(str13, "bizId");
        String str14 = str2;
        Intrinsics.checkNotNullParameter(str14, "secondaryBizId");
        String str15 = str3;
        Intrinsics.checkNotNullParameter(str15, "transactionDate");
        String str16 = str4;
        Intrinsics.checkNotNullParameter(str16, "customerName");
        String str17 = str5;
        Intrinsics.checkNotNullParameter(str17, "goodsId");
        String str18 = str6;
        Intrinsics.checkNotNullParameter(str18, "goodsTitle");
        String str19 = str7;
        Intrinsics.checkNotNullParameter(str19, "goodsType");
        GriverNetworkPermissionExtension griverNetworkPermissionExtension2 = griverNetworkPermissionExtension;
        Intrinsics.checkNotNullParameter(griverNetworkPermissionExtension2, "denom");
        String str20 = str8;
        Intrinsics.checkNotNullParameter(str20, "provider");
        String str21 = str9;
        Intrinsics.checkNotNullParameter(str21, "providerName");
        String str22 = str10;
        Intrinsics.checkNotNullParameter(str22, "productCode");
        String str23 = str11;
        Intrinsics.checkNotNullParameter(str23, "productDesc");
        String str24 = str12;
        Intrinsics.checkNotNullParameter(str24, "profileKey");
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        return new performRequest(str13, str14, str15, str16, str17, str18, str19, griverNetworkPermissionExtension2, str20, str21, z, str22, str23, str24, map);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof performRequest)) {
            return false;
        }
        performRequest performrequest = (performRequest) obj;
        return Intrinsics.areEqual((Object) this.bizId, (Object) performrequest.bizId) && Intrinsics.areEqual((Object) this.secondaryBizId, (Object) performrequest.secondaryBizId) && Intrinsics.areEqual((Object) this.transactionDate, (Object) performrequest.transactionDate) && Intrinsics.areEqual((Object) this.customerName, (Object) performrequest.customerName) && Intrinsics.areEqual((Object) this.goodsId, (Object) performrequest.goodsId) && Intrinsics.areEqual((Object) this.goodsTitle, (Object) performrequest.goodsTitle) && Intrinsics.areEqual((Object) this.goodsType, (Object) performrequest.goodsType) && Intrinsics.areEqual((Object) this.denom, (Object) performrequest.denom) && Intrinsics.areEqual((Object) this.provider, (Object) performrequest.provider) && Intrinsics.areEqual((Object) this.providerName, (Object) performrequest.providerName) && this.isGoodsActive == performrequest.isGoodsActive && Intrinsics.areEqual((Object) this.productCode, (Object) performrequest.productCode) && Intrinsics.areEqual((Object) this.productDesc, (Object) performrequest.productDesc) && Intrinsics.areEqual((Object) this.profileKey, (Object) performrequest.profileKey) && Intrinsics.areEqual((Object) this.extendInfo, (Object) performrequest.extendInfo);
    }

    public final int hashCode() {
        String str = this.bizId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secondaryBizId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.transactionDate;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.customerName;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.goodsId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.goodsTitle;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.goodsType;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        GriverNetworkPermissionExtension griverNetworkPermissionExtension = this.denom;
        int hashCode8 = (hashCode7 + (griverNetworkPermissionExtension != null ? griverNetworkPermissionExtension.hashCode() : 0)) * 31;
        String str8 = this.provider;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.providerName;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        boolean z = this.isGoodsActive;
        if (z) {
            z = true;
        }
        int i2 = (hashCode10 + (z ? 1 : 0)) * 31;
        String str10 = this.productCode;
        int hashCode11 = (i2 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.productDesc;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.profileKey;
        int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31;
        Map<String, Object> map = this.extendInfo;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode13 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductBizId(bizId=");
        sb.append(this.bizId);
        sb.append(", secondaryBizId=");
        sb.append(this.secondaryBizId);
        sb.append(", transactionDate=");
        sb.append(this.transactionDate);
        sb.append(", customerName=");
        sb.append(this.customerName);
        sb.append(", goodsId=");
        sb.append(this.goodsId);
        sb.append(", goodsTitle=");
        sb.append(this.goodsTitle);
        sb.append(", goodsType=");
        sb.append(this.goodsType);
        sb.append(", denom=");
        sb.append(this.denom);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", providerName=");
        sb.append(this.providerName);
        sb.append(", isGoodsActive=");
        sb.append(this.isGoodsActive);
        sb.append(", productCode=");
        sb.append(this.productCode);
        sb.append(", productDesc=");
        sb.append(this.productDesc);
        sb.append(", profileKey=");
        sb.append(this.profileKey);
        sb.append(", extendInfo=");
        sb.append(this.extendInfo);
        sb.append(")");
        return sb.toString();
    }

    public performRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull GriverNetworkPermissionExtension griverNetworkPermissionExtension, @NotNull String str8, @NotNull String str9, boolean z, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull Map<String, ? extends Object> map) {
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        GriverNetworkPermissionExtension griverNetworkPermissionExtension2 = griverNetworkPermissionExtension;
        String str20 = str8;
        String str21 = str9;
        String str22 = str10;
        String str23 = str11;
        String str24 = str12;
        Map<String, ? extends Object> map2 = map;
        Intrinsics.checkNotNullParameter(str13, "bizId");
        Intrinsics.checkNotNullParameter(str14, "secondaryBizId");
        Intrinsics.checkNotNullParameter(str15, "transactionDate");
        Intrinsics.checkNotNullParameter(str16, "customerName");
        Intrinsics.checkNotNullParameter(str17, "goodsId");
        Intrinsics.checkNotNullParameter(str18, "goodsTitle");
        Intrinsics.checkNotNullParameter(str19, "goodsType");
        Intrinsics.checkNotNullParameter(griverNetworkPermissionExtension2, "denom");
        Intrinsics.checkNotNullParameter(str20, "provider");
        Intrinsics.checkNotNullParameter(str21, "providerName");
        Intrinsics.checkNotNullParameter(str22, "productCode");
        Intrinsics.checkNotNullParameter(str23, "productDesc");
        Intrinsics.checkNotNullParameter(str24, "profileKey");
        Intrinsics.checkNotNullParameter(map2, "extendInfo");
        this.bizId = str13;
        this.secondaryBizId = str14;
        this.transactionDate = str15;
        this.customerName = str16;
        this.goodsId = str17;
        this.goodsTitle = str18;
        this.goodsType = str19;
        this.denom = griverNetworkPermissionExtension2;
        this.provider = str20;
        this.providerName = str21;
        this.isGoodsActive = z;
        this.productCode = str22;
        this.productDesc = str23;
        this.profileKey = str24;
        this.extendInfo = map2;
    }

    @NotNull
    public final String getBizId() {
        return this.bizId;
    }

    @NotNull
    public final String getSecondaryBizId() {
        return this.secondaryBizId;
    }

    @NotNull
    public final String getTransactionDate() {
        return this.transactionDate;
    }

    @NotNull
    public final String getCustomerName() {
        return this.customerName;
    }

    @NotNull
    public final String getGoodsId() {
        return this.goodsId;
    }

    @NotNull
    public final String getGoodsTitle() {
        return this.goodsTitle;
    }

    @NotNull
    public final String getGoodsType() {
        return this.goodsType;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ performRequest(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, o.GriverNetworkPermissionExtension r24, java.lang.String r25, java.lang.String r26, boolean r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.Map r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r17
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r18
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r19
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r2
            goto L_0x0024
        L_0x0022:
            r5 = r20
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002c
        L_0x002a:
            r6 = r21
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0032
            r7 = r2
            goto L_0x0034
        L_0x0032:
            r7 = r22
        L_0x0034:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003a
            r8 = r2
            goto L_0x003c
        L_0x003a:
            r8 = r23
        L_0x003c:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0048
            o.GriverNetworkPermissionExtension r9 = new o.GriverNetworkPermissionExtension
            r10 = 3
            r11 = 0
            r9.<init>(r11, r11, r10, r11)
            goto L_0x004a
        L_0x0048:
            r9 = r24
        L_0x004a:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0050
            r10 = r2
            goto L_0x0052
        L_0x0050:
            r10 = r25
        L_0x0052:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0058
            r11 = r2
            goto L_0x005a
        L_0x0058:
            r11 = r26
        L_0x005a:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0060
            r12 = 0
            goto L_0x0062
        L_0x0060:
            r12 = r27
        L_0x0062:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0068
            r13 = r2
            goto L_0x006a
        L_0x0068:
            r13 = r28
        L_0x006a:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0070
            r14 = r2
            goto L_0x0072
        L_0x0070:
            r14 = r29
        L_0x0072:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r2 = r30
        L_0x0079:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0082
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            goto L_0x0084
        L_0x0082:
            r0 = r31
        L_0x0084:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r2
            r32 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.performRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.GriverNetworkPermissionExtension, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final GriverNetworkPermissionExtension getDenom() {
        return this.denom;
    }

    @NotNull
    public final String getProvider() {
        return this.provider;
    }

    @NotNull
    public final String getProviderName() {
        return this.providerName;
    }

    public final boolean isGoodsActive() {
        return this.isGoodsActive;
    }

    @NotNull
    public final String getProductCode() {
        return this.productCode;
    }

    public final void setProductCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productCode = str;
    }

    @NotNull
    public final String getProductDesc() {
        return this.productDesc;
    }

    public final void setProductDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productDesc = str;
    }

    @NotNull
    public final String getProfileKey() {
        return this.profileKey;
    }

    @NotNull
    public final Map<String, Object> getExtendInfo() {
        return this.extendInfo;
    }
}
