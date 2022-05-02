package com.google.longrunning;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface OperationInfoOrBuilder extends MessageLiteOrBuilder {
    String getMetadataType();

    ByteString getMetadataTypeBytes();

    String getResponseType();

    ByteString getResponseTypeBytes();
}
