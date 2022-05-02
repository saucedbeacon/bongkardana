package o;

import android.content.SharedPreferences;
import android.util.Base64;
import com.twilio.security.logger.Level;
import com.twilio.security.storage.StorageException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J/\u0010\u0013\u001a\u0004\u0018\u0001H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0019H\u0002¢\u0006\u0002\u0010\u001aJ-\u0010\u001b\u001a\u0002H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0019H\u0016¢\u0006\u0002\u0010\u001cJ&\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001e\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0019H\u0016J/\u0010\u001f\u001a\u0004\u0018\u0001H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0019H\u0002¢\u0006\u0002\u0010\u001cJ'\u0010 \u001a\u00020\u000e\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010!\u001a\u0002H\u0014H\u0016¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001f\u0010$\u001a\u00020\u0017\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010!\u001a\u0002H\u0014H\u0002¢\u0006\u0002\u0010%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006&"}, d2 = {"Lcom/twilio/security/storage/EncryptedPreferences;", "Lcom/twilio/security/storage/EncryptedStorage;", "secretKeyProvider", "Lcom/twilio/security/storage/key/SecretKeyProvider;", "preferences", "Landroid/content/SharedPreferences;", "serializer", "Lcom/twilio/security/storage/Serializer;", "(Lcom/twilio/security/storage/key/SecretKeyProvider;Landroid/content/SharedPreferences;Lcom/twilio/security/storage/Serializer;)V", "getSecretKeyProvider", "()Lcom/twilio/security/storage/key/SecretKeyProvider;", "getSerializer", "()Lcom/twilio/security/storage/Serializer;", "clear", "", "contains", "", "key", "", "fromByteArray", "T", "", "data", "", "kClass", "Lkotlin/reflect/KClass;", "([BLkotlin/reflect/KClass;)Ljava/lang/Object;", "get", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getAll", "", "getValue", "put", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "toByteArray", "(Ljava/lang/Object;)[B", "security_release"}, k = 1, mv = {1, 1, 16})
public final class notifyItemInserted implements notifyItemRangeInserted {
    @NotNull
    private final notifyItemMoved getMin;
    @NotNull
    private final getStateRestorationPolicy length;
    private final SharedPreferences setMax;

