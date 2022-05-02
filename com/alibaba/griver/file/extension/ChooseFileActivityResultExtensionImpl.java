package com.alibaba.griver.file.extension;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.point.activity.ActivityResultPoint;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.file.jsapi.ChooseFileBridgeExtension;
import o.restorePresenterStates;

@Keep
public class ChooseFileActivityResultExtensionImpl implements ActivityResultPoint {
    private static final String TAG = "ChooseFileActivityResultExtensionImpl";

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 200) {
            if (i2 == 0) {
                Intent intent2 = new Intent();
                intent2.setAction(ChooseFileBridgeExtension.ACTION_CHOOSE_FILE);
                intent2.putExtra("result", "cancel");
                restorePresenterStates.length(GriverEnv.getApplicationContext()).getMax(intent2);
            } else if (i2 == -1 && intent != null) {
                Uri data = intent.getData();
                GriverLogger.d(TAG, "user choose file uri: ".concat(String.valueOf(data)));
                Intent intent3 = new Intent();
                intent3.setAction(ChooseFileBridgeExtension.ACTION_CHOOSE_FILE);
                intent3.putExtra(ChooseFileBridgeExtension.CHOOSE_FILE_RESULT_DATA_KEY, data);
                restorePresenterStates.length(GriverEnv.getApplicationContext()).getMax(intent3);
            }
        }
    }
}
