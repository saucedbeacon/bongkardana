package o;

import com.j256.ormlite.stmt.query.SimpleComparison;
import o.InitParams;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.nodes.NodeId;

public final class addPage extends getLanguage {
    public String getMin;
    private DumperOptions.ScalarStyle setMin;

    public addPage(getLastPage getlastpage, boolean z, String str, InitParams.AnonymousClass1 r4, InitParams.AnonymousClass1 r5, DumperOptions.ScalarStyle scalarStyle) {
        super(getlastpage, r4, r5);
        if (str != null) {
            this.getMin = str;
            if (scalarStyle != null) {
                this.setMin = scalarStyle;
                this.toString = z;
                return;
            }
            throw new NullPointerException("Scalar style must be provided.");
        }
        throw new NullPointerException("value in a Node is required.");
    }

    public final NodeId length() {
        return NodeId.scalar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(SimpleComparison.LESS_THAN_OPERATION);
        sb.append(getClass().getName());
        sb.append(" (tag=");
        sb.append(this.setMax);
        sb.append(", value=");
        sb.append(this.getMin);
        sb.append(")>");
        return sb.toString();
    }
}
