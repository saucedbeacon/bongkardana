package o;

import java.util.List;
import o.InitParams;
import org.yaml.snakeyaml.nodes.NodeId;

public abstract class getLanguage {
    public String IsOverlapping;
    public boolean equals;
    protected InitParams.AnonymousClass1 getMax;
    public List<setFeVer> isInside;
    public InitParams.AnonymousClass1 length;
    public getLastPage setMax;
    public List<setFeVer> toDoubleRange;
    public Class<? extends Object> toFloatRange;
    public List<setFeVer> toIntRange;
    protected boolean toString;
    protected Boolean values;

    public abstract NodeId length();

    public getLanguage(getLastPage getlastpage, InitParams.AnonymousClass1 r2, InitParams.AnonymousClass1 r3) {
        if (getlastpage != null) {
            this.setMax = getlastpage;
            this.length = r2;
            this.getMax = r3;
            this.toFloatRange = Object.class;
            this.equals = false;
            this.toString = true;
            this.values = null;
            this.isInside = null;
            this.toIntRange = null;
            this.toDoubleRange = null;
            return;
        }
        throw new NullPointerException("tag in a Node is required.");
    }

    public final InitParams.AnonymousClass1 getMin() {
        return this.getMax;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean setMax() {
        return this.equals;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean isInside() {
        Boolean bool = this.values;
        if (bool != null) {
            return bool.booleanValue();
        }
        if ((this.setMax.setMax() || !this.toString || Object.class.equals(this.toFloatRange) || this.setMax.equals(getLastPage.hashCode)) && !this.setMax.setMin(this.toFloatRange)) {
            return false;
        }
        return true;
    }

    public final void getMax(Boolean bool) {
        this.values = bool;
    }
}
