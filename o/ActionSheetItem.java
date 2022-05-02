package o;

import org.json.JSONObject;

public final class ActionSheetItem {
    public JSONObject getMax = new JSONObject();
    public String length;

    public interface BadgeInfo {
        void getMax();

        void getMax(ActionSheetItem actionSheetItem);

        void setMax(String str);
    }

    public ActionSheetItem(String str) {
        this.length = str;
    }
}
