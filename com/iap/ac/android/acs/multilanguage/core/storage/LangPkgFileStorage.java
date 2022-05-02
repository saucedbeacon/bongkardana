package com.iap.ac.android.acs.multilanguage.core.storage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.utils.FileUtils;
import com.iap.ac.android.acs.multilanguage.utils.LanguagePackageUtil;
import com.iap.ac.android.common.log.ACLog;
import java.io.File;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class LangPkgFileStorage implements ILangPkgStorage {
    private static final String FILE_SUFFIX = ".json";
    private static final String LANGUAGE_PACKAGE_DIR = "language_package";
    private static final String TAG = LanguagePackageUtil.logTag("LangPkgFileStorage");

    public boolean saveToStorage(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-2077078340, oncanceled);
                onCancelLoad.getMin(-2077078340, oncanceled);
            }
        }
        try {
            FileUtils.writeStringToFile(generateFileDir(context), generateFilename(str), str2);
            return true;
        } catch (Exception e) {
            ACLog.e(TAG, "saveToStorage() failed, error: ".concat(String.valueOf(e)));
            return false;
        }
    }

    public String getFromStorage(@NonNull Context context, @NonNull String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.getMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 32);
                onCancelLoad.setMax(1142504550, oncanceled);
                onCancelLoad.getMin(1142504550, oncanceled);
            }
        }
        try {
            return FileUtils.readStringFromFile(generateFileDir(context), generateFilename(str));
        } catch (Exception e) {
            ACLog.e(TAG, "getFromStorage() failed, error: ".concat(String.valueOf(e)));
            return null;
        }
    }

    public boolean isFileExist(@NonNull Context context, @NonNull String str) {
        try {
            return FileUtils.isFileExists(generateFileDir(context), generateFilename(str));
        } catch (Exception e) {
            ACLog.e(TAG, "isFileExist() failed, error: ".concat(String.valueOf(e)));
            return false;
        }
    }

    public boolean removeFromStorage(@NonNull Context context, @NonNull String str) {
        try {
            return FileUtils.deleteFile(generateFileDir(context), generateFilename(str));
        } catch (Exception e) {
            ACLog.e(TAG, "isFileExist() failed, error: ".concat(String.valueOf(e)));
            return false;
        }
    }

    private static String generateFileDir(@NonNull Context context) {
        return new File(context.getApplicationContext().getFilesDir(), LANGUAGE_PACKAGE_DIR).getAbsolutePath();
    }

    private static String generateFilename(@NonNull String str) {
        if (str.contains(".json")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".json");
        return sb.toString();
    }
}
