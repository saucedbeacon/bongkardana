package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/auth/face/interactor/SwitchFaceAuthentication;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/auth/face/result/FaceAuthenticationResult;", "Lid/dana/domain/auth/face/interactor/SwitchFaceAuthentication$Params;", "faceAuthenticationRepository", "Lid/dana/domain/auth/face/repository/FaceAuthenticationRepository;", "(Lid/dana/domain/auth/face/repository/FaceAuthenticationRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverShareSchemeExtension extends APWebChromeClient<GVTitleBar, getMin> {
    private final GriverSplashFragmentExtension faceAuthenticationRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public GriverShareSchemeExtension(@NotNull GriverSplashFragmentExtension griverSplashFragmentExtension) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverSplashFragmentExtension, "faceAuthenticationRepository");
        this.faceAuthenticationRepository = griverSplashFragmentExtension;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<GVTitleBar> buildUseCase(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "params");
        return this.faceAuthenticationRepository.m1111switch(getmin.getFaceAuthNew$domain_release(), getmin.getSecurityId$domain_release());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lid/dana/domain/auth/face/interactor/SwitchFaceAuthentication$Params;", "", "faceAuthNew", "", "securityId", "", "(ZLjava/lang/String;)V", "getFaceAuthNew$domain_release", "()Z", "getSecurityId$domain_release", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private final boolean faceAuthNew;
        @Nullable
        private final String securityId;

        public getMin(boolean z, @Nullable String str) {
            this.faceAuthNew = z;
            this.securityId = str;
        }

        public final boolean getFaceAuthNew$domain_release() {
            return this.faceAuthNew;
        }

        @Nullable
        public final String getSecurityId$domain_release() {
            return this.securityId;
        }
    }
}
