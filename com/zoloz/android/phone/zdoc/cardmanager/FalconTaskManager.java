package com.zoloz.android.phone.zdoc.cardmanager;

import android.content.Context;
import com.alipay.mobile.security.bio.service.BioServiceManager;

public class FalconTaskManager {
    public static final int CALL_BACK_PARAM_ERROR = 1;
    public static final int CALL_BACK_SUCCESS = 0;
    public static final int CALL_BACK_USER_QUIT = 2;
    private static FalconTaskManager instance;
    private BioServiceManager mBioServiceManager;
    private CardManagerCallBack mCallBack;
    private Context mContext;

    private FalconTaskManager() {
    }

    public static synchronized FalconTaskManager getInstance() {
        FalconTaskManager falconTaskManager;
        synchronized (FalconTaskManager.class) {
            if (instance == null) {
                instance = new FalconTaskManager();
            }
            falconTaskManager = instance;
        }
        return falconTaskManager;
    }

    public BioServiceManager getBioServiceManager() {
        return this.mBioServiceManager;
    }

    public void setBioServiceManager(BioServiceManager bioServiceManager) {
        this.mBioServiceManager = bioServiceManager;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public void registerCallback(CardManagerCallBack cardManagerCallBack) {
        this.mCallBack = cardManagerCallBack;
    }

    public void transResult(ZdocResponse zdocResponse) {
        CardManagerCallBack cardManagerCallBack = this.mCallBack;
        if (cardManagerCallBack != null) {
            cardManagerCallBack.onResult(zdocResponse);
        }
        this.mCallBack = null;
        this.mContext = null;
        this.mBioServiceManager = null;
        instance = null;
    }
}
