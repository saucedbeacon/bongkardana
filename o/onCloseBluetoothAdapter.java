package o;

import java.io.Serializable;

public class onCloseBluetoothAdapter implements Serializable {
    private String extInfo;
    private onBluetoothConnectionStateChange[] menuGroups;

    public String getExtInfo() {
        return this.extInfo;
    }

    public void setExtInfo(String str) {
        this.extInfo = str;
    }

    public onBluetoothConnectionStateChange[] getMenuGroups() {
        return this.menuGroups;
    }

    public void setMenuGroups(onBluetoothConnectionStateChange[] onbluetoothconnectionstatechangeArr) {
        this.menuGroups = onbluetoothconnectionstatechangeArr;
    }
}
