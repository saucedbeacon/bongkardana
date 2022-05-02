package com.alibaba.ariver.integration.ipc.server;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import com.alibaba.ariver.resource.api.models.AppModel;

@Keep
public class RVAppRecord {
    private static final String TAG = "AriverInt:RVAppRecord";
    private static long lastStartToken = -1;
    boolean isTaskRoot;
    private Class<? extends Activity> mActivityClz;
    private final String mAppId;
    private AppModel mAppModel;
    private long mLastStartClientTimeStamp;
    private boolean mReceivedRemoteReady;
    private int mRemoteLpid;
    private Bundle mSceneParams;
    private Bundle mStartParams;
    private final long mStartToken;
    ActivityManager.RunningTaskInfo runningTaskInfo;

    RVAppRecord(String str, long j, Bundle bundle, @Nullable Bundle bundle2) {
        this.mLastStartClientTimeStamp = -1;
        this.mAppId = str;
        this.mStartToken = j;
        this.mStartParams = bundle;
        bundle.putString("appId", str);
        bundle2 = bundle2 == null ? new Bundle() : bundle2;
        this.mSceneParams = bundle2;
        bundle2.putLong(RVConstants.EXTRA_START_TOKEN, j);
    }

    public static synchronized RVAppRecord generate(String str, Bundle bundle, @Nullable Bundle bundle2) {
        RVAppRecord rVAppRecord;
        synchronized (RVAppRecord.class) {
            rVAppRecord = new RVAppRecord(str, generateStartToken(), bundle, bundle2);
        }
        return rVAppRecord;
    }

    public static long generateStartToken() {
        long nanoTime = System.nanoTime();
        if (nanoTime == lastStartToken) {
            nanoTime++;
        }
        lastStartToken = nanoTime;
        return nanoTime;
    }

    public RVAppRecord(String str, Bundle bundle, @Nullable Bundle bundle2) {
        this(str, System.currentTimeMillis(), bundle, bundle2);
    }

    @Nullable
    public AppModel getAppModel() {
        return this.mAppModel;
    }

    public void setAppModel(AppModel appModel) {
        this.mAppModel = appModel;
    }

    public boolean isTaskRoot() {
        return this.isTaskRoot;
    }

    public void setTaskRoot(boolean z) {
        this.isTaskRoot = z;
    }

    public ActivityManager.RunningTaskInfo getRunningTaskInfo() {
        return this.runningTaskInfo;
    }

    public void setReceivedRemoteReady(int i) {
        this.mRemoteLpid = i;
        this.mReceivedRemoteReady = true;
    }

    public int getRemoteLpid() {
        return this.mRemoteLpid;
    }

    public long getStartToken() {
        return this.mStartToken;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public Bundle getStartParams() {
        return this.mStartParams;
    }

    public Bundle getSceneParams() {
        return this.mSceneParams;
    }

    public void setStartParams(Bundle bundle) {
        this.mStartParams = bundle;
        if (bundle != null) {
            bundle.setClassLoader(RVAppRecord.class.getClassLoader());
        }
    }

    public void setSceneParams(Bundle bundle) {
        this.mSceneParams = bundle;
        if (bundle != null) {
            bundle.setClassLoader(RVAppRecord.class.getClassLoader());
        }
    }

    public long getLastStartClientTimeStamp() {
        return this.mLastStartClientTimeStamp;
    }

    public void setLastStartClientTimeStamp(long j) {
        this.mLastStartClientTimeStamp = j;
    }

    public void finishClient() {
        StringBuilder sb = new StringBuilder("forceFinish from stack: ");
        sb.append(Log.getStackTraceString(new Throwable("Just Print")));
        RVLogger.d(TAG, sb.toString());
        Bundle bundle = new Bundle();
        bundle.putString(RVConstants.EXTRA_PREPARE_ABORT_REASON, "Finish from manual!");
        IpcServerUtils.sendMsgToClient(getAppId(), getStartToken(), 4, bundle);
    }

    public Class<? extends Activity> getActivityClz() {
        return this.mActivityClz;
    }

    public void setActivityClz(@NonNull Class<? extends Activity> cls) {
        this.mActivityClz = cls;
    }

    public boolean isReceivedRemoteReady() {
        return this.mReceivedRemoteReady;
    }

    public boolean isReady() {
        if (!this.mReceivedRemoteReady && IpcChannelManager.getInstance().getClientChannel(this.mStartToken) == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppRecord{mStartToken=");
        sb.append(this.mStartParams);
        sb.append(", appId='");
        sb.append(this.mAppId);
        sb.append('\'');
        sb.append(", activityClz=");
        sb.append(this.mActivityClz);
        sb.append(", ready=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }
}
