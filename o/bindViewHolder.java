package o;

import java.security.Key;
import java.security.PrivateKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/twilio/security/crypto/AndroidKeyStoreOperations;", "", "decrypt", "", "data", "Lcom/twilio/security/crypto/key/cipher/EncryptedData;", "cipherAlgorithm", "", "key", "Ljava/security/Key;", "encrypt", "sign", "signatureAlgorithm", "private", "Ljava/security/PrivateKey;", "verify", "", "signature", "public", "Ljava/security/PublicKey;", "security_release"}, k = 1, mv = {1, 1, 16})
public interface bindViewHolder {
    @NotNull
    byte[] getMin(@NotNull byte[] bArr, @NotNull String str, @NotNull PrivateKey privateKey);

    @NotNull
    byte[] length(@NotNull getItemId getitemid, @NotNull String str, @NotNull Key key);

    @NotNull
    getItemId setMax(@NotNull byte[] bArr, @NotNull String str, @NotNull Key key);
}
