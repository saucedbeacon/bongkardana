package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

public final class JvmNameResolver implements NameResolver {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @NotNull
    public static final List<String> PREDEFINED_STRINGS;
    @NotNull
    private static final Map<String, Integer> PREDEFINED_STRINGS_MAP;
    @NotNull

    /* renamed from: kotlin  reason: collision with root package name */
    private static final String f10802kotlin;
    @NotNull
    private final Set<Integer> localNameIndices;
    @NotNull
    private final List<JvmProtoBuf.StringTableTypes.Record> records;
    @NotNull
    private final String[] strings;
    @NotNull
    private final JvmProtoBuf.StringTableTypes types;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public JvmNameResolver(@NotNull JvmProtoBuf.StringTableTypes stringTableTypes, @NotNull String[] strArr) {
        Set<Integer> set;
        Intrinsics.checkNotNullParameter(stringTableTypes, "types");
        Intrinsics.checkNotNullParameter(strArr, "strings");
        this.types = stringTableTypes;
        this.strings = strArr;
        List<Integer> localNameList = stringTableTypes.getLocalNameList();
        if (localNameList.isEmpty()) {
            set = SetsKt.emptySet();
        } else {
            Intrinsics.checkNotNullExpressionValue(localNameList, "");
            set = CollectionsKt.toSet(localNameList);
        }
        this.localNameIndices = set;
        ArrayList arrayList = new ArrayList();
        List<JvmProtoBuf.StringTableTypes.Record> recordList = getTypes().getRecordList();
        arrayList.ensureCapacity(recordList.size());
        for (JvmProtoBuf.StringTableTypes.Record next : recordList) {
            int range = next.getRange();
            for (int i = 0; i < range; i++) {
                arrayList.add(next);
            }
        }
        arrayList.trimToSize();
        Unit unit = Unit.INSTANCE;
        this.records = arrayList;
    }

    @NotNull
    public final JvmProtoBuf.StringTableTypes getTypes() {
        return this.types;
    }

