package o;

import id.dana.data.Source;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AppMsgReceiver;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ2\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010!\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0017H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0017H\u0016J\u001a\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020(0\u001d0\u0017H\u0016J2\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u001dH\u0016J<\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u001dH\u0016J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u001dH\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006/"}, d2 = {"Lid/dana/data/electronicmoney/ElectronicmoneyEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/electronicmoney/ElectronicmoneyRepository;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "securityGuardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "electronicmoneyEntityDataFactory", "Lid/dana/data/electronicmoney/ElectronicmoneyEntityDataFactory;", "configEntityDataFactory", "Lid/dana/data/config/source/ConfigEntityDataFactory;", "(Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;Lid/dana/data/electronicmoney/ElectronicmoneyEntityDataFactory;Lid/dana/data/config/source/ConfigEntityDataFactory;)V", "networkElectronicmoneyEntityData", "Lid/dana/data/electronicmoney/ElectronicmoneyData;", "getNetworkElectronicmoneyEntityData", "()Lid/dana/data/electronicmoney/ElectronicmoneyData;", "networkElectronicmoneyEntityData$delegate", "Lkotlin/Lazy;", "confirmUpdateBalanceEmoney", "Lio/reactivex/Observable;", "Lid/dana/domain/electronicmoney/model/response/ElectronicMoneyBaseResult;", "cardType", "", "cardProvider", "data", "", "createConfigSplitData", "Lid/dana/data/config/source/ConfigEntityData;", "doBrizziManualReversal", "brizziReversalInfo", "Lid/dana/domain/electronicmoney/model/request/BrizziReversalInfo;", "generateEmoneyTransId", "Lid/dana/domain/electronicmoney/model/response/EmoneyGenerateTransId;", "getBrizziAccessToken", "Lid/dana/domain/electronicmoney/model/response/BrizziAccessTokenInfo;", "getElectronicMoneyConfig", "Lid/dana/domain/electronicmoney/model/response/ElectronicMoneyConfig;", "getReversalEmoney", "Lid/dana/domain/electronicmoney/model/response/EmoneyReversal;", "getTopUpCommandEmoney", "Lid/dana/domain/electronicmoney/model/response/EmoneyCardInfo;", "state", "inquireBalance", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ParamUtils extends setMinProgress implements setAllowFileAccess {
    private final Lazy getMax = LazyKt.lazy(new toFloatRange(this));
    private onCallBack getMin;
    /* access modifiers changed from: private */
    public final setDefaultValue setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/electronicmoney/model/response/EmoneyGenerateTransId;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/network/response/ElectronicMoneyGetBizIdResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<StartAction, supportMultipleWindows> {
        public static final getMax setMax = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            StartAction startAction = (StartAction) obj;
            Intrinsics.checkNotNullParameter(startAction, "it");
            Intrinsics.checkNotNullParameter(startAction, "$this$toEmoneyGenerateTransId");
            return new supportMultipleWindows(startAction.getBizId());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/electronicmoney/model/response/BrizziAccessTokenInfo;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/network/response/BrizziGetAccessTokenResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<getAnimResId, getDefaultZoom> {
        public static final getMin getMax = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getAnimResId getanimresid = (getAnimResId) obj;
            Intrinsics.checkNotNullParameter(getanimresid, "it");
            return new getDefaultZoom(getanimresid.getAccessToken(), getanimresid.getConsumerSecret(), getanimresid.getUsername(), getanimresid.getReffNumber());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/electronicmoney/model/response/EmoneyCardInfo;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/network/response/EmoneyCardInfoResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<needWaitIpc, getUseWideViewPort> {
        public static final length getMax = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            needWaitIpc needwaitipc = (needWaitIpc) obj;
            Intrinsics.checkNotNullParameter(needwaitipc, "it");
            return processTransparent.setMin(needwaitipc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/electronicmoney/model/response/EmoneyCardInfo;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/network/response/EmoneyCardInfoResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<needWaitIpc, getUseWideViewPort> {
        public static final setMax getMin = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            needWaitIpc needwaitipc = (needWaitIpc) obj;
            Intrinsics.checkNotNullParameter(needwaitipc, "it");
            return processTransparent.setMin(needwaitipc);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/electronicmoney/model/response/EmoneyReversal;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/network/response/EmoneyReversalResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<setAppLaunchParams, setLayoutAlgorithm> {
        public static final setMin getMax = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setAppLaunchParams setapplaunchparams = (setAppLaunchParams) obj;
            Intrinsics.checkNotNullParameter(setapplaunchparams, "it");
            Intrinsics.checkNotNullParameter(setapplaunchparams, "$this$toEmoneyReversal");
            boolean z = setapplaunchparams.success;
            String str = setapplaunchparams.errorCode;
            Intrinsics.checkNotNullExpressionValue(str, "errorCode");
            String str2 = setapplaunchparams.getData().get("approvalCode");
            String str3 = str2 == null ? "" : str2;
            String str4 = setapplaunchparams.getData().get("message");
            return new setLayoutAlgorithm(z, str, str3, str4 == null ? "" : str4, setapplaunchparams.getData());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ParamUtils(@NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r3, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams, @NotNull setDefaultValue setdefaultvalue, @NotNull onCallBack oncallback) {
        super(dialogLayout, r3, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r3, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "securityGuardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        Intrinsics.checkNotNullParameter(setdefaultvalue, "electronicmoneyEntityDataFactory");
        Intrinsics.checkNotNullParameter(oncallback, "configEntityDataFactory");
        this.setMax = setdefaultvalue;
        this.getMin = oncallback;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/electronicmoney/ElectronicmoneyData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function0<ParamImpl> {
        final /* synthetic */ ParamUtils this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(ParamUtils paramUtils) {
            super(0);
            this.this$0 = paramUtils;
        }

        @NotNull
        public final ParamImpl invoke() {
            setDefaultValue min = this.this$0.setMax;
            return Intrinsics.areEqual((Object) "network", (Object) "network") ? min.getMax : min.setMin;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getDefaultZoom> getBrizziAccessToken() {
        TitleBarRightButtonView.AnonymousClass1<R> map = ((ParamImpl) this.getMax.getValue()).getMin().map(getMin.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "networkElectronicmoneyEn… it.reffNumber)\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setUseWideViewPort> doBrizziManualReversal(@NotNull getTextSize gettextsize) {
        Intrinsics.checkNotNullParameter(gettextsize, "brizziReversalInfo");
        return ((ParamImpl) this.getMax.getValue()).setMax(gettextsize);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<supportMultipleWindows> generateEmoneyTransId() {
        TitleBarRightButtonView.AnonymousClass1<R> map = ((ParamImpl) this.getMax.getValue()).setMin().map(getMax.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "networkElectronicmoneyEn…nerateTransId()\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getUseWideViewPort> inquireBalance(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "data");
        TitleBarRightButtonView.AnonymousClass1<R> map2 = ((ParamImpl) this.getMax.getValue()).length(map).map(length.getMax);
        Intrinsics.checkNotNullExpressionValue(map2, "networkElectronicmoneyEn…moneyCardInfo()\n        }");
        return map2;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setLayoutAlgorithm> getReversalEmoney(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "cardType");
        Intrinsics.checkNotNullParameter(str2, "cardProvider");
        Intrinsics.checkNotNullParameter(map, "data");
        TitleBarRightButtonView.AnonymousClass1<R> map2 = ((ParamImpl) this.getMax.getValue()).getMax(str, str2, map).map(setMin.getMax);
        Intrinsics.checkNotNullExpressionValue(map2, "networkElectronicmoneyEn…yReversal()\n            }");
        return map2;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getUseWideViewPort> getTopUpCommandEmoney(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "cardType");
        Intrinsics.checkNotNullParameter(str2, "cardProvider");
        Intrinsics.checkNotNullParameter(map, "data");
        TitleBarRightButtonView.AnonymousClass1<R> map2 = ((ParamImpl) this.getMax.getValue()).setMax(str, str2, str3, map).map(setMax.getMin);
        Intrinsics.checkNotNullExpressionValue(map2, "networkElectronicmoneyEn…{ it.toEmoneyCardInfo() }");
        return map2;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setUseWideViewPort> confirmUpdateBalanceEmoney(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "cardType");
        Intrinsics.checkNotNullParameter(str2, "cardProvider");
        Intrinsics.checkNotNullParameter(map, "data");
        return ((ParamImpl) this.getMax.getValue()).setMax(str, str2, map);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Map<String, setSupportMultipleWindows>> getElectronicMoneyConfig() {
        AppMsgReceiver.AnonymousClass2 createData = this.getMin.createData(Source.SPLIT);
        Intrinsics.checkNotNullExpressionValue(createData, "configEntityDataFactory.createData(Source.SPLIT)");
        TitleBarRightButtonView.AnonymousClass1<Map<String, setSupportMultipleWindows>> electronicMoneyConfig = createData.getElectronicMoneyConfig();
        Intrinsics.checkNotNullExpressionValue(electronicMoneyConfig, "createConfigSplitData().electronicMoneyConfig");
        return electronicMoneyConfig;
    }
}
