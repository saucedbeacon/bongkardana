package o;

import android.text.TextUtils;
import io.branch.referral.Defines;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class TinyMenuItemData {
    TinyMenuItemData() {
    }

    public final void length(String str, JSONObject jSONObject, String str2) {
        try {
            onAttachedToLayoutParams onattachedtolayoutparams = new onAttachedToLayoutParams(str);
            if (jSONObject != null) {
                setMax(onattachedtolayoutparams, jSONObject, "");
                onattachedtolayoutparams.getMax.put(Defines.Jsonkey.BranchIdentity.getKey(), str2);
                setupForInsets.length().length(onattachedtolayoutparams);
            }
        } catch (Throwable unused) {
        }
    }

    private void setMax(onAttachedToLayoutParams onattachedtolayoutparams, JSONObject jSONObject, String str) throws JSONException {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!next.startsWith("+")) {
                if (obj instanceof JSONObject) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(next);
                    sb.append(".");
                    setMax(onattachedtolayoutparams, (JSONObject) obj, sb.toString());
                } else if (obj instanceof JSONArray) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(next);
                    sb2.append(".");
                    length(onattachedtolayoutparams, (JSONArray) obj, sb2.toString());
                } else {
                    getMax(onattachedtolayoutparams, str, next, jSONObject.getString(next));
                }
            }
        }
    }

    private static void length(onAttachedToLayoutParams onattachedtolayoutparams, JSONArray jSONArray, String str) throws JSONException {
        for (int i = 0; i < jSONArray.length(); i++) {
            StringBuilder sb = new StringBuilder("~");
            sb.append(Integer.toString(i));
            getMax(onattachedtolayoutparams, str, sb.toString(), jSONArray.getString(i));
        }
    }

    private static void getMax(onAttachedToLayoutParams onattachedtolayoutparams, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        if (str2.startsWith("~")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.replaceFirst("~", ""));
            sb.append(str2.replaceFirst("~", ""));
            onattachedtolayoutparams.getMax.put(sb.toString(), str3);
            return;
        }
        StringBuilder sb2 = new StringBuilder("$");
        sb2.append(Defines.Jsonkey.IdentityID.getKey());
        if (str2.equals(sb2.toString())) {
            onattachedtolayoutparams.getMax.put(Defines.Jsonkey.ReferringBranchIdentity.getKey(), str3);
        }
    }
}
