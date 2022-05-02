package o;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.utils.deeplink.DeepLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lid/dana/domain/loyalty/model/ReceiptLoyalty;", "", "orderId", "", "merchantName", "orderAmount", "timestamp", "rawText", "merchantId", "userLoyaltyId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMerchantId", "()Ljava/lang/String;", "getMerchantName", "getOrderAmount", "getOrderId", "getRawText", "getTimestamp", "getUserLoyaltyId", "domain_release"}, k = 1, mv = {1, 4, 2})
public class exception {
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

    public exception(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, DeepLinkConstant.DeepLinkParams.ORDER_ID);
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str3, "orderAmount");
        Intrinsics.checkNotNullParameter(str4, TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP);
        Intrinsics.checkNotNullParameter(str5, "rawText");
        Intrinsics.checkNotNullParameter(str6, "merchantId");
        Intrinsics.checkNotNullParameter(str7, "userLoyaltyId");
        this.orderId = str;
        this.merchantName = str2;
        this.orderAmount = str3;
        this.timestamp = str4;
        this.rawText = str5;
        this.merchantId = str6;
        this.userLoyaltyId = str7;
    }

    @NotNull
    public String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    public String getOrderAmount() {
        return this.orderAmount;
    }

    @NotNull
    public String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public String getRawText() {
        return this.rawText;
    }

    @NotNull
    public String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    public String getUserLoyaltyId() {
        return this.userLoyaltyId;
    }
}
