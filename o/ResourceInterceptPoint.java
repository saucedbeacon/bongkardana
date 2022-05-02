package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0014¨\u0006\u0012"}, d2 = {"Lid/dana/data/user/source/NetworkUserProfileEntityData;", "Lid/dana/data/social/core/SecureBaseNetwork;", "Lid/dana/data/user/source/network/UserProfileService;", "Lid/dana/data/user/source/UserProfileEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "changeUsername", "Lkotlinx/coroutines/flow/Flow;", "Lid/dana/data/user/source/network/result/UpdateUserInfoResult;", "username", "", "getFacadeClass", "Ljava/lang/Class;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ResourceInterceptPoint extends getLocalPermissionDialog<setMainUrl> implements ResourceReceivedResponsePoint {
    public static final /* synthetic */ setMainUrl access$getCastedFacade$p(ResourceInterceptPoint resourceInterceptPoint) {
        return (setMainUrl) resourceInterceptPoint.getCastedFacade();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ResourceInterceptPoint(@NotNull setIsUrgentResource setisurgentresource, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(onappresume, context, setisurgentresource);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final Class<setMainUrl> getFacadeClass() {
        return setMainUrl.class;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lid/dana/data/user/source/network/result/UpdateUserInfoResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.user.source.NetworkUserProfileEntityData$changeUsername$1", f = "NetworkUserProfileEntityData.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    static final class getMin extends SuspendLambda implements Function2<onWebsocketPong<? super getSubType>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $username;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ResourceInterceptPoint this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(ResourceInterceptPoint resourceInterceptPoint, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = resourceInterceptPoint;
            this.$username = str;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            getMin getmin = new getMin(this.this$0, this.$username, continuation);
            getmin.L$0 = obj;
            return getmin;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((getMin) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                getSubType updateUserInfo = ResourceInterceptPoint.access$getCastedFacade$p(this.this$0).updateUserInfo(new getMainUrl(getMainUrl.USERNAME, this.$username));
                this.label = 1;
                if (((onWebsocketPong) this.L$0).emit(updateUserInfo, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final onWebsocketHandshakeSentAsClient<getSubType> changeUsername(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.USERNAME_KEY);
        return new createWebSocket<>(new getMin(this, str, (Continuation) null));
    }
}
