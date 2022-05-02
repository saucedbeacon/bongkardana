package o;

import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u001a\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lid/dana/data/util/RetryWithDelay;", "Lio/reactivex/functions/Function;", "Lio/reactivex/Observable;", "", "maxRetries", "", "retryDelayMillis", "", "(IJ)V", "getMaxRetries", "()I", "retryCount", "getRetryDelayMillis", "()J", "apply", "t", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getStartContext implements RedDotDrawable<TitleBarRightButtonView.AnonymousClass1<? extends Throwable>, TitleBarRightButtonView.AnonymousClass1<?>> {
    private final int maxRetries;
    /* access modifiers changed from: private */
    public int retryCount;
    private final long retryDelayMillis;

    public getStartContext(int i, long j) {
        this.maxRetries = i;
        this.retryDelayMillis = j;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final long getRetryDelayMillis() {
        return this.retryDelayMillis;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001J\u0014\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/data/util/RetryWithDelay$apply$1", "Lio/reactivex/functions/Function;", "", "Lio/reactivex/Observable;", "apply", "throwable", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass1<?>> {
        final /* synthetic */ getStartContext this$0;

        getMin(getStartContext getstartcontext) {
            this.this$0 = getstartcontext;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<?> apply(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            getStartContext getstartcontext = this.this$0;
            getstartcontext.retryCount = getstartcontext.retryCount + 1;
            if (getstartcontext.retryCount <= this.this$0.getMaxRetries()) {
                TitleBarRightButtonView.AnonymousClass1<Long> timer = TitleBarRightButtonView.AnonymousClass1.timer(this.this$0.getRetryDelayMillis(), TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(timer, "Observable.timer(retryDe…s, TimeUnit.MILLISECONDS)");
                return timer;
            }
            throw new IllegalStateException(th.toString());
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<?> apply(@NotNull TitleBarRightButtonView.AnonymousClass1<? extends Throwable> r2) {
        Intrinsics.checkNotNullParameter(r2, SecurityConstants.KEY_TEXT);
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = r2.flatMap(new getMin(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "t.flatMap(object : Funct…\n            }\n        })");
        return flatMap;
    }
}
