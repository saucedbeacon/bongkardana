package o;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.iap.android.lbs.LBSLocation;
import com.google.common.net.HttpHeaders;
import com.j256.ormlite.stmt.query.SimpleComparison;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import javax.inject.Inject;
import o.Draft_75;
import o.InvalidDataException;
import o.increaseBuffer;
import org.json.JSONException;
import org.json.JSONObject;

public class getCallback implements increaseBuffer {
    private final Context getMax;
    private final onAppResume getMin;
    private final BackKeyDownPoint setMax;
    private final ColorSchemeModelTemplate setMin;

    @Inject
    public getCallback(BackKeyDownPoint backKeyDownPoint, onAppResume onappresume, Context context, ColorSchemeModelTemplate colorSchemeModelTemplate) {
        this.setMax = backKeyDownPoint;
        this.getMin = onappresume;
        this.getMax = context;
        this.setMin = colorSchemeModelTemplate;
    }

    public final InvalidHandshakeException getMax(increaseBuffer.setMax setmax) throws IOException {
        InvalidDataException min = setmax.getMin();
        InvalidDataException.getMin getmin = new InvalidDataException.getMin(min);
        if (TextUtils.isEmpty(min.length.length(HttpHeaders.USER_AGENT))) {
            StringBuilder sb = new StringBuilder();
            sb.append(sendStartMsg.setMax());
            sb.append(" okhttp/3.12.12");
            getmin.setMax(HttpHeaders.USER_AGENT, sb.toString());
        }
        useMultiplexLink cookie = getAlign.getCookie();
        if (!TextUtils.isEmpty(cookie)) {
            getmin.setMax("Cookie", cookie.toString());
            cookie.clear();
        }
        String str = "id_ID";
        if (Locale.getDefault() != null && !Locale.getDefault().toString().endsWith("ID")) {
            str = "en_US";
        }
        getmin.length("Accept-Language", str);
        getmin.length("X-Apdid-Token", this.getMin.getApdidToken());
        if (getBadgeList.getClientKey(this.setMax, "").isEmpty()) {
            getmin.length("X-Client-Key", "");
        }
        length(min, getmin);
        getmin.length("X-Local-Config", String.valueOf(getBadgeList.getLegacyConfigVersion()));
        try {
            LBSLocation latestLocation = handlePushWindow.getLatestLocation(this.getMax);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("latitude", latestLocation.getLatitude());
            jSONObject.put("longitude", latestLocation.getLongitude());
            jSONObject.put("updateTime", latestLocation.getTime());
            jSONObject.put("type", latestLocation.getType());
            jSONObject.put("status", latestLocation.getErrorCode());
            jSONObject.put("userCountryCurrent", this.setMin.getCurrentCountryCode());
            getmin.length("X-Location", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.SIGN_CHECK, e.toString());
        }
        if (getmin.getMin != null) {
            return setmax.getMax(new InvalidDataException(getmin));
        }
        throw new IllegalStateException("url == null");
    }

    private void length(InvalidDataException invalidDataException, InvalidDataException.getMin getmin) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        String appKey = this.setMax.getAppKey();
        String nonce = getBadgeList.getNonce(32);
        String clientKey = this.getMin.getClientKey();
        Draft_75.length length = getmin.setMin;
        Draft_75.setMin("X-Timestamp");
        Draft_75.setMax(valueOf, "X-Timestamp");
        length.setMin.add("X-Timestamp");
        length.setMin.add(valueOf.trim());
        Draft_75.length length2 = getmin.setMin;
        Draft_75.setMin("X-AppKey");
        Draft_75.setMax(appKey, "X-AppKey");
        length2.setMin.add("X-AppKey");
        length2.setMin.add(appKey.trim());
        Draft_75.length length3 = getmin.setMin;
        Draft_75.setMin("X-Nonce");
        Draft_75.setMax(nonce, "X-Nonce");
        length3.setMin.add("X-Nonce");
        length3.setMin.add(nonce.trim());
        Draft_75.length length4 = getmin.setMin;
        Draft_75.setMin("X-Client-Key");
        Draft_75.setMax(clientKey, "X-Client-Key");
        length4.setMin.add("X-Client-Key");
        length4.setMin.add(clientKey.trim());
        TreeMap treeMap = new TreeMap();
        treeMap.put("Timestamp", valueOf);
        treeMap.put("Body", getMin(invalidDataException));
        treeMap.put("Path", getBadgeList.getStringNoNull(getBadgeList.getEncodedParam(invalidDataException.setMin.toString())));
        treeMap.put("UserId", getAlign.getUserId());
        treeMap.put("AppKey", getBadgeList.getStringNoNull(appKey));
        treeMap.put("Nonce", getBadgeList.getStringNoNull(nonce));
        treeMap.put("ClientKey", getBadgeList.getStringNoNull(clientKey));
        treeMap.put("Env", getBadgeList.getStringNoNull(invalidDataException.setMin("X-Env")));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append("&");
            sb.append((String) entry.getKey());
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append((String) entry.getValue());
        }
        try {
            getmin.length("X-Sign", this.setMax.signRequest(sb.substring(1)));
        } catch (Exception e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.SIGN_CHECK, e.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(o.InvalidDataException r2) {
        /*
            r0 = 0
            o.InvalidDataException$getMin r1 = new o.InvalidDataException$getMin     // Catch:{ IOException -> 0x0035 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0035 }
            o.Draft_76 r2 = r1.getMin     // Catch:{ IOException -> 0x0035 }
            if (r2 == 0) goto L_0x002b
            o.InvalidDataException r2 = new o.InvalidDataException     // Catch:{ IOException -> 0x0035 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0035 }
            o.submitLazy r1 = new o.submitLazy     // Catch:{ IOException -> 0x0035 }
            r1.<init>()     // Catch:{ IOException -> 0x0035 }
            o.getPart r0 = r2.setMax     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            if (r0 == 0) goto L_0x001d
            o.getPart r2 = r2.setMax     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            r2.getMin(r1)     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
        L_0x001d:
            java.lang.String r2 = r1.invokeSuspend()     // Catch:{ IOException -> 0x0028, all -> 0x0025 }
            r1.close()
            return r2
        L_0x0025:
            r2 = move-exception
            r0 = r1
            goto L_0x0047
        L_0x0028:
            r2 = move-exception
            r0 = r1
            goto L_0x0036
        L_0x002b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0035 }
            java.lang.String r1 = "url == null"
            r2.<init>(r1)     // Catch:{ IOException -> 0x0035 }
            throw r2     // Catch:{ IOException -> 0x0035 }
        L_0x0033:
            r2 = move-exception
            goto L_0x0047
        L_0x0035:
            r2 = move-exception
        L_0x0036:
            java.lang.String r1 = "SignCheck"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0033 }
            o.updateActionSheetContent.e(r1, r2)     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            java.lang.String r2 = ""
            return r2
        L_0x0047:
            if (r0 == 0) goto L_0x004c
            r0.close()
        L_0x004c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCallback.getMin(o.InvalidDataException):java.lang.String");
    }
}
