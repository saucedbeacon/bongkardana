package o;

final class writeStringArray implements RedDotDrawable {
    private final readBytes setMax;

    public writeStringArray(readBytes readbytes) {
        this.setMax = readbytes;
    }

    public final Object apply(Object obj) {
        return this.setMax.transformMission((onInterrupt) obj);
    }
}
