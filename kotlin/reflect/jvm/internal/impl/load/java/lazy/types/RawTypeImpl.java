package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

public final class RawTypeImpl extends FlexibleType implements RawType {
    private RawTypeImpl(SimpleType simpleType, SimpleType simpleType2, boolean z) {
        super(simpleType, simpleType2);
        if (!z) {
            boolean isSubtypeOf = KotlinTypeChecker.DEFAULT.isSubtypeOf(simpleType, simpleType2);
            if (_Assertions.ENABLED && !isSubtypeOf) {
                StringBuilder sb = new StringBuilder("Lower bound ");
                sb.append(simpleType);
                sb.append(" of a flexible type must be a subtype of the upper bound ");
                sb.append(simpleType2);
                throw new AssertionError(sb.toString());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        this(simpleType, simpleType2, false);
        Intrinsics.checkNotNullParameter(simpleType, "lowerBound");
        Intrinsics.checkNotNullParameter(simpleType2, "upperBound");
    }

    @NotNull
    public final SimpleType getDelegate() {
        return getLowerBound();
    }

    @NotNull
    public final MemberScope getMemberScope() {
        ClassifierDescriptor declarationDescriptor = getConstructor().getDeclarationDescriptor();
        ClassDescriptor classDescriptor = declarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptor : null;
        if (classDescriptor != null) {
            MemberScope memberScope = classDescriptor.getMemberScope(RawSubstitution.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(memberScope, "classDescriptor.getMemberScope(RawSubstitution)");
            return memberScope;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Incorrect classifier: ", getConstructor().getDeclarationDescriptor()).toString());
    }

    @NotNull
    public final RawTypeImpl replaceAnnotations(@NotNull Annotations annotations) {
        Intrinsics.checkNotNullParameter(annotations, "newAnnotations");
        return new RawTypeImpl(getLowerBound().replaceAnnotations(annotations), getUpperBound().replaceAnnotations(annotations));
    }

    @NotNull
    public final RawTypeImpl makeNullableAsSpecified(boolean z) {
        return new RawTypeImpl(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }

    private static final boolean render$onlyOutDiffers(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) StringsKt.removePrefix(str2, (CharSequence) "out ")) || Intrinsics.areEqual((Object) str2, (Object) "*");
    }

    private static final List<String> render$renderArguments(DescriptorRenderer descriptorRenderer, KotlinType kotlinType) {
        Iterable<TypeProjection> arguments = kotlinType.getArguments();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        for (TypeProjection renderTypeProjection : arguments) {
            arrayList.add(descriptorRenderer.renderTypeProjection(renderTypeProjection));
        }
        return (List) arrayList;
    }

    private static final String render$replaceArgs(String str, String str2) {
        if (!StringsKt.contains$default((CharSequence) str, (char) Typography.less, false, 2, (Object) null)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringsKt.substringBefore$default(str, (char) Typography.less, (String) null, 2, (Object) null));
        sb.append(Typography.less);
        sb.append(str2);
        sb.append(Typography.greater);
        sb.append(StringsKt.substringAfterLast$default(str, (char) Typography.greater, (String) null, 2, (Object) null));
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d1  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String render(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions r14) {
        /*
            r12 = this;
            java.lang.String r0 = "renderer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r12.getLowerBound()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r0
            java.lang.String r0 = r13.renderType(r0)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r1 = r12.getUpperBound()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r1
            java.lang.String r1 = r13.renderType(r1)
            boolean r14 = r14.getDebugMode()
            if (r14 == 0) goto L_0x0040
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "raw ("
            r13.<init>(r14)
            r13.append(r0)
            java.lang.String r14 = ".."
            r13.append(r14)
            r13.append(r1)
            r14 = 41
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            return r13
        L_0x0040:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r14 = r12.getUpperBound()
            java.util.List r14 = r14.getArguments()
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x005a
            r14 = r12
            kotlin.reflect.jvm.internal.impl.types.KotlinType r14 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r14
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r14 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(r14)
            java.lang.String r13 = r13.renderFlexibleType(r0, r1, r14)
            return r13
        L_0x005a:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r14 = r12.getLowerBound()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r14 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r14
            java.util.List r14 = render$renderArguments(r13, r14)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r12.getUpperBound()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r2
            java.util.List r2 = render$renderArguments(r13, r2)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.String r3 = ", "
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$newArgs$1 r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl$render$newArgs$1.INSTANCE
            r9 = r3
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r10 = 30
            r11 = 0
            r3 = r14
            java.lang.String r3 = kotlin.collections.CollectionsKt.joinToString$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r14 = kotlin.collections.CollectionsKt.zip(r14, r2)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            boolean r2 = r14 instanceof java.util.Collection
            if (r2 == 0) goto L_0x009b
            r2 = r14
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00bf
        L_0x009b:
            java.util.Iterator r14 = r14.iterator()
        L_0x009f:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x00bf
            java.lang.Object r2 = r14.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r4 = r2.getFirst()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getSecond()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = render$onlyOutDiffers(r4, r2)
            if (r2 != 0) goto L_0x009f
            r14 = 0
            goto L_0x00c0
        L_0x00bf:
            r14 = 1
        L_0x00c0:
            if (r14 == 0) goto L_0x00c6
            java.lang.String r1 = render$replaceArgs(r1, r3)
        L_0x00c6:
            java.lang.String r14 = render$replaceArgs(r0, r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x00d1
            return r14
        L_0x00d1:
            r0 = r12
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r0
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(r0)
            java.lang.String r13 = r13.renderFlexibleType(r14, r1, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl.render(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions):java.lang.String");
    }

    @NotNull
    public final FlexibleType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new RawTypeImpl((SimpleType) kotlinTypeRefiner.refineType(getLowerBound()), (SimpleType) kotlinTypeRefiner.refineType(getUpperBound()), true);
    }
}
