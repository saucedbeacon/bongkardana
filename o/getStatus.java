package o;

public class getStatus {
    private boolean apiSuccess;
    private boolean riskVerificationOldNumber;

    public boolean isApiSuccess() {
        return this.apiSuccess;
    }

    public void setApiSuccess(boolean z) {
        this.apiSuccess = z;
    }

    public boolean isRiskVerificationOldNumber() {
        return this.riskVerificationOldNumber;
    }

    public void setRiskVerificationOldNumber(boolean z) {
        this.riskVerificationOldNumber = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChangePhoneFinishEntity{apiSuccess='");
        sb.append(this.apiSuccess);
        sb.append('\'');
        sb.append(", riskVerificationOldNumber=");
        sb.append(this.riskVerificationOldNumber);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
