package o;

import java.util.List;
import java.util.Map;

public class ToastUtils extends initWithSecurityGuard {
    private String countryCode;
    private String defaultOption;
    private boolean focusFirstCard;
    private List<UCUtils> payMethodViews;
    private boolean scannerEnable;
    private List<getAbsoluteUrlV2> standardCardOptionViews;

    public int hashCode() {
        int i = 0;
        int hashCode = (((getDefaultOption() != null ? getDefaultOption().hashCode() : 0) * 31) + (getPayMethodViews() != null ? getPayMethodViews().hashCode() : 0)) * 31;
        if (getStandardCardOptionViews() != null) {
            i = getStandardCardOptionViews().hashCode();
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ToastUtils toastUtils = (ToastUtils) obj;
            if (getDefaultOption() == null ? toastUtils.getDefaultOption() != null : !getDefaultOption().equals(toastUtils.getDefaultOption())) {
                return false;
            }
            if (getPayMethodViews() == null ? toastUtils.getPayMethodViews() != null : !getPayMethodViews().equals(toastUtils.getPayMethodViews())) {
                return false;
            }
            if (getStandardCardOptionViews() != null) {
                return getStandardCardOptionViews().equals(toastUtils.getStandardCardOptionViews());
            }
            if (toastUtils.getStandardCardOptionViews() == null) {
                return true;
            }
        }
        return false;
    }

    public class TYPE {
        private isMain amountRange;
        private String bankCode;
        private String disableReason;
        private boolean enableStatus;
        private Map<String, String> extendInfo;
        private String instId;
        private String instLocalName;
        private String instName;
        private boolean interBank;
        private stopBleScan maxAmount;
        private stopBleScan minAmount;
        private String offlinePayIndex;
        private String payAccountNo;
        private String payMethod;
        private String payOption;
        private List<String> supportCountries;

