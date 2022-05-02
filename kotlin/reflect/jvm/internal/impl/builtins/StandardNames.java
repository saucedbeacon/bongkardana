package kotlin.reflect.jvm.internal.impl.builtins;

import com.alipay.multigateway.sdk.decision.condition.Condition;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

public final class StandardNames {
    @NotNull
    @JvmField
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;
    @NotNull
    @JvmField
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;
    @NotNull
    @JvmField
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES;
    @NotNull
    @JvmField
    public static final Name BUILT_INS_PACKAGE_NAME;
    @NotNull
    @JvmField
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;
    @NotNull
    @JvmField
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL;
    @NotNull
    @JvmField
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME_RELEASE;
    @NotNull
    @JvmField
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME_EXPERIMENTAL;
    @NotNull
    @JvmField
    public static final FqName COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL;
    @NotNull
    @JvmField
    public static final FqName COROUTINES_PACKAGE_FQ_NAME_RELEASE;
    @NotNull
    @JvmField
    public static final Name ENUM_VALUES;
    @NotNull
    @JvmField
    public static final Name ENUM_VALUE_OF;
    @NotNull
    public static final StandardNames INSTANCE = new StandardNames();
    @NotNull
    @JvmField
    public static final FqName KOTLIN_REFLECT_FQ_NAME = new FqName("kotlin.reflect");
    @NotNull
    @JvmField
    public static final List<String> PREFIXES = CollectionsKt.listOf("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
    @NotNull
    @JvmField
    public static final FqName RANGES_PACKAGE_FQ_NAME;
    @NotNull
    @JvmField
    public static final FqName RESULT_FQ_NAME = new FqName("kotlin.Result");
    @NotNull
    @JvmField
    public static final FqName TEXT_PACKAGE_FQ_NAME;

    private StandardNames() {
    }

    static {
        Name identifier = Name.identifier("values");
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(\"values\")");
        ENUM_VALUES = identifier;
        Name identifier2 = Name.identifier("valueOf");
        Intrinsics.checkNotNullExpressionValue(identifier2, "identifier(\"valueOf\")");
        ENUM_VALUE_OF = identifier2;
        FqName fqName = new FqName("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME_RELEASE = fqName;
        FqName child = fqName.child(Name.identifier("experimental"));
        Intrinsics.checkNotNullExpressionValue(child, "COROUTINES_PACKAGE_FQ_NAME_RELEASE.child(Name.identifier(\"experimental\"))");
        COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL = child;
        FqName child2 = child.child(Name.identifier("intrinsics"));
        Intrinsics.checkNotNullExpressionValue(child2, "COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL.child(Name.identifier(\"intrinsics\"))");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME_EXPERIMENTAL = child2;
        FqName child3 = COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL.child(Name.identifier("Continuation"));
        Intrinsics.checkNotNullExpressionValue(child3, "COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL.child(Name.identifier(\"Continuation\"))");
        CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL = child3;
        FqName child4 = COROUTINES_PACKAGE_FQ_NAME_RELEASE.child(Name.identifier("Continuation"));
        Intrinsics.checkNotNullExpressionValue(child4, "COROUTINES_PACKAGE_FQ_NAME_RELEASE.child(Name.identifier(\"Continuation\"))");
        CONTINUATION_INTERFACE_FQ_NAME_RELEASE = child4;
        Name identifier3 = Name.identifier("kotlin");
        Intrinsics.checkNotNullExpressionValue(identifier3, "identifier(\"kotlin\")");
        BUILT_INS_PACKAGE_NAME = identifier3;
        FqName fqName2 = FqName.topLevel(identifier3);
        Intrinsics.checkNotNullExpressionValue(fqName2, "topLevel(BUILT_INS_PACKAGE_NAME)");
        BUILT_INS_PACKAGE_FQ_NAME = fqName2;
        FqName child5 = fqName2.child(Name.identifier("annotation"));
        Intrinsics.checkNotNullExpressionValue(child5, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"annotation\"))");
        ANNOTATION_PACKAGE_FQ_NAME = child5;
        FqName child6 = BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier("collections"));
        Intrinsics.checkNotNullExpressionValue(child6, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"collections\"))");
        COLLECTIONS_PACKAGE_FQ_NAME = child6;
        FqName child7 = BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier("ranges"));
        Intrinsics.checkNotNullExpressionValue(child7, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"ranges\"))");
        RANGES_PACKAGE_FQ_NAME = child7;
        FqName child8 = BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier("text"));
        Intrinsics.checkNotNullExpressionValue(child8, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"text\"))");
        TEXT_PACKAGE_FQ_NAME = child8;
        FqName fqName3 = BUILT_INS_PACKAGE_FQ_NAME;
        FqName child9 = fqName3.child(Name.identifier("internal"));
        Intrinsics.checkNotNullExpressionValue(child9, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(\"internal\"))");
        BUILT_INS_PACKAGE_FQ_NAMES = SetsKt.setOf(fqName3, COLLECTIONS_PACKAGE_FQ_NAME, RANGES_PACKAGE_FQ_NAME, ANNOTATION_PACKAGE_FQ_NAME, KOTLIN_REFLECT_FQ_NAME, child9, COROUTINES_PACKAGE_FQ_NAME_RELEASE);
    }

