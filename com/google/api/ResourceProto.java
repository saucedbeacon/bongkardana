package com.google.api;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import java.util.List;

public final class ResourceProto {
    public static final int RESOURCE_DEFINITION_FIELD_NUMBER = 1053;
    public static final int RESOURCE_FIELD_NUMBER = 1053;
    public static final int RESOURCE_REFERENCE_FIELD_NUMBER = 1055;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.MessageOptions, ResourceDescriptor> resource = GeneratedMessageLite.newSingularGeneratedExtension(DescriptorProtos.MessageOptions.getDefaultInstance(), ResourceDescriptor.getDefaultInstance(), ResourceDescriptor.getDefaultInstance(), (Internal.EnumLiteMap<?>) null, 1053, WireFormat.FieldType.MESSAGE, ResourceDescriptor.class);
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.FileOptions, List<ResourceDescriptor>> resourceDefinition = GeneratedMessageLite.newRepeatedGeneratedExtension(DescriptorProtos.FileOptions.getDefaultInstance(), ResourceDescriptor.getDefaultInstance(), (Internal.EnumLiteMap<?>) null, 1053, WireFormat.FieldType.MESSAGE, false, ResourceDescriptor.class);
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.FieldOptions, ResourceReference> resourceReference = GeneratedMessageLite.newSingularGeneratedExtension(DescriptorProtos.FieldOptions.getDefaultInstance(), ResourceReference.getDefaultInstance(), ResourceReference.getDefaultInstance(), (Internal.EnumLiteMap<?>) null, RESOURCE_REFERENCE_FIELD_NUMBER, WireFormat.FieldType.MESSAGE, ResourceReference.class);

    private ResourceProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add((GeneratedMessageLite.GeneratedExtension<?, ?>) resourceReference);
        extensionRegistryLite.add((GeneratedMessageLite.GeneratedExtension<?, ?>) resourceDefinition);
        extensionRegistryLite.add((GeneratedMessageLite.GeneratedExtension<?, ?>) resource);
    }
}
