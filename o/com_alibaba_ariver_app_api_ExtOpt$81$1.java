package o;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.utils.deeplink.DeepLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006-"}, d2 = {"Lid/dana/data/loyalty/repository/source/network/request/SubmitReceiptRequest;", "", "orderId", "", "merchantName", "orderAmount", "timestamp", "receipt", "rawText", "merchantId", "userLoyaltyId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMerchantId", "()Ljava/lang/String;", "setMerchantId", "(Ljava/lang/String;)V", "getMerchantName", "setMerchantName", "getOrderAmount", "setOrderAmount", "getOrderId", "setOrderId", "getRawText", "setRawText", "getReceipt", "setReceipt", "getTimestamp", "setTimestamp", "getUserLoyaltyId", "setUserLoyaltyId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class com_alibaba_ariver_app_api_ExtOpt$81$1 {
    @NotNull
    private String merchantId;
    @NotNull
    private String merchantName;
    @NotNull
    private String orderAmount;
    @NotNull
    private String orderId;
    @NotNull
    private String rawText;
    @NotNull
    private String receipt;
    @NotNull
    private String timestamp;
    @NotNull
    private String userLoyaltyId;

    public static /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$81$1 copy$default(com_alibaba_ariver_app_api_ExtOpt$81$1 com_alibaba_ariver_app_api_extopt_81_1, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        com_alibaba_ariver_app_api_ExtOpt$81$1 com_alibaba_ariver_app_api_extopt_81_12 = com_alibaba_ariver_app_api_extopt_81_1;
        int i2 = i;
        return com_alibaba_ariver_app_api_extopt_81_1.copy((i2 & 1) != 0 ? com_alibaba_ariver_app_api_extopt_81_12.orderId : str, (i2 & 2) != 0 ? com_alibaba_ariver_app_api_extopt_81_12.merchantName : str2, (i2 & 4) != 0 ? com_alibaba_ariver_app_api_extopt_81_12.orderAmount : str3, (i2 & 8) != 0 ? com_alibaba_ariver_app_api_extopt_81_12.timestamp : str4, (i2 & 16) != 0 ? com_alibaba_ariver_app_api_extopt_81_12.receipt : str5, (i2 & 32) != 0 ? com_alibaba_ariver_app_api_extopt_81_12.rawText : str6, (i2 & 64) != 0 ? com_alibaba_ariver_app_api_extopt_81_12.merchantId : str7, (i2 & 128) != 0 ? com_alibaba_ariver_app_api_extopt_81_12.userLoyaltyId : str8);
    }

    @NotNull
    public final String component1() {
        return this.orderId;
    }

    @NotNull
    public final String component2() {
        return this.merchantName;
    }

    @NotNull
    public final String component3() {
        return this.orderAmount;
    }

    @NotNull
    public final String component4() {
        return this.timestamp;
    }

    @NotNull
    public final String component5() {
        return this.receipt;
    }

    @NotNull
    public final String component6() {
        return this.rawText;
    }

    @NotNull
    public final String component7() {
        return this.merchantId;
    }

    @NotNull
    public final String component8() {
        return this.userLoyaltyId;
    }

    @NotNull
    public final com_alibaba_ariver_app_api_ExtOpt$81$1 copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, DeepLinkConstant.DeepLinkParams.ORDER_ID);
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str3, "orderAmount");
        Intrinsics.checkNotNullParameter(str4, TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP);
        Intrinsics.checkNotNullParameter(str5, "receipt");
        String str9 = str6;
        Intrinsics.checkNotNullParameter(str9, "rawText");
        String str10 = str7;
        Intrinsics.checkNotNullParameter(str10, "merchantId");
        String str11 = str8;
        Intrinsics.checkNotNullParameter(str11, "userLoyaltyId");
        return new com_alibaba_ariver_app_api_ExtOpt$81$1(str, str2, str3, str4, str5, str9, str10, str11);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com_alibaba_ariver_app_api_ExtOpt$81$1)) {
            return false;
        }
        com_alibaba_ariver_app_api_ExtOpt$81$1 com_alibaba_ariver_app_api_extopt_81_1 = (com_alibaba_ariver_app_api_ExtOpt$81$1) obj;
        return Intrinsics.areEqual((Object) this.orderId, (Object) com_alibaba_ariver_app_api_extopt_81_1.orderId) && Intrinsics.areEqual((Object) this.merchantName, (Object) com_alibaba_ariver_app_api_extopt_81_1.merchantName) && Intrinsics.areEqual((Object) this.orderAmount, (Object) com_alibaba_ariver_app_api_extopt_81_1.orderAmount) && Intrinsics.areEqual((Object) this.timestamp, (Object) com_alibaba_ariver_app_api_extopt_81_1.timestamp) && Intrinsics.areEqual((Object) this.receipt, (Object) com_alibaba_ariver_app_api_extopt_81_1.receipt) && Intrinsics.areEqual((Object) this.rawText, (Object) com_alibaba_ariver_app_api_extopt_81_1.rawText) && Intrinsics.areEqual((Object) this.merchantId, (Object) com_alibaba_ariver_app_api_extopt_81_1.merchantId) && Intrinsics.areEqual((Object) this.userLoyaltyId, (Object) com_alibaba_ariver_app_api_extopt_81_1.userLoyaltyId);
    }

    public final int hashCode() {
        String str = this.orderId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.merchantName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.orderAmount;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.timestamp;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.receipt;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.rawText;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.merchantId;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.userLoyaltyId;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SubmitReceiptRequest(orderId=");
        sb.append(this.orderId);
        sb.append(", merchantName=");
        sb.append(this.merchantName);
        sb.append(", orderAmount=");
        sb.append(this.orderAmount);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", receipt=");
        sb.append(this.receipt);
        sb.append(", rawText=");
        sb.append(this.rawText);
        sb.append(", merchantId=");
        sb.append(this.merchantId);
        sb.append(", userLoyaltyId=");
        sb.append(this.userLoyaltyId);
        sb.append(")");
        return sb.toString();
    }

    public com_alibaba_ariver_app_api_ExtOpt$81$1(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, DeepLinkConstant.DeepLinkParams.ORDER_ID);
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str3, "orderAmount");
        Intrinsics.checkNotNullParameter(str4, TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP);
        Intrinsics.checkNotNullParameter(str5, "receipt");
        Intrinsics.checkNotNullParameter(str6, "rawText");
        Intrinsics.checkNotNullParameter(str7, "merchantId");
        Intrinsics.checkNotNullParameter(str8, "userLoyaltyId");
        this.orderId = str;
        this.merchantName = str2;
        this.orderAmount = str3;
        this.timestamp = str4;
        this.receipt = str5;
        this.rawText = str6;
        this.merchantId = str7;
        this.userLoyaltyId = str8;
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
    public final String getMerchantName() {
        return this.merchantName;
    }

    public final void setMerchantName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.merchantName = str;
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
    public final String getTimestamp() {
        return this.timestamp;
    }

    public final void setTimestamp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timestamp = str;
    }

    @NotNull
    public final String getReceipt() {
        return this.receipt;
    }

    public final void setReceipt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.receipt = str;
    }

    @NotNull
    public final String getRawText() {
        return this.rawText;
    }

    public final void setRawText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rawText = str;
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
    public final String getUserLoyaltyId() {
        return this.userLoyaltyId;
    }

    public final void setUserLoyaltyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userLoyaltyId = str;
    }
}
