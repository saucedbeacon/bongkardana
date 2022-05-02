package com.google.longrunning;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;

public final class OperationsProto {
    public static final int OPERATION_INFO_FIELD_NUMBER = 1049;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.MethodOptions, OperationInfo> operationInfo = GeneratedMessageLite.newSingularGeneratedExtension(DescriptorProtos.MethodOptions.getDefaultInstance(), OperationInfo.getDefaultInstance(), OperationInfo.getDefaultInstance(), (Internal.EnumLiteMap<?>) null, 1049, WireFormat.FieldType.MESSAGE, OperationInfo.class);

    private OperationsProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add((GeneratedMessageLite.GeneratedExtension<?, ?>) operationInfo);
    }
}
