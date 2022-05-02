package o;

import android.net.Uri;
import android.os.AsyncTask;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import o.InvalidDataException;
import o.generateKey;
import org.json.JSONObject;

public final class isInvalid {
    private static final String setMin = isBound.class.getSimpleName();

    public static void getMax(String str, String str2) {
        if (str == null || str2 == null || str.isEmpty() || str2.isEmpty() || str2.length() < 8) {
            isRemoved.setMin();
            throw setScrapContainer.getMax("63");
        }
    }

    static HashMap<String, String> length(String str, String[] strArr) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(TtmlNode.TAG_BODY, str);
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(strArr[0]);
        hashMap.put("auth", sb.toString());
        hashMap.put(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP, strArr[1]);
        hashMap.put(BranchLinkConstant.OauthParams.SIGNATURE, strArr[2]);
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static URL setMax() {
        try {
            return new URL(Uri.parse("https://partner.api.bri.co.id/v2/brizzi/secure").buildUpon().build().toString());
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static byte[] setMin(java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 16
            byte[] r4 = android.util.Base64.decode(r4, r0)
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 0
            r3 = 49586(0xc1b2, float:6.9485E-41)
            if (r0 == r3) goto L_0x0020
            r3 = 52472(0xccf8, float:7.3529E-41)
            if (r0 != r3) goto L_0x002a
            java.lang.String r0 = "503"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x002a
            r5 = 1
            goto L_0x002b
        L_0x0020:
            java.lang.String r0 = "200"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x002a
            r5 = 0
            goto L_0x002b
        L_0x002a:
            r5 = -1
        L_0x002b:
            r0 = 2
            if (r5 == 0) goto L_0x003c
            if (r5 == r1) goto L_0x0036
            byte[] r5 = new byte[r0]
            r5 = {1, 1} // fill-array
            goto L_0x0041
        L_0x0036:
            byte[] r5 = new byte[r0]
            r5 = {105, 105} // fill-array
            goto L_0x0041
        L_0x003c:
            byte[] r5 = new byte[r0]
            r5 = {-111, 105} // fill-array
        L_0x0041:
            int r1 = r4.length
            int r1 = r1 + r0
            byte[] r1 = new byte[r1]
            int r3 = r4.length
            java.lang.System.arraycopy(r4, r2, r1, r2, r3)
            int r4 = r4.length
            java.lang.System.arraycopy(r5, r2, r1, r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isInvalid.setMin(java.lang.String, java.lang.String):byte[]");
    }

    static class getMin extends AsyncTask<HashMap<String, String>, Void, HashMap<String, String>> {
        getMin() {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            HashMap hashMap = ((HashMap[]) objArr)[0];
            if (isCancelled()) {
                return null;
            }
            return isInvalid.setMax(isInvalid.setMax(), hashMap);
        }
    }

    /* access modifiers changed from: private */
    public static HashMap<String, String> setMax(URL url, HashMap<String, String> hashMap) {
        String str;
        String str2;
        String str3;
        String str4;
        generateKey.getMax getmax = new generateKey.getMax();
        getmax.b = initCloseCode.getMax(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT, 5, TimeUnit.SECONDS);
        getmax.create = false;
        generateKey generatekey = new generateKey(getmax);
        translateRegularFrame length = translateRegularFrame.length("text/plain; charset=UTF-8");
        if (hashMap != null) {
            StringBuilder sb = new StringBuilder("");
            sb.append(hashMap.get(TtmlNode.TAG_BODY));
            str4 = sb.toString();
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(hashMap.get("auth"));
            str3 = sb2.toString();
            StringBuilder sb3 = new StringBuilder("");
            sb3.append(hashMap.get(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP));
            str2 = sb3.toString();
            StringBuilder sb4 = new StringBuilder("");
            sb4.append(hashMap.get(BranchLinkConstant.OauthParams.SIGNATURE));
            str = sb4.toString();
        } else {
            str = "";
            str4 = str;
            str3 = str4;
            str2 = str3;
        }
        getPart length2 = getPart.length(length, str4);
        InvalidDataException.getMin length3 = new InvalidDataException.getMin().length(HttpHeaders.AUTHORIZATION, str3).length("BRI-Timestamp", str2).length("BRI-Signature", str).length("Content-Type", "text/plain;charset=UTF-8");
        if (url != null) {
            Draft_76 min = Draft_76.getMin(url.toString());
            if (min != null) {
                length3.getMin = min;
                InvalidDataException.getMin length4 = length3.length("POST", length2);
                if (length4.getMin != null) {
                    InvalidDataException invalidDataException = new InvalidDataException(length4);
                    try {
                        HashMap<String, String> hashMap2 = new HashMap<>();
                        InvalidHandshakeException execute = FirebasePerfOkHttpClient.execute(IncompleteHandshakeException.setMax(generatekey, invalidDataException));
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(execute.getMax);
                        sb5.append("");
                        hashMap2.put("code", sb5.toString());
                        hashMap2.put(TtmlNode.TAG_BODY, execute.toFloatRange.length());
                        return hashMap2;
                    } catch (IOException unused) {
                        return null;
                    }
                } else {
                    throw new IllegalStateException("url == null");
                }
            } else {
                throw new NullPointerException("url == null");
            }
        } else {
            throw new NullPointerException("url == null");
        }
    }

    static byte[] getMin(HashMap<String, String> hashMap) {
        String str = hashMap.get("code");
        String str2 = hashMap.get(TtmlNode.TAG_BODY);
        if (str == null) {
            return null;
        }
        if (!"401".equals(str)) {
            return setMin(str2, str);
        }
        JSONObject jSONObject = new JSONObject(str2);
        isRemoved.setMin();
        throw setScrapContainer.getMax(jSONObject.getString("RC"));
    }
}
