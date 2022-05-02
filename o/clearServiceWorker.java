package o;

import java.util.List;

final class clearServiceWorker implements RedDotDrawable {
    private final H5UCProvider length;

    public clearServiceWorker(H5UCProvider h5UCProvider) {
        this.length = h5UCProvider;
    }

    public final Object apply(Object obj) {
        return this.length.getBalance((List) obj);
    }
}
