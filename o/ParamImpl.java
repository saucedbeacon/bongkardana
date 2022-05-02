package o;

import java.util.Map;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H&J2\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH&J<\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH&J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lid/dana/data/electronicmoney/ElectronicmoneyData;", "", "confirmUpdateBalanceEmoney", "Lio/reactivex/Observable;", "Lid/dana/domain/electronicmoney/model/response/ElectronicMoneyBaseResult;", "cardType", "", "cardProvider", "data", "", "doBrizziManualReversal", "brizziReversalInfo", "Lid/dana/domain/electronicmoney/model/request/BrizziReversalInfo;", "generateEmoneyTransId", "Lid/dana/data/electronicmoney/network/response/ElectronicMoneyGetBizIdResponse;", "getBrizziInitialData", "Lid/dana/data/electronicmoney/network/response/BrizziGetAccessTokenResponse;", "getReversalEmoney", "Lid/dana/data/electronicmoney/network/response/EmoneyReversalResponse;", "getTopUpCommandEmoney", "Lid/dana/data/electronicmoney/network/response/EmoneyCardInfoResponse;", "state", "inquireBalance", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface ParamImpl {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<setAppLaunchParams> getMax(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getAnimResId> getMin();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<needWaitIpc> length(@NotNull Map<String, String> map);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<needWaitIpc> setMax(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull Map<String, String> map);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<setUseWideViewPort> setMax(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<setUseWideViewPort> setMax(@NotNull getTextSize gettextsize);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<StartAction> setMin();
}