    @NotNull
    public final String getString(int i) {
        String str;
        int i2 = i;
        JvmProtoBuf.StringTableTypes.Record record = this.records.get(i2);
        if (record.hasString()) {
            str = record.getString();
        } else {
            if (record.hasPredefinedIndex()) {
                int size = Companion.getPREDEFINED_STRINGS().size() - 1;
                int predefinedIndex = record.getPredefinedIndex();
                if (predefinedIndex >= 0 && predefinedIndex <= size) {
                    str = Companion.getPREDEFINED_STRINGS().get(record.getPredefinedIndex());
                }
            }
            str = this.strings[i2];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            Intrinsics.checkNotNullExpressionValue(substringIndexList, "substringIndexList");
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            Intrinsics.checkNotNullExpressionValue(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                Intrinsics.checkNotNullExpressionValue(num2, TtmlNode.END);
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    Intrinsics.checkNotNullExpressionValue(str, "string");
                    str = str.substring(num.intValue(), num2.intValue());
                    Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
            }
        }
        String str2 = str;
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            Intrinsics.checkNotNullExpressionValue(replaceCharList, "replaceCharList");
            Intrinsics.checkNotNullExpressionValue(str2, "string");
            str2 = StringsKt.replace$default(str2, (char) replaceCharList.get(0).intValue(), (char) replaceCharList.get(1).intValue(), false, 4, (Object) null);
        }
        String str3 = str2;
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i3 == 2) {
            Intrinsics.checkNotNullExpressionValue(str3, "string");
            str3 = StringsKt.replace$default(str3, (char) Typography.dollar, '.', false, 4, (Object) null);
        } else if (i3 == 3) {
            if (str3.length() >= 2) {
                Intrinsics.checkNotNullExpressionValue(str3, "string");
                str3 = str3.substring(1, str3.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            String str4 = str3;
            Intrinsics.checkNotNullExpressionValue(str4, "string");
            str3 = StringsKt.replace$default(str4, (char) Typography.dollar, '.', false, 4, (Object) null);
        }
        Intrinsics.checkNotNullExpressionValue(str3, "string");
        return str3;
    }

    @NotNull
    public final String getQualifiedClassName(int i) {
        return getString(i);
    }

    public final boolean isLocalClassName(int i) {
        return this.localNameIndices.contains(Integer.valueOf(i));
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final List<String> getPREDEFINED_STRINGS() {
            return JvmNameResolver.PREDEFINED_STRINGS;
        }
    }

    static {
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        f10802kotlin = joinToString$default;
        PREDEFINED_STRINGS = CollectionsKt.listOf(Intrinsics.stringPlus(joinToString$default, "/Any"), Intrinsics.stringPlus(f10802kotlin, "/Nothing"), Intrinsics.stringPlus(f10802kotlin, "/Unit"), Intrinsics.stringPlus(f10802kotlin, "/Throwable"), Intrinsics.stringPlus(f10802kotlin, "/Number"), Intrinsics.stringPlus(f10802kotlin, "/Byte"), Intrinsics.stringPlus(f10802kotlin, "/Double"), Intrinsics.stringPlus(f10802kotlin, "/Float"), Intrinsics.stringPlus(f10802kotlin, "/Int"), Intrinsics.stringPlus(f10802kotlin, "/Long"), Intrinsics.stringPlus(f10802kotlin, "/Short"), Intrinsics.stringPlus(f10802kotlin, "/Boolean"), Intrinsics.stringPlus(f10802kotlin, "/Char"), Intrinsics.stringPlus(f10802kotlin, "/CharSequence"), Intrinsics.stringPlus(f10802kotlin, "/String"), Intrinsics.stringPlus(f10802kotlin, "/Comparable"), Intrinsics.stringPlus(f10802kotlin, "/Enum"), Intrinsics.stringPlus(f10802kotlin, "/Array"), Intrinsics.stringPlus(f10802kotlin, "/ByteArray"), Intrinsics.stringPlus(f10802kotlin, "/DoubleArray"), Intrinsics.stringPlus(f10802kotlin, "/FloatArray"), Intrinsics.stringPlus(f10802kotlin, "/IntArray"), Intrinsics.stringPlus(f10802kotlin, "/LongArray"), Intrinsics.stringPlus(f10802kotlin, "/ShortArray"), Intrinsics.stringPlus(f10802kotlin, "/BooleanArray"), Intrinsics.stringPlus(f10802kotlin, "/CharArray"), Intrinsics.stringPlus(f10802kotlin, "/Cloneable"), Intrinsics.stringPlus(f10802kotlin, "/Annotation"), Intrinsics.stringPlus(f10802kotlin, "/collections/Iterable"), Intrinsics.stringPlus(f10802kotlin, "/collections/MutableIterable"), Intrinsics.stringPlus(f10802kotlin, "/collections/Collection"), Intrinsics.stringPlus(f10802kotlin, "/collections/MutableCollection"), Intrinsics.stringPlus(f10802kotlin, "/collections/List"), Intrinsics.stringPlus(f10802kotlin, "/collections/MutableList"), Intrinsics.stringPlus(f10802kotlin, "/collections/Set"), Intrinsics.stringPlus(f10802kotlin, "/collections/MutableSet"), Intrinsics.stringPlus(f10802kotlin, "/collections/Map"), Intrinsics.stringPlus(f10802kotlin, "/collections/MutableMap"), Intrinsics.stringPlus(f10802kotlin, "/collections/Map.Entry"), Intrinsics.stringPlus(f10802kotlin, "/collections/MutableMap.MutableEntry"), Intrinsics.stringPlus(f10802kotlin, "/collections/Iterator"), Intrinsics.stringPlus(f10802kotlin, "/collections/MutableIterator"), Intrinsics.stringPlus(f10802kotlin, "/collections/ListIterator"), Intrinsics.stringPlus(f10802kotlin, "/collections/MutableListIterator"));
        Iterable<IndexedValue> withIndex = CollectionsKt.withIndex(Companion.getPREDEFINED_STRINGS());
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(withIndex, 10)), 16));
        for (IndexedValue indexedValue : withIndex) {
            linkedHashMap.put((String) indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
        }
        PREDEFINED_STRINGS_MAP = linkedHashMap;
    }
}
