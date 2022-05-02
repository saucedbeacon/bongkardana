package com.google.cloud.audit;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface AuthorizationInfoOrBuilder extends MessageLiteOrBuilder {
    boolean getGranted();

    String getPermission();

    ByteString getPermissionBytes();

    String getResource();

    ByteString getResourceBytes();
}