        public int hashCode() {
            int i = 0;
            int hashCode = (((((((((((((((((((((((((((getAmountRange() != null ? getAmountRange().hashCode() : 0) * 31) + (getBankCode() != null ? getBankCode().hashCode() : 0)) * 31) + (getDisableReason() != null ? getDisableReason().hashCode() : 0)) * 31) + (isEnableStatus() ? 1 : 0)) * 31) + (getExtendInfo() != null ? getExtendInfo().hashCode() : 0)) * 31) + (getInstId() != null ? getInstId().hashCode() : 0)) * 31) + (getInstName() != null ? getInstName().hashCode() : 0)) * 31) + (isInterBank() ? 1 : 0)) * 31) + (getOfflinePayIndex() != null ? getOfflinePayIndex().hashCode() : 0)) * 31) + (getPayAccountNo() != null ? getPayAccountNo().hashCode() : 0)) * 31) + (getPayMethod() != null ? getPayMethod().hashCode() : 0)) * 31) + (getPayOption() != null ? getPayOption().hashCode() : 0)) * 31) + (getMinAmount() != null ? getMinAmount().hashCode() : 0)) * 31) + (getMaxAmount() != null ? getMaxAmount().hashCode() : 0)) * 31;
            if (getSupportCountries() != null) {
                i = getSupportCountries().hashCode();
            }
            return hashCode + i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TYPE)) {
                return false;
            }
            TYPE type = (TYPE) obj;
            if (isEnableStatus() != type.isEnableStatus() || isInterBank() != type.isInterBank()) {
                return false;
            }
            if (getAmountRange() == null ? type.getAmountRange() != null : !getAmountRange().equals(type.getAmountRange())) {
                return false;
            }
            if (getBankCode() == null ? type.getBankCode() != null : !getBankCode().equals(type.getBankCode())) {
                return false;
            }
            if (getDisableReason() == null ? type.getDisableReason() != null : !getDisableReason().equals(type.getDisableReason())) {
                return false;
            }
            if (getExtendInfo() == null ? type.getExtendInfo() != null : !getExtendInfo().equals(type.getExtendInfo())) {
                return false;
            }
            if (getInstId() == null ? type.getInstId() != null : !getInstId().equals(type.getInstId())) {
                return false;
            }
            if (getInstName() == null ? type.getInstName() != null : !getInstName().equals(type.getInstName())) {
                return false;
            }
            if (getOfflinePayIndex() == null ? type.getOfflinePayIndex() != null : !getOfflinePayIndex().equals(type.getOfflinePayIndex())) {
                return false;
            }
            if (getPayAccountNo() == null ? type.getPayAccountNo() != null : !getPayAccountNo().equals(type.getPayAccountNo())) {
                return false;
            }
            if (getPayMethod() == null ? type.getPayMethod() != null : !getPayMethod().equals(type.getPayMethod())) {
                return false;
            }
            if (getPayOption() == null ? type.getPayOption() != null : !getPayOption().equals(type.getPayOption())) {
                return false;
            }
            if (getMinAmount() == null ? type.getMinAmount() != null : !getMinAmount().equals(type.getMinAmount())) {
                return false;
            }
            if (getMaxAmount() == null ? type.getMaxAmount() != null : !getMaxAmount().equals(type.getMaxAmount())) {
                return false;
            }
            if (getSupportCountries() != null) {
                return getSupportCountries().equals(type.getSupportCountries());
            }
            return type.getSupportCountries() == null;
        }

        public isMain getAmountRange() {
            return this.amountRange;
        }

        public void setAmountRange(isMain ismain) {
            this.amountRange = ismain;
        }

        public String getBankCode() {
            return this.bankCode;
        }

        public void setBankCode(String str) {
            this.bankCode = str;
        }

        public String getDisableReason() {
            return this.disableReason;
        }

        public void setDisableReason(String str) {
            this.disableReason = str;
        }

        public boolean isEnableStatus() {
            return this.enableStatus;
        }

        public void setEnableStatus(boolean z) {
            this.enableStatus = z;
        }

        public Map<String, String> getExtendInfo() {
            return this.extendInfo;
        }

        public void setExtendInfo(Map<String, String> map) {
            this.extendInfo = map;
        }

        public String getInstId() {
            return this.instId;
        }

        public void setInstId(String str) {
            this.instId = str;
        }

        public String getInstName() {
            return this.instName;
        }

        public void setInstName(String str) {
            this.instName = str;
        }

        public String getInstLocalName() {
            return this.instLocalName;
        }

        public void setInstLocalName(String str) {
            this.instLocalName = str;
        }

        public boolean isInterBank() {
            return this.interBank;
        }

        public void setInterBank(boolean z) {
            this.interBank = z;
        }

        public String getOfflinePayIndex() {
            return this.offlinePayIndex;
        }

        public void setOfflinePayIndex(String str) {
            this.offlinePayIndex = str;
        }

        public String getPayAccountNo() {
            return this.payAccountNo;
        }

        public void setPayAccountNo(String str) {
            this.payAccountNo = str;
        }

        public String getPayMethod() {
            return this.payMethod;
        }

        public void setPayMethod(String str) {
            this.payMethod = str;
        }

        public String getPayOption() {
            return this.payOption;
        }

        public void setPayOption(String str) {
            this.payOption = str;
        }

        public stopBleScan getMinAmount() {
            return this.minAmount;
        }

        public void setMinAmount(stopBleScan stopblescan) {
            this.minAmount = stopblescan;
        }

        public stopBleScan getMaxAmount() {
            return this.maxAmount;
        }

        public void setMaxAmount(stopBleScan stopblescan) {
            this.maxAmount = stopblescan;
        }

        public List<String> getSupportCountries() {
            return this.supportCountries;
        }

        public void setSupportCountries(List<String> list) {
            this.supportCountries = list;
        }

        public static class setMax {
            private isMain amountRange;
            private String bankCode;
            private String disableReason;
            private boolean enableStatus;
            private Map<String, String> extendInfo;
            private String instId;
            private String instName;
            private boolean interBank;
            private stopBleScan maxAmount;
            private stopBleScan minAmount;
            private String offlinePayIndex;
            private String payAccountNo;
            private String payMethod;
            private String payOption;
            private List<String> supportCountries;

            public setMax setAmountRange(isMain ismain) {
                this.amountRange = ismain;
                return this;
            }

            public setMax setBankCode(String str) {
                this.bankCode = str;
                return this;
            }

            public setMax setDisableReason(String str) {
                this.disableReason = str;
                return this;
            }

            public setMax setEnableStatus(boolean z) {
                this.enableStatus = z;
                return this;
            }

            public setMax setExtendInfo(Map<String, String> map) {
                this.extendInfo = map;
                return this;
            }

            public setMax setInstId(String str) {
                this.instId = str;
                return this;
            }

            public setMax setInstName(String str) {
                this.instName = str;
                return this;
            }

            public setMax setInterBank(boolean z) {
                this.interBank = z;
                return this;
            }

            public setMax setOfflinePayIndex(String str) {
                this.offlinePayIndex = str;
                return this;
            }

            public setMax setPayAccountNo(String str) {
                this.payAccountNo = str;
                return this;
            }

            public setMax setPayMethod(String str) {
                this.payMethod = str;
                return this;
            }

            public setMax setPayOption(String str) {
                this.payOption = str;
                return this;
            }

            public setMax setMinAmount(stopBleScan stopblescan) {
                this.minAmount = stopblescan;
                return this;
            }

            public setMax setMaxAmount(stopBleScan stopblescan) {
                this.maxAmount = stopblescan;
                return this;
            }

            public setMax setSupportCountries(List<String> list) {
                this.supportCountries = list;
                return this;
            }

            public TYPE build() {
                TYPE type = new TYPE();
                type.setAmountRange(getAmountRange());
                type.setBankCode(getBankCode());
                type.setDisableReason(getDisableReason());
                type.setEnableStatus(isEnableStatus());
                type.setExtendInfo(getExtendInfo());
                type.setInstId(getInstId());
                type.setInstName(getInstName());
                type.setInterBank(isInterBank());
                type.setOfflinePayIndex(getOfflinePayIndex());
                type.setPayAccountNo(getPayAccountNo());
                type.setPayMethod(getPayMethod());
                type.setPayOption(getPayOption());
                type.setMinAmount(getMinAmount());
                type.setMaxAmount(getMaxAmount());
                type.setSupportCountries(getSupportCountries());
                return type;
            }

            public isMain getAmountRange() {
                return this.amountRange;
            }

            public String getBankCode() {
                return this.bankCode;
            }

            public String getDisableReason() {
                return this.disableReason;
            }

            public boolean isEnableStatus() {
                return this.enableStatus;
            }

            public Map<String, String> getExtendInfo() {
                return this.extendInfo;
            }

            public String getInstId() {
                return this.instId;
            }

            public String getInstName() {
                return this.instName;
            }

            public boolean isInterBank() {
                return this.interBank;
            }

            public String getOfflinePayIndex() {
                return this.offlinePayIndex;
            }

            public String getPayAccountNo() {
                return this.payAccountNo;
            }

            public String getPayMethod() {
                return this.payMethod;
            }

            public String getPayOption() {
                return this.payOption;
            }

            public stopBleScan getMinAmount() {
                return this.minAmount;
            }

            public stopBleScan getMaxAmount() {
                return this.maxAmount;
            }

            public List<String> getSupportCountries() {
                return this.supportCountries;
            }
        }
    }

    public String getDefaultOption() {
        return this.defaultOption;
    }

    public void setDefaultOption(String str) {
        this.defaultOption = str;
    }

    public List<UCUtils> getPayMethodViews() {
        return this.payMethodViews;
    }

    public void setPayMethodViews(List<UCUtils> list) {
        this.payMethodViews = list;
    }

    public List<getAbsoluteUrlV2> getStandardCardOptionViews() {
        return this.standardCardOptionViews;
    }

    public void setStandardCardOptionViews(List<getAbsoluteUrlV2> list) {
        this.standardCardOptionViews = list;
    }

    public boolean isScannerEnable() {
        return this.scannerEnable;
    }

    public void setScannerEnable(boolean z) {
        this.scannerEnable = z;
    }

    public boolean isFocusFirstCard() {
        return this.focusFirstCard;
    }

    public void setFocusFirstCard(boolean z) {
        this.focusFirstCard = z;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }
}
