package o;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\b\u0010\u001b\u001a\u00020\u0001H\u0016J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0007\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/twilio/security/crypto/key/template/AESGCMNoPaddingCipherTemplate;", "Lcom/twilio/security/crypto/key/template/CipherTemplate;", "alias", "", "shouldExist", "", "(Ljava/lang/String;Z)V", "algorithm", "getAlgorithm", "()Ljava/lang/String;", "getAlias", "cipherAlgorithm", "getCipherAlgorithm$security_release", "keyGenParameterSpec", "Landroid/security/keystore/KeyGenParameterSpec;", "getKeyGenParameterSpec$security_release", "()Landroid/security/keystore/KeyGenParameterSpec;", "getShouldExist", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "templateForCreation", "toString", "security_release"}, k = 1, mv = {1, 1, 16})
public final class onFailedToRecycleView extends hasObservers {
    private final boolean getMax;
    @NotNull
    private final String getMin;
    @NotNull
    private final String length;
    @NotNull
    private final String setMax;
    @NotNull
    private final KeyGenParameterSpec setMin;

    @NotNull
    public final String getMax() {
        return this.getMin;
    }

    public /* synthetic */ onFailedToRecycleView(String str) {
        this(str, true);
    }

    public final boolean toFloatRange() {
        return this.getMax;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private onFailedToRecycleView(@NotNull String str, boolean z) {
        super((byte) 0);
        Intrinsics.checkParameterIsNotNull(str, "alias");
        this.getMin = str;
        this.getMax = z;
        this.length = "AES";
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(this.getMin, 3).setBlockModes(new String[]{CodePackage.GCM}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "Builder(\n    alias,\n    …KeySize(256)\n    .build()");
        this.setMin = build;
        this.setMax = "AES/GCM/NoPadding";
    }

    @NotNull
    public final String length() {
        return this.length;
    }

    @NotNull
    public final KeyGenParameterSpec setMin() {
        return this.setMin;
    }

    @NotNull
    public final String setMax() {
        return this.setMax;
    }

    @NotNull
    public final hasObservers getMin() {
        String str = this.getMin;
        Intrinsics.checkParameterIsNotNull(str, "alias");
        return new onFailedToRecycleView(str, false);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AESGCMNoPaddingCipherTemplate(alias=");
        sb.append(this.getMin);
        sb.append(", shouldExist=");
        sb.append(toFloatRange());
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.getMin;
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
        if (!(obj instanceof onFailedToRecycleView)) {
            return false;
        }
        onFailedToRecycleView onfailedtorecycleview = (onFailedToRecycleView) obj;
        return Intrinsics.areEqual((Object) this.getMin, (Object) onfailedtorecycleview.getMin) && toFloatRange() == onfailedtorecycleview.toFloatRange();
    }
}
