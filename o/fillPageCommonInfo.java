package o;

import id.dana.sendmoney.model.PayOptionDTO;
import java.io.Serializable;
import java.util.List;
import o.IMultiInstanceInvalidationService;

public final class fillPageCommonInfo extends IMultiInstanceInvalidationService.Stub implements Serializable {
    private String acDecodeConfig;
    private String avatarUrl;
    private postWebViewMessage bizInfo;
    private String bizNo;
    private String bizType;
    private boolean isSendMoneyV2;
    private String kycLevel;
    private String loginId;
    private String mobileNumber;
    private String nickname;
    private List<PayOptionDTO> payOptions;
    private String receiverId;
    private String redirectUrl;
    private String source;

    public final String getSource() {
        return this.source;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public final String getKycLevel() {
        return this.kycLevel;
    }

    public final void setKycLevel(String str) {
        this.kycLevel = str;
    }

    public final List<PayOptionDTO> getPayOptions() {
        return this.payOptions;
    }

    public final void setPayOptions(List<PayOptionDTO> list) {
        this.payOptions = list;
    }

    public final String getBizType() {
        return this.bizType;
    }

    public final void setBizType(String str) {
        this.bizType = str;
    }

    public final String getBizNo() {
        return this.bizNo;
    }

    public final void setBizNo(String str) {
        this.bizNo = str;
    }

    public final String getReceiverId() {
        return this.receiverId;
    }

    public final void setReceiverId(String str) {
        this.receiverId = str;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final String getLoginId() {
        return this.loginId;
    }

    public final void setLoginId(String str) {
        this.loginId = str;
    }

    public final postWebViewMessage getBizInfo() {
        return this.bizInfo;
    }

    public final void setBizInfo(postWebViewMessage postwebviewmessage) {
        this.bizInfo = postwebviewmessage;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public final String getAcDecodeConfig() {
        return this.acDecodeConfig;
    }

    public final void setAcDecodeConfig(String str) {
        this.acDecodeConfig = str;
    }

    public final boolean isSendMoneyV2() {
        return this.isSendMoneyV2;
    }

    public final void setSendMoneyV2(boolean z) {
        this.isSendMoneyV2 = z;
    }
}
