package id.dana.data.sendmoney.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.registerWorker;

public class TransferUserInfoResult {
    @Nullable
    private String avatar;
    @Nullable
    private registerWorker balanceAmount;
    @NonNull
    private boolean certified;
    @NonNull
    private String kycLevel;
    @Nullable
    private String maskedLoginId;
    @Nullable
    private String maskedNickname;
    @Nullable
    private String userId;

    @Retention(RetentionPolicy.SOURCE)
    public @interface KycLevel {
        public static final String KYC_0 = "00";
        public static final String KYC_1 = "01";
        public static final String KYC_2 = "02";
        public static final String OLD_KYC_0 = "KYC0";
        public static final String OLD_KYC_1 = "KYC1";
        public static final String OLD_KYC_2 = "KYC2";
    }

    public TransferUserInfoResult() {
    }

    public TransferUserInfoResult(@Nullable registerWorker registerworker, boolean z, @NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.balanceAmount = registerworker;
        this.certified = z;
        this.kycLevel = str;
        this.maskedLoginId = str2;
        this.maskedNickname = str3;
        this.userId = str4;
        this.avatar = str5;
    }

    @Nullable
    public registerWorker getBalanceAmount() {
        return this.balanceAmount;
    }

    public void setBalanceAmount(@Nullable registerWorker registerworker) {
        this.balanceAmount = registerworker;
    }

    @NonNull
    public boolean getCertified() {
        return this.certified;
    }

    @NonNull
    public String getKycLevel() {
        return this.kycLevel;
    }

    public void setKycLevel(@NonNull String str) {
        this.kycLevel = str;
    }

    @Nullable
    public String getMaskedLoginId() {
        return this.maskedLoginId;
    }

    public void setMaskedLoginId(@Nullable String str) {
        this.maskedLoginId = str;
    }

    @Nullable
    public String getMaskedNickname() {
        return this.maskedNickname;
    }

    public void setMaskedNickname(@Nullable String str) {
        this.maskedNickname = str;
    }

    @Nullable
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(@Nullable String str) {
        this.userId = str;
    }

    public boolean isCertified() {
        return this.certified;
    }

    public void setCertified(@NonNull boolean z) {
        this.certified = z;
    }

    @Nullable
    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(@Nullable String str) {
        this.avatar = str;
    }
}
