package o;

import java.io.Serializable;

public final class ack implements Serializable {
    public static final ack DOUBLE_MARK = new ack(3);
    private static final int ID_DOUBLE_MARK = 3;
    private static final int ID_NOT_FOUND = 1;
    private static final int ID_NULL_VALUE = 2;
    public static final ack NOT_FOUND = new ack(1);
    public static final ack NULL_VALUE = new ack(2);
    static final long serialVersionUID = -4320556826714577259L;
    private final int tagId;

    private ack(int i) {
        this.tagId = i;
    }

    public final Object readResolve() {
        int i = this.tagId;
        if (i == 1) {
            return NOT_FOUND;
        }
        if (i == 2) {
            return NULL_VALUE;
        }
        if (i == 3) {
            return DOUBLE_MARK;
        }
        throw new IllegalStateException(String.valueOf(this.tagId));
    }

    public final String toString() {
        String str;
        int i = this.tagId;
        if (i == 1) {
            str = "NOT_FOUND";
        } else if (i == 2) {
            str = "NULL_VALUE";
        } else if (i == 3) {
            str = "DOUBLE_MARK";
        } else {
            throw getStyleId.setMin();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }
}
