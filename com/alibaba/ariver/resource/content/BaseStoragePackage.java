package com.alibaba.ariver.resource.content;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.resource.api.content.ResourcePackage;
import com.alibaba.ariver.resource.api.content.ResourceQuery;
import com.alibaba.ariver.resource.parser.PackageParseUtils;
import com.alibaba.ariver.resource.parser.ParseContext;
import com.alibaba.ariver.resource.parser.a;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class BaseStoragePackage implements ResourcePackage {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, String>> f10182a = new ConcurrentHashMap();
    private String b;
    private boolean c = false;
    private Map<String, Resource> d = new ConcurrentHashMap();
    protected CountDownLatch mParseLock = new CountDownLatch(1);
    protected CountDownLatch mSetupLock = new CountDownLatch(1);

    public void afterParsePackage(ParseContext parseContext) {
    }

    /* access modifiers changed from: protected */
    public void beforeParsePackage(ParseContext parseContext) {
    }

    /* access modifiers changed from: protected */
    public abstract String getLogTag();

    /* access modifiers changed from: protected */
    public boolean needWaitSetupWhenGet() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onParsePackageSuccess(ParseContext parseContext) {
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public void setStorage(Map<String, Resource> map) {
        this.d = map;
    }

    public void add(Resource resource) {
        this.d.put(resource.getUrl(), resource);
        Uri parseUrl = UrlUtils.parseUrl(resource.getUrl());
        if ("header.json".equals(resource.getUrl()) || "header.json".equals(parseUrl.getLastPathSegment())) {
            a(resource.getBytes());
        }
    }

    public void remove(String str) {
        this.d.remove(str);
    }

    public void onVerifyError(a aVar) {
        ParseContext parseContext = aVar.getParseContext();
        if (parseContext != null) {
            String logTag = getLogTag();
            StringBuilder sb = new StringBuilder("onVerifyError, delete packagePath: ");
            sb.append(parseContext.packagePath);
            RVLogger.w(logTag, sb.toString());
            FileUtils.delete(parseContext.packagePath);
        }
    }

    /* access modifiers changed from: protected */
    public void parseContent(final String str, String str2) {
        RVLogger.d(getLogTag(), "parseContent installPath:".concat(String.valueOf(str2)));
        if (TextUtils.isEmpty(str2)) {
            RVLogger.e(getLogTag(), "parseContent installPath is null, appId:".concat(String.valueOf(str)));
        }
        try {
            final ParseContext parseContext = new ParseContext();
            parseContext.appId = str;
            parseContext.packagePath = str2;
            beforeParsePackage(parseContext);
            ExecutorUtils.execute(ExecutorType.URGENT_DISPLAY, new Runnable() {
                public void run() {
                    Map map;
                    try {
                        StringBuilder sb = new StringBuilder(RVTraceKey.RV_Package_parse_);
                        sb.append(str);
                        RVTraceUtils.traceBeginSection(sb.toString());
                        for (Resource add : PackageParseUtils.parsePackage(parseContext).values()) {
                            BaseStoragePackage.this.add(add);
                        }
                        BaseStoragePackage.this.onParsePackageSuccess(parseContext);
                    } catch (a e) {
                        e.setParseContext(parseContext);
                        BaseStoragePackage.this.onVerifyError(e);
                    } catch (Throwable th) {
                        BaseStoragePackage.this.onPrepareDone();
                        BaseStoragePackage.this.onParseDone();
                        throw th;
                    }
                    BaseStoragePackage.this.onPrepareDone();
                    BaseStoragePackage.this.onParseDone();
                    for (String next : BaseStoragePackage.this.getResourceHeaderMap().keySet()) {
                        Resource resource = BaseStoragePackage.this.get(ResourceQuery.asUrl(next));
                        if (!(resource == null || (map = BaseStoragePackage.this.getResourceHeaderMap().get(next)) == null)) {
                            for (Map.Entry entry : map.entrySet()) {
                                resource.addHeader((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                    }
                    BaseStoragePackage.this.afterParsePackage(parseContext);
                    StringBuilder sb2 = new StringBuilder(RVTraceKey.RV_Package_parse_);
                    sb2.append(str);
                    RVTraceUtils.traceEndSection(sb2.toString());
                }
            });
        } catch (Exception e) {
            RVLogger.e(getLogTag(), "parseContent exception!", e);
            onParseDone();
            onPrepareDone();
        }
    }

    public void waitForSetup() {
        String logTag = getLogTag();
        StringBuilder sb = new StringBuilder("waitForSetup (");
        sb.append(this.mSetupLock.getCount());
        sb.append(") with stack: ");
        sb.append(Log.getStackTraceString(new Throwable("Just Print")));
        RVLogger.w(logTag, sb.toString());
        try {
            this.mSetupLock.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            RVLogger.e(getLogTag(), "waitForSetup error", e);
        }
    }

    public void waitForParse() {
        try {
            this.mParseLock.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            RVLogger.e(getLogTag(), "waitForSetup error", e);
        }
    }

    public boolean isPrepareDone() {
        return this.mSetupLock.getCount() == 0;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public void onPrepareDone() {
        this.mSetupLock.countDown();
    }

    @CallSuper
    public void onParseDone() {
        this.mParseLock.countDown();
    }

    /* access modifiers changed from: protected */
    public Map<String, Map<String, String>> getResourceHeaderMap() {
        return this.f10182a;
    }

    private void a(byte[] bArr) {
        this.f10182a.clear();
        String str = new String(bArr);
        RVLogger.d(getLogTag(), "addHeader from header.json: ".concat(str));
        JSONObject parseObject = JSONUtils.parseObject(str);
        if (parseObject != null && parseObject.size() > 0) {
            for (String str2 : new HashSet(parseObject.keySet())) {
                JSONObject jSONObject = JSONUtils.getJSONObject(parseObject, str2, (JSONObject) null);
                if (jSONObject != null) {
                    HashMap hashMap = new HashMap();
                    for (String next : jSONObject.keySet()) {
                        String string = JSONUtils.getString(jSONObject, next);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(next, string);
                        }
                    }
                    this.f10182a.put(str2, hashMap);
                }
            }
        }
    }

    public Resource get(@NonNull ResourceQuery resourceQuery) {
        String str = resourceQuery.pureUrl;
        if (this.mSetupLock.getCount() > 0) {
            if (needWaitSetupWhenGet()) {
                RVLogger.d(getLogTag(), "get resource wait for mSetupLock!");
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    this.mSetupLock.await(5, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                }
                String logTag = getLogTag();
                StringBuilder sb = new StringBuilder("wait for mSetupLock cost: ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                RVLogger.d(logTag, sb.toString());
            }
            if (this.mParseLock.getCount() > 0) {
                long currentTimeMillis2 = System.currentTimeMillis();
                RVLogger.d(getLogTag(), "get resource wait for parseLock!");
                try {
                    this.mParseLock.await(3, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    RVLogger.w(getLogTag(), "wait parse exception ", e);
                }
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                String logTag2 = getLogTag();
                StringBuilder sb2 = new StringBuilder("wait for parseLock cost: ");
                sb2.append(System.currentTimeMillis() - currentTimeMillis2);
                RVLogger.d(logTag2, sb2.toString());
                if (currentTimeMillis3 >= 3000) {
                    this.b = "wait_appParse_timeout";
                    this.mParseLock.countDown();
                }
            }
        }
        Resource resource = this.d.get(str);
        if (resource != null) {
            RVLogger.d(getLogTag(), "load response ".concat(String.valueOf(str)));
        } else if (TextUtils.isEmpty(this.b)) {
            this.b = "notMatch";
        }
        return resource;
    }

    /* access modifiers changed from: protected */
    public boolean contains(String str) {
        return this.d.containsKey(str);
    }

    /* access modifiers changed from: protected */
    public CountDownLatch getSetupLock() {
        return this.mSetupLock;
    }

    /* access modifiers changed from: protected */
    public CountDownLatch getParseLock() {
        return this.mParseLock;
    }

    public boolean isDetached() {
        return this.c;
    }

    public void teardown() {
        RVLogger.d(getLogTag(), "release storage");
        this.c = true;
        this.d.clear();
    }

    /* access modifiers changed from: protected */
    public boolean isEmpty() {
        return this.d.isEmpty();
    }

    public Set<String> keySet() {
        return this.d.keySet();
    }

    public int count() {
        return this.d.size();
    }
}
