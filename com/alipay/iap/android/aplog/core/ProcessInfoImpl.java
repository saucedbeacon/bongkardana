package com.alipay.iap.android.aplog.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alipay.iap.android.aplog.api.ProcessInfo;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.lang.reflect.Method;
import java.util.Iterator;

public class ProcessInfoImpl implements ProcessInfo {
    private static final String TAG = "ProcessInfoImpl";
    private Context mContext;
    private boolean mIsMainProcess = false;
    private boolean mIsToolsProcess = false;
    private String mMainProcessName = "";
    private String mPackageName = "";
    private String mProcessAlias = "";
    private String mProcessName = "";
    private String mProcessTag = "";
    private String mToolsProcessName = "";

    public ProcessInfoImpl(Context context) {
        this.mContext = context;
        this.mPackageName = context.getPackageName();
        this.mProcessName = getCurrentProcessName();
        this.mMainProcessName = this.mPackageName;
        StringBuilder sb = new StringBuilder();
        sb.append(this.mPackageName);
        sb.append(":tools");
        this.mToolsProcessName = sb.toString();
        this.mIsMainProcess = this.mMainProcessName.equals(this.mProcessName);
        boolean equals = this.mToolsProcessName.equals(this.mProcessName);
        this.mIsToolsProcess = equals;
        if (this.mIsMainProcess) {
            this.mProcessAlias = "main";
        } else if (equals) {
            this.mProcessAlias = ProcessInfo.ALIAS_TOOLS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mPackageName);
        sb2.append("-");
        sb2.append(this.mProcessAlias);
        this.mProcessTag = sb2.toString();
    }

    public boolean isMainProcess() {
        return this.mIsMainProcess;
    }

    public boolean isToolsProcess() {
        return this.mIsToolsProcess;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    private String getCurrentProcessName() {
        String str;
        try {
            Class<?> loadClass = getClass().getClassLoader().loadClass(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = loadClass.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            Method declaredMethod2 = loadClass.getDeclaredMethod(ProcessUtils.GET_PROCESS_NAME, new Class[0]);
            declaredMethod2.setAccessible(true);
            str = (String) declaredMethod2.invoke(invoke, new Object[0]);
        } catch (Throwable unused) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Method declaredMethod3 = getClass().getClassLoader().loadClass("android.ddm.DdmHandleAppName").getDeclaredMethod("getAppName", new Class[0]);
            declaredMethod3.setAccessible(true);
            str = (String) declaredMethod3.invoke((Object) null, new Object[0]);
        } catch (Throwable unused2) {
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return getProcessNameByID(getProcessID());
    }

    public String getProcessNameByID(int i) {
        String str;
        try {
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) this.mContext.getSystemService(AkuEventParamsKey.KEY_ACTIVITY)).getRunningAppProcesses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == i) {
                    str = next.processName;
                    break;
                }
            }
        } catch (Throwable unused) {
        }
        str = null;
        return str == null ? "" : str;
    }

    public int getProcessID() {
        return Process.myPid();
    }

    public String getProcessTag() {
        return this.mProcessTag;
    }

    public String getProcessAlias() {
        return this.mProcessAlias;
    }

    public String getMainProcessName() {
        return this.mProcessName;
    }

    public String getToolsProcessName() {
        return this.mToolsProcessName;
    }
}
