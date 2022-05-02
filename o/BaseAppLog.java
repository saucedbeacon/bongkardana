package o;

public class BaseAppLog {
    private String authenticationMethod;
    private boolean enrollFlag;
    private boolean kycFlag;
    private boolean riskFlag;

    public final class Builder implements getAdapterPosition<setGroupId> {

        static final class getMin {
            /* access modifiers changed from: private */
            public static final Builder setMax = new Builder();
        }

        public final setGroupId get() {
            return newInstance();
        }

        public static Builder create() {
            return getMin.setMax;
        }

        public static setGroupId newInstance() {
            return new setGroupId();
        }
    }

    public String getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    public void setAuthenticationMethod(String str) {
        this.authenticationMethod = str;
    }

    public boolean isEnrollFlag() {
        return this.enrollFlag;
    }

    public void setEnrollFlag(boolean z) {
        this.enrollFlag = z;
    }

    public boolean isKycFlag() {
        return this.kycFlag;
    }

    public void setKycFlag(boolean z) {
        this.kycFlag = z;
    }

    public boolean isRiskFlag() {
        return this.riskFlag;
    }

    public void setRiskFlag(boolean z) {
        this.riskFlag = z;
    }
}
