package o;

import android.text.TextUtils;
import com.iap.ac.config.lite.ConfigCenter;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import org.json.JSONArray;
import org.json.JSONException;

@Singleton
public final class unregisterReceiver {
    public static String getKeyFromUrl(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf(63)) <= 0) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static boolean isMatchWhiteList(String str) {
        List<String> jSApiInterfaceCacheWhitelist;
        if (!TextUtils.isEmpty(str) && (jSApiInterfaceCacheWhitelist = getJSApiInterfaceCacheWhitelist()) != null && jSApiInterfaceCacheWhitelist.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean isUrlMatchWhiteList(String str) {
        List<String> jSApiInterfaceCacheWhitelist;
        String keyFromUrl = getKeyFromUrl(str);
        if (!TextUtils.isEmpty(keyFromUrl) && (jSApiInterfaceCacheWhitelist = getJSApiInterfaceCacheWhitelist()) != null && jSApiInterfaceCacheWhitelist.contains(keyFromUrl)) {
            return true;
        }
        return false;
    }

    private static List<String> getJSApiInterfaceCacheWhitelist() {
        JSONArray jSONArrayConfig = ConfigCenter.getInstance().getJSONArrayConfig("jsapi_interface_cache_whitelist");
        if (jSONArrayConfig == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArrayConfig.length()) {
            try {
                arrayList.add(jSONArrayConfig.getString(i));
                i++;
            } catch (JSONException unused) {
                return new ArrayList();
            }
        }
        return arrayList;
    }
}
