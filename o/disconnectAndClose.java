package o;

import id.dana.domain.nearbyme.DefaultDispatcher;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/domain/user/interactor/ChangeUsername;", "Lid/dana/domain/core/usecase/FlowUseCase;", "", "Lid/dana/domain/user/UserProfileResponse;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "repository", "Lid/dana/domain/user/repository/UserProfileRepository;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lid/dana/domain/user/repository/UserProfileRepository;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lid/dana/domain/social/Result$Success;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class disconnectAndClose extends onHideCustomView<String, disconnectAllDevices> {
    private final onDescriptorRead repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public disconnectAndClose(@NotNull @DefaultDispatcher APExpansion.AnonymousClass1 r2, @NotNull onDescriptorRead ondescriptorread) {
        super(r2);
        Intrinsics.checkNotNullParameter(r2, "dispatcher");
        Intrinsics.checkNotNullParameter(ondescriptorread, "repository");
        this.repository = ondescriptorread;
    }

    @NotNull
    public final onWebsocketHandshakeSentAsClient<forThisDevice.setMax<disconnectAllDevices>> execute(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "params");
        return new setMin(this.repository.changeUsername(str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements onWebsocketHandshakeSentAsClient<forThisDevice.setMax<? extends disconnectAllDevices>> {
        final /* synthetic */ onWebsocketHandshakeSentAsClient $this_unsafeTransform$inlined;

        public setMin(onWebsocketHandshakeSentAsClient onwebsockethandshakesentasclient) {
            this.$this_unsafeTransform$inlined = onwebsockethandshakesentasclient;
        }

        @Nullable
        public final Object collect(@NotNull final onWebsocketPong onwebsocketpong, @NotNull Continuation continuation) {
            Object collect = this.$this_unsafeTransform$inlined.collect(new onWebsocketPong<disconnectAllDevices>() {
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    Object emit = onwebsocketpong.emit(new forThisDevice.setMax((disconnectAllDevices) obj), continuation);
                    return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
                }
            }, continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }
}
