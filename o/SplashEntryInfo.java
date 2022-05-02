package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SplashEntryInfo extends initWithSecurityGuard {
    private String action;
    private List<base64> agreements;
    private String authCode;
    private MD5Util merchantInfo;
    private String merchantRedirectUrl;
    private String mobileAuthCode;
    private String phoneNumber;
    private String riskPhoneNumber;
    private String securityId;
    private String state;
    private List<String> verificationMethods;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lid/dana/domain/auth/face/result/SecurityContext;", "", "pubKey", "", "(Ljava/lang/String;)V", "getPubKey", "()Ljava/lang/String;", "setPubKey", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.SplashEntryInfo$1  reason: invalid class name */
    public final class AnonymousClass1 {
        @Nullable
        private String pubKey;

        public AnonymousClass1() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r0, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.pubKey;
            }
            return r0.copy(str);
        }

        @Nullable
        public final String component1() {
            return this.pubKey;
        }

        @NotNull
        public final AnonymousClass1 copy(@Nullable String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-31285300, oncanceled);
                onCancelLoad.getMin(-31285300, oncanceled);
            }
            return new AnonymousClass1(str);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof AnonymousClass1) && Intrinsics.areEqual((Object) this.pubKey, (Object) ((AnonymousClass1) obj).pubKey);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.pubKey;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SecurityContext(pubKey=");
            sb.append(this.pubKey);
            sb.append(")");
            return sb.toString();
        }

        public AnonymousClass1(@Nullable String str) {
            this.pubKey = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Nullable
        public final String getPubKey() {
            return this.pubKey;
        }

        public final void setPubKey(@Nullable String str) {
            this.pubKey = str;
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
        this.riskPhoneNumber = str;
    }

    public String getSecurityId() {
        return this.securityId;
    }

    public void setSecurityId(String str) {
        this.securityId = str;
    }

    public MD5Util getMerchantInfo() {
        return this.merchantInfo;
    }

    public void setMerchantInfo(MD5Util mD5Util) {
        this.merchantInfo = mD5Util;
    }

    public List<base64> getAgreements() {
        return this.agreements;
    }

    public void setAgreements(List<base64> list) {
        this.agreements = list;
    }

    public List<String> getVerificationMethods() {
        return this.verificationMethods;
    }

    public void setVerificationMethods(List<String> list) {
        this.verificationMethods = list;
    }
}
