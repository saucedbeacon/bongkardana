package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toFaceAuthPopUpConsultationResult", "Lid/dana/domain/auth/face/result/FaceAuthPopUpConsultationResult;", "Lid/dana/domain/user/UserInfoResponse;", "isFaceLoginFeatureEnabled", "", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class populateIcon {
    @Nullable
    public static final updateLoadingInfo toFaceAuthPopUpConsultationResult(@Nullable disconnect disconnect, boolean z) {
        if (disconnect == null) {
            return null;
        }
        return new updateLoadingInfo(z, disconnect.isFaceLoginEnabled(), disconnect.getHasFaceLoginEnrolled(), disconnect.isFaceLoginReady(), disconnect.getKycInfo() != null && (Intrinsics.areEqual((Object) disconnect.getKycInfo(), (Object) "KYC0") ^ true));
    }
}
