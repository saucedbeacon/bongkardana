package o;

import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J4\u0010\u0007\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00020\u0002 \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\b0\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/services/interactor/GetService;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "", "repository", "Lid/dana/domain/services/ServicesRepository;", "(Lid/dana/domain/services/ServicesRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class RangeNotifier extends APWebChromeClient<ThirdPartyServiceResponse, String> {
    private final toUuidString repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public RangeNotifier(@NotNull toUuidString touuidstring) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(touuidstring, "repository");
        this.repository = touuidstring;
    }

    public final TitleBarRightButtonView.AnonymousClass1<ThirdPartyServiceResponse> buildUseCase(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "params");
        return this.repository.getServiceByKey(str);
    }
}
