package o;

import java.util.List;

public class BleResult {
    /* access modifiers changed from: private */
    public String channelIndex;
    /* access modifiers changed from: private */
    public boolean enableStatus;
    /* access modifiers changed from: private */
    public String instId;
    /* access modifiers changed from: private */
    public String instLocalName;
    /* access modifiers changed from: private */
    public String instName;
    /* access modifiers changed from: private */
    public String payMethod;
    /* access modifiers changed from: private */
    public String payOption;
    /* access modifiers changed from: private */
    public List<getIdentifierByteCount> payOptionDTOResponses;

    private BleResult() {
    }

    public String getChannelIndex() {
        return this.channelIndex;
    }

    public boolean isEnableStatus() {
        return this.enableStatus;
    }

    public String getInstId() {
        return this.instId;
    }

    public String getInstLocalName() {
        return this.instLocalName;
    }

    public String getInstName() {
        return this.instName;
    }

    public String getPayMethod() {
        return this.payMethod;
    }

    public String getPayOption() {
        return this.payOption;
    }

    public List<getIdentifierByteCount> getPayOptionDTOResponses() {
        return this.payOptionDTOResponses;
    }

    public void setPayOptionDTOResponses(List<getIdentifierByteCount> list) {
        this.payOptionDTOResponses = list;
    }

    public static class setMax {
        private String channelIndex;
        private boolean enableStatus;
        private String instId;
        private String instLocalName;
        private String instName;
        private String payMethod;
        private String payOption;
        private List<getIdentifierByteCount> payOptionDTOResponses;

        public setMax channelIndex(String str) {
            this.channelIndex = str;
            return this;
        }

        public setMax enableStatus(boolean z) {
            this.enableStatus = z;
            return this;
        }

        public setMax instId(String str) {
            this.instId = str;
            return this;
        }

        public setMax instLocalName(String str) {
            this.instLocalName = str;
            return this;
        }

        public setMax instName(String str) {
            this.instName = str;
            return this;
        }

        public setMax payMethod(String str) {
            this.payMethod = str;
            return this;
        }

        public setMax payOption(String str) {
            this.payOption = str;
            return this;
        }

        public setMax payMethodInfos(List<getIdentifierByteCount> list) {
            this.payOptionDTOResponses = list;
            return this;
        }

        public BleResult build() {
            BleResult bleResult = new BleResult();
            String unused = bleResult.channelIndex = this.channelIndex;
            boolean unused2 = bleResult.enableStatus = this.enableStatus;
            String unused3 = bleResult.instId = this.instId;
            String unused4 = bleResult.instLocalName = this.instLocalName;
            String unused5 = bleResult.instName = this.instName;
            String unused6 = bleResult.payMethod = this.payMethod;
            String unused7 = bleResult.payOption = this.payOption;
            List unused8 = bleResult.payOptionDTOResponses = this.payOptionDTOResponses;
            return bleResult;
        }
    }
}
