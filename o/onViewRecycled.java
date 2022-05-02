package o;

import com.twilio.security.crypto.KeyException;
import com.twilio.security.logger.Level;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/twilio/security/crypto/key/cipher/AESCipher;", "Lcom/twilio/security/crypto/key/cipher/Cipher;", "key", "Ljavax/crypto/SecretKey;", "cipherAlgorithm", "", "androidKeyStoreOperations", "Lcom/twilio/security/crypto/AndroidKeyStoreOperations;", "(Ljavax/crypto/SecretKey;Ljava/lang/String;Lcom/twilio/security/crypto/AndroidKeyStoreOperations;)V", "getKey$security_release", "()Ljavax/crypto/SecretKey;", "decrypt", "", "data", "Lcom/twilio/security/crypto/key/cipher/EncryptedData;", "encrypt", "security_release"}, k = 1, mv = {1, 1, 16})
public final class onViewRecycled implements hasStableIds {
    private final String getMin;
    private final bindViewHolder setMax;
    @NotNull
    private final SecretKey setMin;

    public onViewRecycled(@NotNull SecretKey secretKey, @NotNull String str, @NotNull bindViewHolder bindviewholder) {
        Intrinsics.checkParameterIsNotNull(secretKey, "key");
        Intrinsics.checkParameterIsNotNull(str, "cipherAlgorithm");
        Intrinsics.checkParameterIsNotNull(bindviewholder, "androidKeyStoreOperations");
        this.setMin = secretKey;
        this.getMin = str;
        this.setMax = bindviewholder;
    }

    @NotNull
    public final getItemId getMin(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "data");
        try {
            return this.setMax.setMax(bArr, this.getMin, this.setMin);
        } catch (Exception e) {
            onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.length(Level.Error, e.toString());
            throw new KeyException(e);
        }
    }

    @NotNull
    public final byte[] length(@NotNull getItemId getitemid) {
        Intrinsics.checkParameterIsNotNull(getitemid, "data");
        try {
            return this.setMax.length(getitemid, this.getMin, this.setMin);
        } catch (Exception e) {
            onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.length(Level.Error, e.toString());
            throw new KeyException(e);
        }
    }
}
