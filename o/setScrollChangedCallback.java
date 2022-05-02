package o;

import java.util.ArrayList;
import java.util.List;
import o.FileCache;

public class setScrollChangedCallback {
    private String activityId;
    private long beginDate;
    private long endDate;
    private List<getScrollY> limitRule;
    private registerWorker maxAmount;
    private registerWorker minTransactionAmount;
    private List<String> paymentMethods;
    private String prizeType;
    private String promoDescription;
    private String promoType;
    private String promoValue;

    public String getActivityId() {
        return this.activityId;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public String getPrizeType() {
        return this.prizeType;
    }

    public void setPrizeType(String str) {
        this.prizeType = str;
    }

    public String getPromoDescription() {
        return this.promoDescription;
    }

    public void setPromoDescription(String str) {
        this.promoDescription = str;
    }

    public List<String> getPaymentMethods() {
        return this.paymentMethods;
    }

    public void setPaymentMethods(List<String> list) {
        this.paymentMethods = list;
    }

    public registerWorker getMinTransactionAmount() {
        return this.minTransactionAmount;
    }

    public void setMinTransactionAmount(registerWorker registerworker) {
        this.minTransactionAmount = registerworker;
    }

    public long getEndDate() {
        return this.endDate;
    }

    public void setEndDate(long j) {
        this.endDate = j;
    }

    public long getBeginDate() {
        return this.beginDate;
    }

    public void setBeginDate(long j) {
        this.beginDate = j;
    }

    public String getPromoValue() {
        return this.promoValue;
    }

    public void setPromoValue(String str) {
        this.promoValue = str;
    }

    public registerWorker getMaxAmount() {
        return this.maxAmount;
    }

    public void setMaxAmount(registerWorker registerworker) {
        this.maxAmount = registerworker;
    }

    public List<getScrollY> getLimitRule() {
        return this.limitRule;
    }

    public void setLimitRule(List<getScrollY> list) {
        this.limitRule = list;
    }

    public String getPromoType() {
        return this.promoType;
    }

    public void setPromoType(String str) {
        this.promoType = str;
    }

    public FileCache.AnonymousClass1 toPromoInfo() {
        FileCache.AnonymousClass1 r0 = new FileCache.AnonymousClass1();
        r0.setActivityId(this.activityId);
        r0.setBeginDate(this.beginDate);
        r0.setEndDate(this.endDate);
        r0.setLimitRule(transformPromoLimitInfoEntityToPromoLimitInfo(this.limitRule));
        r0.setMaxAmount(this.maxAmount.toCurrencyAmount());
        r0.setMinTransactionAmount(this.minTransactionAmount.toCurrencyAmount());
        r0.setPaymentMethods(this.paymentMethods);
        r0.setPrizeType(this.prizeType);
        r0.setPromoDescription(this.promoDescription);
        r0.setPromoType(this.promoType);
        r0.setPromoValue(this.promoValue);
        return r0;
    }

    private List<GriverBundleUtils> transformPromoLimitInfoEntityToPromoLimitInfo(List<getScrollY> list) {
        ArrayList arrayList = new ArrayList();
        for (getScrollY promoLimitInfo : list) {
            arrayList.add(promoLimitInfo.toPromoLimitInfo());
        }
        return arrayList;
    }
}
