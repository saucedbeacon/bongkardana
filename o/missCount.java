package o;

public abstract class missCount implements safeSizeOf {
    private final safeSizeOf getMin;

    public missCount(safeSizeOf safesizeof) {
        if (safesizeof != null) {
            this.getMin = safesizeof;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final long length(maxSize maxsize, long j) {
        return this.getMin.length(maxsize, j);
    }

    public final loadParameters setMin() {
        return this.getMin.setMin();
    }

    public void close() {
        this.getMin.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.getMin.toString());
        sb.append(")");
        return sb.toString();
    }
}
