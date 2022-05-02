package o;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.utils.deeplink.DeepLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006%"}, d2 = {"Lid/dana/domain/loyalty/model/FileOcrReceiptLoyalty;", "Lid/dana/domain/loyalty/model/ReceiptLoyalty;", "orderId", "", "merchantName", "orderAmount", "timestamp", "rawText", "merchantId", "userLoyaltyId", "filePath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "getMerchantId", "getMerchantName", "getOrderAmount", "getOrderId", "getRawText", "getTimestamp", "getUserLoyaltyId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class code extends exception {
    @NotNull
    private final String filePath;
    @NotNull
    private final String merchantId;
    @NotNull
    private final String merchantName;
    @NotNull
    private final String orderAmount;
    @NotNull
    private final String orderId;
    @NotNull
    private final String rawText;
    @NotNull
    private final String timestamp;
    @NotNull
    private final String userLoyaltyId;

    public static /* synthetic */ code copy$default(code code, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        int i2 = i;
        String orderId2 = (i2 & 1) != 0 ? code.getOrderId() : str;
        String merchantName2 = (i2 & 2) != 0 ? code.getMerchantName() : str2;
        String orderAmount2 = (i2 & 4) != 0 ? code.getOrderAmount() : str3;
        String timestamp2 = (i2 & 8) != 0 ? code.getTimestamp() : str4;
        String rawText2 = (i2 & 16) != 0 ? code.getRawText() : str5;
        String merchantId2 = (i2 & 32) != 0 ? code.getMerchantId() : str6;
        String userLoyaltyId2 = (i2 & 64) != 0 ? code.getUserLoyaltyId() : str7;
        if ((i2 & 128) != 0) {
            str9 = code.filePath;
        } else {
            code code2 = code;
            str9 = str8;
        }
        return code.copy(orderId2, merchantName2, orderAmount2, timestamp2, rawText2, merchantId2, userLoyaltyId2, str9);
    }

    @NotNull
    public final String component1() {
        return getOrderId();
    }

    @NotNull
    public final String component2() {
        return getMerchantName();
    }

    @NotNull
    public final String component3() {
        return getOrderAmount();
    }

    @NotNull
    public final String component4() {
        return getTimestamp();
    }

    @NotNull
    public final String component5() {
        return getRawText();
    }

    @NotNull
    public final String component6() {
        return getMerchantId();
    }

    @NotNull
    public final String component7() {
        return getUserLoyaltyId();
    }

    @NotNull
    public final String component8() {
        return this.filePath;
    }

    @NotNull
    public final code copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, DeepLinkConstant.DeepLinkParams.ORDER_ID);
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str3, "orderAmount");
        Intrinsics.checkNotNullParameter(str4, TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP);
        Intrinsics.checkNotNullParameter(str5, "rawText");
        String str9 = str6;
        Intrinsics.checkNotNullParameter(str9, "merchantId");
        String str10 = str7;
        Intrinsics.checkNotNullParameter(str10, "userLoyaltyId");
        String str11 = str8;
        Intrinsics.checkNotNullParameter(str11, "filePath");
        return new code(str, str2, str3, str4, str5, str9, str10, str11);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof code)) {
            return false;
        }
        code code = (code) obj;
        return Intrinsics.areEqual((Object) getOrderId(), (Object) code.getOrderId()) && Intrinsics.areEqual((Object) getMerchantName(), (Object) code.getMerchantName()) && Intrinsics.areEqual((Object) getOrderAmount(), (Object) code.getOrderAmount()) && Intrinsics.areEqual((Object) getTimestamp(), (Object) code.getTimestamp()) && Intrinsics.areEqual((Object) getRawText(), (Object) code.getRawText()) && Intrinsics.areEqual((Object) getMerchantId(), (Object) code.getMerchantId()) && Intrinsics.areEqual((Object) getUserLoyaltyId(), (Object) code.getUserLoyaltyId()) && Intrinsics.areEqual((Object) this.filePath, (Object) code.filePath);
    }

    public final int hashCode() {
        String orderId2 = getOrderId();
        int i = 0;
        int hashCode = (orderId2 != null ? orderId2.hashCode() : 0) * 31;
        String merchantName2 = getMerchantName();
        int hashCode2 = (hashCode + (merchantName2 != null ? merchantName2.hashCode() : 0)) * 31;
        String orderAmount2 = getOrderAmount();
        int hashCode3 = (hashCode2 + (orderAmount2 != null ? orderAmount2.hashCode() : 0)) * 31;
        String timestamp2 = getTimestamp();
        int hashCode4 = (hashCode3 + (timestamp2 != null ? timestamp2.hashCode() : 0)) * 31;
        String rawText2 = getRawText();
        int hashCode5 = (hashCode4 + (rawText2 != null ? rawText2.hashCode() : 0)) * 31;
        String merchantId2 = getMerchantId();
        int hashCode6 = (hashCode5 + (merchantId2 != null ? merchantId2.hashCode() : 0)) * 31;
        String userLoyaltyId2 = getUserLoyaltyId();
        int hashCode7 = (hashCode6 + (userLoyaltyId2 != null ? userLoyaltyId2.hashCode() : 0)) * 31;
        String str = this.filePath;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FileOcrReceiptLoyalty(orderId=");
        sb.append(getOrderId());
        sb.append(", merchantName=");
        sb.append(getMerchantName());
        sb.append(", orderAmount=");
        sb.append(getOrderAmount());
        sb.append(", timestamp=");
        sb.append(getTimestamp());
        sb.append(", rawText=");
        sb.append(getRawText());
        sb.append(", merchantId=");
        sb.append(getMerchantId());
        sb.append(", userLoyaltyId=");
        sb.append(getUserLoyaltyId());
        sb.append(", filePath=");
        sb.append(this.filePath);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    public final String getOrderAmount() {
        return this.orderAmount;
    }

    @NotNull
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getRawText() {
        return this.rawText;
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    public final String getUserLoyaltyId() {
        return this.userLoyaltyId;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public code(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        super(str, str2, str3, str4, str5, str6, str7);
        Intrinsics.checkNotNullParameter(str, DeepLinkConstant.DeepLinkParams.ORDER_ID);
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str3, "orderAmount");
        Intrinsics.checkNotNullParameter(str4, TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP);
        Intrinsics.checkNotNullParameter(str5, "rawText");
        Intrinsics.checkNotNullParameter(str6, "merchantId");
        Intrinsics.checkNotNullParameter(str7, "userLoyaltyId");
        Intrinsics.checkNotNullParameter(str8, "filePath");
        this.orderId = str;
        this.merchantName = str2;
        this.orderAmount = str3;
        this.timestamp = str4;
        this.rawText = str5;
        this.merchantId = str6;
        this.userLoyaltyId = str7;
        this.filePath = str8;
    }
}
