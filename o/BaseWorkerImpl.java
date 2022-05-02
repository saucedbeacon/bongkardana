package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

public class BaseWorkerImpl extends BaseRpcRequest implements Serializable {
    public String otpValue;
    public String phoneNumber;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/data/ott/repository/source/OttEntityData;", "", "getOttVerify", "Lio/reactivex/Observable;", "Lid/dana/data/ott/OttVerifyEntity;", "ottValue", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface RenderReadyListener {
        @NotNull
        TitleBarRightButtonView.AnonymousClass1<isPrestarted> setMax(@NotNull String str);
    }
}
