package o;

import java.util.List;

public class BluetoothUuid {
    /* access modifiers changed from: private */
    public stopBleScan chargeAmount;
    /* access modifiers changed from: private */
    public stopBleScan freeFeeMinAmount;
    /* access modifiers changed from: private */
    public long freeRemainedTimes;
    /* access modifiers changed from: private */
    public long freeTimes;
    /* access modifiers changed from: private */
    public List<getIdentifierByteCount> payOptionDTOResponses;
    /* access modifiers changed from: private */
    public String transferMethod;
    /* access modifiers changed from: private */
    public List<parseUuidFrom> withdrawMethodOptions;

    private BluetoothUuid() {
    }

    public List<getIdentifierByteCount> getPayOptionDTOResponses() {
        return this.payOptionDTOResponses;
    }

    public String getTransferMethod() {
        return this.transferMethod;
    }

    public stopBleScan getChargeAmount() {
        return this.chargeAmount;
    }

    public stopBleScan getFreeFeeMinAmount() {
        return this.freeFeeMinAmount;
    }

    public long getFreeRemainedTimes() {
        return this.freeRemainedTimes;
    }

    public long getFreeTimes() {
        return this.freeTimes;
    }

    public boolean isFreeTransferAvailable() {
        return this.freeRemainedTimes != 0;
    }

    public List<parseUuidFrom> getWithdrawMethodOptions() {
        return this.withdrawMethodOptions;
    }

    public static class setMin {
        private stopBleScan chargeAmount;
        private stopBleScan freeMinAmount;
        private long freeRemainedTimes;
        private long freeTimes;
        private List<getIdentifierByteCount> payOptionDTOResponses;
        private String transferMethod;
        private List<parseUuidFrom> withdrawMethodOptions;

        public setMin chargeAmount(stopBleScan stopblescan) {
            this.chargeAmount = stopblescan;
            return this;
        }

        public setMin freeMinAmount(stopBleScan stopblescan) {
            this.freeMinAmount = stopblescan;
            return this;
        }

        public setMin transferMethod(String str) {
            this.transferMethod = str;
            return this;
        }

        public setMin freeRemainedTimes(long j) {
            this.freeRemainedTimes = j;
            return this;
        }

        public setMin freeTimes(long j) {
            this.freeTimes = j;
            return this;
        }

        public setMin setPayOptionDTOResponses(List<getIdentifierByteCount> list) {
            this.payOptionDTOResponses = list;
            return this;
        }

        public setMin withdrawMethodOptions(List<parseUuidFrom> list) {
            this.withdrawMethodOptions = list;
            return this;
        }

        public BluetoothUuid build() {
            BluetoothUuid bluetoothUuid = new BluetoothUuid();
            stopBleScan unused = bluetoothUuid.chargeAmount = this.chargeAmount;
            stopBleScan unused2 = bluetoothUuid.freeFeeMinAmount = this.freeMinAmount;
            String unused3 = bluetoothUuid.transferMethod = this.transferMethod;
            long unused4 = bluetoothUuid.freeRemainedTimes = this.freeRemainedTimes;
            long unused5 = bluetoothUuid.freeTimes = this.freeTimes;
            List unused6 = bluetoothUuid.withdrawMethodOptions = this.withdrawMethodOptions;
            List unused7 = bluetoothUuid.payOptionDTOResponses = this.payOptionDTOResponses;
            return bluetoothUuid;
        }
    }
}
