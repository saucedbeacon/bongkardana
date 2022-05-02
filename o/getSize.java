package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJC\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00028\u00012\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\f0\u000fj\u0002`\u00102\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0012j\u0002`\u0014H\u0007¢\u0006\u0002\u0010\u0015R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/domain/core/usecase/CompletableUseCase;", "T", "Params", "", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "buildUseCase", "Lio/reactivex/Observable;", "params", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "dispose", "", "execute", "onComplete", "Lkotlin/Function0;", "Lid/dana/domain/core/usecase/OnCompleteCallback;", "onError", "Lkotlin/Function1;", "", "Lid/dana/domain/core/usecase/OnErrorCallback;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "domain_release"}, k = 1, mv = {1, 4, 2})
public abstract class getSize<T, Params> {
    private GriverProgressBar.UpdateRunnable disposable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Params", "it", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T> implements RedDotManager<T> {
        public static final setMax setMax = new setMax();

        setMax() {
        }

        public final void accept(T t) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Params", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<Unit> {
        public static final length INSTANCE = new length();

        length() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @NotNull
    public abstract TitleBarRightButtonView.AnonymousClass1<T> buildUseCase(Params params);

    @JvmOverloads
    public final void execute(Params params) {
        execute$default(this, params, (Function0) null, (Function1) null, 6, (Object) null);
    }

    @JvmOverloads
    public final void execute(Params params, @NotNull Function0<Unit> function0) {
        execute$default(this, params, function0, (Function1) null, 4, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "Params", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T> implements RedDotManager<Throwable> {
        final /* synthetic */ getSize getMax;
        final /* synthetic */ Function1 length;

        getMax(getSize getsize, Function1 function1) {
            this.getMax = getsize;
            this.length = function1;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Function1 function1 = this.length;
            Intrinsics.checkNotNullExpressionValue(th, "it");
            function1.invoke(th);
            this.getMax.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "Params", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void execute$default(getSize getsize, Object obj, Function0 function0, Function1 function1, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                function0 = length.INSTANCE;
            }
            if ((i & 4) != 0) {
                function1 = getMin.INSTANCE;
            }
            getsize.execute(obj, function0, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
    }

    @JvmOverloads
    public final void execute(Params params, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(function0, "onComplete");
        Intrinsics.checkNotNullParameter(function1, "onError");
        dispose();
        this.disposable = buildUseCase(params).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).subscribe(setMax.setMax, new getMax(this, function1), new setMin(this, function0));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Params", "run"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements removeStateDidChangeHandler {
        final /* synthetic */ Function0 setMax;
        final /* synthetic */ getSize setMin;

        setMin(getSize getsize, Function0 function0) {
            this.setMin = getsize;
            this.setMax = function0;
        }

        public final void getMax() {
            this.setMax.invoke();
            this.setMin.dispose();
        }
    }

    public final void dispose() {
        GriverProgressBar.UpdateRunnable updateRunnable = this.disposable;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        this.disposable = null;
    }
}
