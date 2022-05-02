package id.dana.lib.gcontainer.app.bridge.sendevent.sendmoney;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u001a"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/sendevent/sendmoney/CheckoutFinishEntity;", "", "isApiSuccess", "", "processingStatus", "", "transType", "(ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "setApiSuccess", "(Z)V", "getProcessingStatus", "()Ljava/lang/String;", "setProcessingStatus", "(Ljava/lang/String;)V", "getTransType", "setTransType", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
@Keep
public final class CheckoutFinishEntity {
    private boolean isApiSuccess;
    @Nullable
    private String processingStatus;
    @Nullable
    private String transType;

    @JSONCreator
    public CheckoutFinishEntity() {
        this(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CheckoutFinishEntity copy$default(CheckoutFinishEntity checkoutFinishEntity, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkoutFinishEntity.isApiSuccess;
        }
        if ((i & 2) != 0) {
            str = checkoutFinishEntity.processingStatus;
        }
        if ((i & 4) != 0) {
            str2 = checkoutFinishEntity.transType;
        }
        return checkoutFinishEntity.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.isApiSuccess;
    }

    @Nullable
    public final String component2() {
        return this.processingStatus;
    }

    @Nullable
    public final String component3() {
        return this.transType;
    }

    @NotNull
    public final CheckoutFinishEntity copy(boolean z, @Nullable String str, @Nullable String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-606319926, oncanceled);
            onCancelLoad.getMin(-606319926, oncanceled);
        }
        return new CheckoutFinishEntity(z, str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutFinishEntity)) {
            return false;
        }
        CheckoutFinishEntity checkoutFinishEntity = (CheckoutFinishEntity) obj;
        return this.isApiSuccess == checkoutFinishEntity.isApiSuccess && Intrinsics.areEqual((Object) this.processingStatus, (Object) checkoutFinishEntity.processingStatus) && Intrinsics.areEqual((Object) this.transType, (Object) checkoutFinishEntity.transType);
    }

    public final int hashCode() {
        boolean z = this.isApiSuccess;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.processingStatus;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.transType;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutFinishEntity(isApiSuccess=");
        sb.append(this.isApiSuccess);
        sb.append(", processingStatus=");
        sb.append(this.processingStatus);
        sb.append(", transType=");
        sb.append(this.transType);
        sb.append(")");
        return sb.toString();
    }

    @JSONCreator
    public CheckoutFinishEntity(boolean z, @Nullable String str, @Nullable String str2) {
        this.isApiSuccess = z;
        this.processingStatus = str;
        this.transType = str2;
    }

    public final boolean isApiSuccess() {
        return this.isApiSuccess;
    }

    public final void setApiSuccess(boolean z) {
        this.isApiSuccess = z;
    }

    @Nullable
    public final String getProcessingStatus() {
        return this.processingStatus;
    }

    public final void setProcessingStatus(@Nullable String str) {
        this.processingStatus = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckoutFinishEntity(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }
}
