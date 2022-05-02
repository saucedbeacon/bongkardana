package o;

public class onServerReady extends IpcClientKernelUtils {
    private String amount;
    private String fundType;

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public String getFundType() {
        return this.fundType;
    }

    public void setFundType(String str) {
        this.fundType = str;
    }
}
