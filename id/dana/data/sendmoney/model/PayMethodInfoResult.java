package id.dana.data.sendmoney.model;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.exists;
import o.registerWorker;

public final class PayMethodInfoResult {
    @NonNull
    private String fundType;
    @NonNull
    private String payMethod;
    @NonNull
    private exists payMethodView;
    @NonNull
    private registerWorker payerMaxAmount;
    @NonNull
    private registerWorker payerMinAmount;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FundType {
        public static final String TRANSFER_B2B = "TRANSFER_B2B";
        public static final String TRANSFER_P2B = "TRANSFER_P2B";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PayMethod {
        public static final String BALANCE = "BALANCE";
        public static final String DEBIT_CARD = "DEBIT_CARD";
    }

    public PayMethodInfoResult() {
    }

    public PayMethodInfoResult(@NonNull String str, @NonNull String str2, @NonNull exists exists, @NonNull registerWorker registerworker, @NonNull registerWorker registerworker2) {
        this.fundType = str;
        this.payMethod = str2;
        this.payMethodView = exists;
        this.payerMaxAmount = registerworker;
        this.payerMinAmount = registerworker2;
    }

    @NonNull
    public final String getFundType() {
        return this.fundType;
    }

    public final void setFundType(@NonNull String str) {
        this.fundType = str;
    }

    @NonNull
    public final String getPayMethod() {
        return this.payMethod;
    }

    public final void setPayMethod(@NonNull String str) {
        this.payMethod = str;
    }

    @NonNull
    public final exists getPayMethodView() {
        return this.payMethodView;
    }

    public final void setPayMethodView(@NonNull exists exists) {
        this.payMethodView = exists;
    }

    @NonNull
    public final registerWorker getPayerMaxAmount() {
        return this.payerMaxAmount;
    }

    public final void setPayerMaxAmount(@NonNull registerWorker registerworker) {
        this.payerMaxAmount = registerworker;
    }

    @NonNull
    public final registerWorker getPayerMinAmount() {
        return this.payerMinAmount;
    }

    public final void setPayerMinAmount(@NonNull registerWorker registerworker) {
        this.payerMinAmount = registerworker;
    }
}
