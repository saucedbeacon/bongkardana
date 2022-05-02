package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.TransportInfo;
import com.google.protobuf.MessageLiteOrBuilder;

public interface TransportInfoOrBuilder extends MessageLiteOrBuilder {
    TransportInfo.DispatchDestination getDispatchDestination();

    boolean hasDispatchDestination();
}
