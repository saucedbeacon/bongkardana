package o;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.GriverPullRefreshService;

public final class getDynamicDataEncryptComp<T> extends getStaticDataEncryptComp<T> {
    boolean IsOverlapping;
    final AtomicBoolean equals;
    final boolean getMax;
    final AtomicReference<GriverProgressBar<? super T>> getMin;
    Throwable isInside;
    volatile boolean length;
    final setTitleBackgroundImage<T> setMax;
    final AtomicReference<Runnable> setMin;
    final GriverPullRefreshService.IGriverRefreshState<T> toFloatRange;
    volatile boolean toIntRange;

    @CheckReturnValue
    @NonNull
    public static <T> getDynamicDataEncryptComp<T> length() {
        return new getDynamicDataEncryptComp<>(bufferSize());
    }

    @CheckReturnValue
    @NonNull
    public static <T> getDynamicDataEncryptComp<T> setMin(int i) {
        return new getDynamicDataEncryptComp<>(i);
    }

    @CheckReturnValue
    @NonNull
    public static <T> getDynamicDataEncryptComp<T> setMax(int i, Runnable runnable) {
        return new getDynamicDataEncryptComp<>(i, runnable);
    }

    private getDynamicDataEncryptComp(int i) {
        this.setMax = new setTitleBackgroundImage<>(setRefreshAnimation.getMax(i, "capacityHint"));
        this.setMin = new AtomicReference<>();
        this.getMax = true;
        this.getMin = new AtomicReference<>();
        this.equals = new AtomicBoolean();
        this.toFloatRange = new setMin();
    }

    private getDynamicDataEncryptComp(int i, Runnable runnable) {
        this.setMax = new setTitleBackgroundImage<>(setRefreshAnimation.getMax(i, "capacityHint"));
        this.setMin = new AtomicReference<>(setRefreshAnimation.getMax(runnable, "onTerminate"));
        this.getMax = true;
        this.getMin = new AtomicReference<>();
        this.equals = new AtomicBoolean();
        this.toFloatRange = new setMin();
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        if (this.equals.get() || !this.equals.compareAndSet(false, true)) {
            EmptyDisposable.error((Throwable) new IllegalStateException("Only a single observer allowed."), (GriverProgressBar<?>) griverProgressBar);
            return;
        }
        griverProgressBar.onSubscribe(this.toFloatRange);
        this.getMin.lazySet(griverProgressBar);
        if (this.length) {
            this.getMin.lazySet((Object) null);
        } else {
            getMax();
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMin() {
        Runnable runnable = this.setMin.get();
        if (runnable != null && this.setMin.compareAndSet(runnable, (Object) null)) {
            runnable.run();
        }
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        if (this.toIntRange || this.length) {
            updateRunnable.dispose();
        }
    }

    public final void onNext(T t) {
        setRefreshAnimation.getMax(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.toIntRange && !this.length) {
            this.setMax.offer(t);
            getMax();
        }
    }

    public final void onError(Throwable th) {
        setRefreshAnimation.getMax(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.toIntRange || this.length) {
            SecuritySignature.getMax(th);
            return;
        }
        this.isInside = th;
        this.toIntRange = true;
        setMin();
        getMax();
    }

    public final void onComplete() {
        if (!this.toIntRange && !this.length) {
            this.toIntRange = true;
            setMin();
            getMax();
        }
    }

    private void setMax(GriverProgressBar<? super T> griverProgressBar) {
        setTitleBackgroundImage<T> settitlebackgroundimage = this.setMax;
        boolean z = !this.getMax;
        boolean z2 = true;
        int i = 1;
        while (!this.length) {
            boolean z3 = this.toIntRange;
            T poll = this.setMax.poll();
            boolean z4 = poll == null;
            if (z3) {
                if (z && z2) {
                    if (!length(settitlebackgroundimage, griverProgressBar)) {
                        z2 = false;
                    } else {
                        return;
                    }
                }
                if (z4) {
                    this.getMin.lazySet((Object) null);
                    Throwable th = this.isInside;
                    if (th != null) {
                        griverProgressBar.onError(th);
                        return;
                    } else {
                        griverProgressBar.onComplete();
                        return;
                    }
                }
            }
            if (!z4) {
                griverProgressBar.onNext(poll);
            } else {
                i = this.toFloatRange.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
        this.getMin.lazySet((Object) null);
        settitlebackgroundimage.clear();
    }

    private void getMin(GriverProgressBar<? super T> griverProgressBar) {
        setTitleBackgroundImage<T> settitlebackgroundimage = this.setMax;
        int i = 1;
        boolean z = !this.getMax;
        while (!this.length) {
            boolean z2 = this.toIntRange;
            if (!z || !z2 || !length(settitlebackgroundimage, griverProgressBar)) {
                griverProgressBar.onNext(null);
                if (z2) {
                    this.getMin.lazySet((Object) null);
                    Throwable th = this.isInside;
                    if (th != null) {
                        griverProgressBar.onError(th);
                        return;
                    } else {
                        griverProgressBar.onComplete();
                        return;
                    }
                } else {
                    i = this.toFloatRange.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.getMin.lazySet((Object) null);
    }

    private boolean length(GriverPullRefreshService<T> griverPullRefreshService, GriverProgressBar<? super T> griverProgressBar) {
        Throwable th = this.isInside;
        if (th == null) {
            return false;
        }
        this.getMin.lazySet((Object) null);
        griverPullRefreshService.clear();
        griverProgressBar.onError(th);
        return true;
    }

    private void getMax() {
        if (this.toFloatRange.getAndIncrement() == 0) {
            GriverProgressBar griverProgressBar = this.getMin.get();
            int i = 1;
            while (griverProgressBar == null) {
                i = this.toFloatRange.addAndGet(-i);
                if (i != 0) {
                    griverProgressBar = this.getMin.get();
                } else {
                    return;
                }
            }
            if (this.IsOverlapping) {
                getMin(griverProgressBar);
            } else {
                setMax(griverProgressBar);
            }
        }
    }

    final class setMin extends GriverPullRefreshService.IGriverRefreshState<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        setMin() {
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            getDynamicDataEncryptComp.this.IsOverlapping = true;
            return 2;
        }

        @Nullable
        public final T poll() throws Exception {
            return getDynamicDataEncryptComp.this.setMax.poll();
        }

        public final boolean isEmpty() {
            return getDynamicDataEncryptComp.this.setMax.isEmpty();
        }

        public final void clear() {
            getDynamicDataEncryptComp.this.setMax.clear();
        }

        public final void dispose() {
            if (!getDynamicDataEncryptComp.this.length) {
                getDynamicDataEncryptComp.this.length = true;
                getDynamicDataEncryptComp.this.setMin();
                getDynamicDataEncryptComp.this.getMin.lazySet((Object) null);
                if (getDynamicDataEncryptComp.this.toFloatRange.getAndIncrement() == 0) {
                    getDynamicDataEncryptComp.this.getMin.lazySet((Object) null);
                    if (!getDynamicDataEncryptComp.this.IsOverlapping) {
                        getDynamicDataEncryptComp.this.setMax.clear();
                    }
                }
            }
        }

        public final boolean isDisposed() {
            return getDynamicDataEncryptComp.this.length;
        }
    }
}
