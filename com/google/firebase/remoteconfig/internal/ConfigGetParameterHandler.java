package com.google.firebase.remoteconfig.internal;

import android.os.Process;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import o.CompositeGeneratedAdaptersObserver;
import org.json.JSONException;

public class ConfigGetParameterHandler {
    static final Pattern FALSE_REGEX = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    @VisibleForTesting(otherwise = 3)
    public static final Charset FRC_BYTE_ARRAY_ENCODING;
    private static int IsOverlapping = 1;
    static final Pattern TRUE_REGEX = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    private static char[] getMax;
    private static int getMin;
    private static int length;
    private static boolean setMax;
    private static boolean setMin;
    private final ConfigCacheClient activatedConfigsCache;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final Set<BiConsumer<String, ConfigContainer>> listeners = new HashSet();

    static void setMax() {
        length = 98;
        setMax = true;
        setMin = true;
        getMax = new char[]{Typography.middleDot, Typography.paragraph, 168, 143, 154};
    }

    public static /* synthetic */ void setMin(BiConsumer biConsumer, String str, ConfigContainer configContainer) {
        int i = getMin + 43;
        IsOverlapping = i % 128;
        if (!(i % 2 == 0)) {
            lambda$callListeners$0(biConsumer, str, configContainer);
            return;
        }
        try {
            lambda$callListeners$0(biConsumer, str, configContainer);
            int i2 = 5 / 0;
        } catch (Exception e) {
            throw e;
        }
    }

    static {
        setMax();
        char[] cArr = null;
        FRC_BYTE_ARRAY_ENCODING = Charset.forName(length(new byte[]{-123, -124, -125, -126, -127}, (Process.myPid() >> 22) + 127, cArr, cArr).intern());
        int i = IsOverlapping + 111;
        getMin = i % 128;
        if (!(i % 2 == 0)) {
            int length2 = cArr.length;
        }
    }

    public ConfigGetParameterHandler(Executor executor2, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.executor = executor2;
        this.activatedConfigsCache = configCacheClient;
        this.defaultConfigsCache = configCacheClient2;
    }

