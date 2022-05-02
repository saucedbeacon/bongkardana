package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface PageOrBuilder extends MessageLiteOrBuilder {
    String getContent();

    ByteString getContentBytes();

    String getName();

    ByteString getNameBytes();

    Page getSubpages(int i);

    int getSubpagesCount();

    List<Page> getSubpagesList();
}
