package o;

import java.util.List;

public class parseUuidFrom {
    /* access modifiers changed from: private */
    public List<BluetoothState> withdrawCardOptions;
    /* access modifiers changed from: private */
    public List<BleResult> withdrawChannelOptions;
    /* access modifiers changed from: private */
    public String withdrawMethod;

    private parseUuidFrom() {
    }

    public List<BluetoothState> getWithdrawCardOptions() {
        return this.withdrawCardOptions;
    }

    public List<BleResult> getWithdrawChannelOptions() {
        return this.withdrawChannelOptions;
    }

    public String getWithdrawMethod() {
        return this.withdrawMethod;
    }

    public static class setMax {
        private List<BluetoothState> withdrawCardOptions;
        private List<BleResult> withdrawChannelOptions;
        private String withdrawMethod;

        public setMax withdrawCardOptions(List<BluetoothState> list) {
            this.withdrawCardOptions = list;
            return this;
        }

        public setMax withdrawChannelOptions(List<BleResult> list) {
            this.withdrawChannelOptions = list;
            return this;
        }

        public setMax withdrawMethod(String str) {
            this.withdrawMethod = str;
            return this;
        }

        public parseUuidFrom build() {
            parseUuidFrom parseuuidfrom = new parseUuidFrom();
            List unused = parseuuidfrom.withdrawCardOptions = this.withdrawCardOptions;
            List unused2 = parseuuidfrom.withdrawChannelOptions = this.withdrawChannelOptions;
            String unused3 = parseuuidfrom.withdrawMethod = this.withdrawMethod;
            return parseuuidfrom;
        }
    }
}
