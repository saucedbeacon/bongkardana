package id.dana.plugin.bca.base;

public class BaseEvent<I> {
    public String event;
    public I info;

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseEvent{event='");
        sb.append(this.event);
        sb.append('\'');
        sb.append(", info=");
        sb.append(this.info);
        sb.append('}');
        return sb.toString();
    }
}
