package o;

import java.io.IOException;

public abstract class DataflowMonitorModel implements recordWsHsTime {
    private final recordWsHsTime length;

    public DataflowMonitorModel(recordWsHsTime recordwshstime) {
        if (recordwshstime != null) {
            this.length = recordwshstime;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final recordWsHsTime setMin() {
        return this.length;
    }

    public long a_(submitLazy submitlazy, long j) throws IOException {
        return this.length.a_(submitlazy, j);
    }

    public final recordSSLTime getMin() {
        return this.length.getMin();
    }

    public void close() throws IOException {
        this.length.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.length.toString());
        sb.append(")");
        return sb.toString();
    }
}
