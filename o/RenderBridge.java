package o;

import java.util.List;

final class RenderBridge implements RedDotDrawable {
    private final setTargetExtension getMin;
    private final List length;

    public RenderBridge(setTargetExtension settargetextension, List list) {
        this.getMin = settargetextension;
        this.length = list;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$getNearbyShopsPromo$8(this.length, (EngineInitCallback) obj);
    }
}
