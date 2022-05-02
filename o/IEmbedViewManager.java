package o;

import android.os.Build;
import id.dana.domain.homeinfo.ServiceName;

public class IEmbedViewManager {
    private final String appId = getActionSheet.APP_ID;
    private final String appVersion = "";
    private final String channel = ServiceName.GOOGLE_PLAY;
    private String connectType;
    private String deliveryToken;
    private String imei = "";
    private String imsi = "";
    private final String model = Build.MODEL;
    private final int osType = 1;
    private final String pushVersion = "";
    private final int thirdChannel = 6;
    private String thirdChannelDeviceToken;
    private final String workspaceId = "prod";

    public String getAppId() {
        return getActionSheet.APP_ID;
    }

    public String getAppVersion() {
        return "";
    }

    public String getChannel() {
        return ServiceName.GOOGLE_PLAY;
    }

    public int getOsType() {
        return 1;
    }

    public String getPushVersion() {
        return "";
    }

    public int getThirdChannel() {
        return 6;
    }

    public String getWorkspaceId() {
        return "prod";
    }

    public void setDeliveryToken(String str) {
        this.deliveryToken = str;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    public void setImsi(String str) {
        this.imsi = str;
    }

    public void setConnectType(String str) {
        this.connectType = str;
    }

    public void setThirdChannelDeviceToken(String str) {
        this.thirdChannelDeviceToken = str;
    }

    public String getDeliveryToken() {
        return this.deliveryToken;
    }

    public String getImei() {
        return this.imei;
    }

    public String getImsi() {
        return this.imsi;
    }

    public String getConnectType() {
        return this.connectType;
    }

    public String getModel() {
        return this.model;
    }

    public String getThirdChannelDeviceToken() {
        return this.thirdChannelDeviceToken;
    }
}
