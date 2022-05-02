package o;

import id.dana.data.Network;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/data/user/UserProfileEntityRepository;", "Lid/dana/domain/user/repository/UserProfileRepository;", "networkEntityData", "Lid/dana/data/user/source/UserProfileEntityData;", "(Lid/dana/data/user/source/UserProfileEntityData;)V", "changeUsername", "Lkotlinx/coroutines/flow/Flow;", "Lid/dana/domain/user/UserProfileResponse;", "username", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ResourcePerceptionRequestPoint implements onDescriptorRead {
    private final ResourceReceivedResponsePoint networkEntityData;

    @Inject
    public ResourcePerceptionRequestPoint(@NotNull @Network ResourceReceivedResponsePoint resourceReceivedResponsePoint) {
        Intrinsics.checkNotNullParameter(resourceReceivedResponsePoint, "networkEntityData");
        this.networkEntityData = resourceReceivedResponsePoint;
    }

    @NotNull
    public final onWebsocketHandshakeSentAsClient<disconnectAllDevices> changeUsername(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.USERNAME_KEY);
        return new length(this.networkEntityData.changeUsername(str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1"}, k = 1, mv = {1, 4, 2})
    public static final class length implements onWebsocketHandshakeSentAsClient<disconnectAllDevices> {
        final /* synthetic */ onWebsocketHandshakeSentAsClient $this_unsafeTransform$inlined;

        public length(onWebsocketHandshakeSentAsClient onwebsockethandshakesentasclient) {
            this.$this_unsafeTransform$inlined = onwebsockethandshakesentasclient;
        }

        @Nullable
        public final Object collect(@NotNull final onWebsocketPong onwebsocketpong, @NotNull Continuation continuation) {
            Object collect = this.$this_unsafeTransform$inlined.collect(new onWebsocketPong<getSubType>() {
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    Object emit = onwebsocketpong.emit(((getSubType) obj).toUserProfileResponse(), continuation);
                    return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
                }
            }, continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }
}
