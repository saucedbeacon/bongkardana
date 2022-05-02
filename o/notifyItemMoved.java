package o;

import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0007H&¢\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\u00020\u0005\"\b\b\u0000\u0010\u0003*\u00020\u00012\u0006\u0010\n\u001a\u0002H\u0003H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/twilio/security/storage/Serializer;", "", "fromByteArray", "T", "data", "", "kClass", "Lkotlin/reflect/KClass;", "([BLkotlin/reflect/KClass;)Ljava/lang/Object;", "toByteArray", "value", "(Ljava/lang/Object;)[B", "security_release"}, k = 1, mv = {1, 1, 16})
public interface notifyItemMoved {
    @Nullable
    <T> T getMin(@NotNull byte[] bArr, @NotNull KClass<T> kClass);

    @NotNull
    <T> byte[] setMax(@NotNull T t);
}
