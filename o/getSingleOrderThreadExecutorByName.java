package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverExecutors;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/domain/kycrenewal/interactor/GetKycRenewal;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/kycrenewal/model/QueryKYCRenewalStatus;", "Lid/dana/domain/core/usecase/NoParams;", "kycRenewalRepository", "Lid/dana/domain/kycrenewal/KycRenewalRepository;", "(Lid/dana/domain/kycrenewal/KycRenewalRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getSingleOrderThreadExecutorByName extends APWebChromeClient<GriverExecutors.H5SingleThreadFactory, onReceivedIcon> {
    private final AbstractPriorityRunnable kycRenewalRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getSingleOrderThreadExecutorByName(@NotNull AbstractPriorityRunnable abstractPriorityRunnable) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(abstractPriorityRunnable, "kycRenewalRepository");
        this.kycRenewalRepository = abstractPriorityRunnable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<GriverExecutors.H5SingleThreadFactory> buildUseCase(@NotNull onReceivedIcon onreceivedicon) {
        Intrinsics.checkNotNullParameter(onreceivedicon, "params");
        return this.kycRenewalRepository.getKYCRenewalStatus();
    }
}
