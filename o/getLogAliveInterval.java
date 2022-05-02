package o;

import java.util.regex.Pattern;

final class getLogAliveInterval {
    final getLastPage getMin;
    final Pattern length;

    public getLogAliveInterval(getLastPage getlastpage, Pattern pattern) {
        this.getMin = getlastpage;
        this.length = pattern;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tuple tag=");
        sb.append(this.getMin);
        sb.append(" regexp=");
        sb.append(this.length);
        return sb.toString();
    }
}
