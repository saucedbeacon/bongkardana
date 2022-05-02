package o;

import id.dana.di.modules.PaymentSettingModule;
import o.FileMangerBridgeExtension;
import o.b;

public final class ActivityHelperExtension implements getAdapterPosition<FileMangerBridgeExtension.AnonymousClass1.getMax> {
    private final PaymentSettingModule length;
    private final b.C0007b<uploadFileByHttp> setMin;

    public static FileMangerBridgeExtension.AnonymousClass1.getMax getMin(PaymentSettingModule paymentSettingModule, uploadFileByHttp uploadfilebyhttp) {
        FileMangerBridgeExtension.AnonymousClass1.getMax length2 = paymentSettingModule.length(uploadfilebyhttp);
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        FileMangerBridgeExtension.AnonymousClass1.getMax length2 = this.length.length(this.setMin.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
