package o;

import android.text.TextUtils;
import java.util.List;

public class getDataFieldCount {
    /* access modifiers changed from: private */
    public String kyc;
    /* access modifiers changed from: private */
    public boolean needSenderName;
    /* access modifiers changed from: private */
    public String payeeAvatar;
    /* access modifiers changed from: private */
    public String payeeMaskedNickname;
    /* access modifiers changed from: private */
    public String payeeMaskedPhoneNumber;
    /* access modifiers changed from: private */
    public String payeeUserId;
    /* access modifiers changed from: private */
    public stopBleScan payerAccountBalance;
    /* access modifiers changed from: private */
    public String payerMaskedNickname;
    /* access modifiers changed from: private */
    public String payerMaskedPhoneNumber;
    /* access modifiers changed from: private */
    public stopBleScan payerMaxAmount;
    /* access modifiers changed from: private */
    public stopBleScan payerMinAmount;
    /* access modifiers changed from: private */
    public String payerUserId;
    /* access modifiers changed from: private */
    public List<BluetoothUuid> transferMethod;

    public List<BluetoothUuid> getTransferMethod() {
        return this.transferMethod;
    }

    public void setTransferMethod(List<BluetoothUuid> list) {
        this.transferMethod = list;
    }

    public boolean isNeedSenderName() {
        return this.needSenderName;
    }

    public void setNeedSenderName(boolean z) {
        this.needSenderName = z;
    }

    public String getKyc() {
        return this.kyc;
    }

    public void setKyc(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1337428593, oncanceled);
            onCancelLoad.getMin(1337428593, oncanceled);
        }
        this.kyc = str;
    }

    public stopBleScan getPayerAccountBalance() {
        return this.payerAccountBalance;
    }

    public void setPayerAccountBalance(stopBleScan stopblescan) {
        this.payerAccountBalance = stopblescan;
    }

    public String getPayerMaskedNickname() {
        return this.payerMaskedNickname;
    }

    public void setPayerMaskedNickname(String str) {
        this.payerMaskedNickname = str;
    }

    public String getPayerMaskedPhoneNumber() {
        return this.payerMaskedPhoneNumber;
    }

    public void setPayerMaskedPhoneNumber(String str) {
        this.payerMaskedPhoneNumber = str;
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

    public String getPayerUserId() {
        return this.payerUserId;
    }

    public void setPayerUserId(String str) {
        this.payerUserId = str;
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

    public String getPayeeAvatar() {
        return this.payeeAvatar;
    }

    public void setPayeeAvatar(String str) {
        this.payeeAvatar = str;
    }

    public boolean isDanaUser() {
        return !TextUtils.isEmpty(getPayeeUserId());
    }

    public static class setMin {
        private String kyc;
        private boolean needSenderName;
        private String payeeAvatar;
        private String payeeMaskedNickname;
        private String payeeMaskedPhoneNumber;
        private String payeeUserId;
        private stopBleScan payerAccountBalance;
        private String payerMaskedNickname;
        private String payerMaskedPhoneNumber;
        private stopBleScan payerMaxAmount;
        private stopBleScan payerMinAmount;
        private String payerUserId;
        private List<BluetoothUuid> transferMethod;

        public setMin setKyc(String str) {
            this.kyc = str;
            return this;
        }

        public setMin setPayerMaskedNickname(String str) {
            this.payerMaskedNickname = str;
            return this;
        }

        public setMin setPayerMaskedPhoneNumber(String str) {
            this.payerMaskedPhoneNumber = str;
            return this;
        }

        public setMin setPayerUserId(String str) {
            this.payerUserId = str;
            return this;
        }

        public setMin setPayerAccountBalance(stopBleScan stopblescan) {
            this.payerAccountBalance = stopblescan;
            return this;
        }

        public setMin setPayerMaxAmount(stopBleScan stopblescan) {
            this.payerMaxAmount = stopblescan;
            return this;
        }

        public setMin setPayerMinAmount(stopBleScan stopblescan) {
            this.payerMinAmount = stopblescan;
            return this;
        }

        public setMin setNeedSenderName(boolean z) {
            this.needSenderName = z;
            return this;
        }

        public setMin setTransferMethod(List<BluetoothUuid> list) {
            this.transferMethod = list;
            return this;
        }

        public setMin setPayeeMaskedNickname(String str) {
            this.payeeMaskedNickname = str;
            return this;
        }

        public setMin setPayeeMaskedPhoneNumber(String str) {
            this.payeeMaskedPhoneNumber = str;
            return this;
        }

        public setMin setPayeeUserId(String str) {
            this.payeeUserId = str;
            return this;
        }

        public setMin setPayeeAvatar(String str) {
            this.payeeAvatar = str;
            return this;
        }

        public getDataFieldCount build() {
            getDataFieldCount getdatafieldcount = new getDataFieldCount();
            boolean unused = getdatafieldcount.needSenderName = this.needSenderName;
            List unused2 = getdatafieldcount.transferMethod = this.transferMethod;
            String unused3 = getdatafieldcount.kyc = this.kyc;
            String unused4 = getdatafieldcount.payerMaskedNickname = this.payerMaskedNickname;
            String unused5 = getdatafieldcount.payerMaskedPhoneNumber = this.payerMaskedPhoneNumber;
            String unused6 = getdatafieldcount.payerUserId = this.payerUserId;
            stopBleScan unused7 = getdatafieldcount.payerAccountBalance = this.payerAccountBalance;
            stopBleScan unused8 = getdatafieldcount.payerMaxAmount = this.payerMaxAmount;
            stopBleScan unused9 = getdatafieldcount.payerMinAmount = this.payerMinAmount;
            String unused10 = getdatafieldcount.payeeMaskedNickname = this.payeeMaskedNickname;
            String unused11 = getdatafieldcount.payeeMaskedPhoneNumber = this.payeeMaskedPhoneNumber;
            String unused12 = getdatafieldcount.payeeUserId = this.payeeUserId;
            String unused13 = getdatafieldcount.payeeAvatar = this.payeeAvatar;
            return getdatafieldcount;
        }
    }
}
