package com.iap.ac.android.acs.multilanguage.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.multilanguage.callback.OnFetchCallback;
import com.iap.ac.android.acs.multilanguage.callback.OnUpdateCallback;
import com.iap.ac.android.acs.multilanguage.core.config.LanguagePackageConfig;
import com.iap.ac.android.acs.multilanguage.core.model.LanguageUpdateModel;
import com.iap.ac.android.acs.multilanguage.utils.LanguagePackageUtil;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.acs.multilanguage.utils.ResultCode;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.json.JSONException;
import org.json.JSONObject;

public class LanguagePackageManager implements ILangPkgManager {
    private static final String SP_BIZ_LANG_PKG_STORAGE = "AC_LANG_PKG_STORAGE";
    private static final String SP_LANG_PKG_UPDATE_TIME = "SP_AC_LANG_PKG_UPDATE_TIME_";
    private static final String SP_LANG_PKG_VERSION = "SP_AC_LANG_PKG_VERSION_";
    private static final String TAG = LanguagePackageUtil.logTag("LanguagePackageManager");
    private static final String URL_NEW_VERSION_CHECK = "https://activityservice.alibaba.com/openapi/v1/version?name=%s";
    /* access modifiers changed from: private */
    public LanguagePackageConfig mConfig = LanguagePackageConfig.buildDefaultConfig();
    private LruCache<String, Map<String, String>> mMemoryCaches = new LruCache<>(this.mConfig.getMaxMemoryCacheSize());
    private SharedPreferences mSharedPreferences;

    public synchronized void initConfig(LanguagePackageConfig languagePackageConfig) {
        this.mConfig = LanguagePackageConfig.adapter(languagePackageConfig);
        this.mMemoryCaches = LanguagePackageUtil.resizeCache(this.mMemoryCaches, languagePackageConfig.getMaxMemoryCacheSize());
    }

    public synchronized void updateLanguagePackage(@NonNull Context context, @NonNull String str, boolean z) {
        updateLanguagePackage(context, str, z, (OnUpdateCallback) null);
    }

    public synchronized void updateLanguagePackage(@NonNull Context context, @NonNull String str, boolean z, @Nullable OnUpdateCallback onUpdateCallback) {
        Context context2;
        if (context != null) {
            try {
                context2 = context.getApplicationContext();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            context2 = null;
        }
        if (context2 != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(context2, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-889242526, oncanceled);
                onCancelLoad.getMin(-889242526, oncanceled);
            }
        }
        checkUpdateAsync(context, str, true, z, onUpdateCallback);
    }

