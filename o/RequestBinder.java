package o;

import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

@Singleton
public class RequestBinder {
    private String phoneNumber;
    private long retryTimestamp;
    private getJsApiDetail4TinyWithT2 sendOtpResult;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public getJsApiDetail4TinyWithT2 getSendOtpResult() {
        if (this.sendOtpResult != null && isNotOverRetry()) {
            this.sendOtpResult.retrySendSeconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.retryTimestamp - System.currentTimeMillis());
        }
        return this.sendOtpResult;
    }

    public void setSendOtpResult(getJsApiDetail4TinyWithT2 getjsapidetail4tinywitht2) {
        this.retryTimestamp = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis((long) getjsapidetail4tinywitht2.retrySendSeconds);
        this.sendOtpResult = getjsapidetail4tinywitht2;
    }

    public boolean isNotOverRetry() {
        return this.retryTimestamp >= System.currentTimeMillis();
    }

    public void clear() {
        this.phoneNumber = null;
        this.sendOtpResult = null;
        this.retryTimestamp = -1;
    }
}
