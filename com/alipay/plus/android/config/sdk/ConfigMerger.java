package com.alipay.plus.android.config.sdk;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.config.sdk.a.a;
import com.alipay.plus.android.config.sdk.a.b;
import com.alipay.plus.android.config.sdk.a.d;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.a.f;
import com.alipay.plus.android.config.sdk.listener.ConfigChangeType;
import com.alipay.plus.android.config.sdk.listener.IAnyCommonConfigListener;
import com.alipay.plus.android.config.sdk.listener.commonconfig.ICommonConfigListener;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ChangedDetails;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ISectionConfigListener;
import com.alipay.plus.android.config.sdk.utils.ConfigUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class ConfigMerger extends ConfigGetter {
    public static final String COMMON_CONFIG_SECTION = "config";

    /* renamed from: a  reason: collision with root package name */
    private static final String f9510a = e.a("ConfigMerger");
    private final d b = new d();
    private final b c = new b();
    private final f d = new f();
    private final List<IAnyCommonConfigListener> e = Collections.synchronizedList(new ArrayList());
    protected JSONObject mCachedConfigs;
    protected final Object mConfigLock = new Object();
    protected long mCurrentConfigVersion = 0;
    @NonNull
    protected Status mStatus = Status.Invalid;

    public enum Status {
        Invalid,
        Initialized,
        Shutdown;

        public final boolean isInitialized() {
            return this == Initialized;
        }

        public final boolean isInitializedOrShutdown() {
            return isInitialized() || isShutdown();
        }

        public final boolean isShutdown() {
            return this == Shutdown;
        }
    }

    public static class MergeChangeResult {
        @NonNull
        public List<a> changedList = new ArrayList();
        @NonNull
        Set<String> valueNotChangedList = new HashSet();
    }

    @Nullable
    private MergeChangeResult a(@Nullable List<String> list, @Nullable Map<String, Map<String, Object>> map, boolean z, boolean z2, boolean z3) {
        if (isShutdown()) {
            LoggerWrapper.e(f9510a, "ConfigCenter already shutdown. will not merge this config!");
            return null;
        }
        a();
        final MergeChangeResult mergeChangeResult = new MergeChangeResult();
        synchronized (this.mConfigLock) {
            a(list, mergeChangeResult);
            a(map, mergeChangeResult, z);
        }
        if (!mergeChangeResult.changedList.isEmpty()) {
            if (z2) {
                saveConfigsToCache();
            }
            if (z3) {
                doAsyncTask(new Runnable() {
                    public void run() {
                        ConfigMerger.this.a(mergeChangeResult.changedList);
                    }
                });
            }
        }
        return mergeChangeResult;
    }

    @Nullable
    private ConfigChangeType a(@NonNull String str, @NonNull String str2, @NonNull Object obj, boolean z) {
        Object obj2 = this.mCachedConfigs.get(str);
        if (obj2 == null) {
            obj2 = new JSONObject();
            this.mCachedConfigs.put(str, obj2);
        }
        if (!(obj2 instanceof JSONObject)) {
            LoggerWrapper.e(f9510a, "**SECTION-TYPE-ERROR** section is not JSONObject, will not merge!");
            return null;
        }
        LoggerWrapper.d(f9510a, String.format("**WILL-MERGE-SECTION** will merge SECTION config. section = %s, key = %s, overwritesExistingItem = %s", new Object[]{str, str2, String.valueOf(z)}));
        return b(str, str2, obj, z);
    }

    @NonNull
    private ChangedDetails a(@Nullable ChangedDetails changedDetails, @NonNull ChangedDetails changedDetails2) {
        if (changedDetails == null) {
            changedDetails = new ChangedDetails();
        }
        changedDetails.mergeChangeDetails(changedDetails2);
        return changedDetails;
    }

    private static Object a(String str, Object obj) {
        if (!(obj instanceof String)) {
            return obj;
        }
        try {
            Object parse = JSON.parse((String) obj);
            if ((parse instanceof JSONObject) || (parse instanceof JSONArray)) {
                LoggerWrapper.d(f9510a, String.format("Will use %s type for %s.", new Object[]{parse.getClass().getSimpleName(), str}));
                return parse;
            }
        } catch (Throwable unused) {
            LoggerWrapper.w(f9510a, "Parse json failed! take it easy, will use original value.".concat(String.valueOf(obj)));
        }
        return obj;
    }

    @Nullable
    private Map<String, Map<String, Object>> a(@Nullable Map<String, Object> map) {
        String str;
        if (map == null || map.isEmpty()) {
            LoggerWrapper.e(f9510a, "Has no updated keys, will not convert updated configs.");
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            String str2 = (String) next.getKey();
            Object value = next.getValue();
            if (!TextUtils.isEmpty(str2) && value != null) {
                int indexOf = str2.indexOf(46);
                if (indexOf > 0) {
                    str = str2.substring(0, indexOf);
                    str2 = str2.substring(indexOf + 1);
                } else {
                    str = "config";
                }
                Map map2 = (Map) hashMap.get(str);
                if (map2 == null) {
                    map2 = new HashMap();
                    hashMap.put(str, map2);
                }
                map2.put(str2, value);
            }
        }
        return hashMap;
    }

    private void a() {
        synchronized (this.mConfigLock) {
            if (this.mCachedConfigs == null) {
                this.mCachedConfigs = new JSONObject();
                this.mCurrentConfigVersion = 0;
            }
            if (this.mCachedConfigs.getJSONObject("config") == null) {
                this.mCachedConfigs.put("config", (Object) new JSONObject());
            }
        }
    }

    private void a(@NonNull MergeChangeResult mergeChangeResult, @NonNull ConfigChangeType configChangeType, @NonNull String str, @NonNull String str2) {
        boolean z = !isCommonConfigSection(str);
        if (configChangeType == ConfigChangeType.ValueNotChanged) {
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
        a aVar = null;
        Iterator<a> it = mergeChangeResult.changedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            if (next.a(str)) {
                aVar = next;
                break;
            }
        }
        if (aVar == null) {
            aVar = new a(str);
            mergeChangeResult.changedList.add(aVar);
        }
        if (aVar.a(configChangeType, str2)) {
            LoggerWrapper.d(f9510a, String.format("section/common-config-Key changed: section = %s, key = %s, isSection = %s, changedType = %s.", new Object[]{str, str2, String.valueOf(z), String.valueOf(configChangeType)}));
        }
    }

    private void a(@NonNull a aVar) {
        String str = aVar.f10741a;
        if (!TextUtils.isEmpty(str)) {
            (aVar.b ? this.d : this.c).a(str, aVar.b ? getSectionConfig(str) : getConfigInternal(), aVar.c);
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public void a(@NonNull List<a> list) {
        synchronized (this.mConfigLock) {
            ChangedDetails changedDetails = null;
            for (a next : list) {
                a(next);
                if (!next.b) {
                    changedDetails = a(changedDetails, next.c);
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

    private void a(@Nullable List<String> list, @NonNull MergeChangeResult mergeChangeResult) {
        String str;
        if (list == null || list.isEmpty()) {
            LoggerWrapper.e(f9510a, "Has no deleted keys!");
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
            JSONObject jSONObject = this.mCachedConfigs.getJSONObject(str);
            if (jSONObject != null && jSONObject.containsKey(next)) {
                jSONObject.remove(next);
                a(mergeChangeResult, ConfigChangeType.Deleted, str, next);
            }
        }
    }

    private void a(@Nullable Map<String, Map<String, Object>> map, @NonNull MergeChangeResult mergeChangeResult, boolean z) {
        if (map == null) {
            LoggerWrapper.e(f9510a, "Has no updated keys!");
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Map map2 = (Map) next.getValue();
            if (map2 != null && !TextUtils.isEmpty(str)) {
                for (Map.Entry entry : map2.entrySet()) {
                    String str2 = (String) entry.getKey();
                    ConfigChangeType a2 = a(str, str2, a(str2, entry.getValue()), z);
                    if (a2 != null) {
                        a(mergeChangeResult, a2, str, str2);
                    }
                }
            }
        }
    }

    private boolean a(@NonNull String str, Object obj, Object obj2) {
        String str2;
        String format;
        if ((obj instanceof Boolean) && (obj2 instanceof Boolean) && ((Boolean) obj).booleanValue() == ((Boolean) obj2).booleanValue()) {
            str2 = f9510a;
            format = String.format("**TYPE-CHECK** Boolean value equals! will not replace. key = %s.", new Object[]{str});
        } else if ((obj instanceof String) && (obj2 instanceof String) && TextUtils.equals((String) obj, (String) obj2)) {
            str2 = f9510a;
            format = String.format("**TYPE-CHECK** String value equals! will not replace. key = %s.", new Object[]{str});
        } else if ((obj instanceof Number) && (obj2 instanceof Number) && Math.abs(((Number) obj).doubleValue() - ((Number) obj2).doubleValue()) <= 1.0E-5d) {
            str2 = f9510a;
            format = String.format("**TYPE-CHECK** Numeric value equals! will not replace. key = %s.", new Object[]{str});
        } else if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject) && ((JSONObject) obj).toJSONString().equals(((JSONObject) obj2).toJSONString())) {
            str2 = f9510a;
            format = String.format("**TYPE-CHECK** JSONObject value equals! will not replace. key = %s.", new Object[]{str});
        } else if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray) || !((JSONArray) obj).toJSONString().equals(((JSONArray) obj2).toJSONString())) {
            return false;
        } else {
            str2 = f9510a;
            format = String.format("**TYPE-CHECK** JSONArray value equals! will not replace. key = %s.", new Object[]{str});
        }
        LoggerWrapper.w(str2, format);
        return true;
    }

    @Nullable
    private ConfigChangeType b(@NonNull String str, @NonNull String str2, @NonNull Object obj, boolean z) {
        boolean z2;
        boolean z3;
        JSONObject jSONObject = this.mCachedConfigs.getJSONObject(str);
        Object obj2 = jSONObject.get(str2);
        if (obj2 == null) {
            LoggerWrapper.i(f9510a, String.format("**SET** Value for this key is not exists, will set it and return. key = %s", new Object[]{str2}));
            jSONObject.put(str2, obj);
            return ConfigChangeType.Added;
        } else if (a(str2, obj, obj2)) {
            return ConfigChangeType.ValueNotChanged;
        } else {
            if (this.b.a(str)) {
                z2 = this.b.a(str, str2, obj2, obj);
                z3 = true;
            } else {
                z2 = true;
                z3 = false;
            }
            if (!z2) {
                LoggerWrapper.e(f9510a, String.format("**INTERCEPTED** This config was intercepted by another interceptor. will not change! key = %s", new Object[]{str2}));
                return null;
            } else if (z || z3) {
                LoggerWrapper.i(f9510a, String.format("**SET-FINALLY** This config was not intercepted, will set it! key = %s", new Object[]{str2}));
                jSONObject.put(str2, obj);
                return ConfigChangeType.Modified;
            } else {
                LoggerWrapper.w(f9510a, String.format("**ALREADY-HAVE-WHEN-MANUAL-MERGE** Already has this config value, and now is manual merge, will skip it! key = %s.", new Object[]{str2}));
                return null;
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    protected static void doAsyncTask(@NonNull final Runnable runnable) {
        new AsyncTask<Void, Void, Void>() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Void doInBackground(Void... voidArr) {
                runnable.run();
                return null;
            }
        }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
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
                jSONObject = this.mCachedConfigs.getJSONObject("config");
            }
        }
        return jSONObject;
    }

    public long getLastUpdateVersion() {
        String str = f9510a;
        StringBuilder sb = new StringBuilder("get: getLastUpdateVersion = ");
        sb.append(ConfigUtils.formatConfigVersionWithTime(this.mCurrentConfigVersion));
        LoggerWrapper.v(str, sb.toString());
        return this.mCurrentConfigVersion;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.alibaba.fastjson.JSONObject} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.fastjson.JSONObject getSectionConfig(@androidx.annotation.NonNull java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.isShutdown()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.Object r0 = r3.mConfigLock
            monitor-enter(r0)
            com.alibaba.fastjson.JSONObject r2 = r3.mCachedConfigs     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0027
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0016
            goto L_0x0027
        L_0x0016:
            com.alibaba.fastjson.JSONObject r2 = r3.mCachedConfigs     // Catch:{ all -> 0x0029 }
            com.alibaba.fastjson.JSONObject r4 = r2.getJSONObject(r4)     // Catch:{ all -> 0x0029 }
            if (r4 == 0) goto L_0x0025
            java.lang.Object r4 = r4.clone()     // Catch:{ all -> 0x0029 }
            r1 = r4
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1     // Catch:{ all -> 0x0029 }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return r1
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return r1
        L_0x0029:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.plus.android.config.sdk.ConfigMerger.getSectionConfig(java.lang.String):com.alibaba.fastjson.JSONObject");
    }

    @Nullable
    public ConfigGetter getSectionConfigGetter(@NonNull String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-889383886, oncanceled);
            onCancelLoad.getMin(-889383886, oncanceled);
        }
        final JSONObject sectionConfig = getSectionConfig(str);
        if (sectionConfig == null) {
            return null;
        }
        return new ConfigGetter() {
            /* access modifiers changed from: protected */
            public JSONObject getConfigInternal() {
                return sectionConfig;
            }
        };
    }

    @Nullable
    public JSONObject getSectionConfigObjects() {
        JSONObject jSONObject;
        if (isShutdown() || (jSONObject = this.mCachedConfigs) == null) {
            return null;
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.clone();
        jSONObject2.remove("config");
        return jSONObject2;
    }

    /* access modifiers changed from: protected */
    public void initializeWithCache(@Nullable String str) {
        synchronized (this.mConfigLock) {
            this.mCachedConfigs = null;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject parseObject = JSON.parseObject(str);
                    this.mCurrentConfigVersion = parseObject.getLongValue("_version");
                    JSONObject jSONObject = parseObject.getJSONObject("_data");
                    this.mCachedConfigs = jSONObject;
                    LoggerWrapper.i(f9510a, String.format("** Cached config has %d items.", new Object[]{Integer.valueOf(jSONObject != null ? jSONObject.size() : 0)}));
                } catch (Throwable th) {
                    LoggerWrapper.e(f9510a, String.format("Parse cached config FAILED! message = %s.", new Object[]{th.getMessage()}));
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

    public boolean mergeCommonConfig(@NonNull String str, @Nullable Object obj) {
        return mergeConfig((String) null, str, obj);
    }

    public boolean mergeConfig(@Nullable String str, @NonNull JSONObject jSONObject) {
        return mergeConfigAdvanced(str, jSONObject, false, false);
    }

    public boolean mergeConfig(@Nullable String str, @NonNull String str2, @Nullable Object obj) {
        return mergeConfig(str, ConfigUtils.kv(str2, obj));
    }

    public boolean mergeConfigAdvanced(@Nullable String str, @NonNull JSONObject jSONObject, boolean z, boolean z2) {
        return mergeConfigAdvanced(str, jSONObject, z, z2, true);
    }

    public boolean mergeConfigAdvanced(@Nullable String str, @NonNull JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            str = "config";
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, jSONObject);
        return a((List<String>) null, hashMap, z, z2, z3) != null;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public MergeChangeResult parseFetchedConfigs(@Nullable List<String> list, @Nullable Map<String, Object> map) {
        MergeChangeResult a2 = a(list, a(map), true, true, true);
        LoggerWrapper.i(f9510a, String.format("** Parse fetched config completely! changed = %s.", new Object[]{String.valueOf(a2 != null && !a2.changedList.isEmpty())}));
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
        final String jSONString;
        synchronized (this.mConfigLock) {
            LoggerWrapper.i(f9510a, "** Will save configs to local cache!, mergeByManual = false.");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("_version", (Object) Long.valueOf(this.mCurrentConfigVersion));
            jSONObject.put("_data", (Object) this.mCachedConfigs);
            jSONString = jSONObject.toJSONString();
        }
        doAsyncTask(new Runnable() {
            public void run() {
                ConfigMerger.this.saveConfigInternal(jSONString);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void setLastUpdateVersion(long j) {
        this.mCurrentConfigVersion = j;
        String str = f9510a;
        StringBuilder sb = new StringBuilder("set: setLastUpdateVersion = ");
        sb.append(ConfigUtils.formatConfigVersionWithTime(this.mCurrentConfigVersion));
        LoggerWrapper.v(str, sb.toString());
    }

    public void shutdown() {
        this.mStatus = Status.Shutdown;
        LoggerWrapper.i(f9510a, "shutdown ConfigCenter!");
    }
}
