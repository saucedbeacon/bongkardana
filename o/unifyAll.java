package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import o.ActivityAnimBean;
import o.StartClientBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0015H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lid/dana/data/electronicmoney/ElectronicmoneyFacade;", "", "confirmUpdateBalanceEmoney", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "request", "Lid/dana/data/electronicmoney/network/request/EmoneyConfirmBalanceRequest;", "doBrizziManualReversal", "reversalData", "Lid/dana/data/electronicmoney/network/request/BrizziManualReversalRequest;", "getBrizziAccessToken", "Lid/dana/data/electronicmoney/network/response/BrizziGetAccessTokenResponse;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "getElectronicMoneyBizId", "Lid/dana/data/electronicmoney/network/response/ElectronicMoneyGetBizIdResponse;", "getReversalEmoney", "Lid/dana/data/electronicmoney/network/response/EmoneyReversalResponse;", "Lid/dana/data/electronicmoney/network/request/EmoneyReversalRequest;", "getTopUpCommandEmoney", "Lid/dana/data/electronicmoney/network/response/EmoneyCardInfoResponse;", "Lid/dana/data/electronicmoney/network/request/EmoneyTopupCommandRequest;", "inquireBalance", "Lid/dana/data/electronicmoney/network/request/EmoneyInquiryRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface unifyAll {
    @OperationType("alipayplus.mobilewallet.emoney.confirm")
    @NotNull
    @SignCheck
    BaseRpcResult confirmUpdateBalanceEmoney(@NotNull Visit visit);

    @OperationType("alipayplus.mobilewallet.emoney.brizzi.reversal")
    @NotNull
    @SignCheck
    BaseRpcResult doBrizziManualReversal(@NotNull AnimUtils animUtils);

    @OperationType("alipayplus.mobilewallet.emoney.brizzi.getAccessToken")
    @NotNull
    @SignCheck
    getAnimResId getBrizziAccessToken(@NotNull BaseRpcRequest baseRpcRequest);

    @OperationType("alipayplus.mobilewallet.product.generate.biz.id")
    @NotNull
    @SignCheck
    StartAction getElectronicMoneyBizId(@NotNull BaseRpcRequest baseRpcRequest);

    @OperationType("alipayplus.mobilewallet.emoney.reversal")
    @NotNull
    @SignCheck
    setAppLaunchParams getReversalEmoney(@NotNull ActivityAnimBean.AnonymousClass1 r1);

    @OperationType("alipayplus.mobilewallet.emoney.getTopUpCommand")
    @NotNull
    @SignCheck
    needWaitIpc getTopUpCommandEmoney(@NotNull StartClientBundle.AnonymousClass1 r1);

    @OperationType("alipayplus.mobilewallet.emoney.inquireBalance")
    @NotNull
    @SignCheck
    needWaitIpc inquireBalance(@NotNull PermissionUtil permissionUtil);
}
