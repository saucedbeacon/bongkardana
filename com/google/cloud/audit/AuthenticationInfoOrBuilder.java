package com.google.cloud.audit;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface AuthenticationInfoOrBuilder extends MessageLiteOrBuilder {
    String getPrincipalEmail();

    ByteString getPrincipalEmailBytes();
}
