package kotlin.reflect.jvm.internal.impl.load.java;

import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class JvmAbi {
    @NotNull
    public static final JvmAbi INSTANCE = new JvmAbi();
    @NotNull
    @JvmField
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME = new FqName("kotlin.jvm.JvmField");
    @NotNull
    private static final ClassId REFLECTION_FACTORY_IMPL;

    private JvmAbi() {
    }

    static {
        ClassId classId = ClassId.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(FqName(\"kotlin.reflect.jvm.internal.ReflectionFactoryImpl\"))");
        REFLECTION_FACTORY_IMPL = classId;
    }

    @JvmStatic
    public static final boolean isGetterName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return StringsKt.startsWith$default(str, ContactEventType.CONTACT_GET, false, 2, (Object) null) || StringsKt.startsWith$default(str, "is", false, 2, (Object) null);
    }

    @JvmStatic
    public static final boolean isSetterName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return StringsKt.startsWith$default(str, "set", false, 2, (Object) null);
    }

    @JvmStatic
    @NotNull
    public static final String getterName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "propertyName");
        return startsWithIsPrefix(str) ? str : Intrinsics.stringPlus(ContactEventType.CONTACT_GET, CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str));
    }

    @JvmStatic
    @NotNull
    public static final String setterName(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "propertyName");
        if (startsWithIsPrefix(str)) {
            str2 = str.substring(2);
            Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.String).substring(startIndex)");
        } else {
            str2 = CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str);
        }
        return Intrinsics.stringPlus("set", str2);
    }

    @JvmStatic
    public static final boolean startsWithIsPrefix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        if (!StringsKt.startsWith$default(str, "is", false, 2, (Object) null) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if (Intrinsics.compare(97, (int) charAt) > 0 || Intrinsics.compare((int) charAt, 122) > 0) {
            return true;
        }
        return false;
    }
}
