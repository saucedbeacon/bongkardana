package id.dana.data.sendmoney.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import o.getMD5;
import o.registerWorker;

public class TransferMethodInfoResult {
    @NonNull
    private registerWorker chargeAmount;
    @NonNull
    private registerWorker freeMinAmount;
    @NonNull
    private long freeRemainingTimes;
    @NonNull
    private long freeTimes;
    private final boolean nullObject;
    @NonNull
    private List<PayMethodInfoResult> payMethodInfos;
    @NonNull
    private String transferMethod;
    @Nullable
    private List<getMD5> withdrawMethodViews;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TransferMethod {
        public static final String BALANCE = "BALANCE";
        public static final String BANK_TRANSFER = "BANK_TRANSFER";
        public static final String OTC = "OTC";
    }

    public TransferMethodInfoResult() {
        this.payMethodInfos = new ArrayList();
        this.nullObject = false;
    }

    public TransferMethodInfoResult(@NonNull registerWorker registerworker, @NonNull registerWorker registerworker2, long j, long j2, @NonNull List<PayMethodInfoResult> list, @NonNull String str, @Nullable List<getMD5> list2) {
        this.payMethodInfos = new ArrayList();
        this.chargeAmount = registerworker;
        this.freeRemainingTimes = j;
        this.freeTimes = j2;
        this.payMethodInfos = list;
        this.transferMethod = str;
        this.withdrawMethodViews = list2;
        this.freeMinAmount = registerworker2;
        this.nullObject = false;
    }

    private TransferMethodInfoResult(boolean z) {
        this.payMethodInfos = new ArrayList();
        this.nullObject = z;
    }

    public static TransferMethodInfoResult createNullObject() {
        return new TransferMethodInfoResult(true);
    }

    @NonNull
    public registerWorker getChargeAmount() {
        return this.chargeAmount;
    }

    public void setChargeAmount(@NonNull registerWorker registerworker) {
        this.chargeAmount = registerworker;
    }

    @NonNull
    public registerWorker getFreeMinAmount() {
        return this.freeMinAmount;
    }

    public void setFreeMinAmount(@NonNull registerWorker registerworker) {
        this.freeMinAmount = registerworker;
    }

    public long getFreeRemainingTimes() {
        return this.freeRemainingTimes;
    }

    public void setFreeRemainingTimes(long j) {
        this.freeRemainingTimes = j;
    }

    public long getFreeTimes() {
        return this.freeTimes;
    }

    public void setFreeTimes(long j) {
        this.freeTimes = j;
    }

    @NonNull
    public List<PayMethodInfoResult> getPayMethodInfos() {
        return this.payMethodInfos;
    }

    public void setPayMethodInfos(@NonNull List<PayMethodInfoResult> list) {
        this.payMethodInfos = list;
    }

    @NonNull
    public String getTransferMethod() {
        return this.transferMethod;
    }

    public void setTransferMethod(@NonNull String str) {
        this.transferMethod = str;
    }

    @Nullable
    public List<getMD5> getWithdrawMethodViews() {
        return this.withdrawMethodViews;
    }

    public void setWithdrawMethodViews(@Nullable List<getMD5> list) {
        this.withdrawMethodViews = list;
    }

    public boolean isNullObject() {
        return this.nullObject;
    }
}
