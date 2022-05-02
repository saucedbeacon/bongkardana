package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class maybeSetTextColor extends BaseRpcResult {
    private String action;
    private List<originUrl> agreements;
    private String authCode;
    private canAsyncFallback merchantInfo;
    private String merchantRedirectUrl;
    private String mobileAuthCode;
    private String phoneNumber;
    private String riskPhoneNumber;
    private String securityId;
    private String state;
    private List<String> verificationMethods;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001b"}, d2 = {"Lid/dana/data/auth/face/repository/source/result/VerificationMethodInfoEntity;", "", "priority", "", "verificationMethod", "", "verificationMethodCode", "(ILjava/lang/String;Ljava/lang/String;)V", "getPriority", "()I", "setPriority", "(I)V", "getVerificationMethod", "()Ljava/lang/String;", "setVerificationMethod", "(Ljava/lang/String;)V", "getVerificationMethodCode", "setVerificationMethodCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.maybeSetTextColor$default  reason: invalid class name */
    public final class Cdefault {
        private int priority;
        @Nullable
        private String verificationMethod;
        @Nullable
        private String verificationMethodCode;

        public Cdefault() {
            this(0, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Cdefault copy$default(Cdefault defaultR, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = defaultR.priority;
            }
            if ((i2 & 2) != 0) {
                str = defaultR.verificationMethod;
            }
            if ((i2 & 4) != 0) {
                str2 = defaultR.verificationMethodCode;
            }
            return defaultR.copy(i, str, str2);
        }

        public final int component1() {
            return this.priority;
        }

        @Nullable
        public final String component2() {
            return this.verificationMethod;
        }

        @Nullable
        public final String component3() {
            return this.verificationMethodCode;
        }

        @NotNull
        public final Cdefault copy(int i, @Nullable String str, @Nullable String str2) {
            return new Cdefault(i, str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cdefault)) {
                return false;
            }
            Cdefault defaultR = (Cdefault) obj;
            return this.priority == defaultR.priority && Intrinsics.areEqual((Object) this.verificationMethod, (Object) defaultR.verificationMethod) && Intrinsics.areEqual((Object) this.verificationMethodCode, (Object) defaultR.verificationMethodCode);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("VerificationMethodInfoEntity(priority=");
            sb.append(this.priority);
            sb.append(", verificationMethod=");
            sb.append(this.verificationMethod);
            sb.append(", verificationMethodCode=");
            sb.append(this.verificationMethodCode);
            sb.append(")");
            return sb.toString();
        }

        public Cdefault(int i, @Nullable String str, @Nullable String str2) {
            this.priority = i;
            this.verificationMethod = str;
            this.verificationMethodCode = str2;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final void setPriority(int i) {
            this.priority = i;
        }

        @Nullable
        public final String getVerificationMethod() {
            return this.verificationMethod;
        }

        public final void setVerificationMethod(@Nullable String str) {
            this.verificationMethod = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Cdefault(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
        }

        @Nullable
        public final String getVerificationMethodCode() {
            return this.verificationMethodCode;
        }

        public final void setVerificationMethodCode(@Nullable String str) {
            this.verificationMethodCode = str;
        }

        public final int hashCode() {
            int hashCode = Integer.valueOf(this.priority).hashCode() * 31;
            String str = this.verificationMethod;
            int i = 0;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.verificationMethodCode;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }
    }

    public String getAuthCode() {
        return this.authCode;
    }

    public void setAuthCode(String str) {
        this.authCode = str;
    }

    public String getMobileAuthCode() {
        return this.mobileAuthCode;
    }

    public void setMobileAuthCode(String str) {
        this.mobileAuthCode = str;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String str) {
        this.state = str;
    }

    public String getMerchantRedirectUrl() {
        return this.merchantRedirectUrl;
    }

    public void setMerchantRedirectUrl(String str) {
        this.merchantRedirectUrl = str;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public String getRiskPhoneNumber() {
        return this.riskPhoneNumber;
    }

    public void setRiskPhoneNumber(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1698216124, oncanceled);
            onCancelLoad.getMin(-1698216124, oncanceled);
        }
        this.riskPhoneNumber = str;
    }

    public String getSecurityId() {
        return this.securityId;
    }

    public void setSecurityId(String str) {
        this.securityId = str;
    }

    public canAsyncFallback getMerchantInfo() {
        return this.merchantInfo;
    }

    public void setMerchantInfo(canAsyncFallback canasyncfallback) {
        this.merchantInfo = canasyncfallback;
    }

    public List<originUrl> getAgreements() {
        return this.agreements;
    }

    public void setAgreements(List<originUrl> list) {
        this.agreements = list;
    }

    public List<String> getVerificationMethods() {
        return this.verificationMethods;
    }

    public void setVerificationMethods(List<String> list) {
        this.verificationMethods = list;
    }
}
