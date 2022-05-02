package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityAnimBean;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0014H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0002H\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000eH\u0002J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000eH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e2\u0006\u0010!\u001a\u00020\u001eH\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0014J2\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0014H\u0016J<\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0014H\u0016J\"\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0014H\u0016¨\u0006*"}, d2 = {"Lid/dana/data/electronicmoney/network/NetworkElectronicmoneyEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/electronicmoney/ElectronicmoneyFacade;", "Lid/dana/data/electronicmoney/ElectronicmoneyData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "confirmUpdateBalanceEmoney", "Lio/reactivex/Observable;", "Lid/dana/domain/electronicmoney/model/response/ElectronicMoneyBaseResult;", "cardType", "", "cardProvider", "data", "", "doBrizziManualReversal", "brizziReversalInfo", "Lid/dana/domain/electronicmoney/model/request/BrizziReversalInfo;", "electronicMoneyGetBizIdResponse", "Lid/dana/data/electronicmoney/network/response/ElectronicMoneyGetBizIdResponse;", "bizEventName", "it", "generateEmoneyTransId", "getBrizziAccessToken", "Lid/dana/data/electronicmoney/network/response/BrizziGetAccessTokenResponse;", "getBrizziInitialData", "getBrizziReffNumber", "brizziGetAccessTokenResponse", "getFacadeClass", "Ljava/lang/Class;", "getReversalEmoney", "Lid/dana/data/electronicmoney/network/response/EmoneyReversalResponse;", "getTopUpCommandEmoney", "Lid/dana/data/electronicmoney/network/response/EmoneyCardInfoResponse;", "state", "inquireBalance", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class parseMagicOptions extends setRepeatCount<unifyAll> implements ParamImpl {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/electronicmoney/network/response/BrizziGetAccessTokenResponse;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/ElectronicmoneyFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<F, S> implements addAnimatorUpdateListener.getMax<unifyAll, getAnimResId> {
        final /* synthetic */ parseMagicOptions setMin;

        IsOverlapping(parseMagicOptions parsemagicoptions) {
            this.setMin = parsemagicoptions;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            BaseRpcRequest baseRpcRequest = new BaseRpcRequest();
            baseRpcRequest.envInfo = this.setMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((unifyAll) obj).getBrizziAccessToken(baseRpcRequest);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/ElectronicmoneyFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMax<F, S> implements addAnimatorUpdateListener.getMax<unifyAll, BaseRpcResult> {
        final /* synthetic */ parseMagicOptions getMax;
        final /* synthetic */ getTextSize getMin;

        getMax(parseMagicOptions parsemagicoptions, getTextSize gettextsize) {
            this.getMax = parsemagicoptions;
            this.getMin = gettextsize;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            AnimUtils animUtils = new AnimUtils(this.getMin.getReversalData(), this.getMin.getErrorCode(), this.getMin);
            animUtils.envInfo = this.getMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((unifyAll) obj).doBrizziManualReversal(animUtils);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/ElectronicmoneyFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMin<F, S> implements addAnimatorUpdateListener.getMax<unifyAll, BaseRpcResult> {
        final /* synthetic */ parseMagicOptions getMin;
        final /* synthetic */ String length;
        final /* synthetic */ String setMax;
        final /* synthetic */ Map setMin;

        getMin(parseMagicOptions parsemagicoptions, String str, String str2, Map map) {
            this.getMin = parsemagicoptions;
            this.setMax = str;
            this.length = str2;
            this.setMin = map;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            Visit visit = new Visit(this.setMax, this.length, this.setMin);
            visit.envInfo = this.getMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((unifyAll) obj).confirmUpdateBalanceEmoney(visit);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/electronicmoney/network/response/EmoneyCardInfoResponse;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/ElectronicmoneyFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class hashCode<F, S> implements addAnimatorUpdateListener.getMax<unifyAll, needWaitIpc> {
        final /* synthetic */ parseMagicOptions getMin;
        final /* synthetic */ Map setMin;

        hashCode(parseMagicOptions parsemagicoptions, Map map) {
            this.getMin = parsemagicoptions;
            this.setMin = map;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            PermissionUtil permissionUtil = new PermissionUtil("MANDIRI", this.setMin);
            permissionUtil.envInfo = this.getMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((unifyAll) obj).inquireBalance(permissionUtil);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/electronicmoney/network/response/BrizziGetAccessTokenResponse;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/network/response/ElectronicMoneyGetBizIdResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T, R> implements RedDotDrawable<StartAction, getAnimResId> {
        final /* synthetic */ getAnimResId setMax;

        isInside(getAnimResId getanimresid) {
            this.setMax = getanimresid;
        }

        public final /* synthetic */ Object apply(Object obj) {
            StartAction startAction = (StartAction) obj;
            Intrinsics.checkNotNullParameter(startAction, "it");
            getAnimResId getanimresid = this.setMax;
            getanimresid.setReffNumber(startAction.getBizId());
            return getanimresid;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/electronicmoney/model/response/ElectronicMoneyBaseResult;", "kotlin.jvm.PlatformType", "it", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<BaseRpcResult, setUseWideViewPort> {
        public static final length setMax = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            BaseRpcResult baseRpcResult = (BaseRpcResult) obj;
            Intrinsics.checkNotNullParameter(baseRpcResult, "it");
            setUseWideViewPort setusewideviewport = new setUseWideViewPort(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            setusewideviewport.setSuccess(baseRpcResult.success);
            setusewideviewport.setErrorCode(baseRpcResult.errorCode);
            setusewideviewport.setErrorMessage(baseRpcResult.errorMessage);
            return setusewideviewport;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/electronicmoney/model/response/ElectronicMoneyBaseResult;", "kotlin.jvm.PlatformType", "it", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<BaseRpcResult, setUseWideViewPort> {
        public static final setMax getMin = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            BaseRpcResult baseRpcResult = (BaseRpcResult) obj;
            Intrinsics.checkNotNullParameter(baseRpcResult, "it");
            return new setUseWideViewPort(baseRpcResult.success, baseRpcResult.errorCode, baseRpcResult.errorMessage);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/electronicmoney/network/response/ElectronicMoneyGetBizIdResponse;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/ElectronicmoneyFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMin<F, S> implements addAnimatorUpdateListener.getMax<unifyAll, StartAction> {
        final /* synthetic */ parseMagicOptions setMin;

        setMin(parseMagicOptions parsemagicoptions) {
            this.setMin = parsemagicoptions;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            unifyAll unifyall = (unifyAll) obj;
            parseMagicOptions parsemagicoptions = this.setMin;
            Intrinsics.checkNotNullExpressionValue(unifyall, "it");
            return parseMagicOptions.setMax(parsemagicoptions, "MANDIRI_EMONEY_GEN_TRANS_ID_UPDATE_PROCESS", unifyall);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/electronicmoney/network/response/ElectronicMoneyGetBizIdResponse;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/ElectronicmoneyFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<F, S> implements addAnimatorUpdateListener.getMax<unifyAll, StartAction> {
        final /* synthetic */ parseMagicOptions length;

        toFloatRange(parseMagicOptions parsemagicoptions) {
            this.length = parsemagicoptions;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            unifyAll unifyall = (unifyAll) obj;
            parseMagicOptions parsemagicoptions = this.length;
            Intrinsics.checkNotNullExpressionValue(unifyall, "it");
            return parseMagicOptions.setMax(parsemagicoptions, "BRIZZI_GEN_REFNUM", unifyall);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/electronicmoney/network/response/EmoneyReversalResponse;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/electronicmoney/ElectronicmoneyFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<F, S> implements addAnimatorUpdateListener.getMax<unifyAll, setAppLaunchParams> {
        final /* synthetic */ Map getMax;
        final /* synthetic */ String length;
        final /* synthetic */ parseMagicOptions setMax;
        final /* synthetic */ String setMin;

        toIntRange(parseMagicOptions parsemagicoptions, String str, String str2, Map map) {
            this.setMax = parsemagicoptions;
            this.length = str;
            this.setMin = str2;
            this.getMax = map;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            ActivityAnimBean.AnonymousClass1 r0 = new BaseRpcRequest(this.length, this.setMin, this.getMax) {
                @NotNull
                private final String cardProvider;
                @NotNull
                private final String cardType;
                @NotNull
                private final Map<String, String> data;

                @NotNull
                public final String getCardType() {
                    return this.cardType;
                }

                @NotNull
                public final String getCardProvider() {
                    return this.cardProvider;
                }

                @NotNull
                public final Map<String, String> getData() {
                    return this.data;
                }

                {
                    Intrinsics.checkNotNullParameter(r2, "cardType");
                    Intrinsics.checkNotNullParameter(r3, "cardProvider");
                    Intrinsics.checkNotNullParameter(r4, "data");
                    this.cardType = r2;
                    this.cardProvider = r3;
                    this.data = r4;
                }
            };
            r0.envInfo = this.setMax.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((unifyAll) obj).getReversalEmoney(r0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public parseMagicOptions(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final Class<unifyAll> getFacadeClass() {
        return unifyAll.class;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lid/dana/data/electronicmoney/network/response/BrizziGetAccessTokenResponse;", "p1", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class equals extends FunctionReferenceImpl implements Function1<getAnimResId, TitleBarRightButtonView.AnonymousClass1<getAnimResId>> {
        equals(parseMagicOptions parsemagicoptions) {
            super(1, parsemagicoptions, parseMagicOptions.class, "getBrizziReffNumber", "getBrizziReffNumber(Lid/dana/data/electronicmoney/network/response/BrizziGetAccessTokenResponse;)Lio/reactivex/Observable;", 0);
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<getAnimResId> invoke(@NotNull getAnimResId getanimresid) {
            Intrinsics.checkNotNullParameter(getanimresid, "p1");
            return parseMagicOptions.getMax((parseMagicOptions) this.receiver, getanimresid);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setUseWideViewPort> setMax(@NotNull getTextSize gettextsize) {
        Intrinsics.checkNotNullParameter(gettextsize, "brizziReversalInfo");
        TitleBarRightButtonView.AnonymousClass1<setUseWideViewPort> map = wrapper(new getMax(this, gettextsize)).map(length.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "wrapper {\n            it…e\n            }\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<StartAction> setMin() {
        TitleBarRightButtonView.AnonymousClass1<StartAction> wrapper = wrapper(new setMin(this));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n            el…E_PROCESS\", it)\n        }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<needWaitIpc> length(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "data");
        TitleBarRightButtonView.AnonymousClass1<needWaitIpc> wrapper = wrapper(new hashCode(this, map));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n            it…ileEnvInfo() })\n        }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setAppLaunchParams> getMax(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "cardType");
        Intrinsics.checkNotNullParameter(str2, "cardProvider");
        Intrinsics.checkNotNullParameter(map, "data");
        TitleBarRightButtonView.AnonymousClass1<setAppLaunchParams> wrapper = wrapper(new toIntRange(this, str, str2, map));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n            it…\n            })\n        }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<needWaitIpc> setMax(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "cardType");
        Intrinsics.checkNotNullParameter(str2, "cardProvider");
        Intrinsics.checkNotNullParameter(map, "data");
        TitleBarRightButtonView.AnonymousClass1<needWaitIpc> wrapper = wrapper(new parseMagicOptions$FastBitmap$CoordinateSystem(this, str, str2, str3, map));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n            it…             })\n        }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setUseWideViewPort> setMax(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "cardType");
        Intrinsics.checkNotNullParameter(str2, "cardProvider");
        Intrinsics.checkNotNullParameter(map, "data");
        TitleBarRightButtonView.AnonymousClass1<setUseWideViewPort> map2 = wrapper(new getMin(this, str, str2, map)).map(setMax.getMin);
        Intrinsics.checkNotNullExpressionValue(map2, "wrapper {\n            it…t.errorMessage)\n        }");
        return map2;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getAnimResId> getMin() {
        TitleBarRightButtonView.AnonymousClass1 wrapper = wrapper(new IsOverlapping(this));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n            it…\n            })\n        }");
        TitleBarRightButtonView.AnonymousClass1<getAnimResId> flatMap = wrapper.flatMap(new mergeParams(new equals(this)));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getBrizziAccessToken().f…his::getBrizziReffNumber)");
        return flatMap;
    }

    public static final /* synthetic */ StartAction setMax(parseMagicOptions parsemagicoptions, String str, unifyAll unifyall) {
        ActivityAnimBean activityAnimBean = new ActivityAnimBean(str);
        activityAnimBean.envInfo = parsemagicoptions.generateMobileEnvInfo();
        Unit unit = Unit.INSTANCE;
        return unifyall.getElectronicMoneyBizId(activityAnimBean);
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 getMax(parseMagicOptions parsemagicoptions, getAnimResId getanimresid) {
        TitleBarRightButtonView.AnonymousClass1 map = parsemagicoptions.wrapper(new toFloatRange(parsemagicoptions)).map(new isInside(getanimresid));
        Intrinsics.checkNotNullExpressionValue(map, "wrapper {\n            el…reffNumber = it.bizId } }");
        return map;
    }
}
