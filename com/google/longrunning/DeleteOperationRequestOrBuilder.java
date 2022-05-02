package com.google.longrunning;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface DeleteOperationRequestOrBuilder extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();
}
