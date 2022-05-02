package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class UIPropUtil {
    JSONObject getMax = new JSONObject();
    Object setMin;

    public final void getMax(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            try {
                this.getMax.put((String) next.getKey(), next.getValue());
            } catch (JSONException e) {
                updateActionSheetContent.e(DanaLogConstants.TAG.MIXPANEL, "Unable to add properties to JSONObject", e);
            }
        }
    }
}
