package com.alibaba.griver.bluetooth.altbeacon.beacon.distance;

import android.content.Context;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import com.alipay.mobile.verifyidentity.base.message.EnvDataConstants;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;

public class ModelSpecificDistanceCalculator implements DistanceCalculator {

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantLock f10250a;
    private AndroidModel b;
    private DistanceCalculator c;
    private AndroidModel d;
    private AndroidModel e;
    private String f;
    private Context g;
    Map<AndroidModel, DistanceCalculator> mModelMap;

    public ModelSpecificDistanceCalculator(Context context, String str) {
        this(context, str, AndroidModel.forThisDevice());
    }

    public ModelSpecificDistanceCalculator(Context context, String str, AndroidModel androidModel) {
        this.f10250a = new ReentrantLock();
        this.f = null;
        this.e = androidModel;
        this.g = context;
        a();
        this.c = findCalculatorForModelWithLock(androidModel);
    }

    public AndroidModel getModel() {
        return this.d;
    }

    public AndroidModel getRequestedModel() {
        return this.e;
    }

    public double calculateDistance(int i, double d2) {
        DistanceCalculator distanceCalculator = this.c;
        if (distanceCalculator != null) {
            return distanceCalculator.calculateDistance(i, d2);
        }
        LogManager.w("ModelSpecificDistanceCalculator", "distance calculator has not been set", new Object[0]);
        return -1.0d;
    }

    /* access modifiers changed from: package-private */
    public DistanceCalculator findCalculatorForModelWithLock(AndroidModel androidModel) {
        this.f10250a.lock();
        try {
            return a(androidModel);
        } finally {
            this.f10250a.unlock();
        }
    }

    private DistanceCalculator a(AndroidModel androidModel) {
        LogManager.d("ModelSpecificDistanceCalculator", "Finding best distance calculator for %s, %s, %s, %s", androidModel.getVersion(), androidModel.getBuildNumber(), androidModel.getModel(), androidModel.getManufacturer());
        Map<AndroidModel, DistanceCalculator> map = this.mModelMap;
        AndroidModel androidModel2 = null;
        if (map == null) {
            LogManager.d("ModelSpecificDistanceCalculator", "Cannot get distance calculator because modelMap was never initialized", new Object[0]);
            return null;
        }
        int i = 0;
        for (AndroidModel next : map.keySet()) {
            if (next.matchScore(androidModel) > i) {
                i = next.matchScore(androidModel);
                androidModel2 = next;
            }
        }
        if (androidModel2 != null) {
            LogManager.d("ModelSpecificDistanceCalculator", "found a match with score %s", Integer.valueOf(i));
            LogManager.d("ModelSpecificDistanceCalculator", "Finding best distance calculator for %s, %s, %s, %s", androidModel2.getVersion(), androidModel2.getBuildNumber(), androidModel2.getModel(), androidModel2.getManufacturer());
            this.d = androidModel2;
        } else {
            this.d = this.b;
            LogManager.w("ModelSpecificDistanceCalculator", "Cannot find match for this device.  Using default", new Object[0]);
        }
        return this.mModelMap.get(this.d);
    }

