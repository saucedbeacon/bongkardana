package o;

import java.util.List;

final class setFailCode implements RedDotDrawable {
    private final Event$Stub setMax;

    public setFailCode(Event$Stub event$Stub) {
        this.setMax = event$Stub;
    }

    public final Object apply(Object obj) {
        return this.setMax.transform((List<createChannelWithBuffer>) (List) obj);
    }
}
