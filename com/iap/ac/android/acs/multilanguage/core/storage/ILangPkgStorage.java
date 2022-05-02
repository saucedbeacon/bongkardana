package com.iap.ac.android.acs.multilanguage.core.storage;

import android.content.Context;
import androidx.annotation.NonNull;

public interface ILangPkgStorage {
    String getFromStorage(@NonNull Context context, @NonNull String str);

    boolean isFileExist(@NonNull Context context, @NonNull String str);

    boolean removeFromStorage(@NonNull Context context, @NonNull String str);

    boolean saveToStorage(@NonNull Context context, @NonNull String str, @NonNull String str2);
}
