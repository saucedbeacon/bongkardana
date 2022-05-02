package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H$J/\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0001\u0010\u0012*\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00120\u0015H@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J=\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0001\u0010\u0012*\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00120\u0015H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u0014\u0010\b\u001a\u00028\u00008DX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lid/dana/data/social/core/BaseNetwork;", "T", "", "context", "Landroid/content/Context;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "(Landroid/content/Context;Lid/dana/data/rpc/RpcConnector;)V", "castedFacade", "getCastedFacade", "()Ljava/lang/Object;", "getContext", "()Landroid/content/Context;", "getRpcConnector", "()Lid/dana/data/rpc/RpcConnector;", "getFacadeClass", "Ljava/lang/Class;", "wrapper", "S", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "facadeProcessor", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exceptionParser", "Lid/dana/data/base/ExceptionParser;", "processFacade", "(Lid/dana/data/base/ExceptionParser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class setPermissionModel<T> {
    @NotNull
    private final Context context;
    @NotNull
    private final setIsUrgentResource rpcConnector;

    /* access modifiers changed from: protected */
    @NotNull
    public abstract Class<T> getFacadeClass();

    public setPermissionModel(@NotNull Context context2, @NotNull setIsUrgentResource setisurgentresource) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        this.context = context2;
        this.rpcConnector = setisurgentresource;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final setIsUrgentResource getRpcConnector() {
        return this.rpcConnector;
    }

    public final T getCastedFacade() {
        return this.rpcConnector.getFacade(getFacadeClass());
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final <S extends BaseRpcResult> Object wrapper(@NotNull Function1<? super T, ? extends S> function1, @NotNull Continuation<? super S> continuation) {
        return wrapper(new removeAllAnimatorListeners(), function1, continuation);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final <S extends BaseRpcResult> Object wrapper(@NotNull removeAllAnimatorListeners<BaseRpcResult> removeallanimatorlisteners, @NotNull Function1<? super T, ? extends S> function1, @NotNull Continuation<? super S> continuation) {
        removeallanimatorlisteners.setContext(this.context);
        removeallanimatorlisteners.setOperationType(setTimeout.getOperationType(getFacadeClass()));
        return function1.invoke(getCastedFacade());
    }
}
