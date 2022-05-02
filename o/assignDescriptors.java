package o;

public final class assignDescriptors {
    public String getMax;
    public String length;

    assignDescriptors() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CssProperty{key='");
        sb.append(this.getMax);
        sb.append('\'');
        sb.append(", value='");
        sb.append(this.length);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
