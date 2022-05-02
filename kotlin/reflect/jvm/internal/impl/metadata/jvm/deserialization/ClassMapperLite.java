package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alipay.multigateway.sdk.decision.condition.Condition;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

public final class ClassMapperLite {
    @NotNull
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();
    @NotNull

    /* renamed from: kotlin  reason: collision with root package name */
    private static final String f10801kotlin = CollectionsKt.joinToString$default(CollectionsKt.listOf('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    @NotNull
    private static final Map<String, String> map;

    private ClassMapperLite() {
    }

    static {
        int i = 0;
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        List listOf = CollectionsKt.listOf("Boolean", "Z", "Char", "C", "Byte", DiskFormatter.B, "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, listOf.size() - 1, 2);
        if (progressionLastElement >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 2;
                StringBuilder sb = new StringBuilder();
                sb.append(f10801kotlin);
                sb.append('/');
                sb.append((String) listOf.get(i2));
                int i4 = i2 + 1;
                linkedHashMap.put(sb.toString(), listOf.get(i4));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f10801kotlin);
                sb2.append('/');
                sb2.append((String) listOf.get(i2));
                sb2.append("Array");
                linkedHashMap.put(sb2.toString(), Intrinsics.stringPlus("[", listOf.get(i4)));
                if (i2 == progressionLastElement) {
                    break;
                }
                i2 = i3;
            }
        }
        linkedHashMap.put(Intrinsics.stringPlus(f10801kotlin, "/Unit"), "V");
        m1352map$lambda0$add(linkedHashMap, "Any", "java/lang/Object");
        m1352map$lambda0$add(linkedHashMap, "Nothing", "java/lang/Void");
        m1352map$lambda0$add(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str : CollectionsKt.listOf("String", "CharSequence", "Throwable", "Cloneable", Condition.VALUE_TYPE_NUMBER, "Comparable", "Enum")) {
            m1352map$lambda0$add(linkedHashMap, str, Intrinsics.stringPlus("java/lang/", str));
        }
        for (String str2 : CollectionsKt.listOf("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m1352map$lambda0$add(linkedHashMap, Intrinsics.stringPlus("collections/", str2), Intrinsics.stringPlus("java/util/", str2));
            m1352map$lambda0$add(linkedHashMap, Intrinsics.stringPlus("collections/Mutable", str2), Intrinsics.stringPlus("java/util/", str2));
        }
        m1352map$lambda0$add(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m1352map$lambda0$add(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m1352map$lambda0$add(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m1352map$lambda0$add(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        while (true) {
            int i5 = i + 1;
            String stringPlus = Intrinsics.stringPlus("Function", Integer.valueOf(i));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(f10801kotlin);
            sb3.append("/jvm/functions/Function");
            sb3.append(i);
            m1352map$lambda0$add(linkedHashMap, stringPlus, sb3.toString());
            m1352map$lambda0$add(linkedHashMap, Intrinsics.stringPlus("reflect/KFunction", Integer.valueOf(i)), Intrinsics.stringPlus(f10801kotlin, "/reflect/KFunction"));
            if (i5 > 22) {
                break;
            }
            i = i5;
        }
        for (String str3 : CollectionsKt.listOf("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            String stringPlus2 = Intrinsics.stringPlus(str3, ".Companion");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(f10801kotlin);
            sb4.append("/jvm/internal/");
            sb4.append(str3);
            sb4.append("CompanionObject");
            m1352map$lambda0$add(linkedHashMap, stringPlus2, sb4.toString());
        }
        map = linkedHashMap;
    }

    /* renamed from: map$lambda-0$add  reason: not valid java name */
    private static final void m1352map$lambda0$add(Map<String, String> map2, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(f10801kotlin);
        sb.append('/');
        sb.append(str);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder("L");
        sb2.append(str2);
        sb2.append(';');
        map2.put(obj, sb2.toString());
    }

    @JvmStatic
    @NotNull
    public static final String mapClass(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "classId");
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder("L");
        sb.append(StringsKt.replace$default(str, '.', (char) Typography.dollar, false, 4, (Object) null));
        sb.append(';');
        return sb.toString();
    }
}
