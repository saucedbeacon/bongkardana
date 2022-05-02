package o;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lid/dana/domain/miniprogram/model/Address;", "", "label", "", "latitude", "longitude", "addressLine", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressLine", "()Ljava/lang/String;", "getLabel", "getLatitude", "getLongitude", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class processFacade {
    @NotNull
    private final String addressLine;
    @NotNull
    private final String label;
    @NotNull
    private final String latitude;
    @NotNull
    private final String longitude;

    public static /* synthetic */ processFacade copy$default(processFacade processfacade, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = processfacade.label;
        }
        if ((i & 2) != 0) {
            str2 = processfacade.latitude;
        }
        if ((i & 4) != 0) {
            str3 = processfacade.longitude;
        }
        if ((i & 8) != 0) {
            str4 = processfacade.addressLine;
        }
        return processfacade.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.label;
    }

    @NotNull
    public final String component2() {
        return this.latitude;
    }

    @NotNull
    public final String component3() {
        return this.longitude;
    }

    @NotNull
    public final String component4() {
        return this.addressLine;
    }

    @NotNull
    public final processFacade copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, Constants.ScionAnalytics.PARAM_LABEL);
        Intrinsics.checkNotNullParameter(str2, "latitude");
        Intrinsics.checkNotNullParameter(str3, "longitude");
        Intrinsics.checkNotNullParameter(str4, "addressLine");
        return new processFacade(str, str2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof processFacade)) {
            return false;
        }
        processFacade processfacade = (processFacade) obj;
        return Intrinsics.areEqual((Object) this.label, (Object) processfacade.label) && Intrinsics.areEqual((Object) this.latitude, (Object) processfacade.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) processfacade.longitude) && Intrinsics.areEqual((Object) this.addressLine, (Object) processfacade.addressLine);
    }

    public final int hashCode() {
        String str = this.label;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.latitude;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.longitude;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.addressLine;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Address(label=");
        sb.append(this.label);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", addressLine=");
        sb.append(this.addressLine);
        sb.append(")");
        return sb.toString();
    }

    public processFacade(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, Constants.ScionAnalytics.PARAM_LABEL);
        Intrinsics.checkNotNullParameter(str2, "latitude");
        Intrinsics.checkNotNullParameter(str3, "longitude");
        Intrinsics.checkNotNullParameter(str4, "addressLine");
        this.label = str;
        this.latitude = str2;
        this.longitude = str3;
        this.addressLine = str4;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final String getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final String getAddressLine() {
        return this.addressLine;
    }
}
