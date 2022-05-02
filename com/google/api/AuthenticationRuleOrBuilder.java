package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface AuthenticationRuleOrBuilder extends MessageLiteOrBuilder {
    boolean getAllowWithoutCredential();

    OAuthRequirements getOauth();

    AuthRequirement getRequirements(int i);

    int getRequirementsCount();

    List<AuthRequirement> getRequirementsList();

    String getSelector();

    ByteString getSelectorBytes();

    boolean hasOauth();
}
