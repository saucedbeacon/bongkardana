package o;

import java.io.Serializable;
import java.util.Date;

public class generateNodeId implements Serializable {
    private String bizType;
    private String contentId;
    private String contentName;
    private String contentType;
    private String contentValue;
    private Date effectiveDate;
    private String envType;
    private Date expireDate;
    private String extendInfo;
    private Date gmtCreate;
    private Date gmtModified;
    private String language;
    private int priority;
    private String redirectUrl;
    private String selectRule;
    private String spaceCode;
    private String status;
    private String tenantId;

    public String getContentId() {
        return this.contentId;
    }

    public void setContentId(String str) {
        this.contentId = str;
    }

    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public String getContentName() {
        return this.contentName;
    }

    public void setContentName(String str) {
        this.contentName = str;
    }

    public String getContentValue() {
        return this.contentValue;
    }

    public void setContentValue(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1840300100, oncanceled);
            onCancelLoad.getMin(1840300100, oncanceled);
        }
        this.contentValue = str;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public String getSpaceCode() {
        return this.spaceCode;
    }

    public void setSpaceCode(String str) {
        this.spaceCode = str;
    }

    public String getEnvType() {
        return this.envType;
    }

    public void setEnvType(String str) {
        this.envType = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date date) {
        this.gmtCreate = date;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(Date date) {
        this.gmtModified = date;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(Date date) {
        this.effectiveDate = date;
    }

    public Date getExpireDate() {
        return this.expireDate;
    }

    public void setExpireDate(Date date) {
        this.expireDate = date;
    }

    public String getSelectRule() {
        return this.selectRule;
    }

    public void setSelectRule(String str) {
        this.selectRule = str;
    }

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public String getExtendInfo() {
        return this.extendInfo;
    }

    public void setExtendInfo(String str) {
        this.extendInfo = str;
    }
}
