package o;

import o.BeaconParser;

public class getIdentifierCount {
    private boolean needPayMethod;
    private boolean needTransferMethod;
    private boolean needWithdrawMethod;
    private BeaconParser.BeaconLayoutException payeeInfo;
    private String transferMethod;

    public boolean isNeedTransferMethod() {
        return this.needTransferMethod;
    }

    public void setNeedTransferMethod(boolean z) {
        this.needTransferMethod = z;
    }

    public boolean isNeedWithdrawMethod() {
        return this.needWithdrawMethod;
    }

    public void setNeedWithdrawMethod(boolean z) {
        this.needWithdrawMethod = z;
    }

    public boolean isNeedPayMethod() {
        return this.needPayMethod;
    }

    public void setNeedPayMethod(boolean z) {
        this.needPayMethod = z;
    }

    public BeaconParser.BeaconLayoutException getPayeeInfo() {
        return this.payeeInfo;
    }

    public void setPayeeInfo(BeaconParser.BeaconLayoutException beaconLayoutException) {
        this.payeeInfo = beaconLayoutException;
    }

    public String getTransferMethod() {
        return this.transferMethod;
    }

    public void setTransferMethod(String str) {
        this.transferMethod = str;
    }
}
