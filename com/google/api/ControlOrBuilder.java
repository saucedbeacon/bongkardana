package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ControlOrBuilder extends MessageLiteOrBuilder {
    String getEnvironment();

    ByteString getEnvironmentBytes();
}
