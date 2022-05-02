package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lid/dana/domain/autoroute/model/UserAutoRouteConfigSwitch;", "Lid/dana/domain/model/rpc/response/BaseRpcResponse;", "riskResult", "Lid/dana/domain/autoroute/model/Risk;", "securityContextResult", "Lid/dana/domain/autoroute/model/SecurityContext;", "(Lid/dana/domain/autoroute/model/Risk;Lid/dana/domain/autoroute/model/SecurityContext;)V", "getRiskResult", "()Lid/dana/domain/autoroute/model/Risk;", "setRiskResult", "(Lid/dana/domain/autoroute/model/Risk;)V", "getSecurityContextResult", "()Lid/dana/domain/autoroute/model/SecurityContext;", "setSecurityContextResult", "(Lid/dana/domain/autoroute/model/SecurityContext;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverGeoLocationExtension extends initWithSecurityGuard {
    @Nullable
    private GriverBackHomeButtonStyleExtension riskResult;
    @Nullable
    private onGeolocationPermissionsShowPrompt securityContextResult;

    public GriverGeoLocationExtension() {
        this((GriverBackHomeButtonStyleExtension) null, (onGeolocationPermissionsShowPrompt) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GriverGeoLocationExtension copy$default(GriverGeoLocationExtension griverGeoLocationExtension, GriverBackHomeButtonStyleExtension griverBackHomeButtonStyleExtension, onGeolocationPermissionsShowPrompt ongeolocationpermissionsshowprompt, int i, Object obj) {
        if ((i & 1) != 0) {
            griverBackHomeButtonStyleExtension = griverGeoLocationExtension.riskResult;
        }
        if ((i & 2) != 0) {
            ongeolocationpermissionsshowprompt = griverGeoLocationExtension.securityContextResult;
        }
        return griverGeoLocationExtension.copy(griverBackHomeButtonStyleExtension, ongeolocationpermissionsshowprompt);
    }

    @Nullable
    public final GriverBackHomeButtonStyleExtension component1() {
        return this.riskResult;
    }

    @Nullable
    public final onGeolocationPermissionsShowPrompt component2() {
        return this.securityContextResult;
    }

    @NotNull
    public final GriverGeoLocationExtension copy(@Nullable GriverBackHomeButtonStyleExtension griverBackHomeButtonStyleExtension, @Nullable onGeolocationPermissionsShowPrompt ongeolocationpermissionsshowprompt) {
        return new GriverGeoLocationExtension(griverBackHomeButtonStyleExtension, ongeolocationpermissionsshowprompt);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverGeoLocationExtension)) {
            return false;
        }
        GriverGeoLocationExtension griverGeoLocationExtension = (GriverGeoLocationExtension) obj;
        return Intrinsics.areEqual((Object) this.riskResult, (Object) griverGeoLocationExtension.riskResult) && Intrinsics.areEqual((Object) this.securityContextResult, (Object) griverGeoLocationExtension.securityContextResult);
    }

    public final int hashCode() {
        GriverBackHomeButtonStyleExtension griverBackHomeButtonStyleExtension = this.riskResult;
        int i = 0;
        int hashCode = (griverBackHomeButtonStyleExtension != null ? griverBackHomeButtonStyleExtension.hashCode() : 0) * 31;
        onGeolocationPermissionsShowPrompt ongeolocationpermissionsshowprompt = this.securityContextResult;
        if (ongeolocationpermissionsshowprompt != null) {
            i = ongeolocationpermissionsshowprompt.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAutoRouteConfigSwitch(riskResult=");
        sb.append(this.riskResult);
        sb.append(", securityContextResult=");
        sb.append(this.securityContextResult);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final GriverBackHomeButtonStyleExtension getRiskResult() {
        return this.riskResult;
    }

    public final void setRiskResult(@Nullable GriverBackHomeButtonStyleExtension griverBackHomeButtonStyleExtension) {
        this.riskResult = griverBackHomeButtonStyleExtension;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GriverGeoLocationExtension(GriverBackHomeButtonStyleExtension griverBackHomeButtonStyleExtension, onGeolocationPermissionsShowPrompt ongeolocationpermissionsshowprompt, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : griverBackHomeButtonStyleExtension, (i & 2) != 0 ? null : ongeolocationpermissionsshowprompt);
    }

    @Nullable
    public final onGeolocationPermissionsShowPrompt getSecurityContextResult() {
        return this.securityContextResult;
    }

    public final void setSecurityContextResult(@Nullable onGeolocationPermissionsShowPrompt ongeolocationpermissionsshowprompt) {
        this.securityContextResult = ongeolocationpermissionsshowprompt;
    }

    public GriverGeoLocationExtension(@Nullable GriverBackHomeButtonStyleExtension griverBackHomeButtonStyleExtension, @Nullable onGeolocationPermissionsShowPrompt ongeolocationpermissionsshowprompt) {
        this.riskResult = griverBackHomeButtonStyleExtension;
        this.securityContextResult = ongeolocationpermissionsshowprompt;
    }
}
