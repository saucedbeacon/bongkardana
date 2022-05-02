package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class SignatureBuildingComponents {
    @NotNull
    public static final SignatureBuildingComponents INSTANCE = new SignatureBuildingComponents();

    private SignatureBuildingComponents() {
    }

    @NotNull
    public final String javaLang(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return Intrinsics.stringPlus("java/lang/", str);
    }

    @NotNull
    public final String javaUtil(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return Intrinsics.stringPlus("java/util/", str);
    }

    @NotNull
    public final String javaFunction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return Intrinsics.stringPlus("java/util/function/", str);
    }

    @NotNull
    public final Set<String> inJavaLang(@NotNull String str, @NotNull String... strArr) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(strArr, "signatures");
        String javaLang = javaLang(str);
        String[] strArr2 = new String[strArr.length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return inClass(javaLang, strArr2);
    }

    @NotNull
    public final Set<String> inJavaUtil(@NotNull String str, @NotNull String... strArr) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(strArr, "signatures");
        String javaUtil = javaUtil(str);
        String[] strArr2 = new String[strArr.length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return inClass(javaUtil, strArr2);
    }

    @NotNull
    public final Set<String> inClass(@NotNull String str, @NotNull String... strArr) {
        Intrinsics.checkNotNullParameter(str, "internalName");
        Intrinsics.checkNotNullParameter(strArr, "signatures");
        Collection linkedHashSet = new LinkedHashSet();
        for (String append : strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('.');
            sb.append(append);
            linkedHashSet.add(sb.toString());
        }
        return (Set) linkedHashSet;
    }

    @NotNull
    public final String signature(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "internalName");
        Intrinsics.checkNotNullParameter(str2, "jvmDescriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(str2);
        return sb.toString();
    }

    @NotNull
    public final String jvmDescriptor(@NotNull String str, @NotNull List<String> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "parameters");
        Intrinsics.checkNotNullParameter(str2, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(CollectionsKt.joinToString$default(list, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new SignatureBuildingComponents$jvmDescriptor$1(this), 30, (Object) null));
        sb.append(')');
        sb.append(escapeClassName(str2));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public final String escapeClassName(String str) {
        if (str.length() <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder("L");
        sb.append(str);
        sb.append(';');
        return sb.toString();
    }

    @NotNull
    public final String[] constructors(@NotNull String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "signatures");
        Collection arrayList = new ArrayList(strArr.length);
        for (String append : strArr) {
            StringBuilder sb = new StringBuilder("<init>(");
            sb.append(append);
            sb.append(")V");
            arrayList.add(sb.toString());
        }
        Object[] array = ((List) arrayList).toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
