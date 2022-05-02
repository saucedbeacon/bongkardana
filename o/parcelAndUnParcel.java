package o;

final class parcelAndUnParcel implements RedDotDrawable {
    private final px2dip setMax;

    public parcelAndUnParcel(px2dip px2dip) {
        this.setMax = px2dip;
    }

    public final Object apply(Object obj) {
        return this.setMax.apply(obj);
    }
}
