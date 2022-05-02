package com.alipay.mobile.security.bio.service.impl;

import android.content.Context;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioTaskService;
import com.alipay.mobile.security.bio.task.ActionFrame;
import com.alipay.mobile.security.bio.task.SubTask;
import java.util.Vector;

public class BioTaskServiceImpl extends BioTaskService {
    private Context mContext;
    private SubTask mCurSubTask = null;
    private int mSubTaskIndex;
    private Vector<SubTask> mSubTasks = new Vector<>();
    private BioTaskService.TaskListener mTaskListener;

    public BioTaskServiceImpl(Context context) {
        if (context != null) {
            this.mContext = context;
            return;
        }
        throw new BioIllegalArgumentException();
    }

    public void onCreate(BioServiceManager bioServiceManager) {
        this.mSubTasks.clear();
    }

    public void onDestroy() {
        if (this.mTaskListener != null) {
            this.mTaskListener = null;
        }
        Vector<SubTask> vector = this.mSubTasks;
        if (vector != null) {
            vector.clear();
            this.mCurSubTask = null;
        }
    }

    public void addTask(SubTask subTask) {
        Vector<SubTask> vector;
        if (subTask != null && (vector = this.mSubTasks) != null) {
            vector.add(subTask);
        }
    }

    public int getLeftTaskCount() {
        return this.mSubTasks.size() - this.mSubTaskIndex;
    }

    public int getSubTaskCount() {
        return this.mSubTasks.size();
    }

    public Vector<SubTask> getTasks() {
        return this.mSubTasks;
    }

    public void setTaskListener(BioTaskService.TaskListener taskListener) {
        this.mTaskListener = taskListener;
    }

    public void initAndBegin() {
        BioTaskService.TaskListener taskListener = this.mTaskListener;
        if (taskListener != null) {
            taskListener.onTasksBegin();
        }
        if (this.mSubTasks.size() > 0) {
            SubTask subTask = this.mSubTasks.get(0);
            this.mCurSubTask = subTask;
            subTask.init();
        }
        this.mSubTaskIndex = 0;
    }

    public void clearTask() {
        Vector<SubTask> vector = this.mSubTasks;
        if (vector != null) {
            vector.clear();
        }
        this.mSubTaskIndex = 0;
    }

    public SubTask getCurrentTask() {
        return this.mCurSubTask;
    }

    public <T> void action(ActionFrame<T> actionFrame) {
        SubTask subTask;
        SubTask subTask2 = this.mCurSubTask;
        if (subTask2 != null) {
            if (AnonymousClass1.$SwitchMap$com$alipay$mobile$security$bio$task$ActionType[subTask2.action(actionFrame).ordinal()] == 3 && (subTask = this.mCurSubTask) != null) {
                subTask.done();
                int i = this.mSubTaskIndex + 1;
                this.mSubTaskIndex = i;
                if (i < this.mSubTasks.size()) {
                    SubTask subTask3 = this.mSubTasks.get(this.mSubTaskIndex);
                    this.mCurSubTask = subTask3;
                    subTask3.init();
                    return;
                }
                this.mCurSubTask = null;
            }
        }
    }

    /* renamed from: com.alipay.mobile.security.bio.service.impl.BioTaskServiceImpl$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alipay$mobile$security$bio$task$ActionType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.alipay.mobile.security.bio.task.ActionType[] r0 = com.alipay.mobile.security.bio.task.ActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alipay$mobile$security$bio$task$ActionType = r0
                com.alipay.mobile.security.bio.task.ActionType r1 = com.alipay.mobile.security.bio.task.ActionType.INIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alipay$mobile$security$bio$task$ActionType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alipay.mobile.security.bio.task.ActionType r1 = com.alipay.mobile.security.bio.task.ActionType.RUN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alipay$mobile$security$bio$task$ActionType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alipay.mobile.security.bio.task.ActionType r1 = com.alipay.mobile.security.bio.task.ActionType.DONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.service.impl.BioTaskServiceImpl.AnonymousClass1.<clinit>():void");
        }
    }

    public void reset() {
        this.mSubTaskIndex = 0;
        Vector<SubTask> vector = this.mSubTasks;
        if (vector != null) {
            vector.clear();
        }
    }
}
