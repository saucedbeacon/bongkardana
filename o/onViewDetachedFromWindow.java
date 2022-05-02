package o;

import com.twilio.security.crypto.KeyException;
import com.twilio.security.logger.Level;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/twilio/security/crypto/key/signer/ECSigner;", "Lcom/twilio/security/crypto/key/signer/Signer;", "keyPair", "Ljava/security/KeyPair;", "signatureAlgorithm", "", "androidKeyStoreOperations", "Lcom/twilio/security/crypto/AndroidKeyStoreOperations;", "(Ljava/security/KeyPair;Ljava/lang/String;Lcom/twilio/security/crypto/AndroidKeyStoreOperations;)V", "getKeyPair$security_release", "()Ljava/security/KeyPair;", "getPublic", "", "sign", "data", "verify", "", "signature", "security_release"}, k = 1, mv = {1, 1, 16})
public final class onViewDetachedFromWindow implements onViewAttachedToWindow {
    private final String getMax;
    private final bindViewHolder getMin;
    @NotNull
    private final KeyPair setMax;

    public onViewDetachedFromWindow(@NotNull KeyPair keyPair, @NotNull String str, @NotNull bindViewHolder bindviewholder) {
        Intrinsics.checkParameterIsNotNull(keyPair, "keyPair");
        Intrinsics.checkParameterIsNotNull(str, "signatureAlgorithm");
        Intrinsics.checkParameterIsNotNull(bindviewholder, "androidKeyStoreOperations");
        this.setMax = keyPair;
        this.getMax = str;
        this.getMin = bindviewholder;
    }

    @NotNull
    public final byte[] getMax(@NotNull byte[] bArr) throws KeyException {
        Intrinsics.checkParameterIsNotNull(bArr, "data");
        try {
            bindViewHolder bindviewholder = this.getMin;
            String str = this.getMax;
            PrivateKey privateKey = this.setMax.getPrivate();
            Intrinsics.checkExpressionValueIsNotNull(privateKey, "keyPair.private");
            return bindviewholder.getMin(bArr, str, privateKey);
        } catch (Exception e) {
            onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.length(Level.Error, e.toString());
            throw new KeyException(e);
        }
    }

    @NotNull
    public final byte[] getMax() throws KeyException {
        try {
            PublicKey publicKey = this.setMax.getPublic();
            Intrinsics.checkExpressionValueIsNotNull(publicKey, "keyPair.public");
            byte[] encoded = publicKey.getEncoded();
            Intrinsics.checkExpressionValueIsNotNull(encoded, "keyPair.public.encoded");
            return encoded;
        } catch (Exception e) {
            onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.length(Level.Error, e.toString());
            throw new KeyException(e);
        }
    }
}
