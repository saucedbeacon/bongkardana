package com.google.longrunning;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ListOperationsResponseOrBuilder extends MessageLiteOrBuilder {
    String getNextPageToken();

    ByteString getNextPageTokenBytes();

    Operation getOperations(int i);

    int getOperationsCount();

    List<Operation> getOperationsList();
}
