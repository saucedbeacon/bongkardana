package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\b*\u00020\nH\u0002\"\"\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"boundReceiver", "", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "getBoundReceiver", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;)Ljava/lang/Object;", "computeCallerForAccessor", "Lkotlin/reflect/jvm/internal/calls/Caller;", "isGetter", "", "isJvmFieldPropertyInCompanionObject", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "kotlin-reflection"}, k = 2, mv = {1, 4, 1})
public final class KPropertyImplKt {
    @Nullable
    public static final Object getBoundReceiver(@NotNull KPropertyImpl.Accessor<?, ?> accessor) {
        Intrinsics.checkNotNullParameter(accessor, "$this$boundReceiver");
        return accessor.getProperty().getBoundReceiver();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.calls.Caller<?> computeCallerForAccessor(kotlin.reflect.jvm.internal.KPropertyImpl.Accessor<?, ?> r7, boolean r8) {
        /*
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$Companion r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Companion
            kotlin.text.Regex r0 = r0.getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection()
            kotlin.reflect.jvm.internal.KPropertyImpl r1 = r7.getProperty()
            java.lang.String r1 = r1.getSignature()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L_0x001b
            kotlin.reflect.jvm.internal.calls.ThrowingCaller r7 = kotlin.reflect.jvm.internal.calls.ThrowingCaller.INSTANCE
            kotlin.reflect.jvm.internal.calls.Caller r7 = (kotlin.reflect.jvm.internal.calls.Caller) r7
            return r7
        L_0x001b:
            kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$1 r0 = new kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$1
            r0.<init>(r7)
            kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$2 r1 = new kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$2
            r1.<init>(r7)
            kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$3 r2 = new kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$3
            r2.<init>(r7, r8, r1, r0)
            kotlin.reflect.jvm.internal.RuntimeTypeMapper r1 = kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE
            kotlin.reflect.jvm.internal.KPropertyImpl r3 = r7.getProperty()
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r3 = r3.getDescriptor()
            kotlin.reflect.jvm.internal.JvmPropertySignature r1 = r1.mapPropertySignature(r3)
            boolean r3 = r1 instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty
            r4 = 0
            if (r3 == 0) goto L_0x0196
            kotlin.reflect.jvm.internal.JvmPropertySignature$KotlinProperty r1 = (kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty) r1
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r3 = r1.getSignature()
            if (r8 == 0) goto L_0x0050
            boolean r8 = r3.hasGetter()
            if (r8 == 0) goto L_0x005b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r8 = r3.getGetter()
            goto L_0x005c
        L_0x0050:
            boolean r8 = r3.hasSetter()
            if (r8 == 0) goto L_0x005b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r8 = r3.getSetter()
            goto L_0x005c
        L_0x005b:
            r8 = r4
        L_0x005c:
            if (r8 == 0) goto L_0x0083
            kotlin.reflect.jvm.internal.KPropertyImpl r3 = r7.getProperty()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r3 = r3.getContainer()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r5 = r1.getNameResolver()
            int r6 = r8.getName()
            java.lang.String r5 = r5.getString(r6)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r1 = r1.getNameResolver()
            int r8 = r8.getDesc()
            java.lang.String r8 = r1.getString(r8)
            java.lang.reflect.Method r8 = r3.findMethodBySignature(r5, r8)
            goto L_0x0084
        L_0x0083:
            r8 = r4
        L_0x0084:
            if (r8 != 0) goto L_0x0135
            kotlin.reflect.jvm.internal.KPropertyImpl r8 = r7.getProperty()
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r8 = r8.getDescriptor()
            kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor r8 = (kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor) r8
            boolean r8 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass(r8)
            if (r8 == 0) goto L_0x0108
            kotlin.reflect.jvm.internal.KPropertyImpl r8 = r7.getProperty()
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r8 = r8.getDescriptor()
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r8 = r8.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r0 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INTERNAL
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r0)
            if (r8 == 0) goto L_0x0108
            kotlin.reflect.jvm.internal.KPropertyImpl r8 = r7.getProperty()
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r8 = r8.getDescriptor()
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r8 = r8.getContainingDeclaration()
            java.lang.Class r8 = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.toInlineClass((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r8)
            if (r8 == 0) goto L_0x00e9
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r7.getProperty()
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r0 = r0.getDescriptor()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            java.lang.reflect.Method r8 = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.getUnboxMethod(r8, r0)
            if (r8 == 0) goto L_0x00e9
            boolean r0 = r7.isBound()
            if (r0 == 0) goto L_0x00de
            kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass$Bound r0 = new kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass$Bound
            java.lang.Object r1 = getBoundReceiver(r7)
            r0.<init>(r8, r1)
            kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass r0 = (kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass) r0
            goto L_0x00e5
        L_0x00de:
            kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass$Unbound r0 = new kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass$Unbound
            r0.<init>(r8)
            kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass r0 = (kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass) r0
        L_0x00e5:
            kotlin.reflect.jvm.internal.calls.Caller r0 = (kotlin.reflect.jvm.internal.calls.Caller) r0
            goto L_0x01d8
        L_0x00e9:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Underlying property of inline class "
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.KPropertyImpl r7 = r7.getProperty()
            r0.append(r7)
            java.lang.String r7 = " should have a field"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x0108:
            kotlin.reflect.jvm.internal.KPropertyImpl r8 = r7.getProperty()
            java.lang.reflect.Field r8 = r8.getJavaField()
            if (r8 == 0) goto L_0x011b
            kotlin.reflect.jvm.internal.calls.CallerImpl r8 = r2.invoke((java.lang.reflect.Field) r8)
            r0 = r8
            kotlin.reflect.jvm.internal.calls.Caller r0 = (kotlin.reflect.jvm.internal.calls.Caller) r0
            goto L_0x01d8
        L_0x011b:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No accessors or field is found for property "
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.KPropertyImpl r7 = r7.getProperty()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x0135:
            int r1 = r8.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L_0x015c
            boolean r0 = r7.isBound()
            if (r0 == 0) goto L_0x0151
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method$BoundInstance r0 = new kotlin.reflect.jvm.internal.calls.CallerImpl$Method$BoundInstance
            java.lang.Object r1 = getBoundReceiver(r7)
            r0.<init>(r8, r1)
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method r0 = (kotlin.reflect.jvm.internal.calls.CallerImpl.Method) r0
            goto L_0x0158
        L_0x0151:
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Instance r0 = new kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Instance
            r0.<init>(r8)
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method r0 = (kotlin.reflect.jvm.internal.calls.CallerImpl.Method) r0
        L_0x0158:
            kotlin.reflect.jvm.internal.calls.Caller r0 = (kotlin.reflect.jvm.internal.calls.Caller) r0
            goto L_0x01d8
        L_0x015c:
            boolean r0 = r0.invoke()
            if (r0 == 0) goto L_0x017a
            boolean r0 = r7.isBound()
            if (r0 == 0) goto L_0x0170
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method$BoundJvmStaticInObject r0 = new kotlin.reflect.jvm.internal.calls.CallerImpl$Method$BoundJvmStaticInObject
            r0.<init>(r8)
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method r0 = (kotlin.reflect.jvm.internal.calls.CallerImpl.Method) r0
            goto L_0x0177
        L_0x0170:
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method$JvmStaticInObject r0 = new kotlin.reflect.jvm.internal.calls.CallerImpl$Method$JvmStaticInObject
            r0.<init>(r8)
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method r0 = (kotlin.reflect.jvm.internal.calls.CallerImpl.Method) r0
        L_0x0177:
            kotlin.reflect.jvm.internal.calls.Caller r0 = (kotlin.reflect.jvm.internal.calls.Caller) r0
            goto L_0x01d8
        L_0x017a:
            boolean r0 = r7.isBound()
            if (r0 == 0) goto L_0x018c
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method$BoundStatic r0 = new kotlin.reflect.jvm.internal.calls.CallerImpl$Method$BoundStatic
            java.lang.Object r1 = getBoundReceiver(r7)
            r0.<init>(r8, r1)
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method r0 = (kotlin.reflect.jvm.internal.calls.CallerImpl.Method) r0
            goto L_0x0193
        L_0x018c:
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Static r0 = new kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Static
            r0.<init>(r8)
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method r0 = (kotlin.reflect.jvm.internal.calls.CallerImpl.Method) r0
        L_0x0193:
            kotlin.reflect.jvm.internal.calls.Caller r0 = (kotlin.reflect.jvm.internal.calls.Caller) r0
            goto L_0x01d8
        L_0x0196:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField
            if (r0 == 0) goto L_0x01a8
            kotlin.reflect.jvm.internal.JvmPropertySignature$JavaField r1 = (kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField) r1
            java.lang.reflect.Field r8 = r1.getField()
            kotlin.reflect.jvm.internal.calls.CallerImpl r8 = r2.invoke((java.lang.reflect.Field) r8)
            r0 = r8
            kotlin.reflect.jvm.internal.calls.Caller r0 = (kotlin.reflect.jvm.internal.calls.Caller) r0
            goto L_0x01d8
        L_0x01a8:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty
            if (r0 == 0) goto L_0x01ff
            if (r8 == 0) goto L_0x01b5
            kotlin.reflect.jvm.internal.JvmPropertySignature$JavaMethodProperty r1 = (kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty) r1
            java.lang.reflect.Method r8 = r1.getGetterMethod()
            goto L_0x01bd
        L_0x01b5:
            kotlin.reflect.jvm.internal.JvmPropertySignature$JavaMethodProperty r1 = (kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty) r1
            java.lang.reflect.Method r8 = r1.getSetterMethod()
            if (r8 == 0) goto L_0x01e5
        L_0x01bd:
            boolean r0 = r7.isBound()
            if (r0 == 0) goto L_0x01cf
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method$BoundInstance r0 = new kotlin.reflect.jvm.internal.calls.CallerImpl$Method$BoundInstance
            java.lang.Object r1 = getBoundReceiver(r7)
            r0.<init>(r8, r1)
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method r0 = (kotlin.reflect.jvm.internal.calls.CallerImpl.Method) r0
            goto L_0x01d6
        L_0x01cf:
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Instance r0 = new kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Instance
            r0.<init>(r8)
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method r0 = (kotlin.reflect.jvm.internal.calls.CallerImpl.Method) r0
        L_0x01d6:
            kotlin.reflect.jvm.internal.calls.Caller r0 = (kotlin.reflect.jvm.internal.calls.Caller) r0
        L_0x01d8:
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor r7 = r7.getDescriptor()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r7 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r7
            r8 = 0
            r1 = 2
            kotlin.reflect.jvm.internal.calls.Caller r7 = kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(r0, r7, r8, r1, r4)
            return r7
        L_0x01e5:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "No source found for setter of Java method property: "
            r8.<init>(r0)
            java.lang.reflect.Method r0 = r1.getGetterMethod()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            throw r7
        L_0x01ff:
            boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.MappedKotlinProperty
            if (r0 == 0) goto L_0x02a3
            if (r8 == 0) goto L_0x020c
            kotlin.reflect.jvm.internal.JvmPropertySignature$MappedKotlinProperty r1 = (kotlin.reflect.jvm.internal.JvmPropertySignature.MappedKotlinProperty) r1
            kotlin.reflect.jvm.internal.JvmFunctionSignature$KotlinFunction r8 = r1.getGetterSignature()
            goto L_0x0214
        L_0x020c:
            kotlin.reflect.jvm.internal.JvmPropertySignature$MappedKotlinProperty r1 = (kotlin.reflect.jvm.internal.JvmPropertySignature.MappedKotlinProperty) r1
            kotlin.reflect.jvm.internal.JvmFunctionSignature$KotlinFunction r8 = r1.getSetterSignature()
            if (r8 == 0) goto L_0x0289
        L_0x0214:
            kotlin.reflect.jvm.internal.KPropertyImpl r0 = r7.getProperty()
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.getContainer()
            java.lang.String r1 = r8.getMethodName()
            java.lang.String r8 = r8.getMethodDesc()
            java.lang.reflect.Method r8 = r0.findMethodBySignature(r1, r8)
            if (r8 == 0) goto L_0x026f
            int r0 = r8.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r0 = r0 ^ 1
            boolean r1 = kotlin._Assertions.ENABLED
            if (r1 == 0) goto L_0x0255
            if (r0 == 0) goto L_0x023b
            goto L_0x0255
        L_0x023b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Mapped property cannot have a static accessor: "
            r8.<init>(r0)
            kotlin.reflect.jvm.internal.KPropertyImpl r7 = r7.getProperty()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>(r7)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x0255:
            boolean r0 = r7.isBound()
            if (r0 == 0) goto L_0x0267
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method$BoundInstance r0 = new kotlin.reflect.jvm.internal.calls.CallerImpl$Method$BoundInstance
            java.lang.Object r7 = getBoundReceiver(r7)
            r0.<init>(r8, r7)
            kotlin.reflect.jvm.internal.calls.Caller r0 = (kotlin.reflect.jvm.internal.calls.Caller) r0
            return r0
        L_0x0267:
            kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Instance r7 = new kotlin.reflect.jvm.internal.calls.CallerImpl$Method$Instance
            r7.<init>(r8)
            kotlin.reflect.jvm.internal.calls.Caller r7 = (kotlin.reflect.jvm.internal.calls.Caller) r7
            return r7
        L_0x026f:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No accessor found for property "
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.KPropertyImpl r7 = r7.getProperty()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x0289:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No setter found for property "
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.KPropertyImpl r7 = r7.getProperty()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x02a3:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImplKt.computeCallerForAccessor(kotlin.reflect.jvm.internal.KPropertyImpl$Accessor, boolean):kotlin.reflect.jvm.internal.calls.Caller");
    }

    /* access modifiers changed from: private */
    public static final boolean isJvmFieldPropertyInCompanionObject(PropertyDescriptor propertyDescriptor) {
        DeclarationDescriptor containingDeclaration = propertyDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "containingDeclaration");
        if (!DescriptorUtils.isCompanionObject(containingDeclaration)) {
            return false;
        }
        DeclarationDescriptor containingDeclaration2 = containingDeclaration.getContainingDeclaration();
        if (!DescriptorUtils.isInterface(containingDeclaration2) && !DescriptorUtils.isAnnotationClass(containingDeclaration2)) {
            return true;
        }
        if (!(propertyDescriptor instanceof DeserializedPropertyDescriptor) || !JvmProtoBufUtil.isMovedFromInterfaceCompanion(((DeserializedPropertyDescriptor) propertyDescriptor).getProto())) {
            return false;
        }
        return true;
    }
}
