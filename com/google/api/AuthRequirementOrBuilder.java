package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface AuthRequirementOrBuilder extends MessageLiteOrBuilder {
    String getAudiences();

    ByteString getAudiencesBytes();

    String getProviderId();

    ByteString getProviderIdBytes();
}
