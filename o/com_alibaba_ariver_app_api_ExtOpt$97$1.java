package o;

import id.dana.data.merchant.ProfileKeyNotFoundException;
import id.dana.data.merchant.repository.LastTransactionInvalidException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DebugConsoleExtension;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/data/merchant/repository/ProductInfoEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/merchant/ProductInfoRepository;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "guardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "networkProductEntityData", "Lid/dana/data/merchant/repository/source/network/NetworkProductInfoEntityData;", "(Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;Lid/dana/data/merchant/repository/source/network/NetworkProductInfoEntityData;)V", "createProductOrder", "Lio/reactivex/Observable;", "", "request", "Lid/dana/data/merchant/repository/source/network/request/CreateProductOrderRequest;", "getPrepaidCheckoutUrl", "profileKey", "getPrepaidElectricity", "getPrepaidMobileRecharge", "queryLastSuccessfullTransaction", "Lid/dana/data/merchant/repository/source/network/response/QueryLastSuccessfulTransactionResponse;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class com_alibaba_ariver_app_api_ExtOpt$97$1 extends setMinProgress implements downloadPath {
    /* access modifiers changed from: private */
    public final ConsoleViewCreateCallback networkProductEntityData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/merchant/repository/source/network/response/CreateProductOrderResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<sendMsgToConsole, String> {
        public static final getMax getMax = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            sendMsgToConsole sendmsgtoconsole = (sendMsgToConsole) obj;
            Intrinsics.checkNotNullParameter(sendmsgtoconsole, "it");
            String checkoutUrl = sendmsgtoconsole.getCheckoutUrl();
            return checkoutUrl == null ? "" : checkoutUrl;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "lastTransResult", "Lid/dana/data/merchant/repository/source/network/response/QueryLastSuccessfulTransactionResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<setToggleButtonVisible, TitleBarRightButtonView.AnonymousClass4<? extends String>> {
        final /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$97$1 setMax;

        getMin(com_alibaba_ariver_app_api_ExtOpt$97$1 com_alibaba_ariver_app_api_extopt_97_1) {
            this.setMax = com_alibaba_ariver_app_api_extopt_97_1;
        }

        public final /* synthetic */ Object apply(Object obj) {
            setToggleButtonVisible settogglebuttonvisible = (setToggleButtonVisible) obj;
            Intrinsics.checkNotNullParameter(settogglebuttonvisible, "lastTransResult");
            return this.setMax.createProductOrder(DebugConsoleExtension.AnonymousClass1.Companion.fromLastSuccesfulTransaction(settogglebuttonvisible));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "transRes", "Lid/dana/data/merchant/repository/source/network/response/QueryLastSuccessfulTransactionResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<setToggleButtonVisible, TitleBarRightButtonView.AnonymousClass4<? extends String>> {
        final /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$97$1 setMin;

        length(com_alibaba_ariver_app_api_ExtOpt$97$1 com_alibaba_ariver_app_api_extopt_97_1) {
            this.setMin = com_alibaba_ariver_app_api_extopt_97_1;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final setToggleButtonVisible settogglebuttonvisible = (setToggleButtonVisible) obj;
            Intrinsics.checkNotNullParameter(settogglebuttonvisible, "transRes");
            return this.setMin.networkProductEntityData.bizDestinationInquiry(sendMsgToConsoleView.Companion.fromLastSuccessfulTransaction(settogglebuttonvisible)).flatMap(new RedDotDrawable<RVDebugConsoleProxy, TitleBarRightButtonView.AnonymousClass4<? extends String>>(this) {
                final /* synthetic */ length getMin;

                {
                    this.getMin = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    RVDebugConsoleProxy rVDebugConsoleProxy = (RVDebugConsoleProxy) obj;
                    Intrinsics.checkNotNullParameter(rVDebugConsoleProxy, "bizDestinationResult");
                    com_alibaba_ariver_app_api_ExtOpt$97$1 com_alibaba_ariver_app_api_extopt_97_1 = this.getMin.setMin;
                    DebugConsoleExtension.AnonymousClass1.getMax getmax = DebugConsoleExtension.AnonymousClass1.Companion;
                    setToggleButtonVisible settogglebuttonvisible = settogglebuttonvisible;
                    Intrinsics.checkNotNullExpressionValue(settogglebuttonvisible, "transRes");
                    return com_alibaba_ariver_app_api_extopt_97_1.createProductOrder(getmax.forElectricity(rVDebugConsoleProxy, settogglebuttonvisible));
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/merchant/repository/source/network/response/QueryLastSuccessfulTransactionResponse;", "kotlin.jvm.PlatformType", "response", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<setToggleButtonVisible, TitleBarRightButtonView.AnonymousClass4<? extends setToggleButtonVisible>> {
        public static final setMax setMax = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r2;
            setToggleButtonVisible settogglebuttonvisible = (setToggleButtonVisible) obj;
            Intrinsics.checkNotNullParameter(settogglebuttonvisible, "response");
            if (settogglebuttonvisible.isInvalid()) {
                r2 = TitleBarRightButtonView.AnonymousClass1.error((Throwable) new LastTransactionInvalidException());
            } else {
                r2 = TitleBarRightButtonView.AnonymousClass1.just(settogglebuttonvisible);
            }
            return r2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public com_alibaba_ariver_app_api_ExtOpt$97$1(@NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r3, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams, @NotNull ConsoleViewCreateCallback consoleViewCreateCallback) {
        super(dialogLayout, r3, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r3, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "guardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        Intrinsics.checkNotNullParameter(consoleViewCreateCallback, "networkProductEntityData");
        this.networkProductEntityData = consoleViewCreateCallback;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getPrepaidCheckoutUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "profileKey");
        int hashCode = str.hashCode();
        if (hashCode != -960671608) {
            if (hashCode == 14978437 && str.equals("ELECTRICITY_PLN_LAST_RECHARGE_ID")) {
                return getPrepaidElectricity();
            }
        } else if (str.equals("MOBILE_RECHARGE_PHONE_NUMBER_LIST")) {
            return getPrepaidMobileRecharge();
        }
        TitleBarRightButtonView.AnonymousClass1<String> error = TitleBarRightButtonView.AnonymousClass1.error((Throwable) new ProfileKeyNotFoundException());
        Intrinsics.checkNotNullExpressionValue(error, "Observable.error(ProfileKeyNotFoundException())");
        return error;
    }

    private final TitleBarRightButtonView.AnonymousClass1<String> getPrepaidMobileRecharge() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = queryLastSuccessfullTransaction("MOBILE_RECHARGE_PHONE_NUMBER_LIST").flatMap(new getMin(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "queryLastSuccessfullTran…stTransResult))\n        }");
        return flatMap;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<String> createProductOrder(DebugConsoleExtension.AnonymousClass1 r2) {
        TitleBarRightButtonView.AnonymousClass1<R> map = this.networkProductEntityData.createProductOrder(r2).map(getMax.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "networkProductEntityData…utUrl.orEmpty()\n        }");
        return map;
    }

    private final TitleBarRightButtonView.AnonymousClass1<String> getPrepaidElectricity() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = queryLastSuccessfullTransaction("ELECTRICITY_PLN_LAST_RECHARGE_ID").flatMap(new length(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "queryLastSuccessfullTran…)\n            }\n        }");
        return flatMap;
    }

    private final TitleBarRightButtonView.AnonymousClass1<setToggleButtonVisible> queryLastSuccessfullTransaction(String str) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.networkProductEntityData.queryLastSuccessfulTransaction(new setNode(str)).flatMap(setMax.setMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "networkProductEntityData…)\n            }\n        }");
        return flatMap;
    }
}
