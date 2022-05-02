package o;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class interceptClickEventForCornerMarking {
    public static interceptClickEventForCornerMarking getMin;
    static JSONObject setMax;
    private final JSONObject getMax;
    private final ArrayList<String> setMin;

    public interceptClickEventForCornerMarking(Context context) {
        JSONObject jSONObject = new JSONObject();
        this.getMax = jSONObject;
        try {
            jSONObject.putOpt("version", 0);
            JSONArray jSONArray = new JSONArray();
            this.getMax.putOpt("uri_skip_list", jSONArray);
            jSONArray.put("^fb\\d+:");
            jSONArray.put("^li\\d+:");
            jSONArray.put("^pdk\\d+:");
            jSONArray.put("^twitterkit-.*:");
            jSONArray.put("^com\\.googleusercontent\\.apps\\.\\d+-.*:\\/oauth");
            jSONArray.put("^(?i)(?!(http|https):).*(:|:.*\\b)(password|o?auth|o?auth.?token|access|access.?token)\\b");
            jSONArray.put("^(?i)((http|https):\\/\\/).*[\\/|?|#].*\\b(password|o?auth|o?auth.?token|access|access.?token)\\b");
        } catch (JSONException unused) {
        }
        setMax = setMin(context);
        this.setMin = new ArrayList<>();
    }

    private JSONObject setMin(Context context) {
        startTinyAppAndCloseCurrent.length(context);
        JSONObject jSONObject = new JSONObject();
        String min = startTinyAppAndCloseCurrent.setMin("skip_url_format_key");
        if (TextUtils.isEmpty(min) || "bnc_no_value".equals(min)) {
            return this.getMax;
        }
        try {
            return new JSONObject(min);
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    public final String setMin(String str) {
        String str2;
        try {
            JSONArray optJSONArray = setMax.optJSONArray("uri_skip_list");
            if (optJSONArray != null) {
                int i = 0;
                while (true) {
                    if (i >= optJSONArray.length()) {
                        break;
                    }
                    try {
                        str2 = optJSONArray.getString(i);
                        if (Pattern.compile(str2).matcher(str).find()) {
                            break;
                        }
                        i++;
                    } catch (JSONException unused) {
                    }
                }
            }
            str2 = null;
            if (str2 == null) {
                if (this.setMin.size() <= 0) {
                    return str;
                }
                Iterator<String> it = this.setMin.iterator();
                while (it.hasNext()) {
                    if (str.matches(it.next())) {
                        return str;
                    }
                }
            }
            return str2;
        } catch (Exception unused2) {
            return str;
        }
    }

    static class getMax extends setFavorite<Void, Void, JSONObject> {
        private final startTinyAppAndCloseCurrent length;
        private final int setMin;

        /* synthetic */ getMax(Context context, byte b) {
            this(context);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return getMax();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            super.onPostExecute(jSONObject);
            if (jSONObject.optInt("version") > interceptClickEventForCornerMarking.setMax.optInt("version")) {
                interceptClickEventForCornerMarking.setMax = jSONObject;
                startTinyAppAndCloseCurrent.length("skip_url_format_key", interceptClickEventForCornerMarking.setMax.toString());
            }
        }

        private getMax(Context context) {
            this.setMin = 1500;
            this.length = startTinyAppAndCloseCurrent.length(context);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x005e, code lost:
            if (r1 != null) goto L_0x0060;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0060, code lost:
            r1.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
            if (r1 != null) goto L_0x0060;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
            return r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static org.json.JSONObject getMax() {
            /*
                r0 = 0
                android.net.TrafficStats.setThreadStatsTag(r0)
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x0066 }
                java.lang.String r2 = "https://cdn.branch.io/sdk/uriskiplist_v#.json"
                java.lang.String r3 = "#"
                org.json.JSONObject r4 = o.interceptClickEventForCornerMarking.setMax     // Catch:{ all -> 0x0066 }
                java.lang.String r5 = "version"
                int r4 = r4.optInt(r5)     // Catch:{ all -> 0x0066 }
                int r4 = r4 + 1
                java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0066 }
                java.lang.String r2 = r2.replace(r3, r4)     // Catch:{ all -> 0x0066 }
                r1.<init>(r2)     // Catch:{ all -> 0x0066 }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ all -> 0x0066 }
                java.lang.Object r1 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r1)     // Catch:{ all -> 0x0066 }
                java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch:{ all -> 0x0066 }
                javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ all -> 0x0066 }
                r2 = 1500(0x5dc, float:2.102E-42)
                r1.setConnectTimeout(r2)     // Catch:{ all -> 0x0064 }
                r1.setReadTimeout(r2)     // Catch:{ all -> 0x0064 }
                int r2 = r1.getResponseCode()     // Catch:{ all -> 0x0064 }
                r3 = 200(0xc8, float:2.8E-43)
                if (r2 != r3) goto L_0x005e
                java.io.InputStream r2 = r1.getInputStream()     // Catch:{ all -> 0x0064 }
                if (r2 == 0) goto L_0x005e
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0064 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0064 }
                java.io.InputStream r4 = r1.getInputStream()     // Catch:{ all -> 0x0064 }
                r3.<init>(r4)     // Catch:{ all -> 0x0064 }
                r2.<init>(r3)     // Catch:{ all -> 0x0064 }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x0064 }
                java.lang.String r2 = r2.readLine()     // Catch:{ all -> 0x0064 }
                r3.<init>(r2)     // Catch:{ all -> 0x0064 }
                r0 = r3
            L_0x005e:
                if (r1 == 0) goto L_0x006a
            L_0x0060:
                r1.disconnect()
                goto L_0x006a
            L_0x0064:
                goto L_0x0067
            L_0x0066:
                r1 = 0
            L_0x0067:
                if (r1 == 0) goto L_0x006a
                goto L_0x0060
            L_0x006a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.interceptClickEventForCornerMarking.getMax.getMax():org.json.JSONObject");
        }
    }
}
