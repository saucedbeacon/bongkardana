package o;

import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/domain/bokuverification/BokuRepository;", "", "verifyBoku", "Lio/reactivex/Observable;", "", "securityId", "", "phoneNumber", "withMobileData", "trackerSource", "verifyOtpToRisk", "Lid/dana/domain/otp/model/VerifyOtpRiskResponse;", "otpValue", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface GriverBaseManifest {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> verifyBoku(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<filterBundle> verifyOtpToRisk(@NotNull String str, @NotNull String str2, @NotNull String str3);
}
