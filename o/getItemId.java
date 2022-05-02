package o;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/twilio/security/crypto/key/cipher/EncryptedData;", "", "algorithmParameters", "Lcom/twilio/security/crypto/key/cipher/AlgorithmParametersSpec;", "encrypted", "", "(Lcom/twilio/security/crypto/key/cipher/AlgorithmParametersSpec;[B)V", "getAlgorithmParameters", "()Lcom/twilio/security/crypto/key/cipher/AlgorithmParametersSpec;", "getEncrypted", "()[B", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "security_release"}, k = 1, mv = {1, 1, 16})
public final class getItemId {
    @NotNull
    private final byte[] getMax;
    @NotNull
    public final setHasStableIds setMin;

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EncryptedData(algorithmParameters=");
        sb.append(this.setMin);
        sb.append(", encrypted=");
        sb.append(Arrays.toString(this.getMax));
        sb.append(")");
        return sb.toString();
    }

    public getItemId(@NotNull setHasStableIds sethasstableids, @NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(sethasstableids, "algorithmParameters");
        Intrinsics.checkParameterIsNotNull(bArr, "encrypted");
        this.setMin = sethasstableids;
        this.getMax = bArr;
    }

    @NotNull
    public final byte[] length() {
        return this.getMax;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) getClass(), (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            getItemId getitemid = (getItemId) obj;
            if (!(!Intrinsics.areEqual((Object) this.setMin, (Object) getitemid.setMin)) && Arrays.equals(this.getMax, getitemid.getMax)) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.twilio.security.crypto.key.cipher.EncryptedData");
    }

    public final int hashCode() {
        return (this.setMin.hashCode() * 31) + Arrays.hashCode(this.getMax);
    }
}
