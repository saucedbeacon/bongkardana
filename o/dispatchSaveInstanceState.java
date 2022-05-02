package o;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public abstract class dispatchSaveInstanceState<D> extends dispatchRestoreInstanceState<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile dispatchSaveInstanceState<D>.setMax mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile dispatchSaveInstanceState<D>.setMax mTask;
    long mUpdateThrottle;

    public void cancelLoadInBackground() {
    }

    @Nullable
    public abstract D loadInBackground();

    public void onCanceled(@Nullable D d) {
    }

    final class setMax extends ModernAsyncTask<Void, Void, D> implements Runnable {
        private final CountDownLatch isInside = new CountDownLatch(1);
        boolean setMin;

        setMax() {
        }

        /* access modifiers changed from: private */
        /* renamed from: getMax */
        public D length() {
            try {
                return dispatchSaveInstanceState.this.onLoadInBackground();
            } catch (OperationCanceledException e) {
                if (setMin()) {
                    return null;
                }
                throw e;
            }
        }

        public final void setMin(D d) {
            try {
                dispatchSaveInstanceState.this.dispatchOnLoadComplete(this, d);
            } finally {
                this.isInside.countDown();
            }
        }

        public final void getMax(D d) {
            try {
                dispatchSaveInstanceState.this.dispatchOnCancelled(this, d);
            } finally {
                this.isInside.countDown();
            }
        }

        public final void run() {
            this.setMin = false;
            dispatchSaveInstanceState.this.executePendingTask();
        }

        public final void setMax() {
            try {
                this.isInside.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public dispatchSaveInstanceState(@NonNull Context context) {
        this(context, ModernAsyncTask.getMin);
    }

    private dispatchSaveInstanceState(@NonNull Context context, @NonNull Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000;
        this.mExecutor = executor;
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new setMax();
        executePendingTask();
    }

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.setMin) {
                this.mTask.setMin = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        } else if (this.mTask.setMin) {
            this.mTask.setMin = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        } else {
            boolean max = this.mTask.setMax(false);
            if (max) {
                this.mCancellingTask = this.mTask;
                cancelLoadInBackground();
            }
            this.mTask = null;
            return max;
        }
    }

    /* access modifiers changed from: package-private */
    public void executePendingTask() {
        if (this.mCancellingTask == null && this.mTask != null) {
            if (this.mTask.setMin) {
                this.mTask.setMin = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
                this.mTask.getMin(this.mExecutor, (Params[]) null);
                return;
            }
            this.mTask.setMin = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnCancelled(dispatchSaveInstanceState<D>.setMax setmax, D d) {
        onCanceled(d);
        if (this.mCancellingTask == setmax) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnLoadComplete(dispatchSaveInstanceState<D>.setMax setmax, D d) {
        if (this.mTask != setmax) {
            dispatchOnCancelled(setmax, d);
        } else if (isAbandoned()) {
            onCanceled(d);
        } else {
            commitContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mTask = null;
            deliverResult(d);
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public D onLoadInBackground() {
        return loadInBackground();
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void waitForLoader() {
        dispatchSaveInstanceState<D>.setMax setmax = this.mTask;
        if (setmax != null) {
            setmax.setMax();
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.setMin);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.setMin);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            setOnDismissListener.setMax(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            setOnDismissListener.getMin(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
