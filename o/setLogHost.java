package o;

public abstract class setLogHost implements Comparable<setLogHost> {
    private final String getMax;
    private final Class<?> length;

    public abstract void length(Object obj, Object obj2) throws Exception;

    public boolean setMax() {
        return true;
    }

    public abstract Class<?>[] setMin();

    public /* synthetic */ int compareTo(Object obj) {
        return length().compareTo(((setLogHost) obj).length());
    }

    public setLogHost(String str, Class<?> cls) {
        this.getMax = str;
        this.length = cls;
    }

    public Class<?> getMax() {
        return this.length;
    }

    public String length() {
        return this.getMax;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(length());
        sb.append(" of ");
        sb.append(getMax());
        return sb.toString();
    }

    public int hashCode() {
        return length().hashCode() + getMax().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof setLogHost) {
            setLogHost setloghost = (setLogHost) obj;
            if (!length().equals(setloghost.length()) || !getMax().equals(setloghost.getMax())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
