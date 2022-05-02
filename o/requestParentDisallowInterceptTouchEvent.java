package o;

import id.dana.contract.payasset.ChangePayMethodModule;
import o.b;
import o.beginFakeDrag;

public final class requestParentDisallowInterceptTouchEvent implements getAdapterPosition<beginFakeDrag.setMax> {
    private final b.C0007b<onSecondaryPointerUp> setMax;
    private final ChangePayMethodModule setMin;

    private requestParentDisallowInterceptTouchEvent(ChangePayMethodModule changePayMethodModule, b.C0007b<onSecondaryPointerUp> bVar) {
        this.setMin = changePayMethodModule;
        this.setMax = bVar;
    }

    public static requestParentDisallowInterceptTouchEvent setMax(ChangePayMethodModule changePayMethodModule, b.C0007b<onSecondaryPointerUp> bVar) {
        return new requestParentDisallowInterceptTouchEvent(changePayMethodModule, bVar);
    }

    public final /* synthetic */ Object get() {
        beginFakeDrag.setMax max = this.setMin.setMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
