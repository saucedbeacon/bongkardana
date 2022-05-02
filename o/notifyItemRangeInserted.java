package o;

import com.twilio.security.storage.StorageException;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J-\u0010\u0010\u001a\u0002H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0013H&¢\u0006\u0002\u0010\u0014J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0016\"\b\b\u0000\u0010\u0011*\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0013H&J'\u0010\u0017\u001a\u00020\u000b\"\b\b\u0000\u0010\u0011*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u0002H\u0011H&¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/twilio/security/storage/EncryptedStorage;", "", "secretKeyProvider", "Lcom/twilio/security/storage/key/SecretKeyProvider;", "getSecretKeyProvider", "()Lcom/twilio/security/storage/key/SecretKeyProvider;", "serializer", "Lcom/twilio/security/storage/Serializer;", "getSerializer", "()Lcom/twilio/security/storage/Serializer;", "clear", "", "contains", "", "key", "", "get", "T", "kClass", "Lkotlin/reflect/KClass;", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getAll", "", "put", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "security_release"}, k = 1, mv = {1, 1, 16})
public interface notifyItemRangeInserted {
    void getMax(@NotNull String str);

    <T> void getMax(@NotNull String str, @NotNull T t) throws StorageException;

    @NotNull
    <T> List<T> getMin(@NotNull KClass<T> kClass) throws StorageException;

    @NotNull
    <T> T setMax(@NotNull String str, @NotNull KClass<T> kClass) throws StorageException;

    void setMax();
}