    public static final class FqNames {
        @NotNull
        public static final FqNames INSTANCE;
        @NotNull
        @JvmField
        public static final FqNameUnsafe _boolean = INSTANCE.fqNameUnsafe("Boolean");
        @NotNull
        @JvmField
        public static final FqNameUnsafe _byte = INSTANCE.fqNameUnsafe("Byte");
        @NotNull
        @JvmField
        public static final FqNameUnsafe _char = INSTANCE.fqNameUnsafe("Char");
        @NotNull
        @JvmField
        public static final FqNameUnsafe _double = INSTANCE.fqNameUnsafe("Double");
        @NotNull
        @JvmField
        public static final FqNameUnsafe _enum = INSTANCE.fqNameUnsafe("Enum");
        @NotNull
        @JvmField
        public static final FqNameUnsafe _float = INSTANCE.fqNameUnsafe("Float");
        @NotNull
        @JvmField
        public static final FqNameUnsafe _int = INSTANCE.fqNameUnsafe("Int");
        @NotNull
        @JvmField
        public static final FqNameUnsafe _long = INSTANCE.fqNameUnsafe("Long");
        @NotNull
        @JvmField
        public static final FqNameUnsafe _short = INSTANCE.fqNameUnsafe("Short");
        @NotNull
        @JvmField
        public static final FqName annotation = INSTANCE.fqName("Annotation");
        @NotNull
        @JvmField
        public static final FqName annotationRetention = INSTANCE.annotationName("AnnotationRetention");
        @NotNull
        @JvmField
        public static final FqName annotationTarget = INSTANCE.annotationName("AnnotationTarget");
        @NotNull
        @JvmField
        public static final FqNameUnsafe any;
        @NotNull
        @JvmField
        public static final FqNameUnsafe array = INSTANCE.fqNameUnsafe("Array");
        @NotNull
        @JvmField
        public static final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType;
        @NotNull
        @JvmField
        public static final FqNameUnsafe charSequence = INSTANCE.fqNameUnsafe("CharSequence");
        @NotNull
        @JvmField
        public static final FqNameUnsafe cloneable = INSTANCE.fqNameUnsafe("Cloneable");
        @NotNull
        @JvmField
        public static final FqName collection = INSTANCE.collectionsFqName("Collection");
        @NotNull
        @JvmField
        public static final FqName comparable = INSTANCE.fqName("Comparable");
        @NotNull
        @JvmField
        public static final FqName deprecated = INSTANCE.fqName("Deprecated");
        @NotNull
        @JvmField
        public static final FqName deprecatedSinceKotlin = INSTANCE.fqName("DeprecatedSinceKotlin");
        @NotNull
        @JvmField
        public static final FqName deprecationLevel = INSTANCE.fqName("DeprecationLevel");
        @NotNull
        @JvmField
        public static final FqName extensionFunctionType = INSTANCE.fqName("ExtensionFunctionType");
        @NotNull
        @JvmField
        public static final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType;
        @NotNull
        @JvmField
        public static final FqNameUnsafe functionSupertype = INSTANCE.fqNameUnsafe("Function");
        @NotNull
        @JvmField
        public static final FqNameUnsafe intRange = INSTANCE.rangesFqName("IntRange");
        @NotNull
        @JvmField
        public static final FqName iterable = INSTANCE.collectionsFqName("Iterable");
        @NotNull
        @JvmField
        public static final FqName iterator = INSTANCE.collectionsFqName("Iterator");
        @NotNull
        @JvmField
        public static final FqNameUnsafe kCallable = reflect("KCallable");
        @NotNull
        @JvmField
        public static final FqNameUnsafe kClass = reflect("KClass");
        @NotNull
        @JvmField
        public static final FqNameUnsafe kDeclarationContainer = reflect("KDeclarationContainer");
        @NotNull
        @JvmField
        public static final FqNameUnsafe kMutableProperty0 = reflect("KMutableProperty0");
        @NotNull
        @JvmField
        public static final FqNameUnsafe kMutableProperty1 = reflect("KMutableProperty1");
        @NotNull
        @JvmField
        public static final FqNameUnsafe kMutableProperty2 = reflect("KMutableProperty2");
        @NotNull
        @JvmField
        public static final FqNameUnsafe kMutablePropertyFqName = reflect("KMutableProperty");
        @NotNull
        @JvmField
        public static final ClassId kProperty;
        @NotNull
        @JvmField
        public static final FqNameUnsafe kProperty0 = reflect("KProperty0");
        @NotNull
        @JvmField
        public static final FqNameUnsafe kProperty1 = reflect("KProperty1");
        @NotNull
        @JvmField
        public static final FqNameUnsafe kProperty2 = reflect("KProperty2");
        @NotNull
        @JvmField
        public static final FqNameUnsafe kPropertyFqName = reflect("KProperty");
        @NotNull
        @JvmField
        public static final FqName list = INSTANCE.collectionsFqName("List");
        @NotNull
        @JvmField
        public static final FqName listIterator = INSTANCE.collectionsFqName("ListIterator");
        @NotNull
        @JvmField
        public static final FqNameUnsafe longRange = INSTANCE.rangesFqName("LongRange");
        @NotNull
        @JvmField
        public static final FqName map;
        @NotNull
        @JvmField
        public static final FqName mapEntry;
        @NotNull
        @JvmField
        public static final FqName mustBeDocumented = INSTANCE.annotationName("MustBeDocumented");
        @NotNull
        @JvmField
        public static final FqName mutableCollection = INSTANCE.collectionsFqName("MutableCollection");
        @NotNull
        @JvmField
        public static final FqName mutableIterable = INSTANCE.collectionsFqName("MutableIterable");
        @NotNull
        @JvmField
        public static final FqName mutableIterator = INSTANCE.collectionsFqName("MutableIterator");
        @NotNull
        @JvmField
        public static final FqName mutableList = INSTANCE.collectionsFqName("MutableList");
        @NotNull
        @JvmField
        public static final FqName mutableListIterator = INSTANCE.collectionsFqName("MutableListIterator");
        @NotNull
        @JvmField
        public static final FqName mutableMap;
        @NotNull
        @JvmField
        public static final FqName mutableMapEntry;
        @NotNull
        @JvmField
        public static final FqName mutableSet = INSTANCE.collectionsFqName("MutableSet");
        @NotNull
        @JvmField
        public static final FqNameUnsafe nothing = INSTANCE.fqNameUnsafe("Nothing");
        @NotNull
        @JvmField
        public static final FqNameUnsafe number = INSTANCE.fqNameUnsafe(Condition.VALUE_TYPE_NUMBER);
        @NotNull
        @JvmField
        public static final FqName parameterName = INSTANCE.fqName("ParameterName");
        @NotNull
        @JvmField
        public static final Set<Name> primitiveArrayTypeShortNames;
        @NotNull
        @JvmField
        public static final Set<Name> primitiveTypeShortNames;
        @NotNull
        @JvmField
        public static final FqName publishedApi = INSTANCE.fqName("PublishedApi");
        @NotNull
        @JvmField
        public static final FqName repeatable = INSTANCE.annotationName("Repeatable");
        @NotNull
        @JvmField
        public static final FqName replaceWith = INSTANCE.fqName("ReplaceWith");
        @NotNull
        @JvmField
        public static final FqName retention = INSTANCE.annotationName("Retention");
        @NotNull
        @JvmField
        public static final FqName set = INSTANCE.collectionsFqName("Set");
        @NotNull
        @JvmField
        public static final FqNameUnsafe string = INSTANCE.fqNameUnsafe("String");
        @NotNull
        @JvmField
        public static final FqName suppress = INSTANCE.fqName("Suppress");
        @NotNull
        @JvmField
        public static final FqName target = INSTANCE.annotationName("Target");
        @NotNull
        @JvmField
        public static final FqName throwable = INSTANCE.fqName("Throwable");
        @NotNull
        @JvmField
        public static final ClassId uByte;
        @NotNull
        @JvmField
        public static final FqName uByteArrayFqName = INSTANCE.fqName("UByteArray");
        @NotNull
        @JvmField
        public static final FqName uByteFqName = INSTANCE.fqName("UByte");
        @NotNull
        @JvmField
        public static final ClassId uInt;
        @NotNull
        @JvmField
        public static final FqName uIntArrayFqName = INSTANCE.fqName("UIntArray");
        @NotNull
        @JvmField
        public static final FqName uIntFqName = INSTANCE.fqName("UInt");
        @NotNull
        @JvmField
        public static final ClassId uLong;
        @NotNull
        @JvmField
        public static final FqName uLongArrayFqName = INSTANCE.fqName("ULongArray");
        @NotNull
        @JvmField
        public static final FqName uLongFqName = INSTANCE.fqName("ULong");
        @NotNull
        @JvmField
        public static final ClassId uShort;
        @NotNull
        @JvmField
        public static final FqName uShortArrayFqName = INSTANCE.fqName("UShortArray");
        @NotNull
        @JvmField
        public static final FqName uShortFqName = INSTANCE.fqName("UShort");
        @NotNull
        @JvmField
        public static final FqNameUnsafe unit = INSTANCE.fqNameUnsafe("Unit");
        @NotNull
        @JvmField
        public static final FqName unsafeVariance = INSTANCE.fqName("UnsafeVariance");

