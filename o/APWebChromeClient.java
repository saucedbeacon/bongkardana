package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u0001H&¢\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fJM\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00012\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u00132\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0012j\u0002`\u0016H\u0007¢\u0006\u0002\u0010\u0017J_\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00012\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u00132\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0012j\u0002`\u00162\u0012\b\u0002\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u000f0\u0019j\u0002`\u001a¢\u0006\u0002\u0010\u001bJm\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00012\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u00132\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0012j\u0002`\u00162\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJM\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00012\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u00132\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0012j\u0002`\u0016H\u0007¢\u0006\u0002\u0010\u0017Jm\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00012\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u00132\u0018\b\u0002\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0012j\u0002`\u00162\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ\b\u0010 \u001a\u00020!H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lid/dana/domain/core/usecase/BaseUseCase;", "T", "Params", "", "jobScheduler", "Lio/reactivex/Scheduler;", "postScheduler", "(Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "buildUseCase", "Lio/reactivex/Observable;", "params", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "dispose", "", "execute", "onSuccess", "Lkotlin/Function1;", "Lid/dana/domain/core/usecase/OnSuccessCallback;", "onError", "", "Lid/dana/domain/core/usecase/OnErrorCallback;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onComplete", "Lkotlin/Function0;", "Lid/dana/domain/core/usecase/OnCompleteCallback;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "onDispose", "Lio/reactivex/functions/Action;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lio/reactivex/functions/Action;)V", "executeInBackground", "getSubclassPath", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public abstract class APWebChromeClient<T, Params> {
    private final IRedDotManager disposable;
    private final hasCornerMarking jobScheduler;
    private final hasCornerMarking postScheduler;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Params", "run"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements removeStateDidChangeHandler {
        public static final IsOverlapping setMax = new IsOverlapping();

        IsOverlapping() {
        }

        public final void getMax() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Params", "run"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements removeStateDidChangeHandler {
        public static final getMin setMax = new getMin();

        getMin() {
        }

        public final void getMax() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Params", "run"}, k = 3, mv = {1, 4, 2})
    static final class hashCode implements removeStateDidChangeHandler {
        public static final hashCode getMax = new hashCode();

        hashCode() {
        }

        public final void getMax() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Params", "run"}, k = 3, mv = {1, 4, 2})
    static final class invoke implements removeStateDidChangeHandler {
        public static final invoke setMin = new invoke();

        invoke() {
        }

        public final void getMax() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Params", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function0<Unit> {
        public static final isInside INSTANCE = new isInside();

        isInside() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Params", "run"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange implements removeStateDidChangeHandler {
        public static final toFloatRange length = new toFloatRange();

        toFloatRange() {
        }

        public final void getMax() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Params", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function0<Unit> {
        public static final toIntRange INSTANCE = new toIntRange();

        toIntRange() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Params", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function0<Unit> {
        public static final values INSTANCE = new values();

        values() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @JvmOverloads
    public APWebChromeClient() {
        this((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public APWebChromeClient(@NotNull hasCornerMarking hascornermarking) {
        this(hascornermarking, (hasCornerMarking) null, 2, (DefaultConstructorMarker) null);
    }

    @NotNull
    public abstract TitleBarRightButtonView.AnonymousClass1<T> buildUseCase(Params params);

    @JvmOverloads
    public final void execute(Params params, @NotNull Function1<? super T, Unit> function1) {
        execute$default(this, params, function1, (Function1) null, 4, (Object) null);
    }

    @JvmOverloads
    public final void executeInBackground(Params params, @NotNull Function1<? super T, Unit> function1) {
        executeInBackground$default(this, params, function1, (Function1) null, 4, (Object) null);
    }

    public final class CustomViewCallback implements getAdapterPosition<getVisitedHistory> {
        private final b.C0007b<setMediaPlaybackRequiresUserGesture> generateLinkRepositoryProvider;
        private final b.C0007b<getScheme> postExecutionThreadProvider;
        private final b.C0007b<appxLoadFailed> threadExecutorProvider;

        public CustomViewCallback(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setMediaPlaybackRequiresUserGesture> bVar3) {
            this.threadExecutorProvider = bVar;
            this.postExecutionThreadProvider = bVar2;
            this.generateLinkRepositoryProvider = bVar3;
        }

        public final getVisitedHistory get() {
            return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.generateLinkRepositoryProvider.get());
        }

        public static CustomViewCallback create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setMediaPlaybackRequiresUserGesture> bVar3) {
            return new CustomViewCallback(bVar, bVar2, bVar3);
        }

        public static getVisitedHistory newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setMediaPlaybackRequiresUserGesture setmediaplaybackrequiresusergesture) {
            return new getVisitedHistory(appxloadfailed, getscheme, setmediaplaybackrequiresusergesture);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "Params", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Throwable, Unit> {
        public static final equals INSTANCE = new equals();

        equals() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "Params", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T> implements RedDotManager<Throwable> {
        final /* synthetic */ APWebChromeClient length;
        final /* synthetic */ Function1 setMin;

        getMax(APWebChromeClient aPWebChromeClient, Function1 function1) {
            this.length = aPWebChromeClient;
            this.setMin = function1;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            String unused = this.length.getSubclassPath();
            Function1 function1 = this.setMin;
            Intrinsics.checkNotNullExpressionValue(th, "it");
            function1.invoke(th);
            this.length.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "Params", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        public static final length INSTANCE = new length();

        length() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "Params", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "Params", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function1<Throwable, Unit> {
        public static final toDoubleRange INSTANCE = new toDoubleRange();

        toDoubleRange() {
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

    @JvmOverloads
    public APWebChromeClient(@NotNull hasCornerMarking hascornermarking, @NotNull hasCornerMarking hascornermarking2) {
        Intrinsics.checkNotNullParameter(hascornermarking, "jobScheduler");
        Intrinsics.checkNotNullParameter(hascornermarking2, "postScheduler");
        this.jobScheduler = hascornermarking;
        this.postScheduler = hascornermarking2;
        this.disposable = new IRedDotManager();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ APWebChromeClient(o.hasCornerMarking r1, o.hasCornerMarking r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L_0x000d
            o.hasCornerMarking r1 = o.getSecureSignatureComp.setMin()
            java.lang.String r4 = "Schedulers.io()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
        L_0x000d:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x001a
            o.hasCornerMarking r2 = o.hideProgress.length()
            java.lang.String r3 = "AndroidSchedulers.mainThread()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        L_0x001a:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.APWebChromeClient.<init>(o.hasCornerMarking, o.hasCornerMarking, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ void execute$default(APWebChromeClient aPWebChromeClient, Object obj, Function1 function1, Function1 function12, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 4) != 0) {
                function12 = setMin.INSTANCE;
            }
            aPWebChromeClient.execute(obj, function1, function12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
    }

    @JvmOverloads
    public final void execute(Params params, @NotNull Function1<? super T, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "onSuccess");
        Intrinsics.checkNotNullParameter(function12, "onError");
        execute(params, function1, function12, (Function0<Unit>) null, getMin.setMax);
    }

    public static /* synthetic */ void execute$default(APWebChromeClient aPWebChromeClient, Object obj, Function1 function1, Function1 function12, Function0 function0, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 4) != 0) {
                function12 = length.INSTANCE;
            }
            if ((i & 8) != 0) {
                function0 = toIntRange.INSTANCE;
            }
            aPWebChromeClient.execute(obj, function1, function12, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
    }

    public final void execute(Params params, @NotNull Function1<? super T, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function1, "onSuccess");
        Intrinsics.checkNotNullParameter(function12, "onError");
        Intrinsics.checkNotNullParameter(function0, "onComplete");
        execute(params, function1, function12, function0, IsOverlapping.setMax);
    }

    public static /* synthetic */ void execute$default(APWebChromeClient aPWebChromeClient, Object obj, Function1 function1, Function1 function12, Function0 function0, removeStateDidChangeHandler removestatedidchangehandler, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 4) != 0) {
                function12 = equals.INSTANCE;
            }
            Function1 function13 = function12;
            if ((i & 8) != 0) {
                function0 = isInside.INSTANCE;
            }
            Function0 function02 = function0;
            if ((i & 16) != 0) {
                removestatedidchangehandler = toFloatRange.length;
            }
            aPWebChromeClient.execute(obj, function1, function13, function02, removestatedidchangehandler);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
    }

    public final void execute(Params params, @NotNull Function1<? super T, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @Nullable Function0<Unit> function0, @NotNull removeStateDidChangeHandler removestatedidchangehandler) {
        Intrinsics.checkNotNullParameter(function1, "onSuccess");
        Intrinsics.checkNotNullParameter(function12, "onError");
        Intrinsics.checkNotNullParameter(removestatedidchangehandler, "onDispose");
        System.out.print("test");
        this.disposable.getMin(buildUseCase(params).subscribeOn(this.jobScheduler).observeOn(this.postScheduler).doOnDispose(removestatedidchangehandler).subscribe(new toString(function1), new getMax(this, function12), new setMax(this, function0)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Params", "it", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 4, 2})
    static final class toString<T> implements RedDotManager<T> {
        final /* synthetic */ Function1 length;

        toString(Function1 function1) {
            this.length = function1;
        }

        public final void accept(T t) {
            this.length.invoke(t);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Params", "run"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements removeStateDidChangeHandler {
        final /* synthetic */ APWebChromeClient getMax;
        final /* synthetic */ Function0 getMin;

        setMax(APWebChromeClient aPWebChromeClient, Function0 function0) {
            this.getMax = aPWebChromeClient;
            this.getMin = function0;
        }

        public final void getMax() {
            Function0 function0 = this.getMin;
            if (function0 != null) {
                function0.invoke();
            }
            this.getMax.dispose();
        }
    }

    /* access modifiers changed from: private */
    public final String getSubclassPath() {
        Class<? extends U> asSubclass = getClass().asSubclass(getClass());
        Intrinsics.checkNotNullExpressionValue(asSubclass, "this.javaClass.asSubclass(this.javaClass)");
        String name = asSubclass.getName();
        return name == null ? "Unknown" : name;
    }

    public static /* synthetic */ void executeInBackground$default(APWebChromeClient aPWebChromeClient, Object obj, Function1 function1, Function1 function12, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 4) != 0) {
                function12 = APWebChromeClient$FastBitmap$CoordinateSystem.INSTANCE;
            }
            aPWebChromeClient.executeInBackground(obj, function1, function12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeInBackground");
    }

    @JvmOverloads
    public final void executeInBackground(Params params, @NotNull Function1<? super T, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "onSuccess");
        Intrinsics.checkNotNullParameter(function12, "onError");
        executeInBackground(params, function1, function12, (Function0<Unit>) null, hashCode.getMax);
    }

    public static /* synthetic */ void executeInBackground$default(APWebChromeClient aPWebChromeClient, Object obj, Function1 function1, Function1 function12, Function0 function0, removeStateDidChangeHandler removestatedidchangehandler, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 4) != 0) {
                function12 = toDoubleRange.INSTANCE;
            }
            Function1 function13 = function12;
            if ((i & 8) != 0) {
                function0 = values.INSTANCE;
            }
            Function0 function02 = function0;
            if ((i & 16) != 0) {
                removestatedidchangehandler = invoke.setMin;
            }
            aPWebChromeClient.executeInBackground(obj, function1, function13, function02, removestatedidchangehandler);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeInBackground");
    }

    public final void executeInBackground(Params params, @NotNull Function1<? super T, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @Nullable Function0<Unit> function0, @NotNull removeStateDidChangeHandler removestatedidchangehandler) {
        Intrinsics.checkNotNullParameter(function1, "onSuccess");
        Intrinsics.checkNotNullParameter(function12, "onError");
        Intrinsics.checkNotNullParameter(removestatedidchangehandler, "onDispose");
        this.disposable.getMin(buildUseCase(params).subscribeOn(this.jobScheduler).doOnDispose(removestatedidchangehandler).subscribe(new APWebChromeClient$Grayscale$Algorithm(function1), new APWebChromeClient$Mean$Arithmetic(this, function12), new invokeSuspend(this, function0)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "Params", "run"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend implements removeStateDidChangeHandler {
        final /* synthetic */ Function0 getMin;
        final /* synthetic */ APWebChromeClient setMax;

        invokeSuspend(APWebChromeClient aPWebChromeClient, Function0 function0) {
            this.setMax = aPWebChromeClient;
            this.getMin = function0;
        }

        public final void getMax() {
            Function0 function0 = this.getMin;
            if (function0 != null) {
                function0.invoke();
            }
            this.setMax.dispose();
        }
    }

    public final void dispose() {
        this.disposable.getMax();
    }
}
