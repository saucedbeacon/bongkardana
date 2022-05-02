package o;

import id.dana.contract.staticqr.DecodeQrImageModule;
import o.b;
import o.callback;

public final class OnLongClick implements getAdapterPosition<callback.setMax> {
    private final DecodeQrImageModule getMax;
    private final b.C0007b<OnItemSelected$Callback> length;

    private OnLongClick(DecodeQrImageModule decodeQrImageModule, b.C0007b<OnItemSelected$Callback> bVar) {
        this.getMax = decodeQrImageModule;
        this.length = bVar;
    }

    public static OnLongClick setMax(DecodeQrImageModule decodeQrImageModule, b.C0007b<OnItemSelected$Callback> bVar) {
        return new OnLongClick(decodeQrImageModule, bVar);
    }

    public final /* synthetic */ Object get() {
        callback.setMax max = this.getMax.setMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
