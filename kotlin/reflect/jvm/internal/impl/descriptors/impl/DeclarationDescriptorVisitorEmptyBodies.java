package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;

public class DeclarationDescriptorVisitorEmptyBodies<R, D> implements DeclarationDescriptorVisitor<R, D> {
    public R visitDeclarationDescriptor(DeclarationDescriptor declarationDescriptor, D d) {
        return null;
    }

    public R visitVariableDescriptor(VariableDescriptor variableDescriptor, D d) {
        return visitDeclarationDescriptor(variableDescriptor, d);
    }

    public R visitFunctionDescriptor(FunctionDescriptor functionDescriptor, D d) {
        return visitDeclarationDescriptor(functionDescriptor, d);
    }

    public R visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, D d) {
        return visitDeclarationDescriptor(typeParameterDescriptor, d);
    }

    public R visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, D d) {
        return visitDeclarationDescriptor(packageFragmentDescriptor, d);
    }

    public R visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, D d) {
        return visitDeclarationDescriptor(packageViewDescriptor, d);
    }

    public R visitClassDescriptor(ClassDescriptor classDescriptor, D d) {
        return visitDeclarationDescriptor(classDescriptor, d);
    }

    public R visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, D d) {
        return visitDeclarationDescriptor(typeAliasDescriptor, d);
    }

    public R visitModuleDeclaration(ModuleDescriptor moduleDescriptor, D d) {
        return visitDeclarationDescriptor(moduleDescriptor, d);
    }

    public R visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, D d) {
        return visitFunctionDescriptor(constructorDescriptor, d);
    }

    public R visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, D d) {
        return visitVariableDescriptor(propertyDescriptor, d);
    }

    public R visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, D d) {
        return visitVariableDescriptor(valueParameterDescriptor, d);
    }

    public R visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, D d) {
        return visitFunctionDescriptor(propertyGetterDescriptor, d);
    }

    public R visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, D d) {
        return visitFunctionDescriptor(propertySetterDescriptor, d);
    }

    public R visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, D d) {
        return visitDeclarationDescriptor(receiverParameterDescriptor, d);
    }
}
