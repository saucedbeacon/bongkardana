package o;

import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;

public class OfflineMode extends BaseRpcRequest implements Serializable {
    public String action = RequestConstants.BUILD_MENU;
    public String data;
    public String envData;
    public boolean isDisplaySensitiveField;
    public String module = "APP_SETTING_NATIVE";
    public String prodmngId = "query";

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public String getProdmngId() {
        return this.prodmngId;
    }

    public void setProdmngId(String str) {
        this.prodmngId = str;
    }

    public boolean isDisplaySensitiveField() {
        return this.isDisplaySensitiveField;
    }

    public void setDisplaySensitiveField(boolean z) {
        this.isDisplaySensitiveField = z;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String str) {
        this.data = str;
    }

    public String getEnvData() {
        return this.envData;
    }

    public void setEnvData(String str) {
        this.envData = str;
    }
}
