package o;

import id.dana.domain.nearbyme.IoDispatcher;
import id.dana.domain.nearbyme.MainDispatcher;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lid/dana/domain/social/SetDeviceFeedFeatureSwitch;", "Lid/dana/domain/social/core/SingleUseCase;", "", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "socialSyncRepository", "Lid/dana/domain/social/SocialSyncRepository;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lid/dana/domain/social/SocialSyncRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "param", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class DistanceCalculator extends buildModelMapWithLock<Boolean, Boolean> {
    private final getRequestedModel socialSyncRepository;

    public final /* synthetic */ Object buildUseCase(Object obj, Continuation continuation) {
        return buildUseCase(((Boolean) obj).booleanValue(), (Continuation<? super forThisDevice<Boolean>>) continuation);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public DistanceCalculator(@NotNull @IoDispatcher APExpansion.AnonymousClass1 r2, @NotNull @MainDispatcher APExpansion.AnonymousClass1 r3, @NotNull getRequestedModel getrequestedmodel) {
        super(r2, r3);
        Intrinsics.checkNotNullParameter(r2, "ioDispatcher");
        Intrinsics.checkNotNullParameter(r3, "mainDispatcher");
        Intrinsics.checkNotNullParameter(getrequestedmodel, "socialSyncRepository");
        this.socialSyncRepository = getrequestedmodel;
    }

    @Nullable
    public final Object buildUseCase(boolean z, @NotNull Continuation<? super forThisDevice<Boolean>> continuation) {
        this.socialSyncRepository.setDeviceFeedFeatureSwitch(z);
        return new forThisDevice.setMax(Boxing.boxBoolean(z));
    }
}
