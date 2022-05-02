package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J'\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00030\u00030\n2\u0006\u0010\f\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lid/dana/domain/user/interactor/CheckUsername;", "Lid/dana/domain/social/core/SingleUseCase;", "", "Lid/dana/domain/user/UserProfileResponse;", "userRepository", "Lid/dana/domain/user/repository/UserRepository;", "(Lid/dana/domain/user/repository/UserRepository;)V", "getUserRepository", "()Lid/dana/domain/user/repository/UserRepository;", "buildUseCase", "Lid/dana/domain/social/Result$Success;", "kotlin.jvm.PlatformType", "params", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class closeAll extends buildModelMapWithLock<String, disconnectAllDevices> {
    @NotNull
    private final onDescriptorWrite userRepository;

    @NotNull
    public final onDescriptorWrite getUserRepository() {
        return this.userRepository;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public closeAll(@NotNull onDescriptorWrite ondescriptorwrite) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(ondescriptorwrite, "userRepository");
        this.userRepository = ondescriptorwrite;
    }

    @Nullable
    public final Object buildUseCase(@NotNull String str, @NotNull Continuation<? super forThisDevice.setMax<disconnectAllDevices>> continuation) {
        return new forThisDevice.setMax(this.userRepository.checkUsername(str).blockingFirst());
    }
}
