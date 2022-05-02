package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface RequestInfoOrBuilder extends MessageLiteOrBuilder {
    String getRequestId();

    ByteString getRequestIdBytes();

    String getServingData();

    ByteString getServingDataBytes();
}
