package o;

import android.graphics.Bitmap;
import com.alipay.iap.android.wallet.acl.base.APIContext;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.foundation.code.CodeImageOption;
import com.alipay.iap.android.wallet.foundation.code.CodeService;
import com.alipay.iap.android.wallet.foundation.code.ScannerOption;
import com.alipay.iap.android.wallet.foundation.code.ScannerResult;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J(\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¨\u0006\u000f"}, d2 = {"Lid/dana/data/miniprogram/provider/CodeServiceProvider;", "Lcom/alipay/iap/android/wallet/foundation/code/CodeService;", "()V", "generateCodeImage", "Landroid/graphics/Bitmap;", "option", "Lcom/alipay/iap/android/wallet/foundation/code/CodeImageOption;", "apiContext", "Lcom/alipay/iap/android/wallet/acl/base/APIContext;", "scan", "", "Lcom/alipay/iap/android/wallet/foundation/code/ScannerOption;", "callback", "Lcom/alipay/iap/android/wallet/acl/base/Callback;", "Lcom/alipay/iap/android/wallet/foundation/code/ScannerResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getNode implements CodeService {
    public final void scan(@NotNull ScannerOption scannerOption, @Nullable APIContext aPIContext, @NotNull Callback<ScannerResult> callback) {
        Intrinsics.checkNotNullParameter(scannerOption, "option");
        Intrinsics.checkNotNullParameter(callback, "callback");
        throw new NotImplementedError("An operation is not implemented: ".concat("VAS20-2160 by Regina F."));
    }

    @NotNull
    public final Bitmap generateCodeImage(@NotNull CodeImageOption codeImageOption, @Nullable APIContext aPIContext) {
        Intrinsics.checkNotNullParameter(codeImageOption, "option");
        throw new NotImplementedError("An operation is not implemented: ".concat("VAS20-2160 by Regina F."));
    }
}
