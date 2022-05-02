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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lid/dana/domain/featureconfig/interactor/GetSplashAnimationConfig;", "Lid/dana/domain/social/core/SingleUseCase;", "Lid/dana/domain/core/usecase/NoParams;", "Lid/dana/domain/featureconfig/model/SplashAnimationConfig;", "featureConfigRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "(Lid/dana/domain/featureconfig/FeatureConfigRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lid/dana/domain/core/usecase/NoParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class pageDown extends buildModelMapWithLock<onReceivedIcon, onLoadResource> {
    private final setDefaultFontSize featureConfigRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public pageDown(@NotNull setDefaultFontSize setdefaultfontsize) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setdefaultfontsize, "featureConfigRepository");
        this.featureConfigRepository = setdefaultfontsize;
    }

    @Nullable
    public final Object buildUseCase(@NotNull onReceivedIcon onreceivedicon, @NotNull Continuation<? super forThisDevice<onLoadResource>> continuation) {
        return new forThisDevice.setMax(this.featureConfigRepository.getSplashAnimationConfig());
    }
}
