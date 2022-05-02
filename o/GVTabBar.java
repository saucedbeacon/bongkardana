package o;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lid/dana/domain/auth/face/result/VerificationMethodInfo;", "", "()V", "priority", "", "getPriority", "()Ljava/lang/Integer;", "setPriority", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "verificationMethod", "", "getVerificationMethod", "()Ljava/lang/String;", "setVerificationMethod", "(Ljava/lang/String;)V", "verificationMethodCode", "getVerificationMethodCode", "setVerificationMethodCode", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GVTabBar {
    @Nullable
    private Integer priority = 0;
    @Nullable
    private String verificationMethod;
    @Nullable
    private String verificationMethodCode;

    @Nullable
    public final Integer getPriority() {
        return this.priority;
    }

    public final void setPriority(@Nullable Integer num) {
        this.priority = num;
    }

    @Nullable
    public final String getVerificationMethod() {
        return this.verificationMethod;
    }

    public final void setVerificationMethod(@Nullable String str) {
        this.verificationMethod = str;
    }

    @Nullable
    public final String getVerificationMethodCode() {
        return this.verificationMethodCode;
    }

    public final void setVerificationMethodCode(@Nullable String str) {
        this.verificationMethodCode = str;
    }
}
