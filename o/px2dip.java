package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/sendmoney/mapper/WithdrawInitMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/data/sendmoney/repository/source/network/result/WithdrawInitResult;", "Lid/dana/domain/sendmoney/model/WithdrawInit;", "withdrawInitBaseResultMapper", "Lid/dana/data/sendmoney/mapper/WithdrawInitBaseResultMapper;", "(Lid/dana/data/sendmoney/mapper/WithdrawInitBaseResultMapper;)V", "map", "oldItem", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class px2dip extends setSpeed<IpcMessageHandler, ensureMaxSize> {
    private final CollectionUtils withdrawInitBaseResultMapper;

    @Inject
    public px2dip(@NotNull CollectionUtils collectionUtils) {
        Intrinsics.checkNotNullParameter(collectionUtils, "withdrawInitBaseResultMapper");
        this.withdrawInitBaseResultMapper = collectionUtils;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final ensureMaxSize map(@Nullable IpcMessageHandler ipcMessageHandler) {
        List<getTitleAndStatusBarHeight> list = null;
        Boolean enableWithdrawSaveAccount = ipcMessageHandler != null ? ipcMessageHandler.getEnableWithdrawSaveAccount() : null;
        Integer maxNumOfAssets = ipcMessageHandler != null ? ipcMessageHandler.getMaxNumOfAssets() : null;
        Boolean needSenderName = ipcMessageHandler != null ? ipcMessageHandler.getNeedSenderName() : null;
        CollectionUtils collectionUtils = this.withdrawInitBaseResultMapper;
        if (ipcMessageHandler != null) {
            list = ipcMessageHandler.getWithdrawMethodViewList();
        }
        return new ensureMaxSize(enableWithdrawSaveAccount, maxNumOfAssets, needSenderName, (List) collectionUtils.apply(list));
    }
}
