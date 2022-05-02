package o;

import org.mozilla.javascript.Token;

public final class getRoundWidth {
    private LogFactory getMax;
    setRoundColor getMin;
    int length = -1;
    String setMax;
    public int setMin;

    public getRoundWidth() {
    }

    public getRoundWidth(int i, String str) {
        this.setMax = str;
        if (i == 110 || i == 88 || i == 123 || i == 154 || i == 155) {
            this.setMin = i;
            return;
        }
        throw new IllegalArgumentException("Invalid declType: ".concat(String.valueOf(i)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Symbol (");
        sb.append(Token.setMin(this.setMin));
        sb.append(") name=");
        sb.append(this.setMax);
        if (this.getMax != null) {
            sb.append(" line=");
            sb.append(this.getMax.equals());
        }
        return sb.toString();
    }
}
