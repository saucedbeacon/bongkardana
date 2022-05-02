package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.Callable;
import o.TitleBarRightButtonView;

public final class SecuritySignature {
    @Nullable
    public static volatile RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> FastBitmap$CoordinateSystem;
    @Nullable
    public static volatile removeNode<? super isCornerMarkingShow, ? super setOptionMenuIcon, ? extends setOptionMenuIcon> Grayscale$Algorithm;
    public static volatile boolean ICustomTabsCallback;
    @Nullable
    public static volatile RedDotDrawable<? super hasCornerMarking, ? extends hasCornerMarking> IsOverlapping;
    @Nullable
    public static volatile removeNode<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? super TitleBarRightButtonView.CornerMarkingUIController, ? extends TitleBarRightButtonView.CornerMarkingUIController> Mean$Arithmetic;
    @Nullable
    public static volatile removeNode<? super setFavoriteBtnVisibility, ? super switchFavoriteIconFont, ? extends switchFavoriteIconFont> b;
    static volatile boolean create;
    @Nullable
    public static volatile RedDotDrawable<? super hasCornerMarking, ? extends hasCornerMarking> equals;
    @Nullable
    static volatile showRedPoint getCause;
    @Nullable
    public static volatile RedDotDrawable<? super Runnable, ? extends Runnable> getMax;
    @Nullable
    public static volatile RedDotDrawable<? super Callable<hasCornerMarking>, ? extends hasCornerMarking> getMin;
    @Nullable
    public static volatile RedDotDrawable<? super setBadgeData, ? extends setBadgeData> hashCode;
    @Nullable
    public static volatile removeNode<? super TitleBarRightButtonView.AnonymousClass1, ? super GriverProgressBar, ? extends GriverProgressBar> invoke;
    @Nullable
    public static volatile removeNode<? super setBadgeData, ? super getbEva, ? extends getbEva> invokeSuspend;
    @Nullable
    public static volatile RedDotDrawable<? super Callable<hasCornerMarking>, ? extends hasCornerMarking> isInside;
    @Nullable
    public static volatile RedDotDrawable<? super Callable<hasCornerMarking>, ? extends hasCornerMarking> length;
    @Nullable
    public static volatile RedDotManager<? super Throwable> setMax;
    @Nullable
    public static volatile RedDotDrawable<? super Callable<hasCornerMarking>, ? extends hasCornerMarking> setMin;
    @Nullable
    public static volatile RedDotDrawable<? super SecurityCipher, ? extends SecurityCipher> toDoubleRange;
    @Nullable
    public static volatile RedDotDrawable<? super hasCornerMarking, ? extends hasCornerMarking> toFloatRange;
    @Nullable
    public static volatile RedDotDrawable<? super hasCornerMarking, ? extends hasCornerMarking> toIntRange;
    @Nullable
    public static volatile RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> toString;
    @Nullable
    public static volatile RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> valueOf;
    @Nullable
    public static volatile RedDotDrawable<? super isCornerMarkingShow, ? extends isCornerMarkingShow> values;

    public static boolean getMin() {
        return create;
    }

    public static void getMax(@NonNull Throwable th) {
        RedDotManager<? super Throwable> redDotManager = setMax;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!setMax(th)) {
            th = new UndeliverableException(th);
        }
        if (redDotManager != null) {
            try {
                redDotManager.accept(th);
                return;
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    private static boolean setMax(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            return false;
        }
        return true;
    }

    public static boolean getMax() {
        showRedPoint showredpoint = getCause;
        if (showredpoint == null) {
            return false;
        }
        try {
            return showredpoint.setMin();
        } catch (Throwable th) {
            throw utAvaiable.getMin(th);
        }
    }

    @NonNull
    public static <T, R> R getMax(@NonNull RedDotDrawable<T, R> redDotDrawable, @NonNull T t) {
        try {
            return redDotDrawable.apply(t);
        } catch (Throwable th) {
            throw utAvaiable.getMin(th);
        }
    }

    @NonNull
    public static <T, U, R> R length(@NonNull removeNode<T, U, R> removenode, @NonNull T t, @NonNull U u) {
        try {
            return removenode.setMax(t, u);
        } catch (Throwable th) {
            throw utAvaiable.getMin(th);
        }
    }

    @NonNull
    public static hasCornerMarking getMax(@NonNull Callable<hasCornerMarking> callable) {
        try {
            return (hasCornerMarking) setRefreshAnimation.getMax(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw utAvaiable.getMin(th);
        }
    }
}
