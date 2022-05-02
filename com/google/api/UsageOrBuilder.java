package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface UsageOrBuilder extends MessageLiteOrBuilder {
    String getProducerNotificationChannel();

    ByteString getProducerNotificationChannelBytes();

    String getRequirements(int i);

    ByteString getRequirementsBytes(int i);

    int getRequirementsCount();

    List<String> getRequirementsList();

    UsageRule getRules(int i);

    int getRulesCount();

    List<UsageRule> getRulesList();
}
