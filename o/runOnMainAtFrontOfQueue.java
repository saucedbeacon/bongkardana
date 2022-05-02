package o;

import java.util.List;

public class runOnMainAtFrontOfQueue {
    private long activeTime;
    private registerWorker availableAmount;
    private runOnMain couponDiscountInfo;
    private String couponId;
    private String couponName;
    private List<ExecutorUtils> couponPayMethodInfos;
    private long createdTime;
    private String description;
    private long expiryTime;
    private long extendTime;
    private String iconUrl;
    private long modifiedTime;
    private String tnc;
    private registerWorker totalAmount;

    public String getCouponId() {
        return this.couponId;
    }

    public void setCouponId(String str) {
        this.couponId = str;
    }

    public String getCouponName() {
        return this.couponName;
    }

    public void setCouponName(String str) {
        this.couponName = str;
    }

    public registerWorker getAvailableAmount() {
        return this.availableAmount;
    }

    public void setAvailableAmount(registerWorker registerworker) {
        this.availableAmount = registerworker;
    }

    public registerWorker getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(registerWorker registerworker) {
        this.totalAmount = registerworker;
    }

    public long getActiveTime() {
        return this.activeTime;
    }

    public void setActiveTime(long j) {
        this.activeTime = j;
    }

    public long getExpiryTime() {
        return this.expiryTime;
    }

    public void setExpiryTime(long j) {
        this.expiryTime = j;
    }

    public long getExtendTime() {
        return this.extendTime;
    }

    public void setExtendTime(long j) {
        this.extendTime = j;
    }

    public long getCreatedTime() {
        return this.createdTime;
    }

    public void setCreatedTime(long j) {
        this.createdTime = j;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(long j) {
        this.modifiedTime = j;
    }

    public runOnMain getCouponDiscountInfo() {
        return this.couponDiscountInfo;
    }

    public void setCouponDiscountInfo(runOnMain runonmain) {
        this.couponDiscountInfo = runonmain;
    }

    public List<ExecutorUtils> getCouponPayMethodInfos() {
        return this.couponPayMethodInfos;
    }

    public void setCouponPayMethodInfos(List<ExecutorUtils> list) {
        this.couponPayMethodInfos = list;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public String getTnc() {
        return this.tnc;
    }

    public void setTnc(String str) {
        this.tnc = str;
    }
}
