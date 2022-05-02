package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import o.GriverSecurity;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lid/dana/domain/nearbyme/interactor/merchantreview/SaveDismissedMerchantReviewForm;", "Lid/dana/domain/social/core/SingleUseCase;", "", "", "merchantReviewFormRepository", "Lid/dana/domain/nearbyme/MerchantReviewFormRepository;", "(Lid/dana/domain/nearbyme/MerchantReviewFormRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "shopId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class CommonUtils extends buildModelMapWithLock<String, Boolean> {
    private final GriverSecurity.AnonymousClass1 merchantReviewFormRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public CommonUtils(@NotNull GriverSecurity.AnonymousClass1 r3) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(r3, "merchantReviewFormRepository");
        this.merchantReviewFormRepository = r3;
    }

    @Nullable
    public final Object buildUseCase(@NotNull String str, @NotNull Continuation<? super forThisDevice<Boolean>> continuation) {
        return new forThisDevice.setMax(Boxing.boxBoolean(this.merchantReviewFormRepository.saveDismissedMerchantReview(str)));
    }
}
