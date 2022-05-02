package o;

import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J&\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0016J&\u0010'\u001a\b\u0012\u0004\u0012\u00020(0!2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020.0!H\u0016J\u0014\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$000!H\u0016J\u000e\u00101\u001a\b\u0012\u0004\u0012\u0002020!H\u0016J\u0016\u00103\u001a\b\u0012\u0004\u0012\u0002040!2\u0006\u0010)\u001a\u00020$H\u0016J\u0016\u00105\u001a\b\u0012\u0004\u0012\u0002060!2\u0006\u0010)\u001a\u00020$H\u0016J\u0016\u00107\u001a\b\u0012\u0004\u0012\u0002080!2\u0006\u00109\u001a\u00020:H\u0016J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020<0!2\u0006\u0010)\u001a\u00020$H\u0016J\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00020$0!2\u0006\u0010)\u001a\u00020$2\u0006\u0010>\u001a\u00020$H\u0016J.\u0010?\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010)\u001a\u00020$2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001e\u0010\u001b¨\u0006@"}, d2 = {"Lid/dana/data/saving/repository/SavingEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/saving/SavingRepository;", "deviceInformationProvider", "Lid/dana/data/config/DeviceInformationProvider;", "savingEntityDataFactory", "Lid/dana/data/saving/repository/SavingEntityDataFactory;", "savingWithdrawEntityDataFactory", "Lid/dana/data/saving/repository/SavingWithdrawEntityDataFactory;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "guardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "(Lid/dana/data/config/DeviceInformationProvider;Lid/dana/data/saving/repository/SavingEntityDataFactory;Lid/dana/data/saving/repository/SavingWithdrawEntityDataFactory;Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;)V", "savingEntityData", "Lid/dana/data/saving/repository/SavingEntityData;", "getSavingEntityData", "()Lid/dana/data/saving/repository/SavingEntityData;", "savingEntityData$delegate", "Lkotlin/Lazy;", "savingWithdrawLocalEntityData", "Lid/dana/data/saving/repository/SavingWithdrawEntityData;", "getSavingWithdrawLocalEntityData", "()Lid/dana/data/saving/repository/SavingWithdrawEntityData;", "savingWithdrawLocalEntityData$delegate", "savingWithdrawNetworkEntityData", "getSavingWithdrawNetworkEntityData", "savingWithdrawNetworkEntityData$delegate", "createSaving", "Lio/reactivex/Observable;", "Lid/dana/domain/saving/model/SavingGoalView;", "categoryCode", "", "title", "targetAmount", "getSavingDetail", "Lid/dana/domain/saving/model/SavingDetail;", "savingId", "topUpViewsPage", "", "topUpViewsSize", "getSavingSummary", "Lid/dana/domain/saving/model/SavingSummary;", "getWithdrawOption", "", "initSavingCreate", "Lid/dana/domain/saving/model/SavingCreateInit;", "initSavingTopUp", "Lid/dana/domain/saving/model/SavingTopUpInit;", "initSavingUpdate", "Lid/dana/domain/saving/model/SavingUpdateInit;", "initSavingWithdraw", "Lid/dana/domain/saving/model/SavingWithdrawInitResult;", "request", "Lid/dana/domain/saving/model/SavingWithdrawInitRequest;", "revokeSaving", "", "topUpSaving", "fundAmount", "updateSaving", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isAllowRetry extends setMinProgress implements getBluetoothName {
    private final getPerformanceTracker deviceInformationProvider;
    private final Lazy savingEntityData$delegate = LazyKt.lazy(new isInside(this));
    /* access modifiers changed from: private */
    public final getRequestHeader savingEntityDataFactory;
    /* access modifiers changed from: private */
    public final isBgRpc savingWithdrawEntityDataFactory;
    private final Lazy savingWithdrawLocalEntityData$delegate = LazyKt.lazy(new values(this));
    private final Lazy savingWithdrawNetworkEntityData$delegate = LazyKt.lazy(new toDoubleRange(this));

    private final isResetCookie getSavingEntityData() {
        return (isResetCookie) this.savingEntityData$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final isUrgent getSavingWithdrawLocalEntityData() {
        return (isUrgent) this.savingWithdrawLocalEntityData$delegate.getValue();
    }

    private final isUrgent getSavingWithdrawNetworkEntityData() {
        return (isUrgent) this.savingWithdrawNetworkEntityData$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/response/GoalRevokeResult;", "apply", "(Lid/dana/data/saving/repository/source/network/response/GoalRevokeResult;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T, R> implements RedDotDrawable<allowNonNet, Boolean> {
        public static final IsOverlapping getMin = new IsOverlapping();

        IsOverlapping() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            allowNonNet allownonnet = (allowNonNet) obj;
            Intrinsics.checkNotNullParameter(allownonnet, "it");
            return Boolean.valueOf(allownonnet.getNeedWithdraw());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/saving/model/SavingWithdrawInitResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/response/SavingWithdrawInitEntityResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class equals<T, R> implements RedDotDrawable<needSignature, setUseTrackingCache> {
        public static final equals getMin = new equals();

        equals() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            needSignature needsignature = (needSignature) obj;
            Intrinsics.checkNotNullParameter(needsignature, "it");
            return isUseSpdy.toSavingWithdrawInitResult(needsignature);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/saving/model/SavingCreateInit;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/response/GoalCreateInitResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<disableEncrypt, getRegionExitPeriod> {
        public static final getMax getMin = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            disableEncrypt disableencrypt = (disableEncrypt) obj;
            Intrinsics.checkNotNullParameter(disableencrypt, "it");
            return switchUserLoginRpc.toSavingCreateInit(disableencrypt);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/saving/model/SavingGoalView;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/response/GoalCreateSubmitResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<allowBgLogin, BeaconManager> {
        public static final getMin setMin = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            allowBgLogin allowbglogin = (allowBgLogin) obj;
            Intrinsics.checkNotNullParameter(allowbglogin, "it");
            return access$802.toSavingGoalView(allowbglogin.getSavingView());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/saving/model/SavingDetail;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/response/SavingDetailResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<shortLinkOnly, setRegionExitPeriod> {
        public static final length setMax = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            shortLinkOnly shortlinkonly = (shortLinkOnly) obj;
            Intrinsics.checkNotNullParameter(shortlinkonly, "it");
            return RVHttpRequest.toSavingDetail(shortlinkonly);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<List<? extends String>, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends String>>> {
        final /* synthetic */ isAllowRetry getMax;

        setMax(isAllowRetry isallowretry) {
            this.getMax = isallowretry;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            if (list.isEmpty()) {
                return this.getMax.getSavingWithdrawLocalEntityData().getWithdrawOption();
            }
            return TitleBarRightButtonView.AnonymousClass1.just(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/saving/model/SavingSummary;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/response/UserSavingSummaryConsultResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<access$2100, logDebug> {
        public static final setMin getMin = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            access$2100 access_2100 = (access$2100) obj;
            Intrinsics.checkNotNullParameter(access_2100, "it");
            return access$2200.toSavingSummary(access_2100);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/saving/model/SavingUpdateInit;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/response/GoalUpdateInitResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<rpcLoggerLevel, setDistanceModelUpdateUrl> {
        public static final toFloatRange setMin = new toFloatRange();

        toFloatRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            rpcLoggerLevel rpcloggerlevel = (rpcLoggerLevel) obj;
            Intrinsics.checkNotNullParameter(rpcloggerlevel, "it");
            return getMethod.toSavingUpdateInit(rpcloggerlevel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/saving/model/SavingTopUpInit;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/response/GoalTopUpInitResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T, R> implements RedDotDrawable<rpcV2, getDistanceModelUpdateUrl> {
        public static final toIntRange setMin = new toIntRange();

        toIntRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            rpcV2 rpcv2 = (rpcV2) obj;
            Intrinsics.checkNotNullParameter(rpcv2, "it");
            return getTimeout.toSavingTopUpInit(rpcv2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/saving/model/SavingGoalView;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/response/GoalUpdateSubmitResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toString<T, R> implements RedDotDrawable<shortLinkIPList, BeaconManager> {
        public static final toString setMax = new toString();

        toString() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            shortLinkIPList shortlinkiplist = (shortLinkIPList) obj;
            Intrinsics.checkNotNullParameter(shortlinkiplist, "it");
            return access$802.toSavingGoalView(shortlinkiplist.getSavingView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isAllowRetry(@NotNull getPerformanceTracker getperformancetracker, @NotNull getRequestHeader getrequestheader, @NotNull isBgRpc isbgrpc, @NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r6, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r6, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(getperformancetracker, "deviceInformationProvider");
        Intrinsics.checkNotNullParameter(getrequestheader, "savingEntityDataFactory");
        Intrinsics.checkNotNullParameter(isbgrpc, "savingWithdrawEntityDataFactory");
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r6, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "guardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        this.deviceInformationProvider = getperformancetracker;
        this.savingEntityDataFactory = getrequestheader;
        this.savingWithdrawEntityDataFactory = isbgrpc;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/SavingEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function0<isResetCookie> {
        final /* synthetic */ isAllowRetry this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(isAllowRetry isallowretry) {
            super(0);
            this.this$0 = isallowretry;
        }

        @NotNull
        public final isResetCookie invoke() {
            return this.this$0.savingEntityDataFactory.createData("network");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/SavingWithdrawEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function0<isUrgent> {
        final /* synthetic */ isAllowRetry this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(isAllowRetry isallowretry) {
            super(0);
            this.this$0 = isallowretry;
        }

        @NotNull
        public final isUrgent invoke() {
            return this.this$0.savingWithdrawEntityDataFactory.createData("local");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/SavingWithdrawEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function0<isUrgent> {
        final /* synthetic */ isAllowRetry this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toDoubleRange(isAllowRetry isallowretry) {
            super(0);
            this.this$0 = isallowretry;
        }

        @NotNull
        public final isUrgent invoke() {
            return this.this$0.savingWithdrawEntityDataFactory.createData("network");
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<logDebug> getSavingSummary() {
        TitleBarRightButtonView.AnonymousClass1<logDebug> authenticatedRequest = authenticatedRequest(getSavingEntityData().getSavingSummary().map(setMin.getMin));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(\n  …toSavingSummary() }\n    )");
        return authenticatedRequest;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setRegionExitPeriod> getSavingDetail(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        TitleBarRightButtonView.AnonymousClass1<setRegionExitPeriod> authenticatedRequest = authenticatedRequest(getSavingEntityData().getSavingDetail(str, j, j2).map(length.setMax));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(\n  ….toSavingDetail() }\n    )");
        return authenticatedRequest;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getRegionExitPeriod> initSavingCreate() {
        TitleBarRightButtonView.AnonymousClass1<getRegionExitPeriod> authenticatedRequest = authenticatedRequest(getSavingEntityData().initSavingCreate().map(getMax.getMin));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(\n  …avingCreateInit() }\n    )");
        return authenticatedRequest;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BeaconManager> createSaving(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "categoryCode");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "targetAmount");
        isResetCookie savingEntityData = getSavingEntityData();
        String deviceUUID = this.deviceInformationProvider.getDeviceUUID();
        Intrinsics.checkNotNullExpressionValue(deviceUUID, "deviceInformationProvider.deviceUUID");
        TitleBarRightButtonView.AnonymousClass1<BeaconManager> authenticatedRequest = authenticatedRequest(savingEntityData.createSaving(deviceUUID, str, str2, str3).map(getMin.setMin));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(\n  …oSavingGoalView() }\n    )");
        return authenticatedRequest;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setDistanceModelUpdateUrl> initSavingUpdate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        TitleBarRightButtonView.AnonymousClass1<setDistanceModelUpdateUrl> authenticatedRequest = authenticatedRequest(getSavingEntityData().initSavingUpdate(str).map(toFloatRange.setMin));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(\n  …avingUpdateInit() }\n    )");
        return authenticatedRequest;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BeaconManager> updateSaving(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "categoryCode");
        Intrinsics.checkNotNullParameter(str3, "title");
        Intrinsics.checkNotNullParameter(str4, "targetAmount");
        TitleBarRightButtonView.AnonymousClass1<BeaconManager> authenticatedRequest = authenticatedRequest(getSavingEntityData().updateSaving(str, str2, str3, str4).map(toString.setMax));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(\n  …oSavingGoalView() }\n    )");
        return authenticatedRequest;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> revokeSaving(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        TitleBarRightButtonView.AnonymousClass1<Boolean> authenticatedRequest = authenticatedRequest(getSavingEntityData().revokeSaving(str).map(IsOverlapping.getMin));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(\n  …{ it.needWithdraw }\n    )");
        return authenticatedRequest;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getDistanceModelUpdateUrl> initSavingTopUp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        TitleBarRightButtonView.AnonymousClass1<getDistanceModelUpdateUrl> authenticatedRequest = authenticatedRequest(getSavingEntityData().initSavingTopUp(str).map(toIntRange.setMin));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(\n  …SavingTopUpInit() }\n    )");
        return authenticatedRequest;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> topUpSaving(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "fundAmount");
        isResetCookie savingEntityData = getSavingEntityData();
        String deviceUUID = this.deviceInformationProvider.getDeviceUUID();
        Intrinsics.checkNotNullExpressionValue(deviceUUID, "deviceInformationProvider.deviceUUID");
        TitleBarRightButtonView.AnonymousClass1<String> authenticatedRequest = authenticatedRequest(savingEntityData.topUpSaving(str, str2, deviceUUID).map(isAllowRetry$FastBitmap$CoordinateSystem.getMin));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(\n  … { it.checkoutUrl }\n    )");
        return authenticatedRequest;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getWithdrawOption() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getSavingWithdrawNetworkEntityData().getWithdrawOption().flatMap(new setMax(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "savingWithdrawNetworkEnt…le.just(it)\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setUseTrackingCache> initSavingWithdraw(@NotNull getInstanceForApplication getinstanceforapplication) {
        Intrinsics.checkNotNullParameter(getinstanceforapplication, RequestPermissionsEvent.REQUEST);
        TitleBarRightButtonView.AnonymousClass1<R> map = getSavingEntityData().initSavingWithdraw(getinstanceforapplication).map(equals.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "savingEntityData.initSav…ingWithdrawInitResult() }");
        return map;
    }
}
