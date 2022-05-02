package o;

import id.dana.domain.model.rpc.response.LoginResponse;
import java.util.List;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/onboarding/boku/BokuVerifyContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface onSensorChanged {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lid/dana/onboarding/boku/BokuVerifyContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "verifyBokuLogin", "", "loginResponse", "Lid/dana/domain/model/rpc/response/LoginResponse;", "phoneNumber", "", "pin", "key", "loginScenario", "verifyBokuRegistration", "securityId", "userAccepted", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax extends parentColumns.setMin {
        void getMin(@NotNull LoginResponse loginResponse, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

        void setMax(@NotNull String str, @NotNull String str2, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/onboarding/boku/BokuVerifyContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onChallenged", "", "challengeMethod", "", "", "onFailedVerifyBoku", "scenario", "onSuccessVerifyBoku", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin extends parentColumns.getMax {
        void length(@NotNull String str);

        void setMax(@NotNull String str);

        void setMax(@NotNull List<String> list);
    }
}
