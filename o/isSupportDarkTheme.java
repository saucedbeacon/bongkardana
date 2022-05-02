package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/data/globalnetwork/source/network/facade/GlobalNetworkFacade;", "", "gnConsult", "Lid/dana/data/globalnetwork/model/GnConsultResult;", "gnConsultRequest", "Lid/dana/data/globalnetwork/model/GnConsultRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface isSupportDarkTheme {
    @OperationType("dana.mobilewallet.gn.consult")
    @NotNull
    @SignCheck
    PageContainer gnConsult(@NotNull enableShowErrorPage enableshowerrorpage);
}