        private FqNames() {
        }

        static {
            FqNames fqNames = new FqNames();
            INSTANCE = fqNames;
            any = fqNames.fqNameUnsafe("Any");
            FqName collectionsFqName = INSTANCE.collectionsFqName("Map");
            map = collectionsFqName;
            FqName child = collectionsFqName.child(Name.identifier("Entry"));
            Intrinsics.checkNotNullExpressionValue(child, "map.child(Name.identifier(\"Entry\"))");
            mapEntry = child;
            FqName collectionsFqName2 = INSTANCE.collectionsFqName("MutableMap");
            mutableMap = collectionsFqName2;
            FqName child2 = collectionsFqName2.child(Name.identifier("MutableEntry"));
            Intrinsics.checkNotNullExpressionValue(child2, "mutableMap.child(Name.identifier(\"MutableEntry\"))");
            mutableMapEntry = child2;
            ClassId classId = ClassId.topLevel(kPropertyFqName.toSafe());
            Intrinsics.checkNotNullExpressionValue(classId, "topLevel(kPropertyFqName.toSafe())");
            kProperty = classId;
            ClassId classId2 = ClassId.topLevel(uByteFqName);
            Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(uByteFqName)");
            uByte = classId2;
            ClassId classId3 = ClassId.topLevel(uShortFqName);
            Intrinsics.checkNotNullExpressionValue(classId3, "topLevel(uShortFqName)");
            uShort = classId3;
            ClassId classId4 = ClassId.topLevel(uIntFqName);
            Intrinsics.checkNotNullExpressionValue(classId4, "topLevel(uIntFqName)");
            uInt = classId4;
            ClassId classId5 = ClassId.topLevel(uLongFqName);
            Intrinsics.checkNotNullExpressionValue(classId5, "topLevel(uLongFqName)");
            uLong = classId5;
            HashSet newHashSetWithExpectedSize = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            int i = 0;
            for (PrimitiveType typeName : PrimitiveType.values()) {
                newHashSetWithExpectedSize.add(typeName.getTypeName());
            }
            primitiveTypeShortNames = newHashSetWithExpectedSize;
            HashSet newHashSetWithExpectedSize2 = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType arrayTypeName : PrimitiveType.values()) {
                newHashSetWithExpectedSize2.add(arrayTypeName.getArrayTypeName());
            }
            primitiveArrayTypeShortNames = newHashSetWithExpectedSize2;
            HashMap newHashMapWithExpectedSize = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            PrimitiveType[] values = PrimitiveType.values();
            int length = values.length;
            int i2 = 0;
            while (i2 < length) {
                PrimitiveType primitiveType = values[i2];
                i2++;
                FqNames fqNames2 = INSTANCE;
                String asString = primitiveType.getTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(asString, "primitiveType.typeName.asString()");
                newHashMapWithExpectedSize.put(fqNames2.fqNameUnsafe(asString), primitiveType);
            }
            fqNameToPrimitiveType = newHashMapWithExpectedSize;
            HashMap newHashMapWithExpectedSize2 = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            PrimitiveType[] values2 = PrimitiveType.values();
            int length2 = values2.length;
            while (i < length2) {
                PrimitiveType primitiveType2 = values2[i];
                i++;
                FqNames fqNames3 = INSTANCE;
                String asString2 = primitiveType2.getArrayTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(asString2, "primitiveType.arrayTypeName.asString()");
                newHashMapWithExpectedSize2.put(fqNames3.fqNameUnsafe(asString2), primitiveType2);
            }
            arrayClassFqNameToPrimitiveType = newHashMapWithExpectedSize2;
        }

