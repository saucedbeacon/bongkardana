package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.Accumulator;

public final class ObjectDescriptor extends Descriptor<Object> {
    public final void getAttributes(Object obj, AttributeAccumulator attributeAccumulator) {
    }

    public final void getChildren(Object obj, Accumulator<Object> accumulator) {
    }

    public final void getComputedStyles(Object obj, ComputedStyleAccumulator computedStyleAccumulator) {
    }

    public final String getNodeValue(Object obj) {
        return null;
    }

    public final void getStyleRuleNames(Object obj, StyleRuleNameAccumulator styleRuleNameAccumulator) {
    }

    public final void getStyles(Object obj, String str, StyleAccumulator styleAccumulator) {
    }

    public final void hook(Object obj) {
    }

    public final void setAttributesAsText(Object obj, String str) {
    }

    public final void setStyle(Object obj, String str, String str2, String str3) {
    }

    public final void unhook(Object obj) {
    }

    public final NodeType getNodeType(Object obj) {
        return NodeType.ELEMENT_NODE;
    }

    public final String getNodeName(Object obj) {
        return obj.getClass().getName();
    }

    public final String getLocalName(Object obj) {
        return getNodeName(obj);
    }
}
