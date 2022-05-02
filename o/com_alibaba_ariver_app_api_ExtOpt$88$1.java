package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bL\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÛ\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020SHÖ\u0001J\t\u0010T\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0017\"\u0004\b9\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0017\"\u0004\b;\u0010\u0019¨\u0006U"}, d2 = {"Lid/dana/data/loyalty/repository/source/network/response/SubmitReceiptResponse;", "", "id", "", "createdDate", "modifiedDate", "orderId", "merchantId", "merchantName", "loyaltyMerchantName", "originalMerchantName", "orderDate", "orderAmount", "imageAssetUrl", "userLoyaltyId", "receiptStatus", "receiptResultType", "receiptApprovalStatus", "pointGenerated", "reasonId", "reasonEn", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedDate", "()Ljava/lang/String;", "setCreatedDate", "(Ljava/lang/String;)V", "getId", "setId", "getImageAssetUrl", "setImageAssetUrl", "getLoyaltyMerchantName", "setLoyaltyMerchantName", "getMerchantId", "setMerchantId", "getMerchantName", "setMerchantName", "getModifiedDate", "setModifiedDate", "getOrderAmount", "setOrderAmount", "getOrderDate", "setOrderDate", "getOrderId", "setOrderId", "getOriginalMerchantName", "setOriginalMerchantName", "getPointGenerated", "setPointGenerated", "getReasonEn", "setReasonEn", "getReasonId", "setReasonId", "getReceiptApprovalStatus", "setReceiptApprovalStatus", "getReceiptResultType", "setReceiptResultType", "getReceiptStatus", "setReceiptStatus", "getUserLoyaltyId", "setUserLoyaltyId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class com_alibaba_ariver_app_api_ExtOpt$88$1 {
    @NotNull
    private String createdDate;
    @NotNull

    /* renamed from: id  reason: collision with root package name */
    private String f11082id;
    @Nullable
    private String imageAssetUrl;
    @Nullable
    private String loyaltyMerchantName;
    @Nullable
    private String merchantId;
    @Nullable
    private String merchantName;
    @NotNull
    private String modifiedDate;
    @Nullable
    private String orderAmount;
    @Nullable
    private String orderDate;
    @Nullable
    private String orderId;
    @Nullable
    private String originalMerchantName;
    @Nullable
    private String pointGenerated;
    @Nullable
    private String reasonEn;
    @Nullable
    private String reasonId;
    @Nullable
    private String receiptApprovalStatus;
    @Nullable
    private String receiptResultType;
    @Nullable
    private String receiptStatus;
    @Nullable
    private String userLoyaltyId;

    public static /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$88$1 copy$default(com_alibaba_ariver_app_api_ExtOpt$88$1 com_alibaba_ariver_app_api_extopt_88_1, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, Object obj) {
        com_alibaba_ariver_app_api_ExtOpt$88$1 com_alibaba_ariver_app_api_extopt_88_12 = com_alibaba_ariver_app_api_extopt_88_1;
        int i2 = i;
        return com_alibaba_ariver_app_api_extopt_88_1.copy((i2 & 1) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.f11082id : str, (i2 & 2) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.createdDate : str2, (i2 & 4) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.modifiedDate : str3, (i2 & 8) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.orderId : str4, (i2 & 16) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.merchantId : str5, (i2 & 32) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.merchantName : str6, (i2 & 64) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.loyaltyMerchantName : str7, (i2 & 128) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.originalMerchantName : str8, (i2 & 256) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.orderDate : str9, (i2 & 512) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.orderAmount : str10, (i2 & 1024) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.imageAssetUrl : str11, (i2 & 2048) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.userLoyaltyId : str12, (i2 & 4096) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.receiptStatus : str13, (i2 & 8192) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.receiptResultType : str14, (i2 & 16384) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.receiptApprovalStatus : str15, (i2 & 32768) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.pointGenerated : str16, (i2 & 65536) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.reasonId : str17, (i2 & 131072) != 0 ? com_alibaba_ariver_app_api_extopt_88_12.reasonEn : str18);
    }

    @NotNull
    public final String component1() {
        return this.f11082id;
    }

    @Nullable
    public final String component10() {
        return this.orderAmount;
    }

    @Nullable
    public final String component11() {
        return this.imageAssetUrl;
    }

    @Nullable
    public final String component12() {
        return this.userLoyaltyId;
    }

    @Nullable
    public final String component13() {
        return this.receiptStatus;
    }

    @Nullable
    public final String component14() {
        return this.receiptResultType;
    }

    @Nullable
    public final String component15() {
        return this.receiptApprovalStatus;
    }

    @Nullable
    public final String component16() {
        return this.pointGenerated;
    }

    @Nullable
    public final String component17() {
        return this.reasonId;
    }

    @Nullable
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

    @Nullable
    public final String component4() {
        return this.orderId;
    }

    @Nullable
    public final String component5() {
        return this.merchantId;
    }

    @Nullable
    public final String component6() {
        return this.merchantName;
    }

    @Nullable
    public final String component7() {
        return this.loyaltyMerchantName;
    }

    @Nullable
    public final String component8() {
        return this.originalMerchantName;
    }

    @Nullable
    public final String component9() {
        return this.orderDate;
    }

    @NotNull
    public final com_alibaba_ariver_app_api_ExtOpt$88$1 copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18) {
        String str19 = str;
        Intrinsics.checkNotNullParameter(str19, "id");
        Intrinsics.checkNotNullParameter(str2, "createdDate");
        Intrinsics.checkNotNullParameter(str3, "modifiedDate");
        return new com_alibaba_ariver_app_api_ExtOpt$88$1(str19, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com_alibaba_ariver_app_api_ExtOpt$88$1)) {
            return false;
        }
        com_alibaba_ariver_app_api_ExtOpt$88$1 com_alibaba_ariver_app_api_extopt_88_1 = (com_alibaba_ariver_app_api_ExtOpt$88$1) obj;
        return Intrinsics.areEqual((Object) this.f11082id, (Object) com_alibaba_ariver_app_api_extopt_88_1.f11082id) && Intrinsics.areEqual((Object) this.createdDate, (Object) com_alibaba_ariver_app_api_extopt_88_1.createdDate) && Intrinsics.areEqual((Object) this.modifiedDate, (Object) com_alibaba_ariver_app_api_extopt_88_1.modifiedDate) && Intrinsics.areEqual((Object) this.orderId, (Object) com_alibaba_ariver_app_api_extopt_88_1.orderId) && Intrinsics.areEqual((Object) this.merchantId, (Object) com_alibaba_ariver_app_api_extopt_88_1.merchantId) && Intrinsics.areEqual((Object) this.merchantName, (Object) com_alibaba_ariver_app_api_extopt_88_1.merchantName) && Intrinsics.areEqual((Object) this.loyaltyMerchantName, (Object) com_alibaba_ariver_app_api_extopt_88_1.loyaltyMerchantName) && Intrinsics.areEqual((Object) this.originalMerchantName, (Object) com_alibaba_ariver_app_api_extopt_88_1.originalMerchantName) && Intrinsics.areEqual((Object) this.orderDate, (Object) com_alibaba_ariver_app_api_extopt_88_1.orderDate) && Intrinsics.areEqual((Object) this.orderAmount, (Object) com_alibaba_ariver_app_api_extopt_88_1.orderAmount) && Intrinsics.areEqual((Object) this.imageAssetUrl, (Object) com_alibaba_ariver_app_api_extopt_88_1.imageAssetUrl) && Intrinsics.areEqual((Object) this.userLoyaltyId, (Object) com_alibaba_ariver_app_api_extopt_88_1.userLoyaltyId) && Intrinsics.areEqual((Object) this.receiptStatus, (Object) com_alibaba_ariver_app_api_extopt_88_1.receiptStatus) && Intrinsics.areEqual((Object) this.receiptResultType, (Object) com_alibaba_ariver_app_api_extopt_88_1.receiptResultType) && Intrinsics.areEqual((Object) this.receiptApprovalStatus, (Object) com_alibaba_ariver_app_api_extopt_88_1.receiptApprovalStatus) && Intrinsics.areEqual((Object) this.pointGenerated, (Object) com_alibaba_ariver_app_api_extopt_88_1.pointGenerated) && Intrinsics.areEqual((Object) this.reasonId, (Object) com_alibaba_ariver_app_api_extopt_88_1.reasonId) && Intrinsics.areEqual((Object) this.reasonEn, (Object) com_alibaba_ariver_app_api_extopt_88_1.reasonEn);
    }

    public final int hashCode() {
        String str = this.f11082id;
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
        StringBuilder sb = new StringBuilder("SubmitReceiptResponse(id=");
        sb.append(this.f11082id);
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

    public com_alibaba_ariver_app_api_ExtOpt$88$1(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "createdDate");
        Intrinsics.checkNotNullParameter(str3, "modifiedDate");
        this.f11082id = str;
        this.createdDate = str2;
        this.modifiedDate = str3;
        this.orderId = str4;
        this.merchantId = str5;
        this.merchantName = str6;
        this.loyaltyMerchantName = str7;
        this.originalMerchantName = str8;
        this.orderDate = str9;
        this.orderAmount = str10;
        this.imageAssetUrl = str11;
        this.userLoyaltyId = str12;
        this.receiptStatus = str13;
        this.receiptResultType = str14;
        this.receiptApprovalStatus = str15;
        this.pointGenerated = str16;
        this.reasonId = str17;
        this.reasonEn = str18;
    }

    @NotNull
    public final String getId() {
        return this.f11082id;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f11082id = str;
    }

    @NotNull
    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final void setCreatedDate(@NotNull String str) {
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

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    @Nullable
    public final String getMerchantId() {
        return this.merchantId;
    }

    public final void setMerchantId(@Nullable String str) {
        this.merchantId = str;
    }

    @Nullable
    public final String getMerchantName() {
        return this.merchantName;
    }

    public final void setMerchantName(@Nullable String str) {
        this.merchantName = str;
    }

    @Nullable
    public final String getLoyaltyMerchantName() {
        return this.loyaltyMerchantName;
    }

    public final void setLoyaltyMerchantName(@Nullable String str) {
        this.loyaltyMerchantName = str;
    }

    @Nullable
    public final String getOriginalMerchantName() {
        return this.originalMerchantName;
    }

    public final void setOriginalMerchantName(@Nullable String str) {
        this.originalMerchantName = str;
    }

    @Nullable
    public final String getOrderDate() {
        return this.orderDate;
    }

    public final void setOrderDate(@Nullable String str) {
        this.orderDate = str;
    }

    @Nullable
    public final String getOrderAmount() {
        return this.orderAmount;
    }

    public final void setOrderAmount(@Nullable String str) {
        this.orderAmount = str;
    }

    @Nullable
    public final String getImageAssetUrl() {
        return this.imageAssetUrl;
    }

    public final void setImageAssetUrl(@Nullable String str) {
        this.imageAssetUrl = str;
    }

    @Nullable
    public final String getUserLoyaltyId() {
        return this.userLoyaltyId;
    }

    public final void setUserLoyaltyId(@Nullable String str) {
        this.userLoyaltyId = str;
    }

    @Nullable
    public final String getReceiptStatus() {
        return this.receiptStatus;
    }

    public final void setReceiptStatus(@Nullable String str) {
        this.receiptStatus = str;
    }

    @Nullable
    public final String getReceiptResultType() {
        return this.receiptResultType;
    }

    public final void setReceiptResultType(@Nullable String str) {
        this.receiptResultType = str;
    }

    @Nullable
    public final String getReceiptApprovalStatus() {
        return this.receiptApprovalStatus;
    }

    public final void setReceiptApprovalStatus(@Nullable String str) {
        this.receiptApprovalStatus = str;
    }

    @Nullable
    public final String getPointGenerated() {
        return this.pointGenerated;
    }

    public final void setPointGenerated(@Nullable String str) {
        this.pointGenerated = str;
    }

    @Nullable
    public final String getReasonId() {
        return this.reasonId;
    }

    public final void setReasonId(@Nullable String str) {
        this.reasonId = str;
    }

    @Nullable
    public final String getReasonEn() {
        return this.reasonEn;
    }

    public final void setReasonEn(@Nullable String str) {
        this.reasonEn = str;
    }
}
