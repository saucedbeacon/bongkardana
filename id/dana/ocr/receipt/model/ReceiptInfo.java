package id.dana.ocr.receipt.model;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0006\u0010\u001a\u001a\u00020\u0016J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001e"}, d2 = {"Lid/dana/ocr/receipt/model/ReceiptInfo;", "", "merchantName", "", "billNumber", "timestamp", "amount", "rawText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getBillNumber", "getMerchantName", "getRawText", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "isFulfill", "toString", "Builder", "Companion", "library_release"}, k = 1, mv = {1, 1, 16})
public final class ReceiptInfo {
    public static final Companion IsOverlapping = new Companion((byte) 0);
    @NotNull
    public final String getMax;
    @NotNull
    public final String getMin;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    @NotNull
    public final String setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u001b"}, d2 = {"Lid/dana/ocr/receipt/model/ReceiptInfo$Builder;", "", "()V", "amount", "", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "billNumber", "getBillNumber", "setBillNumber", "date", "getDate", "setDate", "merchantName", "getMerchantName", "setMerchantName", "rawText", "getRawText", "setRawText", "time", "getTime", "setTime", "build", "Lid/dana/ocr/receipt/model/ReceiptInfo;", "makeTimestamp", "library_release"}, k = 1, mv = {1, 1, 16})
    public static final class Builder {
        @Nullable
        public String getMax;
        @Nullable
        public String getMin;
        @Nullable
        public String length;
        @Nullable
        public String setMax;
        @Nullable
        public String setMin;
        @Nullable
        public String toFloatRange;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiptInfo)) {
            return false;
        }
        ReceiptInfo receiptInfo = (ReceiptInfo) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) receiptInfo.setMin) && Intrinsics.areEqual((Object) this.setMax, (Object) receiptInfo.setMax) && Intrinsics.areEqual((Object) this.length, (Object) receiptInfo.length) && Intrinsics.areEqual((Object) this.getMin, (Object) receiptInfo.getMin) && Intrinsics.areEqual((Object) this.getMax, (Object) receiptInfo.getMax);
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMax;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.length;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.getMin;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.getMax;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReceiptInfo(merchantName=");
        sb.append(this.setMin);
        sb.append(", billNumber=");
        sb.append(this.setMax);
        sb.append(", timestamp=");
        sb.append(this.length);
        sb.append(", amount=");
        sb.append(this.getMin);
        sb.append(", rawText=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public ReceiptInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkParameterIsNotNull(str, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkParameterIsNotNull(str2, "billNumber");
        Intrinsics.checkParameterIsNotNull(str3, TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP);
        Intrinsics.checkParameterIsNotNull(str4, "amount");
        Intrinsics.checkParameterIsNotNull(str5, "rawText");
        this.setMin = str;
        this.setMax = str2;
        this.length = str3;
        this.getMin = str4;
        this.getMax = str5;
    }

    public final boolean setMin() {
        if (this.setMin.length() > 0) {
            if (this.setMax.length() > 0) {
                if (this.length.length() > 0) {
                    if (this.getMin.length() > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lid/dana/ocr/receipt/model/ReceiptInfo$Companion;", "", "()V", "newBuilder", "Lid/dana/ocr/receipt/model/ReceiptInfo$Builder;", "library_release"}, k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public static Builder getMin() {
            return new Builder();
        }
    }
}
