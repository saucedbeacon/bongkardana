package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class JvmMemberSignature {
    public /* synthetic */ JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String asString();

    @NotNull
    public abstract String getDesc();

    @NotNull
    public abstract String getName();

    private JvmMemberSignature() {
    }

    public static final class Method extends JvmMemberSignature {
        @NotNull
        private final String desc;
        @NotNull
        private final String name;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return Intrinsics.areEqual((Object) this.name, (Object) method.name) && Intrinsics.areEqual((Object) this.desc, (Object) method.desc);
        }

        public final int hashCode() {
            return (this.name.hashCode() * 31) + this.desc.hashCode();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Method(@NotNull String str, @NotNull String str2) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, SecurityConstants.KEY_DESC);
            this.name = str;
            this.desc = str2;
        }

        @NotNull
        public final String getDesc() {
            return this.desc;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String asString() {
            return Intrinsics.stringPlus(getName(), getDesc());
        }
    }

    public static final class Field extends JvmMemberSignature {
        @NotNull
        private final String desc;
        @NotNull
        private final String name;

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final String component2() {
            return this.desc;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return Intrinsics.areEqual((Object) this.name, (Object) field.name) && Intrinsics.areEqual((Object) this.desc, (Object) field.desc);
        }

        public final int hashCode() {
            return (this.name.hashCode() * 31) + this.desc.hashCode();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Field(@NotNull String str, @NotNull String str2) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, SecurityConstants.KEY_DESC);
            this.name = str;
            this.desc = str2;
        }

        @NotNull
        public final String getDesc() {
            return this.desc;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String asString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getName());
            sb.append(':');
            sb.append(getDesc());
            return sb.toString();
        }
    }

    @NotNull
    public final String toString() {
        return asString();
    }
}
