package o;

import java.util.List;

final class onRenderInit implements RedDotDrawable {
    private final List getMin;

    public onRenderInit(List list) {
        this.getMin = list;
    }

    public final Object apply(Object obj) {
        return this.getMin.addAll((List) obj);
    }
}
