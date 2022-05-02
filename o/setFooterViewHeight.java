package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class setFooterViewHeight extends setFavoriteBtnVisibility {
    final hasCornerMarking getMin;
    final TimeUnit length;
    final long setMax;

    public setFooterViewHeight(long j, TimeUnit timeUnit, hasCornerMarking hascornermarking) {
        this.setMax = j;
        this.length = timeUnit;
        this.getMin = hascornermarking;
    }

    public final void setMax(switchFavoriteIconFont switchfavoriteiconfont) {
        length length2 = new length(switchfavoriteiconfont);
        switchfavoriteiconfont.onSubscribe(length2);
        length2.setFuture(this.getMin.scheduleDirect(length2, this.setMax, this.length));
    }

    static final class length extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar.UpdateRunnable, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;
        final switchFavoriteIconFont downstream;

        length(switchFavoriteIconFont switchfavoriteiconfont) {
            this.downstream = switchfavoriteiconfont;
        }

        public final void run() {
            this.downstream.onComplete();
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }

        /* access modifiers changed from: package-private */
        public final void setFuture(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.replace(this, updateRunnable);
        }
    }
}
