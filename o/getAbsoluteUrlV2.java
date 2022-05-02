package o;

import java.util.List;
import java.util.Map;

public class getAbsoluteUrlV2 {
    private String assetType;
    private String bindingId;
    private String cardBin;
    private String cardIndexNo;
    private int cardNoLength;
    private String cardScheme;
    private boolean defaultCard;
    private boolean enableStatus;
    private String expiryMonth;
    private String expiryYear;
    private Map<String, String> extendInfo;
    private Map<String, String> holderName;
    private String instId;
    private String instLocalName;
    private String instName;
    private String maskedCardNo;
    private String offlinePayIndex;
    private String payMethod;
    private String payOption;
    private List<String> payVerifyElements;
    private boolean payWithoutCVV;

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((((((((((((((((((((getAssetType() != null ? getAssetType().hashCode() : 0) * 31) + (getBindingId() != null ? getBindingId().hashCode() : 0)) * 31) + (getCardBin() != null ? getCardBin().hashCode() : 0)) * 31) + (getCardIndexNo() != null ? getCardIndexNo().hashCode() : 0)) * 31) + getCardNoLength()) * 31) + (getCardScheme() != null ? getCardScheme().hashCode() : 0)) * 31) + (isDefaultCard() ? 1 : 0)) * 31) + (isEnableStatus() ? 1 : 0)) * 31) + (getExpiryMonth() != null ? getExpiryMonth().hashCode() : 0)) * 31) + (getExpiryYear() != null ? getExpiryYear().hashCode() : 0)) * 31) + (getExtendInfo() != null ? getExtendInfo().hashCode() : 0)) * 31) + (getHolderName() != null ? getHolderName().hashCode() : 0)) * 31) + (getInstId() != null ? getInstId().hashCode() : 0)) * 31) + (getInstName() != null ? getInstName().hashCode() : 0)) * 31) + (getMaskedCardNo() != null ? getMaskedCardNo().hashCode() : 0)) * 31) + (getOfflinePayIndex() != null ? getOfflinePayIndex().hashCode() : 0)) * 31) + (getPayMethod() != null ? getPayMethod().hashCode() : 0)) * 31) + (getPayOption() != null ? getPayOption().hashCode() : 0)) * 31;
        if (getPayVerifyElements() != null) {
            i = getPayVerifyElements().hashCode();
        }
        return ((hashCode + i) * 31) + (isPayWithoutCVV() ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            getAbsoluteUrlV2 getabsoluteurlv2 = (getAbsoluteUrlV2) obj;
            if (getCardNoLength() != getabsoluteurlv2.getCardNoLength() || isDefaultCard() != getabsoluteurlv2.isDefaultCard() || isEnableStatus() != getabsoluteurlv2.isEnableStatus() || isPayWithoutCVV() != getabsoluteurlv2.isPayWithoutCVV()) {
                return false;
            }
            if (getAssetType() == null ? getabsoluteurlv2.getAssetType() != null : !getAssetType().equals(getabsoluteurlv2.getAssetType())) {
                return false;
            }
            if (getBindingId() == null ? getabsoluteurlv2.getBindingId() != null : !getBindingId().equals(getabsoluteurlv2.getBindingId())) {
                return false;
            }
            if (getCardBin() == null ? getabsoluteurlv2.getCardBin() != null : !getCardBin().equals(getabsoluteurlv2.getCardBin())) {
                return false;
            }
            if (getCardIndexNo() == null ? getabsoluteurlv2.getCardIndexNo() != null : !getCardIndexNo().equals(getabsoluteurlv2.getCardIndexNo())) {
                return false;
            }
            if (getCardScheme() == null ? getabsoluteurlv2.getCardScheme() != null : !getCardScheme().equals(getabsoluteurlv2.getCardScheme())) {
                return false;
            }
            if (getExpiryMonth() == null ? getabsoluteurlv2.getExpiryMonth() != null : !getExpiryMonth().equals(getabsoluteurlv2.getExpiryMonth())) {
                return false;
            }
            if (getExpiryYear() == null ? getabsoluteurlv2.getExpiryYear() != null : !getExpiryYear().equals(getabsoluteurlv2.getExpiryYear())) {
                return false;
            }
            if (getExtendInfo() == null ? getabsoluteurlv2.getExtendInfo() != null : !getExtendInfo().equals(getabsoluteurlv2.getExtendInfo())) {
                return false;
            }
            if (getHolderName() == null ? getabsoluteurlv2.getHolderName() != null : !getHolderName().equals(getabsoluteurlv2.getHolderName())) {
                return false;
            }
            if (getInstId() == null ? getabsoluteurlv2.getInstId() != null : !getInstId().equals(getabsoluteurlv2.getInstId())) {
                return false;
            }
            if (getInstName() == null ? getabsoluteurlv2.getInstName() != null : !getInstName().equals(getabsoluteurlv2.getInstName())) {
                return false;
            }
            if (getMaskedCardNo() == null ? getabsoluteurlv2.getMaskedCardNo() != null : !getMaskedCardNo().equals(getabsoluteurlv2.getMaskedCardNo())) {
                return false;
            }
            if (getOfflinePayIndex() == null ? getabsoluteurlv2.getOfflinePayIndex() != null : !getOfflinePayIndex().equals(getabsoluteurlv2.getOfflinePayIndex())) {
                return false;
            }
            if (getPayMethod() == null ? getabsoluteurlv2.getPayMethod() != null : !getPayMethod().equals(getabsoluteurlv2.getPayMethod())) {
                return false;
            }
            if (getPayOption() == null ? getabsoluteurlv2.getPayOption() != null : !getPayOption().equals(getabsoluteurlv2.getPayOption())) {
                return false;
            }
            if (getPayVerifyElements() != null) {
                return getPayVerifyElements().equals(getabsoluteurlv2.getPayVerifyElements());
            }
            if (getabsoluteurlv2.getPayVerifyElements() == null) {
                return true;
            }
        }
        return false;
    }

    public String getAssetType() {
        return this.assetType;
    }

    public void setAssetType(String str) {
        this.assetType = str;
    }

    public String getBindingId() {
        return this.bindingId;
    }

    public void setBindingId(String str) {
        this.bindingId = str;
    }

    public String getCardBin() {
        return this.cardBin;
    }

    public void setCardBin(String str) {
        this.cardBin = str;
    }

    public String getCardIndexNo() {
        return this.cardIndexNo;
    }

    public void setCardIndexNo(String str) {
        this.cardIndexNo = str;
    }

    public int getCardNoLength() {
        return this.cardNoLength;
    }

    public void setCardNoLength(int i) {
        this.cardNoLength = i;
    }

    public String getCardScheme() {
        return this.cardScheme;
    }

    public void setCardScheme(String str) {
        this.cardScheme = str;
    }

    public boolean isDefaultCard() {
        return this.defaultCard;
    }

    public void setDefaultCard(boolean z) {
        this.defaultCard = z;
    }

    public boolean isEnableStatus() {
        return this.enableStatus;
    }

    public void setEnableStatus(boolean z) {
        this.enableStatus = z;
    }

    public String getExpiryMonth() {
        return this.expiryMonth;
    }

    public void setExpiryMonth(String str) {
        this.expiryMonth = str;
    }

    public String getExpiryYear() {
        return this.expiryYear;
    }

    public void setExpiryYear(String str) {
        this.expiryYear = str;
    }

    public Map<String, String> getExtendInfo() {
        return this.extendInfo;
    }

    public void setExtendInfo(Map<String, String> map) {
        this.extendInfo = map;
    }

    public Map<String, String> getHolderName() {
        return this.holderName;
    }

    public void setHolderName(Map<String, String> map) {
        this.holderName = map;
    }

    public String getInstId() {
        return this.instId;
    }

    public void setInstId(String str) {
        this.instId = str;
    }

    public String getInstLocalName() {
        return this.instLocalName;
    }

    public void setInstLocalName(String str) {
        this.instLocalName = str;
    }

    public String getInstName() {
        return this.instName;
    }

    public void setInstName(String str) {
        this.instName = str;
    }

    public String getMaskedCardNo() {
        return this.maskedCardNo;
    }

    public void setMaskedCardNo(String str) {
        this.maskedCardNo = str;
    }

    public String getOfflinePayIndex() {
        return this.offlinePayIndex;
    }

    public void setOfflinePayIndex(String str) {
        this.offlinePayIndex = str;
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

    public List<String> getPayVerifyElements() {
        return this.payVerifyElements;
    }

    public void setPayVerifyElements(List<String> list) {
        this.payVerifyElements = list;
    }

    public boolean isPayWithoutCVV() {
        return this.payWithoutCVV;
    }

    public void setPayWithoutCVV(boolean z) {
        this.payWithoutCVV = z;
    }

    public static class getMin {
        private String assetType;
        private String bindingId;
        private String cardBin;
        private String cardIndexNo;
        private int cardNoLength;
        private String cardScheme;
        private boolean defaultCard;
        private boolean enableStatus;
        private String expiryMonth;
        private String expiryYear;
        private Map<String, String> extendInfo;
        private Map<String, String> holderName;
        private String instId;
        private String instLocalName;
        private String instName;
        private String maskedCardNo;
        private String offlinePayIndex;
        private String payMethod;
        private String payOption;
        private List<String> payVerifyElements;
        private boolean payWithoutCVV;

        public getMin setInsLocalName(String str) {
            setInstLocalName(str);
            return this;
        }

        public getAbsoluteUrlV2 build() {
            getAbsoluteUrlV2 getabsoluteurlv2 = new getAbsoluteUrlV2();
            getabsoluteurlv2.setAssetType(getAssetType());
            getabsoluteurlv2.setBindingId(getBindingId());
            getabsoluteurlv2.setCardBin(getCardBin());
            getabsoluteurlv2.setCardIndexNo(getCardIndexNo());
            getabsoluteurlv2.setCardNoLength(getCardNoLength());
            getabsoluteurlv2.setCardScheme(getCardScheme());
            getabsoluteurlv2.setDefaultCard(isDefaultCard());
            getabsoluteurlv2.setEnableStatus(isEnableStatus());
            getabsoluteurlv2.setExpiryMonth(getExpiryMonth());
            getabsoluteurlv2.setExpiryYear(getExpiryYear());
            getabsoluteurlv2.setExtendInfo(getExtendInfo());
            getabsoluteurlv2.setHolderName(getHolderName());
            getabsoluteurlv2.setInstId(getInstId());
            getabsoluteurlv2.setInstName(getInstName());
            getabsoluteurlv2.setMaskedCardNo(getMaskedCardNo());
            getabsoluteurlv2.setOfflinePayIndex(getOfflinePayIndex());
            getabsoluteurlv2.setPayMethod(getPayMethod());
            getabsoluteurlv2.setPayOption(getPayOption());
            getabsoluteurlv2.setPayVerifyElements(getPayVerifyElements());
            getabsoluteurlv2.setPayWithoutCVV(isPayWithoutCVV());
            getabsoluteurlv2.setInstLocalName(getInstLocalName());
            return getabsoluteurlv2;
        }

        public String getAssetType() {
            return this.assetType;
        }

        public getMin setAssetType(String str) {
            this.assetType = str;
            return this;
        }

        public String getBindingId() {
            return this.bindingId;
        }

        public getMin setBindingId(String str) {
            this.bindingId = str;
            return this;
        }

        public String getCardBin() {
            return this.cardBin;
        }

        public getMin setCardBin(String str) {
            this.cardBin = str;
            return this;
        }

        public String getCardIndexNo() {
            return this.cardIndexNo;
        }

        public getMin setCardIndexNo(String str) {
            this.cardIndexNo = str;
            return this;
        }

        public int getCardNoLength() {
            return this.cardNoLength;
        }

        public getMin setCardNoLength(int i) {
            this.cardNoLength = i;
            return this;
        }

        public String getCardScheme() {
            return this.cardScheme;
        }

        public getMin setCardScheme(String str) {
            this.cardScheme = str;
            return this;
        }

        public boolean isDefaultCard() {
            return this.defaultCard;
        }

        public getMin setDefaultCard(boolean z) {
            this.defaultCard = z;
            return this;
        }

        public boolean isEnableStatus() {
            return this.enableStatus;
        }

        public getMin setEnableStatus(boolean z) {
            this.enableStatus = z;
            return this;
        }

        public String getExpiryMonth() {
            return this.expiryMonth;
        }

        public getMin setExpiryMonth(String str) {
            this.expiryMonth = str;
            return this;
        }

        public String getExpiryYear() {
            return this.expiryYear;
        }

        public getMin setExpiryYear(String str) {
            this.expiryYear = str;
            return this;
        }

        public Map<String, String> getExtendInfo() {
            return this.extendInfo;
        }

        public getMin setExtendInfo(Map<String, String> map) {
            this.extendInfo = map;
            return this;
        }

        public Map<String, String> getHolderName() {
            return this.holderName;
        }

        public getMin setHolderName(Map<String, String> map) {
            this.holderName = map;
            return this;
        }

        public String getInstId() {
            return this.instId;
        }

        public getMin setInstId(String str) {
            this.instId = str;
            return this;
        }

        public String getInstLocalName() {
            return this.instLocalName;
        }

        public void setInstLocalName(String str) {
            this.instLocalName = str;
        }

        public String getInstName() {
            return this.instName;
        }

        public getMin setInstName(String str) {
            this.instName = str;
            return this;
        }

        public String getMaskedCardNo() {
            return this.maskedCardNo;
        }

        public getMin setMaskedCardNo(String str) {
            this.maskedCardNo = str;
            return this;
        }

        public String getOfflinePayIndex() {
            return this.offlinePayIndex;
        }

        public getMin setOfflinePayIndex(String str) {
            this.offlinePayIndex = str;
            return this;
        }

        public String getPayMethod() {
            return this.payMethod;
        }

        public getMin setPayMethod(String str) {
            this.payMethod = str;
            return this;
        }

        public String getPayOption() {
            return this.payOption;
        }

        public getMin setPayOption(String str) {
            this.payOption = str;
            return this;
        }

        public List<String> getPayVerifyElements() {
            return this.payVerifyElements;
        }

        public getMin setPayVerifyElements(List<String> list) {
            this.payVerifyElements = list;
            return this;
        }

        public boolean isPayWithoutCVV() {
            return this.payWithoutCVV;
        }

        public getMin setPayWithoutCVV(boolean z) {
            this.payWithoutCVV = z;
            return this;
        }
    }
}