    private void checkUpdateAsync(@NonNull Context context, @NonNull String str, boolean z, boolean z2, @Nullable OnUpdateCallback onUpdateCallback) {
        final Context context2 = context;
        final String str2 = str;
        final boolean z3 = z;
        final boolean z4 = z2;
        final OnUpdateCallback onUpdateCallback2 = onUpdateCallback;
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                LanguagePackageManager.this.checkUpdate(context2, str2, z3, z4, onUpdateCallback2);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void checkUpdate(@NonNull Context context, @NonNull String str, boolean z, boolean z2, @Nullable OnUpdateCallback onUpdateCallback) {
        JSONObject updateLangPkgContentInternal;
        ensureStorageNotNull(context);
        String fetch = fetch(SP_LANG_PKG_UPDATE_TIME.concat(String.valueOf(str)));
        if (!z || LanguagePackageUtil.needsCheckUpdate(fetch, this.mConfig.getUpdateIntervalInHour())) {
            LanguageUpdateModel updateLangPkgVersionInternal = updateLangPkgVersionInternal(context, str, onUpdateCallback);
            if (updateLangPkgVersionInternal != null && (updateLangPkgContentInternal = updateLangPkgContentInternal(str, updateLangPkgVersionInternal.url, onUpdateCallback)) != null) {
                updateCache(context, str, z2, updateLangPkgVersionInternal.version, updateLangPkgContentInternal);
                if (onUpdateCallback != null) {
                    onUpdateCallback.onUpdateFinish();
                    return;
                }
                return;
            }
            return;
        }
        MultiLanguageLogger.newLogger(MultiLanguageLogger.BL_AC_LANG_CHECK_UPDATE, str).addParams("type", str).addParams("errorMessage", "checkUpdate(), don`t needs to check upgrade this time").event();
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append(LanguagePackageUtil.logPrefix(str));
        sb.append("checkUpdate(), don`t needs to check upgrade this time");
        ACLog.d(str2, sb.toString());
        if (onUpdateCallback != null) {
            onUpdateCallback.onUpdateFinish();
        }
    }

    private LanguageUpdateModel updateLangPkgVersionInternal(@NonNull Context context, @NonNull String str, @Nullable OnUpdateCallback onUpdateCallback) {
        String format = String.format(URL_NEW_VERSION_CHECK, new Object[]{str});
        try {
            LanguageUpdateModel convertToModel = LanguageUpdateModel.convertToModel(LanguagePackageUtil.requestFromServer(format));
            String fetch = fetch(SP_LANG_PKG_VERSION.concat(String.valueOf(str)));
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append(LanguagePackageUtil.logPrefix(str));
            sb.append("checkUpdate(), local version: ");
            sb.append(fetch);
            sb.append(", server version: ");
            sb.append(convertToModel.version);
            ACLog.d(str2, sb.toString());
            if (!TextUtils.equals(fetch, convertToModel.version) || !this.mConfig.getStorageImpl().isFileExist(context, str)) {
                return convertToModel;
            }
            save(SP_LANG_PKG_UPDATE_TIME.concat(String.valueOf(str)), String.valueOf(System.currentTimeMillis()));
            String concat = "checkUpdate(), localVersion and serverVersion are the same : ".concat(String.valueOf(fetch));
            MultiLanguageLogger.newLogger(MultiLanguageLogger.BL_AC_LANG_CHECK_UPDATE, str).addParams("type", str).addParams("errorMessage", concat).event();
            String str3 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(LanguagePackageUtil.logPrefix(str));
            sb2.append(concat);
            ACLog.d(str3, sb2.toString());
            if (onUpdateCallback != null) {
                onUpdateCallback.onUpdateFinish();
            }
            return null;
        } catch (JSONException e) {
            save(SP_LANG_PKG_UPDATE_TIME.concat(String.valueOf(str)), String.valueOf(System.currentTimeMillis()));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(LanguagePackageUtil.logPrefix(str));
            sb3.append("fetch language-package info failed,may the langPkgId: ");
            sb3.append(str);
            sb3.append(" may not configured in MEDUSA. message: ");
            sb3.append(e);
            String obj = sb3.toString();
            MultiLanguageLogger.newLogger(MultiLanguageLogger.BL_AC_LANG_CHECK_UPDATE, str).addParams("url", format).addParams("type", str).addParams("errorMessage", obj).event();
            ACLog.d(TAG, obj);
            if (onUpdateCallback != null) {
                onUpdateCallback.onUpdateOnError("1001", obj);
            }
            return null;
        } catch (Exception e2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(LanguagePackageUtil.logPrefix(str));
            sb4.append("checkUpdate(), request language-package version failed, message: ");
            sb4.append(e2);
            String obj2 = sb4.toString();
            MultiLanguageLogger.logException(MultiLanguageLogger.EVENT_LANGUAGE_INFO_UPDATE_FAILED, str).addParams("url", format).addParams("type", str).addParams("errorMessage", obj2).event();
            ACLog.e(TAG, obj2);
            if (onUpdateCallback != null) {
                onUpdateCallback.onUpdateOnError(ResultCode.Fail.UNKNOWN_ERROR, obj2);
            }
            return null;
        }
    }

    private JSONObject updateLangPkgContentInternal(@NonNull String str, @NonNull String str2, @Nullable OnUpdateCallback onUpdateCallback) {
        String formatLanguagePackageUrl = LanguagePackageUtil.formatLanguagePackageUrl(str2);
        try {
            JSONObject requestFromServer = LanguagePackageUtil.requestFromServer(formatLanguagePackageUrl);
            String str3 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append(LanguagePackageUtil.logPrefix(str));
            sb.append("checkUpdate(), new version of language-package fetched: ");
            sb.append(requestFromServer);
            ACLog.d(str3, sb.toString());
            return requestFromServer;
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(LanguagePackageUtil.logPrefix(str));
            sb2.append("checkUpdate(), update language-package content failed, message: ");
            sb2.append(e);
            String obj = sb2.toString();
            MultiLanguageLogger.logException(MultiLanguageLogger.EVENT_LANGUAGE_CONTENT_UPDATE_FAILED, str).addParams("url", formatLanguagePackageUrl).addParams("type", str).addParams("errorMessage", obj).event();
            ACLog.e(TAG, obj);
            if (onUpdateCallback == null) {
                return null;
            }
            onUpdateCallback.onUpdateOnError(ResultCode.Fail.UNKNOWN_ERROR, obj);
            return null;
        }
    }

    private void updateCache(@NonNull Context context, @NonNull String str, boolean z, @NonNull String str2, @NonNull JSONObject jSONObject) {
        Context context2 = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        int i = 0;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-1724426508, oncanceled);
                onCancelLoad.getMin(-1724426508, oncanceled);
            }
        }
        if (context != null) {
            context2 = context.getApplicationContext();
        }
        if (context2 != null) {
            if (str != null) {
                i = str.length();
            }
            int min2 = dispatchOnCancelled.getMin(context2, i);
            if (i != min2) {
                onCanceled oncanceled2 = new onCanceled(i, min2, 32);
                onCancelLoad.setMax(-1724426508, oncanceled2);
                onCancelLoad.getMin(-1724426508, oncanceled2);
            }
        }
        save(SP_LANG_PKG_VERSION.concat(String.valueOf(str)), str2);
        save(SP_LANG_PKG_UPDATE_TIME.concat(String.valueOf(str)), String.valueOf(System.currentTimeMillis()));
        this.mConfig.getStorageImpl().saveToStorage(context, str, jSONObject.toString());
        if (z) {
            boolean saveToMemory = saveToMemory(context, str, this.mConfig.getLanguage(), true);
            String str3 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append(LanguagePackageUtil.logPrefix(str));
            sb.append("updateCache(), save to memory ");
            sb.append(saveToMemory ? "success" : "fail");
            ACLog.d(str3, sb.toString());
        }
    }

    public void fetchLanguagePackage(@NonNull Context context, @NonNull final String str, @Nullable final OnFetchCallback onFetchCallback) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-2010676932, oncanceled);
                onCancelLoad.getMin(-2010676932, oncanceled);
            }
        }
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append(LanguagePackageUtil.logPrefix(str));
        sb.append("fetchLanguagePackage(), start fetch translated content from memory");
        ACLog.d(str2, sb.toString());
        saveToMemory(context, str, this.mConfig.getLanguage(), false);
        Map<String, String> fetchFromMemory = fetchFromMemory(str);
        if (LanguagePackageUtil.isEmpty(fetchFromMemory)) {
            checkUpdateAsync(context, str, false, true, new OnUpdateCallback() {
                public void onUpdateOnError(@NonNull String str, @NonNull String str2) {
                    LanguagePackageManager.this.onFetchFromMemoryFailed(str, onFetchCallback);
                }

                public void onUpdateFinish() {
                    Map access$000 = LanguagePackageManager.this.fetchFromMemory(str);
                    if (!LanguagePackageUtil.isEmpty(access$000)) {
                        OnFetchCallback onFetchCallback = onFetchCallback;
                        if (onFetchCallback != null) {
                            onFetchCallback.onFetchSuccess(LanguagePackageManager.this.mConfig.getLanguage(), access$000);
                            return;
                        }
                        return;
                    }
                    LanguagePackageManager.this.onFetchFromMemoryFailed(str, onFetchCallback);
                }
            });
        } else if (onFetchCallback != null) {
            onFetchCallback.onFetchSuccess(this.mConfig.getLanguage(), fetchFromMemory);
        }
    }

    /* access modifiers changed from: private */
    public Map<String, String> fetchFromMemory(@NonNull String str) {
        Map<String, String> map = this.mMemoryCaches.get(str);
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append(LanguagePackageUtil.logPrefix(str));
        sb.append("fetchFromMemory(), langMap: ");
        sb.append(map);
        ACLog.d(str2, sb.toString());
        return map;
    }

    /* access modifiers changed from: protected */
    public void onFetchFromMemoryFailed(@NonNull String str, @Nullable OnFetchCallback onFetchCallback) {
        StringBuilder sb = new StringBuilder("onFetchFromMemoryFailed(), langPkgId \"");
        sb.append(str);
        sb.append("\" fetch locally fail for no cache matched");
        String obj = sb.toString();
        MultiLanguageLogger.newLogger(MultiLanguageLogger.BL_AC_LANG_FETCH_FROM_LOCAL, str).addParams("errorMessage", obj).event();
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LanguagePackageUtil.logPrefix(str));
        sb2.append(obj);
        ACLog.d(str2, sb2.toString());
        if (onFetchCallback != null) {
            onFetchCallback.onFetchOnError("1002", obj);
        }
    }

    private boolean saveToMemory(@NonNull Context context, @NonNull String str, @NonNull String str2, boolean z) {
        if (z) {
            this.mMemoryCaches.remove(str);
        }
        String str3 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append(LanguagePackageUtil.logPrefix(str));
        sb.append("saveToMemory(), start load local cache to memory");
        ACLog.d(str3, sb.toString());
        try {
            if (!LanguagePackageUtil.isEmpty(this.mMemoryCaches.get(str))) {
                return true;
            }
            String fromStorage = this.mConfig.getStorageImpl().getFromStorage(context, str);
            if (TextUtils.isEmpty(fromStorage)) {
                String str4 = TAG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LanguagePackageUtil.logPrefix(str));
                sb2.append("saveToMemory(), the cache save to memory failed, for local language package specific with the langPkgId is empty");
                ACLog.w(str4, sb2.toString());
                return false;
            }
            this.mMemoryCaches.put(str, LanguagePackageUtil.convertToMap(fromStorage, str2));
            String str5 = TAG;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(LanguagePackageUtil.logPrefix(str));
            sb3.append("saveToMemory(), save to memory success, current cache: ");
            sb3.append(LanguagePackageUtil.mapToJsonString(this.mMemoryCaches.snapshot()));
            ACLog.d(str5, sb3.toString());
            return true;
        } catch (Exception e) {
            MultiLanguageLogger.logException(MultiLanguageLogger.EVENT_LANGUAGE_SAVE_TO_MEMORY_FAILED, str).addParams("type", str).addParams("errorMessage", e.toString()).event();
            String str6 = TAG;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(LanguagePackageUtil.logPrefix(str));
            sb4.append("saveToMemory(), save to memory failed, message :");
            sb4.append(e);
            ACLog.e(str6, sb4.toString());
            return false;
        }
    }

    private synchronized void ensureStorageNotNull(Context context) {
        if (this.mSharedPreferences == null) {
            this.mSharedPreferences = context.getSharedPreferences(SP_BIZ_LANG_PKG_STORAGE, 0);
        }
    }

    private void save(String str, String str2) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    private String fetch(String str) {
        return this.mSharedPreferences.getString(str, (String) null);
    }
}
