package o;

public class onBluetoothCharacteristicWrite {
    private onBluetoothAdapterStateChange data;
    private int expireTime;
    private boolean finish;
    private boolean verifySuccess;

    public onBluetoothAdapterStateChange getData() {
        return this.data;
    }

    public void setData(onBluetoothAdapterStateChange onbluetoothadapterstatechange) {
        this.data = onbluetoothadapterstatechange;
    }

    public int getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(int i) {
        this.expireTime = i;
    }

    public boolean isFinish() {
        return this.finish;
    }

    public void setFinish(boolean z) {
        this.finish = z;
    }

    public boolean isVerifySuccess() {
        return this.verifySuccess;
    }

    public void setVerifySuccess(boolean z) {
        this.verifySuccess = z;
    }
}
