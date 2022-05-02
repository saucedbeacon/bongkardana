package com.iap.ac.android.acs.plugin.core;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class IAPConnectPluginContext {
    public JSONObject acParams;
    public boolean isMiniProgram;
    public JSONObject jsParameters;
    private Context mContext;
    private WeakReference<Activity> mWeakReferenceAct;
    public String miniProgramAppID;
    public String miniProgramName;
    public String miniProgramPageURL;
    public String sourceSite;

    public IAPConnectPluginContext(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
        if (context instanceof Activity) {
            this.mWeakReferenceAct = new WeakReference<>((Activity) context);
        }
    }

    public void setActivity(Activity activity) {
        if (activity != null) {
            this.mWeakReferenceAct = new WeakReference<>(activity);
        }
    }

    @Nullable
    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mWeakReferenceAct;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }
}
