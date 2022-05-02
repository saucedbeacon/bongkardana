package o;

import java.util.List;

public class getPowerCorrection {
    /* access modifiers changed from: private */
    public String avatarUrl;
    /* access modifiers changed from: private */
    public onConfigChanged kyc;
    /* access modifiers changed from: private */
    public List<getIdentifierByteCount> payOptions;
    /* access modifiers changed from: private */
    public String payeeMaskedNickname;
    /* access modifiers changed from: private */
    public String payeeMaskedPhoneNumber;
    /* access modifiers changed from: private */
    public String payeeUserId;
    /* access modifiers changed from: private */
    public stopBleScan payerAccountBalance;
    /* access modifiers changed from: private */
    public stopBleScan payerMaxAmount;
    /* access modifiers changed from: private */
    public stopBleScan payerMinAmount;

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public onConfigChanged getKyc() {
        return this.kyc;
    }

    public void setKyc(onConfigChanged onconfigchanged) {
        this.kyc = onconfigchanged;
    }

    public List<getIdentifierByteCount> getPayOptions() {
        return this.payOptions;
    }

    public void setPayOptions(List<getIdentifierByteCount> list) {
        this.payOptions = list;
    }

    public String getPayeeMaskedNickname() {
        return this.payeeMaskedNickname;
    }

    public void setPayeeMaskedNickname(String str) {
        this.payeeMaskedNickname = str;
    }

    public String getPayeeMaskedPhoneNumber() {
        return this.payeeMaskedPhoneNumber;
    }

    public void setPayeeMaskedPhoneNumber(String str) {
        this.payeeMaskedPhoneNumber = str;
    }

    public String getPayeeUserId() {
        return this.payeeUserId;
    }

    public void setPayeeUserId(String str) {
        this.payeeUserId = str;
    }

    public stopBleScan getPayerAccountBalance() {
        return this.payerAccountBalance;
    }

    public String getCurrency() {
        stopBleScan stopblescan = this.payerAccountBalance;
        return stopblescan == null ? "" : stopblescan.getCurrency();
    }

    public String getAmount() {
        stopBleScan stopblescan = this.payerAccountBalance;
        return stopblescan == null ? "" : stopblescan.getAmount();
    }

    public void setPayerAccountBalance(stopBleScan stopblescan) {
        this.payerAccountBalance = stopblescan;
    }

    public stopBleScan getPayerMaxAmount() {
        return this.payerMaxAmount;
    }

    public void setPayerMaxAmount(stopBleScan stopblescan) {
        this.payerMaxAmount = stopblescan;
    }

    public stopBleScan getPayerMinAmount() {
        return this.payerMinAmount;
    }

    public void setPayerMinAmount(stopBleScan stopblescan) {
        this.payerMinAmount = stopblescan;
    }

    public static class setMax {
        private String avatarUrl;
        private onConfigChanged kyc;
        private List<getIdentifierByteCount> payOptions;
        private String payeeMaskedNickname;
        private String payeeMaskedPhoneNumber;
        private String payeeUserId;
        private stopBleScan payerAccountBalance;
        private stopBleScan payerMaxAmount;
        private stopBleScan payerMinAmount;

        public setMax setAvatarUrl(String str) {
            this.avatarUrl = str;
            return this;
        }

        public setMax setKyc(onConfigChanged onconfigchanged) {
            this.kyc = onconfigchanged;
            return this;
        }

        public setMax setPayOptions(List<getIdentifierByteCount> list) {
            this.payOptions = list;
            return this;
        }

        public setMax setPayeeMaskedNickname(String str) {
            this.payeeMaskedNickname = str;
            return this;
        }

        public setMax setPayeeMaskedPhoneNumber(String str) {
            this.payeeMaskedPhoneNumber = str;
            return this;
        }

        public setMax setPayeeUserId(String str) {
            this.payeeUserId = str;
            return this;
        }

        public setMax setPayerAccountBalance(stopBleScan stopblescan) {
            this.payerAccountBalance = stopblescan;
            return this;
        }

        public setMax setPayerMaxAmount(stopBleScan stopblescan) {
            this.payerMaxAmount = stopblescan;
            return this;
        }

        public setMax setPayerMinAmount(stopBleScan stopblescan) {
            this.payerMinAmount = stopblescan;
            return this;
        }

        public getPowerCorrection build() {
            getPowerCorrection getpowercorrection = new getPowerCorrection();
            String unused = getpowercorrection.avatarUrl = this.avatarUrl;
            onConfigChanged unused2 = getpowercorrection.kyc = this.kyc;
            List unused3 = getpowercorrection.payOptions = this.payOptions;
            String unused4 = getpowercorrection.payeeMaskedNickname = this.payeeMaskedNickname;
            String unused5 = getpowercorrection.payeeMaskedPhoneNumber = this.payeeMaskedPhoneNumber;
            String unused6 = getpowercorrection.payeeUserId = this.payeeUserId;
            stopBleScan unused7 = getpowercorrection.payerAccountBalance = this.payerAccountBalance;
            stopBleScan unused8 = getpowercorrection.payerMaxAmount = this.payerMaxAmount;
            stopBleScan unused9 = getpowercorrection.payerMinAmount = this.payerMinAmount;
            return getpowercorrection;
        }
    }
}
