package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;

public class setInstallTime extends BaseRpcResult {
    private long expiredTime;
    private long serverTime;
    private canContinue verifyToken;

    public canContinue getVerifyToken() {
        return this.verifyToken;
    }

    public void setVerifyToken(canContinue cancontinue) {
        this.verifyToken = cancontinue;
    }

    public long getServerTime() {
        return this.serverTime;
    }

    public void setServerTime(long j) {
        this.serverTime = j;
    }

    public long getExpiredTime() {
        return this.expiredTime;
    }

    public void setExpiredTime(long j) {
        this.expiredTime = j;
    }
}
