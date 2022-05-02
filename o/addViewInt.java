package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/twilio/verify/domain/factor/models/Config;", "", "credentialSid", "", "(Ljava/lang/String;)V", "getCredentialSid$verify_release", "()Ljava/lang/String;", "component1", "component1$verify_release", "copy", "equals", "", "other", "hashCode", "", "toString", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class addViewInt {
    @NotNull
    public final String setMax;

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof addViewInt) && Intrinsics.areEqual((Object) this.setMax, (Object) ((addViewInt) obj).setMax);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.setMax;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(credentialSid=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public addViewInt(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "credentialSid");
        this.setMax = str;
    }
}
