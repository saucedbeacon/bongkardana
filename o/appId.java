package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0017H'J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u001aH'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001dH'J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020 H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lid/dana/data/saving/repository/source/network/SavingFacade;", "", "createSaving", "Lid/dana/data/saving/repository/source/network/response/GoalCreateSubmitResult;", "request", "Lid/dana/data/saving/repository/source/network/request/UserGoalCreateSubmitRequest;", "getSavingDetail", "Lid/dana/data/saving/repository/source/network/response/SavingDetailResult;", "Lid/dana/data/saving/repository/source/network/request/SavingDetailRequest;", "getSavingSummary", "Lid/dana/data/saving/repository/source/network/response/UserSavingSummaryConsultResult;", "Lid/dana/data/saving/repository/source/network/request/UserSavingSummaryConsultRequest;", "initSavingCreate", "Lid/dana/data/saving/repository/source/network/response/GoalCreateInitResult;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "initSavingTopUp", "Lid/dana/data/saving/repository/source/network/response/GoalTopUpInitResult;", "Lid/dana/data/saving/repository/source/network/request/GoalTopUpInitRequest;", "initSavingUpdate", "Lid/dana/data/saving/repository/source/network/response/GoalUpdateInitResult;", "Lid/dana/data/saving/repository/source/network/request/GoalUpdateInitRequest;", "initSavingWithdraw", "Lid/dana/data/saving/repository/source/network/response/SavingWithdrawInitEntityResult;", "Lid/dana/data/saving/repository/source/network/request/SavingWithdrawInitEntityRequest;", "revokeSaving", "Lid/dana/data/saving/repository/source/network/response/GoalRevokeResult;", "Lid/dana/data/saving/repository/source/network/request/GoalRevokeRequest;", "topUpSaving", "Lid/dana/data/saving/repository/source/network/response/SavingTopUpSubmitResult;", "Lid/dana/data/saving/repository/source/network/request/SavingTopUpSubmitRequest;", "updateSaving", "Lid/dana/data/saving/repository/source/network/response/GoalUpdateSubmitResult;", "Lid/dana/data/saving/repository/source/network/request/GoalUpdateSubmitRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface appId {
    @OperationType("dana.saving.add.submit")
    @NotNull
    @SignCheck
    allowBgLogin createSaving(@NotNull resetCookie resetcookie);

    @OperationType("dana.saving.summary.detail")
    @NotNull
    @SignCheck
    shortLinkOnly getSavingDetail(@NotNull urgent urgent);

    @OperationType("dana.saving.summary.consult")
    @NotNull
    @SignCheck
    access$2100 getSavingSummary(@NotNull allowRetry allowretry);

    @OperationType("dana.saving.add.init")
    @NotNull
    @SignCheck
    disableEncrypt initSavingCreate(@NotNull BaseRpcRequest baseRpcRequest);

    @OperationType("dana.saving.topup.init")
    @NotNull
    @SignCheck
    rpcV2 initSavingTopUp(@NotNull appKey appkey);

    @OperationType("dana.saving.update.init")
    @NotNull
    @SignCheck
    rpcLoggerLevel initSavingUpdate(@NotNull extParasm extparasm);

    @OperationType("dana.saving.withdraw.init")
    @NotNull
    @SignCheck
    needSignature initSavingWithdraw(@NotNull bgRpc bgrpc);

    @OperationType("dana.saving.revoke.submit")
    @NotNull
    @SignCheck
    allowNonNet revokeSaving(@NotNull requestHeader requestheader);

    @OperationType("dana.saving.topup.submit")
    @NotNull
    @SignCheck
    enableEncrypt topUpSaving(@NotNull tinyAppId tinyappid);

    @OperationType("dana.saving.update.submit")
    @NotNull
    @SignCheck
    shortLinkIPList updateSaving(@NotNull compress compress);
}
