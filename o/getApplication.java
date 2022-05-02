package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SplashEntryInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lid/dana/data/merchantmanagement/repository/source/network/result/UnbindConsultResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "securityContext", "Lid/dana/domain/auth/face/result/SecurityContext;", "securityId", "", "(Lid/dana/domain/auth/face/result/SecurityContext;Ljava/lang/String;)V", "getSecurityContext", "()Lid/dana/domain/auth/face/result/SecurityContext;", "setSecurityContext", "(Lid/dana/domain/auth/face/result/SecurityContext;)V", "getSecurityId", "()Ljava/lang/String;", "setSecurityId", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getApplication extends BaseRpcResult {
    @Nullable
    private SplashEntryInfo.AnonymousClass1 securityContext;
    @Nullable
    private String securityId;

    public getApplication() {
        this((SplashEntryInfo.AnonymousClass1) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getApplication copy$default(getApplication getapplication, SplashEntryInfo.AnonymousClass1 r1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            r1 = getapplication.securityContext;
        }
        if ((i & 2) != 0) {
            str = getapplication.securityId;
        }
        return getapplication.copy(r1, str);
    }

    @Nullable
    public final SplashEntryInfo.AnonymousClass1 component1() {
        return this.securityContext;
    }

    @Nullable
    public final String component2() {
        return this.securityId;
    }

    @NotNull
    public final getApplication copy(@Nullable SplashEntryInfo.AnonymousClass1 r2, @Nullable String str) {
        return new getApplication(r2, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getApplication)) {
            return false;
        }
        getApplication getapplication = (getApplication) obj;
        return Intrinsics.areEqual((Object) this.securityContext, (Object) getapplication.securityContext) && Intrinsics.areEqual((Object) this.securityId, (Object) getapplication.securityId);
    }

    public final int hashCode() {
        SplashEntryInfo.AnonymousClass1 r0 = this.securityContext;
        int i = 0;
        int hashCode = (r0 != null ? r0.hashCode() : 0) * 31;
        String str = this.securityId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UnbindConsultResult(securityContext=");
        sb.append(this.securityContext);
        sb.append(", securityId=");
        sb.append(this.securityId);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final SplashEntryInfo.AnonymousClass1 getSecurityContext() {
        return this.securityContext;
    }

    public final void setSecurityContext(@Nullable SplashEntryInfo.AnonymousClass1 r1) {
        this.securityContext = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getApplication(SplashEntryInfo.AnonymousClass1 r2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : r2, (i & 2) != 0 ? null : str);
    }

    @Nullable
    public final String getSecurityId() {
        return this.securityId;
    }

    public final void setSecurityId(@Nullable String str) {
        this.securityId = str;
    }

    public getApplication(@Nullable SplashEntryInfo.AnonymousClass1 r1, @Nullable String str) {
        this.securityContext = r1;
        this.securityId = str;
    }
}
