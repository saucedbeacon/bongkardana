package id.dana.data.h5event.sendmoney;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONCreator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006&"}, d2 = {"Lid/dana/data/h5event/sendmoney/CheckoutFinishEntity;", "", "apiSuccess", "", "processingStatus", "", "transType", "payQueryResponse", "Lid/dana/data/h5event/sendmoney/PayQueryResponse;", "transScenario", "(ZLjava/lang/String;Ljava/lang/String;Lid/dana/data/h5event/sendmoney/PayQueryResponse;Ljava/lang/String;)V", "getApiSuccess", "()Z", "setApiSuccess", "(Z)V", "getPayQueryResponse", "()Lid/dana/data/h5event/sendmoney/PayQueryResponse;", "setPayQueryResponse", "(Lid/dana/data/h5event/sendmoney/PayQueryResponse;)V", "getProcessingStatus", "()Ljava/lang/String;", "setProcessingStatus", "(Ljava/lang/String;)V", "getTransScenario", "setTransScenario", "getTransType", "setTransType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class CheckoutFinishEntity {
    public boolean apiSuccess;
    @Nullable
    public PayQueryResponse payQueryResponse;
    @Nullable
    public String processingStatus;
    @Nullable
    public String transScenario;
    @Nullable
    public String transType;

    @JSONCreator
    public CheckoutFinishEntity() {
        this(false, (String) null, (String) null, (PayQueryResponse) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CheckoutFinishEntity copy$default(CheckoutFinishEntity checkoutFinishEntity, boolean z, String str, String str2, PayQueryResponse payQueryResponse2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkoutFinishEntity.apiSuccess;
        }
        if ((i & 2) != 0) {
            str = checkoutFinishEntity.processingStatus;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = checkoutFinishEntity.transType;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            payQueryResponse2 = checkoutFinishEntity.payQueryResponse;
        }
        PayQueryResponse payQueryResponse3 = payQueryResponse2;
        if ((i & 16) != 0) {
            str3 = checkoutFinishEntity.transScenario;
        }
        return checkoutFinishEntity.copy(z, str4, str5, payQueryResponse3, str3);
    }

    public final boolean component1() {
        return this.apiSuccess;
    }

    @Nullable
    public final String component2() {
        return this.processingStatus;
    }

    @Nullable
    public final String component3() {
        return this.transType;
    }

    @Nullable
    public final PayQueryResponse component4() {
        return this.payQueryResponse;
    }

    @Nullable
    public final String component5() {
        return this.transScenario;
    }

    @NotNull
    public final CheckoutFinishEntity copy(boolean z, @Nullable String str, @Nullable String str2, @Nullable PayQueryResponse payQueryResponse2, @Nullable String str3) {
        return new CheckoutFinishEntity(z, str, str2, payQueryResponse2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutFinishEntity)) {
            return false;
        }
        CheckoutFinishEntity checkoutFinishEntity = (CheckoutFinishEntity) obj;
        return this.apiSuccess == checkoutFinishEntity.apiSuccess && Intrinsics.areEqual((Object) this.processingStatus, (Object) checkoutFinishEntity.processingStatus) && Intrinsics.areEqual((Object) this.transType, (Object) checkoutFinishEntity.transType) && Intrinsics.areEqual((Object) this.payQueryResponse, (Object) checkoutFinishEntity.payQueryResponse) && Intrinsics.areEqual((Object) this.transScenario, (Object) checkoutFinishEntity.transScenario);
    }

    public final int hashCode() {
        boolean z = this.apiSuccess;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.processingStatus;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.transType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        PayQueryResponse payQueryResponse2 = this.payQueryResponse;
        int hashCode3 = (hashCode2 + (payQueryResponse2 != null ? payQueryResponse2.hashCode() : 0)) * 31;
        String str3 = this.transScenario;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutFinishEntity(apiSuccess=");
        sb.append(this.apiSuccess);
        sb.append(", processingStatus=");
        sb.append(this.processingStatus);
        sb.append(", transType=");
        sb.append(this.transType);
        sb.append(", payQueryResponse=");
        sb.append(this.payQueryResponse);
        sb.append(", transScenario=");
        sb.append(this.transScenario);
        sb.append(")");
        return sb.toString();
    }

    @JSONCreator
    public CheckoutFinishEntity(boolean z, @Nullable String str, @Nullable String str2, @Nullable PayQueryResponse payQueryResponse2, @Nullable String str3) {
        this.apiSuccess = z;
        this.processingStatus = str;
        this.transType = str2;
        this.payQueryResponse = payQueryResponse2;
        this.transScenario = str3;
    }

    public final boolean getApiSuccess() {
        return this.apiSuccess;
    }

    public final void setApiSuccess(boolean z) {
        this.apiSuccess = z;
    }

    @Nullable
    public final String getProcessingStatus() {
        return this.processingStatus;
    }

    public final void setProcessingStatus(@Nullable String str) {
        this.processingStatus = str;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }

    @Nullable
    public final PayQueryResponse getPayQueryResponse() {
        return this.payQueryResponse;
    }

    public final void setPayQueryResponse(@Nullable PayQueryResponse payQueryResponse2) {
        this.payQueryResponse = payQueryResponse2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CheckoutFinishEntity(boolean r4, java.lang.String r5, java.lang.String r6, id.dana.data.h5event.sendmoney.PayQueryResponse r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0005
            r4 = 0
        L_0x0005:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto L_0x000c
            r10 = r0
            goto L_0x000d
        L_0x000c:
            r10 = r5
        L_0x000d:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            r1 = r0
            goto L_0x0014
        L_0x0013:
            r1 = r6
        L_0x0014:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            r2 = r0
            goto L_0x001b
        L_0x001a:
            r2 = r7
        L_0x001b:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r0 = r8
        L_0x0021:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r2
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.data.h5event.sendmoney.CheckoutFinishEntity.<init>(boolean, java.lang.String, java.lang.String, id.dana.data.h5event.sendmoney.PayQueryResponse, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getTransScenario() {
        return this.transScenario;
    }

    public final void setTransScenario(@Nullable String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-429456743, oncanceled);
            onCancelLoad.getMin(-429456743, oncanceled);
        }
        this.transScenario = str;
    }
}
