package o;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import o.APExpansion;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B\u0019\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c2\u0006\u0010\u001d\u001a\u00028\u0000H¤@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020 J_\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00028\u00002!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020 0#2%\u0010'\u001a!\u0012\u0017\u0012\u00150(j\u0002`)¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020 0#H\u0004¢\u0006\u0002\u0010+R\u0012\u0010\t\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lid/dana/domain/social/core/BaseUseCase;", "T", "R", "", "Lkotlinx/coroutines/CoroutineScope;", "threadExecutor", "Lkotlinx/coroutines/CoroutineDispatcher;", "postThreadExecutor", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "onErrorDispatcher", "getOnErrorDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setOnErrorDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "onSuccessDispatcher", "getOnSuccessDispatcher", "setOnSuccessDispatcher", "supervisorJob", "Lkotlinx/coroutines/CompletableJob;", "getSupervisorJob", "()Lkotlinx/coroutines/CompletableJob;", "setSupervisorJob", "(Lkotlinx/coroutines/CompletableJob;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "", "invoke", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "onError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "domain_release"}, k = 1, mv = {1, 4, 2})
public abstract class ModelSpecificDistanceCalculator<T, R> implements initToken {
    private final /* synthetic */ initToken $$delegate_0;
    @NotNull
    private APExpansion.AnonymousClass1 onErrorDispatcher;
    @NotNull
    private APExpansion.AnonymousClass1 onSuccessDispatcher;
    @NotNull
    private getAD102 supervisorJob;

    public ModelSpecificDistanceCalculator() {
        this((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public abstract Object buildUseCase(T t, @NotNull Continuation<? super forThisDevice<? extends R>> continuation);

    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public ModelSpecificDistanceCalculator(@NotNull APExpansion.AnonymousClass1 r2, @NotNull APExpansion.AnonymousClass1 r3) {
        Intrinsics.checkNotNullParameter(r2, "threadExecutor");
        Intrinsics.checkNotNullParameter(r3, "postThreadExecutor");
        this.$$delegate_0 = setConfiguration.length(r2);
        this.onSuccessDispatcher = r3;
        this.onErrorDispatcher = r3;
        this.supervisorJob = new readMore((DictionaryKeys) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModelSpecificDistanceCalculator(APExpansion.AnonymousClass1 r1, APExpansion.AnonymousClass1 r2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DeviceTokenClient.setMax() : r1, (i & 2) != 0 ? DeviceTokenClient.length() : r2);
    }

    /* access modifiers changed from: protected */
    @NotNull
    public APExpansion.AnonymousClass1 getOnSuccessDispatcher() {
        return this.onSuccessDispatcher;
    }

    /* access modifiers changed from: protected */
    public void setOnSuccessDispatcher(@NotNull APExpansion.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.onSuccessDispatcher = r2;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public APExpansion.AnonymousClass1 getOnErrorDispatcher() {
        return this.onErrorDispatcher;
    }

    /* access modifiers changed from: protected */
    public void setOnErrorDispatcher(@NotNull APExpansion.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.onErrorDispatcher = r2;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class length extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ Function1 $onError$inlined;
        final /* synthetic */ ModelSpecificDistanceCalculator this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "id/dana/domain/social/core/BaseUseCase$invoke$handler$1$1"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "id.dana.domain.social.core.BaseUseCase$invoke$handler$1$1", f = "BaseUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class setMax extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
            final /* synthetic */ Throwable $throwable;
            int label;
            final /* synthetic */ length this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMax(Throwable th, Continuation continuation, length length) {
                super(2, continuation);
                this.$throwable = th;
                this.this$0 = length;
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
        public length(CoroutineContext.Key key, ModelSpecificDistanceCalculator modelSpecificDistanceCalculator, Function1 function1) {
            super(key);
            this.this$0 = modelSpecificDistanceCalculator;
            this.$onError$inlined = function1;
        }

        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
            ModelSpecificDistanceCalculator modelSpecificDistanceCalculator = this.this$0;
            xp4.getMin(modelSpecificDistanceCalculator, modelSpecificDistanceCalculator.getOnErrorDispatcher(), (CoroutineStart) null, new setMax(th, (Continuation) null, this), 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "R", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.core.BaseUseCase$invoke$1", f = "BaseUseCase.kt", i = {}, l = {42, 44, 50}, m = "invokeSuspend", n = {}, s = {})
    static final class setMax extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ Object $params;
        int label;
        final /* synthetic */ ModelSpecificDistanceCalculator this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(ModelSpecificDistanceCalculator modelSpecificDistanceCalculator, Object obj, Function1 function1, Function1 function12, Continuation continuation) {
            super(2, continuation);
            this.this$0 = modelSpecificDistanceCalculator;
            this.$params = obj;
            this.$onSuccess = function1;
            this.$onError = function12;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            return new setMax(this.this$0, this.$params, this.$onSuccess, this.$onError, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((setMax) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ModelSpecificDistanceCalculator modelSpecificDistanceCalculator = this.this$0;
                Object obj2 = this.$params;
                this.label = 1;
                obj = modelSpecificDistanceCalculator.buildUseCase(obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2 || i == 3) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final forThisDevice forthisdevice = (forThisDevice) obj;
            if (forthisdevice instanceof forThisDevice.setMax) {
                this.label = 2;
                if (xp4.length(this.this$0.getOnSuccessDispatcher(), new Function2<initToken, Continuation<? super Unit>, Object>(this, (Continuation) null) {
                    int label;
                    final /* synthetic */ setMax this$0;

                    {
                        this.this$0 = r1;
                    }

                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        Intrinsics.checkNotNullParameter(continuation, "completion");
                        return 

                        public final void dispose() {
                            RDSClient.setMin(getSupervisorJob());
                        }

                        /* access modifiers changed from: protected */
                        public final void invoke(T t, @NotNull Function1<? super R, Unit> function1, @NotNull Function1<? super Exception, Unit> function12) {
                            Intrinsics.checkNotNullParameter(function1, "onSuccess");
                            Intrinsics.checkNotNullParameter(function12, "onError");
                            xp4.getMin(this, new length(CoroutineExceptionHandler.setMax, this, function12).plus(getSupervisorJob()), (CoroutineStart) null, new setMax(this, t, function1, function12, (Continuation) null), 2);
                        }
                    }
