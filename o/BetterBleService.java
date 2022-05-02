package o;

import java.io.Serializable;

public class BetterBleService implements Serializable {
    private String desc;
    private BetterBleListener extInfo;
    private String title;
    private String url;

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public BetterBleListener getExtInfo() {
        return this.extInfo;
    }

    public void setExtInfo(BetterBleListener betterBleListener) {
        this.extInfo = betterBleListener;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
