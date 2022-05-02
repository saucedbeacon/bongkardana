package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lid/dana/domain/user/UserProfileResponse;", "", "success", "", "errorCode", "", "errorMessage", "(ZLjava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorMessage", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class disconnectAllDevices {
    @NotNull
    private final String errorCode;
    @NotNull
    private final String errorMessage;
    private final boolean success;

    public static /* synthetic */ disconnectAllDevices copy$default(disconnectAllDevices disconnectalldevices, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = disconnectalldevices.success;
        }
        if ((i & 2) != 0) {
            str = disconnectalldevices.errorCode;
        }
        if ((i & 4) != 0) {
            str2 = disconnectalldevices.errorMessage;
        }
        return disconnectalldevices.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.success;
    }

    @NotNull
    public final String component2() {
        return this.errorCode;
    }

    @NotNull
    public final String component3() {
        return this.errorMessage;
    }

    @NotNull
    public final disconnectAllDevices copy(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "errorCode");
        Intrinsics.checkNotNullParameter(str2, "errorMessage");
        return new disconnectAllDevices(z, str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof disconnectAllDevices)) {
            return false;
        }
        disconnectAllDevices disconnectalldevices = (disconnectAllDevices) obj;
        return this.success == disconnectalldevices.success && Intrinsics.areEqual((Object) this.errorCode, (Object) disconnectalldevices.errorCode) && Intrinsics.areEqual((Object) this.errorMessage, (Object) disconnectalldevices.errorMessage);
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
        StringBuilder sb = new StringBuilder("UserProfileResponse(success=");
        sb.append(this.success);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(")");
        return sb.toString();
    }

    public disconnectAllDevices(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "errorCode");
        Intrinsics.checkNotNullParameter(str2, "errorMessage");
        this.success = z;
        this.errorCode = str;
        this.errorMessage = str2;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
