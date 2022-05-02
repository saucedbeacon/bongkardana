package com.iap.ac.config.lite;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.c.d;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.c.f;
import com.iap.ac.config.lite.listener.ConfigChangeType;
import com.iap.ac.config.lite.listener.IAnyCommonConfigListener;
import com.iap.ac.config.lite.listener.commonconfig.ICommonConfigListener;
import com.iap.ac.config.lite.listener.sectionconfig.ChangedDetails;
import com.iap.ac.config.lite.listener.sectionconfig.ISectionConfigListener;
import com.iap.ac.config.lite.utils.ConfigUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ConfigMerger extends ConfigGetter {
    public static final String COMMON_CONFIG_SECTION = "config";
    private static final String f = e.b("ConfigMerger");
    private final d b = new d();
    private final com.iap.ac.config.lite.c.b c = new com.iap.ac.config.lite.c.b();
    private final f d = new f();
    private final List<IAnyCommonConfigListener> e = Collections.synchronizedList(new ArrayList());
    protected JSONObject mCachedConfigs;
    protected final Object mConfigLock = new Object();
    protected long mCurrentConfigVersion = 0;
    @NonNull
    protected Status mStatus = Status.INVALID;

    public static class MergeChangeResult {
        @NonNull
        public List<com.iap.ac.config.lite.c.a> changedList = new ArrayList();
        @NonNull
        public Set<String> valueNotChangedList = new HashSet();
    }

    public enum Status {
        INVALID,
        INITIALIZED,
        SHUTDOWN;

        public final boolean isInitialized() {
            return this == INITIALIZED;
        }

        public final boolean isInitializedOrShutdown() {
            return isInitialized() || isShutdown();
        }

        public final boolean isShutdown() {
            return this == SHUTDOWN;
        }
    }

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9792a;

        a(String str) {
            this.f9792a = str;
        }

        public void run() {
            ConfigMerger.this.saveConfigInternal(this.f9792a);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MergeChangeResult f9793a;

        b(MergeChangeResult mergeChangeResult) {
            this.f9793a = mergeChangeResult;
        }

        public void run() {
            ConfigMerger.this.a(this.f9793a.changedList);
        }
    }

    class c extends ConfigGetter {
        final /* synthetic */ JSONObject b;

        c(ConfigMerger configMerger, JSONObject jSONObject) {
            this.b = jSONObject;
        }

        /* access modifiers changed from: protected */
        public JSONObject getConfigInternal() {
            return this.b;
        }
    }

    private void a() {
        synchronized (this.mConfigLock) {
            if (this.mCachedConfigs == null) {
                this.mCachedConfigs = new JSONObject();
                this.mCurrentConfigVersion = 0;
            }
            try {
                if (this.mCachedConfigs.optJSONObject("config") == null) {
                    this.mCachedConfigs.put("config", new JSONObject());
                }
            } catch (JSONException e2) {
                ACLog.w(f, "ensureCachedConfigs: init cached failed!", e2);
            }
        }
        return;
    }

    @Nullable
    private ConfigChangeType b(@NonNull String str, @NonNull String str2, @NonNull Object obj, boolean z) {
        boolean z2;
        boolean z3;
        try {
            JSONObject optJSONObject = this.mCachedConfigs.optJSONObject(str);
            Object opt = optJSONObject.opt(str2);
            if (opt == null) {
                ACLog.i(f, String.format("**SET** Value for this key is not exists, will set it and return. key = %s", new Object[]{str2}));
                optJSONObject.put(str2, obj);
                return ConfigChangeType.ADDED;
            } else if (a(str2, obj, opt)) {
                return ConfigChangeType.VALUE_NOT_CHANGED;
            } else {
                if (this.b.a(str)) {
                    z2 = this.b.a(str, str2, opt, obj);
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (!z2) {
                    ACLog.e(f, String.format("**INTERCEPTED** This config was intercepted by another interceptor. will not change! key = %s", new Object[]{str2}));
                    return null;
                } else if (z || z3) {
                    ACLog.i(f, String.format("**SET-FINALLY** This config was not intercepted, will set it! key = %s", new Object[]{str2}));
                    optJSONObject.put(str2, obj);
                    return ConfigChangeType.MODIFIED;
                } else {
                    ACLog.w(f, String.format("**ALREADY-HAVE-WHEN-MANUAL-MERGE** Already has this config value, and now is manual merge, will skip it! key = %s.", new Object[]{str2}));
                    return null;
                }
            }
        } catch (JSONException e2) {
            ACLog.w(f, "tryMergeConfigItem: failed!", e2);
        }
    }

    public static boolean isCommonConfigSection(@Nullable String str) {
        return TextUtils.isEmpty(str) || "config".equals(str);
    }

    public void addCommonConfigListener(@NonNull String str, @NonNull ICommonConfigListener iCommonConfigListener) {
        this.c.a(str, iCommonConfigListener);
    }

    public void addForAnyCommonConfigListener(@NonNull IAnyCommonConfigListener iAnyCommonConfigListener) {
        this.e.add(iAnyCommonConfigListener);
    }

    public void addOverwriteInterceptor(@Nullable String str, @NonNull ConfigOverwriteInterceptor configOverwriteInterceptor) {
        this.b.a(str, configOverwriteInterceptor);
    }

    public void addSectionConfigListener(@NonNull String str, @NonNull ISectionConfigListener iSectionConfigListener) {
        this.d.a(str, iSectionConfigListener);
    }

    public void clearCommonConfigListeners() {
        this.c.a();
    }

    public void clearConfigInterceptors() {
        this.b.a();
    }

    public void clearForAnyCommonConfigListeners() {
        this.e.clear();
    }

    public void clearSectionConfigListeners() {
        this.d.a();
    }

    /* access modifiers changed from: protected */
    @Nullable
    public JSONObject getConfigInternal() {
        JSONObject jSONObject = null;
        if (isShutdown()) {
            return null;
        }
        synchronized (this.mConfigLock) {
            if (this.mCachedConfigs != null) {
                jSONObject = this.mCachedConfigs.optJSONObject("config");
            }
        }
        return jSONObject;
    }

    public long getLastUpdateVersion() {
        String str = f;
        StringBuilder sb = new StringBuilder("get: getLastUpdateVersion = ");
        sb.append(ConfigUtils.formatConfigVersionWithTime(this.mCurrentConfigVersion));
        ACLog.v(str, sb.toString());
        return this.mCurrentConfigVersion;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: org.json.JSONObject} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject getSectionConfig(@androidx.annotation.NonNull java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.isShutdown()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.Object r0 = r3.mConfigLock
            monitor-enter(r0)
            org.json.JSONObject r2 = r3.mCachedConfigs     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0026
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x0026
            org.json.JSONObject r2 = r3.mCachedConfigs     // Catch:{ all -> 0x0028 }
            org.json.JSONObject r4 = r2.optJSONObject(r4)     // Catch:{ all -> 0x0028 }
            if (r4 == 0) goto L_0x0024
            java.lang.Object r4 = com.iap.ac.config.lite.utils.ConfigUtils.deepCopyObject(r4)     // Catch:{ all -> 0x0028 }
            r1 = r4
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ all -> 0x0028 }
        L_0x0024:
            monitor-exit(r0)
            return r1
        L_0x0026:
            monitor-exit(r0)
            return r1
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.config.lite.ConfigMerger.getSectionConfig(java.lang.String):org.json.JSONObject");
    }

    @Nullable
    public ConfigGetter getSectionConfigGetter(@NonNull String str) {
        JSONObject sectionConfig = getSectionConfig(str);
        if (sectionConfig == null) {
            return null;
        }
        return new c(this, sectionConfig);
    }

    @Nullable
    public JSONObject getSectionConfigObjects() {
        JSONObject jSONObject;
        if (isShutdown() || (jSONObject = this.mCachedConfigs) == null) {
            return null;
        }
        JSONObject jSONObject2 = (JSONObject) ConfigUtils.deepCopyObject(jSONObject);
        jSONObject2.remove("config");
        return jSONObject2;
    }

    /* access modifiers changed from: protected */
    public void initializeWithCache(@Nullable String str) {
        synchronized (this.mConfigLock) {
            this.mCachedConfigs = null;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = (JSONObject) JsonUtils.fromJson(str, JSONObject.class);
                    if (jSONObject != null) {
                        this.mCurrentConfigVersion = jSONObject.optLong("_version", 0);
                        JSONObject jSONObject2 = jSONObject.getJSONObject("_data");
                        this.mCachedConfigs = jSONObject2;
                        int length = jSONObject2 != null ? jSONObject2.length() : 0;
                        ACLog.i(f, String.format("** Cached config has %d items.", new Object[]{Integer.valueOf(length)}));
                    }
                } catch (Exception e2) {
                    ACLog.e(f, String.format("Parse cached config FAILED! message = %s.", new Object[]{e2.getMessage()}));
                }
            }
            a();
        }
    }

    public boolean isInitialized() {
        return this.mStatus.isInitialized();
    }

    public boolean isShutdown() {
        return this.mStatus.isShutdown();
    }

    public boolean mergeCommonConfig(@NonNull JSONObject jSONObject) {
        return mergeConfig((String) null, jSONObject);
    }

    public boolean mergeConfig(@Nullable String str, @NonNull JSONObject jSONObject) {
        return mergeConfigAdvanced(str, jSONObject, false, false);
    }

    public boolean mergeConfigAdvanced(@Nullable String str, @NonNull JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            str = "config";
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(str, jSONObject);
        } catch (JSONException e2) {
            ACLog.w(f, "mergeConfigAdvanced: failed", e2);
        }
        return a((List<String>) null, jSONObject2, z, z2, z3) != null;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public MergeChangeResult parseFetchedConfigs(@Nullable List<String> list, @Nullable JSONObject jSONObject) {
        MergeChangeResult a2 = a(list, a(jSONObject), true, true, true);
        ACLog.i(f, String.format("** Parse fetched config completely! changed = %s.", new Object[]{String.valueOf(a2 != null && !a2.changedList.isEmpty())}));
        return a2;
    }

    public void removeCommonConfigListener(@NonNull ICommonConfigListener iCommonConfigListener) {
        this.c.a(iCommonConfigListener);
    }

    public void removeForAnyCommonConfigListener(@NonNull IAnyCommonConfigListener iAnyCommonConfigListener) {
        this.e.remove(iAnyCommonConfigListener);
    }

    public void removeOverwriteInterceptor(@NonNull ConfigOverwriteInterceptor configOverwriteInterceptor) {
        this.b.a(configOverwriteInterceptor);
    }

    public void removeSectionConfigListener(@NonNull ISectionConfigListener iSectionConfigListener) {
        this.d.a(iSectionConfigListener);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract void saveConfigInternal(@NonNull String str);

    public void saveConfigsToCache() {
        String json;
        synchronized (this.mConfigLock) {
            ACLog.i(f, "** Will save configs to local cache!, mergeByManual = false.");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_version", this.mCurrentConfigVersion);
                jSONObject.put("_data", this.mCachedConfigs);
            } catch (JSONException e2) {
                ACLog.w(f, "saveConfigsToCache failed!", e2);
            }
            json = JsonUtils.toJson(jSONObject);
        }
        ConfigUtils.doAsyncTask(new a(json));
    }

    /* access modifiers changed from: protected */
    public void setLastUpdateVersion(long j) {
        this.mCurrentConfigVersion = j;
        String str = f;
        StringBuilder sb = new StringBuilder("set: setLastUpdateVersion = ");
        sb.append(ConfigUtils.formatConfigVersionWithTime(this.mCurrentConfigVersion));
        ACLog.v(str, sb.toString());
    }

    public void shutdown() {
        this.mStatus = Status.SHUTDOWN;
        ACLog.i(f, "shutdown ConfigCenter!");
    }

    public boolean mergeCommonConfig(@NonNull String str, @Nullable Object obj) {
        return mergeConfig((String) null, str, obj);
    }

    public boolean mergeConfig(@Nullable String str, @NonNull String str2, @Nullable Object obj) {
        return mergeConfig(str, ConfigUtils.kv(str2, obj));
    }

    public boolean mergeConfigAdvanced(@Nullable String str, @NonNull JSONObject jSONObject, boolean z, boolean z2) {
        return mergeConfigAdvanced(str, jSONObject, z, z2, true);
    }

    private void a(@Nullable List<String> list, @NonNull MergeChangeResult mergeChangeResult) {
        String str;
        if (list == null || list.isEmpty()) {
            ACLog.e(f, "Has no deleted keys!");
            return;
        }
        for (String next : list) {
            int indexOf = next.indexOf(46);
            if (indexOf > 0) {
                str = next.substring(0, indexOf);
                next = next.substring(indexOf + 1);
            } else {
                str = "config";
            }
            JSONObject optJSONObject = this.mCachedConfigs.optJSONObject(str);
            if (optJSONObject != null && optJSONObject.has(next)) {
                optJSONObject.remove(next);
                a(mergeChangeResult, ConfigChangeType.DELETED, str, next);
            }
        }
    }

    private void a(@Nullable JSONObject jSONObject, @NonNull MergeChangeResult mergeChangeResult, boolean z) {
        if (jSONObject == null) {
            ACLog.e(f, "Has no updated keys!");
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject != null && !TextUtils.isEmpty(next)) {
                Iterator<String> keys2 = optJSONObject.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    ConfigChangeType a2 = a(next, next2, optJSONObject.opt(next2), z);
                    if (a2 != null) {
                        a(mergeChangeResult, a2, next, next2);
                    }
                }
            }
        }
    }

    @Nullable
    private JSONObject a(@Nullable JSONObject jSONObject) {
        String str;
        if (jSONObject == null || jSONObject.length() == 0) {
            ACLog.e(f, "Has no updated keys, will not convert updated configs.");
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (!TextUtils.isEmpty(next) && opt != null) {
                int indexOf = next.indexOf(46);
                if (indexOf > 0) {
                    str = next.substring(0, indexOf);
                    next = next.substring(indexOf + 1);
                } else {
                    str = "config";
                }
                try {
                    JSONObject optJSONObject = jSONObject2.optJSONObject(str);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                        jSONObject2.put(str, optJSONObject);
                    }
                    optJSONObject.put(next, opt);
                } catch (JSONException e2) {
                    ACLog.w(f, "convertUpdatedKeys: failed", e2);
                }
            }
        }
        return jSONObject2;
    }

    @Nullable
    private MergeChangeResult a(@Nullable List<String> list, @Nullable JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        if (isShutdown()) {
            ACLog.e(f, "ConfigCenter already shutdown. will not merge this config!");
            return null;
        }
        a();
        MergeChangeResult mergeChangeResult = new MergeChangeResult();
        synchronized (this.mConfigLock) {
            a(list, mergeChangeResult);
            a(jSONObject, mergeChangeResult, z);
        }
        if (!mergeChangeResult.changedList.isEmpty()) {
            if (z2) {
                saveConfigsToCache();
            }
            if (z3) {
                ConfigUtils.doAsyncTask(new b(mergeChangeResult));
            }
        }
        return mergeChangeResult;
    }

    private void a(@NonNull MergeChangeResult mergeChangeResult, @NonNull ConfigChangeType configChangeType, @NonNull String str, @NonNull String str2) {
        com.iap.ac.config.lite.c.a aVar;
        boolean z = !isCommonConfigSection(str);
        if (configChangeType == ConfigChangeType.VALUE_NOT_CHANGED) {
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".");
                sb.append(str2);
                str2 = sb.toString();
            }
            mergeChangeResult.valueNotChangedList.add(str2);
            return;
        }
        Iterator<com.iap.ac.config.lite.c.a> it = mergeChangeResult.changedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (aVar.a(str)) {
                break;
            }
        }
        if (aVar == null) {
            aVar = new com.iap.ac.config.lite.c.a(str);
            mergeChangeResult.changedList.add(aVar);
        }
        if (aVar.a(configChangeType, str2)) {
            ACLog.d(f, String.format("section/common-config-Key changed: section = %s, key = %s, isSection = %s, changedType = %s.", new Object[]{str, str2, String.valueOf(z), String.valueOf(configChangeType)}));
        }
    }

    @Nullable
    private ConfigChangeType a(@NonNull String str, @NonNull String str2, @NonNull Object obj, boolean z) {
        try {
            if (this.mCachedConfigs.optJSONObject(str) == null) {
                this.mCachedConfigs.put(str, new JSONObject());
            }
        } catch (JSONException e2) {
            ACLog.w(f, "mergeConfigInternal: failed", e2);
        }
        ACLog.d(f, String.format("**WILL-MERGE-SECTION** will merge SECTION config. section = %s, key = %s, overwritesExistingItem = %s", new Object[]{str, str2, String.valueOf(z)}));
        return b(str, str2, obj, z);
    }

    private boolean a(@NonNull String str, Object obj, Object obj2) {
        if ((obj instanceof Boolean) && (obj2 instanceof Boolean) && ((Boolean) obj).booleanValue() == ((Boolean) obj2).booleanValue()) {
            ACLog.w(f, String.format("**TYPE-CHECK** Boolean value equals! will not replace. key = %s.", new Object[]{str}));
            return true;
        } else if ((obj instanceof String) && (obj2 instanceof String) && TextUtils.equals((String) obj, (String) obj2)) {
            ACLog.w(f, String.format("**TYPE-CHECK** String value equals! will not replace. key = %s.", new Object[]{str}));
            return true;
        } else if ((obj instanceof Number) && (obj2 instanceof Number) && Math.abs(((Number) obj).doubleValue() - ((Number) obj2).doubleValue()) <= 1.0E-5d) {
            ACLog.w(f, String.format("**TYPE-CHECK** Numeric value equals! will not replace. key = %s.", new Object[]{str}));
            return true;
        } else if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject) && JsonUtils.toJson(obj).equals(JsonUtils.toJson(obj2))) {
            ACLog.w(f, String.format("**TYPE-CHECK** JSONObject value equals! will not replace. key = %s.", new Object[]{str}));
            return true;
        } else if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray) || !JsonUtils.toJson(obj).equals(JsonUtils.toJson(obj2))) {
            return false;
        } else {
            ACLog.w(f, String.format("**TYPE-CHECK** JSONArray value equals! will not replace. key = %s.", new Object[]{str}));
            return true;
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public void a(@NonNull List<com.iap.ac.config.lite.c.a> list) {
        synchronized (this.mConfigLock) {
            ChangedDetails changedDetails = null;
            for (com.iap.ac.config.lite.c.a next : list) {
                a(next);
                if (!next.c) {
                    changedDetails = a(changedDetails, next.f9796a);
                }
            }
            if (changedDetails != null) {
                synchronized (this.e) {
                    JSONObject configInternal = getConfigInternal();
                    for (IAnyCommonConfigListener onConfigChanged : this.e) {
                        onConfigChanged.onConfigChanged(configInternal, changedDetails);
                    }
                }
            }
        }
    }

    @NonNull
    private ChangedDetails a(@Nullable ChangedDetails changedDetails, @NonNull ChangedDetails changedDetails2) {
        if (changedDetails == null) {
            changedDetails = new ChangedDetails();
        }
        changedDetails.mergeChangeDetails(changedDetails2);
        return changedDetails;
    }

    private void a(@NonNull com.iap.ac.config.lite.c.a aVar) {
        JSONObject jSONObject;
        String str = aVar.b;
        if (!TextUtils.isEmpty(str)) {
            com.iap.ac.config.lite.c.c cVar = aVar.c ? this.d : this.c;
            if (aVar.c) {
                jSONObject = getSectionConfig(str);
            } else {
                jSONObject = getConfigInternal();
            }
            cVar.a(str, jSONObject, aVar.f9796a);
        }
    }
}
