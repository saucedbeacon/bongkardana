package com.alipay.mobileiclib.common.service.facade.solution.dto;

import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.message.MessageConstants;
import com.alipay.mobileiclib.common.service.model.MICBaseResult;
import org.json.JSONException;
import org.json.JSONObject;

public class MICRpcResponse extends MICBaseResult {
    public String data;
    public int expireTime = 0;
    public boolean finish = false;
    public String finishCode;
    public String finishMessage;
    public String finishParams;
    public String nextAction;
    public String nextStep;
    public String prodmngId;
    public String token;
    public String verifyCode;
    public String verifyId;
    public String verifyMessage;
    public boolean verifySuccess = false;

    public Message convertToMessage() {
        Message message = new Message();
        message.setVerifySuccess(this.verifySuccess);
        message.setVerifyMessage(this.verifyMessage);
        message.setVerifyId(this.verifyId);
        message.setVerifyCode(this.verifyCode);
        message.setSuccess(this.success);
        message.setNextStep(this.nextStep);
        message.setNextAction(this.nextAction);
        message.setData(this.data);
        message.setFinish(this.finish);
        return message;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", this.token);
            jSONObject.put(GriverConfigConstants.PARAM_PREPARE_APP_TIMEOUT, this.expireTime);
            jSONObject.put(MessageConstants.KEY_VERIFYSUCCESS, this.verifySuccess);
            jSONObject.put(MessageConstants.KEY_VERIFYCODE, this.verifyCode);
            jSONObject.put(MessageConstants.KEY_VERIFYMESSAGE, this.verifyMessage);
            jSONObject.put("verifyId", this.verifyId);
            jSONObject.put("finish", this.finish);
            jSONObject.put("finishCode", this.finishCode);
            jSONObject.put("finishMessage", this.finishMessage);
            jSONObject.put("finishParams", this.finishParams);
            jSONObject.put(MessageConstants.KEY_NEXTSTEP, this.nextStep);
            jSONObject.put("nextAction", this.nextAction);
            jSONObject.put("data", this.data);
            jSONObject.put("success", this.success);
            jSONObject.put("sysErrCode", this.sysErrCode);
            jSONObject.put("sysErrMsg", this.sysErrMsg);
            return jSONObject.toString();
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder("MICRpcResponse{token='");
            sb.append(this.token);
            sb.append('\'');
            sb.append(", expireTime=");
            sb.append(this.expireTime);
            sb.append(", verifySuccess=");
            sb.append(this.verifySuccess);
            sb.append(", verifyCode='");
            sb.append(this.verifyCode);
            sb.append('\'');
            sb.append(", verifyMessage='");
            sb.append(this.verifyMessage);
            sb.append('\'');
            sb.append(", verifyId='");
            sb.append(this.verifyId);
            sb.append('\'');
            sb.append(", finish=");
            sb.append(this.finish);
            sb.append(", finishCode='");
            sb.append(this.finishCode);
            sb.append('\'');
            sb.append(", finishMessage='");
            sb.append(this.finishMessage);
            sb.append('\'');
            sb.append(", finishParams='");
            sb.append(this.finishParams);
            sb.append('\'');
            sb.append(", nextStep='");
            sb.append(this.nextStep);
            sb.append('\'');
            sb.append(", nextAction='");
            sb.append(this.nextAction);
            sb.append('\'');
            sb.append(", data='");
            sb.append(this.data);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
}
