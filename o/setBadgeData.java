package o;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import o.GriverProgressBar;

public abstract class setBadgeData<T> implements setEvVer<T> {
    public static final int getMax = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* access modifiers changed from: protected */
    public abstract void setMax(getbEva<? super T> getbeva);

    public static int setMin() {
        return getMax;
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @NonNull
    @SchedulerSupport("none")
    public final GriverProgressBar.UpdateRunnable getMax(RedDotManager<? super T> redDotManager, RedDotManager<? super Throwable> redDotManager2, removeStateDidChangeHandler removestatedidchangehandler, RedDotManager<? super getFmt> redDotManager3) {
        setRefreshAnimation.getMax(redDotManager, "onNext is null");
        setRefreshAnimation.getMax(redDotManager2, "onError is null");
        setRefreshAnimation.getMax(removestatedidchangehandler, "onComplete is null");
        setRefreshAnimation.getMax(redDotManager3, "onSubscribe is null");
        getRouter getrouter = new getRouter(redDotManager, redDotManager2, removestatedidchangehandler, redDotManager3);
        setMin(getrouter);
        return getrouter;
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final void getMin(getbEva<? super T> getbeva) {
        if (getbeva instanceof switchTheme) {
            setMin((switchTheme) getbeva);
            return;
        }
        setRefreshAnimation.getMax(getbeva, "s is null");
        setMin(new getMainPluginName(getbeva));
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final void setMin(switchTheme<? super T> switchtheme) {
        setRefreshAnimation.getMax(switchtheme, "s is null");
        try {
            removeNode<? super setBadgeData, ? super getbEva, ? extends getbEva> removenode = SecuritySignature.invokeSuspend;
            getbEva getbeva = switchtheme;
            if (removenode != null) {
                getbeva = (getbEva) SecuritySignature.length(removenode, this, switchtheme);
            }
            setRefreshAnimation.getMax(getbeva, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            setMax(getbeva);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            registerNode.getMax(th);
            SecuritySignature.getMax(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
