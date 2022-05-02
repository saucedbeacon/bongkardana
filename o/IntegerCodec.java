package o;

import id.dana.di.modules.ChangeVoucherModule;
import o.BindBitmap;
import o.b;

public final class IntegerCodec implements getAdapterPosition<BindBitmap.getMin> {
    private final ChangeVoucherModule length;
    private final b.C0007b<BindAnim> setMin;

    public static BindBitmap.getMin setMin(ChangeVoucherModule changeVoucherModule, BindAnim bindAnim) {
        BindBitmap.getMin length2 = changeVoucherModule.length(bindAnim);
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        BindBitmap.getMin length2 = this.length.length(this.setMin.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
