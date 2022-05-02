package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface CustomHttpPatternOrBuilder extends MessageLiteOrBuilder {
    String getKind();

    ByteString getKindBytes();

    String getPath();

    ByteString getPathBytes();
}
