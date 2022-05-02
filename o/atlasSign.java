package o;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class atlasSign<T> extends sign<T> {
    final ISGPluginManager<T> IsOverlapping;
    final AtomicReference<getbEva<? super T>> equals;
    final setTitleBackgroundImage<T> getMin;
    final AtomicLong hashCode;
    final AtomicBoolean isInside;
    final boolean length;
    final AtomicReference<Runnable> setMax;
    volatile boolean setMin;
    Throwable toFloatRange;
    volatile boolean toIntRange;
    boolean toString;

    @CheckReturnValue
    @NonNull
    public static <T> atlasSign<T> getMin() {
        return new atlasSign<>(setBadgeData.getMax);
    }

    private atlasSign(int i) {
        this(i, (byte) 0);
    }

    private atlasSign(int i, byte b) {
        this.getMin = new setTitleBackgroundImage<>(setRefreshAnimation.getMax(i, "capacityHint"));
        this.setMax = new AtomicReference<>((Object) null);
        this.length = true;
        this.equals = new AtomicReference<>();
        this.isInside = new AtomicBoolean();
        this.IsOverlapping = new length();
        this.hashCode = new AtomicLong();
    }

    /* access modifiers changed from: package-private */
    public final void length() {
        long j;
        if (this.IsOverlapping.getAndIncrement() == 0) {
            int i = 1;
            getbEva getbeva = this.equals.get();
            int i2 = 1;
            while (getbeva == null) {
                i2 = this.IsOverlapping.addAndGet(-i2);
                if (i2 != 0) {
                    getbeva = this.equals.get();
                    i = 1;
                } else {
                    return;
                }
            }
            if (this.toString) {
                setTitleBackgroundImage<T> settitlebackgroundimage = this.getMin;
                boolean z = this.length ^ i;
                while (!this.toIntRange) {
                    boolean z2 = this.setMin;
                    if (!z || !z2 || this.toFloatRange == null) {
                        getbeva.onNext(null);
                        if (z2) {
                            this.equals.lazySet((Object) null);
                            Throwable th = this.toFloatRange;
                            if (th != null) {
                                getbeva.onError(th);
                                return;
                            } else {
                                getbeva.onComplete();
                                return;
                            }
                        } else {
                            i = this.IsOverlapping.addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        settitlebackgroundimage.clear();
                        this.equals.lazySet((Object) null);
                        getbeva.onError(this.toFloatRange);
                        return;
                    }
                }
                this.equals.lazySet((Object) null);
                return;
            }
            setTitleBackgroundImage<T> settitlebackgroundimage2 = this.getMin;
            boolean z3 = !this.length;
            int i3 = 1;
            while (true) {
                long j2 = this.hashCode.get();
                long j3 = 0;
                while (true) {
                    if (j2 == j3) {
                        j = j3;
                        break;
                    }
                    boolean z4 = this.setMin;
                    T poll = settitlebackgroundimage2.poll();
                    boolean z5 = poll == null;
                    T t = poll;
                    j = j3;
                    if (!getMax(z3, z4, z5, getbeva, settitlebackgroundimage2)) {
                        if (z5) {
                            break;
                        }
                        getbeva.onNext(t);
                        j3 = j + 1;
                    } else {
                        return;
                    }
                }
                if (j2 == j) {
                    if (getMax(z3, this.setMin, settitlebackgroundimage2.isEmpty(), getbeva, settitlebackgroundimage2)) {
                        return;
                    }
                }
                if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                    this.hashCode.addAndGet(-j);
                }
                i3 = this.IsOverlapping.addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            }
        }
    }

    private boolean getMax(boolean z, boolean z2, boolean z3, getbEva<? super T> getbeva, setTitleBackgroundImage<T> settitlebackgroundimage) {
        if (this.toIntRange) {
            settitlebackgroundimage.clear();
            this.equals.lazySet((Object) null);
            return true;
        } else if (!z2) {
            return false;
        } else {
            if (z && this.toFloatRange != null) {
                settitlebackgroundimage.clear();
                this.equals.lazySet((Object) null);
                getbeva.onError(this.toFloatRange);
                return true;
            } else if (!z3) {
                return false;
            } else {
                Throwable th = this.toFloatRange;
                this.equals.lazySet((Object) null);
                if (th != null) {
                    getbeva.onError(th);
                } else {
                    getbeva.onComplete();
                }
                return true;
            }
        }
    }

    public final void onSubscribe(getFmt getfmt) {
        if (this.setMin || this.toIntRange) {
            getfmt.cancel();
        } else {
            getfmt.request(Long.MAX_VALUE);
        }
    }

    public final void onNext(T t) {
        setRefreshAnimation.getMax(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.setMin && !this.toIntRange) {
            this.getMin.offer(t);
            length();
        }
    }

    public final void onError(Throwable th) {
        setRefreshAnimation.getMax(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.setMin || this.toIntRange) {
            SecuritySignature.getMax(th);
            return;
        }
        this.toFloatRange = th;
        this.setMin = true;
        Runnable andSet = this.setMax.getAndSet((Object) null);
        if (andSet != null) {
            andSet.run();
        }
        length();
    }

    public final void onComplete() {
        if (!this.setMin && !this.toIntRange) {
            this.setMin = true;
            Runnable andSet = this.setMax.getAndSet((Object) null);
            if (andSet != null) {
                andSet.run();
            }
            length();
        }
    }

    public final void setMax(getbEva<? super T> getbeva) {
        if (this.isInside.get() || !this.isInside.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), getbeva);
            return;
        }
        getbeva.onSubscribe(this.IsOverlapping);
        this.equals.set(getbeva);
        if (this.toIntRange) {
            this.equals.lazySet((Object) null);
        } else {
            length();
        }
    }

    final class length extends ISGPluginManager<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        length() {
        }

        @Nullable
        public final T poll() {
            return atlasSign.this.getMin.poll();
        }

        public final boolean isEmpty() {
            return atlasSign.this.getMin.isEmpty();
        }

        public final void clear() {
            atlasSign.this.getMin.clear();
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            atlasSign.this.toString = true;
            return 2;
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                getPluginInfo.getMax(atlasSign.this.hashCode, j);
                atlasSign.this.length();
            }
        }

        public final void cancel() {
            if (!atlasSign.this.toIntRange) {
                atlasSign.this.toIntRange = true;
                Runnable andSet = atlasSign.this.setMax.getAndSet((Object) null);
                if (andSet != null) {
                    andSet.run();
                }
                atlasSign.this.equals.lazySet((Object) null);
                if (atlasSign.this.IsOverlapping.getAndIncrement() == 0) {
                    atlasSign.this.equals.lazySet((Object) null);
                    if (!atlasSign.this.toString) {
                        atlasSign.this.getMin.clear();
                    }
                }
            }
        }
    }
}
