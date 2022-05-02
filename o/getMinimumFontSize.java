package o;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"timeoutForFirstEmit", "Lio/reactivex/Observable;", "T", "millis", "", "domain_release"}, k = 2, mv = {1, 4, 2})
public final class getMinimumFontSize {
    @NotNull
    public static final <T> TitleBarRightButtonView.AnonymousClass1<T> timeoutForFirstEmit(@NotNull TitleBarRightButtonView.AnonymousClass1<T> r1, long j) {
        Intrinsics.checkNotNullParameter(r1, "$this$timeoutForFirstEmit");
        TitleBarRightButtonView.AnonymousClass1<T> timeout = r1.timeout((TitleBarRightButtonView.AnonymousClass4<U>) TitleBarRightButtonView.AnonymousClass1.timer(j, TimeUnit.MILLISECONDS), (RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<V>>) getMin.setMax);
        Intrinsics.checkNotNullExpressionValue(timeout, "timeout(\n    Observable.…> { Observable.never() })");
        return timeout;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "T", "it", "apply", "(Ljava/lang/Object;)Lio/reactivex/ObservableSource;"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<T, TitleBarRightButtonView.AnonymousClass4<Object>> {
        public static final getMin setMax = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return TitleBarRightButtonView.AnonymousClass1.never();
        }
    }
}
