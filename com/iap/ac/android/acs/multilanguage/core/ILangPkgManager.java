package com.iap.ac.android.acs.multilanguage.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.multilanguage.callback.OnFetchCallback;
import com.iap.ac.android.acs.multilanguage.callback.OnUpdateCallback;
import com.iap.ac.android.acs.multilanguage.core.config.LanguagePackageConfig;

public interface ILangPkgManager {
    void fetchLanguagePackage(@NonNull Context context, @NonNull String str, @Nullable OnFetchCallback onFetchCallback);

    void initConfig(LanguagePackageConfig languagePackageConfig);

    void updateLanguagePackage(@NonNull Context context, @NonNull String str, boolean z, @Nullable OnUpdateCallback onUpdateCallback);
}
