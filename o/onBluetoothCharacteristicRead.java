package o;

import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alipay.iap.android.wallet.acl.WalletServiceManager;
import com.alipay.iap.android.wallet.acl.base.BaseService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u0004\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006H\b¨\u0006\u0007"}, d2 = {"Lid/dana/domain/util/AlipayConnectUtils;", "", "()V", "registerProvider", "", "T", "Lcom/alipay/iap/android/wallet/acl/base/BaseService;", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class onBluetoothCharacteristicRead {
    @NotNull
    public static final onBluetoothCharacteristicRead INSTANCE = new onBluetoothCharacteristicRead();

    private onBluetoothCharacteristicRead() {
    }

    public final /* synthetic */ <T extends BaseService> boolean registerProvider() {
        try {
            WalletServiceManager instance = WalletServiceManager.getInstance();
            Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
            instance.registerServices(BaseService.class);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
