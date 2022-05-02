package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import id.dana.data.globalsearch.source.network.request.AutoCompleteRequestEntity;
import id.dana.data.globalsearch.source.network.request.SearchRequestEntity;
import id.dana.data.globalsearch.source.network.result.AutoCompleteResultEntity;
import id.dana.data.globalsearch.source.network.result.SearchResultEntity;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;
import o.hasCornerMarking;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lid/dana/data/globalsearch/source/network/SearchFacade;", "", "autoCompleteQuery", "Lid/dana/data/globalsearch/source/network/result/AutoCompleteResultEntity;", "autoCompleteRequestEntity", "Lid/dana/data/globalsearch/source/network/request/AutoCompleteRequestEntity;", "getHistoricalSku", "Lid/dana/data/globalsearch/source/network/result/HistoricalSkuResultEntity;", "historicalSkuRequest", "Lid/dana/data/globalsearch/source/network/request/HistoricalSkuRequest;", "searchQuery", "Lid/dana/data/globalsearch/source/network/result/SearchResultEntity;", "searchRequestEntity", "Lid/dana/data/globalsearch/source/network/request/SearchRequestEntity;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface LoadingView {
    @OperationType("id.dana.danasearch.search.paysearch.autocomplete")
    @NotNull
    @SignCheck
    AutoCompleteResultEntity autoCompleteQuery(@NotNull AutoCompleteRequestEntity autoCompleteRequestEntity);

    @OperationType("alipayplus.mobilewallet.product.query.successful.biz.ids")
    @NotNull
    useSuperSplash getHistoricalSku(@NotNull SplashUtils splashUtils);

    @OperationType("id.dana.danasearch.search.paysearch")
    @NotNull
    @SignCheck
    SearchResultEntity searchQuery(@NotNull SearchRequestEntity searchRequestEntity);

    public final class OnCancelListener<T> extends TitleBarRightButtonView.AnonymousClass1<T> {
        final Callable<? extends TitleBarRightButtonView.AnonymousClass4<? extends T>> getMin;

        public OnCancelListener(Callable<? extends TitleBarRightButtonView.AnonymousClass4<? extends T>> callable) {
            this.getMin = callable;
        }

        public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
            try {
                ((TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.getMin.call(), "null ObservableSource supplied")).subscribe(griverProgressBar);
            } catch (Throwable th) {
                registerNode.getMax(th);
                EmptyDisposable.error(th, (GriverProgressBar<?>) griverProgressBar);
            }
        }
    }

    public final class Factory<T> extends onLoadMoreStateChanged<T, T> {
        final hasCornerMarking getMax;
        final long getMin;
        final TimeUnit length;
        final boolean setMax;

        public Factory(TitleBarRightButtonView.AnonymousClass4<T> r1, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking, boolean z) {
            super(r1);
            this.getMin = j;
            this.length = timeUnit;
            this.getMax = hascornermarking;
            this.setMax = z;
        }

        public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
            this.setMin.subscribe(new length(!this.setMax ? new SecurityStorage(griverProgressBar) : griverProgressBar, this.getMin, this.length, this.getMax.createWorker(), this.setMax));
        }

        static final class length<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
            GriverProgressBar.UpdateRunnable equals;
            final hasCornerMarking.getMin getMax;
            final boolean getMin;
            final TimeUnit length;
            final long setMax;
            final GriverProgressBar<? super T> setMin;

            length(GriverProgressBar<? super T> griverProgressBar, long j, TimeUnit timeUnit, hasCornerMarking.getMin getmin, boolean z) {
                this.setMin = griverProgressBar;
                this.setMax = j;
                this.length = timeUnit;
                this.getMax = getmin;
                this.getMin = z;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                if (DisposableHelper.validate(this.equals, updateRunnable)) {
                    this.equals = updateRunnable;
                    this.setMin.onSubscribe(this);
                }
            }

            public final void onNext(T t) {
                this.getMax.setMin(new getMax(t), this.setMax, this.length);
            }

            public final void onError(Throwable th) {
                this.getMax.setMin(new setMax(th), this.getMin ? this.setMax : 0, this.length);
            }

            public final void onComplete() {
                this.getMax.setMin(new getMin(), this.setMax, this.length);
            }

            public final void dispose() {
                this.equals.dispose();
                this.getMax.dispose();
            }

            public final boolean isDisposed() {
                return this.getMax.isDisposed();
            }

            final class getMax implements Runnable {
                private final T setMax;

                getMax(T t) {
                    this.setMax = t;
                }

                public final void run() {
                    length.this.setMin.onNext(this.setMax);
                }
            }

            final class setMax implements Runnable {
                private final Throwable getMax;

                setMax(Throwable th) {
                    this.getMax = th;
                }

                public final void run() {
                    try {
                        length.this.setMin.onError(this.getMax);
                    } finally {
                        length.this.getMax.dispose();
                    }
                }
            }

            final class getMin implements Runnable {
                getMin() {
                }

                public final void run() {
                    try {
                        length.this.setMin.onComplete();
                    } finally {
                        length.this.getMax.dispose();
                    }
                }
            }
        }
    }
}
