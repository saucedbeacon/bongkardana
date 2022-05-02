package o;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import o.APExpansion;
import o.decodeHandshake;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J!\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00170\u00162\u0006\u0010\u0018\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0019Jd\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00028\u00002#\b\u0002\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00130\u001c2'\b\u0002\u0010 \u001a!\u0012\u0017\u0012\u00150!j\u0002`\"¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00130\u001cH\u0002¢\u0006\u0002\u0010$R\u0012\u0010\b\u001a\u00020\tX\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lid/dana/domain/core/usecase/FlowUseCase;", "P", "R", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "supervisorJob", "Lkotlinx/coroutines/CompletableJob;", "getSupervisorJob", "()Lkotlinx/coroutines/CompletableJob;", "setSupervisorJob", "(Lkotlinx/coroutines/CompletableJob;)V", "cancelChildren", "", "dispose", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lid/dana/domain/social/Result;", "params", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "invoke", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "onError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "domain_release"}, k = 1, mv = {1, 4, 2})
public abstract class onHideCustomView<P, R> implements initToken {
    private final /* synthetic */ initToken $$delegate_0;
    /* access modifiers changed from: private */
    public final APExpansion.AnonymousClass1 coroutineDispatcher;
    @NotNull
    private getAD102 supervisorJob = new readMore((DictionaryKeys) null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0000\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "P", "R", "", "it", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<R, Unit> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        public final void invoke(@NotNull R r) {
            Intrinsics.checkNotNullParameter(r, "it");
        }
    }

    @NotNull
    public abstract onWebsocketHandshakeSentAsClient<forThisDevice<R>> execute(P p);

    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @JvmOverloads
    public final void invoke(P p) {
        invoke$default(this, p, (Function1) null, (Function1) null, 6, (Object) null);
    }

    @JvmOverloads
    public final void invoke(P p, @NotNull Function1<? super R, Unit> function1) {
        invoke$default(this, p, function1, (Function1) null, 4, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0000\"\b\b\u0001\u0010\u0003*\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "P", "R", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Exception, Unit> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(1);
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }
    }

    public onHideCustomView(@NotNull APExpansion.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "coroutineDispatcher");
        this.$$delegate_0 = setConfiguration.length(r2);
        this.coroutineDispatcher = r2;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public getAD102 getSupervisorJob() {
        return this.supervisorJob;
    }

    /* access modifiers changed from: protected */
    public void setSupervisorJob(@NotNull getAD102 getad102) {
        Intrinsics.checkNotNullParameter(getad102, "<set-?>");
        this.supervisorJob = getad102;
    }

    public static /* synthetic */ void invoke$default(onHideCustomView onhidecustomview, Object obj, Function1 function1, Function1 function12, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                function1 = setMax.INSTANCE;
            }
            if ((i & 4) != 0) {
                function12 = getMax.INSTANCE;
            }
            onhidecustomview.invoke(obj, function1, function12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ Function1 $onError$inlined;
        final /* synthetic */ onHideCustomView this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0000\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "P", "R", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "id/dana/domain/core/usecase/FlowUseCase$invoke$handler$1$1"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "id.dana.domain.core.usecase.FlowUseCase$invoke$handler$1$1", f = "FlowUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class setMax extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
            final /* synthetic */ Throwable $throwable;
            int label;
            final /* synthetic */ setMin this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMax(Throwable th, Continuation continuation, setMin setmin) {
                super(2, continuation);
                this.$throwable = th;
                this.this$0 = setmin;
            }

            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                Intrinsics.checkNotNullParameter(continuation, "completion");
                return new setMax(this.$throwable, continuation, this.this$0);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((setMax) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.$onError$inlined.invoke(new Exception(this.$throwable));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMin(CoroutineContext.Key key, onHideCustomView onhidecustomview, Function1 function1) {
            super(key);
            this.this$0 = onhidecustomview;
            this.$onError$inlined = function1;
        }

        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
            onHideCustomView onhidecustomview = this.this$0;
            xp4.getMin(onhidecustomview, onhidecustomview.coroutineDispatcher, (CoroutineStart) null, new setMax(th, (Continuation) null, this), 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0000\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "P", "R", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.core.usecase.FlowUseCase$invoke$3", f = "FlowUseCase.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class length extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ Object $params;
        int label;
        final /* synthetic */ onHideCustomView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(onHideCustomView onhidecustomview, Object obj, Function1 function1, Function1 function12, Continuation continuation) {
            super(2, continuation);
            this.this$0 = onhidecustomview;
            this.$params = obj;
            this.$onSuccess = function1;
            this.$onError = function12;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            return new length(this.this$0, this.$params, this.$onSuccess, this.$onError, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((length) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                onWebsocketHandshakeSentAsClient getmin = new decodeHandshake.getMin(this.this$0.execute(this.$params), new Function3<onWebsocketPong<? super forThisDevice<? extends R>>, Throwable, Continuation<? super Unit>, Object>((Continuation) null) {
                    private /* synthetic */ Object L$0;
                    private /* synthetic */ Object L$1;
                    int label;

                    @NotNull
                    public final Continuation<Unit> create(@NotNull onWebsocketPong<? super forThisDevice<? extends R>> onwebsocketpong, @NotNull Throwable th, @NotNull Continuation<? super Unit> continuation) {
                        Intrinsics.checkNotNullParameter(onwebsocketpong, "$this$create");
                        Intrinsics.checkNotNullParameter(th, "e");
                        Intrinsics.checkNotNullParameter(continuation, "continuation");
                        AnonymousClass2 r0 = 

                        public final void dispose() {
                            getSupervisorJob().getMin((CancellationException) null);
                        }

                        public final void cancelChildren() {
                            RDSClient.setMin(getSupervisorJob());
                        }

                        @JvmOverloads
                        public final void invoke(P p, @NotNull Function1<? super R, Unit> function1, @NotNull Function1<? super Exception, Unit> function12) {
                            Intrinsics.checkNotNullParameter(function1, "onSuccess");
                            Intrinsics.checkNotNullParameter(function12, "onError");
                            xp4.getMin(this, new setMin(CoroutineExceptionHandler.setMax, this, function12).plus(getSupervisorJob()), (CoroutineStart) null, new length(this, p, function1, function12, (Continuation) null), 2);
                        }
                    }
