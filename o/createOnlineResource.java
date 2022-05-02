package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;

public class createOnlineResource extends BaseRpcResult {
    private String data;
    private int expireTime;
    private boolean finish;
    private boolean verifySuccess;

    public String getData() {
        return this.data;
    }

    public void setData(String str) {
        this.data = str;
    }

    public int getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(int i) {
        this.expireTime = i;
    }

    public boolean isFinish() {
        return this.finish;
    }

    public void setFinish(boolean z) {
        this.finish = z;
    }

    public boolean isVerifySuccess() {
        return this.verifySuccess;
    }

    public void setVerifySuccess(boolean z) {
        this.verifySuccess = z;
    }

    public boolean isSuccess() {
        return this.success;
    }
}
