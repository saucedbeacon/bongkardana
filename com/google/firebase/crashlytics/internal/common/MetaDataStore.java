package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.onActivityPostCreated;
import org.json.JSONException;
import org.json.JSONObject;

class MetaDataStore {
    private static final String KEYDATA_SUFFIX = "keys";
    private static final String KEY_USER_ID = "userId";
    private static final String METADATA_EXT = ".meta";
    private static final String USERDATA_SUFFIX = "user";
    private static final Charset UTF_8 = Charset.forName(setMin(new char[]{15843, 2983, 62690, 59231, 39477, 55070}).intern());
    private static char getMax = '\u0000';
    private static int getMin = 0;
    private static char length = '\u0000';
    private static char setMax = '\u0000';
    private static char setMin = '\u0000';
    private static int toIntRange = 1;
    private final File filesDir;

    static void setMin() {
        setMin = 4417;
        length = 54196;
        setMax = 4045;
        getMax = 37845;
    }

    static {
        setMin();
        int i = toIntRange + 125;
        getMin = i % 128;
        int i2 = i % 2;
    }

    public MetaDataStore(File file) {
        this.filesDir = file;
    }

    public void writeUserData(String str, UserMetadata userMetadata) {
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            String userDataToJson = userDataToJson(userMetadata);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), UTF_8));
            try {
                bufferedWriter2.write(userDataToJson);
                bufferedWriter2.flush();
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                int i = getMin + 43;
                toIntRange = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    Logger.getLogger().e("Error serializing user metadata.", e);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Logger.getLogger().e("Error serializing user metadata.", e);
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r8.exists() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4 = new java.io.FileInputStream(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r8 = jsonToUserData(com.google.firebase.crashlytics.internal.common.CommonUtils.streamToString(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r4, "Failed to close user metadata file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.google.firebase.crashlytics.internal.Logger.getLogger().e("Error deserializing user metadata.", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0058, code lost:
        com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r4, "Failed to close user metadata file.");
        r8 = new com.google.firebase.crashlytics.internal.common.UserMetadata();
        r0 = getMin + 67;
        toIntRange = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006a, code lost:
        if ((r0 % 2) != 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006e, code lost:
        if (r2 == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0076, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0077, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0078, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0079, code lost:
        com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, "Failed to close user metadata file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007c, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r8.exists() == false) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.crashlytics.internal.common.UserMetadata readUserData(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to close user metadata file."
            int r1 = toIntRange
            int r1 = r1 + 77
            int r2 = r1 % 128
            getMin = r2
            int r1 = r1 % 2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 == 0) goto L_0x0024
            java.io.File r8 = r7.getUserDataFileForSession(r8)     // Catch:{ Exception -> 0x0022 }
            boolean r1 = r8.exists()     // Catch:{ Exception -> 0x0020 }
            if (r1 != 0) goto L_0x0037
            goto L_0x0031
        L_0x0020:
            r8 = move-exception
            throw r8
        L_0x0022:
            r8 = move-exception
            throw r8
        L_0x0024:
            java.io.File r8 = r7.getUserDataFileForSession(r8)
            boolean r1 = r8.exists()
            r4 = 34
            int r4 = r4 / r3
            if (r1 != 0) goto L_0x0037
        L_0x0031:
            com.google.firebase.crashlytics.internal.common.UserMetadata r8 = new com.google.firebase.crashlytics.internal.common.UserMetadata
            r8.<init>()
            return r8
        L_0x0037:
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            r4.<init>(r8)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            java.lang.String r8 = com.google.firebase.crashlytics.internal.common.CommonUtils.streamToString(r4)     // Catch:{ Exception -> 0x0049 }
            com.google.firebase.crashlytics.internal.common.UserMetadata r8 = jsonToUserData(r8)     // Catch:{ Exception -> 0x0049 }
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r4, r0)
            return r8
        L_0x0049:
            r8 = move-exception
            goto L_0x004f
        L_0x004b:
            r8 = move-exception
            goto L_0x0079
        L_0x004d:
            r8 = move-exception
            r4 = r1
        L_0x004f:
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ all -> 0x0077 }
            java.lang.String r6 = "Error deserializing user metadata."
            r5.e(r6, r8)     // Catch:{ all -> 0x0077 }
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r4, r0)
            com.google.firebase.crashlytics.internal.common.UserMetadata r8 = new com.google.firebase.crashlytics.internal.common.UserMetadata
            r8.<init>()
            int r0 = getMin
            int r0 = r0 + 67
            int r4 = r0 % 128
            toIntRange = r4
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r2 = 0
        L_0x006e:
            if (r2 == 0) goto L_0x0076
            super.hashCode()     // Catch:{ all -> 0x0074 }
            return r8
        L_0x0074:
            r8 = move-exception
            throw r8
        L_0x0076:
            return r8
        L_0x0077:
            r8 = move-exception
            r1 = r4
        L_0x0079:
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, r0)
            throw r8
        L_0x007d:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.MetaDataStore.readUserData(java.lang.String):com.google.firebase.crashlytics.internal.common.UserMetadata");
    }

    public void writeKeyData(String str, Map<String, String> map) {
        File keysFileForSession = getKeysFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            String keysDataToJson = keysDataToJson(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(keysFileForSession), UTF_8));
            try {
                bufferedWriter2.write(keysDataToJson);
                bufferedWriter2.flush();
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                try {
                    int i = toIntRange + 45;
                    getMin = i % 128;
                    int i2 = i % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
                bufferedWriter = bufferedWriter2;
                try {
                    Logger.getLogger().e("Error serializing key/value metadata.", e);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Logger.getLogger().e("Error serializing key/value metadata.", e);
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if ((r7.exists()) != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007a, code lost:
        return java.util.Collections.emptyMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if ((!r1 ? 'F' : 3) != 'F') goto L_0x0037;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.String> readKeyData(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Failed to close user metadata file."
            int r1 = toIntRange
            int r1 = r1 + 67
            int r2 = r1 % 128
            getMin = r2
            int r1 = r1 % 2
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L_0x0028
            java.io.File r7 = r6.getKeysFileForSession(r7)
            boolean r1 = r7.exists()
            super.hashCode()     // Catch:{ all -> 0x0026 }
            r4 = 70
            if (r1 != 0) goto L_0x0022
            r1 = 70
            goto L_0x0023
        L_0x0022:
            r1 = 3
        L_0x0023:
            if (r1 == r4) goto L_0x0076
            goto L_0x0037
        L_0x0026:
            r7 = move-exception
            throw r7
        L_0x0028:
            java.io.File r7 = r6.getKeysFileForSession(r7)     // Catch:{ Exception -> 0x007b }
            boolean r1 = r7.exists()     // Catch:{ Exception -> 0x007b }
            if (r1 != 0) goto L_0x0034
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            if (r1 == 0) goto L_0x0076
        L_0x0037:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x004c, all -> 0x004a }
            r1.<init>(r7)     // Catch:{ Exception -> 0x004c, all -> 0x004a }
            java.lang.String r7 = com.google.firebase.crashlytics.internal.common.CommonUtils.streamToString(r1)     // Catch:{ Exception -> 0x0048 }
            java.util.Map r7 = jsonToKeysData(r7)     // Catch:{ Exception -> 0x0048 }
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, r0)
            return r7
        L_0x0048:
            r7 = move-exception
            goto L_0x004e
        L_0x004a:
            r7 = move-exception
            goto L_0x0072
        L_0x004c:
            r7 = move-exception
            r1 = r3
        L_0x004e:
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = "Error deserializing user metadata."
            r4.e(r5, r7)     // Catch:{ all -> 0x0070 }
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r1, r0)
            java.util.Map r7 = java.util.Collections.emptyMap()     // Catch:{ Exception -> 0x006e }
            int r0 = toIntRange     // Catch:{ Exception -> 0x006e }
            int r0 = r0 + r2
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x006e }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x006d
            int r0 = r3.length     // Catch:{ all -> 0x006b }
            return r7
        L_0x006b:
            r7 = move-exception
            throw r7
        L_0x006d:
            return r7
        L_0x006e:
            r7 = move-exception
            throw r7
        L_0x0070:
            r7 = move-exception
            r3 = r1
        L_0x0072:
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(r3, r0)
            throw r7
        L_0x0076:
            java.util.Map r7 = java.util.Collections.emptyMap()
            return r7
        L_0x007b:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.MetaDataStore.readKeyData(java.lang.String):java.util.Map");
    }

    @NonNull
    public File getUserDataFileForSession(String str) {
        File file = this.filesDir;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("user.meta");
        File file2 = new File(file, sb.toString());
        int i = toIntRange + 17;
        getMin = i % 128;
        if (i % 2 == 0) {
            return file2;
        }
        int i2 = 54 / 0;
        return file2;
    }

    @NonNull
    public File getKeysFileForSession(String str) {
        File file = this.filesDir;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("keys.meta");
        File file2 = new File(file, sb.toString());
        int i = getMin + 15;
        toIntRange = i % 128;
        int i2 = i % 2;
        return file2;
    }

    private static UserMetadata jsonToUserData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        UserMetadata userMetadata = new UserMetadata();
        userMetadata.setUserId(valueOrNull(jSONObject, "userId"));
        try {
            int i = getMin + 69;
            toIntRange = i % 128;
            int i2 = i % 2;
            return userMetadata;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String userDataToJson(final UserMetadata userMetadata) throws JSONException {
        String r2 = new JSONObject() {
            {
                put("userId", UserMetadata.this.getUserId());
            }
        }.toString();
        int i = toIntRange + 119;
        getMin = i % 128;
        if (i % 2 == 0) {
            return r2;
        }
        Object obj = null;
        super.hashCode();
        return r2;
    }

    private static Map<String, String> jsonToKeysData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (true) {
                if ((keys.hasNext() ? 27 : '*') != 27) {
                    int i = getMin + 93;
                    toIntRange = i % 128;
                    if (!(i % 2 == 0)) {
                        return hashMap;
                    }
                    int i2 = 81 / 0;
                    return hashMap;
                }
                int i3 = toIntRange + 63;
                getMin = i3 % 128;
                if (i3 % 2 != 0) {
                    String next = keys.next();
                    hashMap.put(next, valueOrNull(jSONObject, next));
                    Object obj = null;
                    super.hashCode();
                } else {
                    String next2 = keys.next();
                    hashMap.put(next2, valueOrNull(jSONObject, next2));
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private static String keysDataToJson(Map<String, String> map) throws JSONException {
        String jSONObject = new JSONObject(map).toString();
        int i = toIntRange + 31;
        getMin = i % 128;
        int i2 = i % 2;
        return jSONObject;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String] */
    private static String valueOrNull(JSONObject jSONObject, String str) {
        boolean z = true;
        ? r3 = 0;
        if (!(!jSONObject.isNull(str))) {
            return r3;
        }
        int i = toIntRange + 81;
        getMin = i % 128;
        if (i % 2 != 0) {
            z = false;
        }
        String optString = jSONObject.optString(str, r3);
        if (!z) {
            int length2 = r3.length;
        }
        int i2 = getMin + 41;
        toIntRange = i2 % 128;
        int i3 = i2 % 2;
        return optString;
    }

    private static String setMin(char[] cArr) {
        int i = toIntRange + 29;
        getMin = i % 128;
        int i2 = i % 2;
        char[] cArr2 = new char[cArr.length];
        char[] cArr3 = new char[2];
        int i3 = 0;
        while (true) {
            if (!(i3 < cArr.length)) {
                return new String(cArr2, 1, cArr2[0]);
            }
            try {
                int i4 = toIntRange + 43;
                getMin = i4 % 128;
                int i5 = i4 % 2;
                cArr3[0] = cArr[i3];
                int i6 = i3 + 1;
                cArr3[1] = cArr[i6];
                onActivityPostCreated.setMax(cArr3, setMin, getMax, length, setMax);
                cArr2[i3] = cArr3[0];
                cArr2[i6] = cArr3[1];
                i3 += 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
