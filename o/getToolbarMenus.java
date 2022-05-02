package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/auth/face/interactor/ConsultFaceAuthPopUp;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/auth/face/result/FaceAuthPopUpConsultationResult;", "Lid/dana/domain/auth/face/interactor/ConsultFaceAuthPopUp$Params;", "repository", "Lid/dana/domain/auth/face/repository/FaceAuthPopUpConsultationRepository;", "(Lid/dana/domain/auth/face/repository/FaceAuthPopUpConsultationRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getToolbarMenus extends APWebChromeClient<updateLoadingInfo, getMin> {
    private final success repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getToolbarMenus(@NotNull success success) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(success, "repository");
        this.repository = success;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<updateLoadingInfo> buildUseCase(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        return this.repository.consultFaceAuthPopUpToBackend(getmin.getParallelMode$domain_release(), getmin.getWithKycStatus$domain_release());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/auth/face/interactor/ConsultFaceAuthPopUp$Params;", "", "parallelMode", "", "withKycStatus", "(ZZ)V", "getParallelMode$domain_release", "()Z", "getWithKycStatus$domain_release", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private final boolean parallelMode;
        private final boolean withKycStatus;

        public getMin(boolean z, boolean z2) {
            this.parallelMode = z;
            this.withKycStatus = z2;
        }

        public final boolean getParallelMode$domain_release() {
            return this.parallelMode;
        }

        public final boolean getWithKycStatus$domain_release() {
            return this.withKycStatus;
        }
    }
}
