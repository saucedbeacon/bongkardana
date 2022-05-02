package o;

import android.os.Bundle;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class setSelectedItem {
    public static Map<String, Object> getMin(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                linkedHashMap.put(next, jSONObject.get(next));
            }
        } catch (JSONException e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.JSONUTIL_TAG, "Unable to get object from JSONObject", e);
        }
        return linkedHashMap;
    }

    public static Bundle setMin(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, String.valueOf(jSONObject.get(next)));
            }
        } catch (JSONException e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.JSONUTIL_TAG, "Unable to get object from JSONObject", e);
        }
        return bundle;
    }
}
