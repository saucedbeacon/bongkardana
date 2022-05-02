package com.iap.ac.android.acs.multilanguage;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.multilanguage.callback.OnFetchCallback;
import com.iap.ac.android.acs.multilanguage.callback.OnUpdateCallback;
import com.iap.ac.android.acs.multilanguage.core.ILangPkgManager;
import com.iap.ac.android.acs.multilanguage.core.LanguagePackageManager;
import com.iap.ac.android.acs.multilanguage.core.config.LanguagePackageConfig;
import java.util.HashMap;
import java.util.Map;

public class MultiLanguageKit {
    private static final String DEF_BIZ_TYPE = "DEF_BIZ_TYPE";
    private static final Map<String, MultiLanguageKit> sManagerMap = new HashMap();
    private LanguagePackageConfig mConfig = LanguagePackageConfig.buildDefaultConfig();
    private ILangPkgManager mLangPkgManager;

    public static MultiLanguageKit getInstance(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            str = DEF_BIZ_TYPE;
        }
        if (sManagerMap.get(str) == null) {
            synchronized (MultiLanguageKit.class) {
                if (sManagerMap.get(str) == null) {
                    sManagerMap.put(str, new MultiLanguageKit());
                }
            }
        }
        return sManagerMap.get(str);
    }

    public static MultiLanguageKit getInstance() {
        return getInstance((String) null);
    }

    private MultiLanguageKit() {
    }

    public synchronized void setConfig(LanguagePackageConfig languagePackageConfig) {
        this.mConfig = languagePackageConfig;
        initLangManager();
    }

    public synchronized void updateLanguagePackage(@NonNull Context context, @NonNull String str, boolean z) {
        updateLanguagePackage(context, str, z, (OnUpdateCallback) null);
    }

    public synchronized void updateLanguagePackage(@NonNull Context context, @NonNull String str, boolean z, @Nullable OnUpdateCallback onUpdateCallback) {
        initLangManager();
        this.mLangPkgManager.updateLanguagePackage(context, str, z, onUpdateCallback);
    }

    public synchronized void fetchLanguagePackage(@NonNull Context context, @NonNull String str, @Nullable OnFetchCallback onFetchCallback) {
        initLangManager();
        this.mLangPkgManager.fetchLanguagePackage(context, str, onFetchCallback);
    }

    private void initLangManager() {
        if (this.mLangPkgManager == null) {
            this.mLangPkgManager = new LanguagePackageManager();
        }
        this.mLangPkgManager.initConfig(this.mConfig);
    }
}
