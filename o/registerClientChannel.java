package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;

public class registerClientChannel extends BaseRpcRequest {
    private String amount;
    private String transferMethod;

    public registerClientChannel(String str, String str2) {
        this.amount = str;
        this.transferMethod = str2;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public String getTransferMethod() {
        return this.transferMethod;
    }

    public void setTransferMethod(String str) {
        this.transferMethod = str;
    }
}
