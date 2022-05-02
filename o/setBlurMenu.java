package o;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import java.util.Iterator;
import o.TinyMenuPopupWindow;
import org.json.JSONException;
import org.json.JSONObject;

public final class setBlurMenu {
    setBlurMenu() {
    }

    public static String length() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(ContactEventType.CONTACT_GET, new Class[]{String.class}).invoke((Object) null, new Object[]{"io.branch.preinstall.apps.path"});
        } catch (Exception unused) {
            return null;
        }
    }

    public static void setMin(JSONObject jSONObject, Branch branch, Context context) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                if (next.equals(GriverConfigConstants.KEY_APP_CONFIGURATION) && (jSONObject.get(next) instanceof JSONObject) && jSONObject.getJSONObject(next).get(TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.getMax(context)) != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next).getJSONObject(TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.getMax(context));
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (next2.equals(Defines.PreinstallKey.campaign.getKey()) && TextUtils.isEmpty(startTinyAppAndCloseCurrent.length(context).equals(Defines.PreinstallKey.campaign.getKey()))) {
                            branch.length(Defines.PreinstallKey.campaign.getKey(), jSONObject2.get(next2).toString());
                        } else if (!next2.equals(Defines.PreinstallKey.partner.getKey()) || !TextUtils.isEmpty(startTinyAppAndCloseCurrent.length(context).equals(Defines.PreinstallKey.partner.getKey()))) {
                            branch.setMax.getMax(next2, jSONObject2.get(next2).toString());
                        } else {
                            branch.length(Defines.PreinstallKey.partner.getKey(), jSONObject2.get(next2).toString());
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }
}
