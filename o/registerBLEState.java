package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/domain/twilio/model/TwilioBindEnroll;", "", "factorId", "", "identity", "(Ljava/lang/String;Ljava/lang/String;)V", "getFactorId", "()Ljava/lang/String;", "getIdentity", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class registerBLEState {
    @Nullable
    private final String factorId;
    @Nullable
    private final String identity;

    public registerBLEState() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ registerBLEState copy$default(registerBLEState registerblestate, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registerblestate.factorId;
        }
        if ((i & 2) != 0) {
            str2 = registerblestate.identity;
        }
        return registerblestate.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.factorId;
    }

    @Nullable
    public final String component2() {
        return this.identity;
    }

    @NotNull
    public final registerBLEState copy(@Nullable String str, @Nullable String str2) {
        return new registerBLEState(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof registerBLEState)) {
            return false;
        }
        registerBLEState registerblestate = (registerBLEState) obj;
        return Intrinsics.areEqual((Object) this.factorId, (Object) registerblestate.factorId) && Intrinsics.areEqual((Object) this.identity, (Object) registerblestate.identity);
    }

    public final int hashCode() {
        String str = this.factorId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.identity;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TwilioBindEnroll(factorId=");
        sb.append(this.factorId);
        sb.append(", identity=");
        sb.append(this.identity);
        sb.append(")");
        return sb.toString();
    }

    public registerBLEState(@Nullable String str, @Nullable String str2) {
        this.factorId = str;
        this.identity = str2;
    }

    @Nullable
    public final String getFactorId() {
        return this.factorId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ registerBLEState(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    @Nullable
    public final String getIdentity() {
        return this.identity;
    }
}
