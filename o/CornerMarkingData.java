package o;

import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\tH\u0007J*\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lid/dana/utils/ObservableUtil;", "", "()V", "createObservable", "", "T", "onSubscribe", "Lio/reactivex/ObservableOnSubscribe;", "observer", "Lio/reactivex/Observer;", "createSingleObservable", "Lio/reactivex/disposables/Disposable;", "callable", "Ljava/util/concurrent/Callable;", "consumer", "Lio/reactivex/functions/Consumer;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CornerMarkingData {
    @NotNull
    public static final CornerMarkingData getMax = new CornerMarkingData();

    private CornerMarkingData() {
    }

    @JvmStatic
    @NotNull
    public static final <T> GriverProgressBar.UpdateRunnable length(@NotNull Callable<T> callable, @NotNull RedDotManager<T> redDotManager) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(redDotManager, "consumer");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> max = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMax(callable);
        hasCornerMarking min = getSecureSignatureComp.setMin();
        setRefreshAnimation.getMax(min, "scheduler is null");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 setbackbuttoncolor = new setBackButtonColor(max, min);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable = SecuritySignature.toString;
        if (redDotDrawable != null) {
            setbackbuttoncolor = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, setbackbuttoncolor);
        }
        GriverProgressBar.UpdateRunnable min2 = setbackbuttoncolor.setMin(redDotManager, Functions.IsOverlapping);
        Intrinsics.checkNotNullExpressionValue(min2, "Single.fromCallable(call…io()).subscribe(consumer)");
        return min2;
    }
}