    public notifyItemInserted(@NotNull getStateRestorationPolicy getstaterestorationpolicy, @NotNull SharedPreferences sharedPreferences, @NotNull notifyItemMoved notifyitemmoved) {
        Intrinsics.checkParameterIsNotNull(getstaterestorationpolicy, "secretKeyProvider");
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "preferences");
        Intrinsics.checkParameterIsNotNull(notifyitemmoved, "serializer");
        this.length = getstaterestorationpolicy;
        this.setMax = sharedPreferences;
        this.getMin = notifyitemmoved;
    }

    public final synchronized <T> void getMax(@NotNull String str, @NotNull T t) throws StorageException {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(t, "value");
        try {
            onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.getMin(Level.Info, "Saving ".concat(String.valueOf(str)));
            byte[] max = this.length.setMax(setMax(t));
            String max2 = notifyItemRangeChanged.setMax(str);
            onAttachedToRecyclerView onattachedtorecyclerview2 = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.getMin(Level.Debug, "Saving ".concat(String.valueOf(max2)));
            this.setMax.edit().putString(max2, Base64.encodeToString(max, 0)).apply();
            onAttachedToRecyclerView onattachedtorecyclerview3 = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.getMin(Level.Debug, "Saved ".concat(String.valueOf(max2)));
        } catch (Exception e) {
            onAttachedToRecyclerView onattachedtorecyclerview4 = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.length(Level.Error, e.toString());
            throw new StorageException(e);
        }
    }

    @NotNull
    public final <T> T setMax(@NotNull String str, @NotNull KClass<T> kClass) throws StorageException {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(kClass, "kClass");
        try {
            onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.getMin(Level.Info, "Getting ".concat(String.valueOf(str)));
            T max = getMax(notifyItemRangeChanged.setMax(str), kClass);
            if (max != null) {
                return max;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Illegal decrypted data");
            onAttachedToRecyclerView onattachedtorecyclerview2 = onAttachedToRecyclerView.setMax;
            Level level = Level.Debug;
            StringBuilder sb = new StringBuilder("Return value ");
            sb.append(illegalArgumentException);
            sb.append(" for ");
            sb.append(str);
            onAttachedToRecyclerView.getMin(level, sb.toString());
            throw illegalArgumentException;
        } catch (Exception e) {
            onAttachedToRecyclerView onattachedtorecyclerview3 = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.length(Level.Error, e.toString());
            throw new StorageException(e);
        }
    }

    @NotNull
    public final <T> List<T> getMin(@NotNull KClass<T> kClass) throws StorageException {
        T t;
        Intrinsics.checkParameterIsNotNull(kClass, "kClass");
        try {
            onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.getMin(Level.Info, "Getting all values");
            Map<String, ?> all = this.setMax.getAll();
            Intrinsics.checkExpressionValueIsNotNull(all, "preferences.all");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : all.entrySet()) {
                if (next.getValue() instanceof String) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            Collection arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                try {
                    Object key = entry.getKey();
                    Intrinsics.checkExpressionValueIsNotNull(key, "entry.key");
                    t = getMax((String) key, kClass);
                    onAttachedToRecyclerView onattachedtorecyclerview2 = onAttachedToRecyclerView.setMax;
                    Level level = Level.Debug;
                    StringBuilder sb = new StringBuilder("Return value ");
                    sb.append(t);
                    sb.append(" for key ");
                    sb.append((String) entry.getKey());
                    onAttachedToRecyclerView.getMin(level, sb.toString());
                } catch (Exception e) {
                    onAttachedToRecyclerView onattachedtorecyclerview3 = onAttachedToRecyclerView.setMax;
                    onAttachedToRecyclerView.length(Level.Error, e.toString());
                    t = null;
                }
                if (t != null) {
                    arrayList.add(t);
                }
            }
            List<T> list = (List) arrayList;
            onAttachedToRecyclerView onattachedtorecyclerview4 = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.getMin(Level.Info, "Return all values");
            return list;
        } catch (Exception e2) {
            onAttachedToRecyclerView onattachedtorecyclerview5 = onAttachedToRecyclerView.setMax;
            onAttachedToRecyclerView.length(Level.Error, e2.toString());
            throw new StorageException(e2);
        }
    }

    public final synchronized void getMax(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
        onAttachedToRecyclerView.getMin(Level.Info, "Removing ".concat(String.valueOf(str)));
        this.setMax.edit().remove(notifyItemRangeChanged.setMax(str)).apply();
    }

    public final synchronized void setMax() {
        onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
        onAttachedToRecyclerView.getMin(Level.Info, "Clearing storage");
        this.setMax.edit().clear().apply();
    }

    private final <T> T getMax(String str, KClass<T> kClass) {
        onAttachedToRecyclerView onattachedtorecyclerview = onAttachedToRecyclerView.setMax;
        onAttachedToRecyclerView.getMin(Level.Debug, "Getting value for ".concat(String.valueOf(str)));
        String string = this.setMax.getString(str, (String) null);
        if (string != null) {
            Intrinsics.checkExpressionValueIsNotNull(string, "preferences.getString(ke…xception(\"key not found\")");
            getStateRestorationPolicy getstaterestorationpolicy = this.length;
            byte[] decode = Base64.decode(string, 0);
            Intrinsics.checkExpressionValueIsNotNull(decode, "Base64.decode(value, DEFAULT)");
            T min = this.getMin.getMin(getstaterestorationpolicy.setMin(decode), kClass);
            onAttachedToRecyclerView onattachedtorecyclerview2 = onAttachedToRecyclerView.setMax;
            Level level = Level.Debug;
            StringBuilder sb = new StringBuilder("Return value ");
            sb.append(min);
            sb.append(" for key ");
            sb.append(str);
            onAttachedToRecyclerView.getMin(level, sb.toString());
            return min;
        }
        throw new IllegalArgumentException("key not found");
    }

    private final <T> byte[] setMax(T t) {
        return this.getMin.setMax(t);
    }
}
