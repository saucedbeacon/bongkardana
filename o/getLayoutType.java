package o;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.List;
import o.InitParams;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.nodes.NodeId;

public final class getLayoutType extends putBizExternParams<addSPMPage> {
    public List<addSPMPage> getMin;
    public boolean setMin = false;

    public getLayoutType(getLastPage getlastpage, boolean z, List<addSPMPage> list, InitParams.AnonymousClass1 r4, DumperOptions.FlowStyle flowStyle) {
        super(getlastpage, r4, flowStyle);
        if (list != null) {
            this.getMin = list;
            this.toString = z;
            return;
        }
        throw new NullPointerException("value in a Node is required.");
    }

    public final NodeId length() {
        return NodeId.mapping;
    }

    public final List<addSPMPage> setMin() {
        return this.getMin;
    }

    public final void getMax(Class<? extends Object> cls) {
        for (addSPMPage addspmpage : this.getMin) {
            getLanguage getlanguage = addspmpage.getMax;
            if (!cls.isAssignableFrom(getlanguage.toFloatRange)) {
                getlanguage.toFloatRange = cls;
            }
        }
    }

    public final void setMin(Class<? extends Object> cls, Class<? extends Object> cls2) {
        for (addSPMPage next : this.getMin) {
            getLanguage getlanguage = next.length;
            if (!cls2.isAssignableFrom(getlanguage.toFloatRange)) {
                getlanguage.toFloatRange = cls2;
            }
            getLanguage getlanguage2 = next.getMax;
            if (!cls.isAssignableFrom(getlanguage2.toFloatRange)) {
                getlanguage2.toFloatRange = cls;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (addSPMPage next : this.getMin) {
            sb.append("{ key=");
            sb.append(next.getMax);
            sb.append("; value=");
            if (next.length instanceof putBizExternParams) {
                sb.append(System.identityHashCode(next.length));
            } else {
                sb.append(next.toString());
            }
            sb.append(" }");
        }
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder(SimpleComparison.LESS_THAN_OPERATION);
        sb2.append(getClass().getName());
        sb2.append(" (tag=");
        sb2.append(this.setMax);
        sb2.append(", values=");
        sb2.append(obj);
        sb2.append(")>");
        return sb2.toString();
    }

    public final boolean getMax() {
        return this.setMin;
    }
}
