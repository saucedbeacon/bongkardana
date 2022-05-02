package o;

import id.dana.contract.staticqr.DecodeQrImageModule;
import o.callback;

public final class OnPageChange implements getAdapterPosition<callback.getMin> {
    private final DecodeQrImageModule length;

    private OnPageChange(DecodeQrImageModule decodeQrImageModule) {
        this.length = decodeQrImageModule;
    }

    public final class Callback implements getAdapterPosition<OnItemLongClick> {

        static final class setMin {
            /* access modifiers changed from: private */
            public static final Callback setMin = new Callback();
        }

        public static Callback setMax() {
            return setMin.setMin;
        }

        public final /* synthetic */ Object get() {
            return new OnItemLongClick();
        }
    }

    public static OnPageChange setMin(DecodeQrImageModule decodeQrImageModule) {
        return new OnPageChange(decodeQrImageModule);
    }

    public final /* synthetic */ Object get() {
        callback.getMin length2 = this.length.length();
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
