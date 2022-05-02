package o;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.DisposableHelper;
import o.GriverProgressBar;
import o.GriverPullRefreshService;
import o.TitleBarRightButtonView;
import o.hasCornerMarking;

public final class setOptionImage<T> extends onLoadMoreStateChanged<T, T> {
    final int getMax;
    final hasCornerMarking getMin;
    final boolean setMax;

    public setOptionImage(TitleBarRightButtonView.AnonymousClass4<T> r1, hasCornerMarking hascornermarking, boolean z, int i) {
        super(r1);
        this.getMin = hascornermarking;
        this.setMax = z;
        this.getMax = i;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        hasCornerMarking hascornermarking = this.getMin;
        if (hascornermarking instanceof getAssetManager) {
            this.setMin.subscribe(griverProgressBar);
            return;
        }
        this.setMin.subscribe(new setMin(griverProgressBar, hascornermarking.createWorker(), this.setMax, this.getMax));
    }

    static final class setMin<T> extends GriverPullRefreshService.IGriverRefreshState<T> implements GriverProgressBar<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final GriverProgressBar<? super T> downstream;
        Throwable error;
        boolean outputFused;
        GriverPullRefreshService<T> queue;
        int sourceMode;
        GriverProgressBar.UpdateRunnable upstream;
        final hasCornerMarking.getMin worker;

        setMin(GriverProgressBar<? super T> griverProgressBar, hasCornerMarking.getMin getmin, boolean z, int i) {
            this.downstream = griverProgressBar;
            this.worker = getmin;
            this.delayError = z;
            this.bufferSize = i;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                if (updateRunnable instanceof setRefreshTips) {
                    setRefreshTips setrefreshtips = (setRefreshTips) updateRunnable;
                    int requestFusion = setrefreshtips.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = setrefreshtips;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        schedule();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = setrefreshtips;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new setTitleBackgroundImage(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (this.sourceMode != 2) {
                    this.queue.offer(t);
                }
                schedule();
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                SecuritySignature.getMax(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                schedule();
            }
        }

        public final void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.upstream.dispose();
                this.worker.dispose();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public final boolean isDisposed() {
            return this.disposed;
        }

        /* access modifiers changed from: package-private */
        public final void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.getMin(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainNormal() {
            GriverPullRefreshService<T> griverPullRefreshService = this.queue;
            GriverProgressBar<? super T> griverProgressBar = this.downstream;
            int i = 1;
            while (!checkTerminated(this.done, griverPullRefreshService.isEmpty(), griverProgressBar)) {
                while (true) {
                    boolean z = this.done;
                    try {
                        T poll = griverPullRefreshService.poll();
                        boolean z2 = poll == null;
                        if (!checkTerminated(z, z2, griverProgressBar)) {
                            if (!z2) {
                                griverProgressBar.onNext(poll);
                            } else {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        this.disposed = true;
                        this.upstream.dispose();
                        griverPullRefreshService.clear();
                        griverProgressBar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainFused() {
            int i = 1;
            while (!this.disposed) {
                boolean z = this.done;
                Throwable th = this.error;
                if (this.delayError || !z || th == null) {
                    this.downstream.onNext(null);
                    if (z) {
                        this.disposed = true;
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            this.downstream.onError(th2);
                        } else {
                            this.downstream.onComplete();
                        }
                        this.worker.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.disposed = true;
                    this.downstream.onError(this.error);
                    this.worker.dispose();
                    return;
                }
            }
        }

        public final void run() {
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean checkTerminated(boolean z, boolean z2, GriverProgressBar<? super T> griverProgressBar) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.error;
                if (this.delayError) {
                    if (!z2) {
                        return false;
                    }
                    this.disposed = true;
                    if (th != null) {
                        griverProgressBar.onError(th);
                    } else {
                        griverProgressBar.onComplete();
                    }
                    this.worker.dispose();
                    return true;
                } else if (th != null) {
                    this.disposed = true;
                    this.queue.clear();
                    griverProgressBar.onError(th);
                    this.worker.dispose();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.disposed = true;
                    griverProgressBar.onComplete();
                    this.worker.dispose();
                    return true;
                }
            }
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Nullable
        public final T poll() throws Exception {
            return this.queue.poll();
        }

        public final void clear() {
            this.queue.clear();
        }

        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }
    }
}