    private void a() {
        if (!(this.f != null ? b() : false)) {
            c();
        }
        this.c = findCalculatorForModelWithLock(this.e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087 A[SYNTHETIC, Splitter:B:40:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093 A[SYNTHETIC, Splitter:B:45:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a0 A[SYNTHETIC, Splitter:B:51:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ac A[SYNTHETIC, Splitter:B:56:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ba A[SYNTHETIC, Splitter:B:64:0x00ba] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c6 A[SYNTHETIC, Splitter:B:69:0x00c6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b() {
        /*
            r11 = this;
            java.lang.String r0 = "close inputStream exception"
            java.lang.String r1 = "close reader exception"
            java.lang.String r2 = "ModelSpecificDistanceCalculator"
            java.io.File r3 = new java.io.File
            android.content.Context r4 = r11.g
            java.io.File r4 = r4.getFilesDir()
            java.lang.String r5 = "model-distance-calculations.json"
            r3.<init>(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00b7, IOException -> 0x007a, all -> 0x0077 }
            r8.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00b7, IOException -> 0x007a, all -> 0x0077 }
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0075, IOException -> 0x0073 }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0075, IOException -> 0x0073 }
            r10.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0075, IOException -> 0x0073 }
            r9.<init>(r10)     // Catch:{ FileNotFoundException -> 0x0075, IOException -> 0x0073 }
        L_0x002a:
            java.lang.String r5 = r9.readLine()     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006c, all -> 0x0069 }
            if (r5 == 0) goto L_0x0039
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006c, all -> 0x0069 }
            java.lang.String r5 = "\n"
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x006f, IOException -> 0x006c, all -> 0x0069 }
            goto L_0x002a
        L_0x0039:
            r9.close()     // Catch:{ Exception -> 0x003d }
            goto L_0x0043
        L_0x003d:
            r3 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r7]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r3, r2, r1, r5)
        L_0x0043:
            r8.close()     // Catch:{ Exception -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r1 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r7]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r2, r0, r3)
        L_0x004d:
            java.lang.String r0 = r4.toString()     // Catch:{ JSONException -> 0x0055 }
            r11.buildModelMapWithLock(r0)     // Catch:{ JSONException -> 0x0055 }
            return r6
        L_0x0055:
            r0 = move-exception
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r11.f
            r1[r7] = r3
            java.lang.String r3 = r4.toString()
            r1[r6] = r3
            java.lang.String r3 = "Cannot update distance models from online database at %s with JSON: %s"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r0, r2, r3, r1)
            return r7
        L_0x0069:
            r3 = move-exception
            r5 = r9
            goto L_0x009e
        L_0x006c:
            r4 = move-exception
            r5 = r9
            goto L_0x007c
        L_0x006f:
            r5 = r9
            goto L_0x00b8
        L_0x0071:
            r3 = move-exception
            goto L_0x009e
        L_0x0073:
            r4 = move-exception
            goto L_0x007c
        L_0x0075:
            goto L_0x00b8
        L_0x0077:
            r3 = move-exception
            r8 = r5
            goto L_0x009e
        L_0x007a:
            r4 = move-exception
            r8 = r5
        L_0x007c:
            java.lang.String r9 = "Cannot open distance model file %s"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0071 }
            r6[r7] = r3     // Catch:{ all -> 0x0071 }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r4, r2, r9, r6)     // Catch:{ all -> 0x0071 }
            if (r5 == 0) goto L_0x0091
            r5.close()     // Catch:{ Exception -> 0x008b }
            goto L_0x0091
        L_0x008b:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r7]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r3, r2, r1, r4)
        L_0x0091:
            if (r8 == 0) goto L_0x009d
            r8.close()     // Catch:{ Exception -> 0x0097 }
            goto L_0x009d
        L_0x0097:
            r1 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r7]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r2, r0, r3)
        L_0x009d:
            return r7
        L_0x009e:
            if (r5 == 0) goto L_0x00aa
            r5.close()     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00aa
        L_0x00a4:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r7]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r4, r2, r1, r5)
        L_0x00aa:
            if (r8 == 0) goto L_0x00b6
            r8.close()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00b6
        L_0x00b0:
            r1 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r7]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r2, r0, r4)
        L_0x00b6:
            throw r3
        L_0x00b7:
            r8 = r5
        L_0x00b8:
            if (r5 == 0) goto L_0x00c4
            r5.close()     // Catch:{ Exception -> 0x00be }
            goto L_0x00c4
        L_0x00be:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r7]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r3, r2, r1, r4)
        L_0x00c4:
            if (r8 == 0) goto L_0x00d0
            r8.close()     // Catch:{ Exception -> 0x00ca }
            goto L_0x00d0
        L_0x00ca:
            r1 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r7]
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r1, r2, r0, r3)
        L_0x00d0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.beacon.distance.ModelSpecificDistanceCalculator.b():boolean");
    }

    /* access modifiers changed from: package-private */
    public void buildModelMapWithLock(String str) {
        this.f10250a.lock();
        try {
            a(str);
        } finally {
            this.f10250a.unlock();
        }
    }

    private void a(String str) {
        this.mModelMap = new HashMap();
        JSONArray jSONArray = new JSONObject(str).getJSONArray("models");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            boolean z = jSONObject.has("default") ? jSONObject.getBoolean("default") : false;
            Double valueOf = Double.valueOf(jSONObject.getDouble("coefficient1"));
            Double valueOf2 = Double.valueOf(jSONObject.getDouble("coefficient2"));
            Double valueOf3 = Double.valueOf(jSONObject.getDouble("coefficient3"));
            String string = jSONObject.getString("version");
            String string2 = jSONObject.getString("build_number");
            String string3 = jSONObject.getString(H5GetLogInfoBridge.RESULT_MODEL);
            String string4 = jSONObject.getString(EnvDataConstants.MANUFACTURER);
            double doubleValue = valueOf.doubleValue();
            double doubleValue2 = valueOf2.doubleValue();
            double doubleValue3 = valueOf3.doubleValue();
            CurveFittedDistanceCalculator curveFittedDistanceCalculator = r12;
            CurveFittedDistanceCalculator curveFittedDistanceCalculator2 = new CurveFittedDistanceCalculator(doubleValue, doubleValue2, doubleValue3);
            AndroidModel androidModel = new AndroidModel(string, string2, string3, string4);
            this.mModelMap.put(androidModel, curveFittedDistanceCalculator);
            if (z) {
                this.b = androidModel;
            }
        }
    }

    private void c() {
        this.mModelMap = new HashMap();
        try {
            a("{\n  \"models\":\n  [\n    {\n      \"coefficient1\": 0.42093,\n      \"coefficient2\": 6.9476,\n      \"coefficient3\": 0.54992,\n      \"version\":\"4.4.2\",\n      \"build_number\":\"KOT49H\",\n      \"model\":\"Nexus 4\",\n      \"manufacturer\":\"LGE\"\n    },\n    {\n      \"coefficient1\": 0.42093,\n      \"coefficient2\": 6.9476,\n      \"coefficient3\": 0.54992,\n      \"version\":\"4.4.2\",\n      \"build_number\":\"LPV79\",\n      \"model\":\"Nexus 5\",\n      \"manufacturer\":\"LGE\",\n      \"default\": true\n    },\n    {\n      \"coefficient1\": 0.9401940951,\n      \"coefficient2\": 6.170094565,\n      \"coefficient3\": 0.0,\n      \"version\":\"5.0.2\",\n      \"build_number\":\"LXG22.67-7.1\",\n      \"model\":\"Moto X Pro\",\n      \"manufacturer\":\"XT1115\",\n      \"default\": false\n    },\n    {\n      \"coefficient1\": 0.1862616782,\n      \"coefficient2\": 8.235367435,\n      \"coefficient3\": -0.45324519,\n      \"version\":\"6.0\",\n      \"build_number\":\"MPE24.49-18\",\n      \"model\":\"XT1092\",\n      \"manufacturer\":\"Motorola\",\n      \"default\": false\n    }\n  ]\n}\n");
        } catch (Exception e2) {
            LogManager.e(e2, "ModelSpecificDistanceCalculator", "Cannot build model distance calculations", new Object[0]);
        }
    }
}
