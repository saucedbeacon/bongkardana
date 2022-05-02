package com.iap.ac.config.lite.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.config.ConfigRefreshCallback;
import com.iap.ac.android.common.config.IACConfig;
import com.iap.ac.android.common.config.IConfigChangeListener;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.fetcher.ConfigNotifyCallback;
import com.iap.ac.config.lite.listener.ConfigChangeType;
import com.iap.ac.config.lite.listener.commonconfig.ICommonConfigListener;
import com.iap.ac.config.lite.listener.sectionconfig.ChangedDetails;
import com.iap.ac.config.lite.listener.sectionconfig.ISectionConfigListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class ConfigProxy implements IACConfig {

    /* renamed from: a  reason: collision with root package name */
    private Map<IConfigChangeListener, List<ICommonConfigListener>> f9828a = new HashMap();
    private Map<IConfigChangeListener, List<ISectionConfigListener>> b = new HashMap();
    private ConfigCenter c;

    class d implements ISectionConfigListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IConfigChangeListener f9829a;

        d(ConfigProxy configProxy, IConfigChangeListener iConfigChangeListener) {
            this.f9829a = iConfigChangeListener;
        }

        public void onConfigChanged(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails) {
            this.f9829a.onSectionConfigChanged(str, jSONObject);
        }
    }

    class a implements ConfigNotifyCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ConfigRefreshCallback f11075a;

        a(ConfigProxy configProxy, ConfigRefreshCallback configRefreshCallback) {
            this.f11075a = configRefreshCallback;
        }

        public void onFetchFailed(String str, String str2) {
            ConfigRefreshCallback configRefreshCallback = this.f11075a;
            if (configRefreshCallback != null) {
                configRefreshCallback.onFetchFailed(str, str2);
            }
        }

        public void onFetchSuccess(JSONObject jSONObject) {
            ConfigRefreshCallback configRefreshCallback = this.f11075a;
            if (configRefreshCallback != null) {
                configRefreshCallback.onFetchSuccess(jSONObject);
            }
        }
    }

    class b implements ConfigNotifyCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ConfigRefreshCallback f11076a;

        b(ConfigProxy configProxy, ConfigRefreshCallback configRefreshCallback) {
            this.f11076a = configRefreshCallback;
        }

        public void onFetchFailed(String str, String str2) {
            ConfigRefreshCallback configRefreshCallback = this.f11076a;
            if (configRefreshCallback != null) {
                configRefreshCallback.onFetchFailed(str, str2);
            }
        }

        public void onFetchSuccess(JSONObject jSONObject) {
            ConfigRefreshCallback configRefreshCallback = this.f11076a;
            if (configRefreshCallback != null) {
                configRefreshCallback.onFetchSuccess(jSONObject);
            }
        }
    }

    class c implements ICommonConfigListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IConfigChangeListener f11077a;

        c(ConfigProxy configProxy, IConfigChangeListener iConfigChangeListener) {
            this.f11077a = iConfigChangeListener;
        }

        public void onCommonConfigChanged(@NonNull String str, @Nullable Object obj, @NonNull ConfigChangeType configChangeType) {
            this.f11077a.onConfigChanged(str, obj);
        }
    }

    static {
        e.b("ConfigProvider");
    }

    private ConfigProxy(String str) {
        this.c = ConfigCenter.getInstance(str);
    }

    private void a(List<ICommonConfigListener> list) {
        if (list != null) {
            for (ICommonConfigListener removeCommonConfigListener : list) {
                this.c.removeCommonConfigListener(removeCommonConfigListener);
            }
            list.clear();
        }
    }

    private void b(List<ISectionConfigListener> list) {
        if (list != null) {
            for (ISectionConfigListener removeSectionConfigListener : list) {
                this.c.removeSectionConfigListener(removeSectionConfigListener);
            }
            list.clear();
        }
    }

    public static ConfigProxy newInstance(String str) {
        return new ConfigProxy(str);
    }

    public synchronized void addCommonConfigChangeListener(@NonNull String str, @NonNull IConfigChangeListener iConfigChangeListener) {
        c cVar = new c(this, iConfigChangeListener);
        List list = this.f9828a.get(iConfigChangeListener);
        if (list == null) {
            list = new ArrayList();
            this.f9828a.put(iConfigChangeListener, list);
        }
        list.add(cVar);
        this.c.addCommonConfigListener(str, cVar);
    }

    public synchronized void addSectionConfigChangeListener(@NonNull String str, @NonNull IConfigChangeListener iConfigChangeListener) {
        d dVar = new d(this, iConfigChangeListener);
        List list = this.b.get(iConfigChangeListener);
        if (list == null) {
            list = new ArrayList();
            this.b.put(iConfigChangeListener, list);
        }
        list.add(dVar);
        this.c.addSectionConfigListener(str, dVar);
    }

    public boolean getBoolean(@NonNull String str, boolean z) {
        return this.c.getBoolConfig(str, z);
    }

    public double getDouble(@NonNull String str, double d2) {
        return this.c.getDoubleConfig(str, d2);
    }

    public int getInt(@NonNull String str, int i) {
        return this.c.getIntConfig(str, i);
    }

    public JSONArray getJSONArrayConfig(@NonNull String str) {
        return this.c.getJSONArrayConfig(str);
    }

    public JSONObject getJSONConfig(@NonNull String str) {
        return this.c.getJSONConfig(str);
    }

    public long getLong(@NonNull String str, long j) {
        return this.c.getLongConfig(str, j);
    }

    @Nullable
    public JSONObject getSectionConfig(@NonNull String str) {
        return this.c.getSectionConfig(str);
    }

    @Nullable
    public String getString(@NonNull String str) {
        return this.c.getStringConfig(str);
    }

    public void refreshByKeys(@NonNull List<String> list, Map<String, Object> map, ConfigRefreshCallback configRefreshCallback) {
        this.c.refreshByKeys(list, map, new a(this, configRefreshCallback), true);
    }

    public void refreshConfig(@Nullable Map<String, Object> map, boolean z) {
        if (z) {
            this.c.refreshConfigWithFrequenceLimit(map);
        } else {
            this.c.refreshConfig(map);
        }
    }

    public void removeAllConfigChangeListener() {
        for (List<ICommonConfigListener> a2 : this.f9828a.values()) {
            a(a2);
        }
        for (List<ISectionConfigListener> b2 : this.b.values()) {
            b(b2);
        }
    }

    public void removeConfiChangeListener(IConfigChangeListener iConfigChangeListener) {
        b(this.b.get(iConfigChangeListener));
        a(this.f9828a.get(iConfigChangeListener));
    }

    public static ConfigProxy newInstance() {
        return newInstance((String) null);
    }

    public void refreshByKeys(@NonNull String str, @NonNull List<String> list, Map<String, Object> map, ConfigRefreshCallback configRefreshCallback) {
        this.c.refreshByKeys(str, list, map, new b(this, configRefreshCallback), true);
    }
}
