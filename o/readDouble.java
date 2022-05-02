package o;

final class readDouble implements RedDotDrawable {
    private final readShort length;

    public readDouble(readShort readshort) {
        this.length = readshort;
    }

    public final Object apply(Object obj) {
        return this.length.transform((freeAll) obj);
    }
}
