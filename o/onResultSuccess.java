package o;

public class onResultSuccess {
    private String maskPhoneNumber;
    private String result;
    private String riskInfo;
    private String verificationMethod;
    private int verificationPriority;

    public String getMaskPhoneNumber() {
        return this.maskPhoneNumber;
    }

    public void setMaskPhoneNumber(String str) {
        this.maskPhoneNumber = str;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public String getRiskInfo() {
        return this.riskInfo;
    }

    public void setRiskInfo(String str) {
        this.riskInfo = str;
    }

    public String getVerificationMethod() {
        return this.verificationMethod;
    }

    public void setVerificationMethod(String str) {
        this.verificationMethod = str;
    }

    public int getVerificationPriority() {
        return this.verificationPriority;
    }

    public void setVerificationPriority(int i) {
        this.verificationPriority = i;
    }
}
