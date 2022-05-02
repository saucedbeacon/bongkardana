package androidx.work;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import o.GriverProgressBar;
import o.RedDotDrawable;
import o.SecuritySignature;
import o.TitleBarRightButtonView;
import o.getSecureSignatureComp;
import o.hasCornerMarking;
import o.openTranslucentStatusBarSupport;
import o.setAttachListener;
import o.setBackButtonColor;
import o.setCompoundDrawablesRelativeWithIntrinsicBounds;
import o.setMinDuration;
import o.setRefreshAnimation;

public abstract class RxWorker extends ListenableWorker {
    static final Executor getMin = new setCompoundDrawablesRelativeWithIntrinsicBounds();
    @Nullable
    private setMax<ListenableWorker.setMax> setMin;

    @MainThread
    @NonNull
    public abstract TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<ListenableWorker.setMax> setMax();

    public RxWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    public ListenableFuture<ListenableWorker.setMax> startWork() {
        this.setMin = new setMax<>();
        hasCornerMarking min = getSecureSignatureComp.setMin(getBackgroundExecutor());
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<ListenableWorker.setMax> max = setMax();
        setRefreshAnimation.getMax(min, "scheduler is null");
        setMinDuration setbackbuttoncolor = new setBackButtonColor(max, min);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable = SecuritySignature.toString;
        if (redDotDrawable != null) {
            setbackbuttoncolor = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, setbackbuttoncolor);
        }
        hasCornerMarking min2 = getSecureSignatureComp.setMin(getTaskExecutor().getMin());
        setRefreshAnimation.getMax(min2, "scheduler is null");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 opentranslucentstatusbarsupport = new openTranslucentStatusBarSupport(setbackbuttoncolor, min2);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable2 = SecuritySignature.toString;
        if (redDotDrawable2 != null) {
            opentranslucentstatusbarsupport = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, opentranslucentstatusbarsupport);
        }
        opentranslucentstatusbarsupport.getMin(this.setMin);
        return this.setMin.setMin;
    }

    public void onStopped() {
        super.onStopped();
        setMax<ListenableWorker.setMax> setmax = this.setMin;
        if (setmax != null) {
            GriverProgressBar.UpdateRunnable updateRunnable = setmax.setMax;
            if (updateRunnable != null) {
                updateRunnable.dispose();
            }
            this.setMin = null;
        }
    }

    static class setMax<T> implements TitleBarRightButtonView.CornerMarkingUIController<T>, Runnable {
        @Nullable
        GriverProgressBar.UpdateRunnable setMax;
        final setAttachListener<T> setMin;

        setMax() {
            setAttachListener<T> length = setAttachListener.length();
            this.setMin = length;
            length.addListener(this, RxWorker.getMin);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.setMax = updateRunnable;
        }

        public final void onSuccess(T t) {
            this.setMin.getMax(t);
        }

        public final void onError(Throwable th) {
            this.setMin.getMin(th);
        }

        public final void run() {
            GriverProgressBar.UpdateRunnable updateRunnable;
            if (this.setMin.isCancelled() && (updateRunnable = this.setMax) != null) {
                updateRunnable.dispose();
            }
        }
    }
}
