package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/kycamledd/interactor/SubmitEddAmlKyc;", "Lid/dana/domain/UseCase;", "", "Lid/dana/domain/kycamledd/interactor/SubmitEddAmlKyc$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "kycAmlEddRepository", "Lid/dana/domain/kycamledd/KycAmlEddRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/kycamledd/KycAmlEddRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverRVEnvironmentServiceImpl extends parseFailed<Boolean, getMin> {
    private final getAlwaysShowDiagnosticTool kycAmlEddRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public GriverRVEnvironmentServiceImpl(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull getAlwaysShowDiagnosticTool getalwaysshowdiagnostictool) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(getalwaysshowdiagnostictool, "kycAmlEddRepository");
        this.kycAmlEddRepository = getalwaysshowdiagnostictool;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        return this.kycAmlEddRepository.submitEddAmlKyc(getmin.getEddSubmitInfo());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/domain/kycamledd/interactor/SubmitEddAmlKyc$Params;", "", "eddSubmitInfo", "Lid/dana/domain/kycamledd/model/EddSubmitInfo;", "(Lid/dana/domain/kycamledd/model/EddSubmitInfo;)V", "getEddSubmitInfo", "()Lid/dana/domain/kycamledd/model/EddSubmitInfo;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        private final runTask eddSubmitInfo;

        public getMin(@NotNull runTask runtask) {
            Intrinsics.checkNotNullParameter(runtask, "eddSubmitInfo");
            this.eddSubmitInfo = runtask;
        }

        @NotNull
        public final runTask getEddSubmitInfo() {
            return this.eddSubmitInfo;
        }
    }
}
