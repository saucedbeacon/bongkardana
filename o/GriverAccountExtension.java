package o;

import id.dana.di.modules.PaymentSettingModule;
import o.FileMangerBridgeExtension;

public final class GriverAccountExtension implements getAdapterPosition<FileMangerBridgeExtension.AnonymousClass1.length> {
    private final PaymentSettingModule getMax;

    public static FileMangerBridgeExtension.AnonymousClass1.length getMin(PaymentSettingModule paymentSettingModule) {
        FileMangerBridgeExtension.AnonymousClass1.length min = paymentSettingModule.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        FileMangerBridgeExtension.AnonymousClass1.length min = this.getMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
