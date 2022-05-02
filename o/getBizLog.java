package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.ap.zoloz.hummer.biz.HummerConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000eH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000eH\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000e2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000e2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000e2\u0006\u0010'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u000e2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J&\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u000e2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J.\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u000e2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001b\u00100\u001a\u0002H1\"\b\b\u0000\u00101*\u000202*\u0002H1H\u0002¢\u0006\u0002\u00103¨\u00064"}, d2 = {"Lid/dana/data/saving/repository/source/network/NetworkSavingEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/saving/repository/source/network/SavingFacade;", "Lid/dana/data/saving/repository/SavingEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "securityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "createSaving", "Lio/reactivex/Observable;", "Lid/dana/data/saving/repository/source/network/response/GoalCreateSubmitResult;", "requestId", "", "categoryCode", "title", "targetAmount", "getFacadeClass", "Ljava/lang/Class;", "getSavingDetail", "Lid/dana/data/saving/repository/source/network/response/SavingDetailResult;", "savingId", "topUpViewsPage", "", "topUpViewsSize", "getSavingSummary", "Lid/dana/data/saving/repository/source/network/response/UserSavingSummaryConsultResult;", "initSavingCreate", "Lid/dana/data/saving/repository/source/network/response/GoalCreateInitResult;", "initSavingTopUp", "Lid/dana/data/saving/repository/source/network/response/GoalTopUpInitResult;", "initSavingUpdate", "Lid/dana/data/saving/repository/source/network/response/GoalUpdateInitResult;", "initSavingWithdraw", "Lid/dana/data/saving/repository/source/network/response/SavingWithdrawInitEntityResult;", "savingWithdrawInitRequest", "Lid/dana/domain/saving/model/SavingWithdrawInitRequest;", "revokeSaving", "Lid/dana/data/saving/repository/source/network/response/GoalRevokeResult;", "topUpSaving", "Lid/dana/data/saving/repository/source/network/response/SavingTopUpSubmitResult;", "fundAmount", "updateSaving", "Lid/dana/data/saving/repository/source/network/response/GoalUpdateSubmitResult;", "addMobileEnvInfo", "T", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "(Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;)Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getBizLog extends setRepeatCount<appId> implements isResetCookie {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/source/network/response/SavingWithdrawInitEntityResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/SavingFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<F, S> implements addAnimatorUpdateListener.getMax<appId, needSignature> {
        final /* synthetic */ getBizLog length;
        final /* synthetic */ getInstanceForApplication setMin;

        IsOverlapping(getBizLog getbizlog, getInstanceForApplication getinstanceforapplication) {
            this.length = getbizlog;
            this.setMin = getinstanceforapplication;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((appId) obj).initSavingWithdraw((bgRpc) this.length.addMobileEnvInfo(new bgRpc(this.setMin.getSavingId(), this.setMin.getWithdrawMethod())));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/source/network/response/GoalRevokeResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/SavingFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class equals<F, S> implements addAnimatorUpdateListener.getMax<appId, allowNonNet> {
        final /* synthetic */ String getMin;
        final /* synthetic */ getBizLog length;

        equals(getBizLog getbizlog, String str) {
            this.length = getbizlog;
            this.getMin = str;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((appId) obj).revokeSaving((requestHeader) this.length.addMobileEnvInfo(new requestHeader(this.getMin)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/source/network/response/GoalTopUpInitResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/SavingFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMax<F, S> implements addAnimatorUpdateListener.getMax<appId, rpcV2> {
        final /* synthetic */ String getMin;
        final /* synthetic */ getBizLog setMin;

        getMax(getBizLog getbizlog, String str) {
            this.setMin = getbizlog;
            this.getMin = str;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((appId) obj).initSavingTopUp((appKey) this.setMin.addMobileEnvInfo(new appKey(this.getMin)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/source/network/response/SavingDetailResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/SavingFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMin<F, S> implements addAnimatorUpdateListener.getMax<appId, shortLinkOnly> {
        final /* synthetic */ long getMax;
        final /* synthetic */ getBizLog getMin;
        final /* synthetic */ long setMax;
        final /* synthetic */ String setMin;

        getMin(getBizLog getbizlog, String str, long j, long j2) {
            this.getMin = getbizlog;
            this.setMin = str;
            this.getMax = j;
            this.setMax = j2;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((appId) obj).getSavingDetail((urgent) this.getMin.addMobileEnvInfo(new urgent(this.setMin, this.getMax, this.setMax)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/source/network/response/GoalUpdateSubmitResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/SavingFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class isInside<F, S> implements addAnimatorUpdateListener.getMax<appId, shortLinkIPList> {
        final /* synthetic */ String getMax;
        final /* synthetic */ getBizLog getMin;
        final /* synthetic */ String length;
        final /* synthetic */ String setMax;
        final /* synthetic */ String setMin;

        isInside(getBizLog getbizlog, String str, String str2, String str3, String str4) {
            this.getMin = getbizlog;
            this.length = str;
            this.setMax = str2;
            this.setMin = str3;
            this.getMax = str4;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((appId) obj).updateSaving((compress) this.getMin.addMobileEnvInfo(new compress(this.length, this.setMax, this.setMin, this.getMax)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/source/network/response/UserSavingSummaryConsultResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/SavingFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class length<F, S> implements addAnimatorUpdateListener.getMax<appId, access$2100> {
        final /* synthetic */ getBizLog getMin;

        length(getBizLog getbizlog) {
            this.getMin = getbizlog;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((appId) obj).getSavingSummary((allowRetry) this.getMin.addMobileEnvInfo(new allowRetry(false, 0, 0, 7, (DefaultConstructorMarker) null)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/source/network/response/GoalCreateSubmitResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/SavingFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMax<F, S> implements addAnimatorUpdateListener.getMax<appId, allowBgLogin> {
        final /* synthetic */ String getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ String length;
        final /* synthetic */ getBizLog setMax;
        final /* synthetic */ String setMin;

        setMax(getBizLog getbizlog, String str, String str2, String str3, String str4) {
            this.setMax = getbizlog;
            this.getMin = str;
            this.length = str2;
            this.setMin = str3;
            this.getMax = str4;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((appId) obj).createSaving((resetCookie) this.setMax.addMobileEnvInfo(new resetCookie(this.getMin, this.length, this.setMin, this.getMax)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/source/network/response/GoalCreateInitResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/SavingFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMin<F, S> implements addAnimatorUpdateListener.getMax<appId, disableEncrypt> {
        final /* synthetic */ getBizLog getMin;

        setMin(getBizLog getbizlog) {
            this.getMin = getbizlog;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((appId) obj).initSavingCreate(this.getMin.addMobileEnvInfo(new BaseRpcRequest()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/source/network/response/SavingTopUpSubmitResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/SavingFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<F, S> implements addAnimatorUpdateListener.getMax<appId, enableEncrypt> {
        final /* synthetic */ String getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ String length;
        final /* synthetic */ getBizLog setMin;

        toFloatRange(getBizLog getbizlog, String str, String str2, String str3) {
            this.setMin = getbizlog;
            this.length = str;
            this.getMin = str2;
            this.getMax = str3;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((appId) obj).topUpSaving((tinyAppId) this.setMin.addMobileEnvInfo(new tinyAppId(this.length, this.getMin, this.getMax)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/saving/repository/source/network/response/GoalUpdateInitResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/saving/repository/source/network/SavingFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<F, S> implements addAnimatorUpdateListener.getMax<appId, rpcLoggerLevel> {
        final /* synthetic */ getBizLog length;
        final /* synthetic */ String setMin;

        toIntRange(getBizLog getbizlog, String str) {
            this.length = getbizlog;
            this.setMin = str;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((appId) obj).initSavingUpdate((extParasm) this.length.addMobileEnvInfo(new extParasm(this.setMin)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getBizLog(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "securityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final Class<appId> getFacadeClass() {
        return appId.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<access$2100> getSavingSummary() {
        TitleBarRightButtonView.AnonymousClass1<access$2100> wrapper = wrapper(new length(this));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.get…EnvInfo()\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<shortLinkOnly> getSavingDetail(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        TitleBarRightButtonView.AnonymousClass1<shortLinkOnly> wrapper = wrapper(new getMin(this, str, j, j2));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.get…EnvInfo()\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<disableEncrypt> initSavingCreate() {
        TitleBarRightButtonView.AnonymousClass1<disableEncrypt> wrapper = wrapper(new setMin(this));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.ini…EnvInfo()\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<allowBgLogin> createSaving(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "requestId");
        Intrinsics.checkNotNullParameter(str2, "categoryCode");
        Intrinsics.checkNotNullParameter(str3, "title");
        Intrinsics.checkNotNullParameter(str4, "targetAmount");
        TitleBarRightButtonView.AnonymousClass1<allowBgLogin> wrapper = wrapper(new setMax(this, str, str2, str3, str4));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.cre…EnvInfo()\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<rpcLoggerLevel> initSavingUpdate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        TitleBarRightButtonView.AnonymousClass1<rpcLoggerLevel> wrapper = wrapper(new toIntRange(this, str));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.ini…EnvInfo()\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<shortLinkIPList> updateSaving(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(38861454, oncanceled);
            onCancelLoad.getMin(38861454, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "categoryCode");
        Intrinsics.checkNotNullParameter(str3, "title");
        Intrinsics.checkNotNullParameter(str4, "targetAmount");
        TitleBarRightButtonView.AnonymousClass1<shortLinkIPList> wrapper = wrapper(new isInside(this, str, str2, str3, str4));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.upd…EnvInfo()\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<allowNonNet> revokeSaving(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        TitleBarRightButtonView.AnonymousClass1<allowNonNet> wrapper = wrapper(new equals(this, str));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.rev…EnvInfo()\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<rpcV2> initSavingTopUp(@NotNull String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-990061013, oncanceled);
            onCancelLoad.getMin(-990061013, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "savingId");
        TitleBarRightButtonView.AnonymousClass1<rpcV2> wrapper = wrapper(new getMax(this, str));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.ini…EnvInfo()\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<enableEncrypt> topUpSaving(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "fundAmount");
        Intrinsics.checkNotNullParameter(str3, "requestId");
        TitleBarRightButtonView.AnonymousClass1<enableEncrypt> wrapper = wrapper(new toFloatRange(this, str, str2, str3));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.top…EnvInfo()\n        )\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<needSignature> initSavingWithdraw(@NotNull getInstanceForApplication getinstanceforapplication) {
        Intrinsics.checkNotNullParameter(getinstanceforapplication, "savingWithdrawInitRequest");
        TitleBarRightButtonView.AnonymousClass1<needSignature> wrapper = wrapper(new IsOverlapping(this, getinstanceforapplication));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n            it…obileEnvInfo())\n        }");
        return wrapper;
    }

    /* access modifiers changed from: private */
    public final <T extends BaseRpcRequest> T addMobileEnvInfo(T t) {
        t.envInfo = generateMobileEnvInfo();
        return t;
    }
}
