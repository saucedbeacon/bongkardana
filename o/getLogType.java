package o;

import android.text.TextUtils;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.registration.CheckUserAction;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

@Singleton
public class getLogType {
    public static final int REFERRAL_CODE_LENGTH = 6;
    private String clientId;
    private String merchantId;
    private long nextRetryTimestamp;
    private String phoneNumber;
    private String referralCode;
    private EventLog registrationStatusResult;
    private String verifyMethod;

    public String getPhoneNumber() {
        StringBuilder sb = new StringBuilder("RegistrationProcessManager: ");
        sb.append(this);
        sb.append("\tgetPhoneNumber: ");
        sb.append(this.phoneNumber);
        updateActionSheetContent.behaviorAndLog(DanaLogConstants.TAG.PHONE_NUMBER_EMPTY_TAG, sb.toString());
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
        StringBuilder sb = new StringBuilder("RegistrationProcessManager: ");
        sb.append(this);
        sb.append("\tsetPhoneNumber: ");
        sb.append(str);
        updateActionSheetContent.behaviorAndLog(DanaLogConstants.TAG.PHONE_NUMBER_EMPTY_TAG, sb.toString());
    }

    public EventLog getRegistrationStatusResult() {
        if (this.registrationStatusResult != null && isNotOverRetry()) {
            this.registrationStatusResult.retrySendSeconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.nextRetryTimestamp - System.currentTimeMillis());
        }
        return this.registrationStatusResult;
    }

    public void setRegistrationStatusResult(EventLog eventLog) {
        this.registrationStatusResult = eventLog;
        if (CheckUserAction.REGISTER.equals(eventLog.action)) {
            this.nextRetryTimestamp = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis((long) eventLog.retrySendSeconds);
        }
    }

    public boolean isNotOverRetry() {
        return this.nextRetryTimestamp >= System.currentTimeMillis();
    }

    public String getReferralCode() {
        return this.referralCode;
    }

    public void setReferralCode(String str) {
        if (str == null || str.length() < 6) {
            this.referralCode = "";
        } else {
            this.referralCode = str.substring(0, 6);
        }
    }

    public String getClientId() {
        return !TextUtils.isEmpty(this.clientId) ? this.clientId : "";
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public String getMerchantId() {
        return !TextUtils.isEmpty(this.merchantId) ? this.merchantId : "";
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public void clear() {
        this.registrationStatusResult = null;
        this.nextRetryTimestamp = -1;
        this.referralCode = null;
        this.clientId = null;
        this.merchantId = null;
    }

    public String getVerifyMethod() {
        return this.verifyMethod;
    }

    public void setVerifyMethod(String str) {
        this.verifyMethod = str;
    }
}
