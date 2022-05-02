package com.alibaba.ariver.engine.common.extension.bind;

import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class NodeBinder implements Binder<BindingNode, Node> {

    /* renamed from: a  reason: collision with root package name */
    private Node f8985a;

    public NodeBinder(Node node) {
        this.f8985a = node;
    }

    public Node bind(Class<Node> cls, BindingNode bindingNode) {
        Node a2 = a(bindingNode.value(), this.f8985a);
        if (a2 == null) {
            StringBuilder sb = new StringBuilder("Cannot find scope for node: ");
            sb.append(this.f8985a);
            sb.append(" scope: ");
            sb.append(bindingNode.value());
            RVLogger.w("AriverApp:NodeBinder", sb.toString());
        }
        return a2;
    }

    private Node a(Class<? extends Scope> cls, Node node) {
        Class scopeType;
        while (node != null && (node instanceof Scope) && (scopeType = ((Scope) node).getScopeType()) != null) {
            if (scopeType.equals(cls)) {
                return node;
            }
            node = node.getParentNode();
        }
        return null;
    }
}
