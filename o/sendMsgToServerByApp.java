package o;

import id.dana.domain.investment.AccountInvestmentStatus;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ServerMsgReceiver;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lid/dana/data/investment/repository/InvestmentEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/investment/InvestmentRepository;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "investmentEntityDataFactory", "Lid/dana/data/investment/repository/source/InvestmentEntityDataFactory;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "guardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "(Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/investment/repository/source/InvestmentEntityDataFactory;Lid/dana/data/errorconfig/ErrorConfigFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/login/source/LoginEntityDataFactory;)V", "accountLocalEntityData", "Lid/dana/data/account/repository/source/AccountEntityData;", "kotlin.jvm.PlatformType", "getAccountLocalEntityData", "()Lid/dana/data/account/repository/source/AccountEntityData;", "accountLocalEntityData$delegate", "Lkotlin/Lazy;", "investmentNetworkEntityData", "Lid/dana/data/investment/repository/source/InvestmentEntityData;", "getInvestmentNetworkEntityData", "()Lid/dana/data/investment/repository/source/InvestmentEntityData;", "investmentNetworkEntityData$delegate", "getUserInvestment", "Lio/reactivex/Observable;", "Lid/dana/domain/investment/model/UserInvestmentInfo;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class sendMsgToServerByApp extends setMinProgress implements GriverEnv {
    /* access modifiers changed from: private */
    public final addAttrToClient getMax;
    /* access modifiers changed from: private */
    public final DialogLayout length;
    private final Lazy setMax = LazyKt.lazy(new getMax(this));
    private final Lazy setMin = LazyKt.lazy(new setMax(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/investment/repository/source/network/response/AccountInvestmentResult;", "kotlin.jvm.PlatformType", "userId", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<? extends createPage>> {
        final /* synthetic */ sendMsgToServerByApp setMax;

        length(sendMsgToServerByApp sendmsgtoserverbyapp) {
            this.setMax = sendmsgtoserverbyapp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "userId");
            sendMsgToServerByApp sendmsgtoserverbyapp = this.setMax;
            return sendmsgtoserverbyapp.authenticatedRequest(sendMsgToServerByApp.setMin(sendmsgtoserverbyapp).setMax(str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/investment/model/UserInvestmentInfo;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/investment/repository/source/network/response/AccountInvestmentResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<createPage, getWorkSpaceId> {
        public static final setMin setMin = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getVerifyPulickey getverifypulickey;
            createPage createpage = (createPage) obj;
            Intrinsics.checkNotNullParameter(createpage, "it");
            Intrinsics.checkNotNullParameter(createpage, "$this$toUserInvestmentInfo");
            String accountId = createpage.getAccountId();
            AccountInvestmentStatus valueOf = AccountInvestmentStatus.valueOf(createpage.getAccountStatus());
            String aggregator = createpage.getAggregator();
            createApp availableBalance = createpage.getAvailableBalance();
            isForeground max = availableBalance != null ? RVSinglePageAppProxy.setMax(availableBalance) : null;
            RVAppFactory balanceUnit = createpage.getBalanceUnit();
            if (balanceUnit != null) {
                Intrinsics.checkNotNullParameter(balanceUnit, "$this$toInvestmentUnitInfo");
                getverifypulickey = new getVerifyPulickey(balanceUnit.getType(), balanceUnit.getUnit(), balanceUnit.getUnitValue());
            } else {
                getverifypulickey = null;
            }
            createApp dailyGainLossAmount = createpage.getDailyGainLossAmount();
            isForeground max2 = dailyGainLossAmount != null ? RVSinglePageAppProxy.setMax(dailyGainLossAmount) : null;
            String dailyGainLossPercentage = createpage.getDailyGainLossPercentage();
            String goodsId = createpage.getGoodsId();
            Long lastUpdated = createpage.getLastUpdated();
            createApp totalGainLossAmount = createpage.getTotalGainLossAmount();
            return new getWorkSpaceId(accountId, valueOf, aggregator, max, getverifypulickey, max2, dailyGainLossPercentage, goodsId, lastUpdated, totalGainLossAmount != null ? RVSinglePageAppProxy.setMax(totalGainLossAmount) : null, createpage.getTotalGainLossPercentage(), createpage.getUserId());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public sendMsgToServerByApp(@NotNull DialogLayout dialogLayout, @NotNull addAttrToClient addattrtoclient, @NotNull getAppLaunchParams getapplaunchparams, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull b.AnonymousClass3 r6) {
        super(dialogLayout, r6, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(addattrtoclient, "investmentEntityDataFactory");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "guardFacade");
        Intrinsics.checkNotNullParameter(r6, "loginEntityDataFactory");
        this.length = dialogLayout;
        this.getMax = addattrtoclient;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/account/repository/source/AccountEntityData;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<setDrawDivider> {
        final /* synthetic */ sendMsgToServerByApp this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(sendMsgToServerByApp sendmsgtoserverbyapp) {
            super(0);
            this.this$0 = sendmsgtoserverbyapp;
        }

        public final setDrawDivider invoke() {
            return this.this$0.length.createData("local");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/investment/repository/source/InvestmentEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<ServerMsgReceiver.AnonymousClass1> {
        final /* synthetic */ sendMsgToServerByApp this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(sendMsgToServerByApp sendmsgtoserverbyapp) {
            super(0);
            this.this$0 = sendmsgtoserverbyapp;
        }

        @NotNull
        public final ServerMsgReceiver.AnonymousClass1 invoke() {
            return this.this$0.getMax.getMax;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getWorkSpaceId> getUserInvestment() {
        setDrawDivider setdrawdivider = (setDrawDivider) this.setMax.getValue();
        Intrinsics.checkNotNullExpressionValue(setdrawdivider, "accountLocalEntityData");
        TitleBarRightButtonView.AnonymousClass1<R> map = setdrawdivider.getUserId().flatMap(new length(this)).map(setMin.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "accountLocalEntityData.u….toUserInvestmentInfo() }");
        return map;
    }

    public static final /* synthetic */ ServerMsgReceiver.AnonymousClass1 setMin(sendMsgToServerByApp sendmsgtoserverbyapp) {
        return (ServerMsgReceiver.AnonymousClass1) sendmsgtoserverbyapp.setMin.getValue();
    }
}