        private final FqNameUnsafe fqNameUnsafe(String str) {
            FqNameUnsafe unsafe = fqName(str).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "fqName(simpleName).toUnsafe()");
            return unsafe;
        }

        private final FqName fqName(String str) {
            FqName child = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(str));
            Intrinsics.checkNotNullExpressionValue(child, "BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(simpleName))");
            return child;
        }

        private final FqName collectionsFqName(String str) {
            FqName child = StandardNames.COLLECTIONS_PACKAGE_FQ_NAME.child(Name.identifier(str));
            Intrinsics.checkNotNullExpressionValue(child, "COLLECTIONS_PACKAGE_FQ_NAME.child(Name.identifier(simpleName))");
            return child;
        }

        private final FqNameUnsafe rangesFqName(String str) {
            FqNameUnsafe unsafe = StandardNames.RANGES_PACKAGE_FQ_NAME.child(Name.identifier(str)).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "RANGES_PACKAGE_FQ_NAME.child(Name.identifier(simpleName)).toUnsafe()");
            return unsafe;
        }

        @JvmStatic
        @NotNull
        public static final FqNameUnsafe reflect(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "simpleName");
            FqNameUnsafe unsafe = StandardNames.KOTLIN_REFLECT_FQ_NAME.child(Name.identifier(str)).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "KOTLIN_REFLECT_FQ_NAME.child(Name.identifier(simpleName)).toUnsafe()");
            return unsafe;
        }

        private final FqName annotationName(String str) {
            FqName child = StandardNames.ANNOTATION_PACKAGE_FQ_NAME.child(Name.identifier(str));
            Intrinsics.checkNotNullExpressionValue(child, "ANNOTATION_PACKAGE_FQ_NAME.child(Name.identifier(simpleName))");
            return child;
        }
    }

    @JvmStatic
    @NotNull
    public static final String getFunctionName(int i) {
        return Intrinsics.stringPlus("Function", Integer.valueOf(i));
    }

    @JvmStatic
    @NotNull
    public static final ClassId getFunctionClassId(int i) {
        return new ClassId(BUILT_INS_PACKAGE_FQ_NAME, Name.identifier(getFunctionName(i)));
    }

    @JvmStatic
    @NotNull
    public static final String getSuspendFunctionName(int i) {
        return Intrinsics.stringPlus(FunctionClassKind.SuspendFunction.getClassNamePrefix(), Integer.valueOf(i));
    }

    @JvmStatic
    public static final boolean isPrimitiveArray(@NotNull FqNameUnsafe fqNameUnsafe) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe, "arrayFqName");
        return FqNames.arrayClassFqNameToPrimitiveType.get(fqNameUnsafe) != null;
    }

    @JvmStatic
    @NotNull
    public static final FqName getPrimitiveFqName(@NotNull PrimitiveType primitiveType) {
        Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
        FqName child = BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
        Intrinsics.checkNotNullExpressionValue(child, "BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.typeName)");
        return child;
    }
}
