package com.iap.ac.android.common.task;

import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.pipeline.NamedRunnable;
import com.iap.ac.android.common.task.pipeline.StandardPipeline;
import java.util.concurrent.Executor;

public class SerialExecutor extends StandardPipeline {
    static final String TAG = "SerialExecutor";

    public SerialExecutor(Executor executor) {
        super(executor);
    }

    public void execute(NamedRunnable namedRunnable) {
        ACLog.v(TAG, "SerialExecutor.execute()");
        addTask(namedRunnable);
        start();
    }

    public void shutdown() {
        stop();
        this.mTasks.clear();
        this.mTasks = null;
    }
}
