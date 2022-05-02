package o;

public class positivePermissionsResult extends initWithSecurityGuard {
    private int expirySeconds;
    private int otpCodeLength;
    private int retrySendSeconds;

    public int getExpirySeconds() {
        return this.expirySeconds;
    }

    public void setExpirySeconds(int i) {
        this.expirySeconds = i;
    }

    public int getRetrySendSeconds() {
        return this.retrySendSeconds;
    }

    public void setRetrySendSeconds(int i) {
        this.retrySendSeconds = i;
    }

    public int getOtpCodeLength() {
        return this.otpCodeLength;
    }

    public void setOtpCodeLength(int i) {
        this.otpCodeLength = i;
    }
}
