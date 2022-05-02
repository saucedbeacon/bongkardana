package com.alibaba.ariver.resource.prepare.controller;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.log.AppLog;
import com.alibaba.ariver.kernel.common.log.AppLogger;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.RVTraceKey;
import com.alibaba.ariver.kernel.common.utils.RVTraceUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.prepare.PrepareCallback;
import com.alibaba.ariver.resource.api.prepare.PrepareContext;
import com.alibaba.ariver.resource.api.prepare.PrepareController;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.ariver.resource.api.prepare.PrepareStep;
import com.alibaba.ariver.resource.api.prepare.StepCreator;
import com.alibaba.ariver.resource.api.prepare.StepInterceptor;
import com.alibaba.ariver.resource.api.prepare.StepType;
import com.alibaba.ariver.resource.prepare.controller.Timer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
public abstract class BasePrepareController implements PrepareController, Timer.TimeoutListener {
    private static final String TAG = "AriverRes:PrepareController";
    private AtomicBoolean appInfoSetted;
    protected PrepareCallback callback;
    protected PrepareContext context;
    protected PrepareStep currentExecutingStep;
    protected boolean errorIntercepted;
    private Set<PrepareStep> interceptedBeforeSteps;
    protected List<StepInterceptor> interceptors;
    private boolean locked;
    private Object lockedKey;
    private PrepareStep pendingAfterStep;
    private PrepareController.Status status;
    protected Queue<PrepareStep> steps;
    Timer timer;

    public BasePrepareController() {
        this.interceptedBeforeSteps = new HashSet();
        this.status = PrepareController.Status.INIT;
        this.locked = false;
        this.appInfoSetted = new AtomicBoolean(false);
        this.lockedKey = null;
        this.interceptors = Collections.EMPTY_LIST;
        this.context = null;
        this.callback = null;
        this.errorIntercepted = false;
        this.timer = null;
        this.steps = new ArrayBlockingQueue(4);
        StepCreator generateStepCreator = generateStepCreator();
        this.steps.add(generateStepCreator.createStep(StepType.SETUP));
        this.steps.add(generateStepCreator.createStep(StepType.UPDATE));
        this.steps.add(generateStepCreator.createStep(StepType.OFFLINE));
        this.steps.add(generateStepCreator.createStep(StepType.START));
    }

    /* access modifiers changed from: protected */
    public StepCreator generateStepCreator() {
        return new DefaultStepCreator();
    }

    @VisibleForTesting
    BasePrepareController(PrepareStep... prepareStepArr) {
        this.interceptedBeforeSteps = new HashSet();
        this.status = PrepareController.Status.INIT;
        this.locked = false;
        this.appInfoSetted = new AtomicBoolean(false);
        this.lockedKey = null;
        this.interceptors = Collections.EMPTY_LIST;
        this.context = null;
        this.callback = null;
        this.errorIntercepted = false;
        this.timer = null;
        this.steps = new LinkedList(Arrays.asList(prepareStepArr));
    }

    /* access modifiers changed from: protected */
    public void bindContext(PrepareContext prepareContext, PrepareCallback prepareCallback) {
        this.context = prepareContext;
        this.callback = prepareCallback;
    }

