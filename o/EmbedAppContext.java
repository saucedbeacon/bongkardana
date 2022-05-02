package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;

public class EmbedAppContext extends BaseRpcRequest {
    private String bizType;
    private String deviceId;

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }
}
