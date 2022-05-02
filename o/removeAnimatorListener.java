package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;

public class removeAnimatorListener extends BaseRpcResult {
    private String errorMsg;

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }
}
