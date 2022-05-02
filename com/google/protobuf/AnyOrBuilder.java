package com.google.protobuf;

public interface AnyOrBuilder extends MessageLiteOrBuilder {
    String getTypeUrl();

    ByteString getTypeUrlBytes();

    ByteString getValue();
}
