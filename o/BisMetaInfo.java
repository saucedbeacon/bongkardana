package o;

public final class BisMetaInfo {
    static final char[] getMax = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    boolean getMin = false;
    int length;
    final char[] setMax = new char[25];
    int setMin = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("[chars:");
        sb.append(new String(this.setMax, 0, this.setMin));
        sb.append(", point:");
        sb.append(this.length);
        sb.append("]");
        return sb.toString();
    }
}
