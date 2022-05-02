package o;

public class BluetoothState {
    /* access modifiers changed from: private */
    public String bindingId;
    /* access modifiers changed from: private */
    public String cardIndexNo;
    /* access modifiers changed from: private */
    public int cardNoLength;
    /* access modifiers changed from: private */
    public boolean disable;
    /* access modifiers changed from: private */
    public String formattedHolderName;
    /* access modifiers changed from: private */
    public String formattedMaskedCardNo;
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
    public boolean validData;

    private BluetoothState() {
    }

    public String getBindingId() {
        return this.bindingId;
    }

    public String getCardIndexNo() {
        return this.cardIndexNo;
    }

    public int getCardNoLength() {
        return this.cardNoLength;
    }

    public boolean isDisable() {
        return this.disable;
    }

    public String getFormattedHolderName() {
        return this.formattedHolderName;
    }

    public String getFormattedMaskedCardNo() {
        return this.formattedMaskedCardNo;
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

    public boolean isValidData() {
        return this.validData;
    }

    public static class setMax {
        private String bindingId;
        private String cardIndexNo;
        private int cardNoLength;
        private boolean disable;
        private String formattedHolderName;
        private String formattedMaskedCardNo;
        private String instId;
        private String instLocalName;
        private String instName;
        private String payMethod;
        private String payOption;
        private boolean validData;

        public setMax bindingId(String str) {
            this.bindingId = str;
            return this;
        }

        public setMax cardIndexNo(String str) {
            this.cardIndexNo = str;
            return this;
        }

        public setMax cardNoLength(int i) {
            this.cardNoLength = i;
            return this;
        }

        public setMax disable(boolean z) {
            this.disable = z;
            return this;
        }

        public setMax formattedHolderName(String str) {
            this.formattedHolderName = str;
            return this;
        }

        public setMax formattedMaskedCardNo(String str) {
            this.formattedMaskedCardNo = str;
            return this;
        }

        public setMax instId(String str) {
            this.instId = str;
            return this;
        }

        public setMax instName(String str) {
            this.instName = str;
            return this;
        }

        public setMax instLocalName(String str) {
            this.instLocalName = str;
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

        public setMax validData(boolean z) {
            this.validData = z;
            return this;
        }

        public BluetoothState build() {
            BluetoothState bluetoothState = new BluetoothState();
            String unused = bluetoothState.bindingId = this.bindingId;
            String unused2 = bluetoothState.cardIndexNo = this.cardIndexNo;
            int unused3 = bluetoothState.cardNoLength = this.cardNoLength;
            boolean unused4 = bluetoothState.disable = this.disable;
            String unused5 = bluetoothState.formattedHolderName = this.formattedHolderName;
            String unused6 = bluetoothState.formattedMaskedCardNo = this.formattedMaskedCardNo;
            String unused7 = bluetoothState.instId = this.instId;
            String unused8 = bluetoothState.instLocalName = this.instLocalName;
            String unused9 = bluetoothState.instName = this.instName;
            String unused10 = bluetoothState.payMethod = this.payMethod;
            String unused11 = bluetoothState.payOption = this.payOption;
            boolean unused12 = bluetoothState.validData = this.validData;
            return bluetoothState;
        }
    }
}
