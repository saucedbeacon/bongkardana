package o;

import com.twilio.security.crypto.KeyException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/twilio/security/storage/key/SecretKeyProvider;", "", "create", "", "decrypt", "", "data", "delete", "encrypt", "security_release"}, k = 1, mv = {1, 1, 16})
public interface getStateRestorationPolicy {
    @NotNull
    byte[] setMax(@NotNull byte[] bArr) throws KeyException;

    @NotNull
    byte[] setMin(@NotNull byte[] bArr) throws KeyException;
}
