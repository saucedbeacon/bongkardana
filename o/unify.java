package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\nH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J2\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\nH\u0016J<\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\nH\u0016J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\nH\u0016¨\u0006\u001b"}, d2 = {"Lid/dana/data/electronicmoney/mock/MockElectronicmoneyEntityData;", "Lid/dana/data/electronicmoney/ElectronicmoneyData;", "()V", "confirmUpdateBalanceEmoney", "Lio/reactivex/Observable;", "Lid/dana/domain/electronicmoney/model/response/ElectronicMoneyBaseResult;", "cardType", "", "cardProvider", "data", "", "doBrizziManualReversal", "brizziReversalInfo", "Lid/dana/domain/electronicmoney/model/request/BrizziReversalInfo;", "generateEmoneyTransId", "Lid/dana/data/electronicmoney/network/response/ElectronicMoneyGetBizIdResponse;", "getBrizziAccessToken", "Lid/dana/data/electronicmoney/network/response/BrizziGetAccessTokenResponse;", "getBrizziInitialData", "getBrizziReffNumber", "brizziGetAccessTokenResponse", "getReversalEmoney", "Lid/dana/data/electronicmoney/network/response/EmoneyReversalResponse;", "getTopUpCommandEmoney", "Lid/dana/data/electronicmoney/network/response/EmoneyCardInfoResponse;", "state", "inquireBalance", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class unify implements ParamImpl {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lid/dana/data/electronicmoney/network/response/BrizziGetAccessTokenResponse;", "p1", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class length extends FunctionReferenceImpl implements Function1<getAnimResId, TitleBarRightButtonView.AnonymousClass1<getAnimResId>> {
        length(unify unify) {
            super(1, unify, unify.class, "getBrizziReffNumber", "getBrizziReffNumber(Lid/dana/data/electronicmoney/network/response/BrizziGetAccessTokenResponse;)Lio/reactivex/Observable;", 0);
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<getAnimResId> invoke(@NotNull getAnimResId getanimresid) {
            Intrinsics.checkNotNullParameter(getanimresid, "p1");
            return unify.getMax(getanimresid);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setUseWideViewPort> setMax(@NotNull getTextSize gettextsize) {
        Intrinsics.checkNotNullParameter(gettextsize, "brizziReversalInfo");
        setUseWideViewPort setusewideviewport = new setUseWideViewPort(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        setusewideviewport.setSuccess(true);
        setusewideviewport.setErrorCode("errorCode");
        setusewideviewport.setErrorMessage("errorMessage");
        TitleBarRightButtonView.AnonymousClass1<setUseWideViewPort> just = TitleBarRightButtonView.AnonymousClass1.just(setusewideviewport);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(Electron…\"errorMessage\"\n        })");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<StartAction> setMin() {
        TitleBarRightButtonView.AnonymousClass1<StartAction> just = TitleBarRightButtonView.AnonymousClass1.just(new StartAction(""));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(Electron…oneyGetBizIdResponse(\"\"))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<needWaitIpc> length(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "data");
        StartClientBundle startClientBundle = r1;
        StartClientBundle startClientBundle2 = new StartClientBundle("", "", "", "", "", "", "", "", "", "", "", "", "", "");
        TitleBarRightButtonView.AnonymousClass1<needWaitIpc> just = TitleBarRightButtonView.AnonymousClass1.just(new needWaitIpc(startClientBundle));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …\"\", \"\", \"\", \"\", \"\", \"\")))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setAppLaunchParams> getMax(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "cardType");
        Intrinsics.checkNotNullParameter(str2, "cardProvider");
        Intrinsics.checkNotNullParameter(map, "data");
        TitleBarRightButtonView.AnonymousClass1<setAppLaunchParams> just = TitleBarRightButtonView.AnonymousClass1.just(new setAppLaunchParams(new LinkedHashMap()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(EmoneyRe…Response(mutableMapOf()))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<needWaitIpc> setMax(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "cardType");
        Intrinsics.checkNotNullParameter(str2, "cardProvider");
        Intrinsics.checkNotNullParameter(map, "data");
        StartClientBundle startClientBundle = r1;
        StartClientBundle startClientBundle2 = new StartClientBundle("", "", "", "", "", "", "", "", "", "", "", "", "", "");
        TitleBarRightButtonView.AnonymousClass1<needWaitIpc> just = TitleBarRightButtonView.AnonymousClass1.just(new needWaitIpc(startClientBundle));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …\"\", \"\", \"\", \"\", \"\", \"\")))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setUseWideViewPort> setMax(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "cardType");
        Intrinsics.checkNotNullParameter(str2, "cardProvider");
        Intrinsics.checkNotNullParameter(map, "data");
        TitleBarRightButtonView.AnonymousClass1<setUseWideViewPort> just = TitleBarRightButtonView.AnonymousClass1.just(new setUseWideViewPort(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(ElectronicMoneyBaseResult())");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getAnimResId> getMin() {
        TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just(new getAnimResId("accessToken", "tokenType", "accessTokenExpireTime", "scope", "consumerSecret", setBuildNumber.USERNAME_KEY));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(BrizziGe…    \"username\"\n        ))");
        TitleBarRightButtonView.AnonymousClass1<getAnimResId> flatMap = just.flatMap(new transparentBackground(new length(this)));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getBrizziAccessToken().f…his::getBrizziReffNumber)");
        return flatMap;
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 getMax(getAnimResId getanimresid) {
        getanimresid.setReffNumber("reffNumber");
        TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just(getanimresid);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(brizziGe…= \"reffNumber\"\n        })");
        return just;
    }
}
