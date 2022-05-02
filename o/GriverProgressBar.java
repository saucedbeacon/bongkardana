package o;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.annotations.NonNull;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import o.hasCornerMarking;

public interface GriverProgressBar<T> {

    public interface UpdateRunnable {
        void dispose();

        boolean isDisposed();
    }

    void onComplete();

    void onError(@NonNull Throwable th);

    void onNext(@NonNull T t);

    void onSubscribe(@NonNull UpdateRunnable updateRunnable);

    final class ProgressNotifier extends hasCornerMarking {
        private final boolean length = false;
        private final Handler setMax;

        ProgressNotifier(Handler handler) {
            this.setMax = handler;
        }

        public final hasCornerMarking.getMin createWorker() {
            return new setMax(this.setMax, this.length);
        }

        static final class setMax extends hasCornerMarking.getMin {
            private final Handler getMax;
            private final boolean getMin;
            private volatile boolean setMax;

            setMax(Handler handler, boolean z) {
                this.getMax = handler;
                this.getMin = z;
            }

            @SuppressLint({"NewApi"})
            public final UpdateRunnable setMin(Runnable runnable, long j, TimeUnit timeUnit) {
                if (runnable == null) {
                    throw new NullPointerException("run == null");
                } else if (timeUnit == null) {
                    throw new NullPointerException("unit == null");
                } else if (this.setMax) {
                    return EmptyDisposable.INSTANCE;
                } else {
                    setRefreshAnimation.getMax(runnable, "run is null");
                    RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
                    if (redDotDrawable != null) {
                        runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
                    }
                    length length = new length(this.getMax, runnable);
                    Message obtain = Message.obtain(this.getMax, length);
                    obtain.obj = this;
                    if (this.getMin) {
                        obtain.setAsynchronous(true);
                    }
                    this.getMax.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                    if (!this.setMax) {
                        return length;
                    }
                    this.getMax.removeCallbacks(length);
                    return EmptyDisposable.INSTANCE;
                }
            }

            public final void dispose() {
                this.setMax = true;
                this.getMax.removeCallbacksAndMessages(this);
            }

            public final boolean isDisposed() {
                return this.setMax;
            }
        }

        static final class length implements Runnable, UpdateRunnable {
            private volatile boolean getMin;
            private final Handler length;
            private final Runnable setMin;

            length(Handler handler, Runnable runnable) {
                this.length = handler;
                this.setMin = runnable;
            }

            public final void run() {
                try {
                    this.setMin.run();
                } catch (Throwable th) {
                    SecuritySignature.getMax(th);
                }
            }

            public final void dispose() {
                this.length.removeCallbacks(this);
                this.getMin = true;
            }

            public final boolean isDisposed() {
                return this.getMin;
            }
        }

        @SuppressLint({"NewApi"})
        public final UpdateRunnable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit != null) {
                setRefreshAnimation.getMax(runnable, "run is null");
                RedDotDrawable<? super Runnable, ? extends Runnable> redDotDrawable = SecuritySignature.getMax;
                if (redDotDrawable != null) {
                    runnable = (Runnable) SecuritySignature.getMax(redDotDrawable, runnable);
                }
                length length2 = new length(this.setMax, runnable);
                Message obtain = Message.obtain(this.setMax, length2);
                if (this.length) {
                    obtain.setAsynchronous(true);
                }
                this.setMax.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                return length2;
            } else {
                throw new NullPointerException("unit == null");
            }
        }
    }
}
