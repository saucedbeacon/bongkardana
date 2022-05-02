package io.branch.referral;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import io.branch.referral.Defines;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.TinyMenuPopupWindow;
import o.dispatchOnCancelled;
import o.getMid;
import o.getViewTypeCount;
import o.onCancelLoad;
import o.onCanceled;
import o.startTinyAppAndCloseCurrent;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ServerRequest {
    private final Context IsOverlapping;
    public boolean equals = false;
    public JSONObject getMax;
    long getMin = 0;
    boolean isInside = false;
    public String length;
    public final Set<PROCESS_WAIT_LOCK> setMax;
    protected final startTinyAppAndCloseCurrent setMin;

    public enum BRANCH_API_VERSION {
        V1,
        V1_CPID,
        V1_LATD,
        V2
    }

    public enum PROCESS_WAIT_LOCK {
        FB_APP_LINK_WAIT_LOCK,
        GAID_FETCH_WAIT_LOCK,
        INTENT_PENDING_WAIT_LOCK,
        STRONG_MATCH_PENDING_WAIT_LOCK,
        INSTALL_REFERRER_FETCH_WAIT_LOCK
    }

    public boolean FastBitmap$CoordinateSystem() {
        return false;
    }

    public void equals() {
    }

    public boolean getMax() {
        return true;
    }

    public abstract void getMin();

    public abstract boolean getMin(Context context);

    /* access modifiers changed from: protected */
    public boolean length() {
        return false;
    }

    public boolean setMax() {
        return false;
    }

    public abstract void setMin(int i, String str);

    public abstract void setMin(getViewTypeCount getviewtypecount, Branch branch);

    public abstract boolean setMin();

    public ServerRequest(Context context, String str) {
        this.IsOverlapping = context;
        this.length = str;
        this.setMin = startTinyAppAndCloseCurrent.length(context);
        this.getMax = new JSONObject();
        this.setMax = new HashSet();
    }

    public ServerRequest(String str, JSONObject jSONObject, Context context) {
        this.IsOverlapping = context;
        this.length = str;
        this.getMax = jSONObject;
        this.setMin = startTinyAppAndCloseCurrent.length(context);
        this.setMax = new HashSet();
    }

    public String toIntRange() {
        StringBuilder sb = new StringBuilder();
        sb.append(startTinyAppAndCloseCurrent.setMin());
        sb.append(this.length);
        return sb.toString();
    }

    public void setMax(JSONObject jSONObject) throws JSONException {
        this.getMax = jSONObject;
        if (toDoubleRange() == BRANCH_API_VERSION.V2) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                this.getMax.put(Defines.Jsonkey.UserData.getKey(), jSONObject2);
                getMid.getMin().setMax(this.IsOverlapping, this.setMin, jSONObject2);
            } catch (JSONException unused) {
            }
        } else if (toDoubleRange() == BRANCH_API_VERSION.V1_CPID) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                this.getMax.put(Defines.Jsonkey.UserData.getKey(), jSONObject3);
                getMid.getMin().setMax(this.IsOverlapping, this.setMin, jSONObject3);
            } catch (JSONException unused2) {
            }
        } else if (toDoubleRange() == BRANCH_API_VERSION.V1_LATD) {
            try {
                JSONObject jSONObject4 = new JSONObject();
                this.getMax.put(Defines.Jsonkey.UserData.getKey(), jSONObject4);
                getMid.getMin().setMax(this.IsOverlapping, this.setMin, jSONObject4);
                getMid.getMin();
                getMid.length(this.setMin, jSONObject4);
            } catch (Exception unused3) {
            }
        } else {
            getMid min = getMid.getMin();
            JSONObject jSONObject5 = this.getMax;
            try {
                TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.getMin getmin = new TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.getMin(min.setMax, getMid.setMin());
                if (!getMid.setMin(getmin.setMax)) {
                    jSONObject5.put(Defines.Jsonkey.HardwareID.getKey(), getmin.setMax);
                    jSONObject5.put(Defines.Jsonkey.IsHardwareIDReal.getKey(), getmin.getMax());
                }
                String str = Build.MANUFACTURER;
                if (!getMid.setMin(str)) {
                    jSONObject5.put(Defines.Jsonkey.Brand.getKey(), str);
                }
                String str2 = Build.MODEL;
                if (!getMid.setMin(str2)) {
                    jSONObject5.put(Defines.Jsonkey.Model.getKey(), str2);
                }
                DisplayMetrics floatRange = TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.toFloatRange(min.setMax);
                jSONObject5.put(Defines.Jsonkey.ScreenDpi.getKey(), floatRange.densityDpi);
                jSONObject5.put(Defines.Jsonkey.ScreenHeight.getKey(), floatRange.heightPixels);
                jSONObject5.put(Defines.Jsonkey.ScreenWidth.getKey(), floatRange.widthPixels);
                jSONObject5.put(Defines.Jsonkey.WiFi.getKey(), TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.IsOverlapping(min.setMax));
                jSONObject5.put(Defines.Jsonkey.UIMode.getKey(), TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.toIntRange(min.setMax));
                if (!getMid.setMin("Android")) {
                    jSONObject5.put(Defines.Jsonkey.OS.getKey(), "Android");
                }
                jSONObject5.put(Defines.Jsonkey.OSVersion.getKey(), Build.VERSION.SDK_INT);
                String str3 = "";
                String country = Locale.getDefault() != null ? Locale.getDefault().getCountry() : str3;
                if (!TextUtils.isEmpty(country)) {
                    jSONObject5.put(Defines.Jsonkey.Country.getKey(), country);
                }
                if (Locale.getDefault() != null) {
                    str3 = Locale.getDefault().getLanguage();
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject5.put(Defines.Jsonkey.Language.getKey(), str3);
                }
                String min2 = TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.setMin();
                if (!TextUtils.isEmpty(min2)) {
                    jSONObject5.put(Defines.Jsonkey.LocalIP.getKey(), min2);
                }
                if (startTinyAppAndCloseCurrent.length(min.setMax).toFloatRange()) {
                    String intRange = startTinyAppAndCloseCurrent.length(min.setMax).toIntRange(Defines.ModuleNameKeys.imei.getKey());
                    if (TextUtils.isEmpty(intRange)) {
                        intRange = null;
                    }
                    if (!getMid.setMin(intRange)) {
                        jSONObject5.put(Defines.ModuleNameKeys.imei.getKey(), intRange);
                    }
                }
            } catch (JSONException unused4) {
            }
        }
    }

    public final JSONObject setMin(ConcurrentHashMap<String, String> concurrentHashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.getMax != null) {
                JSONObject jSONObject2 = new JSONObject(this.getMax.toString());
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
            if (concurrentHashMap.size() <= 0) {
                return jSONObject;
            }
            JSONObject jSONObject3 = new JSONObject();
            for (String next2 : concurrentHashMap.keySet()) {
                jSONObject3.put(next2, concurrentHashMap.get(next2));
                concurrentHashMap.remove(next2);
            }
            jSONObject.put(Defines.Jsonkey.Branch_Instrumentation.getKey(), jSONObject3);
            return jSONObject;
        } catch (JSONException unused) {
            return jSONObject;
        } catch (ConcurrentModificationException unused2) {
            return this.getMax;
        }
    }

    public final JSONObject IsOverlapping() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("REQ_POST", this.getMax);
            jSONObject.put("REQ_POST_PATH", this.length);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[Catch:{ JSONException -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static io.branch.referral.ServerRequest getMin(org.json.JSONObject r5, android.content.Context r6) {
        /*
            java.lang.String r0 = "REQ_POST_PATH"
            java.lang.String r1 = "REQ_POST"
            java.lang.String r2 = ""
            r3 = 0
            boolean r4 = r5.has(r1)     // Catch:{ JSONException -> 0x0012 }
            if (r4 == 0) goto L_0x0012
            org.json.JSONObject r1 = r5.getJSONObject(r1)     // Catch:{ JSONException -> 0x0012 }
            goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            boolean r4 = r5.has(r0)     // Catch:{ JSONException -> 0x001f }
            if (r4 == 0) goto L_0x0020
            java.lang.String r5 = r5.getString(r0)     // Catch:{ JSONException -> 0x001f }
            r2 = r5
            goto L_0x0020
        L_0x001f:
        L_0x0020:
            if (r2 == 0) goto L_0x00de
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x00de
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines.RequestPath.CompletedAction
            java.lang.String r5 = r5.getPath()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x003b
            o.TinyMenuPopupWindow r3 = new o.TinyMenuPopupWindow
            r3.<init>(r2, r1, r6)
            goto L_0x00de
        L_0x003b:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines.RequestPath.GetURL
            java.lang.String r5 = r5.getPath()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x004e
            o.startRecentTinyApp r3 = new o.startRecentTinyApp
            r3.<init>(r2, r1, r6)
            goto L_0x00de
        L_0x004e:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines.RequestPath.GetCreditHistory
            java.lang.String r5 = r5.getPath()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0061
            o.TinyMenuPopupWindow$2 r3 = new o.TinyMenuPopupWindow$2
            r3.<init>(r2, r1, r6)
            goto L_0x00de
        L_0x0061:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines.RequestPath.GetCredits
            java.lang.String r5 = r5.getPath()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0073
            o.TinyMenuPopupWindow$5 r3 = new o.TinyMenuPopupWindow$5
            r3.<init>(r2, r1, r6)
            goto L_0x00de
        L_0x0073:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines.RequestPath.IdentifyUser
            java.lang.String r5 = r5.getPath()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0085
            o.TinyMenuPopupWindow$6 r3 = new o.TinyMenuPopupWindow$6
            r3.<init>((java.lang.String) r2, (org.json.JSONObject) r1, (android.content.Context) r6)
            goto L_0x00de
        L_0x0085:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines.RequestPath.Logout
            java.lang.String r5 = r5.getPath()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0097
            o.TinyMenuPopupWindow$3 r3 = new o.TinyMenuPopupWindow$3
            r3.<init>(r2, r1, r6)
            goto L_0x00de
        L_0x0097:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines.RequestPath.RedeemRewards
            java.lang.String r5 = r5.getPath()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00a9
            o.TinyMenuPopupWindow$9 r3 = new o.TinyMenuPopupWindow$9
            r3.<init>(r2, r1, r6)
            goto L_0x00de
        L_0x00a9:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines.RequestPath.RegisterClose
            java.lang.String r5 = r5.getPath()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00bb
            o.TinyMenuPopupWindow$8 r3 = new o.TinyMenuPopupWindow$8
            r3.<init>(r2, r1, r6)
            goto L_0x00de
        L_0x00bb:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines.RequestPath.RegisterInstall
            java.lang.String r5 = r5.getPath()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00cd
            o.TinyMenuPopupWindow$7$1 r3 = new o.TinyMenuPopupWindow$7$1
            r3.<init>((java.lang.String) r2, (org.json.JSONObject) r1, (android.content.Context) r6)
            goto L_0x00de
        L_0x00cd:
            io.branch.referral.Defines$RequestPath r5 = io.branch.referral.Defines.RequestPath.RegisterOpen
            java.lang.String r5 = r5.getPath()
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00de
            o.TinyMenuPopupWindow$CornerMarkingUIController r3 = new o.TinyMenuPopupWindow$CornerMarkingUIController
            r3.<init>(r2, r1, r6)
        L_0x00de:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequest.getMin(org.json.JSONObject, android.content.Context):io.branch.referral.ServerRequest");
    }

    public static boolean setMin(Context context) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(-942787376, oncanceled);
            onCancelLoad.getMin(-942787376, oncanceled);
        }
        int checkCallingOrSelfPermission = context.checkCallingOrSelfPermission("android.permission.INTERNET");
        if (!(checkCallingOrSelfPermission == 0)) {
            startTinyAppAndCloseCurrent.toFloatRange("Trouble executing your request. Please add 'android.permission.INTERNET' in your applications manifest file");
        }
        return checkCallingOrSelfPermission == 0;
    }

    public final boolean toFloatRange() {
        return this.setMax.size() > 0;
    }

    /* access modifiers changed from: protected */
    public final void length(JSONObject jSONObject) {
        try {
            String key = (getMid.getMin().setMax() ? Defines.Jsonkey.NativeApp : Defines.Jsonkey.InstantApp).getKey();
            if (toDoubleRange() == BRANCH_API_VERSION.V2) {
                JSONObject optJSONObject = jSONObject.optJSONObject(Defines.Jsonkey.UserData.getKey());
                if (optJSONObject != null) {
                    optJSONObject.put(Defines.Jsonkey.Environment.getKey(), key);
                    return;
                }
                return;
            }
            jSONObject.put(Defines.Jsonkey.Environment.getKey(), key);
        } catch (Exception unused) {
        }
    }

    public BRANCH_API_VERSION toDoubleRange() {
        return BRANCH_API_VERSION.V1;
    }

    public final void values() {
        StringBuilder sb = new StringBuilder("Requested operation cannot be completed since tracking is disabled [");
        sb.append(this.length);
        sb.append("]");
        startTinyAppAndCloseCurrent.toFloatRange(sb.toString());
        setMin(-117, "");
    }

    /* access modifiers changed from: package-private */
    public final void isInside() {
        boolean length2;
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator<String> keys = this.setMin.getMin.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, this.setMin.getMin.get(next));
            }
            JSONObject optJSONObject = this.getMax.optJSONObject(Defines.Jsonkey.Metadata.getKey());
            if (optJSONObject != null) {
                Iterator<String> keys2 = optJSONObject.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    jSONObject.put(next2, optJSONObject.get(next2));
                }
            }
            if ((this instanceof TinyMenuPopupWindow.AnonymousClass7.AnonymousClass1) && this.setMin.equals.length() > 0) {
                Iterator<String> keys3 = this.setMin.equals.keys();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    this.getMax.putOpt(next3, this.setMin.equals.get(next3));
                }
            }
            this.getMax.put(Defines.Jsonkey.Metadata.getKey(), jSONObject);
        } catch (JSONException unused) {
            startTinyAppAndCloseCurrent.toFloatRange("Could not merge metadata, ignoring user metadata.");
        }
        if (length()) {
            JSONObject optJSONObject2 = toDoubleRange() == BRANCH_API_VERSION.V1 ? this.getMax : this.getMax.optJSONObject(Defines.Jsonkey.UserData.getKey());
            if (optJSONObject2 != null && (length2 = startTinyAppAndCloseCurrent.length())) {
                try {
                    optJSONObject2.putOpt(Defines.Jsonkey.limitFacebookTracking.getKey(), Boolean.valueOf(length2));
                } catch (JSONException unused2) {
                }
            }
        }
    }
}
