package o;

import id.dana.data.Source;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013¨\u0006 "}, d2 = {"Lid/dana/data/senddigitalmoney/repository/SendDigitalMoneyEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/senddigitalmoney/SendDigitalMoneyRepository;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "securityGuardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "sendDigitalMoneyEntityDataFactory", "Lid/dana/data/senddigitalmoney/repository/source/SendDigitalMoneyEntityDataFactory;", "cardPrefixQueryResultMapper", "Lid/dana/data/senddigitalmoney/repository/mapper/CardPrefixQueryResultMapper;", "(Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;Lid/dana/data/senddigitalmoney/repository/source/SendDigitalMoneyEntityDataFactory;Lid/dana/data/senddigitalmoney/repository/mapper/CardPrefixQueryResultMapper;)V", "networkDigitalMoneyEntityData", "Lid/dana/data/senddigitalmoney/SendDigitalMoneyEntityData;", "getNetworkDigitalMoneyEntityData", "()Lid/dana/data/senddigitalmoney/SendDigitalMoneyEntityData;", "networkDigitalMoneyEntityData$delegate", "Lkotlin/Lazy;", "splitDigitalMoneyEntityData", "getSplitDigitalMoneyEntityData", "splitDigitalMoneyEntityData$delegate", "doQueryCardWithoutPrefix", "Lio/reactivex/Observable;", "Lid/dana/domain/senddigitalmoney/model/CardPrefixQueryInfo;", "cardIndexNo", "", "getCardWithoutPrefixFeaturedEnabled", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OneShotRunnable extends setMinProgress implements getBeaconSimulator {
    private final Lazy getMax = LazyKt.lazy(new setMax(this));
    /* access modifiers changed from: private */
    public final getUserAvatar getMin;
    private final isLogin length;
    private final Lazy setMin = LazyKt.lazy(new setMin(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public OneShotRunnable(@NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r3, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams, @NotNull getUserAvatar getuseravatar, @NotNull isLogin islogin) {
        super(dialogLayout, r3, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r3, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "securityGuardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        Intrinsics.checkNotNullParameter(getuseravatar, "sendDigitalMoneyEntityDataFactory");
        Intrinsics.checkNotNullParameter(islogin, "cardPrefixQueryResultMapper");
        this.getMin = getuseravatar;
        this.length = islogin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/senddigitalmoney/SendDigitalMoneyEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<OneShotRunnablePool> {
        final /* synthetic */ OneShotRunnable this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(OneShotRunnable oneShotRunnable) {
            super(0);
            this.this$0 = oneShotRunnable;
        }

        @NotNull
        public final OneShotRunnablePool invoke() {
            return this.this$0.getMin.createData("network");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/senddigitalmoney/SendDigitalMoneyEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<OneShotRunnablePool> {
        final /* synthetic */ OneShotRunnable this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(OneShotRunnable oneShotRunnable) {
            super(0);
            this.this$0 = oneShotRunnable;
        }

        @NotNull
        public final OneShotRunnablePool invoke() {
            return this.this$0.getMin.createData(Source.SPLIT);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/senddigitalmoney/model/CardPrefixQueryInfo;", "kotlin.jvm.PlatformType", "p1", "Lid/dana/data/senddigitalmoney/repository/model/result/CardPrefixQueryResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class length extends FunctionReferenceImpl implements Function1<getUserId, isScannerInDifferentProcess> {
        length(isLogin islogin) {
            super(1, islogin, isLogin.class, "apply", "apply(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        public final isScannerInDifferentProcess invoke(getUserId getuserid) {
            return (isScannerInDifferentProcess) ((isLogin) this.receiver).apply(getuserid);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<isScannerInDifferentProcess> doQueryCardWithoutPrefix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "cardIndexNo");
        TitleBarRightButtonView.AnonymousClass1<isScannerInDifferentProcess> authenticatedRequest = authenticatedRequest(((OneShotRunnablePool) this.setMin.getValue()).getMax(new SecurityUtils(str)).map(new APAccountService(new length(this.length))));
        Intrinsics.checkNotNullExpressionValue(authenticatedRequest, "authenticatedRequest(net…ueryResultMapper::apply))");
        return authenticatedRequest;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getCardWithoutPrefixFeaturedEnabled() {
        return ((OneShotRunnablePool) this.getMax.getValue()).getMax();
    }
}