    public String getString(String str) {
        String stringFromCache = getStringFromCache(this.activatedConfigsCache, str);
        if (stringFromCache != null) {
            int i = getMin + 113;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            try {
                callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
                int i3 = getMin + 119;
                IsOverlapping = i3 % 128;
                if ((i3 % 2 == 0 ? 'F' : 29) == 29) {
                    return stringFromCache;
                }
                int i4 = 16 / 0;
                return stringFromCache;
            } catch (Exception e) {
                throw e;
            }
        } else {
            String stringFromCache2 = getStringFromCache(this.defaultConfigsCache, str);
            if (stringFromCache2 != null) {
                int i5 = getMin + 59;
                IsOverlapping = i5 % 128;
                if (!(i5 % 2 == 0)) {
                    return stringFromCache2;
                }
                int i6 = 69 / 0;
                return stringFromCache2;
            }
            logParameterValueDoesNotExist(str, "String");
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r3 != false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        if ((TRUE_REGEX.matcher(r0).matches() ? '/' : 'D') != '/') goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getBoolean(java.lang.String r6) {
        /*
            r5 = this;
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r0 = r5.activatedConfigsCache     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r0 = getStringFromCache(r0, r6)     // Catch:{ Exception -> 0x00a6 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x004a
            int r3 = IsOverlapping
            int r3 = r3 + 35
            int r4 = r3 % 128
            getMin = r4
            int r3 = r3 % 2
            java.util.regex.Pattern r3 = TRUE_REGEX
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L_0x002a
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r0 = r5.activatedConfigsCache
            com.google.firebase.remoteconfig.internal.ConfigContainer r0 = getConfigsFromCache(r0)
            r5.callListeners(r6, r0)
            return r1
        L_0x002a:
            java.util.regex.Pattern r3 = FALSE_REGEX
            java.util.regex.Matcher r0 = r3.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x004a
            int r0 = IsOverlapping
            int r0 = r0 + 27
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r0 = r5.activatedConfigsCache
            com.google.firebase.remoteconfig.internal.ConfigContainer r0 = getConfigsFromCache(r0)
            r5.callListeners(r6, r0)
            return r2
        L_0x004a:
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r0 = r5.defaultConfigsCache
            java.lang.String r0 = getStringFromCache(r0, r6)
            if (r0 == 0) goto L_0x00a0
            int r3 = getMin
            int r3 = r3 + 13
            int r4 = r3 % 128
            IsOverlapping = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0071
            java.util.regex.Pattern r3 = TRUE_REGEX
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r3 = r3.matches()
            r4 = 0
            super.hashCode()     // Catch:{ all -> 0x006f }
            if (r3 == 0) goto L_0x0086
            goto L_0x009d
        L_0x006f:
            r6 = move-exception
            throw r6
        L_0x0071:
            java.util.regex.Pattern r3 = TRUE_REGEX     // Catch:{ Exception -> 0x009e }
            java.util.regex.Matcher r3 = r3.matcher(r0)     // Catch:{ Exception -> 0x009e }
            boolean r3 = r3.matches()     // Catch:{ Exception -> 0x009e }
            r4 = 47
            if (r3 == 0) goto L_0x0082
            r3 = 47
            goto L_0x0084
        L_0x0082:
            r3 = 68
        L_0x0084:
            if (r3 == r4) goto L_0x009d
        L_0x0086:
            java.util.regex.Pattern r1 = FALSE_REGEX
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            r1 = 51
            if (r0 == 0) goto L_0x0097
            r0 = 51
            goto L_0x0099
        L_0x0097:
            r0 = 50
        L_0x0099:
            if (r0 == r1) goto L_0x009c
            goto L_0x00a0
        L_0x009c:
            return r2
        L_0x009d:
            return r1
        L_0x009e:
            r6 = move-exception
            throw r6
        L_0x00a0:
            java.lang.String r0 = "Boolean"
            logParameterValueDoesNotExist(r6, r0)
            return r2
        L_0x00a6:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.getBoolean(java.lang.String):boolean");
    }

    public byte[] getByteArray(String str) {
        int i = getMin + 33;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        String stringFromCache = getStringFromCache(this.activatedConfigsCache, str);
        if (stringFromCache != null) {
            callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
            return stringFromCache.getBytes(FRC_BYTE_ARRAY_ENCODING);
        }
        String stringFromCache2 = getStringFromCache(this.defaultConfigsCache, str);
        if (stringFromCache2 != null) {
            int i3 = getMin + 31;
            IsOverlapping = i3 % 128;
            if ((i3 % 2 == 0 ? '(' : '2') != '(') {
                return stringFromCache2.getBytes(FRC_BYTE_ARRAY_ENCODING);
            }
            byte[] bytes = stringFromCache2.getBytes(FRC_BYTE_ARRAY_ENCODING);
            Object obj = null;
            super.hashCode();
            return bytes;
        }
        logParameterValueDoesNotExist(str, "ByteArray");
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
    }

    public double getDouble(String str) {
        try {
            int i = getMin + 125;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            Double doubleFromCache = getDoubleFromCache(this.activatedConfigsCache, str);
            if (doubleFromCache != null) {
                try {
                    callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
                    return doubleFromCache.doubleValue();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                Double doubleFromCache2 = getDoubleFromCache(this.defaultConfigsCache, str);
                if (!(doubleFromCache2 == null)) {
                    double doubleValue = doubleFromCache2.doubleValue();
                    int i3 = IsOverlapping + 93;
                    getMin = i3 % 128;
                    if ((i3 % 2 != 0 ? 24 : '7') != 24) {
                        return doubleValue;
                    }
                    int i4 = 23 / 0;
                    return doubleValue;
                }
                logParameterValueDoesNotExist(str, "Double");
                return 0.0d;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public long getLong(String str) {
        int i = IsOverlapping + 31;
        getMin = i % 128;
        int i2 = i % 2;
        Long longFromCache = getLongFromCache(this.activatedConfigsCache, str);
        if ((longFromCache != null ? '=' : ':') != ':') {
            int i3 = getMin + 5;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
            callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
            return longFromCache.longValue();
        }
        try {
            Long longFromCache2 = getLongFromCache(this.defaultConfigsCache, str);
            if (longFromCache2 == null) {
                logParameterValueDoesNotExist(str, "Long");
                return 0;
            }
            try {
                int i5 = getMin + 83;
                IsOverlapping = i5 % 128;
                int i6 = i5 % 2;
                return longFromCache2.longValue();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public FirebaseRemoteConfigValue getValue(String str) {
        int i = IsOverlapping + 103;
        getMin = i % 128;
        int i2 = i % 2;
        String stringFromCache = getStringFromCache(this.activatedConfigsCache, str);
        if (stringFromCache != null) {
            callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
            FirebaseRemoteConfigValueImpl firebaseRemoteConfigValueImpl = new FirebaseRemoteConfigValueImpl(stringFromCache, 2);
            int i3 = getMin + 91;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
            return firebaseRemoteConfigValueImpl;
        }
        try {
            try {
                String stringFromCache2 = getStringFromCache(this.defaultConfigsCache, str);
                if (stringFromCache2 != null) {
                    FirebaseRemoteConfigValueImpl firebaseRemoteConfigValueImpl2 = new FirebaseRemoteConfigValueImpl(stringFromCache2, 1);
                    int i5 = getMin + 19;
                    IsOverlapping = i5 % 128;
                    int i6 = i5 % 2;
                    return firebaseRemoteConfigValueImpl2;
                }
                logParameterValueDoesNotExist(str, "FirebaseRemoteConfigValue");
                return new FirebaseRemoteConfigValueImpl("", 0);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r5 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set<java.lang.String> getKeysByPrefix(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 41
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r0 = 86
            int r0 = r0 / r1
            if (r5 != 0) goto L_0x001c
            goto L_0x001a
        L_0x0013:
            r5 = move-exception
            throw r5
        L_0x0015:
            if (r5 != 0) goto L_0x0018
            r1 = 1
        L_0x0018:
            if (r1 == 0) goto L_0x001c
        L_0x001a:
            java.lang.String r5 = ""
        L_0x001c:
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r1 = r4.activatedConfigsCache
            com.google.firebase.remoteconfig.internal.ConfigContainer r1 = getConfigsFromCache(r1)
            if (r1 == 0) goto L_0x0053
            int r2 = IsOverlapping
            int r2 = r2 + 119
            int r3 = r2 % 128
            getMin = r3
            int r2 = r2 % 2
            r3 = 91
            if (r2 == 0) goto L_0x003a
            r2 = 42
            goto L_0x003c
        L_0x003a:
            r2 = 91
        L_0x003c:
            if (r2 == r3) goto L_0x004c
            java.util.TreeSet r1 = getKeysByPrefix(r5, r1)
            r0.addAll(r1)
            r1 = 0
            super.hashCode()     // Catch:{ all -> 0x004a }
            goto L_0x0053
        L_0x004a:
            r5 = move-exception
            throw r5
        L_0x004c:
            java.util.TreeSet r1 = getKeysByPrefix(r5, r1)     // Catch:{ Exception -> 0x0070 }
            r0.addAll(r1)     // Catch:{ Exception -> 0x0070 }
        L_0x0053:
            com.google.firebase.remoteconfig.internal.ConfigCacheClient r1 = r4.defaultConfigsCache     // Catch:{ Exception -> 0x0070 }
            com.google.firebase.remoteconfig.internal.ConfigContainer r1 = getConfigsFromCache(r1)     // Catch:{ Exception -> 0x0070 }
            if (r1 == 0) goto L_0x0065
            java.util.TreeSet r5 = getKeysByPrefix(r5, r1)     // Catch:{ Exception -> 0x0063 }
            r0.addAll(r5)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0065
        L_0x0063:
            r5 = move-exception
            throw r5
        L_0x0065:
            int r5 = IsOverlapping
            int r5 = r5 + 63
            int r1 = r5 % 128
            getMin = r1
            int r5 = r5 % 2
            return r0
        L_0x0070:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.getKeysByPrefix(java.lang.String):java.util.Set");
    }

    private static TreeSet<String> getKeysByPrefix(String str, ConfigContainer configContainer) {
        TreeSet<String> treeSet = new TreeSet<>();
        try {
            Iterator<String> keys = configContainer.getConfigs().keys();
            int i = getMin + 105;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            while (true) {
                if (!(keys.hasNext())) {
                    return treeSet;
                }
                try {
                    int i3 = getMin + 29;
                    IsOverlapping = i3 % 128;
                    int i4 = i3 % 2;
                    String next = keys.next();
                    if ((next.startsWith(str) ? 7 : '4') != '4') {
                        treeSet.add(next);
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public Map<String, FirebaseRemoteConfigValue> getAll() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(getKeySetFromCache(this.activatedConfigsCache));
        hashSet.addAll(getKeySetFromCache(this.defaultConfigsCache));
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        int i = IsOverlapping + 67;
        getMin = i % 128;
        while (true) {
            int i2 = i % 2;
            try {
                if ((it.hasNext() ? Typography.less : '3') == '3') {
                    return hashMap;
                }
                int i3 = IsOverlapping + 65;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                String str = (String) it.next();
                hashMap.put(str, getValue(str));
                i = IsOverlapping + 7;
                getMin = i % 128;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    public void addListener(BiConsumer<String, ConfigContainer> biConsumer) {
        synchronized (this.listeners) {
            this.listeners.add(biConsumer);
        }
    }

    private void callListeners(String str, ConfigContainer configContainer) {
        if (configContainer != null) {
            synchronized (this.listeners) {
                for (BiConsumer<String, ConfigContainer> compositeGeneratedAdaptersObserver : this.listeners) {
                    this.executor.execute(new CompositeGeneratedAdaptersObserver(compositeGeneratedAdaptersObserver, str, configContainer));
                }
            }
        }
    }

    private static /* synthetic */ void lambda$callListeners$0(BiConsumer biConsumer, String str, ConfigContainer configContainer) {
        int i = getMin + 95;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            biConsumer.accept(str, configContainer);
            int i3 = IsOverlapping + 43;
            getMin = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if ((r3 == null ? '\'' : 'D') != 'D') goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        if (r3 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3 = r3.getConfigs().getString(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003a, code lost:
        r4 = IsOverlapping + 73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        getMin = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0040, code lost:
        r4 = r4 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0042, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0043, code lost:
        return r2;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getStringFromCache(com.google.firebase.remoteconfig.internal.ConfigCacheClient r3, java.lang.String r4) {
        /*
            int r0 = getMin     // Catch:{ Exception -> 0x0046 }
            int r0 = r0 + 43
            int r1 = r0 % 128
            IsOverlapping = r1     // Catch:{ Exception -> 0x0046 }
            int r0 = r0 % 2
            r1 = 97
            if (r0 != 0) goto L_0x0011
            r0 = 42
            goto L_0x0013
        L_0x0011:
            r0 = 97
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x0029
            com.google.firebase.remoteconfig.internal.ConfigContainer r3 = getConfigsFromCache(r3)
            int r0 = r2.length     // Catch:{ all -> 0x0027 }
            r0 = 68
            if (r3 != 0) goto L_0x0022
            r1 = 39
            goto L_0x0024
        L_0x0022:
            r1 = 68
        L_0x0024:
            if (r1 == r0) goto L_0x0030
            goto L_0x002f
        L_0x0027:
            r3 = move-exception
            throw r3
        L_0x0029:
            com.google.firebase.remoteconfig.internal.ConfigContainer r3 = getConfigsFromCache(r3)     // Catch:{ Exception -> 0x0044 }
            if (r3 != 0) goto L_0x0030
        L_0x002f:
            return r2
        L_0x0030:
            org.json.JSONObject r3 = r3.getConfigs()     // Catch:{ JSONException -> 0x0043 }
            java.lang.String r3 = r3.getString(r4)     // Catch:{ JSONException -> 0x0043 }
            int r4 = IsOverlapping     // Catch:{ Exception -> 0x0046 }
            int r4 = r4 + 73
            int r0 = r4 % 128
            getMin = r0     // Catch:{ Exception -> 0x0044 }
            int r4 = r4 % 2
            return r3
        L_0x0043:
            return r2
        L_0x0044:
            r3 = move-exception
            throw r3
        L_0x0046:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler.getStringFromCache(com.google.firebase.remoteconfig.internal.ConfigCacheClient, java.lang.String):java.lang.String");
    }

    @Nullable
    private static Double getDoubleFromCache(ConfigCacheClient configCacheClient, String str) {
        try {
            ConfigContainer configsFromCache = getConfigsFromCache(configCacheClient);
            if (configsFromCache == null) {
                try {
                    int i = getMin + 75;
                    IsOverlapping = i % 128;
                    int i2 = i % 2;
                    return null;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                try {
                    Double valueOf = Double.valueOf(configsFromCache.getConfigs().getDouble(str));
                    int i3 = IsOverlapping + 89;
                    getMin = i3 % 128;
                    int i4 = i3 % 2;
                    return valueOf;
                } catch (JSONException unused) {
                    return null;
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Long] */
    @Nullable
    private static Long getLongFromCache(ConfigCacheClient configCacheClient, String str) {
        int i = IsOverlapping + 59;
        getMin = i % 128;
        int i2 = i % 2;
        ConfigContainer configsFromCache = getConfigsFromCache(configCacheClient);
        ? r2 = 0;
        if (!(configsFromCache != null)) {
            int i3 = IsOverlapping + 87;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return r2;
        }
        try {
            Long valueOf = Long.valueOf(configsFromCache.getConfigs().getLong(str));
            try {
                int i5 = IsOverlapping + 105;
                getMin = i5 % 128;
                if ((i5 % 2 != 0 ? 'I' : '_') != 'I') {
                    return valueOf;
                }
                int length2 = r2.length;
                return valueOf;
            } catch (Exception e) {
                throw e;
            }
        } catch (JSONException unused) {
            return r2;
        }
    }

    private static Set<String> getKeySetFromCache(ConfigCacheClient configCacheClient) {
        HashSet hashSet = new HashSet();
        ConfigContainer configsFromCache = getConfigsFromCache(configCacheClient);
        if (configsFromCache == null) {
            try {
                int i = getMin + 39;
                IsOverlapping = i % 128;
                int i2 = i % 2;
                return hashSet;
            } catch (Exception e) {
                throw e;
            }
        } else {
            Iterator<String> keys = configsFromCache.getConfigs().keys();
            int i3 = getMin + 51;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
            while (true) {
                if (!(keys.hasNext())) {
                    return hashSet;
                }
                int i5 = getMin + 117;
                IsOverlapping = i5 % 128;
                int i6 = i5 % 2;
                hashSet.add(keys.next());
            }
        }
    }

    @Nullable
    private static ConfigContainer getConfigsFromCache(ConfigCacheClient configCacheClient) {
        int i = IsOverlapping + 67;
        getMin = i % 128;
        int i2 = i % 2;
        ConfigContainer blocking = configCacheClient.getBlocking();
        int i3 = getMin + 99;
        IsOverlapping = i3 % 128;
        if ((i3 % 2 == 0 ? 'H' : 14) == 14) {
            return blocking;
        }
        int i4 = 96 / 0;
        return blocking;
    }

    private static void logParameterValueDoesNotExist(String str, String str2) {
        int i = IsOverlapping + 13;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            int i3 = getMin + 73;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String length(byte[] bArr, int i, int[] iArr, char[] cArr) {
        char[] cArr2 = getMax;
        int i2 = length;
        int i3 = 0;
        if (setMin) {
            int length2 = bArr.length;
            char[] cArr3 = new char[length2];
            while (true) {
                if ((i3 < length2 ? (char) 3 : 20) == 20) {
                    return new String(cArr3);
                }
                int i4 = IsOverlapping + 81;
                getMin = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = (char) (cArr2[bArr[(length2 - 1) - i3] + i] - i2);
                i3++;
            }
        } else {
            try {
                if (setMax) {
                    int i6 = IsOverlapping + 45;
                    getMin = i6 % 128;
                    int i7 = i6 % 2;
                    int length3 = cArr.length;
                    char[] cArr4 = new char[length3];
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length3) {
                            return new String(cArr4);
                        }
                        cArr4[i8] = (char) (cArr2[cArr[(length3 - 1) - i8] - i] - i2);
                        i8++;
                    }
                } else {
                    int length4 = iArr.length;
                    char[] cArr5 = new char[length4];
                    while (true) {
                        if ((i3 < length4 ? 'V' : 'N') != 'V') {
                            return new String(cArr5);
                        }
                        cArr5[i3] = (char) (cArr2[iArr[(length4 - 1) - i3] - i] - i2);
                        i3++;
                        int i9 = getMin + 81;
                        IsOverlapping = i9 % 128;
                        int i10 = i9 % 2;
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
