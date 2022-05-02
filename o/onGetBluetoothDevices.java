package o;

import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/domain/useremailaddress/model/UserEmailAddress;", "", "userEmail", "", "verifyStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "getUserEmail", "()Ljava/lang/String;", "getVerifyStatus", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class onGetBluetoothDevices {
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @NotNull
    public static final String UNVERIFIED_EMAIL = "0";
    @NotNull
    private final String userEmail;
    @NotNull
    private final String verifyStatus;

    public static /* synthetic */ onGetBluetoothDevices copy$default(onGetBluetoothDevices ongetbluetoothdevices, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ongetbluetoothdevices.userEmail;
        }
        if ((i & 2) != 0) {
            str2 = ongetbluetoothdevices.verifyStatus;
        }
        return ongetbluetoothdevices.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.userEmail;
    }

    @NotNull
    public final String component2() {
        return this.verifyStatus;
    }

    @NotNull
    public final onGetBluetoothDevices copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, AppsFlyerProperties.USER_EMAIL);
        Intrinsics.checkNotNullParameter(str2, "verifyStatus");
        return new onGetBluetoothDevices(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onGetBluetoothDevices)) {
            return false;
        }
        onGetBluetoothDevices ongetbluetoothdevices = (onGetBluetoothDevices) obj;
        return Intrinsics.areEqual((Object) this.userEmail, (Object) ongetbluetoothdevices.userEmail) && Intrinsics.areEqual((Object) this.verifyStatus, (Object) ongetbluetoothdevices.verifyStatus);
    }

    public final int hashCode() {
        String str = this.userEmail;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.verifyStatus;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserEmailAddress(userEmail=");
        sb.append(this.userEmail);
        sb.append(", verifyStatus=");
        sb.append(this.verifyStatus);
        sb.append(")");
        return sb.toString();
    }

    public onGetBluetoothDevices(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, AppsFlyerProperties.USER_EMAIL);
        Intrinsics.checkNotNullParameter(str2, "verifyStatus");
        this.userEmail = str;
        this.verifyStatus = str2;
    }

    @NotNull
    public final String getUserEmail() {
        return this.userEmail;
    }

    @NotNull
    public final String getVerifyStatus() {
        return this.verifyStatus;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/domain/useremailaddress/model/UserEmailAddress$Companion;", "", "()V", "UNVERIFIED_EMAIL", "", "getUNVERIFIED_EMAIL", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getUNVERIFIED_EMAIL() {
            return onGetBluetoothDevices.UNVERIFIED_EMAIL;
        }
    }
}
