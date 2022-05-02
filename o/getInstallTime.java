package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;

public class getInstallTime extends BaseRpcRequest {
    private String phoneNumber;
    private String tokenScene;

    public String getTokenScene() {
        return this.tokenScene;
    }

    public void setTokenScene(String str) {
        this.tokenScene = str;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }
}
