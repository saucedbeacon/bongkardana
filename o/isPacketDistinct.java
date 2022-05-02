package o;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\r\u001a\u00020\u0006H&J*\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f0\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H&J*\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f0\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H&J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0015\u001a\u00020\u0006H&J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00170\u00032\u0006\u0010\u0018\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lid/dana/domain/twilio/TwilioSdkRepository;", "", "checkEnrollmentStatus", "Lio/reactivex/Single;", "", "createFactor", "", "serviceSid", "identity", "pushToken", "accessToken", "deleteLocalFactor", "getChallenge", "challengeSid", "getChallengeDetails", "", "factorSid", "getChallengeHiddenDetails", "updateChallenge", "newStatus", "updatePushToken", "token", "verifyFactor", "", "sid", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface isPacketDistinct {
    @NotNull
    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> checkEnrollmentStatus();

    @NotNull
    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<String> createFactor(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    @NotNull
    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> deleteLocalFactor();

    @NotNull
    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<String> getChallenge(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Map<String, String>> getChallengeDetails(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Map<String, String>> getChallengeHiddenDetails(@NotNull String str, @NotNull String str2);

    @NotNull
    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> updateChallenge(@NotNull String str, @NotNull String str2, @NotNull String str3);

    @NotNull
    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> updatePushToken(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<List<String>> verifyFactor(@NotNull String str);
}
