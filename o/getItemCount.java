package o;

import java.security.KeyStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"providerName", "", "keyManager", "Lcom/twilio/security/crypto/KeyManager;", "security_release"}, k = 2, mv = {1, 1, 16})
public final class getItemCount {
    @NotNull
    public static final createViewHolder length() {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        Intrinsics.checkExpressionValueIsNotNull(instance, "KeyStore.getInstance(pro…    .apply { load(null) }");
        return new onBindViewHolder(new getItemViewType(instance));
    }
}
