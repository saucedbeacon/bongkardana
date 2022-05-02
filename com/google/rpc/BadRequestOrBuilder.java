package com.google.rpc;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.BadRequest;
import java.util.List;

public interface BadRequestOrBuilder extends MessageLiteOrBuilder {
    BadRequest.FieldViolation getFieldViolations(int i);

    int getFieldViolationsCount();

    List<BadRequest.FieldViolation> getFieldViolationsList();
}