    public void onGetAppInfo(@NonNull AppModel appModel) {
        RVLogger.d(TAG, "onGetAppInfo");
        for (StepInterceptor onGetAppInfo : this.interceptors) {
            onGetAppInfo.onGetAppInfo(appModel);
        }
        if (!this.appInfoSetted.getAndSet(true)) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("appInfo", appModel);
            IpcServerUtils.sendMsgToClient(this.context.getAppId(), this.context.getStartToken(), 15, bundle);
        }
    }

    public PrepareController.Status getStatus() {
        return this.status;
    }

    public void setInterceptors(@NonNull List<StepInterceptor> list) {
        if (this.status == PrepareController.Status.INIT) {
            ArrayList<StepInterceptor> arrayList = new ArrayList<>(list);
            this.interceptors = arrayList;
            for (StepInterceptor init : arrayList) {
                init.init(this.context, this.callback);
            }
            return;
        }
        throw new IllegalStateException("You cannot set interceptor after execute");
    }

    public synchronized void postTimeOut(long j) {
        if (this.timer == null) {
            this.timer = createTimer(this);
        }
        RVLogger.d(TAG, "postTimeout ".concat(String.valueOf(j)));
        this.timer.postTimeout(j);
    }

    /* access modifiers changed from: protected */
    public Timer createTimer(Timer.TimeoutListener timeoutListener) {
        return new Timer(timeoutListener);
    }

    public void onTimeout(long j) {
        RVLogger.e(TAG, "onTimeout! elapsed time: ".concat(String.valueOf(j)));
        if (this.status == PrepareController.Status.FINISH) {
            return;
        }
        if (this.currentExecutingStep != null) {
            StringBuilder sb = new StringBuilder("Procedure timeout on ");
            sb.append(this.currentExecutingStep.getType());
            moveToError(new PrepareException("3", sb.toString()));
            return;
        }
        moveToError(new PrepareException("3", "Procedure timeout"));
    }

    public void lock(Object obj) {
        RVLogger.d(TAG, "locked with key: ".concat(String.valueOf(obj)));
        this.lockedKey = obj;
        this.locked = true;
    }

    public void unlock(Object obj) {
        if (this.locked) {
            StringBuilder sb = new StringBuilder("unlocked with key: ");
            sb.append(obj);
            sb.append(", lockedKey: ");
            sb.append(this.lockedKey);
            RVLogger.d(TAG, sb.toString());
            if (obj == this.lockedKey) {
                this.locked = false;
                this.lockedKey = null;
            }
        }
    }

    @CallSuper
    public void moveToError(PrepareException prepareException) {
        if (!this.status.canContinue()) {
            this.errorIntercepted = true;
            onPrepareFail(this.context, prepareException);
            return;
        }
        RVLogger.e(TAG, "moveToError!", prepareException);
        unlock(this.lockedKey);
        this.errorIntercepted = false;
        if (interceptOnError(prepareException)) {
            this.errorIntercepted = true;
            onPrepareFail(this.context, prepareException);
            return;
        }
        this.locked = false;
        this.status = PrepareController.Status.ERROR;
        this.steps.clear();
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.invalidTimeout();
        }
    }

    public void moveToNext() {
        if (this.locked) {
            StringBuilder sb = new StringBuilder("controller locked by ");
            sb.append(this.currentExecutingStep);
            sb.append(" cannot moveToNext!");
            RVLogger.e(TAG, sb.toString());
        } else if (!this.status.canContinue()) {
            StringBuilder sb2 = new StringBuilder("controller cannot moveToNext with status: ");
            sb2.append(this.status);
            RVLogger.e(TAG, sb2.toString());
        } else {
            this.status = PrepareController.Status.EXECUTING;
            PrepareStep prepareStep = this.pendingAfterStep;
            if (prepareStep != null) {
                boolean interceptAfter = interceptAfter(prepareStep);
                this.pendingAfterStep = null;
                if (interceptAfter) {
                    return;
                }
            }
            PrepareStep peek = this.steps.peek();
            if (peek != null) {
                this.currentExecutingStep = peek;
                if (this.interceptedBeforeSteps.contains(peek) || !interceptBefore(peek)) {
                    try {
                        this.steps.poll();
                        StringBuilder sb3 = new StringBuilder("step ");
                        sb3.append(peek.getType());
                        sb3.append(" execute");
                        RVLogger.d(TAG, sb3.toString());
                        this.pendingAfterStep = peek;
                        peek.execute(this, this.context, this.callback);
                        if (!this.locked && !peek.isFinished()) {
                            if (!this.status.canContinue()) {
                                StringBuilder sb4 = new StringBuilder("step ");
                                sb4.append(peek.getType());
                                sb4.append(" can't continue after execute. status: ");
                                sb4.append(this.status);
                                RVLogger.w(TAG, sb4.toString());
                                return;
                            }
                            this.pendingAfterStep = null;
                            if (!interceptAfter(peek)) {
                                moveToNext();
                            }
                        }
                    } catch (PrepareException e) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(peek.getType());
                        sb5.append(" execute error!");
                        RVLogger.e(TAG, sb5.toString(), e);
                        moveToError(e);
                    }
                }
            } else {
                finish();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private boolean interceptBefore(PrepareStep prepareStep) {
        try {
            StringBuilder sb = new StringBuilder("step ");
            sb.append(prepareStep.getType());
            sb.append(" interceptBefore");
            RVLogger.d(TAG, sb.toString());
            StringBuilder sb2 = new StringBuilder(RVTraceKey.RV_Prepare_Before_);
            sb2.append(prepareStep.getType());
            RVTraceUtils.traceBeginSection(sb2.toString());
            this.interceptedBeforeSteps.add(prepareStep);
            for (StepInterceptor next : this.interceptors) {
                if (next.before(prepareStep, this)) {
                    StringBuilder sb3 = new StringBuilder("step ");
                    sb3.append(prepareStep.getType());
                    sb3.append(" intercepted before by ");
                    sb3.append(next.getClass().getName());
                    RVLogger.d(TAG, sb3.toString());
                    StringBuilder sb4 = new StringBuilder(RVTraceKey.RV_Prepare_Before_);
                    sb4.append(prepareStep.getType());
                    RVTraceUtils.traceEndSection(sb4.toString());
                    return true;
                }
            }
            StringBuilder sb5 = new StringBuilder(RVTraceKey.RV_Prepare_Before_);
            sb5.append(prepareStep.getType());
            RVTraceUtils.traceEndSection(sb5.toString());
            return false;
        } catch (Throwable th) {
            StringBuilder sb6 = new StringBuilder(RVTraceKey.RV_Prepare_Before_);
            sb6.append(prepareStep.getType());
            RVTraceUtils.traceEndSection(sb6.toString());
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private boolean interceptAfter(PrepareStep prepareStep) {
        try {
            StringBuilder sb = new StringBuilder(RVTraceKey.RV_Prepare_After_);
            sb.append(prepareStep.getType());
            RVTraceUtils.traceBeginSection(sb.toString());
            StringBuilder sb2 = new StringBuilder("step ");
            sb2.append(prepareStep.getType());
            sb2.append(" interceptAfter");
            RVLogger.d(TAG, sb2.toString());
            for (StepInterceptor next : this.interceptors) {
                if (next.after(prepareStep, this)) {
                    StringBuilder sb3 = new StringBuilder("step ");
                    sb3.append(prepareStep.getType());
                    sb3.append(" intercepted after by ");
                    sb3.append(next.getClass().getName());
                    RVLogger.d(TAG, sb3.toString());
                    prepareStep.finish();
                    StringBuilder sb4 = new StringBuilder(RVTraceKey.RV_Prepare_After_);
                    sb4.append(prepareStep.getType());
                    RVTraceUtils.traceEndSection(sb4.toString());
                    return true;
                }
            }
            prepareStep.finish();
            StringBuilder sb5 = new StringBuilder(RVTraceKey.RV_Prepare_After_);
            sb5.append(prepareStep.getType());
            RVTraceUtils.traceEndSection(sb5.toString());
            return false;
        } catch (Throwable th) {
            prepareStep.finish();
            StringBuilder sb6 = new StringBuilder(RVTraceKey.RV_Prepare_After_);
            sb6.append(prepareStep.getType());
            RVTraceUtils.traceEndSection(sb6.toString());
            throw th;
        }
    }

    private boolean interceptOnError(PrepareException prepareException) {
        for (StepInterceptor onError : this.interceptors) {
            if (onError.onError(prepareException, this)) {
                return true;
            }
        }
        return false;
    }

    public void start() {
        moveToNext();
    }

    @CallSuper
    public void finish() {
        RVLogger.d(TAG, "finish");
        this.status = PrepareController.Status.FINISH;
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.invalidTimeout();
        }
        this.steps.clear();
    }

    private void onPrepareFail(PrepareContext prepareContext, PrepareException prepareException) {
        String str;
        if (prepareContext != null) {
            prepareContext.getPrepareData().setEndTime(SystemClock.elapsedRealtime());
            if (prepareException == null) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(prepareException.getCode());
                sb.append("_");
                sb.append(prepareException.getMessage());
                str = sb.toString();
            }
            AppLogger.log(((AppLog.Builder) ((AppLog.Builder) new AppLog.Builder().setState(AppLog.APP_LOG_PREPARE_FAIL)).setAppId(prepareContext.getAppId()).setParentId(BundleUtils.getString(prepareContext.getStartParams(), RVParams.START_APP_SESSION_ID))).setDesc(str).build());
        }
    }
}
