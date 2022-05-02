package o;

import id.dana.contract.payasset.ChangePayMethodModule;
import o.beginFakeDrag;

public final class performDrag implements getAdapterPosition<beginFakeDrag.getMin> {
    private final ChangePayMethodModule length;

    private performDrag(ChangePayMethodModule changePayMethodModule) {
        this.length = changePayMethodModule;
    }

    public static performDrag setMax(ChangePayMethodModule changePayMethodModule) {
        return new performDrag(changePayMethodModule);
    }

    public final /* synthetic */ Object get() {
        beginFakeDrag.getMin length2 = this.length.length();
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
