package o;

import id.dana.data.constant.BranchLinkConstant;
import id.dana.utils.deeplink.DeepLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bL\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0015J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J½\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020SHÖ\u0001J\t\u0010T\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001a\u0010\u0012\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R\u001a\u0010\u0014\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R\u001a\u0010\u0013\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0017\"\u0004\b9\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0017\"\u0004\b;\u0010\u0019¨\u0006U"}, d2 = {"Lid/dana/domain/loyalty/model/SubmitReceiptResult;", "", "id", "", "createdDate", "modifiedDate", "orderId", "merchantId", "merchantName", "loyaltyMerchantName", "originalMerchantName", "orderDate", "orderAmount", "imageAssetUrl", "userLoyaltyId", "receiptStatus", "receiptResultType", "receiptApprovalStatus", "pointGenerated", "reasonId", "reasonEn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedDate", "()Ljava/lang/String;", "setCreatedDate", "(Ljava/lang/String;)V", "getId", "setId", "getImageAssetUrl", "setImageAssetUrl", "getLoyaltyMerchantName", "setLoyaltyMerchantName", "getMerchantId", "setMerchantId", "getMerchantName", "setMerchantName", "getModifiedDate", "setModifiedDate", "getOrderAmount", "setOrderAmount", "getOrderDate", "setOrderDate", "getOrderId", "setOrderId", "getOriginalMerchantName", "setOriginalMerchantName", "getPointGenerated", "setPointGenerated", "getReasonEn", "setReasonEn", "getReasonId", "setReasonId", "getReceiptApprovalStatus", "setReceiptApprovalStatus", "getReceiptResultType", "setReceiptResultType", "getReceiptStatus", "setReceiptStatus", "getUserLoyaltyId", "setUserLoyaltyId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class threshold {
    @NotNull
    private String createdDate;
    @NotNull

    /* renamed from: id  reason: collision with root package name */
    private String f11090id;
    @NotNull
    private String imageAssetUrl;
    @NotNull
    private String loyaltyMerchantName;
    @NotNull
    private String merchantId;
    @NotNull
    private String merchantName;
    @NotNull
    private String modifiedDate;
    @NotNull
    private String orderAmount;
    @NotNull
    private String orderDate;
    @NotNull
    private String orderId;
    @NotNull
    private String originalMerchantName;
    @NotNull
    private String pointGenerated;
    @NotNull
    private String reasonEn;
    @NotNull
    private String reasonId;
    @NotNull
    private String receiptApprovalStatus;
    @NotNull
    private String receiptResultType;
    @NotNull
    private String receiptStatus;
    @NotNull
    private String userLoyaltyId;

    public static /* synthetic */ threshold copy$default(threshold threshold, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, Object obj) {
        threshold threshold2 = threshold;
        int i2 = i;
        return threshold.copy((i2 & 1) != 0 ? threshold2.f11090id : str, (i2 & 2) != 0 ? threshold2.createdDate : str2, (i2 & 4) != 0 ? threshold2.modifiedDate : str3, (i2 & 8) != 0 ? threshold2.orderId : str4, (i2 & 16) != 0 ? threshold2.merchantId : str5, (i2 & 32) != 0 ? threshold2.merchantName : str6, (i2 & 64) != 0 ? threshold2.loyaltyMerchantName : str7, (i2 & 128) != 0 ? threshold2.originalMerchantName : str8, (i2 & 256) != 0 ? threshold2.orderDate : str9, (i2 & 512) != 0 ? threshold2.orderAmount : str10, (i2 & 1024) != 0 ? threshold2.imageAssetUrl : str11, (i2 & 2048) != 0 ? threshold2.userLoyaltyId : str12, (i2 & 4096) != 0 ? threshold2.receiptStatus : str13, (i2 & 8192) != 0 ? threshold2.receiptResultType : str14, (i2 & 16384) != 0 ? threshold2.receiptApprovalStatus : str15, (i2 & 32768) != 0 ? threshold2.pointGenerated : str16, (i2 & 65536) != 0 ? threshold2.reasonId : str17, (i2 & 131072) != 0 ? threshold2.reasonEn : str18);
    }

    @NotNull
    public final String component1() {
        return this.f11090id;
    }

    @NotNull
    public final String component10() {
        return this.orderAmount;
    }

    @NotNull
    public final String component11() {
        return this.imageAssetUrl;
    }

    @NotNull
    public final String component12() {
        return this.userLoyaltyId;
    }

    @NotNull
    public final String component13() {
        return this.receiptStatus;
    }

    @NotNull
    public final String component14() {
        return this.receiptResultType;
    }

    @NotNull
    public final String component15() {
        return this.receiptApprovalStatus;
    }

    @NotNull
    public final String component16() {
        return this.pointGenerated;
    }

    @NotNull
    public final String component17() {
        return this.reasonId;
    }

    @NotNull
    public final String component18() {
        return this.reasonEn;
    }

    @NotNull
    public final String component2() {
        return this.createdDate;
    }

    @NotNull
    public final String component3() {
        return this.modifiedDate;
    }

    @NotNull
    public final String component4() {
        return this.orderId;
    }

    @NotNull
    public final String component5() {
        return this.merchantId;
    }

    @NotNull
    public final String component6() {
        return this.merchantName;
    }

    @NotNull
    public final String component7() {
        return this.loyaltyMerchantName;
    }

    @NotNull
    public final String component8() {
        return this.originalMerchantName;
    }

    @NotNull
    public final String component9() {
        return this.orderDate;
    }

    @NotNull
    public final threshold copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18) {
        String str19 = str;
        Intrinsics.checkNotNullParameter(str19, "id");
        Intrinsics.checkNotNullParameter(str2, "createdDate");
        Intrinsics.checkNotNullParameter(str3, "modifiedDate");
        Intrinsics.checkNotNullParameter(str4, DeepLinkConstant.DeepLinkParams.ORDER_ID);
        Intrinsics.checkNotNullParameter(str5, "merchantId");
        Intrinsics.checkNotNullParameter(str6, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str7, "loyaltyMerchantName");
        Intrinsics.checkNotNullParameter(str8, "originalMerchantName");
        Intrinsics.checkNotNullParameter(str9, "orderDate");
        Intrinsics.checkNotNullParameter(str10, "orderAmount");
        Intrinsics.checkNotNullParameter(str11, "imageAssetUrl");
        Intrinsics.checkNotNullParameter(str12, "userLoyaltyId");
        Intrinsics.checkNotNullParameter(str13, "receiptStatus");
        Intrinsics.checkNotNullParameter(str14, "receiptResultType");
        Intrinsics.checkNotNullParameter(str15, "receiptApprovalStatus");
        Intrinsics.checkNotNullParameter(str16, "pointGenerated");
        Intrinsics.checkNotNullParameter(str17, "reasonId");
        Intrinsics.checkNotNullParameter(str18, "reasonEn");
        return new threshold(str19, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof threshold)) {
            return false;
        }
        threshold threshold = (threshold) obj;
        return Intrinsics.areEqual((Object) this.f11090id, (Object) threshold.f11090id) && Intrinsics.areEqual((Object) this.createdDate, (Object) threshold.createdDate) && Intrinsics.areEqual((Object) this.modifiedDate, (Object) threshold.modifiedDate) && Intrinsics.areEqual((Object) this.orderId, (Object) threshold.orderId) && Intrinsics.areEqual((Object) this.merchantId, (Object) threshold.merchantId) && Intrinsics.areEqual((Object) this.merchantName, (Object) threshold.merchantName) && Intrinsics.areEqual((Object) this.loyaltyMerchantName, (Object) threshold.loyaltyMerchantName) && Intrinsics.areEqual((Object) this.originalMerchantName, (Object) threshold.originalMerchantName) && Intrinsics.areEqual((Object) this.orderDate, (Object) threshold.orderDate) && Intrinsics.areEqual((Object) this.orderAmount, (Object) threshold.orderAmount) && Intrinsics.areEqual((Object) this.imageAssetUrl, (Object) threshold.imageAssetUrl) && Intrinsics.areEqual((Object) this.userLoyaltyId, (Object) threshold.userLoyaltyId) && Intrinsics.areEqual((Object) this.receiptStatus, (Object) threshold.receiptStatus) && Intrinsics.areEqual((Object) this.receiptResultType, (Object) threshold.receiptResultType) && Intrinsics.areEqual((Object) this.receiptApprovalStatus, (Object) threshold.receiptApprovalStatus) && Intrinsics.areEqual((Object) this.pointGenerated, (Object) threshold.pointGenerated) && Intrinsics.areEqual((Object) this.reasonId, (Object) threshold.reasonId) && Intrinsics.areEqual((Object) this.reasonEn, (Object) threshold.reasonEn);
    }

    public final int hashCode() {
        String str = this.f11090id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.createdDate;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.modifiedDate;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.orderId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.merchantId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.merchantName;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.loyaltyMerchantName;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.originalMerchantName;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.orderDate;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.orderAmount;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.imageAssetUrl;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.userLoyaltyId;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.receiptStatus;
        int hashCode13 = (hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.receiptResultType;
        int hashCode14 = (hashCode13 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.receiptApprovalStatus;
        int hashCode15 = (hashCode14 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.pointGenerated;
        int hashCode16 = (hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.reasonId;
        int hashCode17 = (hashCode16 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String str18 = this.reasonEn;
        if (str18 != null) {
            i = str18.hashCode();
        }
        return hashCode17 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SubmitReceiptResult(id=");
        sb.append(this.f11090id);
        sb.append(", createdDate=");
        sb.append(this.createdDate);
        sb.append(", modifiedDate=");
        sb.append(this.modifiedDate);
        sb.append(", orderId=");
        sb.append(this.orderId);
        sb.append(", merchantId=");
        sb.append(this.merchantId);
        sb.append(", merchantName=");
        sb.append(this.merchantName);
        sb.append(", loyaltyMerchantName=");
        sb.append(this.loyaltyMerchantName);
        sb.append(", originalMerchantName=");
        sb.append(this.originalMerchantName);
        sb.append(", orderDate=");
        sb.append(this.orderDate);
        sb.append(", orderAmount=");
        sb.append(this.orderAmount);
        sb.append(", imageAssetUrl=");
        sb.append(this.imageAssetUrl);
        sb.append(", userLoyaltyId=");
        sb.append(this.userLoyaltyId);
        sb.append(", receiptStatus=");
        sb.append(this.receiptStatus);
        sb.append(", receiptResultType=");
        sb.append(this.receiptResultType);
        sb.append(", receiptApprovalStatus=");
        sb.append(this.receiptApprovalStatus);
        sb.append(", pointGenerated=");
        sb.append(this.pointGenerated);
        sb.append(", reasonId=");
        sb.append(this.reasonId);
        sb.append(", reasonEn=");
        sb.append(this.reasonEn);
        sb.append(")");
        return sb.toString();
    }

    public threshold(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18) {
        String str19 = str;
        String str20 = str2;
        String str21 = str3;
        String str22 = str4;
        String str23 = str5;
        String str24 = str6;
        String str25 = str7;
        String str26 = str8;
        String str27 = str9;
        String str28 = str10;
        String str29 = str11;
        String str30 = str12;
        String str31 = str13;
        String str32 = str14;
        String str33 = str16;
        Intrinsics.checkNotNullParameter(str19, "id");
        Intrinsics.checkNotNullParameter(str20, "createdDate");
        Intrinsics.checkNotNullParameter(str21, "modifiedDate");
        Intrinsics.checkNotNullParameter(str22, DeepLinkConstant.DeepLinkParams.ORDER_ID);
        Intrinsics.checkNotNullParameter(str23, "merchantId");
        Intrinsics.checkNotNullParameter(str24, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str25, "loyaltyMerchantName");
        Intrinsics.checkNotNullParameter(str26, "originalMerchantName");
        Intrinsics.checkNotNullParameter(str27, "orderDate");
        Intrinsics.checkNotNullParameter(str28, "orderAmount");
        Intrinsics.checkNotNullParameter(str29, "imageAssetUrl");
        Intrinsics.checkNotNullParameter(str30, "userLoyaltyId");
        Intrinsics.checkNotNullParameter(str31, "receiptStatus");
        Intrinsics.checkNotNullParameter(str32, "receiptResultType");
        Intrinsics.checkNotNullParameter(str15, "receiptApprovalStatus");
        Intrinsics.checkNotNullParameter(str16, "pointGenerated");
        Intrinsics.checkNotNullParameter(str17, "reasonId");
        Intrinsics.checkNotNullParameter(str18, "reasonEn");
        this.f11090id = str19;
        this.createdDate = str20;
        this.modifiedDate = str21;
        this.orderId = str22;
        this.merchantId = str23;
        this.merchantName = str24;
        this.loyaltyMerchantName = str25;
        this.originalMerchantName = str26;
        this.orderDate = str27;
        this.orderAmount = str28;
        this.imageAssetUrl = str29;
        this.userLoyaltyId = str30;
        this.receiptStatus = str31;
        this.receiptResultType = str32;
        this.receiptApprovalStatus = str15;
        this.pointGenerated = str16;
        this.reasonId = str17;
        this.reasonEn = str18;
    }

    @NotNull
    public final String getId() {
        return this.f11090id;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f11090id = str;
    }

    @NotNull
    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final void setCreatedDate(@NotNull String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1372979902, oncanceled);
            onCancelLoad.getMin(-1372979902, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.createdDate = str;
    }

    @NotNull
    public final String getModifiedDate() {
        return this.modifiedDate;
    }

    public final void setModifiedDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.modifiedDate = str;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderId = str;
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    public final void setMerchantId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.merchantId = str;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    public final void setMerchantName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.merchantName = str;
    }

    @NotNull
    public final String getLoyaltyMerchantName() {
        return this.loyaltyMerchantName;
    }

    public final void setLoyaltyMerchantName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loyaltyMerchantName = str;
    }

    @NotNull
    public final String getOriginalMerchantName() {
        return this.originalMerchantName;
    }

    public final void setOriginalMerchantName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.originalMerchantName = str;
    }

    @NotNull
    public final String getOrderDate() {
        return this.orderDate;
    }

    public final void setOrderDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderDate = str;
    }

    @NotNull
    public final String getOrderAmount() {
        return this.orderAmount;
    }

    public final void setOrderAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderAmount = str;
    }

    @NotNull
    public final String getImageAssetUrl() {
        return this.imageAssetUrl;
    }

    public final void setImageAssetUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageAssetUrl = str;
    }

    @NotNull
    public final String getUserLoyaltyId() {
        return this.userLoyaltyId;
    }

    public final void setUserLoyaltyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userLoyaltyId = str;
    }

    @NotNull
    public final String getReceiptStatus() {
        return this.receiptStatus;
    }

    public final void setReceiptStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.receiptStatus = str;
    }

    @NotNull
    public final String getReceiptResultType() {
        return this.receiptResultType;
    }

    public final void setReceiptResultType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.receiptResultType = str;
    }

    @NotNull
    public final String getReceiptApprovalStatus() {
        return this.receiptApprovalStatus;
    }

    public final void setReceiptApprovalStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.receiptApprovalStatus = str;
    }

    @NotNull
    public final String getPointGenerated() {
        return this.pointGenerated;
    }

    public final void setPointGenerated(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pointGenerated = str;
    }

    @NotNull
    public final String getReasonId() {
        return this.reasonId;
    }

    public final void setReasonId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reasonId = str;
    }

    @NotNull
    public final String getReasonEn() {
        return this.reasonEn;
    }

    public final void setReasonEn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reasonEn = str;
    }
}
