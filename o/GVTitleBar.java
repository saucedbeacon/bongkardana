package o;

import java.util.List;
import kotlin.Metadata;
import o.SplashEntryInfo;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lid/dana/domain/auth/face/result/FaceAuthenticationResult;", "Lid/dana/domain/model/rpc/response/BaseRpcResponse;", "()V", "action", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "riskResult", "getRiskResult", "setRiskResult", "securityContext", "Lid/dana/domain/auth/face/result/SecurityContext;", "getSecurityContext", "()Lid/dana/domain/auth/face/result/SecurityContext;", "setSecurityContext", "(Lid/dana/domain/auth/face/result/SecurityContext;)V", "securityId", "getSecurityId", "setSecurityId", "verificationMethods", "", "Lid/dana/domain/auth/face/result/VerificationMethodInfo;", "getVerificationMethods", "()Ljava/util/List;", "setVerificationMethods", "(Ljava/util/List;)V", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GVTitleBar extends initWithSecurityGuard {
    @Nullable
    private String action;
    @Nullable
    private String riskResult;
    @Nullable
    private SplashEntryInfo.AnonymousClass1 securityContext;
    @Nullable
    private String securityId;
    @Nullable
    private List<GVTabBar> verificationMethods;

    @Nullable
    public final String getSecurityId() {
        return this.securityId;
    }

    public final void setSecurityId(@Nullable String str) {
        this.securityId = str;
    }

    @Nullable
    public final String getRiskResult() {
        return this.riskResult;
    }

    public final void setRiskResult(@Nullable String str) {
        this.riskResult = str;
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    public final void setAction(@Nullable String str) {
        this.action = str;
    }

    @Nullable
    public final List<GVTabBar> getVerificationMethods() {
        return this.verificationMethods;
    }

    public final void setVerificationMethods(@Nullable List<GVTabBar> list) {
        this.verificationMethods = list;
    }

    @Nullable
    public final SplashEntryInfo.AnonymousClass1 getSecurityContext() {
        return this.securityContext;
    }

    public final void setSecurityContext(@Nullable SplashEntryInfo.AnonymousClass1 r1) {
        this.securityContext = r1;
    }
}
