package o;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.List;
import o.InitParams;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.nodes.NodeId;

public final class setLayoutType extends putBizExternParams<getLanguage> {
    public final List<getLanguage> setMin;

    public setLayoutType(getLastPage getlastpage, boolean z, List<getLanguage> list, InitParams.AnonymousClass1 r4, DumperOptions.FlowStyle flowStyle) {
        super(getlastpage, r4, flowStyle);
        this.setMin = list;
        this.toString = z;
    }

    public final NodeId length() {
        return NodeId.sequence;
    }

    public final List<getLanguage> setMin() {
        return this.setMin;
    }

    public final void setMax(Class<? extends Object> cls) {
        for (getLanguage next : this.setMin) {
            if (!cls.isAssignableFrom(next.toFloatRange)) {
                next.toFloatRange = cls;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(SimpleComparison.LESS_THAN_OPERATION);
        sb.append(getClass().getName());
        sb.append(" (tag=");
        sb.append(this.setMax);
        sb.append(", value=");
        sb.append(this.setMin);
        sb.append(")>");
        return sb.toString();
    }
}
