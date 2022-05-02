package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lid/dana/data/merchantmanagement/MerchantManagementEntityData;", "", "getLinkedMerchants", "Lio/reactivex/Observable;", "Lid/dana/data/merchantmanagement/repository/source/network/result/BoundMerchantResult;", "pageNumber", "", "unbindConsult", "Lid/dana/data/merchantmanagement/repository/source/network/result/UnbindConsultResult;", "clientId", "", "merchantId", "divisionId", "unbindMerchant", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "unbindMerchantRequest", "Lid/dana/data/merchantmanagement/repository/source/network/request/UnbindMerchantRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface preloadConsole {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<setNativeBridge> getLinkedMerchants(int i);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<getApplication> unbindConsult(@NotNull String str, @NotNull String str2, @Nullable String str3);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> unbindMerchant(@NotNull BaseEngineImpl baseEngineImpl);
}
