package o;

import android.security.keystore.KeyGenParameterSpec;
import java.security.spec.ECGenParameterSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0007\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/twilio/security/crypto/key/template/ECP256SignerTemplate;", "Lcom/twilio/security/crypto/key/template/SignerTemplate;", "alias", "", "shouldExist", "", "(Ljava/lang/String;Z)V", "algorithm", "getAlgorithm", "()Ljava/lang/String;", "getAlias", "keyGenParameterSpec", "Landroid/security/keystore/KeyGenParameterSpec;", "getKeyGenParameterSpec$security_release", "()Landroid/security/keystore/KeyGenParameterSpec;", "getShouldExist", "()Z", "signatureAlgorithm", "getSignatureAlgorithm$security_release", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "security_release"}, k = 1, mv = {1, 1, 16})
public final class notifyDataSetChanged extends onDetachedFromRecyclerView {
    @NotNull
    private final String getMax;
    private final boolean getMin;
    @NotNull
    private final KeyGenParameterSpec length;
    @NotNull
    private final String setMax;
    @NotNull
    private final String setMin = "EC";

    @NotNull
    public final String getMax() {
        return this.setMax;
    }

    public final boolean toFloatRange() {
        return this.getMin;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public notifyDataSetChanged(@NotNull String str, boolean z) {
        super((byte) 0);
        Intrinsics.checkParameterIsNotNull(str, "alias");
        this.setMax = str;
        this.getMin = z;
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(this.setMax, 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests(new String[]{"SHA-256"}).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "Builder(alias, KeyProper…ST_SHA256)\n      .build()");
        this.length = build;
        this.getMax = "SHA256withECDSA";
    }

    @NotNull
    public final String length() {
        return this.setMin;
    }

    @NotNull
    public final KeyGenParameterSpec setMin() {
        return this.length;
    }

    @NotNull
    public final String getMin() {
        return this.getMax;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ECP256SignerTemplate(alias=");
        sb.append(this.setMax);
        sb.append(", shouldExist=");
        sb.append(toFloatRange());
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.setMax;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean floatRange = toFloatRange();
        if (floatRange) {
            floatRange = true;
        }
        return hashCode + (floatRange ? 1 : 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof notifyDataSetChanged)) {
            return false;
        }
        notifyDataSetChanged notifydatasetchanged = (notifyDataSetChanged) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) notifydatasetchanged.setMax) && toFloatRange() == notifydatasetchanged.toFloatRange();
    }
}
