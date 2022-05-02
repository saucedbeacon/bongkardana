package io.branch.referral.network;

import androidx.annotation.Nullable;
import com.j256.ormlite.stmt.query.SimpleComparison;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import o.getViewTypeCount;
import o.startTinyAppAndCloseCurrent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BranchRemoteInterface {
    public abstract setMax length(String str, JSONObject jSONObject) throws BranchRemoteException;

    public abstract setMax setMax(String str) throws BranchRemoteException;

    public final getViewTypeCount setMin(String str, JSONObject jSONObject, String str2, String str3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!getMax(jSONObject, str3)) {
            return new getViewTypeCount(str2, -114);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getMin(jSONObject));
        String obj = sb.toString();
        long currentTimeMillis = System.currentTimeMillis();
        startTinyAppAndCloseCurrent.toFloatRange("getting ".concat(String.valueOf(obj)));
        try {
            setMax max = setMax(obj);
            getViewTypeCount max2 = getMax(max.length, max.getMax, str2);
            if (Branch.setMin() != null) {
                Branch min = Branch.setMin();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("-");
                sb2.append(Defines.Jsonkey.Branch_Round_Trip_Time.getKey());
                min.toIntRange.put(sb2.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return max2;
        } catch (BranchRemoteException e) {
            if (e.branchErrorCode == -111) {
                getViewTypeCount getviewtypecount = new getViewTypeCount(str2, -111);
                if (Branch.setMin() != null) {
                    Branch min2 = Branch.setMin();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append("-");
                    sb3.append(Defines.Jsonkey.Branch_Round_Trip_Time.getKey());
                    min2.toIntRange.put(sb3.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
                }
                return getviewtypecount;
            }
            getViewTypeCount getviewtypecount2 = new getViewTypeCount(str2, -113);
            if (Branch.setMin() != null) {
                Branch min3 = Branch.setMin();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append("-");
                sb4.append(Defines.Jsonkey.Branch_Round_Trip_Time.getKey());
                min3.toIntRange.put(sb4.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return getviewtypecount2;
        } catch (Throwable th) {
            if (Branch.setMin() != null) {
                Branch min4 = Branch.setMin();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append("-");
                sb5.append(Defines.Jsonkey.Branch_Round_Trip_Time.getKey());
                min4.toIntRange.put(sb5.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            throw th;
        }
    }

    public final getViewTypeCount setMax(JSONObject jSONObject, String str, String str2, String str3) {
        long currentTimeMillis = System.currentTimeMillis();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!getMax(jSONObject, str3)) {
            return new getViewTypeCount(str2, -114);
        }
        startTinyAppAndCloseCurrent.toFloatRange("posting to ".concat(String.valueOf(str)));
        StringBuilder sb = new StringBuilder("Post value = ");
        sb.append(jSONObject.toString());
        startTinyAppAndCloseCurrent.toFloatRange(sb.toString());
        try {
            setMax length = length(str, jSONObject);
            getViewTypeCount max = getMax(length.length, length.getMax, str2);
            if (Branch.setMin() != null) {
                Branch min = Branch.setMin();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("-");
                sb2.append(Defines.Jsonkey.Branch_Round_Trip_Time.getKey());
                min.toIntRange.put(sb2.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return max;
        } catch (BranchRemoteException e) {
            if (e.branchErrorCode == -111) {
                getViewTypeCount getviewtypecount = new getViewTypeCount(str2, -111);
                if (Branch.setMin() != null) {
                    Branch min2 = Branch.setMin();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append("-");
                    sb3.append(Defines.Jsonkey.Branch_Round_Trip_Time.getKey());
                    min2.toIntRange.put(sb3.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
                }
                return getviewtypecount;
            }
            getViewTypeCount getviewtypecount2 = new getViewTypeCount(str2, -113);
            if (Branch.setMin() != null) {
                Branch min3 = Branch.setMin();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append("-");
                sb4.append(Defines.Jsonkey.Branch_Round_Trip_Time.getKey());
                min3.toIntRange.put(sb4.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            return getviewtypecount2;
        } catch (Throwable th) {
            if (Branch.setMin() != null) {
                Branch min4 = Branch.setMin();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append("-");
                sb5.append(Defines.Jsonkey.Branch_Round_Trip_Time.getKey());
                min4.toIntRange.put(sb5.toString(), String.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
            }
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:2|3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r2 = new java.lang.StringBuilder("JSON exception: ");
        r2.append(r1.getMessage());
        o.startTinyAppAndCloseCurrent.toFloatRange(r2.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.getViewTypeCount getMax(java.lang.String r1, int r2, java.lang.String r3) {
        /*
            o.getViewTypeCount r0 = new o.getViewTypeCount
            r0.<init>(r3, r2)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "returned "
            java.lang.String r2 = r3.concat(r2)
            o.startTinyAppAndCloseCurrent.toFloatRange(r2)
            if (r1 == 0) goto L_0x003a
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001c }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x001c }
            r0.setMin = r2     // Catch:{ JSONException -> 0x001c }
            goto L_0x003a
        L_0x001c:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0024 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x0024 }
            r0.setMin = r2     // Catch:{ JSONException -> 0x0024 }
            goto L_0x003a
        L_0x0024:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "JSON exception: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            o.startTinyAppAndCloseCurrent.toFloatRange(r1)
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.BranchRemoteInterface.getMax(java.lang.String, int, java.lang.String):o.getViewTypeCount");
    }

    private static boolean getMax(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(Defines.Jsonkey.UserData.getKey())) {
                jSONObject.put(Defines.Jsonkey.SDK.getKey(), "android4.1.0");
            }
            if (str.equals("bnc_no_value")) {
                return false;
            }
            jSONObject.put(Defines.Jsonkey.BranchKey.getKey(), str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    private static String getMin(JSONObject jSONObject) {
        JSONArray names;
        StringBuilder sb = new StringBuilder();
        if (!(jSONObject == null || (names = jSONObject.names()) == null)) {
            int length = names.length();
            boolean z = true;
            int i = 0;
            while (i < length) {
                try {
                    String string = names.getString(i);
                    if (z) {
                        sb.append("?");
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    String string2 = jSONObject.getString(string);
                    sb.append(string);
                    sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                    sb.append(string2);
                    i++;
                } catch (JSONException unused) {
                    return null;
                }
            }
        }
        return sb.toString();
    }

    public static class setMax {
        final int getMax;
        final String length;

        public setMax(@Nullable String str, int i) {
            this.length = str;
            this.getMax = i;
        }
    }

    public static class BranchRemoteException extends Exception {
        /* access modifiers changed from: private */
        public int branchErrorCode = -113;

        public BranchRemoteException(int i) {
            this.branchErrorCode = i;
        }
    }
}
