package com.alipay.plus.android.ab.sdk;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.task.async.IAPAsyncTask;
import com.alipay.plus.android.ab.sdk.fetcher.AbTestingFetcher;
import com.alipay.plus.android.ab.sdk.fetcher.AbTestingRpcFetcher;
import com.alipay.plus.android.ab.sdk.monitor.AbTestingMonitor;
import com.alipay.plus.android.ab.sdk.storage.AbTestingStorage;
import com.alipay.plus.android.ab.sdk.trigger.AbTestingTrigger;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.fetcher.FetchException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbTestingSdk {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10726a = e.a("AbTestingSdk");
    @SuppressLint({"StaticFieldLeak"})
    private static final AbTestingSdk b = new AbTestingSdk();
    private AbTestingContext c;
    private AbTestingStorage d;
    private boolean e = false;
    private Map<String, Set<String>> f;
    /* access modifiers changed from: private */
    public AbTestingFetcher g;

    public interface Callback {
        void handleException(FetchException fetchException);

        void handleVariation(@Nullable Map<String, String> map);
    }

    private AbTestingSdk() {
    }

    private synchronized void a(@Nullable Map<String, Set<String>> map) {
        this.f = map;
    }

    private boolean a(@NonNull String str, @NonNull String str2) {
        LoggerWrapper.d(f10726a, String.format("getVariation: source = %s, entrance = %s", new Object[]{str, str2}));
        if (!isInitialized()) {
            LoggerWrapper.e(f10726a, "** AbTestingSdk not initialized, will return!");
            return false;
        }
        Map<String, Set<String>> map = this.f;
        if (map == null) {
            LoggerWrapper.e(f10726a, "** AbTestingSdk cache not initialized, will return!");
            return false;
        }
        Set set = map.get(str);
        if (set == null) {
            LoggerWrapper.e(f10726a, String.format("** can not find source [%s], will return!", new Object[]{str}));
            return false;
        } else if (!set.contains(str2)) {
            LoggerWrapper.e(f10726a, String.format("** can not find entrance [%s] in source [%s], will return!", new Object[]{str2, str}));
            return false;
        } else if (this.g != null) {
            return true;
        } else {
            LoggerWrapper.e(f10726a, "** Fetcher is null,will return!");
            return false;
        }
    }

    @NonNull
    public static AbTestingSdk getInstance() {
        return b;
    }

    @Nullable
    public AbTestingFetcher getAbTestingFetcher() {
        return this.g;
    }

    public void getVariation(@NonNull final String str, @NonNull final String str2, final Callback callback) {
        if (callback == null) {
            LoggerWrapper.e(f10726a, "** Callback is null, will return!");
            return;
        }
        if (!a(str, str2)) {
            callback.handleVariation((Map<String, String>) null);
        }
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                try {
                    callback.handleVariation(AbTestingSdk.this.g.getVariation(str, str2));
                } catch (Throwable th) {
                    callback.handleException(e.a(th, true));
                }
            }
        });
    }

    public Map<String, String> getVariationSync(@NonNull String str, @NonNull String str2) throws FetchException {
        if (!a(str, str2)) {
            return null;
        }
        try {
            return this.g.getVariation(str, str2);
        } catch (Throwable th) {
            throw e.a(th, true);
        }
    }

    public void initialize(@NonNull AbTestingContext abTestingContext) {
        if (this.e) {
            LoggerWrapper.d(f10726a, "AbTestingSdk already initialized!");
            return;
        }
        this.c = abTestingContext;
        abTestingContext.getAbTestingMonitor().behavior(AbTestingMonitor.Events.AB_INITIALIZED, (Map<String, String>) null);
        this.g = new AbTestingRpcFetcher(this.c);
        AbTestingTrigger abTestingTrigger = this.c.getAbTestingTrigger();
        if (abTestingTrigger != null) {
            abTestingTrigger.initialize(this.c.getContext());
        }
        LoggerWrapper.i(f10726a, "** ABTesting initialize...");
        this.e = true;
        AbTestingStorage abTestingStorage = new AbTestingStorage(this.c.getContext(), this.c.getEnvironment());
        this.d = abTestingStorage;
        a(abTestingStorage.loadAbVariation());
    }

    public boolean isInitialized() {
        return this.e;
    }

    public void setAbTestingFetcher(@NonNull AbTestingFetcher abTestingFetcher) {
        this.g = abTestingFetcher;
    }

    public void startAbTestingTrigger() {
        if (!this.e) {
            LoggerWrapper.e(f10726a, "startAbTestingTrigger. You need invoke initialize(ctx) firstly!");
            return;
        }
        AbTestingTrigger abTestingTrigger = this.c.getAbTestingTrigger();
        if (abTestingTrigger != null) {
            abTestingTrigger.startTrigger(this.c);
        }
    }

    public void switchEnvironment(String str) {
        if (!this.e) {
            LoggerWrapper.e(f10726a, "switchEnvironment. You need invoke initialize(ctx) firstly!");
            return;
        }
        this.c.setEnvironment(str);
        AbTestingStorage abTestingStorage = new AbTestingStorage(this.c.getContext(), str);
        this.d = abTestingStorage;
        a(abTestingStorage.loadAbVariation());
    }

    public synchronized void updateAbVariation(@NonNull String str, String str2) {
        if (this.f == null) {
            this.f = new HashMap();
        }
        Set set = this.f.get(str);
        if (set == null) {
            set = new HashSet();
            this.f.put(str, set);
        }
        set.add(str2);
        if (this.d != null) {
            this.d.updateAbvariation(str, str2);
        }
    }
}
