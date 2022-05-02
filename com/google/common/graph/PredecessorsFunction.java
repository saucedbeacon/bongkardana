package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;

@Beta
@DoNotMock("Implement with a lambda, or use GraphBuilder to build a Graph with the desired edges")
public interface PredecessorsFunction<N> {
    Iterable<? extends N> predecessors(N n);
}
