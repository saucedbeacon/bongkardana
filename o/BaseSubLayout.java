package o;

import o.getItems;

public final class BaseSubLayout implements RedDotDrawable {
    private final getItems.core length;

    public BaseSubLayout(getItems.core core) {
        this.length = core;
    }

    public final Object apply(Object obj) {
        return this.length.transform((attach) obj);
    }
}
