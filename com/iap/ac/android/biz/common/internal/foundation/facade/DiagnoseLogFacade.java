package com.iap.ac.android.biz.common.internal.foundation.facade;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.common.config.ACConfig;
import com.iap.ac.android.common.config.IConfigChangeListener;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.diagnoselog.api.DiagnoseLogService;
import org.json.JSONObject;

public class DiagnoseLogFacade extends BaseFacade {
    public static final boolean DEFAULT_DIAGNOSE_ENABLE = true;
    public static final String DIAGNOSE_DISABLE_VALUE = "no";
    public static final String KEY_ENABLE_DIAGNOSE = "diagnose_enable";
    public static boolean mInitialized = false;

    /* access modifiers changed from: private */
    public void setDiagnoseEnabled(String str) {
        DiagnoseLogService.setEnabled(!"no".equalsIgnoreCase(str));
    }

    public void initComponent(Context context, String str, CommonConfig commonConfig) {
        super.initComponent(context, str, commonConfig);
        synchronized (this) {
            mInitialized = false;
            if (!Utils.checkClassExist("com.iap.ac.android.diagnoselog.api.DiagnoseLogService")) {
                ACLog.e(Constants.TAG, "diagnose log init error, without dependent libraries");
            } else if (context instanceof Application) {
                DiagnoseLogService.init((Application) context);
                setDiagnoseEnabled(ACConfig.getInstance(str).getString(KEY_ENABLE_DIAGNOSE));
                ACConfig.getInstance(str).addCommonConfigChangeListener(KEY_ENABLE_DIAGNOSE, new IConfigChangeListener() {
                    public void onConfigChanged(@NonNull String str, @Nullable Object obj) {
                        if (DiagnoseLogFacade.KEY_ENABLE_DIAGNOSE.equals(str) && (obj instanceof String)) {
                            DiagnoseLogFacade.this.setDiagnoseEnabled((String) obj);
                        }
                    }

                    public void onSectionConfigChanged(@NonNull String str, @Nullable JSONObject jSONObject) {
                    }
                });
                ACLog.i(Constants.TAG, "diagnose log init success");
                mInitialized = true;
            } else {
                ACLog.w(Constants.TAG, "diagnose log init not complete, context is not application");
            }
        }
    }

    public boolean isInitialized() {
        return mInitialized;
    }
}
