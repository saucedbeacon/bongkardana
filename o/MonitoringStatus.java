package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lid/dana/domain/social/interactor/GetShareFeedConsent;", "Lid/dana/domain/social/core/SingleUseCase;", "", "", "socialPrivacyRepository", "Lid/dana/domain/social/SocialPrivacyRepository;", "(Lid/dana/domain/social/SocialPrivacyRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class MonitoringStatus extends buildModelMapWithLock<Unit, Boolean> {
    private final getResponseString socialPrivacyRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public MonitoringStatus(@NotNull getResponseString getresponsestring) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getresponsestring, "socialPrivacyRepository");
        this.socialPrivacyRepository = getresponsestring;
    }

    @Nullable
    public final Object buildUseCase(@NotNull Unit unit, @NotNull Continuation<? super forThisDevice<Boolean>> continuation) {
        return new forThisDevice.setMax(Boxing.boxBoolean(this.socialPrivacyRepository.getShareFeedConsent()));
    }
}
