package com.google.common.graph;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

interface GraphConnections<N, V> {
    void addPredecessor(N n, V v);

    @CanIgnoreReturnValue
    V addSuccessor(N n, V v);

    Set<N> adjacentNodes();

    Iterator<EndpointPair<N>> incidentEdgeIterator(N n);

    Set<N> predecessors();

    void removePredecessor(N n);

    @CanIgnoreReturnValue
    V removeSuccessor(N n);

    Set<N> successors();

    @NullableDecl
    V value(N n);
}
