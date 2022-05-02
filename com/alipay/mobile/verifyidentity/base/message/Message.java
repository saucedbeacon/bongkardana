package com.alipay.mobile.verifyidentity.base.message;

import com.alipay.mobile.verifyidentity.base.log.VILog;
import java.io.Serializable;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.json.JSONObject;

public class Message implements Serializable {
    public static final String TAG = Message.class.getSimpleName();
    private String action;
    private String appSource;
    private String bizId;
    private boolean canRetry;
    private String data;
    private boolean finish;
    private String messageData;
    private String nextAction;
    private String nextStep;
    private String predata;
    private String prodmngId;
    private String productCode;
    private String productType;
    private String sceneId;
    private String schemeUrl;
    private String secData;
    private boolean success;
    private String tntInstId;
    private String type;
    private String userId;
    private String userInfo;
    private String verifyCode;
    private String verifyId;
    private String verifyMessage;
    private boolean verifySuccess;
    private int verifyType;

    public Message(String str) {
        parse(str);
    }

    public Message() {
    }

    public void parse(String str) {
        try {
            this.messageData = str;
            JSONObject jSONObject = new JSONObject(str);
            this.success = jSONObject.optBoolean("success");
            this.nextStep = jSONObject.optString(MessageConstants.KEY_NEXTSTEP);
            this.verifyCode = jSONObject.optString(MessageConstants.KEY_VERIFYCODE);
            this.verifyMessage = jSONObject.optString(MessageConstants.KEY_VERIFYMESSAGE);
            this.verifyId = jSONObject.optString("verifyId");
            this.data = jSONObject.optString("data");
            this.productCode = jSONObject.optString("productCode");
            this.finish = jSONObject.optBoolean("finish");
            this.verifySuccess = jSONObject.optBoolean(MessageConstants.KEY_VERIFYSUCCESS);
            this.canRetry = jSONObject.optBoolean(MessageConstants.KEY_CANRETRY);
            this.schemeUrl = new JSONObject(this.data).optString("schema");
        } catch (Throwable th) {
            VILog.e(TAG, th);
        }
    }

    public static String buildMessageData(String str, String str2, String str3, String str4, String str5) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str != null && !str.isEmpty()) {
                jSONObject.put("module", str);
            }
            if (str2 != null && !str2.isEmpty()) {
                jSONObject.put("action", str2);
            }
            if (str3 != null && !str3.isEmpty()) {
                jSONObject.put("verifyId", str3);
            }
            if (str4 != null && !str4.isEmpty()) {
                jSONObject.put("envData", str4);
            }
            if (str5 != null && !str5.isEmpty()) {
                jSONObject.put("data", str5);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            VILog.e(TAG, th);
            return null;
        }
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public String getNextStep() {
        return this.nextStep;
    }

    public void setNextStep(String str) {
        this.nextStep = str;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public void setVerifyCode(String str) {
        this.verifyCode = str;
    }

    public String getVerifyMessage() {
        return this.verifyMessage;
    }

    public void setVerifyMessage(String str) {
        this.verifyMessage = str;
    }

    public String getVerifyId() {
        return this.verifyId;
    }

    public void setVerifyId(String str) {
        this.verifyId = str;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String str) {
        this.data = str;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String str) {
        this.productCode = str;
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

    public boolean isCanRetry() {
        return this.canRetry;
    }

    public void setCanRetry(boolean z) {
        this.canRetry = z;
    }

    public String getMessageData() {
        return this.messageData;
    }

    public void setMessageData(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-828272414, oncanceled);
            onCancelLoad.getMin(-828272414, oncanceled);
        }
        this.messageData = str;
    }

    public String getSecData() {
        return this.secData;
    }

    public void setSecData(String str) {
        this.secData = str;
    }

    public String getProdmngId() {
        return this.prodmngId;
    }

    public void setProdmngId(String str) {
        this.prodmngId = str;
    }

    public String getAppSource() {
        return this.appSource;
    }

    public void setAppSource(String str) {
        this.appSource = str;
    }

    public String getBizId() {
        return this.bizId;
    }

    public void setBizId(String str) {
        this.bizId = str;
    }

    public String getSceneId() {
        return this.sceneId;
    }

    public void setSceneId(String str) {
        this.sceneId = str;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getUserInfo() {
        return this.userInfo;
    }

    public void setUserInfo(String str) {
        this.userInfo = str;
    }

    public String getTntInstId() {
        return this.tntInstId;
    }

    public void setTntInstId(String str) {
        this.tntInstId = str;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getNextAction() {
        return this.nextAction;
    }

    public void setNextAction(String str) {
        this.nextAction = str;
    }

    public String getPredata() {
        return this.predata;
    }

    public void setPredata(String str) {
        this.predata = str;
    }

    public String getSchemeUrl() {
        return this.schemeUrl;
    }

    public void setSchemeUrl(String str) {
        this.schemeUrl = str;
    }

    public int getVerifyType() {
        return this.verifyType;
    }

    public void setVerifyType(int i) {
        this.verifyType = i;
    }

    public String getProductType() {
        return this.productType;
    }

    public void setProductType(String str) {
        this.productType = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Message{success=");
        sb.append(this.success);
        sb.append(", nextStep='");
        sb.append(this.nextStep);
        sb.append('\'');
        sb.append(", action='");
        sb.append(this.action);
        sb.append('\'');
        sb.append(", nextAction='");
        sb.append(this.nextAction);
        sb.append('\'');
        sb.append(", verifyCode='");
        sb.append(this.verifyCode);
        sb.append('\'');
        sb.append(", verifyMessage='");
        sb.append(this.verifyMessage);
        sb.append('\'');
        sb.append(", verifyId='");
        sb.append(this.verifyId);
        sb.append('\'');
        sb.append(", productCode='");
        sb.append(this.productCode);
        sb.append('\'');
        sb.append(", data='");
        sb.append(this.data);
        sb.append('\'');
        sb.append(", finish=");
        sb.append(this.finish);
        sb.append(", verifySuccess=");
        sb.append(this.verifySuccess);
        sb.append(", canRetry=");
        sb.append(this.canRetry);
        sb.append(", messageData='");
        sb.append(this.messageData);
        sb.append('\'');
        sb.append(", secData='");
        sb.append(this.secData);
        sb.append('\'');
        sb.append(", prodmngId='");
        sb.append(this.prodmngId);
        sb.append('\'');
        sb.append(", appSource='");
        sb.append(this.appSource);
        sb.append('\'');
        sb.append(", bizId='");
        sb.append(this.bizId);
        sb.append('\'');
        sb.append(", sceneId='");
        sb.append(this.sceneId);
        sb.append('\'');
        sb.append(", userId='");
        sb.append(this.userId);
        sb.append('\'');
        sb.append(", userInfo='");
        sb.append(this.userInfo);
        sb.append('\'');
        sb.append(", tntInstId='");
        sb.append(this.tntInstId);
        sb.append('\'');
        sb.append(", verifyType='");
        sb.append(this.verifyType);
        sb.append('\'');
        sb.append(", predata='");
        sb.append(this.predata);
        sb.append('\'');
        sb.append(", schemeUrl='");
        sb.append(this.schemeUrl);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
