package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface MonitoredResourceDescriptorOrBuilder extends MessageLiteOrBuilder {
    String getDescription();

    ByteString getDescriptionBytes();

    String getDisplayName();

    ByteString getDisplayNameBytes();

    LabelDescriptor getLabels(int i);

    int getLabelsCount();

    List<LabelDescriptor> getLabelsList();

    LaunchStage getLaunchStage();

    int getLaunchStageValue();

    String getName();

    ByteString getNameBytes();

    String getType();

    ByteString getTypeBytes();
}
