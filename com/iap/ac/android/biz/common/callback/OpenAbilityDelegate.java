package com.iap.ac.android.biz.common.callback;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.model.ScanCallback;
import com.iap.ac.android.biz.common.model.ScannerOption;
import java.util.Map;

public interface OpenAbilityDelegate {
    void openBizScene(@NonNull String str, @NonNull Map<String, String> map, @NonNull OpenBizSceneCallback openBizSceneCallback);

    boolean openScheme(@NonNull Uri uri);

    void scan(ScannerOption scannerOption, ScanCallback scanCallback);
}
