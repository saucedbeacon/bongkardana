package o;

import id.dana.di.modules.ChangeVoucherModule;
import o.BindBitmap;

public final class decrementIdent implements getAdapterPosition<BindBitmap.setMax> {
    private final ChangeVoucherModule setMin;

    public static BindBitmap.setMax length(ChangeVoucherModule changeVoucherModule) {
        BindBitmap.setMax length = changeVoucherModule.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        BindBitmap.setMax length = this.setMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
