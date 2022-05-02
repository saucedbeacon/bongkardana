package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lid/dana/domain/otp/model/VerifyOtpRiskResponse;", "", "success", "", "errorCode", "", "errorMessage", "(ZLjava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "getErrorMessage", "setErrorMessage", "getSuccess", "()Z", "setSuccess", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class filterBundle {
    @Nullable
    private String errorCode;
    @Nullable
    private String errorMessage;
    private boolean success;

    public filterBundle() {
        this(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ filterBundle copy$default(filterBundle filterbundle, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = filterbundle.success;
        }
        if ((i & 2) != 0) {
            str = filterbundle.errorCode;
        }
        if ((i & 4) != 0) {
            str2 = filterbundle.errorMessage;
        }
        return filterbundle.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.success;
    }

    @Nullable
    public final String component2() {
        return this.errorCode;
    }

    @Nullable
    public final String component3() {
        return this.errorMessage;
    }

    @NotNull
    public final filterBundle copy(boolean z, @Nullable String str, @Nullable String str2) {
        return new filterBundle(z, str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof filterBundle)) {
            return false;
        }
        filterBundle filterbundle = (filterBundle) obj;
        return this.success == filterbundle.success && Intrinsics.areEqual((Object) this.errorCode, (Object) filterbundle.errorCode) && Intrinsics.areEqual((Object) this.errorMessage, (Object) filterbundle.errorMessage);
    }

    public final int hashCode() {
        boolean z = this.success;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.errorCode;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.errorMessage;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyOtpRiskResponse(success=");
        sb.append(this.success);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(")");
        return sb.toString();
    }

    public filterBundle(boolean z, @Nullable String str, @Nullable String str2) {
        this.success = z;
        this.errorCode = str;
        this.errorMessage = str2;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    public final void setErrorCode(@Nullable String str) {
        this.errorCode = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ filterBundle(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final void setErrorMessage(@Nullable String str) {
        this.errorMessage = str;
    }
}
