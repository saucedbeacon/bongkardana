package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import o.maybeSetTextColor;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lid/dana/data/auth/face/repository/source/result/FaceAuthenticationEntityResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "()V", "action", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "identFailedCount", "", "getIdentFailedCount", "()Ljava/lang/Integer;", "setIdentFailedCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "maxFailedLimit", "getMaxFailedLimit", "setMaxFailedLimit", "riskResult", "getRiskResult", "setRiskResult", "securityContext", "Lid/dana/data/auth/face/repository/source/result/SecurityContextEntity;", "getSecurityContext", "()Lid/dana/data/auth/face/repository/source/result/SecurityContextEntity;", "setSecurityContext", "(Lid/dana/data/auth/face/repository/source/result/SecurityContextEntity;)V", "securityId", "getSecurityId", "setSecurityId", "verificationMethods", "", "Lid/dana/data/auth/face/repository/source/result/VerificationMethodInfoEntity;", "getVerificationMethods", "()Ljava/util/List;", "setVerificationMethods", "(Ljava/util/List;)V", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class textChanged extends BaseRpcResult {
    @Nullable
    private String action;
    @Nullable
    private Integer identFailedCount;
    @Nullable
    private Integer maxFailedLimit;
    @Nullable
    private String riskResult;
    @Nullable
    private ifNotZero securityContext;
    @Nullable
    private String securityId;
    @Nullable
    private List<maybeSetTextColor.Cdefault> verificationMethods;

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
    public final List<maybeSetTextColor.Cdefault> getVerificationMethods() {
        return this.verificationMethods;
    }

    public final void setVerificationMethods(@Nullable List<maybeSetTextColor.Cdefault> list) {
        this.verificationMethods = list;
    }

    @Nullable
    public final ifNotZero getSecurityContext() {
        return this.securityContext;
    }

    public final void setSecurityContext(@Nullable ifNotZero ifnotzero) {
        this.securityContext = ifnotzero;
    }

    @Nullable
    public final Integer getIdentFailedCount() {
        return this.identFailedCount;
    }

    public final void setIdentFailedCount(@Nullable Integer num) {
        this.identFailedCount = num;
    }

    @Nullable
    public final Integer getMaxFailedLimit() {
        return this.maxFailedLimit;
    }

    public final void setMaxFailedLimit(@Nullable Integer num) {
        this.maxFailedLimit = num;
    }
}
