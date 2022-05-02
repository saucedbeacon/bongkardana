package com.facebook.stetho.inspector.protocol.module;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.stetho.inspector.domstorage.DOMStoragePeerManager;
import com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.json.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class DOMStorage implements ChromeDevtoolsDomain {
    private final Context mContext;
    private final DOMStoragePeerManager mDOMStoragePeerManager;
    private final ObjectMapper mObjectMapper = new ObjectMapper();

    public static class DomStorageItemAddedParams {
        @JsonProperty(required = true)
        public String key;
        @JsonProperty(required = true)
        public String newValue;
        @JsonProperty(required = true)
        public StorageId storageId;
    }

    public static class DomStorageItemRemovedParams {
        @JsonProperty(required = true)
        public String key;
        @JsonProperty(required = true)
        public StorageId storageId;
    }

    public static class DomStorageItemUpdatedParams {
        @JsonProperty(required = true)
        public String key;
        @JsonProperty(required = true)
        public String newValue;
        @JsonProperty(required = true)
        public String oldValue;
        @JsonProperty(required = true)
        public StorageId storageId;
    }

    public static class DomStorageItemsClearedParams {
        @JsonProperty(required = true)
        public StorageId storageId;
    }

    public static class StorageId {
        @JsonProperty(required = true)
        public boolean isLocalStorage;
        @JsonProperty(required = true)
        public String securityOrigin;
    }

    public DOMStorage(Context context) {
        this.mContext = context;
        this.mDOMStoragePeerManager = new DOMStoragePeerManager(context);
    }

    @ChromeDevtoolsMethod
    public void enable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        this.mDOMStoragePeerManager.addPeer(jsonRpcPeer);
    }

    @ChromeDevtoolsMethod
    public void disable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        this.mDOMStoragePeerManager.removePeer(jsonRpcPeer);
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult getDOMStorageItems(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws JSONException {
        StorageId storageId = (StorageId) this.mObjectMapper.convertValue(jSONObject.getJSONObject("storageId"), StorageId.class);
        ArrayList arrayList = new ArrayList();
        String str = storageId.securityOrigin;
        if (storageId.isLocalStorage) {
            for (Map.Entry next : this.mContext.getSharedPreferences(str, 0).getAll().entrySet()) {
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(next.getKey());
                arrayList2.add(SharedPreferencesHelper.valueToString(next.getValue()));
                arrayList.add(arrayList2);
            }
        }
        GetDOMStorageItemsResult getDOMStorageItemsResult = new GetDOMStorageItemsResult();
        getDOMStorageItemsResult.entries = arrayList;
        return getDOMStorageItemsResult;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0062, code lost:
        throw new com.facebook.stetho.inspector.protocol.module.DOMStorage.DOMStorageAssignmentException(java.lang.String.format(java.util.Locale.US, "Type mismatch setting %s to %s (expected %s)", new java.lang.Object[]{r0, r11, r2.getClass().getSimpleName()}));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0042 */
    @com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDOMStorageItem(com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer r10, org.json.JSONObject r11) throws org.json.JSONException, com.facebook.stetho.inspector.jsonrpc.JsonRpcException {
        /*
            r9 = this;
            com.facebook.stetho.json.ObjectMapper r10 = r9.mObjectMapper
            java.lang.String r0 = "storageId"
            org.json.JSONObject r0 = r11.getJSONObject(r0)
            java.lang.Class<com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId> r1 = com.facebook.stetho.inspector.protocol.module.DOMStorage.StorageId.class
            java.lang.Object r10 = r10.convertValue(r0, r1)
            com.facebook.stetho.inspector.protocol.module.DOMStorage$StorageId r10 = (com.facebook.stetho.inspector.protocol.module.DOMStorage.StorageId) r10
            java.lang.String r0 = "key"
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r1 = "value"
            java.lang.String r11 = r11.getString(r1)
            boolean r1 = r10.isLocalStorage
            if (r1 == 0) goto L_0x00a0
            android.content.Context r1 = r9.mContext
            java.lang.String r2 = r10.securityOrigin
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            java.util.Map r2 = r1.getAll()
            java.lang.Object r2 = r2.get(r0)
            if (r2 == 0) goto L_0x0065
            android.content.SharedPreferences$Editor r4 = r1.edit()     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            java.lang.Object r5 = com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper.valueFromString(r11, r2)     // Catch:{ IllegalArgumentException -> 0x0042 }
            assignByType(r4, r0, r5)     // Catch:{ IllegalArgumentException -> 0x0042 }
            r4.apply()     // Catch:{ IllegalArgumentException -> 0x0042 }
            return
        L_0x0042:
            com.facebook.stetho.inspector.protocol.module.DOMStorage$DOMStorageAssignmentException r4 = new com.facebook.stetho.inspector.protocol.module.DOMStorage$DOMStorageAssignmentException     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            java.lang.String r6 = "Type mismatch setting %s to %s (expected %s)"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            r7[r3] = r0     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            r3 = 1
            r7[r3] = r11     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            r3 = 2
            java.lang.Class r8 = r2.getClass()     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            java.lang.String r8 = r8.getSimpleName()     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            r7[r3] = r8     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            java.lang.String r3 = java.lang.String.format(r5, r6, r7)     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            r4.<init>(r3)     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            throw r4     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
        L_0x0063:
            r3 = move-exception
            goto L_0x007e
        L_0x0065:
            com.facebook.stetho.inspector.protocol.module.DOMStorage$DOMStorageAssignmentException r3 = new com.facebook.stetho.inspector.protocol.module.DOMStorage$DOMStorageAssignmentException     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            java.lang.String r5 = "Unsupported: cannot add new key "
            r4.<init>(r5)     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            r4.append(r0)     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            java.lang.String r5 = " due to lack of type inference"
            r4.append(r5)     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            java.lang.String r4 = r4.toString()     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            r3.<init>(r4)     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
            throw r3     // Catch:{ DOMStorageAssignmentException -> 0x0063 }
        L_0x007e:
            com.facebook.stetho.inspector.domstorage.DOMStoragePeerManager r4 = r9.mDOMStoragePeerManager
            com.facebook.stetho.inspector.protocol.module.Console$MessageLevel r5 = com.facebook.stetho.inspector.protocol.module.Console.MessageLevel.ERROR
            com.facebook.stetho.inspector.protocol.module.Console$MessageSource r6 = com.facebook.stetho.inspector.protocol.module.Console.MessageSource.STORAGE
            java.lang.String r3 = r3.getMessage()
            com.facebook.stetho.inspector.console.CLog.writeToConsole(r4, r5, r6, r3)
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x009b
            com.facebook.stetho.inspector.domstorage.DOMStoragePeerManager r1 = r9.mDOMStoragePeerManager
            java.lang.String r2 = com.facebook.stetho.inspector.domstorage.SharedPreferencesHelper.valueToString(r2)
            r1.signalItemUpdated(r10, r0, r11, r2)
            return
        L_0x009b:
            com.facebook.stetho.inspector.domstorage.DOMStoragePeerManager r11 = r9.mDOMStoragePeerManager
            r11.signalItemRemoved(r10, r0)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.inspector.protocol.module.DOMStorage.setDOMStorageItem(com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer, org.json.JSONObject):void");
    }

    @ChromeDevtoolsMethod
    public void removeDOMStorageItem(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws JSONException {
        StorageId storageId = (StorageId) this.mObjectMapper.convertValue(jSONObject.getJSONObject("storageId"), StorageId.class);
        String string = jSONObject.getString("key");
        if (storageId.isLocalStorage) {
            this.mContext.getSharedPreferences(storageId.securityOrigin, 0).edit().remove(string).apply();
        }
    }

    private static void assignByType(SharedPreferences.Editor editor, String str, Object obj) throws IllegalArgumentException {
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else if (obj instanceof Set) {
            putStringSet(editor, str, (Set) obj);
        } else {
            StringBuilder sb = new StringBuilder("Unsupported type=");
            sb.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @TargetApi(11)
    private static void putStringSet(SharedPreferences.Editor editor, String str, Set<String> set) {
        editor.putStringSet(str, set);
    }

    static class GetDOMStorageItemsResult implements JsonRpcResult {
        @JsonProperty(required = true)
        public List<List<String>> entries;

        private GetDOMStorageItemsResult() {
        }
    }

    static class DOMStorageAssignmentException extends Exception {
        public DOMStorageAssignmentException(String str) {
            super(str);
        }
    }
}
