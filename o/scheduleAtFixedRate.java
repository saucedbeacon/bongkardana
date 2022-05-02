package o;

import java.io.IOException;

public abstract class scheduleAtFixedRate implements recordDnsTime {
    private final recordDnsTime setMax;

    public scheduleAtFixedRate(recordDnsTime recorddnstime) {
        if (recorddnstime != null) {
            this.setMax = recorddnstime;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void setMin(submitLazy submitlazy, long j) throws IOException {
        this.setMax.setMin(submitlazy, j);
    }

    public void flush() throws IOException {
        this.setMax.flush();
    }

    public final recordSSLTime getMin() {
        return this.setMax.getMin();
    }

    public void close() throws IOException {
        this.setMax.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.setMax.toString());
        sb.append(")");
        return sb.toString();
    }
}
