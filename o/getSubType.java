package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/data/user/source/network/result/UpdateUserInfoResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "()V", "toUserProfileResponse", "Lid/dana/domain/user/UserProfileResponse;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getSubType extends BaseRpcResult {
    @NotNull
    public final disconnectAllDevices toUserProfileResponse() {
        boolean z = this.success;
        String str = this.errorCode;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = this.errorMessage;
        if (str3 != null) {
            str2 = str3;
        }
        return new disconnectAllDevices(z, str, str2);
    }
}
