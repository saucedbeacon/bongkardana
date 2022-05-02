package o;

import id.dana.di.modules.SplitBillModule;
import o.AUNoticeDialog;

public final class GriverKVStorageProxy implements getAdapterPosition<AUNoticeDialog.OnClickNegativeListener.setMax> {
    private final SplitBillModule setMax;

    private GriverKVStorageProxy(SplitBillModule splitBillModule) {
        this.setMax = splitBillModule;
    }

    public static GriverKVStorageProxy setMin(SplitBillModule splitBillModule) {
        return new GriverKVStorageProxy(splitBillModule);
    }

    public final /* synthetic */ Object get() {
        AUNoticeDialog.OnClickNegativeListener.setMax min = this.setMax.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
