package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface EndpointOrBuilder extends MessageLiteOrBuilder {
    @Deprecated
    String getAliases(int i);

    @Deprecated
    ByteString getAliasesBytes(int i);

    @Deprecated
    int getAliasesCount();

    @Deprecated
    List<String> getAliasesList();

    boolean getAllowCors();

    String getFeatures(int i);

    ByteString getFeaturesBytes(int i);

    int getFeaturesCount();

    List<String> getFeaturesList();

    String getName();

    ByteString getNameBytes();

    String getTarget();

    ByteString getTargetBytes();
}
