package com.google.common.graph;

import com.google.common.annotations.Beta;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
public abstract class AbstractGraph<N> extends AbstractBaseGraph<N> implements Graph<N> {
    public /* bridge */ /* synthetic */ int degree(Object obj) {
        return super.degree(obj);
    }

    public /* bridge */ /* synthetic */ Set edges() {
        return super.edges();
    }

    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(EndpointPair endpointPair) {
        return super.hasEdgeConnecting(endpointPair);
    }

    public /* bridge */ /* synthetic */ boolean hasEdgeConnecting(Object obj, Object obj2) {
        return super.hasEdgeConnecting(obj, obj2);
    }

    public /* bridge */ /* synthetic */ int inDegree(Object obj) {
        return super.inDegree(obj);
    }

    public /* bridge */ /* synthetic */ ElementOrder incidentEdgeOrder() {
        return super.incidentEdgeOrder();
    }

    public /* bridge */ /* synthetic */ Set incidentEdges(Object obj) {
        return super.incidentEdges(obj);
    }

    public /* bridge */ /* synthetic */ int outDegree(Object obj) {
        return super.outDegree(obj);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Graph)) {
            return false;
        }
        Graph graph = (Graph) obj;
        return isDirected() == graph.isDirected() && nodes().equals(graph.nodes()) && edges().equals(graph.edges());
    }

    public final int hashCode() {
        return edges().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("isDirected: ");
        sb.append(isDirected());
        sb.append(", allowsSelfLoops: ");
        sb.append(allowsSelfLoops());
        sb.append(", nodes: ");
        sb.append(nodes());
        sb.append(", edges: ");
        sb.append(edges());
        return sb.toString();
    }
}
