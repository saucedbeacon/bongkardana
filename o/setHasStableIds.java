package o;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/twilio/security/crypto/key/cipher/AlgorithmParametersSpec;", "", "encoded", "", "provider", "", "algorithm", "([BLjava/lang/String;Ljava/lang/String;)V", "getAlgorithm", "()Ljava/lang/String;", "getEncoded", "()[B", "getProvider", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "security_release"}, k = 1, mv = {1, 1, 16})
public final class setHasStableIds {
    @NotNull
    public final String getMax;
    @NotNull
    private final byte[] length;
    @NotNull
    public final String setMin;

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AlgorithmParametersSpec(encoded=");
        sb.append(Arrays.toString(this.length));
        sb.append(", provider=");
        sb.append(this.getMax);
        sb.append(", algorithm=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    public setHasStableIds(@NotNull byte[] bArr, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(bArr, "encoded");
        Intrinsics.checkParameterIsNotNull(str, "provider");
        Intrinsics.checkParameterIsNotNull(str2, "algorithm");
        this.length = bArr;
        this.getMax = str;
        this.setMin = str2;
    }

    @NotNull
    public final byte[] getMin() {
        return this.length;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) getClass(), (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            setHasStableIds sethasstableids = (setHasStableIds) obj;
            if (Arrays.equals(this.length, sethasstableids.length) && !(!Intrinsics.areEqual((Object) this.getMax, (Object) sethasstableids.getMax)) && !(!Intrinsics.areEqual((Object) this.setMin, (Object) sethasstableids.setMin))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.twilio.security.crypto.key.cipher.AlgorithmParametersSpec");
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.length) * 31) + this.getMax.hashCode()) * 31) + this.setMin.hashCode();
    }
}
