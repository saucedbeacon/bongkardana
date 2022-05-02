package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.hasCornerMarking;

public final class getPluginName extends hasCornerMarking implements GriverProgressBar.UpdateRunnable {
    static final GriverProgressBar.UpdateRunnable setMax = EmptyDisposable.INSTANCE;
    static final GriverProgressBar.UpdateRunnable setMin = new toFloatRange();
    private final sign<setBadgeData<setFavoriteBtnVisibility>> getMax;
    private final hasCornerMarking getMin;
    private GriverProgressBar.UpdateRunnable length;

    public getPluginName(RedDotDrawable<setBadgeData<setBadgeData<setFavoriteBtnVisibility>>, setFavoriteBtnVisibility> redDotDrawable, hasCornerMarking hascornermarking) {
        this.getMin = hascornermarking;
        signWithSimulator signwithsimulator = new signWithSimulator(atlasSign.getMin());
        this.getMax = signwithsimulator;
        try {
            this.length = redDotDrawable.apply(signwithsimulator).v_();
        } catch (Throwable th) {
            throw utAvaiable.getMin(th);
        }
    }

    public final void dispose() {
        this.length.dispose();
    }

    public final boolean isDisposed() {
        return this.length.isDisposed();
    }

    @NonNull
    public final hasCornerMarking.getMin createWorker() {
        hasCornerMarking.getMin createWorker = this.getMin.createWorker();
        signWithSimulator signwithsimulator = new signWithSimulator(atlasSign.getMin());
        getMin getmin = new getMin(createWorker);
        setRefreshAnimation.getMax(getmin, "mapper is null");
        Object getloadmorefooter = new getLoadMoreFooter(signwithsimulator, getmin);
        RedDotDrawable<? super setBadgeData, ? extends setBadgeData> redDotDrawable = SecuritySignature.hashCode;
        if (redDotDrawable != null) {
            getloadmorefooter = (setBadgeData) SecuritySignature.getMax(redDotDrawable, getloadmorefooter);
        }
        setMax setmax = new setMax(signwithsimulator, createWorker);
        this.getMax.onNext(getloadmorefooter);
        return setmax;
    }

    static abstract class equals extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar.UpdateRunnable {
        /* access modifiers changed from: protected */
        public abstract GriverProgressBar.UpdateRunnable callActual(hasCornerMarking.getMin getmin, switchFavoriteIconFont switchfavoriteiconfont);

        equals() {
            super(getPluginName.setMin);
        }

        /* access modifiers changed from: package-private */
        public void call(hasCornerMarking.getMin getmin, switchFavoriteIconFont switchfavoriteiconfont) {
            GriverProgressBar.UpdateRunnable updateRunnable = (GriverProgressBar.UpdateRunnable) get();
            if (updateRunnable != getPluginName.setMax && updateRunnable == getPluginName.setMin) {
                GriverProgressBar.UpdateRunnable callActual = callActual(getmin, switchfavoriteiconfont);
                if (!compareAndSet(getPluginName.setMin, callActual)) {
                    callActual.dispose();
                }
            }
        }

        public boolean isDisposed() {
            return ((GriverProgressBar.UpdateRunnable) get()).isDisposed();
        }

        public void dispose() {
            GriverProgressBar.UpdateRunnable updateRunnable;
            GriverProgressBar.UpdateRunnable updateRunnable2 = getPluginName.setMax;
            do {
                updateRunnable = (GriverProgressBar.UpdateRunnable) get();
                if (updateRunnable == getPluginName.setMax) {
                    return;
                }
            } while (!compareAndSet(updateRunnable, updateRunnable2));
            if (updateRunnable != getPluginName.setMin) {
                updateRunnable.dispose();
            }
        }
    }

    static class setMin extends equals {
        private final Runnable action;

        setMin(Runnable runnable) {
            this.action = runnable;
        }

        /* access modifiers changed from: protected */
        public final GriverProgressBar.UpdateRunnable callActual(hasCornerMarking.getMin getmin, switchFavoriteIconFont switchfavoriteiconfont) {
            return getmin.getMin(new getMax(this.action, switchfavoriteiconfont));
        }
    }

    static class length extends equals {
        private final Runnable action;
        private final long delayTime;
        private final TimeUnit unit;

        length(Runnable runnable, long j, TimeUnit timeUnit) {
            this.action = runnable;
            this.delayTime = j;
            this.unit = timeUnit;
        }

        /* access modifiers changed from: protected */
        public final GriverProgressBar.UpdateRunnable callActual(hasCornerMarking.getMin getmin, switchFavoriteIconFont switchfavoriteiconfont) {
            return getmin.setMin(new getMax(this.action, switchfavoriteiconfont), this.delayTime, this.unit);
        }
    }

    static class getMax implements Runnable {
        final Runnable length;
        final switchFavoriteIconFont setMax;

        getMax(Runnable runnable, switchFavoriteIconFont switchfavoriteiconfont) {
            this.length = runnable;
            this.setMax = switchfavoriteiconfont;
        }

        public final void run() {
            try {
                this.length.run();
            } finally {
                this.setMax.onComplete();
            }
        }
    }

    static final class getMin implements RedDotDrawable<equals, setFavoriteBtnVisibility> {
        final hasCornerMarking.getMin getMax;

        public final /* synthetic */ Object apply(Object obj) throws Exception {
            return new setMin((equals) obj);
        }

        getMin(hasCornerMarking.getMin getmin) {
            this.getMax = getmin;
        }

        final class setMin extends setFavoriteBtnVisibility {
            final equals setMin;

            setMin(equals equals) {
                this.setMin = equals;
            }

            public final void setMax(switchFavoriteIconFont switchfavoriteiconfont) {
                switchfavoriteiconfont.onSubscribe(this.setMin);
                this.setMin.call(getMin.this.getMax, switchfavoriteiconfont);
            }
        }
    }

    static final class setMax extends hasCornerMarking.getMin {
        private final AtomicBoolean getMin = new AtomicBoolean();
        private final sign<equals> length;
        private final hasCornerMarking.getMin setMax;

        setMax(sign<equals> sign, hasCornerMarking.getMin getmin) {
            this.length = sign;
            this.setMax = getmin;
        }

        public final void dispose() {
            if (this.getMin.compareAndSet(false, true)) {
                this.length.onComplete();
                this.setMax.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.getMin.get();
        }

        @NonNull
        public final GriverProgressBar.UpdateRunnable setMin(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            length length2 = new length(runnable, j, timeUnit);
            this.length.onNext(length2);
            return length2;
        }

        @NonNull
        public final GriverProgressBar.UpdateRunnable getMin(@NonNull Runnable runnable) {
            setMin setmin = new setMin(runnable);
            this.length.onNext(setmin);
            return setmin;
        }
    }

    static final class toFloatRange implements GriverProgressBar.UpdateRunnable {
        public final void dispose() {
        }

        public final boolean isDisposed() {
            return false;
        }

        toFloatRange() {
        }
    }
}
