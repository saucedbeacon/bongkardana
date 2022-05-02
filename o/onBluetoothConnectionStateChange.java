package o;

import java.io.Serializable;

public class onBluetoothConnectionStateChange implements Serializable {
    private String extInfo;
    private BetterBleService[] menuItems;

    public String getExtInfo() {
        return this.extInfo;
    }

    public void setExtInfo(String str) {
        this.extInfo = str;
    }

    public BetterBleService[] getMenuItems() {
        return this.menuItems;
    }

    public void setMenuItems(BetterBleService[] betterBleServiceArr) {
        this.menuItems = betterBleServiceArr;
    }
}
