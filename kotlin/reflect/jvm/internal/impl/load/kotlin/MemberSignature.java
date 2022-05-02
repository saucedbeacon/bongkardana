package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.data.constant.BranchLinkConstant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MemberSignature {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    private final String signature;

    public /* synthetic */ MemberSignature(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MemberSignature) && Intrinsics.areEqual((Object) this.signature, (Object) ((MemberSignature) obj).signature);
    }

    public final int hashCode() {
        return this.signature.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MemberSignature(signature=");
        sb.append(this.signature);
        sb.append(')');
        return sb.toString();
    }

    private MemberSignature(String str) {
        this.signature = str;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethod(@NotNull NameResolver nameResolver, @NotNull JvmProtoBuf.JvmMethodSignature jvmMethodSignature) {
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(jvmMethodSignature, BranchLinkConstant.OauthParams.SIGNATURE);
            return fromMethodNameAndDesc(nameResolver.getString(jvmMethodSignature.getName()), nameResolver.getString(jvmMethodSignature.getDesc()));
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethodNameAndDesc(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, SecurityConstants.KEY_DESC);
            return new MemberSignature(Intrinsics.stringPlus(str, str2), (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromFieldNameAndDesc(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, SecurityConstants.KEY_DESC);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('#');
            sb.append(str2);
            return new MemberSignature(sb.toString(), (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromJvmMemberSignature(@NotNull JvmMemberSignature jvmMemberSignature) {
            Intrinsics.checkNotNullParameter(jvmMemberSignature, BranchLinkConstant.OauthParams.SIGNATURE);
            if (jvmMemberSignature instanceof JvmMemberSignature.Method) {
                return fromMethodNameAndDesc(jvmMemberSignature.getName(), jvmMemberSignature.getDesc());
            }
            if (jvmMemberSignature instanceof JvmMemberSignature.Field) {
                return fromFieldNameAndDesc(jvmMemberSignature.getName(), jvmMemberSignature.getDesc());
            }
            throw new NoWhenBranchMatchedException();
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethodSignatureAndParameterIndex(@NotNull MemberSignature memberSignature, int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(1156410016, oncanceled);
                onCancelLoad.getMin(1156410016, oncanceled);
            }
            Intrinsics.checkNotNullParameter(memberSignature, BranchLinkConstant.OauthParams.SIGNATURE);
            StringBuilder sb = new StringBuilder();
            sb.append(memberSignature.getSignature());
            sb.append('@');
            sb.append(i);
            return new MemberSignature(sb.toString(), (DefaultConstructorMarker) null);
        }
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }
}
