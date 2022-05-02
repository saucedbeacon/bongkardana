package o;

import o.b;

public final class dip2px implements getAdapterPosition<CollectionUtils> {
    private final b.C0007b<isValueEqule> withdrawInitMethodOptionResultMapperProvider;

    public dip2px(b.C0007b<isValueEqule> bVar) {
        this.withdrawInitMethodOptionResultMapperProvider = bVar;
    }

    public final CollectionUtils get() {
        return newInstance(this.withdrawInitMethodOptionResultMapperProvider.get());
    }

    public static dip2px create(b.C0007b<isValueEqule> bVar) {
        return new dip2px(bVar);
    }

    public static CollectionUtils newInstance(isValueEqule isvalueequle) {
        return new CollectionUtils(isvalueequle);
    }
}
