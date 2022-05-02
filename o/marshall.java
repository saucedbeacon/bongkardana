package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import id.dana.data.sendmoney.model.TransferMethodInfoResult;
import id.dana.data.sendmoney.model.TransferUserInfoResult;
import java.util.List;

public class marshall extends BaseRpcResult {
    @NonNull
    public boolean needSenderName;
    @Nullable
    public TransferUserInfoResult payeeUserInfo;
    @NonNull
    public TransferUserInfoResult payerUserInfo;
    @NonNull
    public List<TransferMethodInfoResult> transferMethodInfo;

    public int getFreeBankTransferCount(String str) {
        if (this.transferMethodInfo.isEmpty()) {
            return 0;
        }
        TransferMethodInfoResult bankTransferMethod = getBankTransferMethod(str);
        if (!bankTransferMethod.isNullObject()) {
            return (int) bankTransferMethod.getFreeRemainingTimes();
        }
        return 0;
    }

    private TransferMethodInfoResult getBankTransferMethod(String str) {
        for (TransferMethodInfoResult next : this.transferMethodInfo) {
            if (str.equals(next.getTransferMethod())) {
                return next;
            }
        }
        return TransferMethodInfoResult.createNullObject();
    }
}
