package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lid/dana/data/autoroute/model/UserAutoRouteConfigSwitchResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "riskResult", "Lid/dana/data/autoroute/model/RiskResult;", "securityContext", "Lid/dana/data/autoroute/model/SecurityContextResult;", "attributes", "Lid/dana/data/autoroute/model/UserAutoRouteSwitchAttributeResult;", "(Lid/dana/data/autoroute/model/RiskResult;Lid/dana/data/autoroute/model/SecurityContextResult;Lid/dana/data/autoroute/model/UserAutoRouteSwitchAttributeResult;)V", "getAttributes", "()Lid/dana/data/autoroute/model/UserAutoRouteSwitchAttributeResult;", "setAttributes", "(Lid/dana/data/autoroute/model/UserAutoRouteSwitchAttributeResult;)V", "getRiskResult", "()Lid/dana/data/autoroute/model/RiskResult;", "setRiskResult", "(Lid/dana/data/autoroute/model/RiskResult;)V", "getSecurityContext", "()Lid/dana/data/autoroute/model/SecurityContextResult;", "setSecurityContext", "(Lid/dana/data/autoroute/model/SecurityContextResult;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setIgnoreDisabledSystemAnimations extends BaseRpcResult {
    @Nullable
    private isMergePathsEnabledForKitKatAndAbove attributes;
    @Nullable
    private setGravityEndCompat riskResult;
    @Nullable
    private getLastWidth securityContext;

    public setIgnoreDisabledSystemAnimations() {
        this((setGravityEndCompat) null, (getLastWidth) null, (isMergePathsEnabledForKitKatAndAbove) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setIgnoreDisabledSystemAnimations copy$default(setIgnoreDisabledSystemAnimations setignoredisabledsystemanimations, setGravityEndCompat setgravityendcompat, getLastWidth getlastwidth, isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, int i, Object obj) {
        if ((i & 1) != 0) {
            setgravityendcompat = setignoredisabledsystemanimations.riskResult;
        }
        if ((i & 2) != 0) {
            getlastwidth = setignoredisabledsystemanimations.securityContext;
        }
        if ((i & 4) != 0) {
            ismergepathsenabledforkitkatandabove = setignoredisabledsystemanimations.attributes;
        }
        return setignoredisabledsystemanimations.copy(setgravityendcompat, getlastwidth, ismergepathsenabledforkitkatandabove);
    }

    @Nullable
    public final setGravityEndCompat component1() {
        return this.riskResult;
    }

    @Nullable
    public final getLastWidth component2() {
        return this.securityContext;
    }

    @Nullable
    public final isMergePathsEnabledForKitKatAndAbove component3() {
        return this.attributes;
    }

    @NotNull
    public final setIgnoreDisabledSystemAnimations copy(@Nullable setGravityEndCompat setgravityendcompat, @Nullable getLastWidth getlastwidth, @Nullable isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove) {
        return new setIgnoreDisabledSystemAnimations(setgravityendcompat, getlastwidth, ismergepathsenabledforkitkatandabove);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setIgnoreDisabledSystemAnimations)) {
            return false;
        }
        setIgnoreDisabledSystemAnimations setignoredisabledsystemanimations = (setIgnoreDisabledSystemAnimations) obj;
        return Intrinsics.areEqual((Object) this.riskResult, (Object) setignoredisabledsystemanimations.riskResult) && Intrinsics.areEqual((Object) this.securityContext, (Object) setignoredisabledsystemanimations.securityContext) && Intrinsics.areEqual((Object) this.attributes, (Object) setignoredisabledsystemanimations.attributes);
    }

    public final int hashCode() {
        setGravityEndCompat setgravityendcompat = this.riskResult;
        int i = 0;
        int hashCode = (setgravityendcompat != null ? setgravityendcompat.hashCode() : 0) * 31;
        getLastWidth getlastwidth = this.securityContext;
        int hashCode2 = (hashCode + (getlastwidth != null ? getlastwidth.hashCode() : 0)) * 31;
        isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove = this.attributes;
        if (ismergepathsenabledforkitkatandabove != null) {
            i = ismergepathsenabledforkitkatandabove.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAutoRouteConfigSwitchResult(riskResult=");
        sb.append(this.riskResult);
        sb.append(", securityContext=");
        sb.append(this.securityContext);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final setGravityEndCompat getRiskResult() {
        return this.riskResult;
    }

    public final void setRiskResult(@Nullable setGravityEndCompat setgravityendcompat) {
        this.riskResult = setgravityendcompat;
    }

    @Nullable
    public final getLastWidth getSecurityContext() {
        return this.securityContext;
    }

    public final void setSecurityContext(@Nullable getLastWidth getlastwidth) {
        this.securityContext = getlastwidth;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setIgnoreDisabledSystemAnimations(setGravityEndCompat setgravityendcompat, getLastWidth getlastwidth, isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : setgravityendcompat, (i & 2) != 0 ? null : getlastwidth, (i & 4) != 0 ? null : ismergepathsenabledforkitkatandabove);
    }

    @Nullable
    public final isMergePathsEnabledForKitKatAndAbove getAttributes() {
        return this.attributes;
    }

    public final void setAttributes(@Nullable isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove) {
        this.attributes = ismergepathsenabledforkitkatandabove;
    }

    public setIgnoreDisabledSystemAnimations(@Nullable setGravityEndCompat setgravityendcompat, @Nullable getLastWidth getlastwidth, @Nullable isMergePathsEnabledForKitKatAndAbove ismergepathsenabledforkitkatandabove) {
        this.riskResult = setgravityendcompat;
        this.securityContext = getlastwidth;
        this.attributes = ismergepathsenabledforkitkatandabove;
    }
}
