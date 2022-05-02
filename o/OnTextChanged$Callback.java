package o;

import id.dana.contract.staticqr.GetStaticQrModule;
import o.OnTouch;
import o.R;
import o.b;

public final class OnTextChanged$Callback implements getAdapterPosition<OnTouch.setMin> {
    private final GetStaticQrModule getMax;
    private final b.C0007b<R.dimen> getMin;

    private OnTextChanged$Callback(GetStaticQrModule getStaticQrModule, b.C0007b<R.dimen> bVar) {
        this.getMax = getStaticQrModule;
        this.getMin = bVar;
    }

    public static OnTextChanged$Callback length(GetStaticQrModule getStaticQrModule, b.C0007b<R.dimen> bVar) {
        return new OnTextChanged$Callback(getStaticQrModule, bVar);
    }

    public final /* synthetic */ Object get() {
        OnTouch.setMin length = this.getMax.length(this.getMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
