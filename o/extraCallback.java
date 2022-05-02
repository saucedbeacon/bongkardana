package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.extraCallbackWithResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "id.dana.lib.electronicmoney.mandiri.MandiriEntityRepository$update$1$1$1", f = "MandiriEntityRepository.kt", i = {0}, l = {32}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class extraCallback extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public initToken f10815a;
    public Object b;
    public Object c;
    public int d;
    public final /* synthetic */ extraCallbackWithResult.setMin.getMax e;
    public final /* synthetic */ asInterface f;
    public final /* synthetic */ hideTitleLoading g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public extraCallback(extraCallbackWithResult.setMin.getMax getmax, asInterface asinterface, hideTitleLoading hidetitleloading, Continuation continuation) {
        super(2, continuation);
        this.e = getmax;
        this.f = asinterface;
        this.g = hidetitleloading;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        extraCallback extracallback = new extraCallback(this.e, this.f, this.g, continuation);
        extracallback.f10815a = (initToken) obj;
        return extracallback;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((extraCallback) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Function1 function1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            initToken inittoken = this.f10815a;
            Function1 function12 = this.e.f10817a.f;
            asInterface asinterface = this.f;
            hideTitleLoading hidetitleloading = this.g;
            this.b = inittoken;
            this.c = function12;
            this.d = 1;
            obj = asinterface.getMax(hidetitleloading, 0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            function1 = function12;
        } else if (i == 1) {
            function1 = (Function1) this.c;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function1.invoke(obj);
        return Unit.INSTANCE;
    }
}
