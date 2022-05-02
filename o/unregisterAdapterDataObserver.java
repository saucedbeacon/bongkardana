package o;

import id.dana.sendmoney.summary.SummaryActivity;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00040\tH\u0016¢\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\f\u001a\u0002H\u0004H\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/twilio/security/storage/DefaultSerializer;", "Lcom/twilio/security/storage/Serializer;", "()V", "fromByteArray", "T", "", "data", "", "kClass", "Lkotlin/reflect/KClass;", "([BLkotlin/reflect/KClass;)Ljava/lang/Object;", "toByteArray", "value", "(Ljava/lang/Object;)[B", "security_release"}, k = 1, mv = {1, 1, 16})
public final class unregisterAdapterDataObserver implements notifyItemMoved {
    @NotNull
    public final <T> byte[] setMax(@NotNull T t) {
        Intrinsics.checkParameterIsNotNull(t, "value");
        if (t instanceof String) {
            byte[] bytes = ((String) t).getBytes(Charsets.UTF_8);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        } else if ((t instanceof Integer) || (t instanceof Double) || (t instanceof Boolean) || (t instanceof Float) || (t instanceof Long)) {
            String obj = t.toString();
            Charset charset = Charsets.UTF_8;
            if (obj != null) {
                byte[] bytes2 = obj.getBytes(charset);
                Intrinsics.checkExpressionValueIsNotNull(bytes2, "(this as java.lang.String).getBytes(charset)");
                return bytes2;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else {
            throw new IllegalArgumentException("Value type not supported");
        }
    }

    @Nullable
    public final <T> T getMin(@NotNull byte[] bArr, @NotNull KClass<T> kClass) {
        Intrinsics.checkParameterIsNotNull(bArr, "data");
        Intrinsics.checkParameterIsNotNull(kClass, "kClass");
        if (notifyItemRemoved.getMin(kClass, Reflection.getOrCreateKotlinClass(String.class))) {
            return (Object) new String(bArr, Charsets.UTF_8);
        }
        T t = null;
        if (notifyItemRemoved.getMin(kClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            T valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, Charsets.UTF_8)));
            if (valueOf instanceof Object) {
                t = valueOf;
            }
            return (Object) t;
        } else if (notifyItemRemoved.getMin(kClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            T valueOf2 = Double.valueOf(Double.parseDouble(new String(bArr, Charsets.UTF_8)));
            if (valueOf2 instanceof Object) {
                t = valueOf2;
            }
            return (Object) t;
        } else if (notifyItemRemoved.getMin(kClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str = new String(bArr, Charsets.UTF_8);
            boolean z = true;
            if (!StringsKt.equals(str, "false", true) && !StringsKt.equals(str, SummaryActivity.CHECKED, true)) {
                z = false;
            }
            if (!z) {
                str = null;
            }
            T valueOf3 = str != null ? Boolean.valueOf(Boolean.parseBoolean(str)) : null;
            if (valueOf3 instanceof Object) {
                t = valueOf3;
            }
            return (Object) t;
        } else if (notifyItemRemoved.getMin(kClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
            T valueOf4 = Float.valueOf(Float.parseFloat(new String(bArr, Charsets.UTF_8)));
            if (valueOf4 instanceof Object) {
                t = valueOf4;
            }
            return (Object) t;
        } else if (notifyItemRemoved.getMin(kClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            T valueOf5 = Long.valueOf(Long.parseLong(new String(bArr, Charsets.UTF_8)));
            if (valueOf5 instanceof Object) {
                t = valueOf5;
            }
            return (Object) t;
        } else {
            throw new IllegalArgumentException("Value type not supported");
        }
    }
}
