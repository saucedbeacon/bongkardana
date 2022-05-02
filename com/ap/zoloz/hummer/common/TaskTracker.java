package com.ap.zoloz.hummer.common;

public abstract class TaskTracker {
    protected boolean isLive;
    protected HummerContext mHummerContext;
    protected IAlertManagerCallback mIAlertManagerCallback;
    protected ITaskTrackerCallback mITaskTrackerCallback;
    protected TaskConfig mTaskConfig;

    public abstract void forceQuit();

    public abstract void run(HummerContext hummerContext, TaskConfig taskConfig, ITaskTrackerCallback iTaskTrackerCallback);

    public abstract void run(HummerContext hummerContext, TaskConfig taskConfig, UIConfig uIConfig, ITaskTrackerCallback iTaskTrackerCallback);

    public void release() {
        this.isLive = false;
        HummerContext hummerContext = this.mHummerContext;
        if (hummerContext != null) {
            hummerContext.release();
            this.mHummerContext = null;
        }
        this.mITaskTrackerCallback = null;
        this.mIAlertManagerCallback = null;
    }
}
