package o;

import java.io.Serializable;

public class onBluetoothAdapterStateChange implements Serializable {
    private String extInfo;
    private onCloseBluetoothAdapter menuData;
    private String menuTitle;
    private boolean showMenu;

    public onCloseBluetoothAdapter getMenuData() {
        return this.menuData;
    }

    public void setMenuData(onCloseBluetoothAdapter onclosebluetoothadapter) {
        this.menuData = onclosebluetoothadapter;
    }

    public boolean isShowMenu() {
        return this.showMenu;
    }

    public void setShowMenu(boolean z) {
        this.showMenu = z;
    }

    public String getMenuTitle() {
        return this.menuTitle;
    }

    public void setMenuTitle(String str) {
        this.menuTitle = str;
    }

    public String getExtInfo() {
        return this.extInfo;
    }

    public void setExtInfo(String str) {
        this.extInfo = str;
    }
}
