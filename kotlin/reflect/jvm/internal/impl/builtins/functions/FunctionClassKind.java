package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum FunctionClassKind {
    Function(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "Function"),
    SuspendFunction(StandardNames.COROUTINES_PACKAGE_FQ_NAME_RELEASE, "SuspendFunction"),
    KFunction(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KFunction"),
    KSuspendFunction(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KSuspendFunction");
    
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    private final String classNamePrefix;
    @NotNull
    private final FqName packageFqName;

    private FunctionClassKind(FqName fqName, String str) {
        this.packageFqName = fqName;
        this.classNamePrefix = str;
    }

    @NotNull
    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    @NotNull
    public final FqName getPackageFqName() {
        return this.packageFqName;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @NotNull
    public final Name numberedClassName(int i) {
        Name identifier = Name.identifier(Intrinsics.stringPlus(this.classNamePrefix, Integer.valueOf(i)));
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(\"$classNamePrefix$arity\")");
        return identifier;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final FunctionClassKind byClassNamePrefix(@NotNull FqName fqName, @NotNull String str) {
            Intrinsics.checkNotNullParameter(fqName, "packageFqName");
            Intrinsics.checkNotNullParameter(str, "className");
            for (FunctionClassKind functionClassKind : FunctionClassKind.values()) {
                if (Intrinsics.areEqual((Object) functionClassKind.getPackageFqName(), (Object) fqName) && StringsKt.startsWith$default(str, functionClassKind.getClassNamePrefix(), false, 2, (Object) null)) {
                    return functionClassKind;
                }
            }
            return null;
        }

        public static final class KindWithArity {
            private final int arity;
            @NotNull
            private final FunctionClassKind kind;

            @NotNull
            public final FunctionClassKind component1() {
                return this.kind;
            }

            public final int component2() {
                return this.arity;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KindWithArity)) {
                    return false;
                }
                KindWithArity kindWithArity = (KindWithArity) obj;
                return this.kind == kindWithArity.kind && this.arity == kindWithArity.arity;
            }

            public final int hashCode() {
                return (this.kind.hashCode() * 31) + this.arity;
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("KindWithArity(kind=");
                sb.append(this.kind);
                sb.append(", arity=");
                sb.append(this.arity);
                sb.append(')');
                return sb.toString();
            }

            public KindWithArity(@NotNull FunctionClassKind functionClassKind, int i) {
                Intrinsics.checkNotNullParameter(functionClassKind, "kind");
                this.kind = functionClassKind;
                this.arity = i;
            }

            @NotNull
            public final FunctionClassKind getKind() {
                return this.kind;
            }
        }

        @Nullable
        public final KindWithArity parseClassName(@NotNull String str, @NotNull FqName fqName) {
            Intrinsics.checkNotNullParameter(str, "className");
            Intrinsics.checkNotNullParameter(fqName, "packageFqName");
            FunctionClassKind byClassNamePrefix = byClassNamePrefix(fqName, str);
            if (byClassNamePrefix == null) {
                return null;
            }
            String substring = str.substring(byClassNamePrefix.getClassNamePrefix().length());
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            Integer num = toInt(substring);
            if (num == null) {
                return null;
            }
            return new KindWithArity(byClassNamePrefix, num.intValue());
        }

        @JvmStatic
        @Nullable
        public final FunctionClassKind getFunctionalClassKind(@NotNull String str, @NotNull FqName fqName) {
            Intrinsics.checkNotNullParameter(str, "className");
            Intrinsics.checkNotNullParameter(fqName, "packageFqName");
            KindWithArity parseClassName = parseClassName(str, fqName);
            if (parseClassName == null) {
                return null;
            }
            return parseClassName.getKind();
        }

        private final Integer toInt(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i = 0;
            int i2 = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                i++;
                int i3 = charAt - '0';
                if (!(i3 >= 0 && i3 <= 9)) {
                    return null;
                }
                i2 = (i2 * 10) + i3;
            }
            return Integer.valueOf(i2);
        }
    }
}
