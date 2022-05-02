package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaToKotlinClassMap {
    @NotNull
    private static final ClassId CLASS_CLASS_ID = INSTANCE.classId(Class.class);
    @NotNull
    private static final ClassId FUNCTION_N_CLASS_ID;
    @NotNull
    private static final FqName FUNCTION_N_FQ_NAME;
    @NotNull
    public static final JavaToKotlinClassMap INSTANCE = new JavaToKotlinClassMap();
    @NotNull
    private static final ClassId K_CLASS_CLASS_ID;
    @NotNull
    private static final ClassId K_FUNCTION_CLASS_ID;
    @NotNull
    private static final String NUMBERED_FUNCTION_PREFIX;
    @NotNull
    private static final String NUMBERED_K_FUNCTION_PREFIX;
    @NotNull
    private static final String NUMBERED_K_SUSPEND_FUNCTION_PREFIX;
    @NotNull
    private static final String NUMBERED_SUSPEND_FUNCTION_PREFIX;
    @NotNull
    private static final HashMap<FqNameUnsafe, ClassId> javaToKotlin = new HashMap<>();
    @NotNull
    private static final HashMap<FqNameUnsafe, ClassId> kotlinToJava = new HashMap<>();
    @NotNull
    private static final List<PlatformMutabilityMapping> mutabilityMappings;
    @NotNull
    private static final HashMap<FqNameUnsafe, FqName> mutableToReadOnly = new HashMap<>();
    @NotNull
    private static final HashMap<FqNameUnsafe, FqName> readOnlyToMutable = new HashMap<>();

    private JavaToKotlinClassMap() {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(FunctionClassKind.Function.getPackageFqName().toString());
        sb.append('.');
        sb.append(FunctionClassKind.Function.getClassNamePrefix());
        NUMBERED_FUNCTION_PREFIX = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FunctionClassKind.KFunction.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(FunctionClassKind.KFunction.getClassNamePrefix());
        NUMBERED_K_FUNCTION_PREFIX = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(FunctionClassKind.SuspendFunction.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(FunctionClassKind.SuspendFunction.getClassNamePrefix());
        NUMBERED_SUSPEND_FUNCTION_PREFIX = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(FunctionClassKind.KSuspendFunction.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(FunctionClassKind.KSuspendFunction.getClassNamePrefix());
        NUMBERED_K_SUSPEND_FUNCTION_PREFIX = sb4.toString();
        ClassId classId = ClassId.topLevel(new FqName("kotlin.jvm.functions.FunctionN"));
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        FUNCTION_N_CLASS_ID = classId;
        FqName asSingleFqName = classId.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        FUNCTION_N_FQ_NAME = asSingleFqName;
        ClassId classId2 = ClassId.topLevel(new FqName("kotlin.reflect.KFunction"));
        Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(FqName(\"kotlin.reflect.KFunction\"))");
        K_FUNCTION_CLASS_ID = classId2;
        ClassId classId3 = ClassId.topLevel(new FqName("kotlin.reflect.KClass"));
        Intrinsics.checkNotNullExpressionValue(classId3, "topLevel(FqName(\"kotlin.reflect.KClass\"))");
        K_CLASS_CLASS_ID = classId3;
        JavaToKotlinClassMap javaToKotlinClassMap = INSTANCE;
        ClassId classId4 = ClassId.topLevel(StandardNames.FqNames.iterable);
        Intrinsics.checkNotNullExpressionValue(classId4, "topLevel(FqNames.iterable)");
        FqName fqName = StandardNames.FqNames.mutableIterable;
        FqName packageFqName = classId4.getPackageFqName();
        FqName packageFqName2 = classId4.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName2, "kotlinReadOnly.packageFqName");
        FqName tail = FqNamesUtilKt.tail(fqName, packageFqName2);
        int i = 0;
        ClassId classId5 = new ClassId(packageFqName, tail, false);
        JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
        ClassId classId6 = ClassId.topLevel(StandardNames.FqNames.iterator);
        Intrinsics.checkNotNullExpressionValue(classId6, "topLevel(FqNames.iterator)");
        FqName fqName2 = StandardNames.FqNames.mutableIterator;
        FqName packageFqName3 = classId6.getPackageFqName();
        FqName packageFqName4 = classId6.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName4, "kotlinReadOnly.packageFqName");
        ClassId classId7 = new ClassId(packageFqName3, FqNamesUtilKt.tail(fqName2, packageFqName4), false);
        JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
        ClassId classId8 = ClassId.topLevel(StandardNames.FqNames.collection);
        Intrinsics.checkNotNullExpressionValue(classId8, "topLevel(FqNames.collection)");
        FqName fqName3 = StandardNames.FqNames.mutableCollection;
        FqName packageFqName5 = classId8.getPackageFqName();
        FqName packageFqName6 = classId8.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName6, "kotlinReadOnly.packageFqName");
        ClassId classId9 = new ClassId(packageFqName5, FqNamesUtilKt.tail(fqName3, packageFqName6), false);
        JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
        ClassId classId10 = ClassId.topLevel(StandardNames.FqNames.list);
        Intrinsics.checkNotNullExpressionValue(classId10, "topLevel(FqNames.list)");
        FqName fqName4 = StandardNames.FqNames.mutableList;
        FqName packageFqName7 = classId10.getPackageFqName();
        FqName packageFqName8 = classId10.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName8, "kotlinReadOnly.packageFqName");
        ClassId classId11 = new ClassId(packageFqName7, FqNamesUtilKt.tail(fqName4, packageFqName8), false);
        JavaToKotlinClassMap javaToKotlinClassMap5 = INSTANCE;
        ClassId classId12 = ClassId.topLevel(StandardNames.FqNames.set);
        Intrinsics.checkNotNullExpressionValue(classId12, "topLevel(FqNames.set)");
        FqName fqName5 = StandardNames.FqNames.mutableSet;
        FqName packageFqName9 = classId12.getPackageFqName();
        FqName packageFqName10 = classId12.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName10, "kotlinReadOnly.packageFqName");
        ClassId classId13 = new ClassId(packageFqName9, FqNamesUtilKt.tail(fqName5, packageFqName10), false);
        JavaToKotlinClassMap javaToKotlinClassMap6 = INSTANCE;
        ClassId classId14 = ClassId.topLevel(StandardNames.FqNames.listIterator);
        Intrinsics.checkNotNullExpressionValue(classId14, "topLevel(FqNames.listIterator)");
        FqName fqName6 = StandardNames.FqNames.mutableListIterator;
        FqName packageFqName11 = classId14.getPackageFqName();
        FqName packageFqName12 = classId14.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName12, "kotlinReadOnly.packageFqName");
        ClassId classId15 = new ClassId(packageFqName11, FqNamesUtilKt.tail(fqName6, packageFqName12), false);
        JavaToKotlinClassMap javaToKotlinClassMap7 = INSTANCE;
        ClassId classId16 = ClassId.topLevel(StandardNames.FqNames.map);
        Intrinsics.checkNotNullExpressionValue(classId16, "topLevel(FqNames.map)");
        FqName fqName7 = StandardNames.FqNames.mutableMap;
        FqName packageFqName13 = classId16.getPackageFqName();
        FqName packageFqName14 = classId16.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName14, "kotlinReadOnly.packageFqName");
        ClassId classId17 = new ClassId(packageFqName13, FqNamesUtilKt.tail(fqName7, packageFqName14), false);
        JavaToKotlinClassMap javaToKotlinClassMap8 = INSTANCE;
        ClassId createNestedClassId = ClassId.topLevel(StandardNames.FqNames.map).createNestedClassId(StandardNames.FqNames.mapEntry.shortName());
        Intrinsics.checkNotNullExpressionValue(createNestedClassId, "topLevel(FqNames.map).createNestedClassId(FqNames.mapEntry.shortName())");
        FqName fqName8 = StandardNames.FqNames.mutableMapEntry;
        FqName packageFqName15 = createNestedClassId.getPackageFqName();
        FqName packageFqName16 = createNestedClassId.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName16, "kotlinReadOnly.packageFqName");
        mutabilityMappings = CollectionsKt.listOf(new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Iterable.class), classId4, classId5), new PlatformMutabilityMapping(javaToKotlinClassMap2.classId(Iterator.class), classId6, classId7), new PlatformMutabilityMapping(javaToKotlinClassMap3.classId(Collection.class), classId8, classId9), new PlatformMutabilityMapping(javaToKotlinClassMap4.classId(List.class), classId10, classId11), new PlatformMutabilityMapping(javaToKotlinClassMap5.classId(Set.class), classId12, classId13), new PlatformMutabilityMapping(javaToKotlinClassMap6.classId(ListIterator.class), classId14, classId15), new PlatformMutabilityMapping(javaToKotlinClassMap7.classId(Map.class), classId16, classId17), new PlatformMutabilityMapping(javaToKotlinClassMap8.classId(Map.Entry.class), createNestedClassId, new ClassId(packageFqName15, FqNamesUtilKt.tail(fqName8, packageFqName16), false)));
        INSTANCE.addTopLevel((Class<?>) Object.class, StandardNames.FqNames.any);
        INSTANCE.addTopLevel((Class<?>) String.class, StandardNames.FqNames.string);
        INSTANCE.addTopLevel((Class<?>) CharSequence.class, StandardNames.FqNames.charSequence);
        INSTANCE.addTopLevel((Class<?>) Throwable.class, StandardNames.FqNames.throwable);
        INSTANCE.addTopLevel((Class<?>) Cloneable.class, StandardNames.FqNames.cloneable);
        INSTANCE.addTopLevel((Class<?>) Number.class, StandardNames.FqNames.number);
        INSTANCE.addTopLevel((Class<?>) Comparable.class, StandardNames.FqNames.comparable);
        INSTANCE.addTopLevel((Class<?>) Enum.class, StandardNames.FqNames._enum);
        INSTANCE.addTopLevel((Class<?>) Annotation.class, StandardNames.FqNames.annotation);
        for (PlatformMutabilityMapping addMapping : mutabilityMappings) {
            INSTANCE.addMapping(addMapping);
        }
        JvmPrimitiveType[] values = JvmPrimitiveType.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            JvmPrimitiveType jvmPrimitiveType = values[i2];
            i2++;
            JavaToKotlinClassMap javaToKotlinClassMap9 = INSTANCE;
            ClassId classId18 = ClassId.topLevel(jvmPrimitiveType.getWrapperFqName());
            Intrinsics.checkNotNullExpressionValue(classId18, "topLevel(jvmType.wrapperFqName)");
            StandardNames standardNames = StandardNames.INSTANCE;
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "jvmType.primitiveType");
            ClassId classId19 = ClassId.topLevel(StandardNames.getPrimitiveFqName(primitiveType));
            Intrinsics.checkNotNullExpressionValue(classId19, "topLevel(StandardNames.getPrimitiveFqName(jvmType.primitiveType))");
            javaToKotlinClassMap9.add(classId18, classId19);
        }
        for (ClassId next : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            JavaToKotlinClassMap javaToKotlinClassMap10 = INSTANCE;
            StringBuilder sb5 = new StringBuilder("kotlin.jvm.internal.");
            sb5.append(next.getShortClassName().asString());
            sb5.append("CompanionObject");
            ClassId classId20 = ClassId.topLevel(new FqName(sb5.toString()));
            Intrinsics.checkNotNullExpressionValue(classId20, "topLevel(FqName(\"kotlin.jvm.internal.\" + classId.shortClassName.asString() + \"CompanionObject\"))");
            ClassId createNestedClassId2 = next.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT);
            Intrinsics.checkNotNullExpressionValue(createNestedClassId2, "classId.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)");
            javaToKotlinClassMap10.add(classId20, createNestedClassId2);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            JavaToKotlinClassMap javaToKotlinClassMap11 = INSTANCE;
            ClassId classId21 = ClassId.topLevel(new FqName(Intrinsics.stringPlus("kotlin.jvm.functions.Function", Integer.valueOf(i3))));
            Intrinsics.checkNotNullExpressionValue(classId21, "topLevel(FqName(\"kotlin.jvm.functions.Function$i\"))");
            StandardNames standardNames2 = StandardNames.INSTANCE;
            javaToKotlinClassMap11.add(classId21, StandardNames.getFunctionClassId(i3));
            INSTANCE.addKotlinToJava(new FqName(Intrinsics.stringPlus(NUMBERED_K_FUNCTION_PREFIX, Integer.valueOf(i3))), K_FUNCTION_CLASS_ID);
            if (i4 >= 23) {
                break;
            }
            i3 = i4;
        }
        while (true) {
            int i5 = i + 1;
            FunctionClassKind functionClassKind = FunctionClassKind.KSuspendFunction;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(functionClassKind.getPackageFqName().toString());
            sb6.append('.');
            sb6.append(functionClassKind.getClassNamePrefix());
            INSTANCE.addKotlinToJava(new FqName(Intrinsics.stringPlus(sb6.toString(), Integer.valueOf(i))), K_FUNCTION_CLASS_ID);
            if (i5 >= 22) {
                JavaToKotlinClassMap javaToKotlinClassMap12 = INSTANCE;
                FqName safe = StandardNames.FqNames.nothing.toSafe();
                Intrinsics.checkNotNullExpressionValue(safe, "nothing.toSafe()");
                javaToKotlinClassMap12.addKotlinToJava(safe, INSTANCE.classId(Void.class));
                return;
            }
            i = i5;
        }
    }

    @NotNull
    public final FqName getFUNCTION_N_FQ_NAME() {
        return FUNCTION_N_FQ_NAME;
    }

    public static final class PlatformMutabilityMapping {
        @NotNull
        private final ClassId javaClass;
        @NotNull
        private final ClassId kotlinMutable;
        @NotNull
        private final ClassId kotlinReadOnly;

        @NotNull
        public final ClassId component1() {
            return this.javaClass;
        }

        @NotNull
        public final ClassId component2() {
            return this.kotlinReadOnly;
        }

        @NotNull
        public final ClassId component3() {
            return this.kotlinMutable;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.areEqual((Object) this.javaClass, (Object) platformMutabilityMapping.javaClass) && Intrinsics.areEqual((Object) this.kotlinReadOnly, (Object) platformMutabilityMapping.kotlinReadOnly) && Intrinsics.areEqual((Object) this.kotlinMutable, (Object) platformMutabilityMapping.kotlinMutable);
        }

        public final int hashCode() {
            return (((this.javaClass.hashCode() * 31) + this.kotlinReadOnly.hashCode()) * 31) + this.kotlinMutable.hashCode();
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("PlatformMutabilityMapping(javaClass=");
            sb.append(this.javaClass);
            sb.append(", kotlinReadOnly=");
            sb.append(this.kotlinReadOnly);
            sb.append(", kotlinMutable=");
            sb.append(this.kotlinMutable);
            sb.append(')');
            return sb.toString();
        }

        public PlatformMutabilityMapping(@NotNull ClassId classId, @NotNull ClassId classId2, @NotNull ClassId classId3) {
            Intrinsics.checkNotNullParameter(classId, "javaClass");
            Intrinsics.checkNotNullParameter(classId2, "kotlinReadOnly");
            Intrinsics.checkNotNullParameter(classId3, "kotlinMutable");
            this.javaClass = classId;
            this.kotlinReadOnly = classId2;
            this.kotlinMutable = classId3;
        }

        @NotNull
        public final ClassId getJavaClass() {
            return this.javaClass;
        }
    }

    @NotNull
    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return mutabilityMappings;
    }

    @Nullable
    public final ClassId mapJavaToKotlin(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return javaToKotlin.get(fqName.toUnsafe());
    }

    @Nullable
    public final ClassId mapKotlinToJava(@NotNull FqNameUnsafe fqNameUnsafe) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe, "kotlinFqName");
        if (isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_FUNCTION_PREFIX)) {
            return FUNCTION_N_CLASS_ID;
        }
        if (isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_SUSPEND_FUNCTION_PREFIX)) {
            return FUNCTION_N_CLASS_ID;
        }
        if (isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_K_FUNCTION_PREFIX)) {
            return K_FUNCTION_CLASS_ID;
        }
        if (isKotlinFunctionWithBigArity(fqNameUnsafe, NUMBERED_K_SUSPEND_FUNCTION_PREFIX)) {
            return K_FUNCTION_CLASS_ID;
        }
        return kotlinToJava.get(fqNameUnsafe);
    }

    private final boolean isKotlinFunctionWithBigArity(FqNameUnsafe fqNameUnsafe, String str) {
        Integer intOrNull;
        String asString = fqNameUnsafe.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "kotlinFqName.asString()");
        String substringAfter = StringsKt.substringAfter(asString, str, "");
        CharSequence charSequence = substringAfter;
        return (charSequence.length() > 0) && !StringsKt.startsWith$default(charSequence, '0', false, 2, (Object) null) && (intOrNull = StringsKt.toIntOrNull(substringAfter)) != null && intOrNull.intValue() >= 23;
    }

    private final void addMapping(PlatformMutabilityMapping platformMutabilityMapping) {
        ClassId component1 = platformMutabilityMapping.component1();
        ClassId component2 = platformMutabilityMapping.component2();
        ClassId component3 = platformMutabilityMapping.component3();
        add(component1, component2);
        FqName asSingleFqName = component3.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName, "mutableClassId.asSingleFqName()");
        addKotlinToJava(asSingleFqName, component1);
        FqName asSingleFqName2 = component2.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName2, "readOnlyClassId.asSingleFqName()");
        FqName asSingleFqName3 = component3.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName3, "mutableClassId.asSingleFqName()");
        FqNameUnsafe unsafe = component3.asSingleFqName().toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe, "mutableClassId.asSingleFqName().toUnsafe()");
        mutableToReadOnly.put(unsafe, asSingleFqName2);
        FqNameUnsafe unsafe2 = asSingleFqName2.toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe2, "readOnlyFqName.toUnsafe()");
        readOnlyToMutable.put(unsafe2, asSingleFqName3);
    }

    private final void add(ClassId classId, ClassId classId2) {
        addJavaToKotlin(classId, classId2);
        FqName asSingleFqName = classId2.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName, "kotlinClassId.asSingleFqName()");
        addKotlinToJava(asSingleFqName, classId);
    }

    private final void addTopLevel(Class<?> cls, FqNameUnsafe fqNameUnsafe) {
        FqName safe = fqNameUnsafe.toSafe();
        Intrinsics.checkNotNullExpressionValue(safe, "kotlinFqName.toSafe()");
        addTopLevel(cls, safe);
    }

    private final void addTopLevel(Class<?> cls, FqName fqName) {
        ClassId classId = classId(cls);
        ClassId classId2 = ClassId.topLevel(fqName);
        Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(kotlinFqName)");
        add(classId, classId2);
    }

    private final void addJavaToKotlin(ClassId classId, ClassId classId2) {
        FqNameUnsafe unsafe = classId.asSingleFqName().toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe, "javaClassId.asSingleFqName().toUnsafe()");
        javaToKotlin.put(unsafe, classId2);
    }

    private final void addKotlinToJava(FqName fqName, ClassId classId) {
        FqNameUnsafe unsafe = fqName.toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe, "kotlinFqNameUnsafe.toUnsafe()");
        kotlinToJava.put(unsafe, classId);
    }

    @Nullable
    public final FqName mutableToReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        return (FqName) mutableToReadOnly.get(fqNameUnsafe);
    }

    @Nullable
    public final FqName readOnlyToMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        return (FqName) readOnlyToMutable.get(fqNameUnsafe);
    }

    public final boolean isMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        Map map = mutableToReadOnly;
        if (map != null) {
            return map.containsKey(fqNameUnsafe);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    public final boolean isReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        Map map = readOnlyToMutable;
        if (map != null) {
            return map.containsKey(fqNameUnsafe);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    /* access modifiers changed from: private */
    public final ClassId classId(Class<?> cls) {
        boolean z = !cls.isPrimitive() && !cls.isArray();
        if (!_Assertions.ENABLED || z) {
            Class<?> declaringClass = cls.getDeclaringClass();
            if (declaringClass == null) {
                ClassId classId = ClassId.topLevel(new FqName(cls.getCanonicalName()));
                Intrinsics.checkNotNullExpressionValue(classId, "topLevel(FqName(clazz.canonicalName))");
                return classId;
            }
            ClassId createNestedClassId = classId(declaringClass).createNestedClassId(Name.identifier(cls.getSimpleName()));
            Intrinsics.checkNotNullExpressionValue(createNestedClassId, "classId(outer).createNestedClassId(Name.identifier(clazz.simpleName))");
            return createNestedClassId;
        }
        throw new AssertionError(Intrinsics.stringPlus("Invalid class: ", cls));
    }
}
