package o;

import org.yaml.snakeyaml.nodes.NodeId;

public final class getBizExternParams extends getLanguage {
    private getLanguage getMin;

    public final NodeId length() {
        return NodeId.anchor;
    }

    public getBizExternParams(getLanguage getlanguage) {
        super(getlanguage.setMax, getlanguage.length, getlanguage.getMin());
        this.getMin = getlanguage;
    }
}
