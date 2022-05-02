package o;

final class getPageHeightSpec implements RedDotDrawable {
    private final String length;

    public getPageHeightSpec(String str) {
        this.length = str;
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.length.equals(obj));
    }
}
